package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.salesDto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.NoArgsConstructor;


import java.time.LocalDate;


@NoArgsConstructor
public class PolicyLimit extends BaseEntity {

    public PolicyLimit(Long policyLimitId, Long policyCoverageDetailsId, String limitTypeCd, Float limitValue, String limitCategoryCd) {
        this.policyLimitId = policyLimitId;
        this.policyCoverageDetailsId = policyCoverageDetailsId;
        this.limitTypeCd = limitTypeCd;
        this.limitValue = limitValue;
        this.limitCategoryCd = limitCategoryCd;
    }


    private Long policyLimitId;

    private Long policyCoverageDetailsId;

    @JsonFormat(pattern="dd/MM/yyyy")
    private LocalDate effectiveDate;

    @JsonIgnore
    private PolicyCoverageDetails policyCoverageDetails;

    private String limitTypeCd;
    private Float limitValue;
    private String limitCategoryCd;

    public Long getPolicyLimitId() {
        return policyLimitId;
    }

    public void setPolicyLimitId(Long policyLimitId) {
        this.policyLimitId = policyLimitId;
    }

    public String getLimitTypeCd() {
        return limitTypeCd;
    }

    public void setLimitTypeCd(String limitTypeCd) {
        this.limitTypeCd = limitTypeCd;
    }

    public Float getLimitValue() {
        return limitValue;
    }

    public void setLimitValue(Float limitValue) {
        this.limitValue = limitValue;
    }

    public String getLimitCategoryCd() {
        return limitCategoryCd;
    }

    public void setLimitCategoryCd(String limitCategoryCd) {
        this.limitCategoryCd = limitCategoryCd;
    }

    public Long getPolicyCoverageDetailsId() {
        return policyCoverageDetailsId;
    }

    public void setPolicyCoverageDetailsId(Long policyCoverageDetailsId) {
        this.policyCoverageDetailsId = policyCoverageDetailsId;
    }

    public PolicyCoverageDetails getPolicyCoverageDetails() {
        return policyCoverageDetails;
    }

    public void setPolicyCoverageDetails(PolicyCoverageDetails policyCoverageDetails) {
        this.policyCoverageDetails = policyCoverageDetails;
    }

    public LocalDate getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(LocalDate effectiveDate) {
        this.effectiveDate = effectiveDate;
    }
}

