package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.services;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.ClientResponse;
import org.springframework.web.reactive.function.client.WebClient;

import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.bancsdto.getQuote.GetQuoteConvertedResponse;
import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.bancsdto.getQuote.GetQuoteResponse;
import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.bancsdto.getQuote.MemberDetail;
import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.bancsdto.getQuote.PremiumBreakup;
import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.bancsdto.searchQuote.SearchQuoteRequest;
import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.bancsdto.searchQuote.SearchQuoteResponse;
import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.dto.SourceUrlConfig;
import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.quickQuoteRequest.Member;
import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.salesDto.QuoteResponse.PremiumOption;
import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.salesDto.SaveQuoteResponse;

import reactor.core.publisher.Mono;

@Service
public class SearchQuoteService {
	
	@Autowired
	private WebClient.Builder webClientBuilder;

	@Autowired
	private SourceUrlConfig sourceUrlConfig;

	public Mono<SearchQuoteResponse> searchQuote(SearchQuoteRequest searchQuoteRequest) {
		System.out.println("SEARCH QUOTE URL----"+sourceUrlConfig.getQuoteUrl()+"searchQuote");
		return webClientBuilder.build().post()
				.uri(sourceUrlConfig.getQuoteUrl()+"searchQuote")
				.contentType(MediaType.APPLICATION_JSON)
				.bodyValue(searchQuoteRequest).retrieve()
				.onStatus(HttpStatusCode::is4xxClientError, clientResponse -> Mono.empty())
	            .onStatus(HttpStatusCode::is5xxServerError, ClientResponse::createException)
	            .bodyToMono(SearchQuoteResponse.class).log()
	            .retry(3);
//	            .map(reponse -> {
//	            	return null;
//	            });
	}

	public Mono<GetQuoteConvertedResponse> getQuote(String quoteNumber) {
		return webClientBuilder.build().get()
				.uri("http://10.10.13.160:7316/BaNCSQuote/quoteEngine/getQuote",
		                uriBuilder -> uriBuilder
		                    .queryParam("quoteNumber", quoteNumber)
		                    .build())
		        .header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_FORM_URLENCODED_VALUE)
				.retrieve()
				.onStatus(HttpStatusCode::is4xxClientError, clientResponse -> Mono.empty())
	            .onStatus(HttpStatusCode::is5xxServerError, ClientResponse::createException)
	            .bodyToMono(GetQuoteResponse.class).log()
	            .retry(3).map(response->{
	            	if(response.getResponse().responseCode.equals("200")) {
	            		return getQuoteconverted(response);
	            	}else
	            		return new GetQuoteConvertedResponse();
	            });
	}
	
	public GetQuoteConvertedResponse getQuoteconverted(GetQuoteResponse response) {
		GetQuoteConvertedResponse convertedResp = new GetQuoteConvertedResponse();
		convertedResp.setProduct(response.getProduct());
		convertedResp.setQuoteDate(response.getQuoteDate());
		convertedResp.setQuoteNumber(response.getQuoteNumber());
		convertedResp.setCoverType(response.getCoverageType());
		convertedResp.setPlanType(response.getPlan());
		convertedResp.setNoOfAdult(response.getQuoteRequest().getMembers().size());
		
		String frequency = response.getQuoteResponse().getQuotePremiumDetails().getTenureOptions().get(0).getPremiumOptions().get(0).getFrequency();
		if(frequency.equals("A"))
			convertedResp.setPaymentType("GALHLTHPT001A");
		else if(frequency.equals("C"))
			convertedResp.setPaymentType("GALHLTHPT001C");
		else if(frequency.equals("HY"))
			convertedResp.setPaymentType("GALHLTHPT001HY");
		else if(frequency.equals("B"))
			convertedResp.setPaymentType("GALHLTHPT001B");
		
		convertedResp.setPlanType(response.getPlan());
		
		List<MemberDetail> memberDetails = new ArrayList<>();
		for (Member member : response.getQuoteRequest().getMembers()) {
		    MemberDetail memberDetail = new MemberDetail();
		    member.getMemberDetails().stream().forEach(detail -> {
	              if ("Date of Birth".equals(detail.getName())) {
	                  memberDetail.setDob(detail.getValue());
	              } else if ("Sum Insured".equals(detail.getName())) {
	                  memberDetail.setSumInsured(detail.getValue());
	              } else if ("Deductible Options".equals(detail.getName())) {
	                  memberDetail.setDeductible(detail.getValue());
	              }
	          });
		    memberDetails.add(memberDetail);
		}
		convertedResp.setMemberDetails(memberDetails);
		
		List<PremiumBreakup> premiumBreakups = new ArrayList<>();
		PremiumBreakup premiumBreakup = new PremiumBreakup();
		premiumBreakup.setPolicyTenure(response.getQuoteResponse().getQuotePremiumDetails().getTenureOptions().get(0).getPolicyTenure());
		for (PremiumOption option : response.getQuoteResponse().getQuotePremiumDetails().getTenureOptions().get(0).getPremiumOptions()) {
			premiumBreakup.setBasePremium(option.getBasePremium());
			premiumBreakup.setTax(option.getTax());
			premiumBreakup.setPremiumAfterTax(option.getPremiumAfterTax());
			premiumBreakups.add(premiumBreakup);
			premiumBreakup = new PremiumBreakup();
		}
		convertedResp.setPremiumBreakup(premiumBreakups);
		
		return convertedResp;
	}

}
