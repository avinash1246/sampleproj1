package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.bancsdto.claim;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@NoArgsConstructor
@AllArgsConstructor
public class EntityHead {
    private List<EntityGridRow> entityGridRows;
    private String entityHeadCode;
    private String entityHeadName;
    private String entityType;

    public List<EntityGridRow> getEntityGridRows() {
        return entityGridRows;
    }

    public void setEntityGridRows(List<EntityGridRow> entityGridRows) {
        this.entityGridRows = entityGridRows;
    }

    public String getEntityHeadCode() {
        return entityHeadCode;
    }

    public void setEntityHeadCode(String entityHeadCode) {
        this.entityHeadCode = entityHeadCode;
    }

    public String getEntityHeadName() {
        return entityHeadName;
    }

    public void setEntityHeadName(String entityHeadName) {
        this.entityHeadName = entityHeadName;
    }

    public String getEntityType() {
        return entityType;
    }

    public void setEntityType(String entityType) {
        this.entityType = entityType;
    }
}
