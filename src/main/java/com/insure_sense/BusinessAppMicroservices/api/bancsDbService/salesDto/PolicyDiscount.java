package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.salesDto;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class PolicyDiscount extends BaseEntity {

    public PolicyDiscount(Long policyId, String policyDiscountCd, String policyDiscountDesc, Boolean selected) {
        this.policyId = policyId;
        this.policyDiscountCd = policyDiscountCd;
        this.policyDiscountDesc = policyDiscountDesc;
        this.selected = selected;
    }


    private Long policyId;

    private String policyDiscountCd;
    private String policyDiscountDesc;
    private Boolean selected;

    @JsonIgnore
    private PolicyExt policyExt;

    public Long getPolicyId() {
        return policyId;
    }

    public void setPolicyId(Long policyId) {
        this.policyId = policyId;
    }

    public String getPolicyDiscountCd() {
        return policyDiscountCd;
    }

    public void setPolicyDiscountCd(String policyDiscountCd) {
        this.policyDiscountCd = policyDiscountCd;
    }

    public String getPolicyDiscountDesc() {
        return policyDiscountDesc;
    }

    public void setPolicyDiscountDesc(String policyDiscountDesc) {
        this.policyDiscountDesc = policyDiscountDesc;
    }

    public Boolean getSelected() {
        return selected;
    }

    public void setSelected(Boolean selected) {
        this.selected = selected;
    }
}
