package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.bancsdto.getQuote;

import java.util.List;

public class MemberDetail {
	private String dob;
    private String sumInsured;
    private String deductible;
    private List<Cover> cover;
    
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getSumInsured() {
		return sumInsured;
	}
	public void setSumInsured(String sumInsured) {
		this.sumInsured = sumInsured;
	}
	public String getDeductible() {
		return deductible;
	}
	public void setDeductible(String deductible) {
		this.deductible = deductible;
	}
	public List<Cover> getCover() {
		return cover;
	}
	public void setCover(List<Cover> cover) {
		this.cover = cover;
	}
    
    
}
