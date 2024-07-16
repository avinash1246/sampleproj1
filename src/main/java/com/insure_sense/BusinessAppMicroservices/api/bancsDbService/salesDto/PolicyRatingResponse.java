package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.salesDto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.NoArgsConstructor;


import java.time.LocalDate;
@NoArgsConstructor
public class PolicyRatingResponse extends BaseEntity {

    public PolicyRatingResponse(Long policyRatingResponseId, Long policyId, String coveragePartCd,
                                Long insurableObjectId, LocalDate rateEffectiveDate, String txnTypeCd,
                                String invocRef, Long insurableObjectRef, Double ratingFactor,
                                String categoryDescription, String groupDescription, String factorType,
                                String categoryValue, Double ratingBasis,
                                String coverType) {
        this.policyRatingResponseId = policyRatingResponseId;
        this.policyId = policyId;
        this.coveragePartCd = coveragePartCd;
        this.insurableObjectId = insurableObjectId;
        this.rateEffectiveDate = rateEffectiveDate;
        this.txnTypeCd = txnTypeCd;
        this.invocRef = invocRef;
        this.insurableObjectRef = insurableObjectRef;
        this.ratingFactor = ratingFactor;
        this.categoryDescription = categoryDescription;
        this.groupDescription = groupDescription;
        this.factorType = factorType;
        this.categoryValue = categoryValue;
        this.ratingBasis = ratingBasis;
        this.coverType = coverType;
    }


    private Long policyRatingResponseId;

    private Long policyId;
    private String coveragePartCd;
    private Long insurableObjectId;

    @JsonIgnore
    private PolicyExt policyExt;

    @JsonFormat(pattern="yyyy-MM-dd")
    private LocalDate rateEffectiveDate;
    private String txnTypeCd;
    private String invocRef;
    private Long insurableObjectRef;

    private Double ratingFactor;

    private String categoryDescription;

    private String groupDescription;

    private String factorType;

    private String categoryValue;

    private Double ratingBasis;

    private String coverType;

    public Long getPolicyRatingResponseId() {
        return policyRatingResponseId;
    }

    public void setPolicyRatingResponseId(Long policyRatingResponseId) {
        this.policyRatingResponseId = policyRatingResponseId;
    }

    public Long getPolicyId() {
        return policyId;
    }

    public void setPolicyId(Long policyId) {
        this.policyId = policyId;
    }

    public String getCoveragePartCd() {
        return coveragePartCd;
    }

    public void setCoveragePartCd(String coveragePartCd) {
        this.coveragePartCd = coveragePartCd;
    }

    public Long getInsurableObjectId() {
        return insurableObjectId;
    }

    public void setInsurableObjectId(Long insurableObjectId) {
        this.insurableObjectId = insurableObjectId;
    }

    public LocalDate getRateEffectiveDate() {
        return rateEffectiveDate;
    }

    public void setRateEffectiveDate(LocalDate rateEffectiveDate) {
        this.rateEffectiveDate = rateEffectiveDate;
    }

    public Long getInsurableObjectRef() {
        return insurableObjectRef;
    }

    public void setInsurableObjectRef(Long insurableObjectRef) {
        this.insurableObjectRef = insurableObjectRef;
    }

    public Double getRatingFactor() {
        return ratingFactor;
    }

    public void setRatingFactor(Double ratingFactor) {
        this.ratingFactor = ratingFactor;
    }

    public String getCategoryDescription() {
        return categoryDescription;
    }

    public void setCategoryDescription(String categoryDescription) {
        this.categoryDescription = categoryDescription;
    }

    public String getGroupDescription() {
        return groupDescription;
    }

    public void setGroupDescription(String groupDescription) {
        this.groupDescription = groupDescription;
    }

    public String getFactorType() {
        return factorType;
    }

    public void setFactorType(String factorType) {
        this.factorType = factorType;
    }

    public String getCategoryValue() {
        return categoryValue;
    }

    public void setCategoryValue(String categoryValue) {
        this.categoryValue = categoryValue;
    }

    public Double getRatingBasis() {
        return ratingBasis;
    }

    public void setRatingBasis(Double ratingBasis) {
        this.ratingBasis = ratingBasis;
    }

    public String getCoverType() {
        return coverType;
    }

    public void setCoverType(String coverType) {
        this.coverType = coverType;
    }

    public String getTxnTypeCd() {
        return txnTypeCd;
    }

    public void setTxnTypeCd(String txnTypeCd) {
        this.txnTypeCd = txnTypeCd;
    }

    public String getInvocRef() {
        return invocRef;
    }

    public void setInvocRef(String invocRef) {
        this.invocRef = invocRef;
    }
}
