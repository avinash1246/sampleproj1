package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.salesDto;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.NoArgsConstructor;


@NoArgsConstructor
public class Household extends BaseEntity {

    public Household(Long householdId, PartyMaster partyMaster) {
        this.householdId = householdId;
        this.partyMaster = partyMaster;
    }

    public Household(Long householdId, PartyMaster partyMaster, Long orgId, Long groupId, Long proposerId,
                     String placeID, Long geographicLocationId) {
        this.householdId = householdId;
        this.partyMaster = partyMaster;
        this.orgId = orgId;
        this.groupId = groupId;
        this.proposerId = proposerId;
        this.placeID = placeID;
        this.geographicLocationId = geographicLocationId;
    }


    private Long householdId;
    @JsonIgnore
    private PartyMaster partyMaster;
    private Long orgId;
    private Long groupId;
    private Long proposerId;
    private String placeID;
    private Long geographicLocationId;

    public Long getHouseholdId() {
        return householdId;
    }

    public void setHouseholdId(Long householdId) {
        this.householdId = householdId;
    }

    public PartyMaster getPartyMaster() {
        return partyMaster;
    }

    public void setPartyMaster(PartyMaster partyMaster) {
        this.partyMaster = partyMaster;
    }

    public Long getOrgId() {
        return orgId;
    }

    public void setOrgId(Long orgId) {
        this.orgId = orgId;
    }

    public Long getGroupId() {
        return groupId;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    public Long getProposerId() {
        return proposerId;
    }

    public void setProposerId(Long proposerId) {
        this.proposerId = proposerId;
    }

    public String getPlaceID() {
        return placeID;
    }

    public void setPlaceID(String placeID) {
        this.placeID = placeID;
    }

    public Long getGeographicLocationId() {
        return geographicLocationId;
    }

    public void setGeographicLocationId(Long geographicLocationId) {
        this.geographicLocationId = geographicLocationId;
    }
}
