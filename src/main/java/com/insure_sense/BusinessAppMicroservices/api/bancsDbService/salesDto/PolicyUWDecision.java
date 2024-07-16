package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.salesDto;

import com.fasterxml.jackson.annotation.JsonIgnore;




public class PolicyUWDecision extends BaseEntity {

  public PolicyUWDecision() {
  }

    public PolicyUWDecision(Long policyId, String uwDecisionType, String uwDecisionCd,
                            String uwDecisionRemarks, Float uwDecisionValue,
                            Double uwDecisionPremium, Double expectedPremium) {
        this.policyId = policyId;
        this.uwDecisionType = uwDecisionType;
        this.uwDecisionCd = uwDecisionCd;
        this.uwDecisionRemarks = uwDecisionRemarks;
        this.uwDecisionValue = uwDecisionValue;
        this.uwDecisionPremium = uwDecisionPremium;
        this.expectedPremium = expectedPremium;
    }


  private Long policyId;

  private String uwDecisionType;
  private String uwDecisionCd;
  private String uwDecisionRemarks;
  private Float uwDecisionValue;
  private Double uwDecisionPremium;
  private Double expectedPremium;

  @JsonIgnore
  private PolicyExt policyExt;

  public Long getPolicyId() {
    return policyId;
  }

  public void setPolicyId(Long policyId) {
    this.policyId = policyId;
  }

  public String getUwDecisionType() {
    return uwDecisionType;
  }

  public void setUwDecisionType(String uwDecisionType) {
    this.uwDecisionType = uwDecisionType;
  }

  public String getUwDecisionCd() {
    return uwDecisionCd;
  }

  public void setUwDecisionCd(String uwDecisionCd) {
    this.uwDecisionCd = uwDecisionCd;
  }

  public String getUwDecisionRemarks() {
    return uwDecisionRemarks;
  }

  public void setUwDecisionRemarks(String uwDecisionRemarks) {
    this.uwDecisionRemarks = uwDecisionRemarks;
  }

  public Float getUwDecisionValue() {
    return uwDecisionValue;
  }

  public void setUwDecisionValue(Float uwDecisionValue) {
    this.uwDecisionValue = uwDecisionValue;
  }

    public Double getUwDecisionPremium() {
        return uwDecisionPremium;
    }

    public void setUwDecisionPremium(Double uwDecisionPremium) {
        this.uwDecisionPremium = uwDecisionPremium;
    }

    public Double getExpectedPremium() {
        return expectedPremium;
    }

    public void setExpectedPremium(Double expectedPremium) {
        this.expectedPremium = expectedPremium;
    }
}
