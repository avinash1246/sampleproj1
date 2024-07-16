package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.salesDto;

import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.quickQuoteResponse.Response;

public class SaveQuoteResponse {
	private String quoteNumber;
    private Response response;
    
	public String getQuoteNumber() {
		return quoteNumber;
	}
	public void setQuoteNumber(String quoteNumber) {
		this.quoteNumber = quoteNumber;
	}
	public Response getResponse() {
		return response;
	}
	public void setResponse(Response response) {
		this.response = response;
	}
    
    
}
