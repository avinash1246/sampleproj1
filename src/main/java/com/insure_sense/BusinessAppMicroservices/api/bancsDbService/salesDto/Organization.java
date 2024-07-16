package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.salesDto;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.NoArgsConstructor;


import java.util.List;


@NoArgsConstructor
public class Organization extends BaseEntity {


    public Organization(List<GSTData> gstData) {
    }

    public Organization(Long id, PartyMaster partyMaster, String cin, String companyName,
                        String company_status, String activity_code, String category,
                        String company_Type, String activity_description, String registered_office_address,
                        String incorporation_date, Float annualRevenue, String parentEntityName,
                        String primaryGSTNumber, String panNumber, String udyamAadhaarNumber,
                        String duns) {
        this.id = id;
        this.partyMaster = partyMaster;
        this.cin = cin;
        this.companyName = companyName;
        this.company_status = company_status;
        this.activity_code = activity_code;
        this.category = category;
        this.company_Type = company_Type;
        this.activity_description = activity_description;
        this.registered_office_address = registered_office_address;
        this.incorporation_date = incorporation_date;
        this.annualRevenue = annualRevenue;
        this.parentEntityName = parentEntityName;
        this.primaryGSTNumber = primaryGSTNumber;
        this.panNumber = panNumber;
        this.udyamAadhaarNumber = udyamAadhaarNumber;
        this.duns = duns;
    }

    public Organization(Long id, PartyMaster partyMaster) {
        this.id = id;
        this.partyMaster = partyMaster;
    }

    public Organization(Long id, String cin, String companyName, String company_status,
                        String activity_code, String category, String company_Type,
                        String activity_description, String registered_office_address,
                        String incorporation_date, Float annualRevenue, String parentEntityName,
                        String primaryGSTNumber, String panNumber, String udyamAadhaarNumber,
                        String duns) {
        this.id = id;
        this.cin = cin;
        this.companyName = companyName;
        this.company_status = company_status;
        this.activity_code = activity_code;
        this.category = category;
        this.company_Type = company_Type;
        this.activity_description = activity_description;
        this.registered_office_address = registered_office_address;
        this.incorporation_date = incorporation_date;
        this.annualRevenue = annualRevenue;
        this.parentEntityName = parentEntityName;
        this.primaryGSTNumber = primaryGSTNumber;
        this.panNumber = panNumber;
        this.udyamAadhaarNumber = udyamAadhaarNumber;
        this.duns = duns;
    }

    private Long id;

    @JsonIgnore
    private PartyMaster partyMaster;

    private String cin;
    private String companyName;
    private String company_status;
    private String activity_code;
    private String category;
    private String company_Type;
    private String activity_description;
    private String registered_office_address;
    private String incorporation_date;
    private Float  annualRevenue;
    private String parentEntityName;
    private String primaryGSTNumber;
    private String panNumber;
    private String udyamAadhaarNumber;
    private String duns;

    private List<GSTData> gstData;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompany_status() {
        return company_status;
    }

    public void setCompany_status(String company_status) {
        this.company_status = company_status;
    }

    public String getActivity_code() {
        return activity_code;
    }

    public void setActivity_code(String activity_code) {
        this.activity_code = activity_code;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCompany_Type() {
        return company_Type;
    }

    public void setCompany_Type(String company_Type) {
        this.company_Type = company_Type;
    }

    public String getActivity_description() {
        return activity_description;
    }

    public void setActivity_description(String activity_description) {
        this.activity_description = activity_description;
    }

    public String getRegistered_office_address() {
        return registered_office_address;
    }

    public void setRegistered_office_address(String registered_office_address) {
        this.registered_office_address = registered_office_address;
    }

    public String getIncorporation_date() {
        return incorporation_date;
    }

    public void setIncorporation_date(String incorporation_date) {
        this.incorporation_date = incorporation_date;
    }

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public String getPrimaryGSTNumber() {
        return primaryGSTNumber;
    }

    public void setPrimaryGSTNumber(String primaryGSTNumber) {
        this.primaryGSTNumber = primaryGSTNumber;
    }

    public String getPanNumber() {
        return panNumber;
    }

    public void setPanNumber(String panNumber) {
        this.panNumber = panNumber;
    }

    public String getUdyamAadhaarNumber() {
        return udyamAadhaarNumber;
    }

    public void setUdyamAadhaarNumber(String udyamAadhaarNumber) {
        this.udyamAadhaarNumber = udyamAadhaarNumber;
    }

    public String getDuns() {
        return duns;
    }

    public void setDuns(String duns) {
        this.duns = duns;
    }

    public Float getAnnualRevenue() {
        return annualRevenue;
    }

    public void setAnnualRevenue(Float annualRevenue) {
        this.annualRevenue = annualRevenue;
    }

    public String getParentEntityName() {
        return parentEntityName;
    }

    public void setParentEntityName(String parentEntityName) {
        this.parentEntityName = parentEntityName;
    }

    public PartyMaster getPartyMaster() {
        return partyMaster;
    }

    public void setPartyMaster(PartyMaster partyMaster) {
        this.partyMaster = partyMaster;
    }

    public List<GSTData> getGstData() {
        return gstData;
    }

    public void setGstData(List<GSTData> gstData) {
        this.gstData = gstData;
    }
}
