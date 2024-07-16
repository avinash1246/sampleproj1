package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.salesDto;

import lombok.NoArgsConstructor;



import org.hibernate.search.mapper.pojo.mapping.definition.annotation.Indexed;

import java.time.LocalDate;


@NoArgsConstructor
@Indexed
public class WorkersSicMaster extends BaseEntity{

    public WorkersSicMaster(Long riskId, Long sicCd, String sicMapped, String riskClass,
                            LocalDate effectiveDate, LocalDate expiryDate, Integer orderOfAppearance) {
        this.riskId = riskId;
        this.sicCd = sicCd;
        this.sicMapped = sicMapped;
        this.riskClass = riskClass;
        this.effectiveDate = effectiveDate;
        this.expiryDate = expiryDate;
        this.orderOfAppearance = orderOfAppearance;
    }


    private Long riskId;

    private Long sicCd;

    private String sicMapped;

    private String riskClass;

    private LocalDate effectiveDate;

    private LocalDate expiryDate;

    private Integer orderOfAppearance;

    public Long getRiskId() {
        return riskId;
    }

    public void setRiskId(Long riskId) {
        this.riskId = riskId;
    }

    public Long getSicCd() {
        return sicCd;
    }

    public void setSicCd(Long sicCd) {
        this.sicCd = sicCd;
    }

    public String getSicMapped() {
        return sicMapped;
    }

    public void setSicMapped(String sicMapped) {
        this.sicMapped = sicMapped;
    }

    public String getRiskClass() {
        return riskClass;
    }

    public void setRiskClass(String riskClass) {
        this.riskClass = riskClass;
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

    public Integer getOrderOfAppearance() {
        return orderOfAppearance;
    }

    public void setOrderOfAppearance(Integer orderOfAppearance) {
        this.orderOfAppearance = orderOfAppearance;
    }
}
