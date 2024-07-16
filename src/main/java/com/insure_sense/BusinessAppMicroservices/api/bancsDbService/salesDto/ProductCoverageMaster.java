package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.salesDto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


import java.time.LocalDate;


@NoArgsConstructor
public class ProductCoverageMaster extends BaseEntity {

    public ProductCoverageMaster(String productCd, String coverageCd, String planCd, String coverageApplyCd, String coveragePartCd, Float defaultSumInsured, String defaultSumInsuredBasis, Float defaultDeductible, LocalDate expirationDate, String coverageDescription, String parentCoverageCd, String limitCodeListCd, Integer orderOfAppearance) {
        this.productCd = productCd;
        this.coverageCd = coverageCd;
        this.planCd = planCd;
        this.coverageApplyCd = coverageApplyCd;
        this.coveragePartCd = coveragePartCd;
        this.defaultSumInsured = defaultSumInsured;
        this.defaultSumInsuredBasis = defaultSumInsuredBasis;
        this.defaultDeductible = defaultDeductible;
        this.expirationDate = expirationDate;
        this.coverageDescription = coverageDescription;
        this.parentCoverageCd = parentCoverageCd;
        this.limitCodeListCd = limitCodeListCd;
        this.orderOfAppearance = orderOfAppearance;
    }

    private String productCd;


    private String coverageCd;

    private String planCd;

    private String coverageApplyCd;
    private String coveragePartCd;
    private Float defaultSumInsured;
    private String defaultSumInsuredBasis;
    private Float defaultDeductible;
    private LocalDate expirationDate;
    private String coverageDescription;
    private String parentCoverageCd;
    private String limitCodeListCd;
    private Integer orderOfAppearance;

    public String getProductCd() {
        return productCd;
    }

    public void setProductCd(String productCd) {
        this.productCd = productCd;
    }

    public String getCoverageCd() {
        return coverageCd;
    }

    public void setCoverageCd(String coverageCd) {
        this.coverageCd = coverageCd;
    }

    public String getPlanCd() {
        return planCd;
    }

    public void setPlanCd(String planCd) {
        this.planCd = planCd;
    }

    public String getCoverageApplyCd() {
        return coverageApplyCd;
    }

    public void setCoverageApplyCd(String coverageApplyCd) {
        this.coverageApplyCd = coverageApplyCd;
    }

    public String getCoveragePartCd() {
        return coveragePartCd;
    }

    public void setCoveragePartCd(String coveragePartCd) {
        this.coveragePartCd = coveragePartCd;
    }

    public Float getDefaultSumInsured() {
        return defaultSumInsured;
    }

    public void setDefaultSumInsured(Float defaultSumInsured) {
        this.defaultSumInsured = defaultSumInsured;
    }

    public String getDefaultSumInsuredBasis() {
        return defaultSumInsuredBasis;
    }

    public void setDefaultSumInsuredBasis(String defaultSumInsuredBasis) {
        this.defaultSumInsuredBasis = defaultSumInsuredBasis;
    }

    public Float getDefaultDeductible() {
        return defaultDeductible;
    }

    public void setDefaultDeductible(Float defaultDeductible) {
        this.defaultDeductible = defaultDeductible;
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

    public String getParentCoverageCd() {
        return parentCoverageCd;
    }

    public void setParentCoverageCd(String parentCoverageCd) {
        this.parentCoverageCd = parentCoverageCd;
    }

    public String getLimitCodeListCd() {
        return limitCodeListCd;
    }

    public void setLimitCodeListCd(String limitCodeListCd) {
        this.limitCodeListCd = limitCodeListCd;
    }

    public Integer getOrderOfAppearance() {
        return orderOfAppearance;
    }

    public void setOrderOfAppearance(Integer orderOfAppearance) {
        this.orderOfAppearance = orderOfAppearance;
    }

}
