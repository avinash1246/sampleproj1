package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.bancsdto.policy;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
public class PremiumDiscountLoad {

    private Long rate;
    private String type;
    private Double impactedamount;
    private String typeofloadingdiscount;
    private String userInput;

    public Long getRate() {
        return rate;
    }

    public void setRate(Long rate) {
        this.rate = rate;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getImpactedamount() {
        return impactedamount;
    }

    public void setImpactedamount(Double impactedamount) {
        this.impactedamount = impactedamount;
    }

    public String getTypeofloadingdiscount() {
        return typeofloadingdiscount;
    }

    public void setTypeofloadingdiscount(String typeofloadingdiscount) {
        this.typeofloadingdiscount = typeofloadingdiscount;
    }

    public String getUserInput() {
        return userInput;
    }

    public void setUserInput(String userInput) {
        this.userInput = userInput;
    }
}
