package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.salesDto;

import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

@NoArgsConstructor
public class HouseholdPersonId implements Serializable {

    public HouseholdPersonId(Long householdId, Long personId, LocalDate effectiveDate) {
        this.householdId = householdId;
        this.personId = personId;
        this.effectiveDate = effectiveDate;
    }

    private Long householdId;
    private Long personId;
    private LocalDate effectiveDate;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HouseholdPersonId that = (HouseholdPersonId) o;
        return householdId.equals(that.householdId) && personId.equals(that.personId) && Objects.equals(effectiveDate, that.effectiveDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(householdId, personId, effectiveDate);
    }
}
