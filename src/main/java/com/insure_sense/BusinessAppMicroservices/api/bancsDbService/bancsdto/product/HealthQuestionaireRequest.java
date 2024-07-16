package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.bancsdto.product;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@NoArgsConstructor
@AllArgsConstructor
public class HealthQuestionaireRequest {

    private String productCode;
    private String planCode;
    private List<String> questionSet;

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getPlanCode() {
        return planCode;
    }

    public void setPlanCode(String planCode) {
        this.planCode = planCode;
    }

    public List<String> getQuestionSet() {
        return questionSet;
    }

    public void setQuestionSet(List<String> questionSet) {
        this.questionSet = questionSet;
    }
}
