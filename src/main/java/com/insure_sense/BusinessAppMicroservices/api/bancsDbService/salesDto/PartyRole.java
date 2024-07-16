package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.salesDto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;



@AllArgsConstructor
@NoArgsConstructor
public class PartyRole extends BaseEntity {

    public PartyRole(String partyRoleCd) {
        this.partyRoleCd = partyRoleCd;
    }

    
    private String partyRoleCd;

    private String partyRoleName;

    public String getPartyRoleCd() {
        return partyRoleCd;
    }

    public void setPartyRoleCd(String partyRoleCd) {
        this.partyRoleCd = partyRoleCd;
    }

    public String getPartyRoleName() {
        return partyRoleName;
    }

    public void setPartyRoleName(String partyRoleName) {
        this.partyRoleName = partyRoleName;
    }


}
