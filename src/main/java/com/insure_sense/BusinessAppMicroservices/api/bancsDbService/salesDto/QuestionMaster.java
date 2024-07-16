package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.salesDto;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class QuestionMaster extends BaseEntity {

    public QuestionMaster(String questionCd, String qtext, String qtype, String codeListCd,
                          String[] defaultQresponseDropdown, String defaultQresponseRadio) {
        this.questionCd = questionCd;
        this.qtext = qtext;
        this.qtype = qtype;
        this.codeListCd = codeListCd;
        this.defaultQresponseDropdown = defaultQresponseDropdown;
        this.defaultQresponseRadio = defaultQresponseRadio;
    }

    private String questionCd;

    private String qtext;
    private String qtype;
    private String codeListCd;

    private String[] defaultQresponseDropdown;
    private String defaultQresponseRadio;

    private Integer orderOfAppearance;

    public String getQuestionCd() {
        return questionCd;
    }

    public void setQuestionCd(String questionCd) {
        this.questionCd = questionCd;
    }

    public String getQtext() {
        return qtext;
    }

    public void setQtext(String qtext) {
        this.qtext = qtext;
    }

    public String getQtype() {
        return qtype;
    }

    public void setQtype(String qtype) {
        this.qtype = qtype;
    }

    public String getCodeListCd() {
        return codeListCd;
    }

    public void setCodeListCd(String codeListCd) {
        this.codeListCd = codeListCd;
    }

    public String[] getDefaultQresponseDropdown() {
        return defaultQresponseDropdown;
    }

    public void setDefaultQresponseDropdown(String[] defaultQresponseDropdown) {
        this.defaultQresponseDropdown = defaultQresponseDropdown;
    }

    public String getDefaultQresponseRadio() {
        return defaultQresponseRadio;
    }

    public void setDefaultQresponseRadio(String defaultQresponseRadio) {
        this.defaultQresponseRadio = defaultQresponseRadio;
    }

    public Integer getOrderOfAppearance() {
        return orderOfAppearance;
    }

    public void setOrderOfAppearance(Integer orderOfAppearance) {
        this.orderOfAppearance = orderOfAppearance;
    }
}
