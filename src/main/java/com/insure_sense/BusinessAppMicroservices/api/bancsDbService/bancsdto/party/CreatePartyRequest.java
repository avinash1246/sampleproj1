package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.bancsdto.party;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
public class CreatePartyRequest {

    private Party party;

    public Party getParty() {
        return party;
    }

    public void setParty(Party party) {
        this.party = party;
    }
}
