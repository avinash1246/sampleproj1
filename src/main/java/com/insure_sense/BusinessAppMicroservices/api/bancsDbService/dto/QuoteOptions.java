package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.dto;

public class QuoteOptions {
	
	private int optionRef;
	private String policyTenureOption;
	private String paymentOption;
	private int sumInsuredOption;
	private Object policyAmounts;
	private Object premiumSummaryList;
	public int getOptionRef() {
		return optionRef;
	}
	public void setOptionRef(int optionRef) {
		this.optionRef = optionRef;
	}
	public String getPolicyTenureOption() {
		return policyTenureOption;
	}
	public void setPolicyTenureOption(String policyTenureOption) {
		this.policyTenureOption = policyTenureOption;
	}
	public String getPaymentOption() {
		return paymentOption;
	}
	public void setPaymentOption(String paymentOption) {
		this.paymentOption = paymentOption;
	}
	public int getSumInsuredOption() {
		return sumInsuredOption;
	}
	public void setSumInsuredOption(int sumInsuredOption) {
		this.sumInsuredOption = sumInsuredOption;
	}
	public Object getPolicyAmounts() {
		return policyAmounts;
	}
	public void setPolicyAmounts(Object policyAmounts) {
		this.policyAmounts = policyAmounts;
	}
	public Object getPremiumSummaryList() {
		return premiumSummaryList;
	}
	public void setPremiumSummaryList(Object premiumSummaryList) {
		this.premiumSummaryList = premiumSummaryList;
	}
	
	

}
