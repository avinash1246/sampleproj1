package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.bancsdto.party;

import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.bancsdto.common.Attribute;
import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.bancsdto.policy.ContactDetail;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
public class Party {

    private String createOrUpdateFlag;
    private String indvOrOrg;
    private String partyCode;
    private String initial;
    private String firstName;
    private String middleName;
    private String lastName;
    private String otherName;
    private String businessName;
    private String dateofBirth;
    private String citizenshipId;
    private String sex;
    private String nationality;
    private String occupation;
    private String parentPartyCode;
    private String effectiveDate;
    private String company;
    private String userCode;
    private String roleCode;
    private String stakeHolder;
    //e.g. "POLICY-HOL"
    private String partyStatus;
    private String partyName;
    private List<ContactDetail> contactDetails;
    private List<PartyDetail> partyDetails;
    private List<Attribute> relationAttribute;
    private List<String> relatedPartyCodes;
    private String wellnessIdFlag;
    private String policyNumber;
    private String fullName;
    private String hNICustomer;
    private String priorityCustomer;
    private String isTheMailingCommunicationAddressSameAsThePrimaryAddress;
    private String policyHolderalsoaMember;

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

    public String getInitial() {
        return initial;
    }

    public void setInitial(String initial) {
        this.initial = initial;
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

    public String getDateofBirth() {
        return dateofBirth;
    }

    public void setDateofBirth(String dateofBirth) {
        this.dateofBirth = dateofBirth;
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

    public List<ContactDetail> getContactDetails() {
        return contactDetails;
    }

    public void setContactDetails(List<ContactDetail> contactDetails) {
        this.contactDetails = contactDetails;
    }

    public List<PartyDetail> getPartyDetails() {
        return partyDetails;
    }

    public void setPartyDetails(List<PartyDetail> partyDetails) {
        this.partyDetails = partyDetails;
    }

    public List<Attribute> getRelationAttribute() {
        return relationAttribute;
    }

    public void setRelationAttribute(List<Attribute> relationAttribute) {
        this.relationAttribute = relationAttribute;
    }

    public List<String> getRelatedPartyCodes() {
        return relatedPartyCodes;
    }

    public void setRelatedPartyCodes(List<String> relatedPartyCodes) {
        this.relatedPartyCodes = relatedPartyCodes;
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

    public String getStakeHolder() {
        return stakeHolder;
    }

    public void setStakeHolder(String stakeHolder) {
        this.stakeHolder = stakeHolder;
    }

    public String getPartyStatus() {
        return partyStatus;
    }

    public void setPartyStatus(String partyStatus) {
        this.partyStatus = partyStatus;
    }

    public String getPartyName() {
        return partyName;
    }

    public void setPartyName(String partyName) {
        this.partyName = partyName;
    }

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String gethNICustomer() {
		return hNICustomer;
	}

	public void sethNICustomer(String hNICustomer) {
		this.hNICustomer = hNICustomer;
	}

	public String getPriorityCustomer() {
		return priorityCustomer;
	}

	public void setPriorityCustomer(String priorityCustomer) {
		this.priorityCustomer = priorityCustomer;
	}

	public String getIsTheMailingCommunicationAddressSameAsThePrimaryAddress() {
		return isTheMailingCommunicationAddressSameAsThePrimaryAddress;
	}

	public void setIsTheMailingCommunicationAddressSameAsThePrimaryAddress(
			String isTheMailingCommunicationAddressSameAsThePrimaryAddress) {
		this.isTheMailingCommunicationAddressSameAsThePrimaryAddress = isTheMailingCommunicationAddressSameAsThePrimaryAddress;
	}

	public String getPolicyHolderalsoaMember() {
		return policyHolderalsoaMember;
	}

	public void setPolicyHolderalsoaMember(String policyHolderalsoaMember) {
		this.policyHolderalsoaMember = policyHolderalsoaMember;
	}
    
    
}
