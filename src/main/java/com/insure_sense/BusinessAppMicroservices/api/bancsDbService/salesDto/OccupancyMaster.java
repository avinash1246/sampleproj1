package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.salesDto;

import lombok.NoArgsConstructor;



import org.hibernate.search.engine.backend.types.Projectable;
import org.hibernate.search.engine.backend.types.Searchable;
import org.hibernate.search.engine.backend.types.Sortable;
import org.hibernate.search.mapper.pojo.mapping.definition.annotation.FullTextField;
import org.hibernate.search.mapper.pojo.mapping.definition.annotation.GenericField;
import org.hibernate.search.mapper.pojo.mapping.definition.annotation.Indexed;
import org.hibernate.search.mapper.pojo.mapping.definition.annotation.KeywordField;

import java.time.LocalDate;


@NoArgsConstructor
@Indexed
public class OccupancyMaster extends BaseEntity {

    public OccupancyMaster(Long occMasterId, String occCd, String occTypeCd,
                           String occDescription, Float maxSumInsured,
                           LocalDate effectiveDate, LocalDate expiryDate) {
        this.occMasterId = occMasterId;
        this.occCd = occCd;
        this.occTypeCd = occTypeCd;
        this.occDescription = occDescription;
        this.maxSumInsured = maxSumInsured;
        this.effectiveDate = effectiveDate;
        this.expiryDate = expiryDate;
    }


    private Long occMasterId;

    private String occCd;

    private String occTypeCd;


    @FullTextField
    private String occDescription;

    private Float maxSumInsured;

    private LocalDate effectiveDate;

    private LocalDate expiryDate;

    public Long getOccMasterId() {
        return occMasterId;
    }

    public void setOccMasterId(Long occMasterId) {
        this.occMasterId = occMasterId;
    }

    public String getOccCd() {
        return occCd;
    }

    public void setOccCd(String occCd) {
        this.occCd = occCd;
    }

    public String getOccTypeCd() {
        return occTypeCd;
    }

    public void setOccTypeCd(String occTypeCd) {
        this.occTypeCd = occTypeCd;
    }

    public String getOccDescription() {
        return occDescription;
    }

    public void setOccDescription(String occDescription) {
        this.occDescription = occDescription;
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

    public Float getMaxSumInsured() {
        return maxSumInsured;
    }

    public void setMaxSumInsured(Float maxSumInsured) {
        this.maxSumInsured = maxSumInsured;
    }
}

