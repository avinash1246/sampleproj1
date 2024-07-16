package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.salesDto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.NoArgsConstructor;


import java.time.LocalDate;


@NoArgsConstructor
public class PolicyRatingDetail extends BaseEntity {

    public PolicyRatingDetail(Long policyRatingDetailId, Long policyId, String coveragePartCd,
                              Long insurableObjectId, String coverType, LocalDate rateEffectiveDate,
                              Long insurableObjectRef, Double basePrice, Double baseRate, Double uwFactor,
                              Double finalUwFactor, Double termFactor, Double coaFactor, Double premAdjustFactor,
                              Double commFactor, Double coverPremium) {
        this.policyRatingDetailId = policyRatingDetailId;
        this.policyId = policyId;
        this.coveragePartCd = coveragePartCd;
        this.insurableObjectId = insurableObjectId;
        this.coverType = coverType;
        this.rateEffectiveDate = rateEffectiveDate;
        this.insurableObjectRef = insurableObjectRef;
        this.basePrice = basePrice;
        this.baseRate = baseRate;
        this.uwFactor = uwFactor;
        this.finalUwFactor = finalUwFactor;
        this.termFactor = termFactor;
        this.coaFactor = coaFactor;
        this.premAdjustFactor = premAdjustFactor;
        this.commFactor = commFactor;
        this.coverPremium = coverPremium;
    }


    private Long policyRatingDetailId;

    private Long policyId;
    private String coveragePartCd;
    private Long insurableObjectId;
    private String coverType;

    @JsonIgnore
    private PolicyExt policyExt;

    @JsonFormat(pattern="yyyy-MM-dd")
    private LocalDate rateEffectiveDate;

    private Long insurableObjectRef;
    private Double basePrice;
    private Double baseRate;
    private Double uwFactor;
    private Double finalUwFactor;
    private Double termFactor;
    private Double coaFactor;
    private Double premAdjustFactor;
    private Double commFactor;
    private Double coverPremium;

    public String getCoveragePartCd() {
        return coveragePartCd;
    }

    public void setCoveragePartCd(String coveragePartCd) {
        this.coveragePartCd = coveragePartCd;
    }

    public Long getInsurableObjectRef() {
        return insurableObjectRef;
    }

    public void setInsurableObjectRef(Long insurableObjectRef) {
        this.insurableObjectRef = insurableObjectRef;
    }

    public String getCoverType() {
        return coverType;
    }

    public void setCoverType(String coverType) {
        this.coverType = coverType;
    }

    public Double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(Double basePrice) {
        this.basePrice = basePrice;
    }

    public Double getBaseRate() {
        return baseRate;
    }

    public void setBaseRate(Double baseRate) {
        this.baseRate = baseRate;
    }

    public Double getUwFactor() {
        return uwFactor;
    }

    public void setUwFactor(Double uwFactor) {
        this.uwFactor = uwFactor;
    }

    public Double getTermFactor() {
        return termFactor;
    }

    public void setTermFactor(Double termFactor) {
        this.termFactor = termFactor;
    }

    public Double getCoaFactor() {
        return coaFactor;
    }

    public void setCoaFactor(Double coaFactor) {
        this.coaFactor = coaFactor;
    }

    public Double getPremAdjustFactor() {
        return premAdjustFactor;
    }

    public void setPremAdjustFactor(Double premAdjustFactor) {
        this.premAdjustFactor = premAdjustFactor;
    }

    public Double getCommFactor() {
        return commFactor;
    }

    public void setCommFactor(Double commFactor) {
        this.commFactor = commFactor;
    }

    public Double getCoverPremium() {
        return coverPremium;
    }

    public void setCoverPremium(Double coverPremium) {
        this.coverPremium = coverPremium;
    }

    public Double getFinalUwFactor() {
        return finalUwFactor;
    }

    public void setFinalUwFactor(Double finalUwFactor) {
        this.finalUwFactor = finalUwFactor;
    }

    public Long getPolicyRatingDetailId() {
        return policyRatingDetailId;
    }

    public void setPolicyRatingDetailId(Long policyRatingDetailId) {
        this.policyRatingDetailId = policyRatingDetailId;
    }

    public Long getPolicyId() {
        return policyId;
    }

    public void setPolicyId(Long policyId) {
        this.policyId = policyId;
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
}
