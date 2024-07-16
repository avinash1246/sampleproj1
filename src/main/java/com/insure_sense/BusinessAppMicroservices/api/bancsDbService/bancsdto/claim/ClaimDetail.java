package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.bancsdto.claim;

import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.bancsdto.common.MultiSetAttribute;
import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.bancsdto.document.Document;
import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.bancsdto.policy.Relation;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@NoArgsConstructor
@AllArgsConstructor
public class ClaimDetail {
        private String flag;
        private String claimNumber;
        private String status;
        private String reopenIndicator;
        private List<ClaimDetailAttribute> claimdetailAttribute;
        private List<ClaimCover> listOfCovers;
        private List<MultiSetAttribute> queryDetails;
        private List<ClaimPayment> claimPayment;
        private List<Document> documents;
        private List<Relation> relations;
        private List<NoteProperty> notes;

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public String getClaimNumber() {
        return claimNumber;
    }

    public void setClaimNumber(String claimNumber) {
        this.claimNumber = claimNumber;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getReopenIndicator() {
        return reopenIndicator;
    }

    public void setReopenIndicator(String reopenIndicator) {
        this.reopenIndicator = reopenIndicator;
    }

    public List<ClaimDetailAttribute> getClaimdetailAttribute() {
        return claimdetailAttribute;
    }

    public void setClaimdetailAttribute(List<ClaimDetailAttribute> claimdetailAttribute) {
        this.claimdetailAttribute = claimdetailAttribute;
    }

    public List<ClaimCover> getListOfCovers() {
        return listOfCovers;
    }

    public void setListOfCovers(List<ClaimCover> listOfCovers) {
        this.listOfCovers = listOfCovers;
    }

    public List<MultiSetAttribute> getQueryDetails() {
        return queryDetails;
    }

    public void setQueryDetails(List<MultiSetAttribute> queryDetails) {
        this.queryDetails = queryDetails;
    }

    public List<ClaimPayment> getClaimPayment() {
        return claimPayment;
    }

    public void setClaimPayment(List<ClaimPayment> claimPayment) {
        this.claimPayment = claimPayment;
    }

    public List<Document> getDocuments() {
        return documents;
    }

    public void setDocuments(List<Document> documents) {
        this.documents = documents;
    }

    public List<Relation> getRelations() {
        return relations;
    }

    public void setRelations(List<Relation> relations) {
        this.relations = relations;
    }

    public List<NoteProperty> getNotes() {
        return notes;
    }

    public void setNotes(List<NoteProperty> notes) {
        this.notes = notes;
    }
}

