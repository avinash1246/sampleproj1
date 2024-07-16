package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.salesDto.*;
import lombok.AllArgsConstructor;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@AllArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class MasterData {

    public MasterData() {
    }

    private List<PartyRole> partyRoles;
    private List<ProductMaster> productList;
    private List<ProductCoverageMaster> productCoverages;
    private List<ProductCodeListMaster> productCodeLists;
    private List<CoverageMaster> coverages;
    private List<CoveragePartMaster> coverageParts;
    private List<CodeListMaster> codeLists;
    private List<ProductCoverageLevelMaster> productCoverageLevels;
    private List<QuestionMaster> questionMasters;
    private List<FormMaster> formMasters;
    private List<WorkersSicMaster> workersSicMasters;
    private List<WorkersClassificationRateMaster> workersClassificationRateMasters;
    private List<EntityRuleMaster> entityRuleMasters;
    private List<ProductPlanPropertyMaster> productPlanPropertyMasters;
    private Map<String, String> dataDictionary = new HashMap<>();

    public List<PartyRole> getPartyRoles() {
        return partyRoles;
    }

    public void setPartyRoles(List<PartyRole> partyRoles) {
        this.partyRoles = partyRoles;
    }

    public List<ProductMaster> getProductList() {
        return productList;
    }

    public void setProductList(List<ProductMaster> productList) {
        this.productList = productList;
    }

    public List<ProductCodeListMaster> getProductCodeLists() {
        return productCodeLists;
    }

    public void setProductCodeLists(List<ProductCodeListMaster> productCodeLists) {
        this.productCodeLists = productCodeLists;
    }

    public List<ProductCoverageMaster> getProductCoverages() {
        return productCoverages;
    }

    public void setProductCoverages(List<ProductCoverageMaster> productCoverages) {
        this.productCoverages = productCoverages;
    }

    public List<CoverageMaster> getCoverages() {
        return coverages;
    }

    public void setCoverages(List<CoverageMaster> coverages) {
        this.coverages = coverages;
    }

    public List<CoveragePartMaster> getCoverageParts() {
        return coverageParts;
    }

    public void setCoverageParts(List<CoveragePartMaster> coverageParts) {
        this.coverageParts = coverageParts;
    }

    public List<CodeListMaster> getCodeLists() {
        return codeLists;
    }

    public void setCodeLists(List<CodeListMaster> codeLists) {
        this.codeLists = codeLists;
    }

    public List<ProductCoverageLevelMaster> getProductCoverageLevels() {
        return productCoverageLevels;
    }

    public void setProductCoverageLevels(List<ProductCoverageLevelMaster> productCoverageLevels) {
        this.productCoverageLevels = productCoverageLevels;
    }

    public List<QuestionMaster> getQuestionMasters() {
        return questionMasters;
    }

    public void setQuestionMasters(List<QuestionMaster> questionMasters) {
        this.questionMasters = questionMasters;
    }

    public List<FormMaster> getFormMasters() {
        return formMasters;
    }

    public void setFormMasters(List<FormMaster> formMasters) {
        this.formMasters = formMasters;
    }

    public List<EntityRuleMaster> getEntityRuleMasters() {
        return entityRuleMasters;
    }

    public void setWorkersSicMasters(List<WorkersSicMaster> workersSicMasters) {
        this.workersSicMasters = workersSicMasters;
    }

    public void setWorkersClassificationRateMasters(List<WorkersClassificationRateMaster> workersClassificationRateMasters) {
        this.workersClassificationRateMasters = workersClassificationRateMasters;
    }

    public void setEntityRuleMasters(List<EntityRuleMaster> entityRuleMasters) {
        this.entityRuleMasters = entityRuleMasters;
    }

    public Map<String, String> getDataDictionary() {
        return dataDictionary;
    }

    public void setDataDictionary(Map<String, String> dataDictionary) {
        this.dataDictionary = dataDictionary;
    }

    public List<ProductPlanPropertyMaster> getProductPlanPropertyMasters() {
        return productPlanPropertyMasters;
    }

    public void setProductPlanPropertyMasters(List<ProductPlanPropertyMaster> productPlanPropertyMasters) {
        this.productPlanPropertyMasters = productPlanPropertyMasters;
    }
}
