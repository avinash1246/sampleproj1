package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.salesDto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class PolicyCommodityInfo extends BaseEntity {

    public PolicyCommodityInfo(Long policyId, Long insurableObjectId, Long insurableObjectRef,
                               String commodityTypeCd, String packingCd, String commodityDescription,
                               String lossCd, Double ioSumInsured) {
        this.policyId = policyId;
        this.insurableObjectId = insurableObjectId;
        this.insurableObjectRef = insurableObjectRef;
        this.commodityTypeCd = commodityTypeCd;
        this.packingCd = packingCd;
        this.commodityDescription = commodityDescription;
        this.lossCd = lossCd;
        this.ioSumInsured = ioSumInsured;
    }


    private Long policyId;


    private Long insurableObjectId;

    private Long insurableObjectRef;
    private String commodityTypeCd;
    private String packingCd;
    private String commodityDescription;
    private String lossCd;
    private Double ioSumInsured;

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

    public String getCommodityTypeCd() {
        return commodityTypeCd;
    }

    public void setCommodityTypeCd(String commodityTypeCd) {
        this.commodityTypeCd = commodityTypeCd;
    }

    public String getPackingCd() {
        return packingCd;
    }

    public void setPackingCd(String packingCd) {
        this.packingCd = packingCd;
    }

    public String getCommodityDescription() {
        return commodityDescription;
    }

    public void setCommodityDescription(String commodityDescription) {
        this.commodityDescription = commodityDescription;
    }

    public String getLossCd() {
        return lossCd;
    }

    public void setLossCd(String lossCd) {
        this.lossCd = lossCd;
    }

    public Double getIoSumInsured() {
        return ioSumInsured;
    }

    public void setIoSumInsured(Double ioSumInsured) {
        this.ioSumInsured = ioSumInsured;
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
