package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.dto;

import lombok.Data;


public class PolicyPremiumSummary {

    public PolicyPremiumSummary() {
    }

    public PolicyPremiumSummary(Integer id, String coveragePartCd,
                                String coveragePartName,
                                Long insurableObjectRef, String ioDescription,
                                String coverType, String amountCategory,
                                Boolean isCommission,
                                Double pretaxPremium, Double cgst,
                                Double sgst, Double quotePremium) {
        this.id = id;
        this.coveragePartCd = coveragePartCd;
        this.coveragePartName = coveragePartName;
        this.insurableObjectRef = insurableObjectRef;
        this.ioDescription = ioDescription;
        this.coverType = coverType;
        this.amountCategory = amountCategory;
        this.isCommission = isCommission;
        this.pretaxPremium = pretaxPremium;
        this.cgst = cgst;
        this.sgst = sgst;
        this.quotePremium = quotePremium;
    }

    Integer id;
    String coveragePartCd;
    String coveragePartName;
    Long insurableObjectRef;
    String ioDescription;
    String coverType;
    String amountCategory;
    Boolean isCommission = false;
    Double pretaxPremium;
    Double cgst;
    Double sgst;
    Double quotePremium;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIoDescription() {
        return ioDescription;
    }

    public void setIoDescription(String ioDescription) {
        this.ioDescription = ioDescription;
    }

    public String getCoveragePartCd() {
        return coveragePartCd;
    }

    public void setCoveragePartCd(String coveragePartCd) {
        this.coveragePartCd = coveragePartCd;
    }

    public String getCoveragePartName() {
        return coveragePartName;
    }

    public void setCoveragePartName(String coveragePartName) {
        this.coveragePartName = coveragePartName;
    }

    public Long getInsurableObjectRef() {
        return insurableObjectRef;
    }

    public void setInsurableObjectRef(Long insurableObjectRef) {
        this.insurableObjectRef = insurableObjectRef;
    }

    public String getCoverType() {
        return coverType;
    }

    public void setCoverType(String coverType) {
        this.coverType = coverType;
    }

    public Double getPretaxPremium() {
        return pretaxPremium;
    }

    public void setPretaxPremium(Double pretaxPremium) {
        this.pretaxPremium = pretaxPremium;
    }

    public Double getQuotePremium() {
        return quotePremium;
    }

    public void setQuotePremium(Double quotePremium) {
        this.quotePremium = quotePremium;
    }

    public Double getCgst() {
        return cgst;
    }

    public void setCgst(Double cgst) {
        this.cgst = cgst;
    }

    public Double getSgst() {
        return sgst;
    }

    public void setSgst(Double sgst) {
        this.sgst = sgst;
    }

    public String getAmountCategory() {
        return amountCategory;
    }

    public void setAmountCategory(String amountCategory) {
        this.amountCategory = amountCategory;
    }

    public Boolean getCommission() {
        return isCommission;
    }

    public void setCommission(Boolean commission) {
        isCommission = commission;
    }
}
