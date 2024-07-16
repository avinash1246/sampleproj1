package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.bancsdto.policy;

import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.bancsdto.common.Attribute;
import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.bancsdto.product.PlanCover;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
public class Risk {

    private List<Attribute> memberDetails;
    private List<PlanCover> covers;

    public List<Attribute> getMemberDetails() {
        return memberDetails;
    }

    public void setMemberDetails(List<Attribute> memberDetails) {
        this.memberDetails = memberDetails;
    }

    public List<PlanCover> getCovers() {
        return covers;
    }

    public void setCovers(List<PlanCover> covers) {
        this.covers = covers;
    }
}
