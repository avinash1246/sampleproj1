package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.bancsdto.policy;

import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.bancsdto.common.Attribute;
import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.bancsdto.product.PlanCover;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@NoArgsConstructor
@AllArgsConstructor
public class QuickQuoteRequest {

    private String productCode;
    private String quoteNumber;
    private List<Attribute> basicDetails;
    private List<Member> members;
    private List<PlanCover> covers;
    private List<DiscountLoad> discountLoads;
    private String flag;
    private String userCode;

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getQuoteNumber() {
        return quoteNumber;
    }

    public void setQuoteNumber(String quoteNumber) {
        this.quoteNumber = quoteNumber;
    }

    public List<Attribute> getBasicDetails() {
        return basicDetails;
    }

    public void setBasicDetails(List<Attribute> basicDetails) {
        this.basicDetails = basicDetails;
    }

    public List<Member> getMembers() {
        return members;
    }

    public void setMembers(List<Member> members) {
        this.members = members;
    }

    public List<PlanCover> getCovers() {
        return covers;
    }

    public void setCovers(List<PlanCover> covers) {
        this.covers = covers;
    }

    public List<DiscountLoad> getDiscountLoads() {
        return discountLoads;
    }

    public void setDiscountLoads(List<DiscountLoad> discountLoads) {
        this.discountLoads = discountLoads;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }
}
