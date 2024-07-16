package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.salesDto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.NoArgsConstructor;


import java.time.LocalDate;


@NoArgsConstructor
public class PolicyAmount extends BaseEntity {

    public PolicyAmount(Long policyAmountId, Long policyId, String coveragePartCd, Long policyCoverageDetailsId, Long insurableObjectId, Long geographicLocationId, LocalDate effectiveDate,
                        String amounttype, String covertype, String insurancetype, Double policyamount,
                        String currency, Long insurableObjectRef) {
        this.policyAmountId = policyAmountId;
        this.policyId = policyId;
        this.coveragePartCd = coveragePartCd;
        this.policyCoverageDetailsId = policyCoverageDetailsId;
        this.insurableObjectId = insurableObjectId;
        this.geographicLocationId = geographicLocationId;
        this.effectiveDate = effectiveDate;
        this.amounttype = amounttype;
        this.covertype = covertype;
        this.insurancetype = insurancetype;
        this.policyamount = policyamount;
        this.currency = currency;
        this.insurableObjectRef = insurableObjectRef;
    }

    public PolicyAmount(String amounttype, String covertype, Double policyamount) {
        this.amounttype = amounttype;
        this.covertype = covertype;
        this.policyamount = policyamount;
    }


    private Long policyAmountId;

    private Long policyId;
    private String coveragePartCd;
    private Long policyCoverageDetailsId;
    private Long insurableObjectId;
    private Long geographicLocationId;

    @JsonIgnore
    private PolicyExt policyExt;

    @JsonFormat(pattern="dd-MM-yyyy")
    private LocalDate effectiveDate;
    private String amounttype;
    private String covertype;
    private String insurancetype;
    private Double policyamount;
    private String currency;
    private Long insurableObjectRef;

    public Long getPolicyAmountId() {
        return policyAmountId;
    }

    public void setPolicyAmountId(Long policyAmountId) {
        this.policyAmountId = policyAmountId;
    }

    public Long getPolicyId() {
        return policyId;
    }

    public void setPolicyId(Long policyId) {
        this.policyId = policyId;
    }

    public Long getPolicyCoverageDetailsId() {
        return policyCoverageDetailsId;
    }

    public void setPolicyCoverageDetailsId(Long policyCoverageDetailsId) {
        this.policyCoverageDetailsId = policyCoverageDetailsId;
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

    public Long getGeographicLocationId() {
        return geographicLocationId;
    }

    public void setGeographicLocationId(Long geographicLocationId) {
        this.geographicLocationId = geographicLocationId;
    }

    public LocalDate getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(LocalDate effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public String getAmounttype() {
        return amounttype;
    }

    public void setAmounttype(String amounttype) {
        this.amounttype = amounttype;
    }

    public String getCovertype() {
        return covertype;
    }

    public void setCovertype(String covertype) {
        this.covertype = covertype;
    }

    public String getInsurancetype() {
        return insurancetype;
    }

    public void setInsurancetype(String insurancetype) {
        this.insurancetype = insurancetype;
    }

    public Double getPolicyamount() {
        return policyamount;
    }

    public void setPolicyamount(Double policyamount) {
        this.policyamount = policyamount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Long getInsurableObjectRef() {
        return insurableObjectRef;
    }

    public void setInsurableObjectRef(Long insurableObjectRef) {
        this.insurableObjectRef = insurableObjectRef;
    }
}
