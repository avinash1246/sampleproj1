package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.bancsdto.product;

import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.bancsdto.common.Attribute;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
public class PlanCover {

    private String  coverCode;
    private String  coverName;
    private List<Attribute> coverProperty;
    private List<BenefitType> lstBenefitType;

    public String getCoverCode() {
        return coverCode;
    }

    public void setCoverCode(String coverCode) {
        this.coverCode = coverCode;
    }

    public String getCoverName() {
        return coverName;
    }

    public void setCoverName(String coverName) {
        this.coverName = coverName;
    }


    public List<Attribute> getCoverProperty() {
        return coverProperty;
    }

    public void setCoverProperty(List<Attribute> coverProperty) {
        this.coverProperty = coverProperty;
    }

    public List<BenefitType> getLstBenefitType() {
        return lstBenefitType;
    }

    public void setLstBenefitType(List<BenefitType> lstBenefitType) {
        this.lstBenefitType = lstBenefitType;
    }
}
