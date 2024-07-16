package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.salesDto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.NoArgsConstructor;

import java.util.List;


@NoArgsConstructor
public class PolicyRiskCoverDetails extends BaseEntity {

    public PolicyRiskCoverDetails(Long policyId, String sector, String nOfWorkCd, String nOfWorkDesc, String categoryCd, String categoryDesc,
                                  Boolean empCovered, Boolean consistentClaims, Boolean deathClaims,
                                  String hazardLevel, Boolean usaCoverage, String riskClass, Long sic,
                                  String riskSize, String sicMapped, Boolean allOverCountry) {
        this.policyId = policyId;
        this.sector = sector;
        this.nOfWorkCd = nOfWorkCd;
        this.categoryCd = categoryCd;
        this.nOfWorkDesc = nOfWorkDesc;
        this.categoryDesc = categoryDesc;
        this.empCovered = empCovered;
        this.consistentClaims = consistentClaims;
        this.deathClaims = deathClaims;
        this.hazardLevel = hazardLevel;
        this.usaCoverage = usaCoverage;
        this.riskClass = riskClass;
        this.sic = sic;
        this.riskSize = riskSize;
        this.sicMapped = sicMapped;
        this.allOverCountry = allOverCountry;
    }


    private Long policyId;

    private String sector;
    private String nOfWorkCd;
    private String categoryCd;
    private String nOfWorkDesc;
    private String categoryDesc;
    private Boolean empCovered;
    private Boolean consistentClaims;
    private Boolean deathClaims;
    private String hazardLevel;
    private Boolean usaCoverage;
    private String riskClass;
    private Long sic;
    private String riskSize;
    private String sicMapped;
    private Boolean allOverCountry;

    private List<PolicyAddressList> locations;


    @JsonIgnore
    private PolicyExt policyExt;

    public Long getPolicyId() {
        return policyId;
    }

    public void setPolicyId(Long policyId) {
        this.policyId = policyId;
    }

//    public LocalDate getEffectiveDate() {
//        return effectiveDate;
//    }
//
//    public void setEffectiveDate(LocalDate effectiveDate) {
//        this.effectiveDate = effectiveDate;
//    }
//


    public List<PolicyAddressList> getLocations() {
        return locations;
    }

    public void setLocations(List<PolicyAddressList> locations) {
        this.locations = locations;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public String getnOfWorkCd() {
        return nOfWorkCd;
    }

    public void setnOfWorkCd(String nOfWorkCd) {
        this.nOfWorkCd = nOfWorkCd;
    }

    public String getnOfWorkDesc() {
        return nOfWorkDesc;
    }

    public void setnOfWorkDesc(String nOfWorkDesc) {
        this.nOfWorkDesc = nOfWorkDesc;
    }

    public String getCategoryCd() {
        return categoryCd;
    }

    public void setCategoryCd(String categoryCd) {
        this.categoryCd = categoryCd;
    }

    public String getCategoryDesc() {
        return categoryDesc;
    }

    public void setCategoryDesc(String categoryDesc) {
        this.categoryDesc = categoryDesc;
    }

    public Boolean getEmpCovered() {
        return empCovered;
    }

    public void setEmpCovered(Boolean empCovered) {
        this.empCovered = empCovered;
    }

    public Boolean getConsistentClaims() {
        return consistentClaims;
    }

    public void setConsistentClaims(Boolean consistentClaims) {
        this.consistentClaims = consistentClaims;
    }

    public Boolean getDeathClaims() {
        return deathClaims;
    }

    public void setDeathClaims(Boolean deathClaims) {
        this.deathClaims = deathClaims;
    }

    public String getHazardLevel() {
        return hazardLevel;
    }

    public void setHazardLevel(String hazardLevel) {
        this.hazardLevel = hazardLevel;
    }

    public Boolean getUsaCoverage() {
        return usaCoverage;
    }

    public void setUsaCoverage(Boolean usaCoverage) {
        this.usaCoverage = usaCoverage;
    }

    public String getRiskClass() {
        return riskClass;
    }

    public void setRiskClass(String riskClass) {
        this.riskClass = riskClass;
    }

    public Long getSic() {
        return sic;
    }

    public void setSic(Long sic) {
        this.sic = sic;
    }

    public String getRiskSize() {
        return riskSize;
    }

    public void setRiskSize(String riskSize) {
        this.riskSize = riskSize;
    }

    public String getSicMapped() {
        return sicMapped;
    }

    public void setSicMapped(String sicMapped) {
        this.sicMapped = sicMapped;
    }

    public Boolean getAllOverCountry() {
        return allOverCountry;
    }

    public void setAllOverCountry(Boolean allOverCountry) {
        this.allOverCountry = allOverCountry;
    }

//    public PolicyExt getPolicyExt() {
//        return policyExt;
//    }
//
//    public void setPolicyExt(PolicyExt policyExt) {
//        this.policyExt = policyExt;
//    }

}
