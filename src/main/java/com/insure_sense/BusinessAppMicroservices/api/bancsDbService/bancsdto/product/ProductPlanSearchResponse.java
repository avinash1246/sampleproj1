package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.bancsdto.product;

import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.bancsdto.common.MsgResponse;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@NoArgsConstructor
@AllArgsConstructor
public class ProductPlanSearchResponse {
    private String productCd;
    private String planCd;
    private String planName;
    private List<PlanProperty> planProperty;
    private List<PlanSubType> planSubType;
    private MsgResponse response;

    public String getProductCd() {
        return productCd;
    }

    public void setProductCd(String productCd) {
        this.productCd = productCd;
    }

    public String getPlanCd() {
        return planCd;
    }

    public void setPlanCd(String planCd) {
        this.planCd = planCd;
    }

    public String getPlanName() {
        return planName;
    }

    public void setPlanName(String planName) {
        this.planName = planName;
    }

    public List<PlanProperty> getPlanProperty() {
        return planProperty;
    }

    public void setPlanProperty(List<PlanProperty> planProperty) {
        this.planProperty = planProperty;
    }

    public List<PlanSubType> getPlanSubType() {
        return planSubType;
    }

    public void setPlanSubType(List<PlanSubType> planSubType) {
        this.planSubType = planSubType;
    }

    public MsgResponse getResponse() {
        return response;
    }

    public void setResponse(MsgResponse response) {
        this.response = response;
    }
}
