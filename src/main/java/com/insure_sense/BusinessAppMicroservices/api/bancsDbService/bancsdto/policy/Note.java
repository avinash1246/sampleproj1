package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.bancsdto.policy;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
public class Note {
    private String sLNo;
    private String date;
    private String user;
    private String type;
    private String explanatoryNotes;
    private String assignedTo;
    public String getsLNo() {
        return sLNo;
    }
    public void setsLNo(String sLNo) {
        this.sLNo = sLNo;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getExplanatoryNotes() {
        return explanatoryNotes;
    }

    public void setExplanatoryNotes(String explanatoryNotes) {
        this.explanatoryNotes = explanatoryNotes;
    }

    public String getAssignedTo() {
        return assignedTo;
    }

    public void setAssignedTo(String assignedTo) {
        this.assignedTo = assignedTo;
    }
}
