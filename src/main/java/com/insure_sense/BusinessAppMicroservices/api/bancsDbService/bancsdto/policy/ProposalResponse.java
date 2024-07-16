package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.bancsdto.policy;

import java.util.List;

import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.bancsdto.common.MsgResponse;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
public class ProposalResponse {

    private String proposalNumber;
    private String policyNumber;
    private String policyStatus;
    private List<PremiumDetail> premiumDetails;
    private MsgResponse response;

    public String getProposalNumber() {
        return proposalNumber;
    }

    public void setProposalNumber(String proposalNumber) {
        this.proposalNumber = proposalNumber;
    }

    public String getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }

    public String getPolicyStatus() {
        return policyStatus;
    }

    public void setPolicyStatus(String policyStatus) {
        this.policyStatus = policyStatus;
    }

    public List<PremiumDetail> getPremiumDetails() {
        return premiumDetails;
    }

    public void setPremiumDetails(List<PremiumDetail> premiumDetails) {
        this.premiumDetails = premiumDetails;
    }

    public MsgResponse getResponse() {
        return response;
    }

    public void setResponse(MsgResponse response) {
        this.response = response;
    }
}
