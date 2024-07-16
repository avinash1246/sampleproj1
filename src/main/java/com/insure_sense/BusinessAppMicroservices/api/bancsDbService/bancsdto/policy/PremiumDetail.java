package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.bancsdto.policy;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
public class PremiumDetail {

    private Double basePremium;
    private Double loadingAmount;
    private Double discountAmount;
    private Double grossPremium;
    private Double taxAmount;
    private Double cGSTAmount;
    private Double sGSTAmount;
    private Double iGSTAmount;
    private Double uTGSTAmount;
    private Double netPremium;

    public Double getBasePremium() {
        return basePremium;
    }

    public void setBasePremium(Double basePremium) {
        this.basePremium = basePremium;
    }

    public Double getLoadingAmount() {
        return loadingAmount;
    }

    public void setLoadingAmount(Double loadingAmount) {
        this.loadingAmount = loadingAmount;
    }

    public Double getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(Double discountAmount) {
        this.discountAmount = discountAmount;
    }

    public Double getGrossPremium() {
        return grossPremium;
    }

    public void setGrossPremium(Double grossPremium) {
        this.grossPremium = grossPremium;
    }

    public Double getTaxAmount() {
        return taxAmount;
    }

    public void setTaxAmount(Double taxAmount) {
        this.taxAmount = taxAmount;
    }

    public Double getcGSTAmount() {
        return cGSTAmount;
    }

    public void setcGSTAmount(Double cGSTAmount) {
        this.cGSTAmount = cGSTAmount;
    }

    public Double getsGSTAmount() {
        return sGSTAmount;
    }

    public void setsGSTAmount(Double sGSTAmount) {
        this.sGSTAmount = sGSTAmount;
    }

    public Double getiGSTAmount() {
        return iGSTAmount;
    }

    public void setiGSTAmount(Double iGSTAmount) {
        this.iGSTAmount = iGSTAmount;
    }

    public Double getuTGSTAmount() {
        return uTGSTAmount;
    }

    public void setuTGSTAmount(Double uTGSTAmount) {
        this.uTGSTAmount = uTGSTAmount;
    }

    public Double getNetPremium() {
        return netPremium;
    }

    public void setNetPremium(Double netPremium) {
        this.netPremium = netPremium;
    }
}
