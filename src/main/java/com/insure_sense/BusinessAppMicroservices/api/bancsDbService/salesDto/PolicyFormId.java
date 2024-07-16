package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.salesDto;

import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Objects;

@NoArgsConstructor
public class PolicyFormId implements Serializable {

    public PolicyFormId(Long policyId, String formCd) {
        this.policyId = policyId;
        this.formCd = formCd;
    }

    private Long policyId;
    private String formCd;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PolicyFormId that = (PolicyFormId) o;
        return policyId.equals(that.policyId) &&
                formCd.equals(that.formCd);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policyId, formCd);
    }
}
