package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.salesDto;

import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Objects;

@NoArgsConstructor
public class PolicyAddressListId implements Serializable {

    public PolicyAddressListId(Long policyId, Long geographicLocationId) {
        this.policyId = policyId;
        this.geographicLocationId = geographicLocationId;
    }

    private Long policyId;
    private Long geographicLocationId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PolicyAddressListId that = (PolicyAddressListId) o;
        return policyId.equals(that.policyId) &&
                geographicLocationId.equals(that.geographicLocationId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policyId, geographicLocationId);
    }

}
