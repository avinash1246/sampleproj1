package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.salesDto;

import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Objects;

@NoArgsConstructor
public class PolicyCoveragePartId implements Serializable {

    public PolicyCoveragePartId(Long policyId, String coveragePartCd) {
        this.policyId = policyId;
        this.coveragePartCd = coveragePartCd;
    }

    private Long policyId;
    private String coveragePartCd;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PolicyCoveragePartId that = (PolicyCoveragePartId) o;
        return policyId.equals(that.policyId) &&
                coveragePartCd.equals(that.coveragePartCd);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policyId, coveragePartCd);
    }
}
