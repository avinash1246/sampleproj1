package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.bancsdto.searchQuote;

import java.util.List;

import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.quickQuoteResponse.Response;

public class SearchQuoteResponse {
	private List<SaveQuoteDetails> saveQuoteDetailsList;
    private int count;
    private Response response;
    
	public List<SaveQuoteDetails> getSaveQuoteDetailsList() {
		return saveQuoteDetailsList;
	}
	public void setSaveQuoteDetailsList(List<SaveQuoteDetails> saveQuoteDetailsList) {
		this.saveQuoteDetailsList = saveQuoteDetailsList;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public Response getResponse() {
		return response;
	}
	public void setResponse(Response response) {
		this.response = response;
	}
    
}
