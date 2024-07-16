package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.bancsdto.product;

import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.bancsdto.common.Attribute;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;


@NoArgsConstructor
@AllArgsConstructor
public class SubPlanList {

    private String subPlanCode;
    private String subPlanName;
    private List<Attribute> subPlanProperty;

    public String getSubPlanCode() {
        return subPlanCode;
    }

    public void setSubPlanCode(String subPlanCode) {
        this.subPlanCode = subPlanCode;
    }

    public String getSubPlanName() {
        return subPlanName;
    }

    public void setSubPlanName(String subPlanName) {
        this.subPlanName = subPlanName;
    }

    public List<Attribute> getSubPlanProperty() {
        return subPlanProperty;
    }

    public void setSubPlanProperty(List<Attribute> subPlanProperty) {
        this.subPlanProperty = subPlanProperty;
    }
}
