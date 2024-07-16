package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.bancsdto.product;

import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.bancsdto.common.MsgResponse;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@NoArgsConstructor
@AllArgsConstructor
public class DomainList {

    private List<AttributeValue> domainValues;
    private MsgResponse response;

    public List<AttributeValue> getDomainValues() {
        return domainValues;
    }

    public void setDomainValues(List<AttributeValue> domainValues) {
        this.domainValues = domainValues;
    }

    public MsgResponse getResponse() {
        return response;
    }

    public void setResponse(MsgResponse response) {
        this.response = response;
    }
}
