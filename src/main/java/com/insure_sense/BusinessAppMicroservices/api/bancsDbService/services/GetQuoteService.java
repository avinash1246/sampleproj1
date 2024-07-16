package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.services;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.dto.Policy;
import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.dto.PolicyMemberInfo;
import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.dto.SourceUrlConfig;
import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.quickQuoteRequest.BasicDetail;
import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.quickQuoteRequest.Cover;
import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.quickQuoteRequest.DiscountLoad;
import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.quickQuoteRequest.Member;
import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.quickQuoteRequest.MemberDetail;
import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.quickQuoteRequest.ProductDetails;
import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.quickQuoteResponse.PolicyAmount;
import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.quickQuoteResponse.PolicyOption;
import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.quickQuoteResponse.PremiumSummary;

import reactor.core.publisher.Mono;

@Service
public class GetQuoteService {

	@Autowired
	private WebClient.Builder webClientBuilder;

	@Autowired
	private SourceUrlConfig sourceUrlConfig;

	@Autowired
	private ObjectMapper objectMapper;
	

	public Mono<List<PolicyOption>> getQuotes(Policy policy) throws JsonProcessingException {
		System.out.println("DO QUICK QUOTE URL----"+sourceUrlConfig.getQuoteUrl()+"quote");
		String requestObject = convertToJson(policy);
		System.out.println("requestObject===" + requestObject);
		
		return webClientBuilder.build().post()
	            .uri(sourceUrlConfig.getQuoteUrl()+"quote")
	            .contentType(MediaType.APPLICATION_JSON).bodyValue(requestObject).retrieve()
	            .bodyToMono(String.class)
	            .flatMap(response -> {
	                try {
	                    System.out.println("Response-----" + response);
	                    return Mono.just(handleResp(response, policy));
	                } catch (Exception e) {
	                    return Mono.error(e);
	                }
	            });
	}

