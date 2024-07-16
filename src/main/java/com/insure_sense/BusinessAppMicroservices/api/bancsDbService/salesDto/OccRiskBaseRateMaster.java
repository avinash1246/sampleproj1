package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.salesDto;

import lombok.NoArgsConstructor;


import java.time.LocalDate;


@NoArgsConstructor
public class OccRiskBaseRateMaster extends BaseEntity {

    public OccRiskBaseRateMaster(Long occRiskBaseRateId, String occCd, String perilCd,
                                 Double rate, LocalDate effectiveDate, LocalDate expiryDate) {
        this.occRiskBaseRateId = occRiskBaseRateId;
        this.occCd = occCd;
        this.perilCd = perilCd;
        this.rate = rate;
        this.effectiveDate = effectiveDate;
        this.expiryDate = expiryDate;
    }


    private Long occRiskBaseRateId;

    private String occCd;

    private String perilCd;

    private Double rate;

    private LocalDate effectiveDate;

    private LocalDate expiryDate;


    public Long getOccRiskBaseRateId() {
        return occRiskBaseRateId;
    }

    public void setOccRiskBaseRateId(Long occRiskBaseRateId) {
        this.occRiskBaseRateId = occRiskBaseRateId;
    }

    public String getOccCd() {
        return occCd;
    }

    public void setOccCd(String occCd) {
        this.occCd = occCd;
    }

    public String getPerilCd() {
        return perilCd;
    }

    public void setPerilCd(String perilCd) {
        this.perilCd = perilCd;
    }

    public Double getRate() {
        return rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
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
