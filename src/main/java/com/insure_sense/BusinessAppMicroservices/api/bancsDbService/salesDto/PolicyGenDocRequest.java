package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.salesDto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class PolicyGenDocRequest {

  private Long policyGenDocRequestId;

  private Long policyId;

  private String businessName;
  private String companyAddress;

  @JsonFormat(pattern="dd-MM-yyyy")
  private LocalDate effectiveDate;

  @JsonFormat(pattern="dd-MM-yyyy")
  private LocalDate expiryDate;

  private Float bcPremium;
  private Float terrPremium;
  private Float addOnPremium;
  private Float bcCGST;
  private Float terrCGST;
  private Float addOnCGST;
  private Float bcSGST;
  private Float terrSGST;
  private Float addOnSGST;
  private Float bcQuotePremium;
  private Float terrQuotePremium;
  private Float addOnQuotePremium;
  private Float currentTermCommission;
  private Float netChangeCommission;
  private Float fullTermPremium;
  private Float currentTermPremium;
  private Float netChangePremium;
  private Float fullTermCGST;
  private Float currentTermCGST;
  private Float netChangeCGST;
  private Float fullTermSGST;
  private Float currentTermSGST;
  private Float netChangeSGST;

  public Long getPolicyId() {
    return policyId;
  }

  public void setPolicyId(Long policyId) {
    this.policyId = policyId;
  }

  public Long getPolicyGenDocRequestId() {
        return policyGenDocRequestId;
    }

    public void setPolicyGenDocRequestId(Long policyGenDocRequestId) {
        this.policyGenDocRequestId = policyGenDocRequestId;
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

  public Float getBcPremium() {
    return bcPremium;
  }

  public void setBcPremium(Float bcPremium) {
    this.bcPremium = bcPremium;
  }

  public Float getTerrPremium() {
    return terrPremium;
  }

  public void setTerrPremium(Float terrPremium) {
    this.terrPremium = terrPremium;
  }

  public Float getBcCGST() {
    return bcCGST;
  }

  public void setBcCGST(Float bcCGST) {
    this.bcCGST = bcCGST;
  }

  public Float getTerrCGST() {
    return terrCGST;
  }

  public void setTerrCGST(Float terrCGST) {
    this.terrCGST = terrCGST;
  }

  public Float getBcSGST() {
    return bcSGST;
  }

  public void setBcSGST(Float bcSGST) {
    this.bcSGST = bcSGST;
  }

  public Float getTerrSGST() {
    return terrSGST;
  }

  public void setTerrSGST(Float terrSGST) {
    this.terrSGST = terrSGST;
  }

  public Float getBcQuotePremium() {
    return bcQuotePremium;
  }

  public void setBcQuotePremium(Float bcQuotePremium) {
    this.bcQuotePremium = bcQuotePremium;
  }

  public Float getTerrQuotePremium() {
    return terrQuotePremium;
  }

  public void setTerrQuotePremium(Float terrQuotePremium) {
    this.terrQuotePremium = terrQuotePremium;
  }

  public String getBusinessName() {
    return businessName;
  }

  public void setBusinessName(String businessName) {
    this.businessName = businessName;
  }

  public String getCompanyAddress() {
    return companyAddress;
  }

  public void setCompanyAddress(String companyAddress) {
    this.companyAddress = companyAddress;
  }

    public Float getAddOnPremium() {
        return addOnPremium;
    }

    public void setAddOnPremium(Float addOnPremium) {
        this.addOnPremium = addOnPremium;
    }

    public Float getAddOnCGST() {
        return addOnCGST;
    }

    public void setAddOnCGST(Float addOnCGST) {
        this.addOnCGST = addOnCGST;
    }

    public Float getAddOnSGST() {
        return addOnSGST;
    }

    public void setAddOnSGST(Float addOnSGST) {
        this.addOnSGST = addOnSGST;
    }

    public Float getAddOnQuotePremium() {
        return addOnQuotePremium;
    }

    public void setAddOnQuotePremium(Float addOnQuotePremium) {
        this.addOnQuotePremium = addOnQuotePremium;
    }

    public Float getCurrentTermCommission() {
        return currentTermCommission;
    }

    public void setCurrentTermCommission(Float currentTermCommission) {
        this.currentTermCommission = currentTermCommission;
    }

    public Float getNetChangeCommission() {
        return netChangeCommission;
    }

    public void setNetChangeCommission(Float netChangeCommission) {
        this.netChangeCommission = netChangeCommission;
    }

    public Float getCurrentTermPremium() {
        return currentTermPremium;
    }

    public void setCurrentTermPremium(Float currentTermPremium) {
        this.currentTermPremium = currentTermPremium;
    }

    public Float getNetChangePremium() {
        return netChangePremium;
    }

    public void setNetChangePremium(Float netChangePremium) {
        this.netChangePremium = netChangePremium;
    }

    public Float getCurrentTermCGST() {
        return currentTermCGST;
    }

    public void setCurrentTermCGST(Float currentTermCGST) {
        this.currentTermCGST = currentTermCGST;
    }

    public Float getNetChangeCGST() {
        return netChangeCGST;
    }

    public void setNetChangeCGST(Float netChangeCGST) {
        this.netChangeCGST = netChangeCGST;
    }

    public Float getCurrentTermSGST() {
        return currentTermSGST;
    }

    public void setCurrentTermSGST(Float currentTermSGST) {
        this.currentTermSGST = currentTermSGST;
    }

    public Float getNetChangeSGST() {
        return netChangeSGST;
    }

    public void setNetChangeSGST(Float netChangeSGST) {
        this.netChangeSGST = netChangeSGST;
    }

    public Float getFullTermPremium() {
        return fullTermPremium;
    }

    public void setFullTermPremium(Float fullTermPremium) {
        this.fullTermPremium = fullTermPremium;
    }

    public Float getFullTermCGST() {
        return fullTermCGST;
    }

    public void setFullTermCGST(Float fullTermCGST) {
        this.fullTermCGST = fullTermCGST;
    }

    public Float getFullTermSGST() {
        return fullTermSGST;
    }

    public void setFullTermSGST(Float fullTermSGST) {
        this.fullTermSGST = fullTermSGST;
    }
}
