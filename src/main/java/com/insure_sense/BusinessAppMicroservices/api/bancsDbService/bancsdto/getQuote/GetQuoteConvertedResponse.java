package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.bancsdto.getQuote;

import java.util.List;

public class GetQuoteConvertedResponse {
	private String product;
    private String quoteDate;
    private String quoteNumber;
    private String coverType;
    private String planType;
    private int noOfAdult;
    private String PaymentType;
    private List<MemberDetail> memberDetails;
    private List<PremiumBreakup> premiumBreakup;
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public String getQuoteDate() {
		return quoteDate;
	}
	public void setQuoteDate(String quoteDate) {
		this.quoteDate = quoteDate;
	}
	public String getQuoteNumber() {
		return quoteNumber;
	}
	public void setQuoteNumber(String quoteNumber) {
		this.quoteNumber = quoteNumber;
	}
	public String getCoverType() {
		return coverType;
	}
	public void setCoverType(String coverType) {
		this.coverType = coverType;
	}
	public String getPlanType() {
		return planType;
	}
	public void setPlanType(String planType) {
		this.planType = planType;
	}
	public int getNoOfAdult() {
		return noOfAdult;
	}
	public void setNoOfAdult(int noOfAdult) {
		this.noOfAdult = noOfAdult;
	}
	public String getPaymentType() {
		return PaymentType;
	}
	public void setPaymentType(String PaymentType) {
		this.PaymentType = PaymentType;
	}
	public List<MemberDetail> getMemberDetails() {
		return memberDetails;
	}
	public void setMemberDetails(List<MemberDetail> memberDetails) {
		this.memberDetails = memberDetails;
	}
	public List<PremiumBreakup> getPremiumBreakup() {
		return premiumBreakup;
	}
	public void setPremiumBreakup(List<PremiumBreakup> premiumBreakup) {
		this.premiumBreakup = premiumBreakup;
	}
    
}
