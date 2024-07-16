package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.salesDto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.NoArgsConstructor;


import java.time.LocalDate;


@NoArgsConstructor
public class PolicyCoveragePart extends BaseEntity {

    public PolicyCoveragePart(Long policyId, String coveragePartCd, String coveragePartName, LocalDate effectiveDate,
                              Boolean selected, Double coveragePartSumInsured, String coveragePartDeductible) {
        this.policyId = policyId;
        this.coveragePartCd = coveragePartCd;
        this.coveragePartName = coveragePartName;
        this.effectiveDate = effectiveDate;
        this.selected = selected;
        this.coveragePartSumInsured = coveragePartSumInsured;
        this.coveragePartDeductible = coveragePartDeductible;
    }


    private Long policyId;


    private String coveragePartCd;

    private String coveragePartName;

    @JsonIgnore
    private PolicyExt policyExt;

    @JsonFormat(pattern="dd/MM/yyyy")
    private LocalDate effectiveDate;

    private Boolean selected;

    private Double coveragePartSumInsured;

    private String coveragePartDeductible;

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

    public LocalDate getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(LocalDate effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public String getCoveragePartName() {
        return coveragePartName;
    }

    public void setCoveragePartName(String coveragePartName) {
        this.coveragePartName = coveragePartName;
    }

    public Boolean getSelected() {
        return selected;
    }

    public void setSelected(Boolean selected) {
        this.selected = selected;
    }

    public Double getCoveragePartSumInsured() {
        return coveragePartSumInsured;
    }

    public void setCoveragePartSumInsured(Double coveragePartSumInsured) {
        this.coveragePartSumInsured = coveragePartSumInsured;
    }

    public String getCoveragePartDeductible() {
        return coveragePartDeductible;
    }

    public void setCoveragePartDeductible(String coveragePartDeductible) {
        this.coveragePartDeductible = coveragePartDeductible;
    }
}