	public List<PolicyOption> handleResp(String response, Policy policy) throws JsonProcessingException {

		String frequency = "";
		List<PolicyOption> policyOptionList = new ArrayList<>();
		JSONObject resObj = new JSONObject(response).optJSONObject("quotePremiumDetails");
		JSONArray resArr = resObj.optJSONArray("tenureOptions");

		if (policy.getPolicyExt().getPaymentType().equals("GALHLTHPT001A"))
			frequency = "A";
		else if (policy.getPolicyExt().getPaymentType().equals("GALHLTHPT001C"))
			frequency = "C";
		else if (policy.getPolicyExt().getPaymentType().equals("GALHLTHPT001HY"))
			frequency = "HY";
		else if (policy.getPolicyExt().getPaymentType().equals("GALHLTHPT001B"))
			frequency = "B";
		else frequency = "B";

		for (int i = 0; i < resArr.length(); i++) {
			PolicyOption policyOption = new PolicyOption();
			policyOption.setOptionRef(i + 1);

			JSONObject policyTenure = resArr.getJSONObject(i);
			if (policyTenure.getString("policyTenure").equals("1Y"))
				policyOption.setPolicyTenureOption("LTANNUAL");
			else if (policyTenure.getString("policyTenure").equals("2Y"))
				policyOption.setPolicyTenureOption("LT2YEAR");
			else if (policyTenure.getString("policyTenure").equals("3Y"))
				policyOption.setPolicyTenureOption("LT3YEAR");

			policyOption.setPaymentOption(policy.getPolicyExt().getPaymentType());

			if (policy.getPolicyMemberInfo().size() > 0)
				policyOption.setSumInsuredOption(policy.getPolicyMemberInfo().get(0).getIoSumInsured());
			else
				policyOption.setSumInsuredOption(0);

			List<PolicyAmount> policyAmountsList = new ArrayList<>();
			policyOption.setPolicyAmounts(policyAmountsList);

			List<PremiumSummary> premiumSummaryList = new ArrayList<>();

			JSONObject premiumObj = null;
			for (int j = 0; j < policyTenure.optJSONArray("premiumOptions").length(); j++) {
				if (policyTenure.optJSONArray("premiumOptions").getJSONObject(j).getString("frequency")
						.equals(frequency))
					premiumObj = policyTenure.optJSONArray("premiumOptions").getJSONObject(j);
			}

//			if (resArr.getJSONObject(i).getString("policyTenure").equals("1Y"))
//				premiumSummaryList.add(new PremiumSummary(Double.parseDouble(premiumObj.optString("tax"))/2, "All Cover",
//						null, null, Double.parseDouble(premiumObj.optString("premiumAfterTax")), null,
//						Double.parseDouble(premiumObj.optString("premiumAfterLoading")), true, "FullTerm",
//						Double.parseDouble(premiumObj.optString("tax"))/2, null));
//
//			else if (resArr.getJSONObject(i).getString("policyTenure").equals("2Y"))
//				premiumSummaryList.add(new PremiumSummary(Double.parseDouble(premiumObj.optString("tax"))/2, "All Cover",
//						null, null, Double.parseDouble(premiumObj.optString("premiumAfterTax")), null,
//						Double.parseDouble(premiumObj.optString("premiumAfterLoading")), true, "FullTerm",
//						Double.parseDouble(premiumObj.optString("tax"))/2, null));
//
//			else if (resArr.getJSONObject(i).getString("policyTenure").equals("3Y"))
//				premiumSummaryList.add(new PremiumSummary(Double.parseDouble(premiumObj.optString("tax"))/2, "All Cover",
//						null, null, Double.parseDouble(premiumObj.optString("premiumAfterTax")), null,
//						Double.parseDouble(premiumObj.optString("premiumAfterLoading")), true, "FullTerm",
//						Double.parseDouble(premiumObj.optString("tax"))/2, null));

			policyOption.setPremiumSummaryList(premiumSummaryList);
			policyOptionList.add(policyOption);
			
		}
		
		System.out.println("converted Resp---"+objectMapper.writeValueAsString(policyOptionList));

		return policyOptionList;
	}

	public String convertToJson(Policy policy) throws JsonProcessingException {
		ProductDetails productDetails = transformToProductDetails(policy);
		String quickQuoteReq = objectMapper.writeValueAsString(productDetails);
		System.out.println("quickQuoteReq====" + quickQuoteReq);
		return quickQuoteReq;
	}

