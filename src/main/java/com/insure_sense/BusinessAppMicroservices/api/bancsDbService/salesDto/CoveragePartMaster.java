package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.salesDto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;




@AllArgsConstructor
@NoArgsConstructor
public class CoveragePartMaster extends BaseEntity {

    public CoveragePartMaster(String coveragePartCd) {
        this.coveragePartCd = coveragePartCd;
    }

    
    private String coveragePartCd;
    private String coveragePartName;
    private Boolean selected;

    private Integer orderOfAppearance;

    public String getCoveragePartCd() {
        return coveragePartCd;
    }

    public void setCoveragePartCd(String coveragePartCd) {
        this.coveragePartCd = coveragePartCd;
    }

    public String getCoveragePartName() {
        return coveragePartName;
    }

    public void setCoveragePartName(String coveragePartName) {
        this.coveragePartName = coveragePartName;
    }

    public Boolean getSelected() {
        return selected;
    }

    public void setSelected(Boolean selected) {
        this.selected = selected;
    }

    public Integer getOrderOfAppearance() {
        return orderOfAppearance;
    }

    public void setOrderOfAppearance(Integer orderOfAppearance) {
        this.orderOfAppearance = orderOfAppearance;
    }
}
