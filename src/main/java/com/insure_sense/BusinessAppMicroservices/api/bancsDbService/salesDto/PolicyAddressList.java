package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.salesDto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.NoArgsConstructor;


import java.time.LocalDate;


@NoArgsConstructor
public class PolicyAddressList extends BaseEntity {

    public PolicyAddressList(Long policyId, Long geographicLocationId, String displayAddress, String placeID) {
        this.policyId = policyId;
        this.geographicLocationId = geographicLocationId;
        this.displayAddress = displayAddress;
        this.placeID = placeID;
    }


    private Long policyId;


    private Long geographicLocationId;

//    @JsonFormat(pattern="dd/MM/yyyy")
//    private LocalDate effectiveDate;

    private String displayAddress;

    private String placeID;

    @JsonIgnore
    private PolicyExt policyExt;

    @JsonIgnore
    private PolicyRiskCoverDetails policyRiskCoverDetails;


    public Long getPolicyId() {
        return policyId;
    }

    public void setPolicyId(Long policyId) {
        this.policyId = policyId;
    }

    public Long getGeographicLocationId() {
        return geographicLocationId;
    }

    public void setGeographicLocationId(Long geographicLocationId) {
        this.geographicLocationId = geographicLocationId;
    }

    public PolicyExt getPolicyExt() {
        return policyExt;
    }

    public void setPolicyExt(PolicyExt policyExt) {
        this.policyExt = policyExt;
    }

    //    public LocalDate getEffectiveDate() {
//        return effectiveDate;
//    }
//
//    public void setEffectiveDate(LocalDate effectiveDate) {
//        this.effectiveDate = effectiveDate;
//    }

    public String getDisplayAddress() {
        return displayAddress;
    }

    public void setDisplayAddress(String displayAddress) {
        this.displayAddress = displayAddress;
    }

    public String getPlaceID() {
        return placeID;
    }

    public void setPlaceID(String placeID) {
        this.placeID = placeID;
    }
}

