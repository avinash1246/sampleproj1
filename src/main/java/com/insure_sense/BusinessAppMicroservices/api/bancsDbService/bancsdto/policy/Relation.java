package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.bancsdto.policy;

import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.bancsdto.common.Attribute;
import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.bancsdto.party.Party;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@NoArgsConstructor
@AllArgsConstructor
public class Relation {

    private String role;
    //POLICY-HOL/AGENT/CGS/SGS
    private Party party;
    private List<Attribute> relationAttribute;

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Party getParty() {
        return party;
    }

    public void setParty(Party party) {
        this.party = party;
    }

    public List<Attribute> getRelationAttribute() {
        return relationAttribute;
    }

    public void setRelationAttribute(List<Attribute> relationAttribute) {
        this.relationAttribute = relationAttribute;
    }
}
