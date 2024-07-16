package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.bancsdto.claim;

import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.bancsdto.common.Attribute;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@NoArgsConstructor
@AllArgsConstructor
public class RequirementRow {
    private List<RequirementRow> childRows;
    private List<Attribute> columns;

    public List<RequirementRow> getChildRows() {
        return childRows;
    }

    public void setChildRows(List<RequirementRow> childRows) {
        this.childRows = childRows;
    }

    public List<Attribute> getColumns() {
        return columns;
    }

    public void setColumns(List<Attribute> columns) {
        this.columns = columns;
    }
}
