package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.ClientResponse;
import org.springframework.web.reactive.function.client.WebClient;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.dto.Policy;
import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.dto.SourceUrlConfig;
import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.quickQuoteRequest.ProductDetails;
import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.quickQuoteResponse.PolicyOption;
import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.salesDto.QuoteResponse;
import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.salesDto.QuoteResponse.Cover;
import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.salesDto.QuoteResponse.DiscountLoad;
import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.salesDto.QuoteResponse.Member;
import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.salesDto.QuoteResponse.PremiumOption;
import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.salesDto.QuoteResponse.Property;
import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.salesDto.QuoteResponse.QuotePremiumDetails;
import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.salesDto.QuoteResponse.TenureOption;
import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.salesDto.SaveQuoteConvertedRequest;
import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.salesDto.SaveQuoteRequest;
import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.salesDto.SaveQuoteResponse;

import reactor.core.publisher.Mono;

@Service
public class SaveQuoteService {
	
	@Autowired
	private WebClient.Builder webClientBuilder;

	@Autowired
	private SourceUrlConfig sourceUrlConfig;
	
	@Autowired
	private GetQuoteService getQuoteService;

	public Mono<SaveQuoteResponse> saveQuote(SaveQuoteConvertedRequest saveQuoterequest) throws JsonProcessingException {
		System.out.println("SAVE QUOTE URL----"+sourceUrlConfig.getQuoteUrl()+"saveQuote");
		ProductDetails quoteRequest = getQuoteService.transformToProductDetails(saveQuoterequest.getPolicy());
		QuoteResponse quoteResponse = quoteResponse(saveQuoterequest);
		
		SaveQuoteRequest saveQuoteRequest = new SaveQuoteRequest(
				"HO", "PH0000416371", "GALHLTH", null, null, quoteRequest, quoteResponse, null);
		
		ObjectMapper mapper = new ObjectMapper();
		String request = mapper.writeValueAsString(saveQuoteRequest);
		System.out.println("saveQuote Request-----"+request);
		
		return webClientBuilder
	            .build()
	            .post()
	            .uri(sourceUrlConfig.getQuoteUrl()+"saveQuote")
	            .contentType(MediaType.APPLICATION_JSON)
	            .bodyValue(saveQuoteRequest).retrieve()
	            .onStatus(HttpStatusCode::is4xxClientError, clientResponse -> Mono.empty())
	            .onStatus(HttpStatusCode::is5xxServerError, ClientResponse::createException)
	            .bodyToMono(SaveQuoteResponse.class).log()
	            .retry(3)
	            .map(response -> {
	                if (!response.getResponse().responseCode.equals("200")) {
	                    return null;
	                } else {
	                    return response;
	                }
	            });
		
	}
	
