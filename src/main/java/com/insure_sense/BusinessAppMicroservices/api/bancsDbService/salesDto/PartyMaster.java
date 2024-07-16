package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.salesDto;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class PartyMaster extends BaseEntity {

    public PartyMaster(Long partyId, String partyCd, String partyName, String partyTypeCd) {
        this.partyId = partyId;
        this.partyCd = partyCd;
        this.partyName = partyName;
        this.partyTypeCd = partyTypeCd;
    }

    public PartyMaster(String partyName, String partyTypeCd) {
        this.partyName = partyName;
        this.partyTypeCd = partyTypeCd;
    }


    private Long partyId;

    private String partyCd;

    private String partyUUID;

    private String partyName;

    private String partyTypeCd;

    private String partyRoleCd;

    private Organization organization;

    private Person person;

    private Household household;

    public Long getPartyId() {
        return partyId;
    }

    public void setPartyId(Long partyId) {
        this.partyId = partyId;
    }

    public String getPartyCd() {
        return partyCd;
    }

    public void setPartyCd(String partyCd) {
        this.partyCd = partyCd;
    }

    public String getPartyName() {
        return partyName;
    }

    public void setPartyName(String partyName) {
        this.partyName = partyName;
    }

    public String getPartyTypeCd() {
        return partyTypeCd;
    }

    public void setPartyTypeCd(String partyTypeCd) {
        this.partyTypeCd = partyTypeCd;
    }

    public Organization getOrganization() {
        return organization;
    }

    public void setOrganization(Organization organization) {
        this.organization = organization;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Household getHousehold() {
        return household;
    }

    public void setHousehold(Household household) {
        this.household = household;
    }

    public String getPartyUUID() {
        return partyUUID;
    }

    public void setPartyUUID(String partyUUID) {
        this.partyUUID = partyUUID;
    }

    public String getPartyRoleCd() {
        return partyRoleCd;
    }

    public void setPartyRoleCd(String partyRoleCd) {
        this.partyRoleCd = partyRoleCd;
    }
}
