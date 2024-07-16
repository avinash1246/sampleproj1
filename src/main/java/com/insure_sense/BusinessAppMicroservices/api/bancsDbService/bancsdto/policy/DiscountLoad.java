package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.bancsdto.policy;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
public class DiscountLoad {

    private String typeofloadingdiscount;
    private String userInput;

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
