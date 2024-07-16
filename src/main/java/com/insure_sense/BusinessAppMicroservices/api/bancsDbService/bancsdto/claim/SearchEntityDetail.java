package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.bancsdto.claim;

import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.bancsdto.common.Attribute;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@NoArgsConstructor
@AllArgsConstructor
public class SearchEntityDetail {
    private List<Attribute> searchResult;

    public List<Attribute> getSearchResult() {
        return searchResult;
    }

    public void setSearchResult(List<Attribute> searchResult) {
        this.searchResult = searchResult;
    }
}
