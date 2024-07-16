package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.salesDto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.NoArgsConstructor;
@NoArgsConstructor
public class PolicyPropertyInfo extends BaseEntity {
    public PolicyPropertyInfo(Long policyId, Long insurableObjectId, Long insurableObjectRef,
                              String occTypeCd, String occCd, String occDescription, Float carpetArea,
                              Float rateCostConstruction, String floor, Integer age, String refId,
                              Boolean isTopLocation, String description, Double ioSumInsured,
                              Double valueAtRisk) {
        this.policyId = policyId;
        this.insurableObjectId = insurableObjectId;
        this.insurableObjectRef = insurableObjectRef;
        this.occTypeCd = occTypeCd;
        this.occCd = occCd;
        this.occDescription = occDescription;
        this.carpetArea = carpetArea;
        this.rateCostConstruction = rateCostConstruction;
        this.floor = floor;
        this.age = age;
        this.refId = refId;
        this.isTopLocation = isTopLocation;
        this.description = description;
        this.ioSumInsured = ioSumInsured;
        this.valueAtRisk = valueAtRisk;
    }


    private Long policyId;


    private Long insurableObjectId;

    private Long insurableObjectRef;
    private String occTypeCd;
    private String occCd;
    private String occDescription;
    private Float carpetArea;
    private Float rateCostConstruction;
    private String floor;
    private Integer age;
    private String refId;
    private Boolean isTopLocation;
    private String description;
    private Double ioSumInsured;
    private Double valueAtRisk;

    @JsonIgnore
    private PolicyExt policyExt;

    @JsonIgnore
    private InsurableObject insurableObject;

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

    public Long getInsurableObjectRef() {
        return insurableObjectRef;
    }

    public void setInsurableObjectRef(Long insurableObjectRef) {
        this.insurableObjectRef = insurableObjectRef;
    }

    public String getOccTypeCd() {
        return occTypeCd;
    }

    public void setOccTypeCd(String occTypeCd) {
        this.occTypeCd = occTypeCd;
    }

    public String getOccCd() {
        return occCd;
    }

    public void setOccCd(String occCd) {
        this.occCd = occCd;
    }

    public String getOccDescription() {
        return occDescription;
    }

    public void setOccDescription(String occDescription) {
        this.occDescription = occDescription;
    }

    public Float getCarpetArea() {
        return carpetArea;
    }

    public void setCarpetArea(Float carpetArea) {
        this.carpetArea = carpetArea;
    }

    public Float getRateCostConstruction() {
        return rateCostConstruction;
    }

    public void setRateCostConstruction(Float rateCostConstruction) {
        this.rateCostConstruction = rateCostConstruction;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getRefId() {
        return refId;
    }

    public void setRefId(String refId) {
        this.refId = refId;
    }

    public Boolean getTopLocation() {
        return isTopLocation;
    }

    public void setTopLocation(Boolean topLocation) {
        isTopLocation = topLocation;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getIoSumInsured() {
        return ioSumInsured;
    }

    public void setIoSumInsured(Double ioSumInsured) {
        this.ioSumInsured = ioSumInsured;
    }

    public Double getValueAtRisk() {
        return valueAtRisk;
    }

    public void setValueAtRisk(Double valueAtRisk) {
        this.valueAtRisk = valueAtRisk;
    }
}

