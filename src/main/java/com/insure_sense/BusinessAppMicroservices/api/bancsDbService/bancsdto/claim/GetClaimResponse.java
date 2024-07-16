package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.bancsdto.claim;

import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.bancsdto.common.MsgResponse;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
public class GetClaimResponse {

    private SearchEntityDetail entityDetail;
    private ClaimDetail claimDetail;
    private MsgResponse response;

    public SearchEntityDetail getEntityDetail() {
        return entityDetail;
    }

    public void setEntityDetail(SearchEntityDetail entityDetail) {
        this.entityDetail = entityDetail;
    }

    public ClaimDetail getClaimDetail() {
        return claimDetail;
    }

    public void setClaimDetail(ClaimDetail claimDetail) {
        this.claimDetail = claimDetail;
    }

    public MsgResponse getResponse() {
        return response;
    }

    public void setResponse(MsgResponse response) {
        this.response = response;
    }
}
