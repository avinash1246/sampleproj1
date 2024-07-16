package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.bancsdto.policy;

import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.bancsdto.claim.NoteProperty;
import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.bancsdto.common.Attribute;
import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.bancsdto.common.Requirement;
import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.bancsdto.document.Document;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@NoArgsConstructor
@AllArgsConstructor
public class EntityDetails {
    private String limitValues;
    private List<PolicyDiscountLoading> policyDiscountLoading;
    private ColPayment colPayment;
    private String externalRequestKey;
    private String flag;
    private String productCode;
    private String productName;
    private String policyPlanName;
    private String userCode;
    private String policyBranch;
    private String policyTermUnit;
    private String policyInceptionDate;
    private String premiumDepositMode;
    private String policyStatus;
    private String policySubStatus;
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
    private ProposerAddress proposerAddress;
    private List<Attribute> basicdetailAttribute;
    private List<Relation> relations;
    private List<Member> members;
    private List<Risk> risks;
    private List<Document> documents;
    private List<Requirement> requirements;
    private List<NoteProperty> notes;
    private List<PaymentCycle> policyPaymentCycleDetails;
    private List<EndorsementDetail> endorsementDetails;
    private List<CollectionDetail> collectionDetail;
    private String roleCode;
    private String groupPolicyNumber;
    private String categoryNumber;
    private String groupPolicyHolderName;
    private String groupPolicyholderCode;
    private String strCompany;
    private String strCountry;
    private String strLOB;
    private String strState;
    private String strProduct;
    private String strProductId;
    private String strProductName;
    private String strBranchCode;
    private String internalRequestRef;
    private String issueFlag;
    private String registeredPlanName;
    private String issueQuoteFlag;
    private String issueQuoteConfirmFlag;
    private String expectedPolicyStartDate;

    public String getLimitValues() {
        return limitValues;
    }

    public void setLimitValues(String limitValues) {
        this.limitValues = limitValues;
    }

    public List<PolicyDiscountLoading> getPolicyDiscountLoading() {
        return policyDiscountLoading;
    }

    public void setPolicyDiscountLoading(List<PolicyDiscountLoading> policyDiscountLoading) {
        this.policyDiscountLoading = policyDiscountLoading;
    }

    public ColPayment getColPayment() {
        return colPayment;
    }

    public void setColPayment(ColPayment colPayment) {
        this.colPayment = colPayment;
    }

    public String getExternalRequestKey() {
        return externalRequestKey;
    }

