package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.salesDto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.NoArgsConstructor;
@NoArgsConstructor
public class PolicyForm extends BaseEntity {

    public PolicyForm(Long policyId, String coveragePartCd, Long insurableObjectId,
                      String formCd, Long insurableObjectRef, String formName, String formDescription,
                      String formType, String mainDocCd, String formTemplateFileName, String eventCd) {
        this.policyId = policyId;
        this.coveragePartCd = coveragePartCd;
        this.insurableObjectId = insurableObjectId;
        this.formCd = formCd;
        this.insurableObjectRef = insurableObjectRef;
        this.formName = formName;
        this.formDescription = formDescription;
        this.formType = formType;
        this.mainDocCd = mainDocCd;
        this.formTemplateFileName = formTemplateFileName;
        this.eventCd = eventCd;
    }


    private Long policyId;


    private String formCd;

    private String coveragePartCd;
    private Long insurableObjectId;


    @JsonIgnore
    private PolicyExt policyExt;

    private Long insurableObjectRef;
    private String formName;
    private String formDescription;
    private String formType;
    private String mainDocCd;
    private String formTemplateFileName;
    private String eventCd;

    public Long getPolicyId() {
        return policyId;
    }

    public void setPolicyId(Long policyId) {
        this.policyId = policyId;
    }

    public String getFormName() {
        return formName;
    }

    public void setFormName(String formName) {
        this.formName = formName;
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

    public String getFormDescription() {
        return formDescription;
    }

    public void setFormDescription(String formDescription) {
        this.formDescription = formDescription;
    }

    public Long getInsurableObjectRef() {
        return insurableObjectRef;
    }

    public void setInsurableObjectRef(Long insurableObjectRef) {
        this.insurableObjectRef = insurableObjectRef;
    }

    public String getFormCd() {
        return formCd;
    }

    public void setFormCd(String formCd) {
        this.formCd = formCd;
    }

    public String getFormType() {
        return formType;
    }

    public void setFormType(String formType) {
        this.formType = formType;
    }

    public String getMainDocCd() {
        return mainDocCd;
    }

    public void setMainDocCd(String mainDocCd) {
        this.mainDocCd = mainDocCd;
    }

    public String getFormTemplateFileName() {
        return formTemplateFileName;
    }

    public void setFormTemplateFileName(String formTemplateFileName) {
        this.formTemplateFileName = formTemplateFileName;
    }

    public String getEventCd() {
        return eventCd;
    }

    public void setEventCd(String eventCd) {
        this.eventCd = eventCd;
    }
}
