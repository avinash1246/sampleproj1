package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.salesDto;


import lombok.NoArgsConstructor;

import java.time.LocalDate;


@NoArgsConstructor
public class GroupPlanRateMaster extends BaseEntity {

    public GroupPlanRateMaster(Long planRateMasterId, String sumInsuredCd, String familyTypeCd, Double planRate,
                               LocalDate effectiveDate, LocalDate expiryDate) {
        this.planRateMasterId = planRateMasterId;
        this.sumInsuredCd = sumInsuredCd;
        this.familyTypeCd = familyTypeCd;
        this.planRate = planRate;
        this.effectiveDate = effectiveDate;
        this.expiryDate = expiryDate;
    }


    private Long planRateMasterId;

    private String sumInsuredCd;

    private String familyTypeCd;

    private Double planRate;

    private LocalDate effectiveDate;

    private LocalDate expiryDate;

    public Long getPlanRateMasterId() {
        return planRateMasterId;
    }

    public void setPlanRateMasterId(Long planRateMasterId) {
        this.planRateMasterId = planRateMasterId;
    }

    public String getSumInsuredCd() {
        return sumInsuredCd;
    }

    public void setSumInsuredCd(String sumInsuredCd) {
        this.sumInsuredCd = sumInsuredCd;
    }

    public String getFamilyTypeCd() {
        return familyTypeCd;
    }

    public void setFamilyTypeCd(String familyTypeCd) {
        this.familyTypeCd = familyTypeCd;
    }

    public Double getPlanRate() {
        return planRate;
    }

    public void setPlanRate(Double planRate) {
        this.planRate = planRate;
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
