package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.salesDto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.NoArgsConstructor;


import java.time.LocalDate;


@NoArgsConstructor
public class PolicyRuleResponse extends BaseEntity {

    public PolicyRuleResponse(Long policyRuleResponseId, Long policyId, String coveragePartCd, Long insurableObjectId,
                              String txnTypeCd, String invocRef, LocalDate ruleEffectiveDate, Long insurableObjectRef,
                              String reason, String decisionResult) {
        this.policyRuleResponseId = policyRuleResponseId;
        this.policyId = policyId;
        this.coveragePartCd = coveragePartCd;
        this.insurableObjectId = insurableObjectId;
        this.txnTypeCd = txnTypeCd;
        this.invocRef = invocRef;
        this.ruleEffectiveDate = ruleEffectiveDate;
        this.insurableObjectRef = insurableObjectRef;
        this.reason = reason;
        this.decisionResult = decisionResult;
    }


    private Long policyRuleResponseId;

    private Long policyId;
    private String coveragePartCd;
    private Long insurableObjectId;
    private String txnTypeCd;
    private String invocRef;

    @JsonFormat(pattern="yyyy-MM-dd")
    private LocalDate ruleEffectiveDate;

    private Long insurableObjectRef;
    private String reason;

    private String decisionResult;

    @JsonIgnore
    private PolicyExt policyExt;

/*    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "insurableObjectId", insertable=false, updatable=false)
    private InsurableObject insurableObject;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "coveragePartCd",insertable=false, updatable=false)
    @JoinColumn(name = "policyId", insertable=false, updatable=false)
    private PolicyCoveragePart policyCoveragePart;*/

    public Long getPolicyRuleResponseId() {
        return policyRuleResponseId;
    }

    public void setPolicyRuleResponseId(Long policyRuleResponseId) {
        this.policyRuleResponseId = policyRuleResponseId;
    }

    public Long getPolicyId() {
        return policyId;
    }

    public void setPolicyId(Long policyId) {
        this.policyId = policyId;
    }

    public String getCoveragePartCd() {
        return coveragePartCd;
    }

    public void setCoveragePartCd(String coveragePartCd) {
        this.coveragePartCd = coveragePartCd;
    }

    public Long getInsurableObjectId() {
        return insurableObjectId;
    }

    public void setInsurableObjectId(Long insurableObjectId) {
        this.insurableObjectId = insurableObjectId;
    }

    public String getTxnTypeCd() {
        return txnTypeCd;
    }

    public void setTxnTypeCd(String txnTypeCd) {
        this.txnTypeCd = txnTypeCd;
    }

    public String getInvocRef() {
        return invocRef;
    }

    public void setInvocRef(String invocRef) {
        this.invocRef = invocRef;
    }

    public LocalDate getRuleEffectiveDate() {
        return ruleEffectiveDate;
    }

    public void setRuleEffectiveDate(LocalDate ruleEffectiveDate) {
        this.ruleEffectiveDate = ruleEffectiveDate;
    }

    public Long getInsurableObjectRef() {
        return insurableObjectRef;
    }

    public void setInsurableObjectRef(Long insurableObjectRef) {
        this.insurableObjectRef = insurableObjectRef;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getDecisionResult() {
        return decisionResult;
    }

    public void setDecisionResult(String decisionResult) {
        this.decisionResult = decisionResult;
    }
}
