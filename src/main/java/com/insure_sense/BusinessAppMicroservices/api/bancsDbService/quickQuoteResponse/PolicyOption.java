package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.quickQuoteResponse;

import java.util.List;

public class PolicyOption {
	private int optionRef;
    private String policyTenureOption;
    private String paymentOption;
    private int sumInsuredOption;
    private List<PolicyAmount> policyAmounts;
    private List<PremiumSummary> premiumSummaryList;

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

    public List<PolicyAmount> getPolicyAmounts() {
        return policyAmounts;
    }

    public void setPolicyAmounts(List<PolicyAmount> policyAmounts) {
        this.policyAmounts = policyAmounts;
    }

    public List<PremiumSummary> getPremiumSummaryList() {
        return premiumSummaryList;
    }

    public void setPremiumSummaryList(List<PremiumSummary> premiumSummaryList) {
        this.premiumSummaryList = premiumSummaryList;
    }
}
