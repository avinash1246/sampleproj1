package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.salesDto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class PolicyClaimHist extends BaseEntity {


    public PolicyClaimHist(Long policyClaimHistId, Long policyId, String policyYear,
                           String claimType, Float premiumAmt, Float claimValue,
                           Float settledValue) {
        this.policyClaimHistId = policyClaimHistId;
        this.policyId = policyId;
        this.policyYear = policyYear;
        this.claimType = claimType;
        this.premiumAmt = premiumAmt;
        this.claimValue = claimValue;
        this.settledValue = settledValue;
    }

    private Long policyClaimHistId;

    private Long policyId;
    private String policyYear;
    private String claimType;
    private Float premiumAmt;
    private Float claimValue;
    private Float settledValue;

    @JsonIgnore
    private PolicyExt policyExt;

    public Long getPolicyClaimHistId() {
        return policyClaimHistId;
    }

    public void setPolicyClaimHistId(Long policyClaimHistId) {
        this.policyClaimHistId = policyClaimHistId;
    }

    public String getPolicyYear() {
        return policyYear;
    }

    public void setPolicyYear(String policyYear) {
        this.policyYear = policyYear;
    }

    public String getClaimType() {
        return claimType;
    }

    public void setClaimType(String claimType) {
        this.claimType = claimType;
    }

    public Float getClaimValue() {
        return claimValue;
    }

    public void setClaimValue(Float claimValue) {
        this.claimValue = claimValue;
    }

    public Long getPolicyId() {
        return policyId;
    }

    public void setPolicyId(Long policyId) {
        this.policyId = policyId;
    }

    public Float getSettledValue() {
        return settledValue;
    }

    public void setSettledValue(Float settledValue) {
        this.settledValue = settledValue;
    }

    public Float getPremiumAmt() {
        return premiumAmt;
    }

    public void setPremiumAmt(Float premiumAmt) {
        this.premiumAmt = premiumAmt;
    }
}
