package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.bancsdto.product;

import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.bancsdto.common.Attribute;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;



@NoArgsConstructor
@AllArgsConstructor
public class CoverGroup {

    private String coverGroupDescription;
    private String coverGroupName;
    private List<Attribute> coverGroupProperty;
    private List<PlanCover> covers;

    public String getCoverGroupDescription() {
        return coverGroupDescription;
    }

    public void setCoverGroupDescription(String coverGroupDescription) {
        this.coverGroupDescription = coverGroupDescription;
    }

    public String getCoverGroupName() {
        return coverGroupName;
    }

    public void setCoverGroupName(String coverGroupName) {
        this.coverGroupName = coverGroupName;
    }

    public List<Attribute> getCoverGroupProperty() {
        return coverGroupProperty;
    }

    public void setCoverGroupProperty(List<Attribute> coverGroupProperty) {
        this.coverGroupProperty = coverGroupProperty;
    }

    public List<PlanCover> getCovers() {
        return covers;
    }

    public void setCovers(List<PlanCover> covers) {
        this.covers = covers;
    }
}
