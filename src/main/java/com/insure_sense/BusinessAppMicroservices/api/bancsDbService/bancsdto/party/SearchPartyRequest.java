package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.bancsdto.party;

import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.bancsdto.common.Attribute;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@NoArgsConstructor
@AllArgsConstructor
public class SearchPartyRequest {

    private String partyCode;
    private String stakeHolder;
    private String partyStatus;
    private String partyName;
    private String zipCode;
    private String emailAddress;
    private String mobileNumber;
    private List<Attribute> advanceSearch;

    public String getPartyCode() {
        return partyCode;
    }

    public void setPartyCode(String partyCode) {
        this.partyCode = partyCode;
    }

    public String getStakeHolder() {
        return stakeHolder;
    }

    public void setStakeHolder(String stakeHolder) {
        this.stakeHolder = stakeHolder;
    }

    public String getPartyStatus() {
        return partyStatus;
    }

    public void setPartyStatus(String partyStatus) {
        this.partyStatus = partyStatus;
    }

    public String getPartyName() {
        return partyName;
    }

    public void setPartyName(String partyName) {
        this.partyName = partyName;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public List<Attribute> getAdvanceSearch() {
        return advanceSearch;
    }

    public void setAdvanceSearch(List<Attribute> advanceSearch) {
        this.advanceSearch = advanceSearch;
    }
}
