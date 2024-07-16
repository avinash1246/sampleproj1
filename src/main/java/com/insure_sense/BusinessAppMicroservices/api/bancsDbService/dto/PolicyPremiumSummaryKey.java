package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.Objects;


public class PolicyPremiumSummaryKey implements Serializable {

    public PolicyPremiumSummaryKey(String coveragePartCd, String coverType) {
        this.coveragePartCd = coveragePartCd;
        this.coverType = coverType;
    }

    public PolicyPremiumSummaryKey(String coveragePartCd, Long insurableObjectRef, String coverType) {
        this.coveragePartCd = coveragePartCd;
        this.insurableObjectRef = insurableObjectRef;
        this.coverType = coverType;
    }

    public PolicyPremiumSummaryKey(String coveragePartCd, Long insurableObjectRef, String coverType, String amountCategory) {
        this.coveragePartCd = coveragePartCd;
        this.insurableObjectRef = insurableObjectRef;
        this.coverType = coverType;
        this.amountCategory = amountCategory;
    }

    public PolicyPremiumSummaryKey(String coveragePartCd, String coverType, String amountCategory, Boolean isCommission) {
        this.coveragePartCd = coveragePartCd;
        this.coverType = coverType;
        this.amountCategory = amountCategory;
        this.isCommission = isCommission;
    }

    public PolicyPremiumSummaryKey(String coveragePartCd, Long insurableObjectRef, String coverType,
                                   String amountCategory, Boolean isCommission) {
        this.coveragePartCd = coveragePartCd;
        this.insurableObjectRef = insurableObjectRef;
        this.coverType = coverType;
        this.amountCategory = amountCategory;
        this.isCommission = isCommission;
    }

    String coveragePartCd;
    Long insurableObjectRef;
    String coverType;
    String amountCategory;
    Boolean isCommission;

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

    public String getAmountCategory() {
        return amountCategory;
    }

    public void setAmountCategory(String amountCategory) {
        this.amountCategory = amountCategory;
    }

    public Boolean getCommission() {
        return isCommission;
    }

    public void setCommission(Boolean commission) {
        isCommission = commission;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PolicyPremiumSummaryKey that = (PolicyPremiumSummaryKey) o;
        return Objects.equals(coveragePartCd, that.coveragePartCd) &&
                Objects.equals(insurableObjectRef, that.insurableObjectRef) &&
                coverType.equals(that.coverType) &&
                Objects.equals(amountCategory, that.amountCategory) &&
                Objects.equals(isCommission, that.isCommission);
    }

    @Override
    public int hashCode() {
        return Objects.hash(coveragePartCd, insurableObjectRef, coverType, amountCategory, isCommission);
    }
}
