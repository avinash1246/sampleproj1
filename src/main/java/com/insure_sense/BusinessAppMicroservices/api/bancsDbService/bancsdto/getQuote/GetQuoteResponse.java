package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.bancsdto.getQuote;

import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.quickQuoteRequest.ProductDetails;
import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.quickQuoteResponse.Response;
import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.salesDto.QuoteResponse;

public class GetQuoteResponse {
	private String product;
    private String quoteNumber;
    private String branch;
    private String imdCode;
    private String quoteDate;
    private String sumInsured;
    private String coverageType;
    private String lob;
    private String quotePremium;
    private String businessType;
    private String productName;
    private String plan;
    private String plandesc;
    public String getSumInsured() {
		return sumInsured;
	}
	public void setSumInsured(String sumInsured) {
		this.sumInsured = sumInsured;
	}
	public String getCoverageType() {
		return coverageType;
	}
	public void setCoverageType(String coverageType) {
		this.coverageType = coverageType;
	}
	public String getLob() {
		return lob;
	}
	public void setLob(String lob) {
		this.lob = lob;
	}
	public String getQuotePremium() {
		return quotePremium;
	}
	public void setQuotePremium(String quotePremium) {
		this.quotePremium = quotePremium;
	}
	public String getBusinessType() {
		return businessType;
	}
	public void setBusinessType(String businessType) {
		this.businessType = businessType;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getPlan() {
		return plan;
	}
	public void setPlan(String plan) {
		this.plan = plan;
	}
	public String getPlandesc() {
		return plandesc;
	}
	public void setPlandesc(String plandesc) {
		this.plandesc = plandesc;
	}
	private ProductDetails quoteRequest;
    private QuoteResponse quoteResponse;
    private Response response;
    
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
	public String getQuoteDate() {
		return quoteDate;
	}
	public void setQuoteDate(String quoteDate) {
		this.quoteDate = quoteDate;
	}
	public String getQuoteNumber() {
		return quoteNumber;
	}
	public void setQuoteNumber(String quoteNumber) {
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
	public Response getResponse() {
		return response;
	}
	public void setResponse(Response response) {
		this.response = response;
	}
    
    
}
