package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.salesDto;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class PolicyVersion extends BaseEntity {

    public PolicyVersion(Long policyId) {
        this.policyId = policyId;
    }

    private Long policyVersionId;
    private Long policyId;

    public Long getPolicyVersionId() {
        return policyVersionId;
    }

    public void setPolicyVersionId(Long policyVersionId) {
        this.policyVersionId = policyVersionId;
    }

    public Long getPolicyId() {
        return policyId;
    }

    public void setPolicyId(Long policyId) {
        this.policyId = policyId;
    }
}
