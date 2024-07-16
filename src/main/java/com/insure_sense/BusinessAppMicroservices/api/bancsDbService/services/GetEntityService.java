package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.dto.SourceUrlConfig;

import reactor.core.publisher.Mono;

@Service
public class GetEntityService {

	@Autowired
	private WebClient.Builder webClientBuilder;
	
	@Autowired
	private SourceUrlConfig sourceUrlConfig;

	public Mono<String> issuePolicy(String proposalNumber, String policyNumber) {
		return webClientBuilder
	            .build()
	            .get()
	            .uri(String.valueOf("http://10.10.13.160:7311/BaNCSServicesHL/api/UnderwritingServices/HealthMember/13.0/getEntity"),
	                uriBuilder -> uriBuilder
	                    .queryParam("proposalNumber", proposalNumber)
	                    .queryParam("policyNumber", policyNumber)
	                    .build())
	            .header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_FORM_URLENCODED_VALUE)
	            .retrieve()
	            .bodyToMono(String.class);
	}
	
	
}
