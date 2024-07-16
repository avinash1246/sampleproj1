package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.services;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.dto.PolicyPremiumSummary;
import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.dto.PolicyPremiumSummaryKey;
import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.salesDto.PolicyAmount;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class BuildPremiumSummaryService {

    ObjectMapper o = new ObjectMapper();

    public List<PolicyPremiumSummary> buildPremiumSummary(List<PolicyAmount> policyAmounts) {

        String caseId;
        /*      caseId = buildPremiumSummaryRequest.getCaseId();*/

        Map<PolicyPremiumSummaryKey, PolicyPremiumSummary> policyPremiumSummaryMap = new HashMap<>();
        Set<String> coveragePartCds = new HashSet<>();
        Map<String, Set<Long>> coverageLocations = new HashMap<>();
        Map<String, Set<String>> coverageCoverTypes = new HashMap<>();
        Set<String> amountCategories = new HashSet<>();

        amountCategories.add("FullTerm");
        amountCategories.add("CurrentTerm");
        amountCategories.add("NetChange");

        policyAmounts.stream().filter(x -> !x.getCovertype().equals("All Cover")).forEach(pAmt -> {

            Double preTaxPremium = 0.00;
            Double cgst = 0.00;
            Double sgst = 0.00;

            coveragePartCds.add(pAmt.getCoveragePartCd());
            if (Objects.nonNull(pAmt.getInsurableObjectRef())) {
                if (Objects.nonNull(coverageLocations.get(pAmt.getCoveragePartCd()))) {
                    Set<Long> locationsSet = coverageLocations.get(pAmt.getCoveragePartCd());
                    locationsSet.add(pAmt.getInsurableObjectRef());
                    coverageLocations.replace(pAmt.getCoveragePartCd(), locationsSet);
                } else {
                    Set<Long> locationsSet = new HashSet<>();
                    locationsSet.add(pAmt.getInsurableObjectRef());
                    coverageLocations.put(pAmt.getCoveragePartCd(), locationsSet);
                }
            }

            if (Objects.nonNull(coverageCoverTypes.get(pAmt.getCoveragePartCd()))) {
                Set<String> coverTypesSet = coverageCoverTypes.get(pAmt.getCoveragePartCd());
                coverTypesSet.add((String) pAmt.getCovertype());
                coverageCoverTypes.replace(pAmt.getCoveragePartCd(), coverTypesSet);
            } else {
                Set<String> coverTypesSet = new HashSet<>();
                coverTypesSet.add((String) pAmt.getCovertype());
                coverageCoverTypes.put(pAmt.getCoveragePartCd(), coverTypesSet);
            }

            PolicyPremiumSummaryKey policyPremiumSummaryKey = new PolicyPremiumSummaryKey(pAmt.getCoveragePartCd(), pAmt.getInsurableObjectRef(), (String) pAmt.getCovertype(),"FullTerm", false);

            if (!policyPremiumSummaryMap.containsKey(policyPremiumSummaryKey)) {

                PolicyPremiumSummary policyPremiumSummary;

                if (Objects.nonNull(pAmt.getInsurableObjectRef())) {
                    policyPremiumSummary = new PolicyPremiumSummary(0, pAmt.getCoveragePartCd(), null,
                        pAmt.getInsurableObjectRef(), null, (String) pAmt.getCovertype(), "FullTerm", false,
                        null, null, null, null);
                } else {
                    policyPremiumSummary = new PolicyPremiumSummary(0, pAmt.getCoveragePartCd(), null,
                        null, null, (String) pAmt.getCovertype(), "FullTerm", false,
                        null, null, null, null);
                }

                Double pAmount = Math.round(pAmt.getPolicyamount() * 100) / 100.00;

                if (pAmt.getAmounttype().equals("Premium")) {
                    policyPremiumSummary.setPretaxPremium(pAmount);
                } else if (pAmt.getAmounttype().equals("CGST")) {
                    policyPremiumSummary.setCgst(pAmount);
                } else if (pAmt.getAmounttype().equals("SGST")) {
                    policyPremiumSummary.setSgst(pAmount);
                }

                policyPremiumSummaryMap.put(policyPremiumSummaryKey, policyPremiumSummary);

            } else {

                PolicyPremiumSummary premSummary = policyPremiumSummaryMap.get(policyPremiumSummaryKey);

                Double pAmount = Math.round(pAmt.getPolicyamount() * 100) / 100.00;

                if (pAmt.getAmounttype().equals("Premium")) {
                    if (Objects.nonNull(premSummary.getPretaxPremium())) {
                        preTaxPremium = premSummary.getPretaxPremium() + pAmount;
                    } else {
                        preTaxPremium = pAmount;
                    }
                    premSummary.setPretaxPremium(Math.round(preTaxPremium * 100) / 100.00);
                } else if (pAmt.getAmounttype().equals("CGST")) {
                    if (Objects.nonNull(premSummary.getCgst())) {
                        cgst = premSummary.getCgst() + pAmount;
                    } else {
                        cgst = pAmount;
                    }
                    premSummary.setCgst(Math.round(cgst * 100) / 100.00);
                } else if (pAmt.getAmounttype().equals("SGST")) {
                    if (Objects.nonNull(premSummary.getSgst())) {
                        sgst = premSummary.getSgst() + pAmount;
                    } else {
                        sgst = pAmount;
                    }
                    premSummary.setSgst(Math.round(sgst * 100) / 100.00);
                }

            }

        });

        for (String cvgPart : coveragePartCds) {
            if (Objects.nonNull(coverageLocations.get(cvgPart))) {
                for (Long loc : coverageLocations.get(cvgPart)) {
                    for (String coverType : coverageCoverTypes.get(cvgPart)) {
                        PolicyPremiumSummaryKey policyPremiumSummarykey = new PolicyPremiumSummaryKey(cvgPart, loc, coverType, "FullTerm", false);
                        PolicyPremiumSummary policyPremiumSummary = policyPremiumSummaryMap.get(policyPremiumSummarykey);
                        /*                        System.out.println("Location Level: " + o.writeValueAsString(premiumCoveragePartSummary));*/
                        Double quotePremium = Math.round((policyPremiumSummary.getPretaxPremium() + policyPremiumSummary.getCgst() + policyPremiumSummary.getSgst()) * 100.00)/100.00;
                        policyPremiumSummary.setQuotePremium(quotePremium);
                    }
                }
            } else {
                for (String coverType : coverageCoverTypes.get(cvgPart)) {

                    PolicyPremiumSummaryKey policyPremiumSummarykey = new PolicyPremiumSummaryKey(cvgPart, coverType, "FullTerm", false);
                    PolicyPremiumSummary policyPremiumSummary = policyPremiumSummaryMap.get(policyPremiumSummarykey);
                    /*                    System.out.println("Section level: " + o.writeValueAsString(premiumCoveragePartSummary));*/

                    Double quotePremium = Math.round((policyPremiumSummary.getPretaxPremium() + policyPremiumSummary.getCgst() + policyPremiumSummary.getSgst()) * 100.00)/100.00;
                    policyPremiumSummary.setQuotePremium(quotePremium);
                }
            }

        }


        policyAmounts.stream().filter(x -> ((String) x.getCovertype()).equals("All Cover")).forEach(pAmt -> {

            Double amount = Math.round((pAmt.getPolicyamount()) * 100) / 100.00;
            if (pAmt.getAmounttype().equals("FullTermPremium")) {
                PolicyPremiumSummaryKey polRatingDetailId = new PolicyPremiumSummaryKey(null, null, "All Cover", "FullTerm", false);

                if (!policyPremiumSummaryMap.containsKey(polRatingDetailId)) {
                    System.out.println("FullTermPremium does not exist");
                    PolicyPremiumSummary polPremiumSummary = new PolicyPremiumSummary(0, null, null,
                        null, null, "All Cover", "FullTerm", false,
                        amount, null, null, null);

                    policyPremiumSummaryMap.put(polRatingDetailId, polPremiumSummary);
                } else {
                    System.out.println("FullTermPremium exists");
                    PolicyPremiumSummary polPremiumSummary = policyPremiumSummaryMap.get(polRatingDetailId);
                    polPremiumSummary.setPretaxPremium(amount);
                    policyPremiumSummaryMap.replace(polRatingDetailId, polPremiumSummary);
                }

            } else if (pAmt.getAmounttype().equals("FullTermCGST")) {

                PolicyPremiumSummaryKey polRatingDetailId = new PolicyPremiumSummaryKey(null, null, "All Cover", "FullTerm", false);
                if (!policyPremiumSummaryMap.containsKey(polRatingDetailId)) {
                    PolicyPremiumSummary polPremiumSummary = new PolicyPremiumSummary(0, null, null,
                        null, null, "All Cover", "FullTerm", false,
                        null, amount, null, null);

                    policyPremiumSummaryMap.put(polRatingDetailId, polPremiumSummary);
                } else {
                    PolicyPremiumSummary polPremiumSummary = policyPremiumSummaryMap.get(polRatingDetailId);
                    polPremiumSummary.setCgst(amount);
                    policyPremiumSummaryMap.replace(polRatingDetailId, polPremiumSummary);
                }
            } else if (pAmt.getAmounttype().equals("FullTermSGST")) {
                PolicyPremiumSummaryKey polRatingDetailId = new PolicyPremiumSummaryKey(null, null, "All Cover", "FullTerm", false);
                if (!policyPremiumSummaryMap.containsKey(polRatingDetailId)) {
                    PolicyPremiumSummary polPremiumSummary = new PolicyPremiumSummary(0, null, null,
                        null, null, "All Cover", "FullTerm", false,
                        null, null, amount, null);

                    policyPremiumSummaryMap.put(polRatingDetailId, polPremiumSummary);
                } else {
                    PolicyPremiumSummary polPremiumSummary = policyPremiumSummaryMap.get(polRatingDetailId);
                    polPremiumSummary.setSgst(amount);
                    policyPremiumSummaryMap.replace(polRatingDetailId, polPremiumSummary);
                }
            } else if (pAmt.getAmounttype().equals("CurrentTermPremium")) {
                PolicyPremiumSummaryKey polRatingDetailId = new PolicyPremiumSummaryKey(null, null, "All Cover", "CurrentTerm", false);

                if (!policyPremiumSummaryMap.containsKey(polRatingDetailId)) {

                    PolicyPremiumSummary polPremiumSummary = new PolicyPremiumSummary(0, null, null,
                        null, null, "All Cover", "CurrentTerm", false,
                        amount, null, null, null);

                    policyPremiumSummaryMap.put(polRatingDetailId, polPremiumSummary);
                } else {
                    PolicyPremiumSummary polPremiumSummary = policyPremiumSummaryMap.get(polRatingDetailId);
                    polPremiumSummary.setPretaxPremium(amount);
                    policyPremiumSummaryMap.replace(polRatingDetailId, polPremiumSummary);
                }
            } else if (pAmt.getAmounttype().equals("CurrentTermCGST")) {
                PolicyPremiumSummaryKey polRatingDetailId = new PolicyPremiumSummaryKey(null, null, "All Cover", "CurrentTerm", false);
                if (!policyPremiumSummaryMap.containsKey(polRatingDetailId)) {

                    PolicyPremiumSummary polPremiumSummary = new PolicyPremiumSummary(0, null, null,
                        null, null, "All Cover", "CurrentTerm", false,
                        null, amount, null, null);

                    policyPremiumSummaryMap.put(polRatingDetailId, polPremiumSummary);
                } else {
                    PolicyPremiumSummary polPremiumSummary = policyPremiumSummaryMap.get(polRatingDetailId);
                    polPremiumSummary.setCgst(amount);
                    policyPremiumSummaryMap.replace(polRatingDetailId, polPremiumSummary);
                }
            } else if (pAmt.getAmounttype().equals("CurrentTermSGST")) {
                PolicyPremiumSummaryKey polRatingDetailId = new PolicyPremiumSummaryKey(null, null, "All Cover", "CurrentTerm", false);
                if (!policyPremiumSummaryMap.containsKey(polRatingDetailId)) {

                    PolicyPremiumSummary polPremiumSummary = new PolicyPremiumSummary(0, null, null,
                        null, null, "All Cover", "CurrentTerm", false,
                        null, null, amount, null);

                    policyPremiumSummaryMap.put(polRatingDetailId, polPremiumSummary);
                } else {
                    PolicyPremiumSummary polPremiumSummary = policyPremiumSummaryMap.get(polRatingDetailId);
                    polPremiumSummary.setSgst(amount);
                    policyPremiumSummaryMap.replace(polRatingDetailId, polPremiumSummary);
                }
            } else if (pAmt.getAmounttype().equals("NetChangePremium")) {
                PolicyPremiumSummaryKey polRatingDetailId = new PolicyPremiumSummaryKey(null, null, "All Cover", "NetChange", false);
                if (!policyPremiumSummaryMap.containsKey(polRatingDetailId)) {

                    PolicyPremiumSummary polPremiumSummary = new PolicyPremiumSummary(0, null, null,
                        null, null, "All Cover", "NetChange", false,
                        amount, null, null, null);

                    policyPremiumSummaryMap.put(polRatingDetailId, polPremiumSummary);
                } else {
                    PolicyPremiumSummary polPremiumSummary = policyPremiumSummaryMap.get(polRatingDetailId);
                    polPremiumSummary.setPretaxPremium(amount);
                    policyPremiumSummaryMap.replace(polRatingDetailId, polPremiumSummary);
                }
            } else if (pAmt.getAmounttype().equals("NetChangeCGST")) {
                PolicyPremiumSummaryKey polRatingDetailId = new PolicyPremiumSummaryKey(null, null, "All Cover", "NetChange", false);
                if (!policyPremiumSummaryMap.containsKey(polRatingDetailId)) {
                    PolicyPremiumSummary polPremiumSummary = new PolicyPremiumSummary(0, null, null,
                        null, null, "All Cover", "NetChange", false,
                        null, amount, null, null);

                    policyPremiumSummaryMap.put(polRatingDetailId, polPremiumSummary);
                } else {
                    PolicyPremiumSummary polPremiumSummary = policyPremiumSummaryMap.get(polRatingDetailId);
                    polPremiumSummary.setCgst(amount);
                    policyPremiumSummaryMap.replace(polRatingDetailId, polPremiumSummary);
                }
            } else if (pAmt.getAmounttype().equals("NetChangeSGST")) {
                PolicyPremiumSummaryKey polRatingDetailId = new PolicyPremiumSummaryKey(null, null, "All Cover", "NetChange", false);
                if (!policyPremiumSummaryMap.containsKey(polRatingDetailId)) {
                    PolicyPremiumSummary polPremiumSummary = new PolicyPremiumSummary(0, null, null,
                        null, null, "All Cover", "NetChange", false,
                        null, null,amount, null);

                    policyPremiumSummaryMap.put(polRatingDetailId, polPremiumSummary);
                } else {
                    PolicyPremiumSummary polPremiumSummary = policyPremiumSummaryMap.get(polRatingDetailId);
                    polPremiumSummary.setSgst(amount);
                    policyPremiumSummaryMap.replace(polRatingDetailId, polPremiumSummary);
                }
            } else if (pAmt.getAmounttype().equals("NetChangeCommission")) {
                PolicyPremiumSummaryKey polRatingDetailId = new PolicyPremiumSummaryKey(null, null, "All Cover", "NetChange", true);
                if (!policyPremiumSummaryMap.containsKey(polRatingDetailId)) {

                    PolicyPremiumSummary polPremiumSummary = new PolicyPremiumSummary(0, null, null,
                            null, null, "All Cover", "NetChange", true,
                            amount, 0.00, 0.00, null);

                    policyPremiumSummaryMap.put(polRatingDetailId, polPremiumSummary);
                } else {
                    PolicyPremiumSummary polPremiumSummary = policyPremiumSummaryMap.get(polRatingDetailId);
                    polPremiumSummary.setPretaxPremium(amount);
                    policyPremiumSummaryMap.replace(polRatingDetailId, polPremiumSummary);
                }
            } else if (pAmt.getAmounttype().equals("CurrentTermCommission")) {
                PolicyPremiumSummaryKey polRatingDetailId = new PolicyPremiumSummaryKey(null, null, "All Cover", "CurrentTerm", true);
                if (!policyPremiumSummaryMap.containsKey(polRatingDetailId)) {
                    PolicyPremiumSummary polPremiumSummary = new PolicyPremiumSummary(0, null, null,
                            null, null, "All Cover", "CurrentTerm", true,
                            amount, 0.00, 0.00, null);

                    policyPremiumSummaryMap.put(polRatingDetailId, polPremiumSummary);
                } else {
                    PolicyPremiumSummary polPremiumSummary = policyPremiumSummaryMap.get(polRatingDetailId);
                    polPremiumSummary.setPretaxPremium(amount);
                    policyPremiumSummaryMap.replace(polRatingDetailId, polPremiumSummary);
                }
            } else if (pAmt.getAmounttype().equals("FullTermCommission")) {
                PolicyPremiumSummaryKey polRatingDetailId = new PolicyPremiumSummaryKey(null, null, "All Cover", "FullTerm", true);

                if (!policyPremiumSummaryMap.containsKey(polRatingDetailId)) {
                    System.out.println("FullTermCommission does not exist");
                    PolicyPremiumSummary polPremiumSummary = new PolicyPremiumSummary(0, null, null,
                            null, null, "All Cover", "FullTerm", true,
                            amount, 0.00, 0.00, null);

                    policyPremiumSummaryMap.put(polRatingDetailId, polPremiumSummary);
                } else {
                    System.out.println("FullTermCommision exists");
                    PolicyPremiumSummary polPremiumSummary = policyPremiumSummaryMap.get(polRatingDetailId);
                    polPremiumSummary.setPretaxPremium(amount);
                    policyPremiumSummaryMap.replace(polRatingDetailId, polPremiumSummary);
                }
            }

        });

        try {
            System.out.println("premiumsummary map: "+ o.writeValueAsString(policyPremiumSummaryMap.values()));
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        for (String amountCategory: amountCategories) {
            PolicyPremiumSummaryKey polRatingDetailId = new PolicyPremiumSummaryKey(null, null, "All Cover", amountCategory, false);

            System.out.println("premiumsummary key: "+ polRatingDetailId);

            PolicyPremiumSummary policyPremiumSummary = policyPremiumSummaryMap.get(polRatingDetailId);
            policyPremiumSummary.setQuotePremium(Math.round((policyPremiumSummary.getPretaxPremium() +
                                                    policyPremiumSummary.getCgst() +
                                                    policyPremiumSummary.getSgst()) * 100) / 100.00);
            policyPremiumSummaryMap.replace(polRatingDetailId, policyPremiumSummary);
        }


        List<PolicyPremiumSummary> premiumSummaryList = new ArrayList<>();

        for (PolicyPremiumSummaryKey key: policyPremiumSummaryMap.keySet()) {
            premiumSummaryList.add(policyPremiumSummaryMap.get(key));
        }

        return premiumSummaryList;

    }

}
