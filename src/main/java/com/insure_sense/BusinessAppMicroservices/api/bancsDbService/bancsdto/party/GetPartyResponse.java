package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.bancsdto.party;

import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.bancsdto.common.MsgResponse;
import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.bancsdto.party.Party;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
public class GetPartyResponse {

    private Party partyDetail;
    private MsgResponse response;

    public Party getPartyDetail() {
        return partyDetail;
    }

    public void setPartyDetail(Party partyDetail) {
        this.partyDetail = partyDetail;
    }

    public MsgResponse getResponse() {
        return response;
    }

    public void setResponse(MsgResponse response) {
        this.response = response;
    }
}
