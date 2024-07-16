package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.bancsdto.policy;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
public class CoverPremium {

    private String coverenddate;
    private String coverstartdate;
    private String covercode;
    private List<PremiumProperty> property;

    public String getCoverenddate() {
        return coverenddate;
    }

    public void setCoverenddate(String coverenddate) {
        this.coverenddate = coverenddate;
    }

    public String getCoverstartdate() {
        return coverstartdate;
    }

    public void setCoverstartdate(String coverstartdate) {
        this.coverstartdate = coverstartdate;
    }

    public String getCovercode() {
        return covercode;
    }

    public void setCovercode(String covercode) {
        this.covercode = covercode;
    }

    public List<PremiumProperty> getProperty() {
        return property;
    }

    public void setProperty(List<PremiumProperty> property) {
        this.property = property;
    }
}
