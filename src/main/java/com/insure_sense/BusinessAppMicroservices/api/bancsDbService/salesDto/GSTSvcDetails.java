package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.salesDto;

import lombok.NoArgsConstructor;


import java.util.HashSet;
import java.util.Set;


@NoArgsConstructor
public class GSTSvcDetails {

    public GSTSvcDetails(Long saccd, String sdes) {
        this.saccd = saccd;
        this.sdes = sdes;
    }


    private Long saccd;

    private String sdes;

    private Set<GSTData> gstDataSet = new HashSet<>();

    public Long getSaccd() {
        return saccd;
    }

    public void setSaccd(Long saccd) {
        this.saccd = saccd;
    }

    public String getSdes() {
        return sdes;
    }

    public void setSdes(String sdes) {
        this.sdes = sdes;
    }

}
