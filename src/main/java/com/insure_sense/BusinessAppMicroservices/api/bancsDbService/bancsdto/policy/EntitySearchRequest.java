package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.bancsdto.policy;

import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.bancsdto.common.Attribute;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class EntitySearchRequest {

    public EntitySearchRequest() {
    }

    private String branchCode;
    private String dateFrom;
    private String dateTo;
    private String lob;
    private String maxCount;
    private String minCount;
    private String partyCode;
    private String policyNumber;
    private String productCode;
    private String proposalNumber;
    private String stakeCode;
    private String status;
    private String subStatus;
    private String typeOfEntity;
    private List<Attribute> advanceSearch;

    public String getBranchCode() {
        return branchCode;
    }

    public void setBranchCode(String branchCode) {
        this.branchCode = branchCode;
    }

    public String getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(String dateFrom) {
        this.dateFrom = dateFrom;
    }

    public String getDateTo() {
        return dateTo;
    }

    public void setDateTo(String dateTo) {
        this.dateTo = dateTo;
    }

    public String getLob() {
        return lob;
    }

    public void setLob(String lob) {
        this.lob = lob;
    }

    public String getMaxCount() {
        return maxCount;
    }

    public void setMaxCount(String maxCount) {
        this.maxCount = maxCount;
    }

    public String getMinCount() {
        return minCount;
    }

    public void setMinCount(String minCount) {
        this.minCount = minCount;
    }

    public String getPartyCode() {
        return partyCode;
    }

    public void setPartyCode(String partyCode) {
        this.partyCode = partyCode;
    }

    public String getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getProposalNumber() {
        return proposalNumber;
    }

    public void setProposalNumber(String proposalNumber) {
        this.proposalNumber = proposalNumber;
    }

    public String getStakeCode() {
        return stakeCode;
    }

    public void setStakeCode(String stakeCode) {
        this.stakeCode = stakeCode;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSubStatus() {
        return subStatus;
    }

    public void setSubStatus(String subStatus) {
        this.subStatus = subStatus;
    }

    public String getTypeOfEntity() {
        return typeOfEntity;
    }

    public void setTypeOfEntity(String typeOfEntity) {
        this.typeOfEntity = typeOfEntity;
    }

    public List<Attribute> getAdvanceSearch() {
        return advanceSearch;
    }

    public void setAdvanceSearch(List<Attribute> advanceSearch) {
        this.advanceSearch = advanceSearch;
    }
}
