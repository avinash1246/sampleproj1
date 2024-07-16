package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.salesDto;

import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Objects;

@NoArgsConstructor
public class PolicyWorkersCompInfoId implements Serializable {

    public PolicyWorkersCompInfoId(Long policyId, Long insurableObjectId) {
        this.policyId = policyId;
        this.insurableObjectId = insurableObjectId;
    }

    private Long policyId;
    private Long insurableObjectId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PolicyWorkersCompInfoId that = (PolicyWorkersCompInfoId) o;
        return policyId == that.policyId &&
                insurableObjectId == that.insurableObjectId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(policyId, insurableObjectId);
    }
}
