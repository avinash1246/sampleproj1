package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.bancsdto.policy;

import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.bancsdto.common.MsgResponse;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
public class GetEntityResponse {

    private EntityDetail entityDetail;
    private MsgResponse response;

    public EntityDetail getEntityDetail() {
        return entityDetail;
    }

    public void setEntityDetail(EntityDetail entityDetail) {
        this.entityDetail = entityDetail;
    }

    public MsgResponse getResponse() {
        return response;
    }

    public void setResponse(MsgResponse response) {
        this.response = response;
    }
}
