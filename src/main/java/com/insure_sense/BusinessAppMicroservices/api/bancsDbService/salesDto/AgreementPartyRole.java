package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.salesDto;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.NoArgsConstructor;

import java.time.LocalDate;


@NoArgsConstructor
public class AgreementPartyRole extends BaseEntity {

    public AgreementPartyRole(Long agreementId, String partyRoleCd, LocalDate effectiveDate,
                              Long partyId, String contactPersonName,
                              String contactPhone, String contactEmail,
                              String dispatchAddress) {
        this.agreementId = agreementId;
        this.partyRoleCd = partyRoleCd;
        this.effectiveDate = effectiveDate;
        this.partyId = partyId;
        this.contactPersonName = contactPersonName;
        this.contactPhone = contactPhone;
        this.contactEmail = contactEmail;
        this.dispatchAddress = dispatchAddress;
    }


    private Long agreementId;


    private String partyRoleCd;


    private LocalDate effectiveDate;


    private Long partyId;

    @JsonIgnore
    private Agreement agreement;

    @JsonIgnore
    private PartyRole partyRole;

    @JsonIgnore
    private PartyMaster partyMaster;

    private LocalDate expirationDate;

    private String agreementUUID;

    private String contactPersonName;
    private String contactPhone;
    private String contactEmail;
    private String dispatchAddress;

    public Long getAgreementId() {
        return agreementId;
    }

    public void setAgreementId(Long agreementId) {
        this.agreementId = agreementId;
    }

    public String getPartyRoleCd() {
        return partyRoleCd;
    }

    public void setPartyRoleCd(String partyRoleCd) {
        this.partyRoleCd = partyRoleCd;
    }

    public LocalDate getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(LocalDate effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public Long getPartyId() {
        return partyId;
    }

    public void setPartyId(Long partyId) {
        this.partyId = partyId;
    }

    public Agreement getAgreement() {
        return agreement;
    }

    public void setAgreement(Agreement agreement) {
        this.agreement = agreement;
    }

    public PartyRole getPartyRole() {
        return partyRole;
    }

    public void setPartyRole(PartyRole partyRole) {
        this.partyRole = partyRole;
    }

    public PartyMaster getPartyMaster() {
        return partyMaster;
    }

    public void setPartyMaster(PartyMaster partyMaster) {
        this.partyMaster = partyMaster;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getAgreementUUID() {
        return agreementUUID;
    }

    public void setAgreementUUID(String agreementUUID) {
        this.agreementUUID = agreementUUID;
    }

    public String getContactPersonName() {
        return contactPersonName;
    }

    public void setContactPersonName(String contactPersonName) {
        this.contactPersonName = contactPersonName;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public String getDispatchAddress() {
        return dispatchAddress;
    }

    public void setDispatchAddress(String dispatchAddress) {
        this.dispatchAddress = dispatchAddress;
    }
}
