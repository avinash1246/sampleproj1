package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.dto;

import java.util.List;

import org.springframework.data.redis.domain.geo.GeoLocation;
 
import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.salesDto.Country;
import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.salesDto.Locality;
import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.salesDto.State;
 
public class Location {
	
	 private Country country;
	 private String streetName;
	 private List<String> types;
	 private String distanceToFireStation;
	 private GeoLocation geoLocation;
	 private String displayAddress;
	 private String postalCode;
	 private String placeID;
	 private Locality locality;
	 private State state;
	public Country getCountry() {
		return country;
	}
	public void setCountry(Country country) {
		this.country = country;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public List<String> getTypes() {
		return types;
	}
	public void setTypes(List<String> types) {
		this.types = types;
	}
	public String getDistanceToFireStation() {
		return distanceToFireStation;
	}
	public void setDistanceToFireStation(String distanceToFireStation) {
		this.distanceToFireStation = distanceToFireStation;
	}
	public GeoLocation getGeoLocation() {
		return geoLocation;
	}
	public void setGeoLocation(GeoLocation geoLocation) {
		this.geoLocation = geoLocation;
	}
	public String getDisplayAddress() {
		return displayAddress;
	}
	public void setDisplayAddress(String displayAddress) {
		this.displayAddress = displayAddress;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public String getPlaceID() {
		return placeID;
	}
	public void setPlaceID(String placeID) {
		this.placeID = placeID;
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
 
}
