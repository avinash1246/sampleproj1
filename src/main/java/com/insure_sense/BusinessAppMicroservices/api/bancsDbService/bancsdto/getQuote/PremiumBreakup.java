package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.bancsdto.getQuote;

public class PremiumBreakup {
	private String policyTenure;
    private String basePremium;
    private String tax;
    private String premiumAfterTax;
    
	public String getPolicyTenure() {
		return policyTenure;
	}
	public void setPolicyTenure(String policyTenure) {
		this.policyTenure = policyTenure;
	}
	public String getBasePremium() {
		return basePremium;
	}
	public void setBasePremium(String basePremium) {
		this.basePremium = basePremium;
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
    
}
