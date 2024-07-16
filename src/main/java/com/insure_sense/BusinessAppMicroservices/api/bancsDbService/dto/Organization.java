package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.dto;

public class Organization {
	private String[] gstData;

	public String[] getGstData() {
		return gstData;
	}

	public void setGstData(String[] gstData) {
		this.gstData = gstData;
	}
	
	public Organization(String[] gstData) {
        this.gstData = gstData;
    }
}
