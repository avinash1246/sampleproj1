package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.salesDto;

import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

@NoArgsConstructor
public class PolicyClauseId implements Serializable {


    public PolicyClauseId(Long policyId, String clauseCd, LocalDate effectiveDate) {
        this.policyId = policyId;
        this.clauseCd = clauseCd;
        this.effectiveDate = effectiveDate;
    }

    private Long policyId;
    private String clauseCd;

    private LocalDate effectiveDate;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PolicyClauseId that = (PolicyClauseId) o;
        return Objects.equals(policyId, that.policyId) && Objects.equals(clauseCd, that.clauseCd) && Objects.equals(effectiveDate, that.effectiveDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policyId, clauseCd, effectiveDate);
    }
}
