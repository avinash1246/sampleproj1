package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.bancsdto.claim;
import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.bancsdto.common.MsgResponse;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
public class SaveClaimResponse {

    private String claimNumber;
    private String claimStatus;
    private String claimStatusDescription;
    private String clid;
    private String claimRegistrationDate;
    private MsgResponse response;

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

    public String getClaimStatusDescription() {
        return claimStatusDescription;
    }

    public void setClaimStatusDescription(String claimStatusDescription) {
        this.claimStatusDescription = claimStatusDescription;
    }

    public String getClid() {
        return clid;
    }

    public void setClid(String clid) {
        this.clid = clid;
    }

    public String getClaimRegistrationDate() {
        return claimRegistrationDate;
    }

    public void setClaimRegistrationDate(String claimRegistrationDate) {
        this.claimRegistrationDate = claimRegistrationDate;
    }

    public MsgResponse getResponse() {
        return response;
    }

    public void setResponse(MsgResponse response) {
        this.response = response;
    }
}
