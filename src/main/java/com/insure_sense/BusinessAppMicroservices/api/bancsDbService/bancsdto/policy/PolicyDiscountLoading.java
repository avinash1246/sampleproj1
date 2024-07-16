package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.bancsdto.policy;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
public class PolicyDiscountLoading {

    private String discountLoadingType;
    private Long discountRate;
    private String loadingRate;
    private String discountLoadingReason;
    private String autoManualDiscountLoading;

    public String getDiscountLoadingType() {
        return discountLoadingType;
    }

    public void setDiscountLoadingType(String discountLoadingType) {
        this.discountLoadingType = discountLoadingType;
    }

    public Long getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(Long discountRate) {
        this.discountRate = discountRate;
    }

    public String getLoadingRate() {
        return loadingRate;
    }

    public void setLoadingRate(String loadingRate) {
        this.loadingRate = loadingRate;
    }

    public String getDiscountLoadingReason() {
        return discountLoadingReason;
    }

    public void setDiscountLoadingReason(String discountLoadingReason) {
        this.discountLoadingReason = discountLoadingReason;
    }

    public String getAutoManualDiscountLoading() {
        return autoManualDiscountLoading;
    }

    public void setAutoManualDiscountLoading(String autoManualDiscountLoading) {
        this.autoManualDiscountLoading = autoManualDiscountLoading;
    }
}
