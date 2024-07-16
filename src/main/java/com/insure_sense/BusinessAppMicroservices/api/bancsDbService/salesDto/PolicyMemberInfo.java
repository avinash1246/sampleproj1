package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.salesDto;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;


@NoArgsConstructor
public class PolicyMemberInfo extends BaseEntity {

    public PolicyMemberInfo(Long policyId, Long partyId, Long insurableObjectId, Long insurableObjectRef,
                            Long memberId, Long householdId, String prefix, String firstName, String lastName,
                            String fullName, String panNumber, String aadhaarNumber, LocalDate dateOfBirth,
                            String gender, String panName, Boolean panVerified, Integer height, Integer weight,
                            Integer entryAge,Double ioSumInsured, Double ioDeductible, String relation) {
        this.policyId = policyId;
        this.partyId = partyId;
        this.insurableObjectId = insurableObjectId;
        this.insurableObjectRef = insurableObjectRef;
        this.memberId = memberId;
        this.householdId = householdId;
        this.prefix = prefix;
        this.firstName = firstName;
        this.lastName = lastName;
        this.fullName = fullName;
        this.panNumber = panNumber;
        this.aadhaarNumber = aadhaarNumber;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.panName = panName;
        this.panVerified = panVerified;
        this.height = height;
        this.weight = weight;
        this.entryAge = entryAge;
        this.ioSumInsured = ioSumInsured;
        this.ioDeductible = ioDeductible;
        this.relation = relation;
    }


    private Long policyId;

    private Long partyId;
    private Long insurableObjectId;
    private Long insurableObjectRef;
    private Long memberId;
    private Long householdId;
    private String prefix;
    private String firstName;
    private String lastName;
    private String fullName;
    private String panNumber;
    private String aadhaarNumber;

    @JsonFormat(pattern="dd-MM-yyyy")
    private LocalDate dateOfBirth;
    private String gender;
    private String panName;
    private Boolean panVerified;
    private Integer height;
    private Integer weight;
    private Integer entryAge;

    private Double ioSumInsured;

    private Double ioDeductible;

    private String relation;

    public Long getPolicyId() {
        return policyId;
    }

    public void setPolicyId(Long policyId) {
        this.policyId = policyId;
    }

    public Long getInsurableObjectId() {
        return insurableObjectId;
    }

    public void setInsurableObjectId(Long insurableObjectId) {
        this.insurableObjectId = insurableObjectId;
    }

    public Long getPartyId() {
        return partyId;
    }

    public void setPartyId(Long partyId) {
        this.partyId = partyId;
    }

    public Long getInsurableObjectRef() {
        return insurableObjectRef;
    }

    public void setInsurableObjectRef(Long insurableObjectRef) {
        this.insurableObjectRef = insurableObjectRef;
    }

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public Long getHouseholdId() {
        return householdId;
    }

    public void setHouseholdId(Long householdId) {
        this.householdId = householdId;
    }

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

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
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

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPanName() {
        return panName;
    }

    public void setPanName(String panName) {
        this.panName = panName;
    }

    public Boolean getPanVerified() {
        return panVerified;
    }

    public void setPanVerified(Boolean panVerified) {
        this.panVerified = panVerified;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }
//
//    public List<MemberPedInfo> getPedInfo() {
//        return pedInfo;
//    }
//
//    public void setPedInfo(List<MemberPedInfo> pedInfo) {
//        this.pedInfo = pedInfo;
//    }
//
//    public List<MemberMedHistoryInfo> getMedHistory() {
//        return medHistory;
//    }
//
//    public void setMedHistory(List<MemberMedHistoryInfo> medHistory) {
//        this.medHistory = medHistory;
//    }

//    public List<PolicyQuestion> getUwInfoArray() {
//        return uwInfoArray;
//    }
//
//    public void setUwInfoArray(List<PolicyQuestion> uwInfoArray) {
//        this.uwInfoArray = uwInfoArray;
//    }

    public Integer getEntryAge() {
        return entryAge;
    }

    public void setEntryAge(Integer entryAge) {
        this.entryAge = entryAge;
    }

    public Double getIoDeductible() {
        return ioDeductible;
    }

    public void setIoDeductible(Double ioDeductible) {
        this.ioDeductible = ioDeductible;
    }

    public Double getIoSumInsured() {
        return ioSumInsured;
    }

    public void setIoSumInsured(Double ioSumInsured) {
        this.ioSumInsured = ioSumInsured;
    }

    public String getRelation() {
        return relation;
    }

    public void setRelation(String relation) {
        this.relation = relation;
    }
}
