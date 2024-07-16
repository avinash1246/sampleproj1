package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.bancsdto.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@NoArgsConstructor
@AllArgsConstructor
public class PartyMultiSetAttribute {

    private String setNo;
    private List<PartyAttribute> attributes;

    public String getSetNo() {
        return setNo;
    }

    public void setSetNo(String setNo) {
        this.setNo = setNo;
    }

    public List<PartyAttribute> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<PartyAttribute> attributes) {
        this.attributes = attributes;
    }
}
