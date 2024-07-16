package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.bancsdto.product;

import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.bancsdto.common.MsgResponse;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@NoArgsConstructor
@AllArgsConstructor
public class PlanSearchResponse {
    private List<PlanList> planLists;
    private MsgResponse response;

    public List<PlanList> getPlanLists() {
        return planLists;
    }

    public void setPlanLists(List<PlanList> planLists) {
        this.planLists = planLists;
    }

    public MsgResponse getResponse() {
        return response;
    }

    public void setResponse(MsgResponse response) {
        this.response = response;
    }
}
