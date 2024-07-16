package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.salesDto;

import lombok.NoArgsConstructor;



@NoArgsConstructor
public class Location {

    public Location(Double lat, Double lng) {
        this.lat = lat;
        this.lng = lng;
    }

    Double lat = null;
    Double lng = null;

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Double getLng() {
        return lng;
    }

    public void setLng(Double lng) {
        this.lng = lng;
    }
}
