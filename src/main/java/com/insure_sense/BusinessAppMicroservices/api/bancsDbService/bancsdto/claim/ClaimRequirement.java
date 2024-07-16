package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.bancsdto.claim;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@NoArgsConstructor
@AllArgsConstructor
public class ClaimRequirement {
    private List<RequirementRow> rows;

    public List<RequirementRow> getRows() {
        return rows;
    }

    public void setRows(List<RequirementRow> rows) {
        this.rows = rows;
    }
}
