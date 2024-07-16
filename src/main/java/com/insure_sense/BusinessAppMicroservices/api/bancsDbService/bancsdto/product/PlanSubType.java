package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.bancsdto.product;

import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.bancsdto.common.Attribute;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@NoArgsConstructor
@AllArgsConstructor
public class PlanSubType {

    private String planSubTypeName;
    private String planSubTypeDescription;
    private List<CoverGroup> coverGroup;
    private List<Attribute> planSubTypeProperty;

    public String getPlanSubTypeName() {
        return planSubTypeName;
    }

    public void setPlanSubTypeName(String planSubTypeName) {
        this.planSubTypeName = planSubTypeName;
    }

    public String getPlanSubTypeDescription() {
        return planSubTypeDescription;
    }

    public void setPlanSubTypeDescription(String planSubTypeDescription) {
        this.planSubTypeDescription = planSubTypeDescription;
    }

    public List<CoverGroup> getCoverGroup() {
        return coverGroup;
    }

    public void setCoverGroup(List<CoverGroup> coverGroup) {
        this.coverGroup = coverGroup;
    }

    public List<Attribute> getPlanSubTypeProperty() {
        return planSubTypeProperty;
    }

    public void setPlanSubTypeProperty(List<Attribute> planSubTypeProperty) {
        this.planSubTypeProperty = planSubTypeProperty;
    }
}
