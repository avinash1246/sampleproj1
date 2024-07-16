package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.salesDto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.NoArgsConstructor;


import java.time.LocalDateTime;


@NoArgsConstructor
public class PolicyCommHistory extends BaseEntity {
    public PolicyCommHistory(Long policyCommHistoryId, Long policyId, String coveragePartCd,
                             Long insurableObjectId, Long insurableObjectRef, LocalDateTime messageDate,
                             String messageTypeCd,
                             String note, String policyCondition, String userId) {
        this.policyCommHistoryId = policyCommHistoryId;
        this.policyId = policyId;
        this.coveragePartCd = coveragePartCd;
        this.insurableObjectId = insurableObjectId;
        this.insurableObjectRef = insurableObjectRef;
        this.messageDate = messageDate;
        this.messageTypeCd = messageTypeCd;
        this.note = note;
        this.policyCondition = policyCondition;
        this.userId = userId;
    }

    private Long policyCommHistoryId;

    private Long policyId;
    private String coveragePartCd;
    private Long insurableObjectId;
    private Long insurableObjectRef;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime messageDate;

    private String messageTypeCd;
    private String note;
    private String policyCondition;
    private String userId;

    @JsonIgnore
    private PolicyExt policyExt;


    public Long getPolicyCommHistoryId() {
        return policyCommHistoryId;
    }

    public void setPolicyCommHistoryId(Long policyCommHistoryId) {
        this.policyCommHistoryId = policyCommHistoryId;
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

    public LocalDateTime getMessageDate() {
        return messageDate;
    }

    public void setMessageDate(LocalDateTime messageDate) {
        this.messageDate = messageDate;
    }

    public String getMessageTypeCd() {
        return messageTypeCd;
    }

    public void setMessageTypeCd(String messageTypeCd) {
        this.messageTypeCd = messageTypeCd;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getPolicyCondition() {
        return policyCondition;
    }

    public void setPolicyCondition(String policyCondition) {
        this.policyCondition = policyCondition;
    }

    public Long getPolicyId() {
        return policyId;
    }

    public void setPolicyId(Long policyId) {
        this.policyId = policyId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
