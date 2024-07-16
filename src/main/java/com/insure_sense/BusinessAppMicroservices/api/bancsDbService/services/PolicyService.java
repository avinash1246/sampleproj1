package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.services;

import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.dto.Policy;
import org.springframework.stereotype.Service;

import java.util.*;


@Service
public class PolicyService {

    public List<Map<String, Object>> checkDuplicates(Policy policy) {
//        String cin = "";
//        String gstNo = "";
//        if (Objects.nonNull(policy.getPolicyInsuredDetails().getCompanyCIN())) {
//            cin = policy.getPolicyInsuredDetails().getCompanyCIN();
//        }
//        if (Objects.nonNull(policy.getPolicyInsuredDetails().getPrimaryGSTNumber())) {
//            gstNo = policy.getPolicyInsuredDetails().getPrimaryGSTNumber();
//        }
//        Set<String> refIds = new HashSet<>();
//        policy.getPolicyPropertyInfo().forEach(ppInfo -> {
//            refIds.add(ppInfo.getRefId());
//        });
//
//        System.out.println("check duplicates: " + cin + "; " + refIds + "; " + policy.getPolicyExt().getProductCd() + "; " + policy.getPolicyExt().getTxnTypeCd() + "; " + policy.getPolicyExt().getTxnSeqNumber() + "; " + policy.getPolicyExt().getPolicyId());
//        List<Map<String, Object>> duplicateQuotes = policyExtRepository.findDuplicates(cin, refIds, policy.getPolicyExt().getProductCd(), policy.getPolicyExt().getTxnTypeCd(), policy.getPolicyExt().getTxnSeqNumber(), policy.getPolicyId(), gstNo);
//        return duplicateQuotes;

        return new ArrayList<>();
    }

    public List<Map<String, String>> getAllQuoteList(String role) {

//        if ((role.contains("admin") || role.contains("underwriter"))) {
//            return policyExtRepository.getAllQuoteList();
//        } else {
//            Long partyId = (Long) claims.get("partyId");
//            return policyExtRepository.getQuoteList(partyId);
//        }
        return new ArrayList<>();
    }

    public List<Map<String, String>> getAllPolicyList(String role) {
//
//        if ((role.contains("admin") || role.contains("underwriter"))) {
//            return policyExtRepository.getAllPolicyList();
//        } else {
//            Long partyId = (Long) claims.get("partyId");
//            return policyExtRepository.getPolicyList(partyId);
//        }

        return new ArrayList<>();
    }

    public Long findByCaseId(String caseId) {

//        return policyExtRepository.findByCaseId(caseId).getPolicyId();

        return 0L;
    }

    public List<Map<String, String>> getPolicyTransactions(Long policyId) {

        List<Map<String, String>> policyTrancsactions = new ArrayList<>();
        return policyTrancsactions;
    }


}
