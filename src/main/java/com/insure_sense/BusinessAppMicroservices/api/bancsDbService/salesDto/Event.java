package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.salesDto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;



import java.time.Instant;
import java.time.LocalDateTime;


@NoArgsConstructor
public class Event extends BaseEntity {

    public Event(String eventTypeCd) {
        this.eventDate = LocalDateTime.now();
        this.eventTypeCd = eventTypeCd;
    }

    public Event(Long eventId, LocalDateTime eventDate, String eventTypeCd, String eventSubTypeCd,
                 Long primaryEntityId, String eventDescription) {
        this.eventId = eventId;
        this.eventDate = eventDate;
        this.eventTypeCd = eventTypeCd;
        this.eventSubTypeCd = eventSubTypeCd;
        this.primaryEntityId = primaryEntityId;
        this.eventDescription = eventDescription;
    }

    private Long eventId;

    @JsonFormat(pattern="yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", timezone="Asia/Calcutta")
    private LocalDateTime eventDate;

    private String eventTypeCd;

    private String eventSubTypeCd;
    private Long  primaryEntityId;

    private String eventDescription;

    public Long getEventId() {
        return eventId;
    }

    public void setEventId(Long eventId) {
        this.eventId = eventId;
    }

    public LocalDateTime getEventDate() {
        return eventDate;
    }

    public void setEventDate(LocalDateTime eventDate) {
        this.eventDate = eventDate;
    }

    public String getEventTypeCd() {
        return eventTypeCd;
    }

    public void setEventTypeCd(String eventTypeCd) {
        this.eventTypeCd = eventTypeCd;
    }

    public String getEventSubTypeCd() {
        return eventSubTypeCd;
    }

    public void setEventSubTypeCd(String eventSubTypeCd) {
        this.eventSubTypeCd = eventSubTypeCd;
    }

    public Long getPrimaryEntityId() {
        return primaryEntityId;
    }

    public void setPrimaryEntityId(Long primaryEntityId) {
        this.primaryEntityId = primaryEntityId;
    }

    public String getEventDescription() {
        return eventDescription;
    }

    public void setEventDescription(String eventDescription) {
        this.eventDescription = eventDescription;
    }
}
