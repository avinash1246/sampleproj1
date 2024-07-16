package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.quickQuoteRequest;

import java.util.List;

public class Member {
	private List<MemberDetail> memberDetails;
    private List<Cover> covers;
	public List<MemberDetail> getMemberDetails() {
		return memberDetails;
	}
	public void setMemberDetails(List<MemberDetail> memberDetails) {
		this.memberDetails = memberDetails;
	}
	public List<Cover> getCovers() {
		return covers;
	}
	public void setCovers(List<Cover> covers) {
		this.covers = covers;
	}
    
    
}
