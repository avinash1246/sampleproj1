package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.bancsdto.document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
public class UpdateRequirementRequest {

    private String referenceType;
    //POLICY/CLAIM/PARTY
    private String referenceNumber;
    //Proposal Number,Claim Number,Party Code
    private PartyRequirement partyRequirement;

    public String getReferenceType() {
        return referenceType;
    }

    public void setReferenceType(String referenceType) {
        this.referenceType = referenceType;
    }

    public String getReferenceNumber() {
        return referenceNumber;
    }

    public void setReferenceNumber(String referenceNumber) {
        this.referenceNumber = referenceNumber;
    }

    public PartyRequirement getPartyRequirement() {
        return partyRequirement;
    }

    public void setPartyRequirement(PartyRequirement partyRequirement) {
        this.partyRequirement = partyRequirement;
    }
}
