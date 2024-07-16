package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.bancsdto.document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
public class RequirementResponse {

    private String referenceType;
    private String referenceNumber;

    private PartyRequirement partyRequirement;
    private DocumentDownloadResponse documentDownloadResponse;

    public String getReferenceType() {
        return referenceType;
    }

    public void setReferenceType(String referenceType) {
        this.referenceType = referenceType;
    }

    public String getReferenceNumber() {
        return referenceNumber;
    }

    public void setReferenceNumber(String referenceNumber) {
        this.referenceNumber = referenceNumber;
    }

    public PartyRequirement getPartyRequirement() {
        return partyRequirement;
    }

    public void setPartyRequirement(PartyRequirement partyRequirement) {
        this.partyRequirement = partyRequirement;
    }

    public DocumentDownloadResponse getDocumentDownloadResponse() {
        return documentDownloadResponse;
    }

    public void setDocumentDownloadResponse(DocumentDownloadResponse documentDownloadResponse) {
        this.documentDownloadResponse = documentDownloadResponse;
    }
}
