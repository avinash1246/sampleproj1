package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.salesDto;

import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Objects;

@NoArgsConstructor
public class PolicyMemberInfoId {

    public PolicyMemberInfoId(Long policyId, Long partyId) {
        this.policyId = policyId;
        this.partyId = partyId;
    }

    private Long policyId;

    private Long partyId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PolicyMemberInfoId that = (PolicyMemberInfoId) o;
        return Objects.equals(policyId, that.policyId) && Objects.equals(partyId, that.partyId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policyId, partyId);
    }
}
