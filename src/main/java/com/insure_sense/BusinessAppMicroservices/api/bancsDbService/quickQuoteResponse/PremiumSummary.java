package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.quickQuoteResponse;

public class PremiumSummary {
	private double sgst;
    private String coverType;
    private String coveragePartName;
    private String ioDescription;
    private Double quotePremium;
    private Integer insurableObjectRef;
    private double pretaxPremium;
    private boolean isCommission;
    private String amountCategory;
    private double cgst;
    private String coveragePartCd;

    // Getters and Setters
    public double getSgst() {
        return sgst;
    }

    public void setSgst(double sgst) {
        this.sgst = sgst;
    }

    public String getCoverType() {
        return coverType;
    }

    public void setCoverType(String coverType) {
        this.coverType = coverType;
    }

    public String getCoveragePartName() {
        return coveragePartName;
    }

    public void setCoveragePartName(String coveragePartName) {
        this.coveragePartName = coveragePartName;
    }

    public String getIoDescription() {
        return ioDescription;
    }

    public void setIoDescription(String ioDescription) {
        this.ioDescription = ioDescription;
    }

    public Double getQuotePremium() {
        return quotePremium;
    }

    public void setQuotePremium(Double quotePremium) {
        this.quotePremium = quotePremium;
    }

    public Integer getInsurableObjectRef() {
        return insurableObjectRef;
    }

    public void setInsurableObjectRef(Integer insurableObjectRef) {
        this.insurableObjectRef = insurableObjectRef;
    }

    public double getPretaxPremium() {
        return pretaxPremium;
    }

    public void setPretaxPremium(double pretaxPremium) {
        this.pretaxPremium = pretaxPremium;
    }

    public boolean isCommission() {
        return isCommission;
    }

    public void setCommission(boolean isCommission) {
        this.isCommission = isCommission;
    }

    public String getAmountCategory() {
        return amountCategory;
    }

    public void setAmountCategory(String amountCategory) {
        this.amountCategory = amountCategory;
    }

    public double getCgst() {
        return cgst;
    }

    public void setCgst(double cgst) {
        this.cgst = cgst;
    }

    public String getCoveragePartCd() {
        return coveragePartCd;
    }

    public void setCoveragePartCd(String coveragePartCd) {
        this.coveragePartCd = coveragePartCd;
    }

	public PremiumSummary(double sgst, String coverType, String coveragePartName, String ioDescription,
			Double quotePremium, Integer insurableObjectRef, double pretaxPremium, boolean isCommission,
			String amountCategory, double cgst, String coveragePartCd) {
		super();
		this.sgst = sgst;
		this.coverType = coverType;
		this.coveragePartName = coveragePartName;
		this.ioDescription = ioDescription;
		this.quotePremium = quotePremium;
		this.insurableObjectRef = insurableObjectRef;
		this.pretaxPremium = pretaxPremium;
		this.isCommission = isCommission;
		this.amountCategory = amountCategory;
		this.cgst = cgst;
		this.coveragePartCd = coveragePartCd;
	}
    
    
}
