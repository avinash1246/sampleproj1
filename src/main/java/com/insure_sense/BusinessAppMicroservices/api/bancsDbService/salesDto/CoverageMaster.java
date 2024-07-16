package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.salesDto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.NonNull;



@AllArgsConstructor
@NoArgsConstructor
public class CoverageMaster extends BaseEntity {

    public CoverageMaster(@NonNull String coverageCd) {
        this.coverageCd = coverageCd;
    }

    
    private String coverageCd;

    private String coveragePartCd;

    private String coverageName;

    private String coverageDescription;

    private String coverageTypeCd;

    private Integer orderOfAppearance;

    public String getCoverageCd() {
        return coverageCd;
    }

    public void setCoverageCd(String coverageCd) {
        this.coverageCd = coverageCd;
    }

    public String getCoveragePartCd() {
        return coveragePartCd;
    }

    public void setCoveragePartCd(String coveragePartCd) {
        this.coveragePartCd = coveragePartCd;
    }

    public String getCoverageName() {
        return coverageName;
    }

    public void setCoverageName(String coverageName) {
        this.coverageName = coverageName;
    }

    public String getCoverageDescription() {
        return coverageDescription;
    }

    public void setCoverageDescription(String coverageDescription) {
        this.coverageDescription = coverageDescription;
    }

    public String getCoverageTypeCd() {
        return coverageTypeCd;
    }

    public void setCoverageTypeCd(String coverageTypeCd) {
        this.coverageTypeCd = coverageTypeCd;
    }

    public Integer getOrderOfAppearance() {
        return orderOfAppearance;
    }

    public void setOrderOfAppearance(Integer orderOfAppearance) {
        this.orderOfAppearance = orderOfAppearance;
    }
}
