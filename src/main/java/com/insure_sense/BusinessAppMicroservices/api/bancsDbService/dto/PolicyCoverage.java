package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.dto;

public class PolicyCoverage {
	private String coveragePartCd;
    private String coveragePartName;
    private int coveragePartSumInsured;
    private boolean selected;
    
	public String getCoveragePartCd() {
		return coveragePartCd;
	}
	public void setCoveragePartCd(String coveragePartCd) {
		this.coveragePartCd = coveragePartCd;
	}
	public String getCoveragePartName() {
		return coveragePartName;
	}
	public void setCoveragePartName(String coveragePartName) {
		this.coveragePartName = coveragePartName;
	}
	public int getCoveragePartSumInsured() {
		return coveragePartSumInsured;
	}
	public void setCoveragePartSumInsured(int coveragePartSumInsured) {
		this.coveragePartSumInsured = coveragePartSumInsured;
	}
	public boolean isSelected() {
		return selected;
	}
	public void setSelected(boolean selected) {
		this.selected = selected;
	}
}
