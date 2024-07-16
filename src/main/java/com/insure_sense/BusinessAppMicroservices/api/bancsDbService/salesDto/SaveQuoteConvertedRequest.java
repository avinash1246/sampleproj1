package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.salesDto;

import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.quickQuoteResponse.PolicyOption;
import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.dto.Policy;

public class SaveQuoteConvertedRequest {
	private Policy policy;
	private PolicyOption selectedQuote;
	
	public Policy getPolicy() {
		return policy;
	}
	public void setPolicy(Policy policy) {
		this.policy = policy;
	}
	public PolicyOption getSelectedQuote() {
		return selectedQuote;
	}
	public void setSelectedQuote(PolicyOption selectedQuote) {
		this.selectedQuote = selectedQuote;
	}
	
	
	
}
