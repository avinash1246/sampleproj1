package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.salesDto;

import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

@NoArgsConstructor
public class AgreementPartyRoleId implements Serializable {

    public AgreementPartyRoleId(Long agreementId, String partyRoleCd, LocalDate effectiveDate, Long partyId) {
        this.agreementId = agreementId;
        this.partyRoleCd = partyRoleCd;
        this.effectiveDate = effectiveDate;
        this.partyId = partyId;
    }

    private Long agreementId;
    private String partyRoleCd;
    private LocalDate effectiveDate;
    private Long partyId;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AgreementPartyRoleId that = (AgreementPartyRoleId) o;
        return agreementId.equals(that.agreementId) &&
                partyRoleCd.equals(that.partyRoleCd) &&
                effectiveDate.equals(that.effectiveDate) &&
                partyId.equals(that.partyId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(agreementId, partyRoleCd, effectiveDate, partyId);
    }
}

