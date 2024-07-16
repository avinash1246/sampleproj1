package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.salesDto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;



@AllArgsConstructor
public class InsurableObject extends BaseEntity {

    public InsurableObject() {
    }

    private Long insurableObjectId;

    private String insurableObjectTypeCd;

    private String ioDescription;
    private String streetNumber;
    private String streetName;
    private String sublocality;
    private Long geographicLocationId;

    @JsonIgnore
    private GeographicLocation geographicLocation;

    public String getInsurableObjectTypeCd() {
        return insurableObjectTypeCd;
    }

    public void setInsurableObjectTypeCd(String insurableObjectTypeCd) {
        this.insurableObjectTypeCd = insurableObjectTypeCd;
    }

    public Long getInsurableObjectId() {
        return insurableObjectId;
    }

    public void setInsurableObjectId(Long insurableObjectId) {
        this.insurableObjectId = insurableObjectId;
    }

    public GeographicLocation getGeographicLocation() {
        return geographicLocation;
    }

    public void setGeographicLocation(GeographicLocation geographicLocation) {
        this.geographicLocation = geographicLocation;
    }

    public String getIoDescription() {
        return ioDescription;
    }

    public void setIoDescription(String ioDescription) {
        this.ioDescription = ioDescription;
    }

    public Long getGeographicLocationId() {
        return geographicLocationId;
    }

    public void setGeographicLocationId(Long geographicLocationId) {
        this.geographicLocationId = geographicLocationId;
    }

    public String getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(String streetNumber) {
        this.streetNumber = streetNumber;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getSublocality() {
        return sublocality;
    }

    public void setSublocality(String sublocality) {
        this.sublocality = sublocality;
    }
}
