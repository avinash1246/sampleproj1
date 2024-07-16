package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.dto;

public class PolicyMemberInfo {
	private String prefix;
    private String firstName;
    private String lastName;
    private String panNumber;
    private String aadhaarNumber;
    private String dateOfBirth;
    private String gender;
    private String height;
    private String weight;
    private int insurableObjectRef;
    private String ioSumInsuredCd;
    private int ioSumInsured;
    private String ioDeductibleCd;
    private int ioDeductible;
    private Object addOns;
    private Object uwInfoArray;
    private int entryAge;
    private String fullName;
	public String getPrefix() {
		return prefix;
	}
	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPanNumber() {
		return panNumber;
	}
	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}
	public String getAadhaarNumber() {
		return aadhaarNumber;
	}
	public void setAadhaarNumber(String aadhaarNumber) {
		this.aadhaarNumber = aadhaarNumber;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getHeight() {
		return height;
	}
	public void setHeight(String height) {
		this.height = height;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public int getInsurableObjectRef() {
		return insurableObjectRef;
	}
	public void setInsurableObjectRef(int insurableObjectRef) {
		this.insurableObjectRef = insurableObjectRef;
	}
	public String getIoSumInsuredCd() {
		return ioSumInsuredCd;
	}
	public void setIoSumInsuredCd(String ioSumInsuredCd) {
		this.ioSumInsuredCd = ioSumInsuredCd;
	}
	public int getIoSumInsured() {
		return ioSumInsured;
	}
	public void setIoSumInsured(int ioSumInsured) {
		this.ioSumInsured = ioSumInsured;
	}
	public String getIoDeductibleCd() {
		return ioDeductibleCd;
	}
	public void setIoDeductibleCd(String ioDeductibleCd) {
		this.ioDeductibleCd = ioDeductibleCd;
	}
	public int getIoDeductible() {
		return ioDeductible;
	}
	public void setIoDeductible(int ioDeductible) {
		this.ioDeductible = ioDeductible;
	}
	public Object getAddOns() {
		return addOns;
	}
	public void setAddOns(Object addOns) {
		this.addOns = addOns;
	}
	public Object getUwInfoArray() {
		return uwInfoArray;
	}
	public void setUwInfoArray(Object uwInfoArray) {
		this.uwInfoArray = uwInfoArray;
	}
	public int getEntryAge() {
		return entryAge;
	}
	public void setEntryAge(int entryAge) {
		this.entryAge = entryAge;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
}
