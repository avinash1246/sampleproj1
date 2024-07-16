package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.bancsdto.party;

import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.bancsdto.common.Attribute;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@NoArgsConstructor
@AllArgsConstructor
public class PartyList {

    List<Attribute> partydetails;

    public List<Attribute> getPartydetails() {
        return partydetails;
    }

    public void setPartydetails(List<Attribute> partydetails) {
        this.partydetails = partydetails;
    }
}
