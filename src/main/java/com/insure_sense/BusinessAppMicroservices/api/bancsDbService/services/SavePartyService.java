package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.services;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.bancsdto.saveParty.SavePartyConvertedRequest;
import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.bancsdto.saveParty.SavePartyConvertedRequest.ContactDetails;
import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.bancsdto.saveParty.SavePartyConvertedRequest.Party;
import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.bancsdto.saveParty.SavePartyConvertedRequest.PartyDetails;
import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.bancsdto.saveParty.SavePartyConvertedRequest.PartyDetails.Attributes;
import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.bancsdto.saveParty.SavePartyRequest;
import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.bancsdto.saveParty.SavePartyResponse;
import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.dto.SourceUrlConfig;

import reactor.core.publisher.Mono;

@Service
public class SavePartyService {

	@Autowired
	private WebClient.Builder webClientBuilder;

	@Autowired
	private SourceUrlConfig sourceUrlConfig;
	
	public Mono<SavePartyResponse> saveParty(SavePartyRequest savePartyRequest) throws JsonProcessingException {
		SavePartyConvertedRequest savePartyReq = buildRequest(savePartyRequest);
		ObjectMapper mapper = new ObjectMapper();
		String input = mapper.writeValueAsString(savePartyReq);
		System.out.println("input==="+input);
		
		return webClientBuilder.build().post()
				.uri("http://10.10.13.160:7311/BaNCSServicesHL/api/PartyServices/HealthParty/13.0/saveParty")
				.contentType(MediaType.APPLICATION_JSON)
				.bodyValue(savePartyReq).retrieve()
	            .bodyToMono(SavePartyResponse.class);
	}
	
	public SavePartyConvertedRequest buildRequest(SavePartyRequest savePartyRequest) {
		
		String firstName = savePartyRequest.getBasicDetails().getFirstName();
		String middleName = savePartyRequest.getBasicDetails().getMiddleName();
		String lastName = savePartyRequest.getBasicDetails().getLastName();
		String fullName = firstName + middleName + lastName;
		
		SavePartyConvertedRequest partyRequest = new SavePartyConvertedRequest();
		Party party = new Party();
		party.setIndvOrOrg(savePartyRequest.getBasicDetails().getIndvOrOrg());
		party.setPartyCode(null);
		party.setFirstName(firstName);
		party.setMiddleName(middleName);
		party.setLastName(lastName);
		party.setOtherName("");
		party.setBusinessName("");
		party.setInitial("");
		party.setCitizenshipId("");
		party.setSex(savePartyRequest.getBasicDetails().getGender());
		party.setNationality("IN");
		party.setOccupation("");
		party.setParentPartyCode("");
		party.setEffectiveDate("");
		party.setCompany("");
		party.setUserCode("");
		party.setRoleCode("");
		party.setDateofBirth(savePartyRequest.getBasicDetails().getDateofBirth());
		party.setStakeHolder("POLICY-HOL");
		party.setPartyStatus("DRAFT");
		party.setCreateOrUpdateFlag("C");
		party.setWellnessIdFlag("Y");
		party.setPolicyNumber(null);
		party.setPartyName(fullName);
		
		List<PartyDetails> partyDetails = new ArrayList<>();
		partyDetails.add(new PartyDetails(new Attributes("Title", "")));
		partyDetails.add(new PartyDetails(new Attributes("GST Registration Type", "CON")));
		partyDetails.add(new PartyDetails(new Attributes("First Name", firstName)));
		partyDetails.add(new PartyDetails(new Attributes("Last Name (1)", middleName)));
		partyDetails.add(new PartyDetails(new Attributes("Last Name", lastName)));
		partyDetails.add(new PartyDetails(new Attributes("Last Name (2)", "")));
		partyDetails.add(new PartyDetails(new Attributes("Full Name", fullName)));
		partyDetails.add(new PartyDetails(new Attributes("Party Links", "")));
		partyDetails.add(new PartyDetails(new Attributes("Gender", savePartyRequest.getBasicDetails().getGender())));
		partyDetails.add(new PartyDetails(new Attributes("Nationality", "IN")));
		partyDetails.add(new PartyDetails(new Attributes("Date of Birth", savePartyRequest.getBasicDetails().getDateofBirth())));
		partyDetails.add(new PartyDetails(new Attributes("PAN No", "")));
		partyDetails.add(new PartyDetails(new Attributes("Driving Licence Number", "")));
		partyDetails.add(new PartyDetails(new Attributes("Electronic Insurance Account", "")));
		partyDetails.add(new PartyDetails(new Attributes("Employee Status", "")));
		partyDetails.add(new PartyDetails(new Attributes("Country of Birth", "")));
		partyDetails.add(new PartyDetails(new Attributes("Lower TDS certificate", null)));
		
		List<ContactDetails> contactDetails = new ArrayList<>();
		for(int i=0; i<savePartyRequest.getContactDetails().size(); i++) {
			contactDetails.add( new ContactDetails(
					savePartyRequest.getContactDetails().get(i).getTypeOfContact(),
					"",
					savePartyRequest.getContactDetails().get(i).getAddressline1(),
					savePartyRequest.getContactDetails().get(i).getAddressline2(),
					"",
					savePartyRequest.getContactDetails().get(i).getPinCode(),
					null,null,
					"","",
					savePartyRequest.getContactDetails().get(i).getCityName(),
					"",savePartyRequest.getContactDetails().get(i).getStateName(),"INDIA","INDIA",
					null,null,null,
					savePartyRequest.getContactDetails().get(i).getMobileNumber(),
					null,null,
					savePartyRequest.getContactDetails().get(i).getEmail(),
					null,null,null
					));
		}
		
		party.setPartyDetails(partyDetails);
		party.setContactDetails(contactDetails);
		
		partyRequest.setParty(party);
		return partyRequest;
	}
	
	
}
