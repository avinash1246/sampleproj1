package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.salesDto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class ProductCodeListMaster extends BaseEntity {


    private String productCd;


    private String codeListCd;

    private String codeListType;

    private Integer orderOfAppearance;

    public String getProductCd() {
        return productCd;
    }

    public void setProductCd(String productCd) {
        this.productCd = productCd;
    }

    public String getCodeListType() {
        return codeListType;
    }

    public void setCodeListType(String codeListType) {
        this.codeListType = codeListType;
    }

    public String getCodeListCd() {
        return codeListCd;
    }

    public void setCodeListCd(String codeListCd) {
        this.codeListCd = codeListCd;
    }

    public Integer getOrderOfAppearance() {
        return orderOfAppearance;
    }

    public void setOrderOfAppearance(Integer orderOfAppearance) {
        this.orderOfAppearance = orderOfAppearance;
    }
}
