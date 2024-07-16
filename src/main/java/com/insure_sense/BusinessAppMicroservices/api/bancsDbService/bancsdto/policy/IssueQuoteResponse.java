package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.bancsdto.policy;

import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.bancsdto.common.Attribute;
import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.bancsdto.common.MsgResponse;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
public class IssueQuoteResponse {

    private Attribute policyStatus;
    //Name - In Case of Accept : "Active OR DRAFT" ;
    //In case of Reject : "Reject" ;
    //In case of Modify : "Draft"

    //Value - In Case of Accept : 05
    //In Case of Reject :02;
    //In case of Modify 01
    private MemberStatus memberStatus;
    private MsgResponse response;

    public Attribute getPolicyStatus() {
        return policyStatus;
    }

    public void setPolicyStatus(Attribute policyStatus) {
        this.policyStatus = policyStatus;
    }

    public MemberStatus getMemberStatus() {
        return memberStatus;
    }

    public void setMemberStatus(MemberStatus memberStatus) {
        this.memberStatus = memberStatus;
    }

    public MsgResponse getResponse() {
        return response;
    }

    public void setResponse(MsgResponse response) {
        this.response = response;
    }
}
