package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.bancsdto.policy;

import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.bancsdto.claim.NoteProperty;
import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.bancsdto.common.Attribute;
import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.bancsdto.document.Document;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;


@AllArgsConstructor
public class ProposalRequest {

    public ProposalRequest() {
    }

    private String roleCode;
    private String flag;
    private String productCode;
    private String policyBranch;
    private String policyTermUnit;
    private String policyInceptionDate;
    private String policyStatus;
    private String premiumDepositMode;
    private String premiumFrequency;
    private String proposalNumber;
    private String policyNumber;
    private String policyExpiryDate;
    private String policyTerm;
    private String baseCurrencyRate;
    private String baseCurrency;
    private String premiumCurrencyRate;
    private String premiumCurrency;
    private String entityType;
    private String strLob;
    //Type of Policy - A- Group Agreement, F- Family Policy
    private List<PaymentInfo> paymentInfo;
    private List<Relation> relations;
    private List<Attribute> basicdetailAttribute;
    private List<DiscountLoad> discountLoads;
    private List<Member> members;
    private ColPayment colPayment;
    private List<Document> documents;
    private List<NoteProperty> notes;
    private String userCode;

    public String getRoleCode() {
        return roleCode;
    }

    public void setRoleCode(String roleCode) {
        this.roleCode = roleCode;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getPolicyBranch() {
        return policyBranch;
    }

    public void setPolicyBranch(String policyBranch) {
        this.policyBranch = policyBranch;
    }

    public String getPolicyTermUnit() {
        return policyTermUnit;
    }

    public void setPolicyTermUnit(String policyTermUnit) {
        this.policyTermUnit = policyTermUnit;
    }

    public String getPolicyInceptionDate() {
        return policyInceptionDate;
    }

    public void setPolicyInceptionDate(String policyInceptionDate) {
        this.policyInceptionDate = policyInceptionDate;
    }

    public String getPolicyStatus() {
        return policyStatus;
    }

    public void setPolicyStatus(String policyStatus) {
        this.policyStatus = policyStatus;
    }

    public String getPremiumDepositMode() {
        return premiumDepositMode;
    }

    public void setPremiumDepositMode(String premiumDepositMode) {
        this.premiumDepositMode = premiumDepositMode;
    }

    public String getPremiumFrequency() {
        return premiumFrequency;
    }

    public void setPremiumFrequency(String premiumFrequency) {
        this.premiumFrequency = premiumFrequency;
    }

    public String getProposalNumber() {
        return proposalNumber;
    }

    public void setProposalNumber(String proposalNumber) {
        this.proposalNumber = proposalNumber;
    }

    public String getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }

    public String getPolicyExpiryDate() {
        return policyExpiryDate;
    }

    public void setPolicyExpiryDate(String policyExpiryDate) {
        this.policyExpiryDate = policyExpiryDate;
    }

    public String getPolicyTerm() {
        return policyTerm;
    }

    public void setPolicyTerm(String policyTerm) {
        this.policyTerm = policyTerm;
    }

    public String getBaseCurrencyRate() {
        return baseCurrencyRate;
    }

    public void setBaseCurrencyRate(String baseCurrencyRate) {
        this.baseCurrencyRate = baseCurrencyRate;
    }

    public String getBaseCurrency() {
        return baseCurrency;
    }

    public void setBaseCurrency(String baseCurrency) {
        this.baseCurrency = baseCurrency;
    }

    public String getPremiumCurrencyRate() {
        return premiumCurrencyRate;
    }

    public void setPremiumCurrencyRate(String premiumCurrencyRate) {
        this.premiumCurrencyRate = premiumCurrencyRate;
    }

    public String getPremiumCurrency() {
        return premiumCurrency;
    }

    public void setPremiumCurrency(String premiumCurrency) {
        this.premiumCurrency = premiumCurrency;
    }

    public String getEntityType() {
        return entityType;
    }

    public void setEntityType(String entityType) {
        this.entityType = entityType;
    }

    public List<PaymentInfo> getPaymentInfo() {
        return paymentInfo;
    }

    public void setPaymentInfo(List<PaymentInfo> paymentInfo) {
        this.paymentInfo = paymentInfo;
    }

    public List<Relation> getRelations() {
        return relations;
    }

    public void setRelations(List<Relation> relations) {
        this.relations = relations;
    }

    public List<Attribute> getBasicdetailAttribute() {
        return basicdetailAttribute;
    }

    public void setBasicdetailAttribute(List<Attribute> basicdetailAttribute) {
        this.basicdetailAttribute = basicdetailAttribute;
    }

    public List<DiscountLoad> getDiscountLoads() {
        return discountLoads;
    }

    public void setDiscountLoads(List<DiscountLoad> discountLoads) {
        this.discountLoads = discountLoads;
    }

    public List<Member> getMembers() {
        return members;
    }

    public void setMembers(List<Member> members) {
        this.members = members;
    }

    public ColPayment getColPayment() {
        return colPayment;
    }

    public void setColPayment(ColPayment colPayment) {
        this.colPayment = colPayment;
    }

    public List<Document> getDocuments() {
        return documents;
    }

    public void setDocuments(List<Document> documents) {
        this.documents = documents;
    }

    public List<NoteProperty> getNotes() {
        return notes;
    }

    public void setNotes(List<NoteProperty> notes) {
        this.notes = notes;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

	public String getStrLob() {
		return strLob;
	}

	public void setStrLob(String strLob) {
		this.strLob = strLob;
	}
}
