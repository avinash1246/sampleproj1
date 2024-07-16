package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.bancsdto.policy;

import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.bancsdto.common.Attribute;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
public class MemberStatus {

    private String memberCode;
    private String memberName;
    private Attribute memberStatus;
    private Attribute memberSubStatus;

    public String getMemberCode() {
        return memberCode;
    }

    public void setMemberCode(String memberCode) {
        this.memberCode = memberCode;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public Attribute getMemberStatus() {
        return memberStatus;
    }

    public void setMemberStatus(Attribute memberStatus) {
        this.memberStatus = memberStatus;
    }

    public Attribute getMemberSubStatus() {
        return memberSubStatus;
    }

    public void setMemberSubStatus(Attribute memberSubStatus) {
        this.memberSubStatus = memberSubStatus;
    }
}