    public void setExternalRequestKey(String externalRequestKey) {
        this.externalRequestKey = externalRequestKey;
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

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getPolicyPlanName() {
        return policyPlanName;
    }

    public void setPolicyPlanName(String policyPlanName) {
        this.policyPlanName = policyPlanName;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
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

    public String getPremiumDepositMode() {
        return premiumDepositMode;
    }

    public void setPremiumDepositMode(String premiumDepositMode) {
        this.premiumDepositMode = premiumDepositMode;
    }

    public String getPolicyStatus() {
        return policyStatus;
    }

    public void setPolicyStatus(String policyStatus) {
        this.policyStatus = policyStatus;
    }

    public String getPolicySubStatus() {
        return policySubStatus;
    }

    public void setPolicySubStatus(String policySubStatus) {
        this.policySubStatus = policySubStatus;
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

    public ProposerAddress getProposerAddress() {
        return proposerAddress;
    }

    public void setProposerAddress(ProposerAddress proposerAddress) {
        this.proposerAddress = proposerAddress;
    }

    public List<Attribute> getBasicdetailAttribute() {
        return basicdetailAttribute;
    }

    public void setBasicdetailAttribute(List<Attribute> basicdetailAttribute) {
        this.basicdetailAttribute = basicdetailAttribute;
    }

    public List<Relation> getRelations() {
        return relations;
    }

    public void setRelations(List<Relation> relations) {
        this.relations = relations;
    }

    public List<Member> getMembers() {
        return members;
    }

    public void setMembers(List<Member> members) {
        this.members = members;
    }

    public List<Risk> getRisks() {
        return risks;
    }

    public void setRisks(List<Risk> risks) {
        this.risks = risks;
    }

    public List<Document> getDocuments() {
        return documents;
    }

    public void setDocuments(List<Document> documents) {
        this.documents = documents;
    }

    public List<Requirement> getRequirements() {
        return requirements;
    }

    public void setRequirements(List<Requirement> requirements) {
        this.requirements = requirements;
    }

    public List<NoteProperty> getNotes() {
        return notes;
    }

    public void setNotes(List<NoteProperty> notes) {
        this.notes = notes;
    }

    public List<PaymentCycle> getPolicyPaymentCycleDetails() {
        return policyPaymentCycleDetails;
    }

    public void setPolicyPaymentCycleDetails(List<PaymentCycle> policyPaymentCycleDetails) {
        this.policyPaymentCycleDetails = policyPaymentCycleDetails;
    }

    public List<EndorsementDetail> getEndorsementDetails() {
        return endorsementDetails;
    }

    public void setEndorsementDetails(List<EndorsementDetail> endorsementDetails) {
        this.endorsementDetails = endorsementDetails;
    }

    public List<CollectionDetail> getCollectionDetail() {
        return collectionDetail;
    }

    public void setCollectionDetail(List<CollectionDetail> collectionDetail) {
        this.collectionDetail = collectionDetail;
    }

    public String getRoleCode() {
        return roleCode;
    }

    public void setRoleCode(String roleCode) {
        this.roleCode = roleCode;
    }

    public String getGroupPolicyNumber() {
        return groupPolicyNumber;
    }

    public void setGroupPolicyNumber(String groupPolicyNumber) {
        this.groupPolicyNumber = groupPolicyNumber;
    }

    public String getCategoryNumber() {
        return categoryNumber;
    }

    public void setCategoryNumber(String categoryNumber) {
        this.categoryNumber = categoryNumber;
    }

    public String getGroupPolicyHolderName() {
        return groupPolicyHolderName;
    }

    public void setGroupPolicyHolderName(String groupPolicyHolderName) {
        this.groupPolicyHolderName = groupPolicyHolderName;
    }

    public String getGroupPolicyholderCode() {
        return groupPolicyholderCode;
    }

    public void setGroupPolicyholderCode(String groupPolicyholderCode) {
        this.groupPolicyholderCode = groupPolicyholderCode;
    }

    public String getStrCompany() {
        return strCompany;
    }

    public void setStrCompany(String strCompany) {
        this.strCompany = strCompany;
    }

    public String getStrCountry() {
        return strCountry;
    }

    public void setStrCountry(String strCountry) {
        this.strCountry = strCountry;
    }

    public String getStrLOB() {
        return strLOB;
    }

    public void setStrLOB(String strLOB) {
        this.strLOB = strLOB;
    }

    public String getStrState() {
        return strState;
    }

    public void setStrState(String strState) {
        this.strState = strState;
    }

    public String getStrProduct() {
        return strProduct;
    }

    public void setStrProduct(String strProduct) {
        this.strProduct = strProduct;
    }

    public String getStrProductId() {
        return strProductId;
    }

    public void setStrProductId(String strProductId) {
        this.strProductId = strProductId;
    }

    public String getStrProductName() {
        return strProductName;
    }

    public void setStrProductName(String strProductName) {
        this.strProductName = strProductName;
    }

    public String getStrBranchCode() {
        return strBranchCode;
    }

    public void setStrBranchCode(String strBranchCode) {
        this.strBranchCode = strBranchCode;
    }

    public String getInternalRequestRef() {
        return internalRequestRef;
    }

    public void setInternalRequestRef(String internalRequestRef) {
        this.internalRequestRef = internalRequestRef;
    }

    public String getIssueFlag() {
        return issueFlag;
    }

    public void setIssueFlag(String issueFlag) {
        this.issueFlag = issueFlag;
    }

    public String getRegisteredPlanName() {
        return registeredPlanName;
    }

    public void setRegisteredPlanName(String registeredPlanName) {
        this.registeredPlanName = registeredPlanName;
    }

    public String getIssueQuoteFlag() {
        return issueQuoteFlag;
    }

    public void setIssueQuoteFlag(String issueQuoteFlag) {
        this.issueQuoteFlag = issueQuoteFlag;
    }

    public String getIssueQuoteConfirmFlag() {
        return issueQuoteConfirmFlag;
    }

    public void setIssueQuoteConfirmFlag(String issueQuoteConfirmFlag) {
        this.issueQuoteConfirmFlag = issueQuoteConfirmFlag;
    }

    public String getExpectedPolicyStartDate() {
        return expectedPolicyStartDate;
    }

    public void setExpectedPolicyStartDate(String expectedPolicyStartDate) {
        this.expectedPolicyStartDate = expectedPolicyStartDate;
    }
}
