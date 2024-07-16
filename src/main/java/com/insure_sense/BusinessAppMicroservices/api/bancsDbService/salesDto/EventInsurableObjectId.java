package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.salesDto;

import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Objects;

@NoArgsConstructor
public class EventInsurableObjectId implements Serializable {

    public EventInsurableObjectId(Long eventId, Long insurableObjectId) {
        this.eventId = eventId;
        this.insurableObjectId = insurableObjectId;
    }

    private Long eventId;
    private Long insurableObjectId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EventInsurableObjectId that = (EventInsurableObjectId) o;
        return eventId.equals(that.eventId) && insurableObjectId.equals(that.insurableObjectId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eventId, insurableObjectId);
    }
}
