package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.bancsdto.policy;

import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.bancsdto.common.MsgResponse;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@NoArgsConstructor
@AllArgsConstructor
public class QuickQuoteResponse {
    private String productCode;
    private String productName;
    private String quoteNumber;
    private String sourceName;
    private String quoteStartDate;
    private String policyTenure;
    private String premiumFrequency;
    private String policyStatus;
    private String planCode;
    private QuotePremiumDetails quotePremiumDetails;
    private List<Member> members;
    private MsgResponse response;

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getQuoteNumber() {
        return quoteNumber;
    }

    public void setQuoteNumber(String quoteNumber) {
        this.quoteNumber = quoteNumber;
    }

    public String getSourceName() {
        return sourceName;
    }

    public void setSourceName(String sourceName) {
        this.sourceName = sourceName;
    }

    public String getQuoteStartDate() {
        return quoteStartDate;
    }

    public void setQuoteStartDate(String quoteStartDate) {
        this.quoteStartDate = quoteStartDate;
    }

    public String getPolicyTenure() {
        return policyTenure;
    }

    public void setPolicyTenure(String policyTenure) {
        this.policyTenure = policyTenure;
    }

    public String getPremiumFrequency() {
        return premiumFrequency;
    }

    public void setPremiumFrequency(String premiumFrequency) {
        this.premiumFrequency = premiumFrequency;
    }

    public String getPolicyStatus() {
        return policyStatus;
    }

    public void setPolicyStatus(String policyStatus) {
        this.policyStatus = policyStatus;
    }

    public String getPlanCode() {
        return planCode;
    }

    public void setPlanCode(String planCode) {
        this.planCode = planCode;
    }

    public QuotePremiumDetails getQuotePremiumDetails() {
        return quotePremiumDetails;
    }

    public void setQuotePremiumDetails(QuotePremiumDetails quotePremiumDetails) {
        this.quotePremiumDetails = quotePremiumDetails;
    }

    public List<Member> getMembers() {
        return members;
    }

    public void setMembers(List<Member> members) {
        this.members = members;
    }

    public MsgResponse getResponse() {
        return response;
    }

    public void setResponse(MsgResponse response) {
        this.response = response;
    }
}
