package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.salesDto;

import lombok.NoArgsConstructor;


import java.util.List;


@NoArgsConstructor
public class PolicyQuestion extends BaseEntity {

    public PolicyQuestion(Long policyQuestionId, Long policyId, String coveragePartCd,
                          Long insurableObjectId, Long insurableObjectRef, String questionCd, String qtext,
                          String qtype, String uwInfoLayerCd, String qRadioResponse, String qSelectResponse, String qTxtResponse,
                          Float qNumResponse, String qParentQuestionCd, String qTriggerCond) {
        this.policyQuestionId = policyQuestionId;
        this.policyId = policyId;
        this.coveragePartCd = coveragePartCd;
        this.insurableObjectId = insurableObjectId;
        this.insurableObjectRef = insurableObjectRef;
        this.questionCd = questionCd;
        this.qtext = qtext;
        this.qtype = qtype;
        this.uwInfoLayerCd = uwInfoLayerCd;
        this.qRadioResponse = qRadioResponse;
        this.qSelectResponse = qSelectResponse;
        this.qTxtResponse = qTxtResponse;
        this.qNumResponse = qNumResponse;
        this.qParentQuestionCd = qParentQuestionCd;
        this.qTriggerCond = qTriggerCond;
    }


    private Long policyQuestionId;

    private Long policyId;
    private String coveragePartCd;
    private Long insurableObjectId;
    private Long insurableObjectRef;
    private String questionCd;

    private String qtext;
    private String qtype;
    private String uwInfoLayerCd;
    private List<QCodeListResponse> qCodeListResponses;
/*    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "policyQuestionId")
    @MapsId("policyQuestionId")
    private List<QCodeListResponse> qCodeListResponses;*/
    private String qRadioResponse;
    private String qSelectResponse;
    private String qTxtResponse;
    private Float qNumResponse;
    private String qParentQuestionCd;
    private String qTriggerCond;

    public Long getPolicyId() {
        return policyId;
    }

    public void setPolicyId(Long policyId) {
        this.policyId = policyId;
    }

    public String getQuestionCd() {
        return questionCd;
    }

    public void setQuestionCd(String questionCd) {
        this.questionCd = questionCd;
    }

    public String getQtext() {
        return qtext;
    }

    public void setQtext(String qtext) {
        this.qtext = qtext;
    }

    public String getQtype() {
        return qtype;
    }

    public void setQtype(String qtype) {
        this.qtype = qtype;
    }

    public String getUwInfoLayerCd() {
        return uwInfoLayerCd;
    }

    public void setUwInfoLayerCd(String uwInfoLayerCd) {
        this.uwInfoLayerCd = uwInfoLayerCd;
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

    public Long getInsurableObjectRef() {
        return insurableObjectRef;
    }

    public void setInsurableObjectRef(Long insurableObjectRef) {
        this.insurableObjectRef = insurableObjectRef;
    }

    public Long getPolicyQuestionId() {
        return policyQuestionId;
    }

    public void setPolicyQuestionId(Long policyQuestionId) {
        this.policyQuestionId = policyQuestionId;
    }

    public List<QCodeListResponse> getqCodeListResponses() {
        return qCodeListResponses;
    }

    public void setqCodeListResponses(List<QCodeListResponse> qCodeListResponses) {
        this.qCodeListResponses = qCodeListResponses;
    }

    public String getqRadioResponse() {
        return qRadioResponse;
    }

    public void setqRadioResponse(String qRadioResponse) {
        this.qRadioResponse = qRadioResponse;
    }

    public String getqSelectResponse() {
        return qSelectResponse;
    }

    public void setqSelectResponse(String qSelectResponse) {
        this.qSelectResponse = qSelectResponse;
    }

    public String getqTxtResponse() {
        return qTxtResponse;
    }

    public void setqTxtResponse(String qTxtResponse) {
        this.qTxtResponse = qTxtResponse;
    }

    public Float getqNumResponse() {
        return qNumResponse;
    }

    public void setqNumResponse(Float qNumResponse) {
        this.qNumResponse = qNumResponse;
    }

    public String getqParentQuestionCd() {
        return qParentQuestionCd;
    }

    public void setqParentQuestionCd(String qParentQuestionCd) {
        this.qParentQuestionCd = qParentQuestionCd;
    }

    public String getqTriggerCond() {
        return qTriggerCond;
    }

    public void setqTriggerCond(String qTriggerCond) {
        this.qTriggerCond = qTriggerCond;
    }
}
