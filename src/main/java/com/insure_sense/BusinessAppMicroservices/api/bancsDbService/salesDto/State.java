package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.salesDto;

import lombok.NoArgsConstructor;

import jakarta.persistence.Embeddable;


@NoArgsConstructor
public class State {

    public State(String shrt, String lng) {
        this.shrt = shrt;
        this.lng = lng;
    }

    String shrt = null;
    String lng = null;

    public String getShrt() {
        return shrt;
    }

    public void setShrt(String shrt) {
        this.shrt = shrt;
    }

    public String getLng() {
        return lng;
    }

    public void setLng(String lng) {
        this.lng = lng;
    }

}
