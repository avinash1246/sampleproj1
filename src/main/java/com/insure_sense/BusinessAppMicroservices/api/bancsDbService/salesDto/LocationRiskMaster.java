package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.salesDto;

import lombok.NoArgsConstructor;


import java.time.LocalDate;


@NoArgsConstructor
public class LocationRiskMaster extends BaseEntity {

    public LocationRiskMaster(Long locationRiskId, Integer pinCd, Double nonManufRate,
                              Double manufRate, String occTypeCd, Double occRate,
                              LocalDate effectiveDate, LocalDate expiryDate) {
        this.locationRiskId = locationRiskId;
        this.pinCd = pinCd;
        this.nonManufRate = nonManufRate;
        this.manufRate = manufRate;
        this.occTypeCd = occTypeCd;
        this.occRate = occRate;
        this.effectiveDate = effectiveDate;
        this.expiryDate = expiryDate;
    }


    private Long locationRiskId;

    private Integer pinCd;

    private Double nonManufRate;

    private Double manufRate;

    private String occTypeCd;

    private Double occRate;

    private LocalDate effectiveDate;

    private LocalDate expiryDate;

    public Long getLocationRiskId() {
        return locationRiskId;
    }

    public void setLocationRiskId(Long locationRiskId) {
        this.locationRiskId = locationRiskId;
    }

    public Integer getPinCd() {
        return pinCd;
    }

    public void setPinCd(Integer pinCd) {
        this.pinCd = pinCd;
    }

    public Double getNonManufRate() {
        return nonManufRate;
    }

    public void setNonManufRate(Double nonManufRate) {
        this.nonManufRate = nonManufRate;
    }

    public Double getManufRate() {
        return manufRate;
    }

    public void setManufRate(Double manufRate) {
        this.manufRate = manufRate;
    }

    public String getOccTypeCd() {
        return occTypeCd;
    }

    public void setOccTypeCd(String occTypeCd) {
        this.occTypeCd = occTypeCd;
    }

    public Double getOccRate() {
        return occRate;
    }

    public void setOccRate(Double occRate) {
        this.occRate = occRate;
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
