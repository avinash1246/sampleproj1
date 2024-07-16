package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.salesDto;


import lombok.NoArgsConstructor;

import java.time.LocalDate;


@NoArgsConstructor
public class Agreement extends BaseEntity {

    public Agreement(Long agreementId, String agreementTypeCode, LocalDate originalInceptionDate) {
        this.agreementId = agreementId;
        this.agreementTypeCode = agreementTypeCode;
        this.originalInceptionDate = originalInceptionDate;
    }

    private Long agreementId;

    private String agreementTypeCode;

    private LocalDate originalInceptionDate;

    private String productCd;

    public Long getAgreementId() {
        return agreementId;
    }

    public void setAgreementId(Long agreementId) {
        this.agreementId = agreementId;
    }

    public String getAgreementTypeCode() {
        return agreementTypeCode;
    }

    public void setAgreementTypeCode(String agreementTypeCode) {
        this.agreementTypeCode = agreementTypeCode;
    }

    public LocalDate getOriginalInceptionDate() {
        return originalInceptionDate;
    }

    public void setOriginalInceptionDate(LocalDate originalInceptionDate) {
        this.originalInceptionDate = originalInceptionDate;
    }

    public String getProductCd() {
        return productCd;
    }

    public void setProductCd(String productCd) {
        this.productCd = productCd;
    }
}
