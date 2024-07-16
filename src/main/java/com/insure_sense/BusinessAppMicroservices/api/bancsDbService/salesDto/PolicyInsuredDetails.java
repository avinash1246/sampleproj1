package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.salesDto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.NoArgsConstructor;
@NoArgsConstructor
public class PolicyInsuredDetails extends BaseEntity {

    public PolicyInsuredDetails(Long policyId, Long partyId, String insuredName, String companyCIN,
                                String primaryGSTNumber, String companyStatus, String companyCategory,
                                String companyType, String incorpDate, String industryCode,
                                String industryDescription, String companyAddress) {
        this.policyId = policyId;
        this.partyId = partyId;
        this.insuredName = insuredName;
        this.companyCIN = companyCIN;
        this.primaryGSTNumber = primaryGSTNumber;
        this.companyStatus = companyStatus;
        this.companyCategory = companyCategory;
        this.companyType = companyType;
        this.incorpDate = incorpDate;
        this.industryCode = industryCode;
        this.industryDescription = industryDescription;
        this.companyAddress = companyAddress;
    }


    private Long policyId;


    private Long partyId;

    private String insuredName;
    private String companyCIN;
    private String primaryGSTNumber;
    private String companyStatus;
    private String companyCategory;
    private String companyType;

    @JsonFormat(pattern="dd/MM/yyyy")
    private String incorpDate;

    private String industryCode;
    private String industryDescription;
    private String companyAddress;
    private Long   primaryHSNCd;

    @JsonIgnore
    private PolicyExt policyExt;


    public Long getPolicyId() {
        return policyId;
    }

    public void setPolicyId(Long policyId) {
        this.policyId = policyId;
    }

    public Long getPartyId() {
        return partyId;
    }

    public void setPartyId(Long partyId) {
        this.partyId = partyId;
    }

    public String getInsuredName() {
        return insuredName;
    }

    public void setInsuredName(String insuredName) {
        this.insuredName = insuredName;
    }

    public String getCompanyCIN() {
        return companyCIN;
    }

    public void setCompanyCIN(String companyCIN) {
        this.companyCIN = companyCIN;
    }

    public String getPrimaryGSTNumber() {
        return primaryGSTNumber;
    }

    public void setPrimaryGSTNumber(String primaryGSTNumber) {
        this.primaryGSTNumber = primaryGSTNumber;
    }

    public String getCompanyStatus() {
        return companyStatus;
    }

    public void setCompanyStatus(String companyStatus) {
        this.companyStatus = companyStatus;
    }

    public String getCompanyCategory() {
        return companyCategory;
    }

    public void setCompanyCategory(String companyCategory) {
        this.companyCategory = companyCategory;
    }

    public String getCompanyType() {
        return companyType;
    }

    public void setCompanyType(String companyType) {
        this.companyType = companyType;
    }

    public String getIncorpDate() {
        return incorpDate;
    }

    public void setIncorpDate(String incorpDate) {
        this.incorpDate = incorpDate;
    }

    public String getIndustryCode() {
        return industryCode;
    }

    public void setIndustryCode(String industryCode) {
        this.industryCode = industryCode;
    }

    public String getIndustryDescription() {
        return industryDescription;
    }

    public void setIndustryDescription(String industryDescription) {
        this.industryDescription = industryDescription;
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
    }


    public PolicyExt getPolicyExt() {
        return policyExt;
    }

    public void setPolicyExt(PolicyExt policyExt) {
        this.policyExt = policyExt;
    }

    public Long getPrimaryHSNCd() { return primaryHSNCd; }

    public void setPrimaryHSNCd(Long primaryHSNCd) {
        this.primaryHSNCd = primaryHSNCd;
    }

}
