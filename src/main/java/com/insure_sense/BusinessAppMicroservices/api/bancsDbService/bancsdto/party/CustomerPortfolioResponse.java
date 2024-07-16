package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.bancsdto.party;

import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.bancsdto.common.Attribute;
import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.bancsdto.common.MsgResponse;
import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.bancsdto.common.MultiSetAttribute;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@NoArgsConstructor
@AllArgsConstructor
public class CustomerPortfolioResponse {

    private Attribute partyDetails;
    private MultiSetAttribute policyDetails;
    private MultiSetAttribute claimDetails;
    private MsgResponse response;

    public Attribute getPartyDetails() {
        return partyDetails;
    }

    public void setPartyDetails(Attribute partyDetails) {
        this.partyDetails = partyDetails;
    }

    public MultiSetAttribute getPolicyDetails() {
        return policyDetails;
    }

    public void setPolicyDetails(MultiSetAttribute policyDetails) {
        this.policyDetails = policyDetails;
    }

    public MultiSetAttribute getClaimDetails() {
        return claimDetails;
    }

    public void setClaimDetails(MultiSetAttribute claimDetails) {
        this.claimDetails = claimDetails;
    }

    public MsgResponse getResponse() {
        return response;
    }

    public void setResponse(MsgResponse response) {
        this.response = response;
    }
}
