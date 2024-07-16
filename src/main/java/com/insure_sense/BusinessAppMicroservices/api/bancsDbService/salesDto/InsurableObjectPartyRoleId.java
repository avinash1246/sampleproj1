package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.salesDto;

import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Objects;

@NoArgsConstructor
public class InsurableObjectPartyRoleId {

    public InsurableObjectPartyRoleId(Long personId, Long insurableObjectId, String partyRoleCd, LocalDate effectiveDate) {
        this.personId = personId;
        this.insurableObjectId = insurableObjectId;
        this.partyRoleCd = partyRoleCd;
        this.effectiveDate = effectiveDate;
    }

    private Long personId;
    private Long insurableObjectId;
    private String partyRoleCd;
    private LocalDate effectiveDate;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InsurableObjectPartyRoleId that = (InsurableObjectPartyRoleId) o;
        return personId.equals(that.personId) && insurableObjectId.equals(that.insurableObjectId) && partyRoleCd.equals(that.partyRoleCd) && Objects.equals(effectiveDate, that.effectiveDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(personId, insurableObjectId, partyRoleCd, effectiveDate);
    }
}
