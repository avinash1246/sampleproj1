package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.salesDto;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.NoArgsConstructor;

import java.time.LocalDate;

@NoArgsConstructor
public class HouseholdPerson extends BaseEntity {


    public HouseholdPerson(Long householdId, Long personId) {
        this.householdId = householdId;
        this.personId = personId;
    }

    public HouseholdPerson(Long householdId, Long personId, LocalDate effectiveDate, LocalDate endDate,
                           String partyRoleCd) {
        this.householdId = householdId;
        this.personId = personId;
        this.effectiveDate = effectiveDate;
        this.endDate = endDate;
        this.partyRoleCd = partyRoleCd;
    }


    private Long householdId;

    private Long personId;

    @JsonFormat(pattern="dd/MM/yyyy")
    private LocalDate effectiveDate;
    private LocalDate endDate;
    private String partyRoleCd;

    public Long getHouseholdId() {
        return householdId;
    }

    public void setHouseholdId(Long householdId) {
        this.householdId = householdId;
    }

    public Long getPersonId() {
        return personId;
    }

    public void setPersonId(Long personId) {
        this.personId = personId;
    }

    public LocalDate getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(LocalDate effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public String getPartyRoleCd() {
        return partyRoleCd;
    }

    public void setPartyRoleCd(String partyRoleCd) {
        this.partyRoleCd = partyRoleCd;
    }
}
