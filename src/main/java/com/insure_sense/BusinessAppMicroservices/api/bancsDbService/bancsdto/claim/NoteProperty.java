package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.bancsdto.claim;

import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.bancsdto.common.Attribute;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@NoArgsConstructor
@AllArgsConstructor
public class NoteProperty {
    private List<Attribute> noteProperty;

    public List<Attribute> getNoteProperty() {
        return noteProperty;
    }

    public void setNoteProperty(List<Attribute> noteProperty) {
        this.noteProperty = noteProperty;
    }
}
