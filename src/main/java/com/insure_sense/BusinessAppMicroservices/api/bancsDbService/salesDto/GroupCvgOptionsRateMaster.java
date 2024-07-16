package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.salesDto;


import lombok.NoArgsConstructor;

import java.time.LocalDate;


@NoArgsConstructor
public class GroupCvgOptionsRateMaster extends BaseEntity {

    public GroupCvgOptionsRateMaster(Long cvgOptRateMasterId, String cvgGrpCd, String sumInsuredCd,
                                     Double cvgGrpRate, LocalDate effectiveDate, LocalDate expiryDate,
                                     Integer orderOfAppearance) {
        this.cvgOptRateMasterId = cvgOptRateMasterId;
        this.cvgGrpCd = cvgGrpCd;
        this.sumInsuredCd = sumInsuredCd;
        this.cvgGrpRate = cvgGrpRate;
        this.effectiveDate = effectiveDate;
        this.expiryDate = expiryDate;
        this.orderOfAppearance = orderOfAppearance;
    }


    private Long cvgOptRateMasterId;

    private String cvgGrpCd;

    private String sumInsuredCd;
    private Double cvgGrpRate;

    private Integer orderOfAppearance;

    public Long getCvgOptRateMasterId() {
        return cvgOptRateMasterId;
    }

    public void setCvgOptRateMasterId(Long cvgOptRateMasterId) {
        this.cvgOptRateMasterId = cvgOptRateMasterId;
    }

    public String getCvgGrpCd() {
        return cvgGrpCd;
    }

    public void setCvgGrpCd(String cvgGrpCd) {
        this.cvgGrpCd = cvgGrpCd;
    }

    public String getSumInsuredCd() {
        return sumInsuredCd;
    }

    public void setSumInsuredCd(String sumInsuredCd) {
        this.sumInsuredCd = sumInsuredCd;
    }

    public Double getCvgGrpRate() {
        return cvgGrpRate;
    }

    public void setCvgGrpRate(Double cvgGrpRate) {
        this.cvgGrpRate = cvgGrpRate;
    }

    private LocalDate effectiveDate;

    private LocalDate expiryDate;


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