	public QuoteResponse quoteResponse(SaveQuoteConvertedRequest saveQuoterequest) {
		QuoteResponse quoteResponse = new QuoteResponse();
		try {
			Policy policy = saveQuoterequest.getPolicy();
			System.out.println("product Code----"+policy.getPolicyExt().getProductCd());
			PolicyOption selectedQuote = saveQuoterequest.getSelectedQuote();
			
			String frequency = "";
			if (policy.getPolicyExt().getPaymentType().equals("GALHLTHPT001A"))
				frequency = "A";
			else if (policy.getPolicyExt().getPaymentType().equals("GALHLTHPT001C"))
				frequency = "C";
			else if (policy.getPolicyExt().getPaymentType().equals("GALHLTHPT001HY"))
				frequency = "HY";
			else if (policy.getPolicyExt().getPaymentType().equals("GALHLTHPT001B"))
				frequency = "B";
			else frequency = "B";
			
			String basePremium = String.valueOf(selectedQuote.getPremiumSummaryList().get(0).getPretaxPremium());
			String premiumAfterDiscount = String.valueOf(selectedQuote.getPremiumSummaryList().get(0).getPretaxPremium());
			String premiumAfterLoading = String.valueOf(selectedQuote.getPremiumSummaryList().get(0).getPretaxPremium());
			String tax = String.valueOf(selectedQuote.getPremiumSummaryList().get(0).getCgst() 
					+ selectedQuote.getPremiumSummaryList().get(0).getSgst());
			String premiumAfterTax = String.valueOf(Double.parseDouble(basePremium) + Double.parseDouble(tax));
			
			quoteResponse.setProductCode(policy.getPolicyExt().getProductCd());
			quoteResponse.setProductName(null);
			quoteResponse.setQuoteNumber("");
			quoteResponse.setPolicyTenure(null);
			quoteResponse.setPremiumFrequency(null);
			quoteResponse.setPolicyStatus(null);
			quoteResponse.setPlanCode(null);
			quoteResponse.setQuoteStartDate(policy.getPolicyExt().getQuoteExpiryDate());
			quoteResponse.setResponse(null);
			quoteResponse.setSourceName("");
			
			QuotePremiumDetails quotePremium = new QuotePremiumDetails();
			quotePremium.setBasePremium(null);
			quotePremium.setDiscount(null);
			quotePremium.setPremiumAfterDiscount(null);
			quotePremium.setLoading(null);
			quotePremium.setPremiumAfterLoading(null);
			quotePremium.setTax(null);
			quotePremium.setPremiumAfterTax(null);
			
			List<TenureOption> tenureOptionList = new ArrayList<>();
			TenureOption tenureOption = new TenureOption();
			tenureOption.setPolicyTenure("1Y");
			
			List<PremiumOption> premiumOptionsList = new ArrayList<>();
			PremiumOption premiumOption = new PremiumOption();
			
			premiumOption.setFrequency(frequency);
			premiumOption.setBasePremium(basePremium);
			premiumOption.setDiscount("0.00");
			premiumOption.setPremiumAfterDiscount(premiumAfterDiscount);
			premiumOption.setLoading("0.00");
			premiumOption.setPremiumAfterLoading(premiumAfterLoading);
			premiumOption.setTax(tax);
			premiumOption.setPremiumAfterTax(premiumAfterTax);
			
			List<Member> memberList = new ArrayList<>();
			Member member = new Member();
			member.setRiskinceptiondate(null);
			member.setPolicyriskexpirydate(null);
			member.setRisklevelpremium(null);
			member.setMemberstatus(null);
			member.setRemarks(null);
			member.setMembersubstatus(null);
			member.setLoadingvalue(null);
			member.setLoadingpercentage(null);
			member.setPolicyriskid(null);
			member.setDiscountload(null);
			member.setMedicaltest(null);
			member.setMultisetobject(null);
			member.setMemberlistindicator(null);
			
			List<Property> propertyList = new ArrayList<>();
			propertyList.add(new Property("0.00","UW Loading Amount"));
			propertyList.add(new Property(basePremium,"Total premium after UW loading"));
			propertyList.add(new Property(basePremium,"Premium after discount"));
			propertyList.add(new Property(basePremium,"Premium After Loyalty Bonus"));
			propertyList.add(new Property(tax,"Tax Amount"));
			propertyList.add(new Property(premiumAfterTax,"Total Premium after Tax"));
			propertyList.add(new Property(basePremium,"Premium rate manual"));
			propertyList.add(new Property(basePremium,"Gross premium manual"));
			propertyList.add(new Property("0.00","Loading manual"));
			propertyList.add(new Property("0.00","Discount manual"));
			propertyList.add(new Property(basePremium,"Net premium manual"));
			propertyList.add(new Property(premiumAfterTax,"Total Premium"));
			propertyList.add(new Property(basePremium,"Final premium"));
			propertyList.add(new Property("0.00","Long Term Discount"));
			propertyList.add(new Property("0.00","Family Discount"));
			propertyList.add(new Property("0.00","Employee Discount"));
			propertyList.add(new Property("0.00","Affiliate Discount"));
			propertyList.add(new Property("0.00","Final Floater Discount"));
			propertyList.add(new Property("0.00","Total Member Loading Amount"));
			propertyList.add(new Property("0.00","Total Member Discount Amount"));
			propertyList.add(new Property("0.00","Floater Discount Impact Amount"));
			propertyList.add(new Property("1","Member ID"));
			member.setProperty(propertyList);
			
			List<Cover> coverList = new ArrayList<>();
			Cover cover = new Cover();
			cover.setCoverenddate(null);
			cover.setCoverstartdate(null);
			cover.setCovercode("ADPTD");
			
			propertyList = new ArrayList<>();
			propertyList.add(new Property("0.00","UW Loading Amount"));
			propertyList.add(new Property("2356.00","Total premium after UW loading"));
			propertyList.add(new Property("2120.40","Premium after discount"));
			propertyList.add(new Property("0.00","Premium After Loyalty Bonus"));
			propertyList.add(new Property("381.71","Tax Amount"));
			propertyList.add(new Property("2502.11","Total Premium after Tax"));
			propertyList.add(new Property("8975.00","Premium rate manual"));
			propertyList.add(new Property("2120.40","Gross premium manual"));
			propertyList.add(new Property("0.00","Loading manual"));
			propertyList.add(new Property("0.00","Discount manual"));
			propertyList.add(new Property("2502.11","Net premium manual"));
			propertyList.add(new Property("40033.76","Total Premium"));
			propertyList.add(new Property("8975.00","Final premium"));
			propertyList.add(new Property("0.00","Long Term Discount"));
			propertyList.add(new Property("0.00","Family Discount"));
			propertyList.add(new Property("0.00","Employee Discount"));
			propertyList.add(new Property("0.00","Total Member Loading Amount"));
			propertyList.add(new Property("0.00","Total Member Discount Amount"));
			cover.setProperty(propertyList);
			coverList.add(cover);
			member.setCover(coverList);
			
			memberList.add(member);
			
			premiumOption.setLstMembers(memberList);
			
			List<DiscountLoad> discountloadList = new ArrayList<>();
			discountloadList.add(new DiscountLoad(10.0, "OGS", 471.2, "Employee Discount Percentage"));
			premiumOption.setDiscountload(discountloadList);
			
			premiumOptionsList.add(premiumOption);
			tenureOption.setPremiumOptions(premiumOptionsList);
			tenureOptionList.add(tenureOption);
			quotePremium.setTenureOptions(tenureOptionList);
			quoteResponse.setQuotePremiumDetails(quotePremium);
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		return quoteResponse;
	}

}
