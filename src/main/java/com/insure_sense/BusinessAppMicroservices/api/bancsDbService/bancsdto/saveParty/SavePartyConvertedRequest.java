package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.bancsdto.saveParty;

import java.util.List;

public class SavePartyConvertedRequest {
	
	private Party party;
	
	public static class Party {
		private String indvOrOrg;
	    private String partyCode;
	    private String firstName;
	    private String middleName;
	    private String lastName;
	    private String otherName;
	    private String businessName;
	    private String initial;
	    private String citizenshipId;
	    private String sex;
	    private String nationality;
	    private String occupation;
	    private String parentPartyCode;
	    private String effectiveDate;
	    private String company;
	    private String userCode;
	    private String roleCode;
	    private String dateofBirth;
	    private String stakeHolder;
	    private List<PartyDetails> partyDetails;
	    private List<ContactDetails> contactDetails;
	    private String partyStatus;
	    private String createOrUpdateFlag;
	    private String wellnessIdFlag;
	    private String policyNumber;
	    private String partyName;
	    
	    
	    
	    
	    public String getIndvOrOrg() {
			return indvOrOrg;
		}

		public void setIndvOrOrg(String indvOrOrg) {
			this.indvOrOrg = indvOrOrg;
		}

		public String getPartyCode() {
			return partyCode;
		}

		public void setPartyCode(String partyCode) {
			this.partyCode = partyCode;
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

		public String getOtherName() {
			return otherName;
		}

		public void setOtherName(String otherName) {
			this.otherName = otherName;
		}

		public String getBusinessName() {
			return businessName;
		}

		public void setBusinessName(String businessName) {
			this.businessName = businessName;
		}

		public String getInitial() {
			return initial;
		}

		public void setInitial(String initial) {
			this.initial = initial;
		}

		public String getCitizenshipId() {
			return citizenshipId;
		}

		public void setCitizenshipId(String citizenshipId) {
			this.citizenshipId = citizenshipId;
		}

		public String getSex() {
			return sex;
		}

		public void setSex(String sex) {
			this.sex = sex;
		}

		public String getNationality() {
			return nationality;
		}

		public void setNationality(String nationality) {
			this.nationality = nationality;
		}

		public String getOccupation() {
			return occupation;
		}

		public void setOccupation(String occupation) {
			this.occupation = occupation;
		}

		public String getParentPartyCode() {
			return parentPartyCode;
		}

		public void setParentPartyCode(String parentPartyCode) {
			this.parentPartyCode = parentPartyCode;
		}

		public String getEffectiveDate() {
			return effectiveDate;
		}

		public void setEffectiveDate(String effectiveDate) {
			this.effectiveDate = effectiveDate;
		}

		public String getCompany() {
			return company;
		}

		public void setCompany(String company) {
			this.company = company;
		}

		public String getUserCode() {
			return userCode;
		}

		public void setUserCode(String userCode) {
			this.userCode = userCode;
		}

		public String getRoleCode() {
			return roleCode;
		}

		public void setRoleCode(String roleCode) {
			this.roleCode = roleCode;
		}

		public String getDateofBirth() {
			return dateofBirth;
		}

		public void setDateofBirth(String dateofBirth) {
			this.dateofBirth = dateofBirth;
		}

		public String getStakeHolder() {
			return stakeHolder;
		}

		public void setStakeHolder(String stakeHolder) {
			this.stakeHolder = stakeHolder;
		}

		public List<PartyDetails> getPartyDetails() {
			return partyDetails;
		}

		public void setPartyDetails(List<PartyDetails> partyDetails) {
			this.partyDetails = partyDetails;
		}

		public List<ContactDetails> getContactDetails() {
			return contactDetails;
		}

		public void setContactDetails(List<ContactDetails> contactDetails) {
			this.contactDetails = contactDetails;
		}

		public String getPartyStatus() {
			return partyStatus;
		}

		public void setPartyStatus(String partyStatus) {
			this.partyStatus = partyStatus;
		}

		public String getCreateOrUpdateFlag() {
			return createOrUpdateFlag;
		}

		public void setCreateOrUpdateFlag(String createOrUpdateFlag) {
			this.createOrUpdateFlag = createOrUpdateFlag;
		}

		public String getWellnessIdFlag() {
			return wellnessIdFlag;
		}

		public void setWellnessIdFlag(String wellnessIdFlag) {
			this.wellnessIdFlag = wellnessIdFlag;
		}

		public String getPolicyNumber() {
			return policyNumber;
		}

		public void setPolicyNumber(String policyNumber) {
			this.policyNumber = policyNumber;
		}

		public String getPartyName() {
			return partyName;
		}

		public void setPartyName(String partyName) {
			this.partyName = partyName;
		}
	}

	

	public static class PartyDetails {
        private Attributes attributes;


        public static class Attributes {
            private String attributeName;
            private String attributeValue;
			public String getAttributeName() {
				return attributeName;
			}
			public void setAttributeName(String attributeName) {
				this.attributeName = attributeName;
			}
			public String getAttributeValue() {
				return attributeValue;
			}
			public void setAttributeValue(String attributeValue) {
				this.attributeValue = attributeValue;
			}
			public Attributes(String attributeName, String attributeValue) {
				super();
				this.attributeName = attributeName;
				this.attributeValue = attributeValue;
			}

        }

		public Attributes getAttributes() {
			return attributes;
		}


		public void setAttributes(Attributes attributes) {
			this.attributes = attributes;
		}


		public PartyDetails(Attributes attributes) {
			super();
			this.attributes = attributes;
		}
		
		
    }

