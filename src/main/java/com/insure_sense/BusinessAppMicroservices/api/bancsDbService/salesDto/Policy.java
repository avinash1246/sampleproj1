package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.salesDto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Data
@AllArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Policy {

    public Policy() {
    }

    private Long policyId;

    private String txnCd;
    private String userCd;
    private String roleCd;

    private PolicyInsuredDetails policyInsuredDetails;

    private PolicyInsuredDetailsPersonal policyInsuredDetailsPersonal;
    private PolicyExt policyExt;
    private List<GeographicLocation> locations;
    private List<PolicyClaimHist> claims;
    private List<PolicyCoveragePart> policyCoverageParts;
    private List<PolicyPropertyInfo> policyPropertyInfo;
    private List<PolicyCommodityInfo> policyCommodityInfo;
    private PolicyRiskCoverDetails policyRiskCoverDetails;
    private List<PolicyWorkersCompInfo> policyWorkersCompInfo;
    private List<PolicyMemberInfo> policyMemberInfo;
    private List<PolicyCoverageDetails> policyCoverageDetails;
    private List<PolicyQuestion> uwPolicyQuestions;
    private List<PolicyAmount> policyAmounts;
    private List<PolicyAmount> policyAmountHistory;
    private List<PolicyForm> policyForms;
    private List<PolicyClause> policyClauses;
    private PolicyCommission policyCommission;
    private List<PolicyDocument> policyDocuments;
    private List<PolicyCommHistory> policyCommHistory;
    private List<PolicyGenDocRequest> policyGenDocRequests;
    private List<PolicyRatingResponse> policyRatingResponses;
    private List<PolicyRatingDetail> policyRatingDetails;
    private List<PolicyRuleResponse> policyRuleResponses;
    private List<PolicyPayment> policyPayments;
    private String invocRef;
    private Float premiumAdjustmentFactor;
    private PolicyUWDecision policyUWDecision;
    private List<PartyMaster> parties;
    private List<AgreementPartyRole> agreementPartyRoles;
    private List<PolicyDiscount> policyDiscounts;
    private Map<String, String> dataDictionary = new HashMap<>();

    public Long getPolicyId() {
        return policyId;
    }

    public void setPolicyId(Long policyId) {
        this.policyId = policyId;
    }

    public PolicyInsuredDetails getPolicyInsuredDetails() {
        return policyInsuredDetails;
    }

    public void setPolicyInsuredDetails(PolicyInsuredDetails policyInsuredDetails) {
        this.policyInsuredDetails = policyInsuredDetails;
    }

    public PolicyInsuredDetailsPersonal getPolicyInsuredDetailsPersonal() {
        return policyInsuredDetailsPersonal;
    }

    public void setPolicyInsuredDetailsPersonal(PolicyInsuredDetailsPersonal policyInsuredDetailsPersonal) {
        this.policyInsuredDetailsPersonal = policyInsuredDetailsPersonal;
    }

    public PolicyExt getPolicyExt() {
        return policyExt;
    }

    public void setPolicyExt(PolicyExt policyExt) {
        this.policyExt = policyExt;
    }

    public List<PolicyClaimHist> getClaims() {
        return claims;
    }

    public void setClaims(List<PolicyClaimHist> claims) {
        this.claims = claims;
    }

    public List<PolicyCoveragePart> getPolicyCoverageParts() {
        return policyCoverageParts;
    }

    public void setPolicyCoverageParts(List<PolicyCoveragePart> policyCoverageParts) {
        this.policyCoverageParts = policyCoverageParts;
    }

    public List<GeographicLocation> getLocations() {
        return locations;
    }

    public void setLocations(List<GeographicLocation> locations) {
        this.locations = locations;
    }

    public List<PolicyPropertyInfo> getPolicyPropertyInfo() {
        return policyPropertyInfo;
    }

    public void setPolicyPropertyInfo(List<PolicyPropertyInfo> policyPropertyInfo) {
        this.policyPropertyInfo = policyPropertyInfo;
    }

    public List<PolicyCommodityInfo> getPolicyCommodityInfo() {
        return policyCommodityInfo;
    }

    public void setPolicyCommodityInfo(List<PolicyCommodityInfo> policyCommodityInfo) {
        this.policyCommodityInfo = policyCommodityInfo;
    }

    public PolicyRiskCoverDetails getPolicyRiskCoverDetails() {
        return policyRiskCoverDetails;
    }

    public void setPolicyRiskCoverDetails(PolicyRiskCoverDetails policyRiskCoverDetails) {
        this.policyRiskCoverDetails = policyRiskCoverDetails;
    }

    public List<PolicyWorkersCompInfo> getPolicyWorkersCompInfo() {
        return policyWorkersCompInfo;
    }

    public void setPolicyWorkersCompInfo(List<PolicyWorkersCompInfo> policyWorkersCompInfo) {
        this.policyWorkersCompInfo = policyWorkersCompInfo;
    }

    public List<PolicyMemberInfo> getPolicyMemberInfo() {
        return policyMemberInfo;
    }

    public void setPolicyMemberInfo(List<PolicyMemberInfo> policyMemberInfo) {
        this.policyMemberInfo = policyMemberInfo;
    }

    public List<PolicyCoverageDetails> getPolicyCoverageDetails() {
        return policyCoverageDetails;
    }

    public void setPolicyCoverageDetails(List<PolicyCoverageDetails> policyCoverageDetails) {
        this.policyCoverageDetails = policyCoverageDetails;
    }

    public List<PolicyQuestion> getUwPolicyQuestions() {
        return uwPolicyQuestions;
    }

    public void setUwPolicyQuestions(List<PolicyQuestion> uwPolicyQuestions) {
        this.uwPolicyQuestions = uwPolicyQuestions;
    }

    public List<PolicyAmount> getPolicyAmounts() {
        return policyAmounts;
    }

    public void setPolicyAmounts(List<PolicyAmount> policyAmounts) {
        this.policyAmounts = policyAmounts;
    }

    public List<PolicyForm> getPolicyForms() {
        return policyForms;
    }

    public void setPolicyForms(List<PolicyForm> policyForms) {
        this.policyForms = policyForms;
    }

    public List<PolicyClause> getPolicyClauses() {
        return policyClauses;
    }

    public void setPolicyClauses(List<PolicyClause> policyClauses) {
        this.policyClauses = policyClauses;
    }

    public PolicyCommission getPolicyCommission() {
        return policyCommission;
    }

    public void setPolicyCommission(PolicyCommission policyCommission) {
        this.policyCommission = policyCommission;
    }

    public List<PolicyDocument> getPolicyDocuments() {
        return policyDocuments;
    }

    public void setPolicyDocuments(List<PolicyDocument> policyDocuments) {
        this.policyDocuments = policyDocuments;
    }

    public List<PolicyGenDocRequest> getPolicyGenDocRequests() {
        return policyGenDocRequests;
    }

    public void setPolicyGenDocRequests(List<PolicyGenDocRequest> policyGenDocRequests) {
        this.policyGenDocRequests = policyGenDocRequests;
    }

    public List<PolicyCommHistory> getPolicyCommHistory() {
        return policyCommHistory;
    }

    public void setPolicyCommHistory(List<PolicyCommHistory> policyCommHistory) {
        this.policyCommHistory = policyCommHistory;
    }

    public List<PolicyRatingResponse> getPolicyRatingResponses() {
        return policyRatingResponses;
    }

    public void setPolicyRatingResponses(List<PolicyRatingResponse> policyRatingResponses) {
        this.policyRatingResponses = policyRatingResponses;
    }

    public List<PolicyRatingDetail> getPolicyRatingDetails() {
        return policyRatingDetails;
    }

    public void setPolicyRatingDetails(List<PolicyRatingDetail> policyRatingDetails) {
        this.policyRatingDetails = policyRatingDetails;
    }

    public List<PolicyPayment> getPolicyPayments() {
        return policyPayments;
    }

    public void setPolicyPayments(List<PolicyPayment> policyPayments) {
        this.policyPayments = policyPayments;
    }

    public Float getPremiumAdjustmentFactor() {
        return premiumAdjustmentFactor;
    }

    public void setPremiumAdjustmentFactor(Float premiumAdjustmentFactor) {
        this.premiumAdjustmentFactor = premiumAdjustmentFactor;
    }

    public PolicyUWDecision getPolicyUWDecision() {
        return policyUWDecision;
    }

    public void setPolicyUWDecision(PolicyUWDecision policyUWDecision) {
        this.policyUWDecision = policyUWDecision;
    }

    public List<AgreementPartyRole> getAgreementPartyRoles() {
        return agreementPartyRoles;
    }

    public void setAgreementPartyRoles(List<AgreementPartyRole> agreementPartyRoles) {
        this.agreementPartyRoles = agreementPartyRoles;
    }

    public List<PolicyRuleResponse> getPolicyRuleResponses() {
        return policyRuleResponses;
    }

    public void setPolicyRuleResponses(List<PolicyRuleResponse> policyRuleResponses) {
        this.policyRuleResponses = policyRuleResponses;
    }

    public List<PartyMaster> getParties() {
        return parties;
    }

    public void setParties(List<PartyMaster> parties) {
        this.parties = parties;
    }

    public Map<String, String> getDataDictionary() {
        return dataDictionary;
    }

    public void setDataDictionary(Map<String, String> dataDictionary) {
        this.dataDictionary = dataDictionary;
    }

    public List<PolicyAmount> getPolicyAmountHistory() {
        return policyAmountHistory;
    }

    public void setPolicyAmountHistory(List<PolicyAmount> policyAmountHistory) {
        this.policyAmountHistory = policyAmountHistory;
    }

    public String getInvocRef() {
        return invocRef;
    }

    public void setInvocRef(String invocRef) {
        this.invocRef = invocRef;
    }

    public String getTxnCd() {
        return txnCd;
    }

    public void setTxnCd(String txnCd) {
        this.txnCd = txnCd;
    }

    public String getUserCd() {
        return userCd;
    }

    public void setUserCd(String userCd) {
        this.userCd = userCd;
    }

    public String getRoleCd() {
        return roleCd;
    }

    public void setRoleCd(String roleCd) {
        this.roleCd = roleCd;
    }

    public List<PolicyDiscount> getPolicyDiscounts() {
        return policyDiscounts;
    }

    public void setPolicyDiscounts(List<PolicyDiscount> policyDiscounts) {
        this.policyDiscounts = policyDiscounts;
    }
}
