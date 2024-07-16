package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.salesDto;

import org.json.JSONObject;

import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.quickQuoteRequest.ProductDetails;

public class SaveQuoteRequest {
	private String branch;
    private String imdCode;
    private String product;
    private Object quoteDate;
    private Object quoteNumber;
    private ProductDetails quoteRequest;
    private QuoteResponse quoteResponse;
    private Object response;
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getImdCode() {
		return imdCode;
	}
	public void setImdCode(String imdCode) {
		this.imdCode = imdCode;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public Object getQuoteDate() {
		return quoteDate;
	}
	public void setQuoteDate(Object quoteDate) {
		this.quoteDate = quoteDate;
	}
	public Object getQuoteNumber() {
		return quoteNumber;
	}
	public void setQuoteNumber(Object quoteNumber) {
		this.quoteNumber = quoteNumber;
	}
	public ProductDetails getQuoteRequest() {
		return quoteRequest;
	}
	public void setQuoteRequest(ProductDetails quoteRequest) {
		this.quoteRequest = quoteRequest;
	}
	public QuoteResponse getQuoteResponse() {
		return quoteResponse;
	}
	public void setQuoteResponse(QuoteResponse quoteResponse) {
		this.quoteResponse = quoteResponse;
	}
	public Object getResponse() {
		return response;
	}
	public void setResponse(Object response) {
		this.response = response;
	}
	public SaveQuoteRequest(String branch, String imdCode, String product, Object quoteDate, Object quoteNumber,
			ProductDetails quoteRequest, QuoteResponse quoteResponse, Object response) {
		super();
		this.branch = branch;
		this.imdCode = imdCode;
		this.product = product;
		this.quoteDate = quoteDate;
		this.quoteNumber = quoteNumber;
		this.quoteRequest = quoteRequest;
		this.quoteResponse = quoteResponse;
		this.response = response;
	}
    
    
}
