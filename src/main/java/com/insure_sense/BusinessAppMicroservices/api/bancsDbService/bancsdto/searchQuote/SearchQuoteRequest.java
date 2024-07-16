package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.bancsdto.searchQuote;

public class SearchQuoteRequest {
	private String product;
	private String imdCode;
	private String startQuoteDate;
	private String endQuoteDate;
	private String currentPage;
	private String pageSize;
	private String branch;
	
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public String getImdCode() {
		return imdCode;
	}
	public void setImdCode(String imdCode) {
		this.imdCode = imdCode;
	}
	public String getStartQuoteDate() {
		return startQuoteDate;
	}
	public void setStartQuoteDate(String startQuoteDate) {
		this.startQuoteDate = startQuoteDate;
	}
	public String getEndQuoteDate() {
		return endQuoteDate;
	}
	public void setEndQuoteDate(String endQuoteDate) {
		this.endQuoteDate = endQuoteDate;
	}
	public String getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(String currentPage) {
		this.currentPage = currentPage;
	}
	public String getPageSize() {
		return pageSize;
	}
	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	
	
}
