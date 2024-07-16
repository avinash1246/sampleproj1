package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.salesDto;

import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Objects;

@NoArgsConstructor
public class PolicyCommodityInfoId implements Serializable {

    public PolicyCommodityInfoId(Long policyId, Long insurableObjectId) {
        this.policyId = policyId;
        this.insurableObjectId = insurableObjectId;
    }

    private Long policyId;
    private Long insurableObjectId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PolicyCommodityInfoId that = (PolicyCommodityInfoId) o;
        return policyId == that.policyId &&
                insurableObjectId == that.insurableObjectId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(policyId, insurableObjectId);
    }
}
