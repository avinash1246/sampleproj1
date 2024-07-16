package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.bancsdto.document;

import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.bancsdto.common.Attribute;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@NoArgsConstructor
@AllArgsConstructor
public class Document {

    private List<Attribute> document;

    public List<Attribute> getDocument() {
        return document;
    }

    public void setDocument(List<Attribute> document) {
        this.document = document;
    }
}
