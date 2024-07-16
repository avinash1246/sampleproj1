package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.salesDto;

import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Objects;

@NoArgsConstructor
public class PolicyPaymentId implements Serializable {

    public PolicyPaymentId(Long policyId, String paymentId) {
        this.policyId = policyId;
        this.paymentId = paymentId;
    }

    private Long policyId;
    private String paymentId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PolicyPaymentId that = (PolicyPaymentId) o;
        return Objects.equals(policyId, that.policyId) &&
                Objects.equals(paymentId, that.paymentId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policyId, paymentId);
    }
}
