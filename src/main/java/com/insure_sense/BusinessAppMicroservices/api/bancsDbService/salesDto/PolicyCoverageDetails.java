package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.salesDto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.NoArgsConstructor;


import java.time.LocalDate;
import java.util.List;

@NoArgsConstructor
public class PolicyCoverageDetails extends BaseEntity {

    public PolicyCoverageDetails(Long policyCoverageDetailsId, LocalDate effectiveDate, Long policyId,
                                 String coveragePartCd, String coverageCd, Long insurableObjectId,
                                 String coverageName, Float sumInsured, String sumInsuredBasis,
                                 Float deductible, LocalDate expirationDate, String coverageDescription,
                                 String deductibleDescription, String parentCoverageCd, String itemDescription,
                                 String coverageApplyCd, Long insurableObjectRef, String coverageLayerCd,
                                 Boolean selected) {
        this.policyCoverageDetailsId = policyCoverageDetailsId;
        this.effectiveDate = effectiveDate;
        this.policyId = policyId;
        this.coveragePartCd = coveragePartCd;
        this.coverageCd = coverageCd;
        this.insurableObjectId = insurableObjectId;
        this.coverageName = coverageName;
        this.sumInsured = sumInsured;
        this.sumInsuredBasis = sumInsuredBasis;
        this.deductible = deductible;
        this.expirationDate = expirationDate;
        this.coverageDescription = coverageDescription;
        this.deductibleDescription = deductibleDescription;
        this.parentCoverageCd = parentCoverageCd;
        this.itemDescription = itemDescription;
        this.coverageApplyCd = coverageApplyCd;
        this.insurableObjectRef = insurableObjectRef;
        this.coverageLayerCd = coverageLayerCd;
        this.selected = selected;
    }



    private Long policyCoverageDetailsId;


    @JsonFormat(pattern="dd/MM/yyyy")
    private LocalDate effectiveDate;

    private Long policyId;

    private String coveragePartCd;

    private String coverageCd;

    private Long insurableObjectId;

    private String coverageApplyCd;

    @JsonIgnore
    private PolicyExt policyExt;

/*    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "insurableObjectId", insertable=false, updatable=false)
    private InsurableObject insurableObject;*/

    @JsonIgnore
     private PolicyCoveragePart policyCoveragePart;

    private Long insurableObjectRef;
    private String coverageLayerCd;

    private String coverageName;
    private Float sumInsured;
    private String sumInsuredBasis;
    private Float deductible;

    private List<PolicyLimit> policyLimits;

    @JsonFormat(pattern="dd/MM/yyyy")
    private LocalDate expirationDate;
    private String coverageDescription;
    private String deductibleDescription;
    private String parentCoverageCd;
    private String itemDescription;
    private Boolean selected;

    public Long getPolicyCoverageDetailsId() {
        return policyCoverageDetailsId;
    }

    public void setPolicyCoverageDetailsId(Long policyCoverageDetailsId) {
        this.policyCoverageDetailsId = policyCoverageDetailsId;
    }

    public LocalDate getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(LocalDate effectiveDate) {
        this.effectiveDate = effectiveDate;
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

    public String getCoverageCd() {
        return coverageCd;
    }

    public void setCoverageCd(String coverageCd) {
        this.coverageCd = coverageCd;
    }

    public Long getInsurableObjectId() {
        return insurableObjectId;
    }

    public void setInsurableObjectId(Long insurableObjectId) {
        this.insurableObjectId = insurableObjectId;
    }

    public Long getInsurableObjectRef() {
        return insurableObjectRef;
    }

    public void setInsurableObjectRef(Long insurableObjectRef) {
        this.insurableObjectRef = insurableObjectRef;
    }

    public String getCoverageLayerCd() {
        return coverageLayerCd;
    }

    public void setCoverageLayerCd(String coverageLayerCd) {
        this.coverageLayerCd = coverageLayerCd;
    }

    public String getCoverageName() {
        return coverageName;
    }

    public void setCoverageName(String coverageName) {
        this.coverageName = coverageName;
    }

    public Float getSumInsured() {
        return sumInsured;
    }

    public void setSumInsured(Float sumInsured) {
        this.sumInsured = sumInsured;
    }

    public String getSumInsuredBasis() {
        return sumInsuredBasis;
    }

    public void setSumInsuredBasis(String sumInsuredBasis) {
        this.sumInsuredBasis = sumInsuredBasis;
    }

    public Float getDeductible() {
        return deductible;
    }

    public void setDeductible(Float deductible) {
        this.deductible = deductible;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getCoverageDescription() {
        return coverageDescription;
    }

    public void setCoverageDescription(String coverageDescription) {
        this.coverageDescription = coverageDescription;
    }

    public String getDeductibleDescription() {
        return deductibleDescription;
    }

    public void setDeductibleDescription(String deductibleDescription) {
        this.deductibleDescription = deductibleDescription;
    }

    public String getParentCoverageCd() {
        return parentCoverageCd;
    }

    public void setParentCoverageCd(String parentCoverageCd) {
        this.parentCoverageCd = parentCoverageCd;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public String getCoverageApplyCd() {
        return coverageApplyCd;
    }

    public void setCoverageApplyCd(String coverageApplyCd) {
        this.coverageApplyCd = coverageApplyCd;
    }

    public List<PolicyLimit> getPolicyLimits() {
        return policyLimits;
    }

    public void setPolicyLimits(List<PolicyLimit> policyLimits) {
        this.policyLimits = policyLimits;
    }

    public Boolean getSelected() {
        return selected;
    }

    public void setSelected(Boolean selected) {
        this.selected = selected;
    }
}
