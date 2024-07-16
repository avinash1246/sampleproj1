package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.bancsdto.product;

import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.bancsdto.common.Attribute;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@NoArgsConstructor
@AllArgsConstructor
public class BenefitType {

    private String inceptionDate;
    private String expiryDate;
    private String benefitTypeCode;
    private String benefitTypeName;
    private String mandOpt;
    private List<Attribute> attributes;
    private List<Benefit> lstBenefits;

    public String getInceptionDate() {
        return inceptionDate;
    }

    public void setInceptionDate(String inceptionDate) {
        this.inceptionDate = inceptionDate;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getBenefitTypeCode() {
        return benefitTypeCode;
    }

    public void setBenefitTypeCode(String benefitTypeCode) {
        this.benefitTypeCode = benefitTypeCode;
    }

    public String getBenefitTypeName() {
        return benefitTypeName;
    }

    public void setBenefitTypeName(String benefitTypeName) {
        this.benefitTypeName = benefitTypeName;
    }

    public String getMandOpt() {
        return mandOpt;
    }

    public void setMandOpt(String mandOpt) {
        this.mandOpt = mandOpt;
    }

    public List<Attribute> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<Attribute> attributes) {
        this.attributes = attributes;
    }

    public List<Benefit> getLstBenefits() {
        return lstBenefits;
    }

    public void setLstBenefits(List<Benefit> lstBenefits) {
        this.lstBenefits = lstBenefits;
    }
}
