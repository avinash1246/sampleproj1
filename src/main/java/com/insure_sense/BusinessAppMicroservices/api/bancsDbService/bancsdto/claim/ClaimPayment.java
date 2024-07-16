package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.bancsdto.claim;

import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.bancsdto.policy.PaymentCycle;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@NoArgsConstructor
@AllArgsConstructor
public class ClaimPayment {

    private ClaimPaymentDetail claimPaymentDetail;
    private List<PaymentCycle> paymentCycle;

    public ClaimPaymentDetail getClaimPaymentDetail() {
        return claimPaymentDetail;
    }

    public void setClaimPaymentDetail(ClaimPaymentDetail claimPaymentDetail) {
        this.claimPaymentDetail = claimPaymentDetail;
    }

    public List<PaymentCycle> getPaymentCycle() {
        return paymentCycle;
    }

    public void setPaymentCycle(List<PaymentCycle> paymentCycle) {
        this.paymentCycle = paymentCycle;
    }
}
