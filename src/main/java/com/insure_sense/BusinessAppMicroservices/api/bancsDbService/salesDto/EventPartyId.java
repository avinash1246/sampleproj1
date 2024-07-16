package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.salesDto;

import jakarta.persistence.Id;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Objects;

@NoArgsConstructor
public class EventPartyId implements Serializable {

    public EventPartyId(Long eventId, Long partyId) {
        this.eventId = eventId;
        this.partyId = partyId;
    }

    private Long eventId;
    private Long partyId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EventPartyId that = (EventPartyId) o;
        return eventId.equals(that.eventId) && partyId.equals(that.partyId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eventId, partyId);
    }
}
