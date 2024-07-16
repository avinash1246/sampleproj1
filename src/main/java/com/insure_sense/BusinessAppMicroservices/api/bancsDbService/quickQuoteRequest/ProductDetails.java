package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.quickQuoteRequest;

import java.util.List;

public class ProductDetails {
	private String productCode;
    private String quoteNumber;
    private String applicationNumber;
    private List<BasicDetail> basicDetails;
    private List<Member> members;
    private List<DiscountLoad> discountLoads;
    private String flag;
    private String userCode;
    private String roleCode;
	public String getProductCode() {
		return productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public String getQuoteNumber() {
		return quoteNumber;
	}
	public void setQuoteNumber(String quoteNumber) {
		this.quoteNumber = quoteNumber;
	}
	public String getApplicationNumber() {
		return applicationNumber;
	}
	public void setApplicationNumber(String applicationNumber) {
		this.applicationNumber = applicationNumber;
	}
	public List<BasicDetail> getBasicDetails() {
		return basicDetails;
	}
	public void setBasicDetails(List<BasicDetail> basicDetails) {
		this.basicDetails = basicDetails;
	}
	public List<Member> getMembers() {
		return members;
	}
	public void setMembers(List<Member> members) {
		this.members = members;
	}
	public List<DiscountLoad> getDiscountLoads() {
		return discountLoads;
	}
	public void setDiscountLoads(List<DiscountLoad> discountLoads) {
		this.discountLoads = discountLoads;
	}
	public String getFlag() {
		return flag;
	}
	public void setFlag(String flag) {
		this.flag = flag;
	}
	public String getUserCode() {
		return userCode;
	}
	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}
	public String getRoleCode() {
		return roleCode;
	}
	public void setRoleCode(String roleCode) {
		this.roleCode = roleCode;
	}
    
    
}
