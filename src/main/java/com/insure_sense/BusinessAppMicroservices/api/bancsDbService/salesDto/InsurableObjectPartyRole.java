package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.salesDto;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import lombok.NoArgsConstructor;
import java.time.LocalDate;

@NoArgsConstructor
public class InsurableObjectPartyRole extends BaseEntity {

    public InsurableObjectPartyRole(Long personId, Long insurableObjectId, String partyRoleCd, LocalDate effectiveDate) {
        this.personId = personId;
        this.insurableObjectId = insurableObjectId;
        this.partyRoleCd = partyRoleCd;
        this.effectiveDate = effectiveDate;
    }


    private Long personId;

    private Long insurableObjectId;

    private String partyRoleCd;

    @JsonFormat(pattern="dd/MM/yyyy")
    private LocalDate effectiveDate;

    public Long getPersonId() {
        return personId;
    }

    public void setPersonId(Long personId) {
        this.personId = personId;
    }

    public Long getInsurableObjectId() {
        return insurableObjectId;
    }

    public void setInsurableObjectId(Long insurableObjectId) {
        this.insurableObjectId = insurableObjectId;
    }

    public String getPartyRoleCd() {
        return partyRoleCd;
    }

    public void setPartyRoleCd(String partyRoleCd) {
        this.partyRoleCd = partyRoleCd;
    }

    public LocalDate getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(LocalDate effectiveDate) {
        this.effectiveDate = effectiveDate;
    }
}