	public ProductDetails transformToProductDetails(Policy policy) {
		
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

		List<PolicyMemberInfo> memberList = policy.getPolicyMemberInfo();

		ProductDetails productDetails = new ProductDetails();
		productDetails.setProductCode(policy.getPolicyExt().getProductCd());
		productDetails.setQuoteNumber("null");
		productDetails.setApplicationNumber("1234321"); // doubt

		List<BasicDetail> basicDetails = new ArrayList<>();
		basicDetails.add(new BasicDetail("Proposer Pin Code", policy.getLocations().get(0).getStreetName()));
		basicDetails.add(new BasicDetail("Intermediary Name", "Kali Mohapatra"));
		if (policy.getPolicyExt().getPlan().equals("GALHLTHPLNGLD")) {
			basicDetails.add(new BasicDetail("Plan", "Gold"));
		} else if (policy.getPolicyExt().getPlan().equals("GALHLTHPLNPLT")) {
			basicDetails.add(new BasicDetail("Plan", "Platinum"));
		}

		if (policy.getPolicyExt().getPlanType().equals("GALHLTHPTIND"))
			basicDetails.add(new BasicDetail("Plan Type", "IND"));
		else if (policy.getPolicyExt().getPlanType().equals("GALHLTHPTFLT"))
			basicDetails.add(new BasicDetail("Plan Type", "FLOATER"));

		basicDetails.add(new BasicDetail("Policy Tenure", "1Y"));
		basicDetails.add(new BasicDetail("Premium Frequency", frequency));
		basicDetails.add(new BasicDetail("Producer Code", ""));
		basicDetails.add(new BasicDetail("Source Code", "TCSBANCS"));
		basicDetails.add(new BasicDetail("Type of Business", "NB"));
		basicDetails.add(new BasicDetail("Quote Start Date", policy.getPolicyExt().getQuoteEffectiveDate().replace("-", "/"))); 
		basicDetails.add(new BasicDetail("Number of Members", String.valueOf(memberList.size())));
		basicDetails.add(new BasicDetail("Family Size", ""));
		basicDetails.add(new BasicDetail("Applicable Sum Insured", String.valueOf(policy.getQuoteOptions().get(0).getSumInsuredOption()))); // need to done
		basicDetails.add(
				new BasicDetail("Policy Start Date", policy.getPolicyExt().getQuoteEffectiveDate().replace("-", "/")));
		basicDetails.add(
				new BasicDetail("Quote Expiry Date", policy.getPolicyExt().getQuoteExpiryDate().replace("-", "/")));
		basicDetails.add(new BasicDetail("PED - Buy Back", "NA")); // doubt
		productDetails.setBasicDetails(basicDetails);

		List<Member> members = new ArrayList<>();
		for (int i = 0; i < memberList.size(); i++) {
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
			LocalDate birthDate = LocalDate.parse(memberList.get(i).getDateOfBirth(), formatter);
			LocalDate currentDate = LocalDate.now();
			int age = Period.between(birthDate, currentDate).getYears();

			Member member = new Member();
			List<MemberDetail> memberDetails = new ArrayList<>();
			memberDetails.add(new MemberDetail("Member ID", String.valueOf(i + 1)));
			memberDetails.add(new MemberDetail("Age", String.valueOf(age)));
			memberDetails.add(new MemberDetail("Applicable Sum Insured", String.valueOf(memberList.get(i).getIoSumInsured())));
			memberDetails.add(new MemberDetail("Gender", "M")); // doubt
			memberDetails.add(new MemberDetail("Relationship", "24")); // doubt
			memberDetails.add(new MemberDetail("Date of Birth", memberList.get(i).getDateOfBirth().replace("-", "/")));
			memberDetails.add(new MemberDetail("Risk Class", "1"));
			if (memberList.get(i).getIoDeductible() == 0)
				memberDetails.add(new MemberDetail("Deductible Options", "NA"));
			else
				memberDetails.add(
						new MemberDetail("Deductible Options", String.valueOf(memberList.get(i).getIoDeductible())));
			member.setMemberDetails(memberDetails);

			List<Cover> covers = new ArrayList<>();
			for(int j=0; j<policy.getPolicyCoverageDetails().size(); j++) {
				Cover cover = new Cover();
				cover.setCoverCode(policy.getPolicyCoverageDetails().get(j).getCoverageCd());//ADPTD
				cover.setCoverName(policy.getPolicyCoverageDetails().get(j).getCoverageDescription()); //Personal Accident Cover
//				List<BasicDetail> coverAttributes = new ArrayList<>();
//				coverAttributes.add(new BasicDetail("", ""));
//				cover.setCoverAttribute(coverAttributes);
				covers.add(cover);
			}
			member.setCovers(covers);

			members.add(member);
		}
		
		productDetails.setMembers(members);

		List<DiscountLoad> discountLoads = new ArrayList<>();
		DiscountLoad discountLoad = new DiscountLoad();
		discountLoad.setTypeofloadingdiscount("Employee Discount");
		discountLoad.setUserInput("Y");
		discountLoads.add(discountLoad);
		productDetails.setDiscountLoads(discountLoads);

		productDetails.setFlag("C"); // doubt
		productDetails.setUserCode("");
		productDetails.setRoleCode("");

		return productDetails;
	}
	
}
