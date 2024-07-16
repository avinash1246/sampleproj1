package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.salesDto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class QCodeListResponse extends BaseEntity {


    public QCodeListResponse(Long qCodeListResponseId, Long policyQuestionId, String codeList,
                             Boolean qChkboxResponse) {
        this.qCodeListResponseId = qCodeListResponseId;
        this.policyQuestionId = policyQuestionId;
        this.codeList = codeList;
        this.qChkboxResponse = qChkboxResponse;
    }


    private Long qCodeListResponseId;

    private Long policyQuestionId;

    private String codeList;
    private Boolean qChkboxResponse;

    @JsonIgnore
    private PolicyQuestion policyQuestion;

    public String getCodeList() {
        return codeList;
    }

    public void setCodeList(String codeList) {
        this.codeList = codeList;
    }

    public Long getPolicyQuestionId() {
        return policyQuestionId;
    }

    public void setPolicyQuestionId(Long policyQuestionId) {
        this.policyQuestionId = policyQuestionId;
    }

    public Long getqCodeListResponseId() {
        return qCodeListResponseId;
    }

    public void setqCodeListResponseId(Long qCodeListResponseId) {
        this.qCodeListResponseId = qCodeListResponseId;
    }

    public Boolean getqChkboxResponse() {
        return qChkboxResponse;
    }

    public void setqChkboxResponse(Boolean qChkboxResponse) {
        this.qChkboxResponse = qChkboxResponse;
    }

    public PolicyQuestion getPolicyQuestion() {
        return policyQuestion;
    }

    public void setPolicyQuestion(PolicyQuestion policyQuestion) {
        this.policyQuestion = policyQuestion;
    }
}
