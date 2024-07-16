package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.bancsdto.claim;

import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.bancsdto.common.MultiSetAttribute;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@NoArgsConstructor
@AllArgsConstructor
public class EntityGridRow {
    private List<MultiSetAttribute> rowAttributes;
    private String setId;

    public List<MultiSetAttribute> getRowAttributes() {
        return rowAttributes;
    }

    public void setRowAttributes(List<MultiSetAttribute> rowAttributes) {
        this.rowAttributes = rowAttributes;
    }

    public String getSetId() {
        return setId;
    }

    public void setSetId(String setId) {
        this.setId = setId;
    }
}
