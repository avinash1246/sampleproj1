package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.salesDto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import lombok.NoArgsConstructor;


@NoArgsConstructor
public class EventInsurableObject extends BaseEntity {

    public EventInsurableObject(Long eventId, Long insurableObjectId) {
        this.eventId = eventId;
        this.insurableObjectId = insurableObjectId;
    }


    private Long eventId;

    private Long insurableObjectId;

    public Long getEventId() {
        return eventId;
    }

    public void setEventId(Long eventId) {
        this.eventId = eventId;
    }

    public Long getInsurableObjectId() {
        return insurableObjectId;
    }

    public void setInsurableObjectId(Long insurableObjectId) {
        this.insurableObjectId = insurableObjectId;
    }
}
