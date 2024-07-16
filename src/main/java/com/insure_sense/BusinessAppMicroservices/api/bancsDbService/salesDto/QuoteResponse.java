package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.salesDto;

import java.util.List;

public class QuoteResponse {
    private String productCode;
    private String productName;
    private String quoteNumber;
    private String policyTenure;
    private String premiumFrequency;
    private String policyStatus;
    private String planCode;
    private QuotePremiumDetails quotePremiumDetails;
    private String quoteStartDate;
    private String response;
    private String sourceName;

    public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getQuoteNumber() {
		return quoteNumber;
	}

	public void setQuoteNumber(String quoteNumber) {
		this.quoteNumber = quoteNumber;
	}

	public String getPolicyTenure() {
		return policyTenure;
	}

	public void setPolicyTenure(String policyTenure) {
		this.policyTenure = policyTenure;
	}

	public String getPremiumFrequency() {
		return premiumFrequency;
	}

	public void setPremiumFrequency(String premiumFrequency) {
		this.premiumFrequency = premiumFrequency;
	}

	public String getPolicyStatus() {
		return policyStatus;
	}

	public void setPolicyStatus(String policyStatus) {
		this.policyStatus = policyStatus;
	}

	public String getPlanCode() {
		return planCode;
	}

	public void setPlanCode(String planCode) {
		this.planCode = planCode;
	}

	public QuotePremiumDetails getQuotePremiumDetails() {
		return quotePremiumDetails;
	}

	public void setQuotePremiumDetails(QuotePremiumDetails quotePremiumDetails) {
		this.quotePremiumDetails = quotePremiumDetails;
	}

	public String getQuoteStartDate() {
		return quoteStartDate;
	}

