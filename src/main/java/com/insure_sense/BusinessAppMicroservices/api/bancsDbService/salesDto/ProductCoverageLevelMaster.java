package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.salesDto;


import lombok.AllArgsConstructor;


@AllArgsConstructor
public class ProductCoverageLevelMaster extends BaseEntity {

    public ProductCoverageLevelMaster() {
    }

    public ProductCoverageLevelMaster(Long productCoverageLevelMasterId, String productCd, String coverageCd, String planCd,
                                      String limitTypeCd, String limitCategoryCd, Float sumInsuredFrom, Float sumInsuredTo, Float limitValue) {
        this.productCoverageLevelMasterId = productCoverageLevelMasterId;
        this.productCd = productCd;
        this.coverageCd = coverageCd;
        this.planCd = planCd;
        this.limitTypeCd = limitTypeCd;
        this.limitCategoryCd = limitCategoryCd;
        this.sumInsuredFrom = sumInsuredFrom;
        this.sumInsuredTo = sumInsuredTo;
        this.limitValue = limitValue;
    }


    Long productCoverageLevelMasterId;
    String productCd;
    String planCd;
    String coverageCd;
    String limitTypeCd;
    String limitCategoryCd;
    Float sumInsuredFrom;
    Float sumInsuredTo;
    String currency;
    Float limitValue;
    Long orderOfAppearance;


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

    public Long getProductCoverageLevelMasterId() {
        return productCoverageLevelMasterId;
    }

    public void setProductCoverageLevelMasterId(Long productCoverageLevelMasterId) {
        this.productCoverageLevelMasterId = productCoverageLevelMasterId;
    }

    public String getPlanCd() {
        return planCd;
    }

    public void setPlanCd(String planCd) {
        this.planCd = planCd;
    }

    public String getLimitTypeCd() {
        return limitTypeCd;
    }

    public void setLimitTypeCd(String limitTypeCd) {
        this.limitTypeCd = limitTypeCd;
    }

    public String getLimitCategoryCd() {
        return limitCategoryCd;
    }

    public void setLimitCategoryCd(String limitCategoryCd) {
        this.limitCategoryCd = limitCategoryCd;
    }

    public Float getSumInsuredFrom() {
        return sumInsuredFrom;
    }

    public void setSumInsuredFrom(Float sumInsuredFrom) {
        this.sumInsuredFrom = sumInsuredFrom;
    }

    public Float getSumInsuredTo() {
        return sumInsuredTo;
    }

    public void setSumInsuredTo(Float sumInsuredTo) {
        this.sumInsuredTo = sumInsuredTo;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Float getLimitValue() {
        return limitValue;
    }

    public void setLimitValue(Float limitValue) {
        this.limitValue = limitValue;
    }

    public Long getOrderOfAppearance() {
        return orderOfAppearance;
    }

    public void setOrderOfAppearance(Long orderOfAppearance) {
        this.orderOfAppearance = orderOfAppearance;
    }
}
