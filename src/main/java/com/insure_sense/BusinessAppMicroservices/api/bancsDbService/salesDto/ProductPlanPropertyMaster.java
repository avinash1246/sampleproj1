package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.salesDto;


import lombok.NoArgsConstructor;


@NoArgsConstructor
public class ProductPlanPropertyMaster extends BaseEntity {

    public ProductPlanPropertyMaster(Long productPlanPropertyMasterId, String productCd,
                                     String planCd, String subPlanCd, String propertyName,
                                     String codeListCd, Long orderOfAppearance) {
        this.productPlanPropertyMasterId = productPlanPropertyMasterId;
        this.productCd = productCd;
        this.planCd = planCd;
        this.subPlanCd = subPlanCd;
        this.propertyName = propertyName;
        this.codeListCd = codeListCd;
        this.orderOfAppearance = orderOfAppearance;
    }


    private Long productPlanPropertyMasterId;
    private String productCd;
    private String planCd;
    private String subPlanCd;
    private String propertyName;
    private String codeListCd;
    private Long orderOfAppearance;

    public Long getProductPlanPropertyMasterId() {
        return productPlanPropertyMasterId;
    }

    public void setProductPlanPropertyMasterId(Long productPlanPropertyMasterId) {
        this.productPlanPropertyMasterId = productPlanPropertyMasterId;
    }

    public String getProductCd() {
        return productCd;
    }

    public void setProductCd(String productCd) {
        this.productCd = productCd;
    }

    public String getPlanCd() {
        return planCd;
    }

    public void setPlanCd(String planCd) {
        this.planCd = planCd;
    }

    public String getSubPlanCd() {
        return subPlanCd;
    }

    public void setSubPlanCd(String subPlanCd) {
        this.subPlanCd = subPlanCd;
    }

    public String getPropertyName() {
        return propertyName;
    }

    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }

    public String getCodeListCd() {
        return codeListCd;
    }

    public void setCodeListCd(String codeListCd) {
        this.codeListCd = codeListCd;
    }

    public Long getOrderOfAppearance() {
        return orderOfAppearance;
    }

    public void setOrderOfAppearance(Long orderOfAppearance) {
        this.orderOfAppearance = orderOfAppearance;
    }
}
