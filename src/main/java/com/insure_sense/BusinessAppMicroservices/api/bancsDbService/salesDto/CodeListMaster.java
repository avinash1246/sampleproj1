package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.salesDto;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class CodeListMaster extends BaseEntity {

    public CodeListMaster(String codeListCd, String codeListValue, String codeListName, String codeListValueDesc) {
        this.codeListCd = codeListCd;
        this.codeListValue = codeListValue;
        this.codeListName = codeListName;
        this.codeListValueDesc = codeListValueDesc;
    }


    private String codeListCd;


    private String codeListValue;

    private String codeListName;

    private String codeListValueDesc;

    private Integer orderOfAppearance;

    public String getCodeListCd() {
        return codeListCd;
    }

    public void setCodeListCd(String codeListCd) {
        this.codeListCd = codeListCd;
    }

    public String getCodeListName() {
        return codeListName;
    }

    public void setCodeListName(String codeListName) {
        this.codeListName = codeListName;
    }

    public String getCodeListValue() {
        return codeListValue;
    }

    public void setCodeListValue(String codeListValue) {
        this.codeListValue = codeListValue;
    }

    public String getCodeListValueDesc() {
        return codeListValueDesc;
    }

    public void setCodeListValueDesc(String codeListValueDesc) {
        this.codeListValueDesc = codeListValueDesc;
    }

    public Integer getOrderOfAppearance() {
        return orderOfAppearance;
    }

    public void setOrderOfAppearance(Integer orderOfAppearance) {
        this.orderOfAppearance = orderOfAppearance;
    }
}
