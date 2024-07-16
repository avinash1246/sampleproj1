package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.quickQuoteResponse;

import java.util.ArrayList;

public class QuoteResponse{
    public String productCode;
    public String productName;
    public String quoteNumber;
    public String sourceName;
    public String quoteStartDate;
    public String policyTenure;
    public String policyStatus;
    public String planCode;
    public QuotePremiumDetails quotePremiumDetails;
    public ArrayList<Member> members;
    public Response response;
}