	public void setQuoteStartDate(String quoteStartDate) {
		this.quoteStartDate = quoteStartDate;
	}

	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}

	public String getSourceName() {
		return sourceName;
	}

	public void setSourceName(String sourceName) {
		this.sourceName = sourceName;
	}

	public static class QuotePremiumDetails {
        private String basePremium;
        private String discount;
        private String premiumAfterDiscount;
        private String loading;
        private String premiumAfterLoading;
        private String tax;
        private String premiumAfterTax;
        private List<TenureOption> tenureOptions;
		public String getBasePremium() {
			return basePremium;
		}
		public void setBasePremium(String basePremium) {
			this.basePremium = basePremium;
		}
		public String getDiscount() {
			return discount;
		}
		public void setDiscount(String discount) {
			this.discount = discount;
		}
		public String getPremiumAfterDiscount() {
			return premiumAfterDiscount;
		}
		public void setPremiumAfterDiscount(String premiumAfterDiscount) {
			this.premiumAfterDiscount = premiumAfterDiscount;
		}
		public String getLoading() {
			return loading;
		}
		public void setLoading(String loading) {
			this.loading = loading;
		}
		public String getPremiumAfterLoading() {
			return premiumAfterLoading;
		}
		public void setPremiumAfterLoading(String premiumAfterLoading) {
			this.premiumAfterLoading = premiumAfterLoading;
		}
		public String getTax() {
			return tax;
		}
		public void setTax(String tax) {
			this.tax = tax;
		}
		public String getPremiumAfterTax() {
			return premiumAfterTax;
		}
		public void setPremiumAfterTax(String premiumAfterTax) {
			this.premiumAfterTax = premiumAfterTax;
		}
		public List<TenureOption> getTenureOptions() {
			return tenureOptions;
		}
		public void setTenureOptions(List<TenureOption> tenureOptions) {
			this.tenureOptions = tenureOptions;
		}
        
    }

    public static class TenureOption {
        private String policyTenure;
        private List<PremiumOption> premiumOptions;
		public String getPolicyTenure() {
			return policyTenure;
		}
		public void setPolicyTenure(String policyTenure) {
			this.policyTenure = policyTenure;
		}
		public List<PremiumOption> getPremiumOptions() {
			return premiumOptions;
		}
		public void setPremiumOptions(List<PremiumOption> premiumOptions) {
			this.premiumOptions = premiumOptions;
		}
        
        
    }

    public static class PremiumOption {
        private String frequency;
        private String basePremium;
        private String discount;
        private String premiumAfterDiscount;
        private String loading;
        private String premiumAfterLoading;
        private String tax;
        private String premiumAfterTax;
        private List<Member> lstMembers;
        private List<DiscountLoad> discountload;
		public String getFrequency() {
			return frequency;
		}
		public void setFrequency(String frequency) {
			this.frequency = frequency;
		}
		public String getBasePremium() {
			return basePremium;
		}
		public void setBasePremium(String basePremium) {
			this.basePremium = basePremium;
		}
		public String getDiscount() {
			return discount;
		}
		public void setDiscount(String discount) {
			this.discount = discount;
		}
		public String getPremiumAfterDiscount() {
			return premiumAfterDiscount;
		}
		public void setPremiumAfterDiscount(String premiumAfterDiscount) {
			this.premiumAfterDiscount = premiumAfterDiscount;
		}
		public String getLoading() {
			return loading;
		}
		public void setLoading(String loading) {
			this.loading = loading;
		}
		public String getPremiumAfterLoading() {
			return premiumAfterLoading;
		}
		public void setPremiumAfterLoading(String premiumAfterLoading) {
			this.premiumAfterLoading = premiumAfterLoading;
		}
		public String getTax() {
			return tax;
		}
		public void setTax(String tax) {
			this.tax = tax;
		}
		public String getPremiumAfterTax() {
			return premiumAfterTax;
		}
		public void setPremiumAfterTax(String premiumAfterTax) {
			this.premiumAfterTax = premiumAfterTax;
		}
		public List<Member> getLstMembers() {
			return lstMembers;
		}
		public void setLstMembers(List<Member> lstMembers) {
			this.lstMembers = lstMembers;
		}
		public List<DiscountLoad> getDiscountload() {
			return discountload;
		}
		public void setDiscountload(List<DiscountLoad> discountload) {
			this.discountload = discountload;
		}
        
        
    }

    public static class Member {
        private String riskinceptiondate;
        private List<Property> property;
        private String policyriskexpirydate;
        private String risklevelpremium;
        private List<Cover> cover;
        private String memberstatus;
        private String remarks;
        private String membersubstatus;
        private String loadingvalue;
        private String loadingpercentage;
        private String policyriskid;
        private String discountload;
        private String medicaltest;
        private String multisetobject;
        private String memberlistindicator;
		public String getRiskinceptiondate() {
			return riskinceptiondate;
		}
		public void setRiskinceptiondate(String riskinceptiondate) {
			this.riskinceptiondate = riskinceptiondate;
		}
		public List<Property> getProperty() {
			return property;
		}
		public void setProperty(List<Property> property) {
			this.property = property;
		}
		public String getPolicyriskexpirydate() {
			return policyriskexpirydate;
		}
		public void setPolicyriskexpirydate(String policyriskexpirydate) {
			this.policyriskexpirydate = policyriskexpirydate;
		}
		public String getRisklevelpremium() {
			return risklevelpremium;
		}
		public void setRisklevelpremium(String risklevelpremium) {
			this.risklevelpremium = risklevelpremium;
		}
		public List<Cover> getCover() {
			return cover;
		}
		public void setCover(List<Cover> cover) {
			this.cover = cover;
		}
		public String getMemberstatus() {
			return memberstatus;
		}
		public void setMemberstatus(String memberstatus) {
			this.memberstatus = memberstatus;
		}
		public String getRemarks() {
			return remarks;
		}
		public void setRemarks(String remarks) {
			this.remarks = remarks;
		}
		public String getMembersubstatus() {
			return membersubstatus;
		}
		public void setMembersubstatus(String membersubstatus) {
			this.membersubstatus = membersubstatus;
		}
		public String getLoadingvalue() {
			return loadingvalue;
		}
		public void setLoadingvalue(String loadingvalue) {
			this.loadingvalue = loadingvalue;
		}
		public String getLoadingpercentage() {
			return loadingpercentage;
		}
		public void setLoadingpercentage(String loadingpercentage) {
			this.loadingpercentage = loadingpercentage;
		}
		public String getPolicyriskid() {
			return policyriskid;
		}
		public void setPolicyriskid(String policyriskid) {
			this.policyriskid = policyriskid;
		}
		public String getDiscountload() {
			return discountload;
		}
		public void setDiscountload(String discountload) {
			this.discountload = discountload;
		}
		public String getMedicaltest() {
			return medicaltest;
		}
		public void setMedicaltest(String medicaltest) {
			this.medicaltest = medicaltest;
		}
		public String getMultisetobject() {
			return multisetobject;
		}
		public void setMultisetobject(String multisetobject) {
			this.multisetobject = multisetobject;
		}
		public String getMemberlistindicator() {
			return memberlistindicator;
		}
		public void setMemberlistindicator(String memberlistindicator) {
			this.memberlistindicator = memberlistindicator;
		}
        
        
    }

    public static class Property {
        private String paramvalue;
        private String paramname;
		public String getParamvalue() {
			return paramvalue;
		}
		public void setParamvalue(String paramvalue) {
			this.paramvalue = paramvalue;
		}
		public String getParamname() {
			return paramname;
		}
		public void setParamname(String paramname) {
			this.paramname = paramname;
		}
		public Property(String paramvalue, String paramname) {
			super();
			this.paramvalue = paramvalue;
			this.paramname = paramname;
		}
		
		
        
        
    }

    public static class Cover {
        private String coverenddate;
        private String coverstartdate;
        private String covercode;
        private List<Property> property;
		public String getCoverenddate() {
			return coverenddate;
		}
		public void setCoverenddate(String coverenddate) {
			this.coverenddate = coverenddate;
		}
		public String getCoverstartdate() {
			return coverstartdate;
		}
		public void setCoverstartdate(String coverstartdate) {
			this.coverstartdate = coverstartdate;
		}
		public String getCovercode() {
			return covercode;
		}
		public void setCovercode(String covercode) {
			this.covercode = covercode;
		}
		public List<Property> getProperty() {
			return property;
		}
		public void setProperty(List<Property> property) {
			this.property = property;
		}
        
        
    }

    public static class DiscountLoad {
        private double rate;
        private String type;
        private double impactedamount;
        private String typeofloadingdiscount;
		public double getRate() {
			return rate;
		}
		public void setRate(double rate) {
			this.rate = rate;
		}
		public String getType() {
			return type;
		}
		public void setType(String type) {
			this.type = type;
		}
		public double getImpactedamount() {
			return impactedamount;
		}
		public void setImpactedamount(double impactedamount) {
			this.impactedamount = impactedamount;
		}
		public String getTypeofloadingdiscount() {
			return typeofloadingdiscount;
		}
		public void setTypeofloadingdiscount(String typeofloadingdiscount) {
			this.typeofloadingdiscount = typeofloadingdiscount;
		}
		public DiscountLoad(double rate, String type, double impactedamount, String typeofloadingdiscount) {
			super();
			this.rate = rate;
			this.type = type;
			this.impactedamount = impactedamount;
			this.typeofloadingdiscount = typeofloadingdiscount;
		}
		
    }
}
