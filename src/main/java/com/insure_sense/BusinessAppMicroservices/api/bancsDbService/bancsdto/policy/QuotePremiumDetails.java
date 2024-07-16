package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.bancsdto.policy;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;



@NoArgsConstructor
@AllArgsConstructor
public class QuotePremiumDetails {

    private Double basePremium;
    private Double discount;
    private Double premiumAfterDiscount;
    private Double loading;
    private Double premiumAfterLoading;
    private Double tax;
    private Double premiumAfterTax;
    private List<TenureOption> tenureOptions;

    public Double getBasePremium() {
        return basePremium;
    }

    public void setBasePremium(Double basePremium) {
        this.basePremium = basePremium;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public Double getPremiumAfterDiscount() {
        return premiumAfterDiscount;
    }

    public void setPremiumAfterDiscount(Double premiumAfterDiscount) {
        this.premiumAfterDiscount = premiumAfterDiscount;
    }

    public Double getLoading() {
        return loading;
    }

    public void setLoading(Double loading) {
        this.loading = loading;
    }

    public Double getPremiumAfterLoading() {
        return premiumAfterLoading;
    }

    public void setPremiumAfterLoading(Double premiumAfterLoading) {
        this.premiumAfterLoading = premiumAfterLoading;
    }

    public Double getTax() {
        return tax;
    }

    public void setTax(Double tax) {
        this.tax = tax;
    }

    public Double getPremiumAfterTax() {
        return premiumAfterTax;
    }

    public void setPremiumAfterTax(Double premiumAfterTax) {
        this.premiumAfterTax = premiumAfterTax;
    }

    public List<TenureOption> getTenureOptions() {
        return tenureOptions;
    }

    public void setTenureOptions(List<TenureOption> tenureOptions) {
        this.tenureOptions = tenureOptions;
    }
}
