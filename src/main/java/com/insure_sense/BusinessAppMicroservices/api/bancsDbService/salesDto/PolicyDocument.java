package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.salesDto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;




@AllArgsConstructor
@NoArgsConstructor
public class PolicyDocument extends BaseEntity {

    public PolicyDocument(String policyDocumentId, Long policyId, String documentName,
                          Boolean selected, String mainDocCd, String eventCd) {
        this.policyDocumentId = policyDocumentId;
        this.policyId = policyId;
        this.documentName = documentName;
        this.selected = selected;
        this.mainDocCd = mainDocCd;
        this.eventCd = eventCd;
    }


    private String policyDocumentId;

    private Long policyId;

    private String documentName;
    private Boolean selected;
    private String mainDocCd;
    private String eventCd;

    @JsonIgnore
    private PolicyExt policyExt;

    public String getPolicyDocumentId() {
        return policyDocumentId;
    }

    public void setPolicyDocumentId(String policyDocumentId) {
        this.policyDocumentId = policyDocumentId;
    }

    public Long getPolicyId() {
        return policyId;
    }

    public void setPolicyId(Long policyId) {
        this.policyId = policyId;
    }

    public String getDocumentName() {
        return documentName;
    }

    public void setDocumentName(String documentName) {
        this.documentName = documentName;
    }

    public Boolean getSelected() {
        return selected;
    }

    public void setSelected(Boolean selected) {
        this.selected = selected;
    }

    public String getMainDocCd() {
        return mainDocCd;
    }

    public void setMainDocCd(String mainDocCd) {
        this.mainDocCd = mainDocCd;
    }

    public String getEventCd() {
        return eventCd;
    }

    public void setEventCd(String eventCd) {
        this.eventCd = eventCd;
    }
}
