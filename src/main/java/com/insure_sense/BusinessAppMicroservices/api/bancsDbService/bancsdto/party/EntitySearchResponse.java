package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.bancsdto.party;

import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.bancsdto.common.MsgResponse;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@NoArgsConstructor
@AllArgsConstructor
public class EntitySearchResponse {

    private List<PartyList> partyList;

    private MsgResponse response;

    public List<PartyList> getPartyList() {
        return partyList;
    }

    public void setPartyList(List<PartyList> partyList) {
        this.partyList = partyList;
    }

    public MsgResponse getResponse() {
        return response;
    }

    public void setResponse(MsgResponse response) {
        this.response = response;
    }
}
