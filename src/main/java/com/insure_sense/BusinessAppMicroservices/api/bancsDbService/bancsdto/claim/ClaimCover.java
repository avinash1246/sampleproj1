package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.bancsdto.claim;

import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.bancsdto.common.Attribute;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@NoArgsConstructor
@AllArgsConstructor
public class ClaimCover {

    private List<Attribute> coverSetAttribute;
    private List<EntityHead> entityHeads;

    public List<Attribute> getCoverSetAttribute() {
        return coverSetAttribute;
    }

    public void setCoverSetAttribute(List<Attribute> coverSetAttribute) {
        this.coverSetAttribute = coverSetAttribute;
    }

    public List<EntityHead> getEntityHeads() {
        return entityHeads;
    }

    public void setEntityHeads(List<EntityHead> entityHeads) {
        this.entityHeads = entityHeads;
    }
}
