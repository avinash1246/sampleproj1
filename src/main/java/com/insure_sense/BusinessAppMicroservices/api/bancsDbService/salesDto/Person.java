package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.salesDto;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;


@NoArgsConstructor
public class Person extends BaseEntity {

    public Person(Long personId, PartyMaster partyMaster, String prefix, String firstName, String lastName, String fullName,
                  String panNumber, String aadhaarNumber, String phoneNumber, LocalDate dateOfBirth, String gender,
                  Integer height, Integer weight, String panName, Boolean panVerified, String aadhaarName, String aadhaarStatus,
                  String currentAddress) {

        this.personId = personId;
        this.partyMaster = partyMaster;
        this.prefix = prefix;
        this.firstName = firstName;
        this.lastName = lastName;
        this.fullName = fullName;
        this.panNumber = panNumber;
        this.aadhaarNumber = aadhaarNumber;
        this.phoneNumber = phoneNumber;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.height = height;
        this.weight = weight;
        this.panName = panName;
        this.panVerified = panVerified;
        this.aadhaarName = aadhaarName;
        this.aadhaarStatus = aadhaarStatus;
        this.currentAddress = currentAddress;
    }

    public Person(Long personId, PartyMaster partyMaster) {
        this.personId = personId;
        this.partyMaster = partyMaster;
    }


    private Long personId;
    @JsonIgnore
    private PartyMaster partyMaster;
    private String prefix;
    private String firstName;
    private String lastName;
    private String fullName;
    private String panNumber;
    private String aadhaarNumber;
    private String cKycNumber;
    private String phoneNumber;
    private String otherIDType;
    private String otherIDNumber;
    private LocalDate dateOfBirth;
    private String gender;
    private Integer height;
    private Integer weight;
    private String panName;
    private Boolean panVerified;
    private String aadhaarName;
    private String aadhaarStatus;
    private String phoneStatus;
    private Boolean otherIdVerified;
    private String currentAddress;
    private String permanentAddress;

    public Long getPersonId() {
        return personId;
    }

    public void setPersonId(Long personId) {
        this.personId = personId;
    }

    public PartyMaster getPartyMaster() {
        return partyMaster;
    }

    public void setPartyMaster(PartyMaster partyMaster) {
        this.partyMaster = partyMaster;
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

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
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

    public String getcKycNumber() {
        return cKycNumber;
    }

    public void setcKycNumber(String cKycNumber) {
        this.cKycNumber = cKycNumber;
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

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
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

    public String getCurrentAddress() {
        return currentAddress;
    }

    public void setCurrentAddress(String currentAddress) {
        this.currentAddress = currentAddress;
    }

    public String getPermanentAddress() {
        return permanentAddress;
    }

    public void setPermanentAddress(String permanentAddress) {
        this.permanentAddress = permanentAddress;
    }
}
