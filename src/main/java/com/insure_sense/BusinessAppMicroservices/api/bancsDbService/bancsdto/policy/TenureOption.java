package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.bancsdto.policy;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@NoArgsConstructor
@AllArgsConstructor
public class TenureOption {

    private String policyTenure;
    private List<PremiumOption> premiumOptions;

    public String getPolicyTenure() {
        return policyTenure;
    }

    public void setPolicyTenure(String policyTenure) {
        this.policyTenure = policyTenure;
    }

    public List<PremiumOption> getPremiumOptions() {
        return premiumOptions;
    }

    public void setPremiumOptions(List<PremiumOption> premiumOptions) {
        this.premiumOptions = premiumOptions;
    }
}