    public static class ContactDetails {
        private String typeOfContact;
        private String effectiveDate;
        private String addressLine1;
        private String addressLine2;
        private String addressLine3;
        private String pinCode;
        private String districtCode;
        private String areaCode;
        private String areaName;
        private String cityCode;
        private String cityName;
        private String stateCode;
        private String stateName;
        private String countryCode;
        private String countryName;
        private String latitude;
        private String longitude;
        private String telephoneNumber;
        private String mobileNumber;
        private String whatsappNumber;
        private String faxNumber;
        private String email1;
        private String email2;
        private String email3;
        private String districtTown;
		public String getTypeOfContact() {
			return typeOfContact;
		}
		public void setTypeOfContact(String typeOfContact) {
			this.typeOfContact = typeOfContact;
		}
		public String getEffectiveDate() {
			return effectiveDate;
		}
		public void setEffectiveDate(String effectiveDate) {
			this.effectiveDate = effectiveDate;
		}
		public String getAddressLine1() {
			return addressLine1;
		}
		public void setAddressLine1(String addressLine1) {
			this.addressLine1 = addressLine1;
		}
		public String getAddressLine2() {
			return addressLine2;
		}
		public void setAddressLine2(String addressLine2) {
			this.addressLine2 = addressLine2;
		}
		public String getAddressLine3() {
			return addressLine3;
		}
		public void setAddressLine3(String addressLine3) {
			this.addressLine3 = addressLine3;
		}
		public String getPinCode() {
			return pinCode;
		}
		public void setPinCode(String pinCode) {
			this.pinCode = pinCode;
		}
		public String getDistrictCode() {
			return districtCode;
		}
		public void setDistrictCode(String districtCode) {
			this.districtCode = districtCode;
		}
		public String getAreaCode() {
			return areaCode;
		}
		public void setAreaCode(String areaCode) {
			this.areaCode = areaCode;
		}
		public String getAreaName() {
			return areaName;
		}
		public void setAreaName(String areaName) {
			this.areaName = areaName;
		}
		public String getCityCode() {
			return cityCode;
		}
		public void setCityCode(String cityCode) {
			this.cityCode = cityCode;
		}
		public String getCityName() {
			return cityName;
		}
		public void setCityName(String cityName) {
			this.cityName = cityName;
		}
		public String getStateCode() {
			return stateCode;
		}
		public void setStateCode(String stateCode) {
			this.stateCode = stateCode;
		}
		public String getStateName() {
			return stateName;
		}
		public void setStateName(String stateName) {
			this.stateName = stateName;
		}
		public String getCountryCode() {
			return countryCode;
		}
		public void setCountryCode(String countryCode) {
			this.countryCode = countryCode;
		}
		public String getCountryName() {
			return countryName;
		}
		public void setCountryName(String countryName) {
			this.countryName = countryName;
		}
		public String getLatitude() {
			return latitude;
		}
		public void setLatitude(String latitude) {
			this.latitude = latitude;
		}
		public String getLongitude() {
			return longitude;
		}
		public void setLongitude(String longitude) {
			this.longitude = longitude;
		}
		public String getTelephoneNumber() {
			return telephoneNumber;
		}
		public void setTelephoneNumber(String telephoneNumber) {
			this.telephoneNumber = telephoneNumber;
		}
		public String getMobileNumber() {
			return mobileNumber;
		}
		public void setMobileNumber(String mobileNumber) {
			this.mobileNumber = mobileNumber;
		}
		public String getWhatsappNumber() {
			return whatsappNumber;
		}
		public void setWhatsappNumber(String whatsappNumber) {
			this.whatsappNumber = whatsappNumber;
		}
		public String getFaxNumber() {
			return faxNumber;
		}
		public void setFaxNumber(String faxNumber) {
			this.faxNumber = faxNumber;
		}
		public String getEmail1() {
			return email1;
		}
		public void setEmail1(String email1) {
			this.email1 = email1;
		}
		public String getEmail2() {
			return email2;
		}
		public void setEmail2(String email2) {
			this.email2 = email2;
		}
		public String getEmail3() {
			return email3;
		}
		public void setEmail3(String email3) {
			this.email3 = email3;
		}
		public String getDistrictTown() {
			return districtTown;
		}
		public void setDistrictTown(String districtTown) {
			this.districtTown = districtTown;
		}
		public ContactDetails(String typeOfContact, String effectiveDate, String addressLine1, String addressLine2,
				String addressLine3, String pinCode, String districtCode, String areaCode, String areaName,
				String cityCode, String cityName, String stateCode, String stateName, String countryCode,
				String countryName, String latitude, String longitude, String telephoneNumber, String mobileNumber,
				String whatsappNumber, String faxNumber, String email1, String email2, String email3,
				String districtTown) {
			super();
			this.typeOfContact = typeOfContact;
			this.effectiveDate = effectiveDate;
			this.addressLine1 = addressLine1;
			this.addressLine2 = addressLine2;
			this.addressLine3 = addressLine3;
			this.pinCode = pinCode;
			this.districtCode = districtCode;
			this.areaCode = areaCode;
			this.areaName = areaName;
			this.cityCode = cityCode;
			this.cityName = cityName;
			this.stateCode = stateCode;
			this.stateName = stateName;
			this.countryCode = countryCode;
			this.countryName = countryName;
			this.latitude = latitude;
			this.longitude = longitude;
			this.telephoneNumber = telephoneNumber;
			this.mobileNumber = mobileNumber;
			this.whatsappNumber = whatsappNumber;
			this.faxNumber = faxNumber;
			this.email1 = email1;
			this.email2 = email2;
			this.email3 = email3;
			this.districtTown = districtTown;
		}
		
		

       
    }

	public Party getParty() {
		return party;
	}

	public void setParty(Party party) {
		this.party = party;
	}
    
}
