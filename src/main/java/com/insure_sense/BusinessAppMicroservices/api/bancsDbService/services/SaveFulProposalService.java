package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.bancsdto.common.Attribute;
import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.bancsdto.common.MultiSetAttribute;
import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.bancsdto.party.Party;
import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.bancsdto.party.PartyDetail;
import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.bancsdto.policy.ContactDetail;
import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.bancsdto.policy.Member;
import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.bancsdto.policy.PaymentInfo;
import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.bancsdto.policy.ProposalRequest;
import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.bancsdto.policy.ProposalResponse;
import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.bancsdto.policy.Relation;

import reactor.core.publisher.Mono;

@Service
public class SaveFulProposalService {

	@Autowired
    private WebClient.Builder webClientBuilder;


	public ProposalRequest buildRequest() {
		
		ProposalRequest request = new ProposalRequest();
		request.setRoleCode("COPS");
		request.setFlag("C");
		request.setProductCode("GALHLTH");
		request.setPolicyBranch("HO");
		request.setPolicyTermUnit("G");
		request.setPolicyInceptionDate("20/06/2024");
		request.setPolicyStatus("");
		request.setPremiumDepositMode("");
		request.setPremiumFrequency("");
		request.setProposalNumber("");
		request.setPolicyNumber("");
		request.setPolicyExpiryDate("19/06/2025");
		request.setPolicyTerm("1");
		request.setBaseCurrencyRate("");
		request.setBaseCurrency("");
		request.setPremiumCurrencyRate("");
		request.setStrLob("Health");
		request.setPremiumCurrency("");
		request.setEntityType("");
		
		List<Attribute> basicDetails = new ArrayList<>();
		basicDetails.add(new Attribute("Party Links","I"));
		basicDetails.add(new Attribute("Policy-holder Code", "PH0000449216"));
		basicDetails.add(new Attribute("Title", "Mr."));
		basicDetails.add(new Attribute("Policy-holder First name", "ATUL"));
		basicDetails.add(new Attribute("Policy-holder Last Name (1)", ""));
		basicDetails.add(new Attribute("Policy-holder Last Name (2)", "DE"));
		basicDetails.add(new Attribute("Full Name", "ATUL DE"));
		basicDetails.add(new Attribute("Policy-holder Gender", "M"));
		basicDetails.add(new Attribute("Policy-holder Date of Birth", "01/01/1980"));
		basicDetails.add(new Attribute("Marital Status", "MARRIED"));
		basicDetails.add(new Attribute("Nationality", "IN"));
		basicDetails.add(new Attribute("Occupation1", "1056"));
		basicDetails.add(new Attribute("Annual Gross Income", "100000"));
		basicDetails.add(new Attribute("HNI Customer", "N"));
		basicDetails.add(new Attribute("Policy Holder also a Member?", "Y"));
		basicDetails.add(new Attribute("Is The Mailing/Communication Address Same As The Primary Address?", "Y"));
		basicDetails.add(new Attribute("Application Number entry 1", "1234"));
		basicDetails.add(new Attribute("Type of Business", "NB"));
		basicDetails.add(new Attribute("Expected Policy Start Date", "20/06/2024"));
		basicDetails.add(new Attribute("Policy Effective Time", "15:24:30"));
		basicDetails.add(new Attribute("Policy Expiry Date", "19/06/2025"));
		basicDetails.add(new Attribute("Policy Expiry Time", "23:59:59"));
		basicDetails.add(new Attribute("Policy Tenure", "1Y"));
		basicDetails.add(new Attribute("Policy Duration", "1"));
		basicDetails.add(new Attribute("Policy Duration Unit", "G"));
		basicDetails.add(new Attribute("Premium Frequency", "B"));
		basicDetails.add(new Attribute("Plan Type", "IND"));
		basicDetails.add(new Attribute("Plan", "Gold"));
		basicDetails.add(new Attribute("Number of Members", "1"));
		basicDetails.add(new Attribute("Family Size", ""));
		basicDetails.add(new Attribute("Deductible Options", "NA"));
		basicDetails.add(new Attribute("Policy Branch Code", "HO"));
		basicDetails.add(new Attribute("Inwarding Branch Name", "HEAD OFFICE"));
		basicDetails.add(new Attribute("PED - Buy Back", "NA"));
		basicDetails.add(new Attribute("Televerification required", "N"));
		basicDetails.add(new Attribute("QC WAIVER", "N"));
		basicDetails.add(new Attribute("Producer Code", "AG000002"));
		basicDetails.add(new Attribute("Intermediary Name", "Chuni Saha"));
		basicDetails.add(new Attribute("Intermediary Classification", ""));
		basicDetails.add(new Attribute("Is mobile number same as WhatsApp number?", ""));
		basicDetails.add(new Attribute("Select Type of Address", "Permanent"));
		basicDetails.add(new Attribute("Address Pty 1", "B13 Ramgarh"));
		basicDetails.add(new Attribute("Zip CodeParty", "700047"));
		basicDetails.add(new Attribute("City1", "Kolkata"));
		basicDetails.add(new Attribute("Emirates/State", "WEST BENGAL"));
		basicDetails.add(new Attribute("District", "Kolkata"));
		basicDetails.add(new Attribute("Mobile Number", "9051363419"));
		basicDetails.add(new Attribute("Email ID", "adv1234@gmail.com"));
		basicDetails.add(new Attribute("Do you want to change Proposer Address?", "N"));
		basicDetails.add(new Attribute("Is proposer also the Payer ?", "Y"));
		
		request.setBasicdetailAttribute(basicDetails);
		
		List<PaymentInfo> paymentInfo = new ArrayList<>();
		request.setPaymentInfo(paymentInfo);
		
		List<Relation> relations = new ArrayList<>();
		Relation relation = new Relation();
		relation.setRole("POLICY-HOL");
		
		Party party = new Party();
		party.setIndvOrOrg("I");
		party.setPartyCode("PH0000449216");
		party.setInitial(".");
		party.setFirstName("ATUL");
		party.setMiddleName("");
		party.setLastName("DE");
		party.setOtherName("");
		party.setBusinessName("");
		party.setDateofBirth("01/01/1980");
		party.setCitizenshipId("");
		party.setSex("M");
		party.setNationality("IN");
		party.setOccupation("1056");
		party.setParentPartyCode("");
		party.setEffectiveDate("20/06/2024");
		party.setCompany("");
		
		List<ContactDetail> contactDetails = new ArrayList<>();
		
		ContactDetail mailing = new ContactDetail();
		mailing.setTypeOfContact("Mailing/Communication");
		mailing.setEffectiveDate("20/06/2024");
		mailing.setAddressLine1("B13 Ramgarh");
		mailing.setAddressLine2("Po Naktala");
		mailing.setAddressLine3(null);
		mailing.setPinCode("700047");
		mailing.setDistrictCode(null);
		mailing.setAreaCode(null);
		mailing.setAreaName("Kolkata");
		mailing.setCityCode("8998");
		mailing.setCityName("Kolkata");
		mailing.setStateCode("WB");
		mailing.setStateName("WEST BENGAL");
		mailing.setCountryCode("INDIA");
		mailing.setCountryName("INDIA");
		mailing.setLatitude(null);
		mailing.setLongitude(null);
		mailing.setTelephoneNumber(null);
		mailing.setMobileNumber("9051363419");
		mailing.setWhatsappNumber(null);
		mailing.setFaxNumber(null);
		mailing.setEmail1("adv1234@gmail.com");
		mailing.setEmail2(null);
		mailing.setEmail3(null);
		mailing.setDistrictTown(null);
		
		contactDetails.add(mailing);
		
		ContactDetail permanent = new ContactDetail();
		
		permanent.setTypeOfContact("Permanent");
		permanent.setEffectiveDate("20/06/2024");
		permanent.setAddressLine1("B13 Ramgarh");
		permanent.setAddressLine2("Po Naktala");
		permanent.setAddressLine3(null);
		permanent.setPinCode("700047");
		permanent.setDistrictCode(null);
		permanent.setAreaCode(null);
		permanent.setAreaName("Kolkata");
		permanent.setCityCode("8998");
		permanent.setCityName("Kolkata");
		permanent.setStateCode("WB");
		permanent.setStateName("WEST BENGAL");
		permanent.setCountryCode("INDIA");
		permanent.setCountryName("INDIA");
		permanent.setLatitude(null);
		permanent.setLongitude(null);
		permanent.setTelephoneNumber(null);
		permanent.setMobileNumber("9051363419");
		permanent.setWhatsappNumber(null);
		permanent.setFaxNumber(null);
		permanent.setEmail1("adv1234@gmail.com");
		permanent.setEmail2(null);
		permanent.setEmail3(null);
		permanent.setDistrictTown(null);
		
		contactDetails.add(permanent);
		party.setContactDetails(contactDetails);
		
		List<PartyDetail> partyDetails = new ArrayList<>();
		party.setPartyDetails(partyDetails);
		
		relation.setParty(party);
		
		List<Attribute> relationAttributes = new ArrayList<>();
		relation.setRelationAttribute(relationAttributes);
		
		relations.add(relation);
		request.setRelations(relations);
		
		List<Member> members = new ArrayList<>();
		Member member = new Member();
		
		member.setRiskCode("MEMBER");
		member.setRiskid(0);
		member.setRiskName("MEMBER");
		member.setInceptionDate("27/07/2023");
		member.setExpiryDate("26/07/2024");
		
		Party party3 = new Party();
		party3.setIndvOrOrg("I");
		party3.setPartyCode("PH0000449216");
		party3.setInitial("Mr.");
		party3.setFirstName("atul");
		party3.setMiddleName("");
		party3.setLastName("de");
		party3.setOtherName("");
		party3.setBusinessName("");
		party3.setDateofBirth("01/01/1980");
		party3.setCitizenshipId("");
		party3.setSex("M");
		party3.setNationality("IN");
		party3.setOccupation("1056");
		party3.setParentPartyCode("");
		party3.setEffectiveDate("20/06/2024");
		party3.setCompany("");
		party3.setFullName("atul de");
		party3.setPartyStatus("ACTIVE");
		party3.sethNICustomer(null);
		party3.setPriorityCustomer(null);
		party3.setIsTheMailingCommunicationAddressSameAsThePrimaryAddress(null);
		party3.setPolicyHolderalsoaMember(null);
		
		List<ContactDetail> contactDetails1 = new ArrayList<>();
		
		ContactDetail mailing1 = new ContactDetail();
		mailing1.setTypeOfContact("mailing1/Communication");
		mailing1.setEffectiveDate("20/06/2024");
		mailing1.setAddressLine1("B13 Ramgarh");
		mailing1.setAddressLine2("Po Naktala");
		mailing1.setAddressLine3(null);
		mailing1.setPinCode("700047");
		mailing1.setDistrictCode(null);
		mailing1.setAreaCode(null);
		mailing1.setAreaName("Kolkata");
		mailing1.setCityCode("8998");
		mailing1.setCityName("Kolkata");
		mailing1.setStateCode("WB");
		mailing1.setStateName("WEST BENGAL");
		mailing1.setCountryCode("INDIA");
		mailing1.setCountryName("INDIA");
		mailing1.setLatitude(null);
		mailing1.setLongitude(null);
		mailing1.setTelephoneNumber(null);
		mailing1.setMobileNumber("9051363419");
		mailing1.setWhatsappNumber(null);
		mailing1.setFaxNumber(null);
		mailing1.setEmail1("adv1234@gmail.com");
		mailing1.setEmail2(null);
		mailing1.setEmail3(null);
		mailing1.setDistrictTown(null);
		
		contactDetails1.add(mailing1);
		
		ContactDetail permanent1 = new ContactDetail();
		
		permanent1.setTypeOfContact("permanent1");
		permanent1.setEffectiveDate("20/06/2024");
		permanent1.setAddressLine1("B13 Ramgarh");
		permanent1.setAddressLine2("Po Naktala");
		permanent1.setAddressLine3(null);
		permanent1.setPinCode("700047");
		permanent1.setDistrictCode(null);
		permanent1.setAreaCode(null);
		permanent1.setAreaName("Kolkata");
		permanent1.setCityCode("8998");
		permanent1.setCityName("Kolkata");
		permanent1.setStateCode("WB");
		permanent1.setStateName("WEST BENGAL");
		permanent1.setCountryCode("INDIA");
		permanent1.setCountryName("INDIA");
		permanent1.setLatitude(null);
		permanent1.setLongitude(null);
		permanent1.setTelephoneNumber(null);
		permanent1.setMobileNumber("9051363419");
		permanent1.setWhatsappNumber(null);
		permanent1.setFaxNumber(null);
		permanent1.setEmail1("adv1234@gmail.com");
		permanent1.setEmail2(null);
		permanent1.setEmail3(null);
		permanent1.setDistrictTown(null);
		
		contactDetails1.add(permanent1);
		party3.setContactDetails(contactDetails);
		party3.setPartyDetails(null);
		member.setParty(party3);
		
		List<Attribute> memberDetails = new ArrayList<>();
		
		memberDetails.add(new Attribute("Title","Mr."));
		memberDetails.add(new Attribute("First Name","Atul"));
		memberDetails.add(new Attribute("Last Name 2","De"));
		memberDetails.add(new Attribute("Full Name","Atul De"));
		memberDetails.add(new Attribute("Gender","M"));
		memberDetails.add(new Attribute("Date of Birth","01/01/1980"));
		memberDetails.add(new Attribute("Age","34"));
		memberDetails.add(new Attribute("Relationship","24"));
		memberDetails.add(new Attribute("Mobile Number","9051363419"));
		memberDetails.add(new Attribute("Height (Feet)","5"));
		memberDetails.add(new Attribute("Height (Inch)","7"));
		memberDetails.add(new Attribute("Height of the Insured (in cms)","170"));
		memberDetails.add(new Attribute("Weight (in kgs)","65"));
		memberDetails.add(new Attribute("BMI","28"));
		memberDetails.add(new Attribute("Nationality","IN"));
		memberDetails.add(new Attribute("Occupation1","1056"));
		memberDetails.add(new Attribute("Annual Gross Income","100000"));
		memberDetails.add(new Attribute("Applicable Sum Insured","1000000"));
		memberDetails.add(new Attribute("Room Category","AN"));
		memberDetails.add(new Attribute("Marital status","SINGLE"));
		memberDetails.add(new Attribute("CEO Club Advisor Customer","N"));
		memberDetails.add(new Attribute("Is Member address same as that of proposer ?","Y"));
		memberDetails.add(new Attribute("Address Line 1","Y"));
		memberDetails.add(new Attribute("Address Line 2","Y"));
		memberDetails.add(new Attribute("Address Line 3","Y"));
		memberDetails.add(new Attribute("Policy-holder ZIP Code","700047"));
		memberDetails.add(new Attribute("Policy-holder City","Kolkata"));
		memberDetails.add(new Attribute("District Name","Kolkata"));
		memberDetails.add(new Attribute("Policy-holder Province","WEST BENGAL"));
		memberDetails.add(new Attribute("Flag",""));
		
		List<MultiSetAttribute> multisetAttribute = new ArrayList<>();
		
		List<Attribute> attributes = new ArrayList<>();
		
		attributes.add(new Attribute("Nominee Name", "Test Data"));
		attributes.add(new Attribute("Gender", "F"));
		attributes.add(new Attribute("Nominee Date of Birth", "15/05/2002"));
		attributes.add(new Attribute("Relationship with Proposer", "20"));
		attributes.add(new Attribute("Appointee Name", "Chiku"));
		attributes.add(new Attribute("Nominee %", "100"));
		
		MultiSetAttribute multisetAttribute1 = new MultiSetAttribute();
		multisetAttribute1.setAttributes(attributes);
		
		// need to add multiset
		
		//multisetAttribute.add(multisetAttribute1);
		
		List<Attribute> attributes1 = new ArrayList<>();
		
		attributes1.add(new Attribute("Previous Policy/Proposal Number", "123456789098765"));
		attributes1.add(new Attribute("Insurer", "Apollo Munich Health Insurance Co.Ltd."));
		attributes1.add(new Attribute("Sum Insured in Previous Policy", "1000000"));
		attributes1.add(new Attribute("Previous Policy Start Date", "02/06/2023"));
		attributes1.add(new Attribute("Previous Policy Expiry Date", "01/06/2024"));
		attributes1.add(new Attribute("Date of first enrollment", "02/06/2023"));
		attributes1.add(new Attribute("No of Claims", "0"));
		attributes1.add(new Attribute("Cumulative Bonus in Previous Policy", "0"));
		
		MultiSetAttribute multisetAttribute2 = new MultiSetAttribute();
		multisetAttribute2.setAttributes(attributes);
		
		
		member.setMemberDetails(memberDetails);
		members.add(member);
		
		request.setMembers(members);
		
		return request;
		
	}

	public Mono<String> saveFullProposal() {
		
		ProposalRequest saveFullProposalReq = buildRequest();
		return webClientBuilder.build()
				.post()
				.uri("http://10.10.13.160:7311/BaNCSServicesHL/api/BaNCSEnggUnderwritingServices/underwriting/14.0/engineering/saveFullProposal")
				.contentType(MediaType.APPLICATION_JSON)
				.bodyValue(saveFullProposalReq)
				.retrieve()
				.bodyToMono(String.class);
	}

}
