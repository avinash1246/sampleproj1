package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.bancsdto.policy;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
public class CounterOfferletterRequest {

    private String proposalNumber;
    private String roleCode;
    private String createUpdateModifyFlag;
// A-Accept,M-Modify,R-Reject


    public String getProposalNumber() {
        return proposalNumber;
    }

    public void setProposalNumber(String proposalNumber) {
        this.proposalNumber = proposalNumber;
    }

    public String getRoleCode() {
        return roleCode;
    }

    public void setRoleCode(String roleCode) {
        this.roleCode = roleCode;
    }

    public String getCreateUpdateModifyFlag() {
        return createUpdateModifyFlag;
    }

    public void setCreateUpdateModifyFlag(String createUpdateModifyFlag) {
        this.createUpdateModifyFlag = createUpdateModifyFlag;
    }
}
