package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.dto;

import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.salesDto.BaseEntity;

public class PartyMaster extends BaseEntity {
	private Long partyId;
    private String partyTypeCd;
    //private Organization organization;
    private String partyRoleCd;
    
	public Long getPartyId() {
		return partyId;
	}
	public void setPartyId(Long partyId) {
		this.partyId = partyId;
	}
	public String getPartyTypeCd() {
		return partyTypeCd;
	}
	public void setPartyTypeCd(String partyTypeCd) {
		this.partyTypeCd = partyTypeCd;
	}
//	public Organization getOrganization() {
//		return organization;
//	}
//	public void setOrganization(Organization organization) {
//		this.organization = organization;
//	}
	public String getPartyRoleCd() {
		return partyRoleCd;
	}
	public void setPartyRoleCd(String partyRoleCd) {
		this.partyRoleCd = partyRoleCd;
	}
    
    
}
