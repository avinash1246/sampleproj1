package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.quickQuoteRequest;

public class MemberDetail {
	private String name;
	private String value;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	
	public MemberDetail(String name, String value) {
		this.name = name;
		this.value = value;
	}
	
	
}
