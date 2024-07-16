package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.bancsdto.policy;

import java.util.List;

import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.bancsdto.common.Attribute;
import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.bancsdto.party.Party;
import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.bancsdto.product.Benefit;
import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.bancsdto.product.PlanCover;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
public class Member {

    private List<Attribute> memberDetails;
    private List<PlanCover> covers;
    private String inceptionDate;
    private String grosspremium;
    private String netpremium;
    private String loading;
    private String discount;
    private String expiryDate;
    private String riskCode;
    private int riskid;
    private String riskName;
    private Party party;
    private List<MemberQuestionaire> questionnaire;
    private List<MemberQuestionaire> additionalQuestionnaire;
    private List<Benefit> benefits;
    private List<DiscountLoad> discountLoads;
    public String getInceptionDate() {
        return inceptionDate;
    }

    public void setInceptionDate(String inceptionDate) {
        this.inceptionDate = inceptionDate;
    }

    public String getGrosspremium() {
        return grosspremium;
    }

    public void setGrosspremium(String grosspremium) {
        this.grosspremium = grosspremium;
    }

    public String getNetpremium() {
        return netpremium;
    }

    public void setNetpremium(String netpremium) {
        this.netpremium = netpremium;
    }

    public String getLoading() {
        return loading;
    }

    public void setLoading(String loading) {
        this.loading = loading;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public Party getParty() {
        return party;
    }

    public void setParty(Party party) {
        this.party = party;
    }

    public List<Attribute> getMemberDetails() {
        return memberDetails;
    }

    public void setMemberDetails(List<Attribute> memberDetails) {
        this.memberDetails = memberDetails;
    }

    public List<PlanCover> getCovers() {
        return covers;
    }

    public void setCovers(List<PlanCover> covers) {
        this.covers = covers;
    }

    public List<Benefit> getBenefits() {
        return benefits;
    }

    public void setBenefits(List<Benefit> benefits) {
        this.benefits = benefits;
    }

    public List<DiscountLoad> getDiscountLoads() {
        return discountLoads;
    }

    public void setDiscountLoads(List<DiscountLoad> discountLoads) {
        this.discountLoads = discountLoads;
    }

    public List<MemberQuestionaire> getQuestionnaire() {
        return questionnaire;
    }

    public void setQuestionnaire(List<MemberQuestionaire> questionnaire) {
        this.questionnaire = questionnaire;
    }

    public List<MemberQuestionaire> getAdditionalQuestionnaire() {
        return additionalQuestionnaire;
    }

    public void setAdditionalQuestionnaire(List<MemberQuestionaire> additionalQuestionnaire) {
        this.additionalQuestionnaire = additionalQuestionnaire;
    }

	public String getRiskCode() {
		return riskCode;
	}

	public void setRiskCode(String riskCode) {
		this.riskCode = riskCode;
	}

	public int getRiskid() {
		return riskid;
	}

	public void setRiskid(int riskid) {
		this.riskid = riskid;
	}

	public String getRiskName() {
		return riskName;
	}

	public void setRiskName(String riskName) {
		this.riskName = riskName;
	}
    
    
}
