package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.salesDto;

import lombok.NoArgsConstructor;


import java.util.HashSet;
import java.util.Set;


@NoArgsConstructor
public class GSTPdctDetails {

    public GSTPdctDetails(Long hsncd, String gdes) {
        this.hsncd = hsncd;
        this.gdes = gdes;
    }


    private Long hsncd;

    private String gdes;

    private Set<GSTData> gstDataSet = new HashSet<>();

    public Long getHsncd() {
        return hsncd;
    }

    public void setHsncd(Long hdncd) {
        this.hsncd = hdncd;
    }

    public String getGdes() {
        return gdes;
    }

    public void setGdes(String gdes) {
        this.gdes = gdes;
    }

}
