package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.salesDto;

import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Objects;

@NoArgsConstructor
public class PolicyDiscountId implements Serializable {

    public PolicyDiscountId(Long policyId, String policyDiscountCd) {
        this.policyId = policyId;
        this.policyDiscountCd = policyDiscountCd;
    }
    private Long policyId;
    private String policyDiscountCd;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PolicyDiscountId that = (PolicyDiscountId) o;
        return Objects.equals(policyId, that.policyId) && Objects.equals(policyDiscountCd, that.policyDiscountCd);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policyId, policyDiscountCd);
    }
}
