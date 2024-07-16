package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.salesDto;

import lombok.NoArgsConstructor;


import org.hibernate.search.mapper.pojo.mapping.definition.annotation.Indexed;

import java.time.LocalDate;


@NoArgsConstructor
@Indexed
public class WorkersClassificationRateMaster extends BaseEntity {

    public WorkersClassificationRateMaster(Long workersRiskBaseRateId, String workersCd, String industryCd, String businessDesc,
                                 Double rate1, Double rate2, LocalDate effectiveDate, LocalDate expiryDate) {
        this.workersRiskBaseRateId = workersRiskBaseRateId;
        this.workersCd = workersCd;
        this.industryCd = industryCd;
        this.businessDesc = businessDesc;
        this.rate1 = rate1;
        this.rate2 = rate2;
        this.effectiveDate = effectiveDate;
        this.expiryDate = expiryDate;
    }

    private Long workersRiskBaseRateId;

    private String workersCd;

    private String industryCd;

    private String businessDesc;

    private Double rate1;

    private Double rate2;

    private LocalDate effectiveDate;

    private LocalDate expiryDate;

    public Long getWorkersRiskBaseRateId() {
        return workersRiskBaseRateId;
    }

    public void setWorkersRiskBaseRateId(Long workersRiskBaseRateId) {
        this.workersRiskBaseRateId = workersRiskBaseRateId;
    }

    public String getWorkersCd() {
        return workersCd;
    }

    public void setWorkersCd(String workersCd) {
        this.workersCd = workersCd;
    }

    public String getIndustryCd() {
        return industryCd;
    }

    public void setIndustryCd(String industryCd) {
        this.industryCd = industryCd;
    }

    public String getBusinessDesc() {
        return businessDesc;
    }

    public void setBusinessDesc(String businessDesc) {
        this.businessDesc = businessDesc;
    }

    public Double getRate1() {
        return rate1;
    }

    public void setRate1(Double rate1) {
        this.rate1 = rate1;
    }

    public Double getRate2() {
        return rate2;
    }

    public void setRate2(Double rate2) {
        this.rate2 = rate2;
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
