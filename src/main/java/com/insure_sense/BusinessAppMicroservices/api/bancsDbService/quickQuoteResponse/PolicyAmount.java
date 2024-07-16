package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.quickQuoteResponse;

public class PolicyAmount {
	private String amounttype;
    private String coveragePartCd;
    private Integer insurableObjectRef;
    private String covertype;
    private double policyamount;

    // Getters and Setters
    public String getAmounttype() {
        return amounttype;
    }

    public void setAmounttype(String amounttype) {
        this.amounttype = amounttype;
    }

    public String getCoveragePartCd() {
        return coveragePartCd;
    }

    public void setCoveragePartCd(String coveragePartCd) {
        this.coveragePartCd = coveragePartCd;
    }

    public Integer getInsurableObjectRef() {
        return insurableObjectRef;
    }

    public void setInsurableObjectRef(Integer insurableObjectRef) {
        this.insurableObjectRef = insurableObjectRef;
    }

    public String getCovertype() {
        return covertype;
    }

    public void setCovertype(String covertype) {
        this.covertype = covertype;
    }

    public double getPolicyamount() {
        return policyamount;
    }

    public void setPolicyamount(double policyamount) {
        this.policyamount = policyamount;
    }
}
