package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.salesDto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class EventParty extends BaseEntity {

    public EventParty(Long eventId, Long partyId) {
        this.eventId = eventId;
        this.partyId = partyId;
    }


    private Long eventId;

    private Long partyId;

    public Long getEventId() {
        return eventId;
    }

    public void setEventId(Long eventId) {
        this.eventId = eventId;
    }

    public Long getPartyId() {
        return partyId;
    }

    public void setPartyId(Long partyId) {
        this.partyId = partyId;
    }
}
