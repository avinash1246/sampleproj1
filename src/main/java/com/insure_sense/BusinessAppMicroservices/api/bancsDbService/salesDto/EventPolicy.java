package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.salesDto;


import lombok.NoArgsConstructor;


@NoArgsConstructor
public class EventPolicy extends BaseEntity {

    public EventPolicy(Long eventId, Long policyId) {
        this.eventId = eventId;
        this.policyId = policyId;
    }


    private Long eventId;


    private Long policyId;

    public Long getEventId() {
        return eventId;
    }

    public void setEventId(Long eventId) {
        this.eventId = eventId;
    }

    public Long getPolicyId() {
        return policyId;
    }

    public void setPolicyId(Long policyId) {
        this.policyId = policyId;
    }
}
