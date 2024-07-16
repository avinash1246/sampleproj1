package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.dto;

public class PolicyExt {
	private String statusCd;
    private String productCd;
    private String caseId;
    private String effectiveDate;
    private String planType;
    private String plan;
    private String policyTenure;
    private String paymentType;
    private String txnTypeCd;
    private String quoteNumber;
    private String currentAddLocality;
    private String policyNumber;
    private int txnSeqNumber;
    private String quoteEffectiveDate;
    private String quoteExpiryDate;
    private String sourceCd;
    private String familyType;
    private boolean isDuplicate;
    // Add other fields as needed

    public String getStatusCd() {
        return statusCd;
    }

    public void setStatusCd(String statusCd) {
        this.statusCd = statusCd;
    }

    public String getProductCd() {
        return productCd;
    }

    public void setProductCd(String productCd) {
        this.productCd = productCd;
    }

    public String getCaseId() {
        return caseId;
    }

    public void setCaseId(String caseId) {
        this.caseId = caseId;
    }

    public String getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public String getPlanType() {
        return planType;
    }

    public void setPlanType(String planType) {
        this.planType = planType;
    }

    public String getPlan() {
        return plan;
    }

    public void setPlan(String plan) {
        this.plan = plan;
    }

    public String getPolicyTenure() {
        return policyTenure;
    }

    public void setPolicyTenure(String policyTenure) {
        this.policyTenure = policyTenure;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public String getTxnTypeCd() {
        return txnTypeCd;
    }

    public void setTxnTypeCd(String txnTypeCd) {
        this.txnTypeCd = txnTypeCd;
    }

    public String getQuoteNumber() {
        return quoteNumber;
    }

    public void setQuoteNumber(String quoteNumber) {
        this.quoteNumber = quoteNumber;
    }

    public String getCurrentAddLocality() {
        return currentAddLocality;
    }

    public void setCurrentAddLocality(String currentAddLocality) {
        this.currentAddLocality = currentAddLocality;
    }

    public String getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }

    public int getTxnSeqNumber() {
        return txnSeqNumber;
    }

    public void setTxnSeqNumber(int txnSeqNumber) {
        this.txnSeqNumber = txnSeqNumber;
    }

    public String getQuoteEffectiveDate() {
        return quoteEffectiveDate;
    }

    public void setQuoteEffectiveDate(String quoteEffectiveDate) {
        this.quoteEffectiveDate = quoteEffectiveDate;
    }

    public String getQuoteExpiryDate() {
        return quoteExpiryDate;
    }

    public void setQuoteExpiryDate(String quoteExpiryDate) {
        this.quoteExpiryDate = quoteExpiryDate;
    }

    public String getSourceCd() {
        return sourceCd;
    }

    public void setSourceCd(String sourceCd) {
        this.sourceCd = sourceCd;
    }

    public String getFamilyType() {
        return familyType;
    }

    public void setFamilyType(String familyType) {
        this.familyType = familyType;
    }

    public boolean isDuplicate() {
        return isDuplicate;
    }

    public void setDuplicate(boolean duplicate) {
        isDuplicate = duplicate;
    }
}
