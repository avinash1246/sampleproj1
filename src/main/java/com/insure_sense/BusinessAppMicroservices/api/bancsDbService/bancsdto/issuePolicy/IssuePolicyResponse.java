package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.bancsdto.issuePolicy;

import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.quickQuoteResponse.Response;

public class IssuePolicyResponse {
	private String policyNumber;
	private String proposalNumber;
	private String policyInceptionDate;
	private String policyExpiryDate;
	private String policyStatus;
	private Response response;
	public String getPolicyNumber() {
		return policyNumber;
	}
	public void setPolicyNumber(String policyNumber) {
		this.policyNumber = policyNumber;
	}
	public String getProposalNumber() {
		return proposalNumber;
	}
	public void setProposalNumber(String proposalNumber) {
		this.proposalNumber = proposalNumber;
	}
	public String getPolicyInceptionDate() {
		return policyInceptionDate;
	}
	public void setPolicyInceptionDate(String policyInceptionDate) {
		this.policyInceptionDate = policyInceptionDate;
	}
	public String getPolicyExpiryDate() {
		return policyExpiryDate;
	}
	public void setPolicyExpiryDate(String policyExpiryDate) {
		this.policyExpiryDate = policyExpiryDate;
	}
	public String getPolicyStatus() {
		return policyStatus;
	}
	public void setPolicyStatus(String policyStatus) {
		this.policyStatus = policyStatus;
	}
	public Response getResponse() {
		return response;
	}
	public void setResponse(Response response) {
		this.response = response;
	}
	
	
}
