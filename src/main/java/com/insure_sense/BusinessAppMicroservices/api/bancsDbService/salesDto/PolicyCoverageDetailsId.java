package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.salesDto;

import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

@NoArgsConstructor
public class PolicyCoverageDetailsId implements Serializable {

    public PolicyCoverageDetailsId(Long policyCoverageDetailsId, LocalDate effectiveDate) {
        this.policyCoverageDetailsId = policyCoverageDetailsId;
        this.effectiveDate = effectiveDate;
    }

    private Long policyCoverageDetailsId;
    private LocalDate effectiveDate;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PolicyCoverageDetailsId that = (PolicyCoverageDetailsId) o;
        return policyCoverageDetailsId == that.policyCoverageDetailsId &&
                Objects.equals(effectiveDate, that.effectiveDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policyCoverageDetailsId, effectiveDate);
    }
}
