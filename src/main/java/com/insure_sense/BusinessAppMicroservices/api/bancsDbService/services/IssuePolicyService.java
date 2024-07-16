package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.bancsdto.issuePolicy.IssuePolicyRequest;
import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.bancsdto.issuePolicy.IssuePolicyResponse;
import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.dto.SourceUrlConfig;

import reactor.core.publisher.Mono;

@Service
public class IssuePolicyService {

	@Autowired
	private WebClient.Builder webClientBuilder;

	@Autowired
	private SourceUrlConfig sourceUrlConfig;

	public Mono<IssuePolicyResponse> issuePolicy(String proposalNumber) {
		IssuePolicyRequest issuePolicyRequest = buildRequest(proposalNumber);
		
		System.out.println("sourceUrlConfig.getQuoteUrl()---"+sourceUrlConfig.getQuoteUrl());
		System.out.println("sourceUrlConfig.getServiceUrl()---"+sourceUrlConfig.getServiceUrl());
		
		return webClientBuilder.build().post()
				.uri("http://10.10.13.160:7311/BaNCSServicesHL/api/BaNCSEnggUnderwritingServices/underwriting/14.0/engineering/issuePolicy")
				.contentType(MediaType.APPLICATION_JSON)
				.bodyValue(issuePolicyRequest).retrieve()
				.bodyToMono(IssuePolicyResponse.class);
		
	}
	
	public IssuePolicyRequest buildRequest(String proposalNumber) {
		IssuePolicyRequest issuePolicyRequest = new IssuePolicyRequest(
				"HO","GALHLTH",proposalNumber,"","COPS","APIUSER");
		return issuePolicyRequest;
	}
	
	
}
