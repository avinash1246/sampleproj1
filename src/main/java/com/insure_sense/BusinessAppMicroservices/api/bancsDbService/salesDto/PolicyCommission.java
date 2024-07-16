package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.salesDto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class PolicyCommission extends BaseEntity {

    public PolicyCommission(Long policyId, Float brokerCommission, Float policyFee) {
        this.policyId = policyId;
        this.brokerCommission = brokerCommission;
        this.policyFee = policyFee;
    }


    private Long policyId;

    private Float brokerCommission;
    private Float policyFee;


    @JsonIgnore
    private PolicyExt policyExt;

    public Long getPolicyId() {
        return policyId;
    }

    public void setPolicyId(Long policyId) {
        this.policyId = policyId;
    }

    public Float getBrokerCommission() {
        return brokerCommission;
    }

    public void setBrokerCommission(Float brokerCommission) {
        this.brokerCommission = brokerCommission;
    }

    public Float getPolicyFee() {
        return policyFee;
    }

    public void setPolicyFee(Float policyFee) {
        this.policyFee = policyFee;
    }
}
