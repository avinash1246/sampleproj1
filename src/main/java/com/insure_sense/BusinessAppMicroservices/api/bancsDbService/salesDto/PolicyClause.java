package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.salesDto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.NoArgsConstructor;


import java.time.LocalDate;


@NoArgsConstructor
public class PolicyClause extends BaseEntity {

    public PolicyClause(Long policyId, String clauseCd, LocalDate effectiveDate, String coveragePartCd,
                        String clauseApplyCd, String clauseShortDesc, String clauseLongDesc,
                        LocalDate expirationDate, Boolean selected) {
        this.policyId = policyId;
        this.clauseCd = clauseCd;
        this.effectiveDate = effectiveDate;
        this.coveragePartCd = coveragePartCd;
        this.clauseApplyCd = clauseApplyCd;
        this.clauseShortDesc = clauseShortDesc;
        this.clauseLongDesc = clauseLongDesc;
        this.expirationDate = expirationDate;
        this.selected = selected;
    }


    private Long policyId;


    private String clauseCd;


    @JsonFormat(pattern="dd/MM/yyyy")
    private LocalDate effectiveDate;

    private String coveragePartCd;
    private String clauseApplyCd;

    @JsonIgnore
    private PolicyExt policyExt;

    @JsonIgnore
    private PolicyCoveragePart policyCoveragePart;

    private String clauseShortDesc;

    private String clauseLongDesc;

    @JsonFormat(pattern="dd/MM/yyyy")
    private LocalDate expirationDate;
    private Boolean selected;

    public Long getPolicyId() {
        return policyId;
    }

    public void setPolicyId(Long policyId) {
        this.policyId = policyId;
    }

    public String getClauseCd() {
        return clauseCd;
    }

    public void setClauseCd(String clauseCd) {
        this.clauseCd = clauseCd;
    }

    public LocalDate getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(LocalDate effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public String getCoveragePartCd() {
        return coveragePartCd;
    }

    public void setCoveragePartCd(String coveragePartCd) {
        this.coveragePartCd = coveragePartCd;
    }

    public String getClauseApplyCd() {
        return clauseApplyCd;
    }

    public void setClauseApplyCd(String clauseApplyCd) {
        this.clauseApplyCd = clauseApplyCd;
    }

    public String getClauseShortDesc() {
        return clauseShortDesc;
    }

    public void setClauseShortDesc(String clauseShortDesc) {
        this.clauseShortDesc = clauseShortDesc;
    }

    public String getClauseLongDesc() {
        return clauseLongDesc;
    }

    public void setClauseLongDesc(String clauseLongDesc) {
        this.clauseLongDesc = clauseLongDesc;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    public Boolean getSelected() {
        return selected;
    }

    public void setSelected(Boolean selected) {
        this.selected = selected;
    }
}
