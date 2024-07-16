package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.salesDto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.NoArgsConstructor;
import org.apache.kafka.common.protocol.types.Field;

@NoArgsConstructor
public class PolicyWorkersCompInfo extends BaseEntity {

    public PolicyWorkersCompInfo(Long policyId, Long insurableObjectId, Long insurableObjectRef,
                                   Double baseRate, String workersCd, String workersDesc, Long nOfEmployees,
                                 Double monthlyWages, Double annualWages, Double balanceWages, Double expDiscount) {
        this.policyId = policyId;
        this.insurableObjectId = insurableObjectId;
        this.insurableObjectRef = insurableObjectRef;
        this.baseRate = baseRate;
        this.workersCd = workersCd;
        this.workersDesc = workersDesc;
        this.nOfEmployees = nOfEmployees;
        this.monthlyWages = monthlyWages;
        this.annualWages = annualWages;
        this.balanceWages = balanceWages;
        this.expDiscount = expDiscount;
    }


    private Long policyId;


    private Long insurableObjectId;

    private Long insurableObjectRef;
    private Double baseRate;
    private String workersCd;
    private String workersDesc;
    private Long nOfEmployees;
    private Double monthlyWages;
    private Double annualWages;
    private Double balanceWages;
    private Double expDiscount;

    @JsonIgnore
    private PolicyExt policyExt;

    @JsonIgnore
    private InsurableObject insurableObject;

    public Long getPolicyId() {
        return policyId;
    }

    public void setPolicyId(Long policyId) {
        this.policyId = policyId;
    }

    public Long getInsurableObjectId() {
        return insurableObjectId;
    }

    public void setInsurableObjectId(Long insurableObjectId) {
        this.insurableObjectId = insurableObjectId;
    }

    public Long getInsurableObjectRef() {
        return insurableObjectRef;
    }

    public void setInsurableObjectRef(Long insurableObjectRef) {
        this.insurableObjectRef = insurableObjectRef;
    }

    public Double getBaseRate() {
        return baseRate;
    }

    public void setBaseRate(Double baseRate) {
        this.baseRate = baseRate;
    }

    public String getWorkersCd() {
        return workersCd;
    }

    public void setWorkersCd(String workersCd) {
        this.workersCd = workersCd;
    }

    public String getWorkersDesc() {
        return workersDesc;
    }

    public void setWorkersDesc(String workersDesc) {
        this.workersDesc = workersDesc;
    }

    public Long getnOfEmployees() {
        return nOfEmployees;
    }

    public void setnOfEmployees(Long nOfEmployees) {
        this.nOfEmployees = nOfEmployees;
    }

    public Double getMonthlyWages() {
        return monthlyWages;
    }

    public void setMonthlyWages(Double monthlyWages) {
        this.monthlyWages = monthlyWages;
    }

    public Double getAnnualWages() {
        return annualWages;
    }

    public void setAnnualWages(Double annualWages) {
        this.annualWages = annualWages;
    }

    public Double getBalanceWages() {
        return balanceWages;
    }

    public void setBalanceWages(Double balanceWages) {
        this.balanceWages = balanceWages;
    }

    public Double getExpDiscount() {
        return expDiscount;
    }

    public void setExpDiscount(Double expDiscount) {
        this.expDiscount = expDiscount;
    }

    public PolicyExt getPolicyExt() {
        return policyExt;
    }

    public void setPolicyExt(PolicyExt policyExt) {
        this.policyExt = policyExt;
    }

    public InsurableObject getInsurableObject() {
        return insurableObject;
    }

    public void setInsurableObject(InsurableObject insurableObject) {
        this.insurableObject = insurableObject;
    }
}
