package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.bancsdto.policy;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
public class EntityDetail {

    private EntityDetails entityDetails;
    private PremiumDetails premiumDetails;
    private List<PaymentCycle> paymentCycles;
    private FetchEndorsementdetails fetchEndorsementdetails;

    public EntityDetails getEntityDetails() {
        return entityDetails;
    }

    public void setEntityDetails(EntityDetails entityDetails) {
        this.entityDetails = entityDetails;
    }

    public PremiumDetails getPremiumDetails() {
        return premiumDetails;
    }

    public void setPremiumDetails(PremiumDetails premiumDetails) {
        this.premiumDetails = premiumDetails;
    }

    public List<PaymentCycle> getPaymentCycles() {
        return paymentCycles;
    }

    public void setPaymentCycles(List<PaymentCycle> paymentCycles) {
        this.paymentCycles = paymentCycles;
    }

    public FetchEndorsementdetails getFetchEndorsementdetails() {
        return fetchEndorsementdetails;
    }

    public void setFetchEndorsementdetails(FetchEndorsementdetails fetchEndorsementdetails) {
        this.fetchEndorsementdetails = fetchEndorsementdetails;
    }
}
