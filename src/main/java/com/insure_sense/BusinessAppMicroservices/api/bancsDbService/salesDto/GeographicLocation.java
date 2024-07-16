package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.salesDto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;


import java.util.List;


@AllArgsConstructor
/*@Table(uniqueConstraints={@UniqueConstraint(columnNames={"placeID"})})*/
public class GeographicLocation extends BaseEntity {

    public GeographicLocation() {
    }

    public GeographicLocation(Long geographicLocationId, String gmID, String placeID, String name,
                              String icon, String displayAddress, int postalCode, String streetNumber,
                              String streetName, String sublocality, String[] types, Locality locality,
                              State state, Country country, String vicinity, String url, Location geoLocation,
                              Float elevation, Float distwater, String distanceToFireStation) {
        this.geographicLocationId = geographicLocationId;
        this.gmID = gmID;
        this.placeID = placeID;
        this.name = name;
        this.icon = icon;
        this.displayAddress = displayAddress;
        this.postalCode = postalCode;
        this.streetNumber = streetNumber;
        this.streetName = streetName;
        this.sublocality = sublocality;
        this.types = types;
        this.locality = locality;
        this.state = state;
        this.country = country;
        this.vicinity = vicinity;
        this.url = url;
        this.geoLocation = geoLocation;
        this.elevation = elevation;
        this.distwater = distwater;
        this.distanceToFireStation = distanceToFireStation;
    }

    public GeographicLocation(Long geographicLocationId) {
        this.geographicLocationId = geographicLocationId;
    }


    private Long geographicLocationId;

    private String gmID;

/*    @Column(unique = true)*/
    private String placeID;

    private String name;
    private String icon;
    private String displayAddress;
    private int postalCode;
    private String streetNumber;
    private String streetName;
    private String sublocality;
    private String[] types;

    @JsonIgnore
    private List<InsurableObject> insurableObject;

    private Locality locality;

    private State state;

    private Country country;

    private String vicinity;
    private String url;

    private Location geoLocation;
    private Float elevation;
    private Float distwater;
    private String distanceToFireStation;

    public Long getGeographicLocationId() {
        return geographicLocationId;
    }

    public void setGeographicLocationId(Long geographicLocationId) {
        this.geographicLocationId = geographicLocationId;
    }

    public String getGmID() {
        return gmID;
    }

    public void setGmID(String gmID) {
        this.gmID = gmID;
    }

    public String getPlaceID() {
        return placeID;
    }

    public void setPlaceID(String placeID) {
        this.placeID = placeID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getDisplayAddress() {
        return displayAddress;
    }

    public void setDisplayAddress(String displayAddress) {
        this.displayAddress = displayAddress;
    }

    public int getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
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

    public String[] getTypes() {
        return types;
    }

    public void setTypes(String[] types) {
        this.types = types;
    }

    public Locality getLocality() {
        return locality;
    }

    public void setLocality(Locality locality) {
        this.locality = locality;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public String getVicinity() {
        return vicinity;
    }

    public void setVicinity(String vicinity) {
        this.vicinity = vicinity;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Location getGeoLocation() {
        return geoLocation;
    }

    public void setGeoLocation(Location geoLocation) {
        this.geoLocation = geoLocation;
    }

    public Float getElevation() {
        return elevation;
    }

    public void setElevation(Float elevation) {
        this.elevation = elevation;
    }

    public Float getDistwater() {
        return distwater;
    }

    public void setDistwater(Float distwater) {
        this.distwater = distwater;
    }

    public String getDistanceToFireStation() {
        return distanceToFireStation;
    }

    public void setDistanceToFireStation(String distanceToFireStation) {
        this.distanceToFireStation = distanceToFireStation;
    }
}
