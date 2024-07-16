package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.bancsdto.saveParty;

import java.util.List;

public class SavePartyRequest {
	private BasicDetails basicDetails;
	private PartyDetails partyDetails;
	private List<ContactDetails> contactDetails;
	
	

	public BasicDetails getBasicDetails() {
		return basicDetails;
	}

	public void setBasicDetails(BasicDetails basicDetails) {
		this.basicDetails = basicDetails;
	}

	public PartyDetails getPartyDetails() {
		return partyDetails;
	}

	public void setPartyDetails(PartyDetails partyDetails) {
		this.partyDetails = partyDetails;
	}

	public List<ContactDetails> getContactDetails() {
		return contactDetails;
	}

	public void setContactDetails(List<ContactDetails> contactDetails) {
		this.contactDetails = contactDetails;
	}

	public static class BasicDetails {
		private String indvOrOrg;
		private String firstName;
		private String middleName;
		private String lastName;
		private String dateofBirth;
		private String gender;
		public String getIndvOrOrg() {
			return indvOrOrg;
		}
		public void setIndvOrOrg(String indvOrOrg) {
			this.indvOrOrg = indvOrOrg;
		}
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getMiddleName() {
			return middleName;
		}
		public void setMiddleName(String middleName) {
			this.middleName = middleName;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		public String getDateofBirth() {
			return dateofBirth;
		}
		public void setDateofBirth(String dateofBirth) {
			this.dateofBirth = dateofBirth;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		
	}

	public static class PartyDetails {
		private String gstRegnType;

		public String getGstRegnType() {
			return gstRegnType;
		}

		public void setGstRegnType(String gstRegnType) {
			this.gstRegnType = gstRegnType;
		}
	}

	public static class ContactDetails {
		private String typeOfContact;
		private String addressline1;
		private String addressline2;
		private String pinCode;
		private String cityName;
		private String stateName;
		private String mobileNumber;
		private String email;
		public String getTypeOfContact() {
			return typeOfContact;
		}
		public void setTypeOfContact(String typeOfContact) {
			this.typeOfContact = typeOfContact;
		}
		public String getPinCode() {
			return pinCode;
		}
		public void setPinCode(String pinCode) {
			this.pinCode = pinCode;
		}
		public String getCityName() {
			return cityName;
		}
		public void setCityName(String cityName) {
			this.cityName = cityName;
		}
		public String getStateName() {
			return stateName;
		}
		public void setStateName(String stateName) {
			this.stateName = stateName;
		}
		public String getMobileNumber() {
			return mobileNumber;
		}
		public void setMobileNumber(String mobileNumber) {
			this.mobileNumber = mobileNumber;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getAddressline1() {
			return addressline1;
		}
		public void setAddressline1(String addressline1) {
			this.addressline1 = addressline1;
		}
		public String getAddressline2() {
			return addressline2;
		}
		public void setAddressline2(String addressline2) {
			this.addressline2 = addressline2;
		}
		
		
	}
}
