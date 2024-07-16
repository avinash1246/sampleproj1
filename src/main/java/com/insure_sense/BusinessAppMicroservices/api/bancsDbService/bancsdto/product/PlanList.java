package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.bancsdto.product;

import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.bancsdto.common.Attribute;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@NoArgsConstructor
@AllArgsConstructor
public class PlanList {

    private String planCode;
    private String planName;
    private List<Attribute> planProperty;

    private List<SubPlanList> subPlanLists;

    public String getPlanCode() {
        return planCode;
    }

    public void setPlanCode(String planCode) {
        this.planCode = planCode;
    }

    public String getPlanName() {
        return planName;
    }

    public void setPlanName(String planName) {
        this.planName = planName;
    }

    public List<Attribute> getPlanProperty() {
        return planProperty;
    }

    public void setPlanProperty(List<Attribute> planProperty) {
        this.planProperty = planProperty;
    }

    public List<SubPlanList> getSubPlanLists() {
        return subPlanLists;
    }

    public void setSubPlanLists(List<SubPlanList> subPlanLists) {
        this.subPlanLists = subPlanLists;
    }
}
