package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.bancsdto.claim;

import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.bancsdto.common.MsgResponse;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@NoArgsConstructor
@AllArgsConstructor
public class SearchClaimResponse {
    private List<SearchEntityDetail> searchEntityDetail;
    private MsgResponse response;

    public List<SearchEntityDetail> getSearchEntityDetail() {
        return searchEntityDetail;
    }

    public void setSearchEntityDetail(List<SearchEntityDetail> searchEntityDetail) {
        this.searchEntityDetail = searchEntityDetail;
    }

    public MsgResponse getResponse() {
        return response;
    }

    public void setResponse(MsgResponse response) {
        this.response = response;
    }
}
