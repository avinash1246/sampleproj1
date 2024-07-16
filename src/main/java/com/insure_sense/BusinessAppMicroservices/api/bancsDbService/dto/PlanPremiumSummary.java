package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.dto;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class PlanPremiumSummary {

    public PlanPremiumSummary(Long planRateMasterId, String sumInsuredCd, String familyTypeCd, Double planRate) {
        this.planRateMasterId = planRateMasterId;
        this.sumInsuredCd = sumInsuredCd;
        this.familyTypeCd = familyTypeCd;
        this.planRate = planRate;
    }

    public PlanPremiumSummary(Long planRateMasterId) {
        this.planRateMasterId = planRateMasterId;
    }

    private Long planRateMasterId;

    private String sumInsuredCd;

    private String familyTypeCd;

    private String cvgGrpCd;

    private Double planRate;

    private Double employeeShare;

    private Double employerShare;

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

    public String getCvgGrpCd() {
        return cvgGrpCd;
    }

    public void setCvgGrpCd(String cvgGrpCd) {
        this.cvgGrpCd = cvgGrpCd;
    }

    public Double getPlanRate() {
        return planRate;
    }

    public void setPlanRate(Double planRate) {
        this.planRate = planRate;
    }

    public Double getEmployeeShare() {
        return employeeShare;
    }

    public void setEmployeeShare(Double employeeShare) {
        this.employeeShare = employeeShare;
    }

    public Double getEmployerShare() {
        return employerShare;
    }

    public void setEmployerShare(Double employerShare) {
        this.employerShare = employerShare;
    }
}
