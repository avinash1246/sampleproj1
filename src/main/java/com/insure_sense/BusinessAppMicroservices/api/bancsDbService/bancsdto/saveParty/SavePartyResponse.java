package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.bancsdto.saveParty;

import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.quickQuoteResponse.Response;

public class SavePartyResponse {
	private String partyCode;
	private Response response;
	public String getPartyCode() {
		return partyCode;
	}
	public void setPartyCode(String partyCode) {
		this.partyCode = partyCode;
	}
	public Response getResponse() {
		return response;
	}
	public void setResponse(Response response) {
		this.response = response;
	}
	
}
