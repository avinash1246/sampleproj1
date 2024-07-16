package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.salesDto;


import lombok.NoArgsConstructor;

import java.time.LocalDate;


@NoArgsConstructor
public class HealthLocationRiskMaster extends BaseEntity {

    public HealthLocationRiskMaster(Long healthLocationRiskId, Integer pinCd, Double locRate,
                                    LocalDate effectiveDate, LocalDate expiryDate) {
        this.healthLocationRiskId = healthLocationRiskId;
        this.pinCd = pinCd;
        this.locRate = locRate;
        this.effectiveDate = effectiveDate;
        this.expiryDate = expiryDate;
    }


    private Long healthLocationRiskId;
    private Integer pinCd;

    private Double locRate;

    private LocalDate effectiveDate;

    private LocalDate expiryDate;

    public Long getHealthLocationRiskId() {
        return healthLocationRiskId;
    }

    public void setHealthLocationRiskId(Long healthLocationRiskId) {
        this.healthLocationRiskId = healthLocationRiskId;
    }

    public Double getLocRate() {
        return locRate;
    }

    public void setLocRate(Double locRate) {
        this.locRate = locRate;
    }

    public Integer getPinCd() {
        return pinCd;
    }

    public void setPinCd(Integer pinCd) {
        this.pinCd = pinCd;
    }


    public LocalDate getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(LocalDate effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(LocalDate expiryDate) {
        this.expiryDate = expiryDate;
    }
}
