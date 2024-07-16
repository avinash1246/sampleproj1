package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.quickQuoteRequest;

import java.util.List;

public class Cover {
	private String coverCode;
    private String coverName;
    private List<BasicDetail> coverAttribute;
	public String getCoverCode() {
		return coverCode;
	}
	public void setCoverCode(String coverCode) {
		this.coverCode = coverCode;
	}
	public String getCoverName() {
		return coverName;
	}
	public void setCoverName(String coverName) {
		this.coverName = coverName;
	}
	public List<BasicDetail> getCoverAttribute() {
		return coverAttribute;
	}
	public void setCoverAttribute(List<BasicDetail> coverAttribute) {
		this.coverAttribute = coverAttribute;
	}
    
    
}
