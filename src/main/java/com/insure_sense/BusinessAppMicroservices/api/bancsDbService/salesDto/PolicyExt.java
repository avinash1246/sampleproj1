package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.salesDto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;


public class PolicyExt extends BaseEntity {

    public PolicyExt(Long policyId, String productCd, LocalDate effectiveDate, LocalDate expiryDate,
                     String paymentType, String caseId, Long parentPolicyId, String txnTypeCd,
                     String statusCd, String quoteNumber, String policyNumber,
                     LocalDate quoteEffectiveDate, LocalDate quoteExpiryDate, String sourceCd,
                     String familyType, LocalDate policyChangeEffectiveDate, String policyChangeReasonCd,
                     Long originalPolicyId, Integer txnSeqNumber, String subStatusCd, String policyTenure,
                     String planType, String plan, Boolean isDuplicate) {
        this.policyId = policyId;
        this.productCd = productCd;
        this.effectiveDate = effectiveDate;
        this.expiryDate = expiryDate;
        this.paymentType = paymentType;
        this.caseId = caseId;
        this.parentPolicyId = parentPolicyId;
        this.txnTypeCd = txnTypeCd;
        this.statusCd = statusCd;
        this.quoteNumber = quoteNumber;
        this.policyNumber = policyNumber;
        this.quoteEffectiveDate = quoteEffectiveDate;
        this.quoteExpiryDate = quoteExpiryDate;
        this.sourceCd = sourceCd;
        this.familyType = familyType;
        this.policyChangeEffectiveDate = policyChangeEffectiveDate;
        this.policyChangeReasonCd = policyChangeReasonCd;
        this.originalPolicyId = originalPolicyId;
        this.txnSeqNumber = txnSeqNumber;
        this.subStatusCd = subStatusCd;
        this.policyTenure = policyTenure;
        this.planType = planType;
        this.plan = plan;
        this.isDuplicate = isDuplicate;
    }
    public PolicyExt(Long policyId) {
        this.policyId = policyId;
    }

    public PolicyExt() {
    }


    private Long policyId;

/*    @Version
    @Column(columnDefinition = "integer DEFAULT 0", nullable = false)*//*
    private Long policyVersion = 0L;*/

    private String productCd;

    private LocalDate effectiveDate;

    private LocalDate expiryDate;

    private String paymentType;

    private String caseId;

    private Long parentPolicyId;

    private String txnTypeCd;

    private String statusCd;

    private String quoteNumber;

    private String policyNumber;

    @JsonFormat(pattern="dd-MM-yyyy")
    private LocalDate quoteEffectiveDate;

    @JsonFormat(pattern="dd-MM-yyyy")
    private LocalDate quoteExpiryDate;

    private String sourceCd;

    private String familyType;

    private LocalDate policyChangeEffectiveDate;

    private String policyChangeReasonCd;

    private Long originalPolicyId;

    private Integer txnSeqNumber;

    private String subStatusCd;

    private String policyTenure;

    private String planType;

    private String plan;
    private Boolean isDuplicate;

    @JsonIgnore
    private List<PolicyInsuredDetails> policyInsuredDetails;

    public LocalDateTime getCreatedDate() { return createdDate; };

    public Long getPolicyId() {
        return policyId;
    }

    public void setPolicyId(Long policyId) {
        this.policyId = policyId;
    }

    public String getProductCd() {
        return productCd;
    }

    public void setProductCd(String productCd) {
        this.productCd = productCd;
    }

    public LocalDate getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(LocalDate effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(LocalDate expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public String getCaseId() {
        return caseId;
    }

    public void setCaseId(String caseId) {
        this.caseId = caseId;
    }

    public Long getParentPolicyId() {
        return parentPolicyId;
    }

    public void setParentPolicyId(Long parentPolicyId) {
        this.parentPolicyId = parentPolicyId;
    }

    public String getTxnTypeCd() {
        return txnTypeCd;
    }

    public void setTxnTypeCd(String txnTypeCd) {
        this.txnTypeCd = txnTypeCd;
    }

    public String getStatusCd() {
        return statusCd;
    }

    public void setStatusCd(String statusCd) {
        this.statusCd = statusCd;
    }

    public List<PolicyInsuredDetails> getPolicyInsuredDetails() {
        return policyInsuredDetails;
    }

    public void setPolicyInsuredDetails(List<PolicyInsuredDetails> policyInsuredDetails) {
        this.policyInsuredDetails = policyInsuredDetails;
    }

    public String getQuoteNumber() {
        return quoteNumber;
    }

    public void setQuoteNumber(String quoteNumber) {
        this.quoteNumber = quoteNumber;
    }

    public String getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }

    public LocalDate getPolicyChangeEffectiveDate() {
        return policyChangeEffectiveDate;
    }

    public void setPolicyChangeEffectiveDate(LocalDate policyChangeEffectiveDate) {
        this.policyChangeEffectiveDate = policyChangeEffectiveDate;
    }

    public String getPolicyChangeReasonCd() {
        return policyChangeReasonCd;
    }

    public void setPolicyChangeReasonCd(String policyChangeReasonCd) {
        this.policyChangeReasonCd = policyChangeReasonCd;
    }

    public Long getOriginalPolicyId() {
        return originalPolicyId;
    }

    public void setOriginalPolicyId(Long originalPolicyId) {
        this.originalPolicyId = originalPolicyId;
    }

    public Integer getTxnSeqNumber() {
        return txnSeqNumber;
    }

    public void setTxnSeqNumber(Integer txnSeqNumber) {
        this.txnSeqNumber = txnSeqNumber;
    }

    public String getSubStatusCd() {
        return subStatusCd;
    }

    public void setSubStatusCd(String subStatusCd) {
        this.subStatusCd = subStatusCd;
    }

    public String getPolicyTenure() {
        return policyTenure;
    }

    public void setPolicyTenure(String policyTenure) {
        this.policyTenure = policyTenure;
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



    public Boolean getIsDuplicate() {
        return isDuplicate;
    }

    public void setIsDuplicate(Boolean isDuplicate) {
        this.isDuplicate = isDuplicate;
    }

    public LocalDate getQuoteEffectiveDate() {
        return quoteEffectiveDate;
    }

    public void setQuoteEffectiveDate(LocalDate quoteEffectiveDate) {
        this.quoteEffectiveDate = quoteEffectiveDate;
    }

    public LocalDate getQuoteExpiryDate() {
        return quoteExpiryDate;
    }

    public void setQuoteExpiryDate(LocalDate quoteExpiryDate) {
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
}
