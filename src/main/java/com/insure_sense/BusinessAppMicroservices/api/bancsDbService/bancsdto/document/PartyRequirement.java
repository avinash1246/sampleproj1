package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.bancsdto.document;

import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.bancsdto.common.Requirement;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@NoArgsConstructor
@AllArgsConstructor
public class PartyRequirement {
    private List<Requirement> requirementList;

    public List<Requirement> getRequirementList() {
        return requirementList;
    }

    public void setRequirementList(List<Requirement> requirementList) {
        this.requirementList = requirementList;
    }
}
