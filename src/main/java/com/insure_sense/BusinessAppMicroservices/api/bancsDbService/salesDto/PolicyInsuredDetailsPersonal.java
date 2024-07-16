package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.salesDto;

import lombok.NoArgsConstructor;

import java.time.LocalDate;
@NoArgsConstructor
public class PolicyInsuredDetailsPersonal extends BaseEntity {

    public PolicyInsuredDetailsPersonal(Long policyId, Long partyId, Long insurableObjectId, String partyUUId, String insuredName, Long proposerId, String prefix,
                                        String firstName, String lastName, String panNumber, String aadhaarNumber,
                                        String phoneNumber, LocalDate dateOfBirth, String gender, String panName,
                                        Boolean panVerified, String aadhaarName, String aadhaarStatus,
                                        String currentAddHouseNo, String currentAddLocality) {

        this.policyId = policyId;
        this.partyId = partyId;
        this.insurableObjectId = insurableObjectId;
        this.partyUUId = partyUUId;
        this.insuredName = insuredName;
        this.proposerId = proposerId;
        this.prefix = prefix;
        this.firstName = firstName;
        this.lastName = lastName;
        this.panNumber = panNumber;
        this.aadhaarNumber = aadhaarNumber;
        this.phoneNumber = phoneNumber;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.panName = panName;
        this.panVerified = panVerified;
        this.aadhaarName = aadhaarName;
        this.aadhaarStatus = aadhaarStatus;
        this.currentAddHouseNo = currentAddHouseNo;
        this.currentAddLocality = currentAddLocality;
    }


    private Long policyId;

    private Long partyId;
    private Long insurableObjectId;
    private String partyUUId;
    private String insuredName;
    private Long proposerId;
    private Long householdId;
    private Long groupId;
    private String prefix;
    private String firstName;
    private String lastName;
    private String panNumber;
    private String aadhaarNumber;
    private String cKycNumber;
    private String phoneNumber;
    private String otherIDType;
    private String otherIDNumber;
    private LocalDate dateOfBirth;
    private String gender;
    private String panName;
    private Boolean panVerified;
    private String aadhaarName;
    private String aadhaarStatus;
    private String phoneStatus;
    private Boolean otherIdVerified;
    private String currentAddHouseNo;
    private String currentAddLocality;
    private String permanentAddress;

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

    public Long getInsurableObjectId() {
        return insurableObjectId;
    }

    public void setInsurableObjectId(Long insurableObjectId) {
        this.insurableObjectId = insurableObjectId;
    }

    public String getPartyUUId() {
        return partyUUId;
    }

    public void setPartyUUId(String partyUUId) {
        this.partyUUId = partyUUId;
    }

    public String getInsuredName() {
        return insuredName;
    }

    public void setInsuredName(String insuredName) {
        this.insuredName = insuredName;
    }

    public Long getProposerId() {
        return proposerId;
    }

    public void setProposerId(Long proposerId) {
        this.proposerId = proposerId;
    }

    public Long getHouseholdId() {
        return householdId;
    }

    public void setHouseholdId(Long householdId) {
        this.householdId = householdId;
    }

    public Long getGroupId() {
        return groupId;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPanNumber() {
        return panNumber;
    }

    public void setPanNumber(String panNumber) {
        this.panNumber = panNumber;
    }

    public String getAadhaarNumber() {
        return aadhaarNumber;
    }

    public void setAadhaarNumber(String aadhaarNumber) {
        this.aadhaarNumber = aadhaarNumber;
    }

    public String getcKycNumber() {
        return cKycNumber;
    }

    public void setcKycNumber(String cKycNumber) {
        this.cKycNumber = cKycNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getOtherIDType() {
        return otherIDType;
    }

    public void setOtherIDType(String otherIDType) {
        this.otherIDType = otherIDType;
    }

    public String getOtherIDNumber() {
        return otherIDNumber;
    }

    public void setOtherIDNumber(String otherIDNumber) {
        this.otherIDNumber = otherIDNumber;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPanName() {
        return panName;
    }

    public void setPanName(String panName) {
        this.panName = panName;
    }

    public Boolean getPanVerified() {
        return panVerified;
    }

    public void setPanVerified(Boolean panVerified) {
        this.panVerified = panVerified;
    }

    public String getAadhaarName() {
        return aadhaarName;
    }

    public void setAadhaarName(String aadhaarName) {
        this.aadhaarName = aadhaarName;
    }

    public String getAadhaarStatus() {
        return aadhaarStatus;
    }

    public void setAadhaarStatus(String aadhaarStatus) {
        this.aadhaarStatus = aadhaarStatus;
    }

    public String getPhoneStatus() {
        return phoneStatus;
    }

    public void setPhoneStatus(String phoneStatus) {
        this.phoneStatus = phoneStatus;
    }

    public Boolean getOtherIdVerified() {
        return otherIdVerified;
    }

    public void setOtherIdVerified(Boolean otherIdVerified) {
        this.otherIdVerified = otherIdVerified;
    }

    public String getCurrentAddHouseNo() {
        return currentAddHouseNo;
    }

    public void setCurrentAddHouseNo(String currentAddHouseNo) {
        this.currentAddHouseNo = currentAddHouseNo;
    }

    public String getCurrentAddLocality() {
        return currentAddLocality;
    }

    public void setCurrentAddLocality(String currentAddLocality) {
        this.currentAddLocality = currentAddLocality;
    }

    public String getPermanentAddress() {
        return permanentAddress;
    }

    public void setPermanentAddress(String permanentAddress) {
        this.permanentAddress = permanentAddress;
    }
}
