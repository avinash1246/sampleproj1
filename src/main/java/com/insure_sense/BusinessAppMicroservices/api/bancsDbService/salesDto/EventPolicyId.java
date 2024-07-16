package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.salesDto;

import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Objects;

@NoArgsConstructor
public class EventPolicyId implements Serializable {

    public EventPolicyId(Long eventId, Long policyId) {
        this.eventId = eventId;
        this.policyId = policyId;
    }

    private Long eventId;
    private Long policyId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EventPolicyId that = (EventPolicyId) o;
        return eventId.equals(that.eventId) && policyId.equals(that.policyId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eventId, policyId);
    }
}
