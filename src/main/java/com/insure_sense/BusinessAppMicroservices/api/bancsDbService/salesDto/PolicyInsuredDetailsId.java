package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.salesDto;

import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Objects;

@NoArgsConstructor
public class PolicyInsuredDetailsId implements Serializable {

    public PolicyInsuredDetailsId(Long policyId, Long partyId) {
        this.policyId = policyId;
        this.partyId = partyId;
    }

    private Long policyId;
    private Long partyId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PolicyInsuredDetailsId that = (PolicyInsuredDetailsId) o;
        return policyId == that.policyId &&
                partyId == that.partyId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(policyId, partyId);
    }
}
