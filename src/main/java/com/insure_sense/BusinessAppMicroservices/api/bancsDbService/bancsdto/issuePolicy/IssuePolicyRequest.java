package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.bancsdto.issuePolicy;

public class IssuePolicyRequest {
	private String branchCode;
	private String productCode;
	private String proposalNumber;
	private String remarks;
	private String roleCode;
	private String userCode;
	
	public String getBranchCode() {
		return branchCode;
	}
	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}
	public String getProductCode() {
		return productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public String getProposalNumber() {
		return proposalNumber;
	}
	public void setProposalNumber(String proposalNumber) {
		this.proposalNumber = proposalNumber;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public String getRoleCode() {
		return roleCode;
	}
	public void setRoleCode(String roleCode) {
		this.roleCode = roleCode;
	}
	public String getUserCode() {
		return userCode;
	}
	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}
	
	public IssuePolicyRequest(String branchCode, String productCode, String proposalNumber, String remarks,
			String roleCode, String userCode) {
		super();
		this.branchCode = branchCode;
		this.productCode = productCode;
		this.proposalNumber = proposalNumber;
		this.remarks = remarks;
		this.roleCode = roleCode;
		this.userCode = userCode;
	}
	
	
}
