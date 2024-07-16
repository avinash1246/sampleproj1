package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.bancsdto.policy;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
public class Answer {

    private String code;
    private String value;
    private String freeTextIndicator;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getFreeTextIndicator() {
        return freeTextIndicator;
    }

    public void setFreeTextIndicator(String freeTextIndicator) {
        this.freeTextIndicator = freeTextIndicator;
    }
}
