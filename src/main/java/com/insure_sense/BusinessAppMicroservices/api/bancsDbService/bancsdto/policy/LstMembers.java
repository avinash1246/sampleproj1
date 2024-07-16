package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.bancsdto.policy;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@NoArgsConstructor
@AllArgsConstructor
public class LstMembers {

    private String riskinceptiondate;
    private List<PremiumProperty> property;
    private String policyriskexpirydate;
    private String risklevelpremium;
    private List<CoverPremium> cover;
    private String memberstatus;
    private String remarks;
    private String membersubstatus;
    private String loadingvalue;
    private String loadingpercentage;
    private String policyriskid;
    private String discountload;
    private String medicaltest;
    private String multisetobject;
    private String memberlistindicator;

    public String getRiskinceptiondate() {
        return riskinceptiondate;
    }

    public void setRiskinceptiondate(String riskinceptiondate) {
        this.riskinceptiondate = riskinceptiondate;
    }

    public List<PremiumProperty> getProperty() {
        return property;
    }

    public void setProperty(List<PremiumProperty> property) {
        this.property = property;
    }

    public String getPolicyriskexpirydate() {
        return policyriskexpirydate;
    }

    public void setPolicyriskexpirydate(String policyriskexpirydate) {
        this.policyriskexpirydate = policyriskexpirydate;
    }

    public String getRisklevelpremium() {
        return risklevelpremium;
    }

    public void setRisklevelpremium(String risklevelpremium) {
        this.risklevelpremium = risklevelpremium;
    }

    public List<CoverPremium> getCover() {
        return cover;
    }

    public void setCover(List<CoverPremium> cover) {
        this.cover = cover;
    }

    public String getMemberstatus() {
        return memberstatus;
    }

    public void setMemberstatus(String memberstatus) {
        this.memberstatus = memberstatus;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getMembersubstatus() {
        return membersubstatus;
    }

    public void setMembersubstatus(String membersubstatus) {
        this.membersubstatus = membersubstatus;
    }

    public String getLoadingvalue() {
        return loadingvalue;
    }

    public void setLoadingvalue(String loadingvalue) {
        this.loadingvalue = loadingvalue;
    }

    public String getLoadingpercentage() {
        return loadingpercentage;
    }

    public void setLoadingpercentage(String loadingpercentage) {
        this.loadingpercentage = loadingpercentage;
    }

    public String getPolicyriskid() {
        return policyriskid;
    }

    public void setPolicyriskid(String policyriskid) {
        this.policyriskid = policyriskid;
    }

    public String getDiscountload() {
        return discountload;
    }

    public void setDiscountload(String discountload) {
        this.discountload = discountload;
    }

    public String getMedicaltest() {
        return medicaltest;
    }

    public void setMedicaltest(String medicaltest) {
        this.medicaltest = medicaltest;
    }

    public String getMultisetobject() {
        return multisetobject;
    }

    public void setMultisetobject(String multisetobject) {
        this.multisetobject = multisetobject;
    }

    public String getMemberlistindicator() {
        return memberlistindicator;
    }

    public void setMemberlistindicator(String memberlistindicator) {
        this.memberlistindicator = memberlistindicator;
    }
}
