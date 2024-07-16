package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.bancsdto.claim;

import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.bancsdto.common.Attribute;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@NoArgsConstructor
@AllArgsConstructor
public class HealthClaimSearchRequest {

    private String claimNumber;
    private String claimStatus;
    private String product;
    private String typeofClaim;
    private String policyNumber;
    private String primaryDiagnosis;
    private String claimReceivedFromDate;
    private String claimReceivedToDate;
    private List<Attribute> advanceSearch;

    public String getClaimNumber() {
        return claimNumber;
    }

    public void setClaimNumber(String claimNumber) {
        this.claimNumber = claimNumber;
    }

    public String getClaimStatus() {
        return claimStatus;
    }

    public void setClaimStatus(String claimStatus) {
        this.claimStatus = claimStatus;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getTypeofClaim() {
        return typeofClaim;
    }

    public void setTypeofClaim(String typeofClaim) {
        this.typeofClaim = typeofClaim;
    }

    public String getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }

    public String getPrimaryDiagnosis() {
        return primaryDiagnosis;
    }

    public void setPrimaryDiagnosis(String primaryDiagnosis) {
        this.primaryDiagnosis = primaryDiagnosis;
    }

    public String getClaimReceivedFromDate() {
        return claimReceivedFromDate;
    }

    public void setClaimReceivedFromDate(String claimReceivedFromDate) {
        this.claimReceivedFromDate = claimReceivedFromDate;
    }

    public String getClaimReceivedToDate() {
        return claimReceivedToDate;
    }

    public void setClaimReceivedToDate(String claimReceivedToDate) {
        this.claimReceivedToDate = claimReceivedToDate;
    }

    public List<Attribute> getAdvanceSearch() {
        return advanceSearch;
    }

    public void setAdvanceSearch(List<Attribute> advanceSearch) {
        this.advanceSearch = advanceSearch;
    }
}
