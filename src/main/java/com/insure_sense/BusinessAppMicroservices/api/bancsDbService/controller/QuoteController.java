package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.bancsdto.getQuote.GetQuoteConvertedResponse;
import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.bancsdto.issuePolicy.IssuePolicyResponse;
import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.bancsdto.policy.ProposalResponse;
import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.bancsdto.saveParty.SavePartyRequest;
import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.bancsdto.saveParty.SavePartyResponse;
import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.bancsdto.searchQuote.SearchQuoteRequest;
import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.bancsdto.searchQuote.SearchQuoteResponse;
import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.dto.MasterData;
import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.dto.PartyMaster;
import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.dto.PlanPremiumSummary;
import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.dto.Policy;
import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.dto.ProductListMaster;
import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.dto.RatingData;
import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.quickQuoteResponse.PolicyOption;
import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.salesDto.SaveQuoteConvertedRequest;
import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.salesDto.SaveQuoteResponse;
import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.services.BuildPlanPremiumService;
import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.services.GetEntityService;
import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.services.GetMasterDataService;
import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.services.GetQuoteService;
import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.services.IssuePolicyService;
import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.services.PartyService;
import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.services.PolicyService;
import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.services.SaveFulProposalService;
import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.services.SavePartyService;
import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.services.SaveQuoteService;
import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.services.SearchQuoteService;

import jakarta.transaction.Transactional;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/getQuote")
public class QuoteController {

    ObjectMapper mapper = new ObjectMapper();

    Gson gson = new GsonBuilder()
        .setPrettyPrinting()
        .create();

    @Autowired
    private PartyService partyService;

    @Autowired
    private PolicyService policyService;

    @Autowired
    private GetMasterDataService getMasterDataService;


    @Autowired
    private BuildPlanPremiumService buildPlanPremiumService;
    
    @Autowired
    private GetQuoteService getQuoteService;
    
    @Autowired
    private SaveQuoteService saveQuoteService;
    
    @Autowired
    private SearchQuoteService searchQuoteService;
    
    @Autowired
    private SavePartyService savePartyService;
    
    @Autowired
    private IssuePolicyService issuePolicyService;
    
    @Autowired
    private GetEntityService getEntityService;
    
    @Autowired
    private SaveFulProposalService saveFulProposalService;


    @Transactional
    @GetMapping("/getMasterData")
    @ResponseStatus(HttpStatus.OK)
    public Mono<MasterData> masterData(@RequestParam String productCode) {
        return getMasterDataService.getProductMasters(productCode);

    }
    
    @Transactional
    @GetMapping("/getProductList")
    @ResponseStatus(HttpStatus.OK)
    public Mono<ProductListMaster> getProductList() {
        return getMasterDataService.getProductList("AG005");

    }

    @Transactional
    @GetMapping("/getPartyData")
    @ResponseStatus(HttpStatus.OK)
    public List<Map<String, String>> partyData() {

        return partyService.getPartyList();

    }

    @Transactional
    @GetMapping("/getRatingData")
    @ResponseStatus(HttpStatus.OK)
    public RatingData ratingData(com.insure_sense.BusinessAppMicroservices.api.bancsDbService.salesDto.Policy policy) {

//        return getRatingDataService.getBaseRatingData(policy);

        return new RatingData();

    }

    @Transactional
    @PostMapping("/getPlanPremiums")
    @ResponseStatus(HttpStatus.OK)
    public List<PlanPremiumSummary> getPlanPremiums(@RequestBody Map<String, Object> basePlan) {
        return buildPlanPremiumService.buildPlanPremium(basePlan);
    }

    @Transactional
    @PostMapping("/getCvgOptPremiums")
    @ResponseStatus(HttpStatus.OK)
    public List<PlanPremiumSummary> getCvgOptPremiums(@RequestBody Map<String, Object> basePlan) {
        return buildPlanPremiumService.buildCvgOptionsPremium(basePlan);
    }


    @Transactional
    @GetMapping("/getPartyDetails/{partyId}")
    @ResponseStatus(HttpStatus.OK)
    public List<PartyMaster> getParty(@PathVariable("partyId") Long partyId) {
//        return getPolicyDataService.buildPartyData(partyId);

        return new ArrayList<>();
    }

    @Transactional
    @PostMapping("/savePartyDetails")
    @ResponseStatus(HttpStatus.OK)
    public Long saveParty(@RequestBody PartyMaster party) {
//        com.insure_sense.BusinessAppMicroservices.api.bancsDbService.salesDto.PartyMaster partyMaster = updatePartyDataService.preProcessPartyData(party);
//        return updatePartyDataService.buildPartyData(partyMaster);

        return 0L;
    }

    @PostMapping("/chkDuplicates")
    @Transactional
    @ResponseStatus(HttpStatus.OK)
    public List<Map<String, Object>> checkDuplicates(@RequestBody com.insure_sense.BusinessAppMicroservices.api.bancsDbService.dto.Policy policy) {
        return policyService.checkDuplicates(policy);
    }

    @Transactional
    @PostMapping("/initPolicyChange")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Policy> initPolicyChange(@RequestBody com.insure_sense.BusinessAppMicroservices.api.bancsDbService.salesDto.Policy quote) {

//        com.insure_sense.BusinessAppMicroservices.api.bancsDbService.salesDto.Policy changeQuote
//            = createPolicyChangeService.initPolicyChange(quote);
//        try {
//            changeQuote.setInvocRef(quote.getInvocRef());
//            Long policyId = updatePolicyDataService.savePolicyData(changeQuote);
//
//            com.insure_sense.BusinessAppMicroservices.api.bancsDbService.dto.Policy createdQuote
//            = getPolicyDataService.getPolicyData(policyId);
//
//            createdQuote.setInvocRef(quote.getInvocRef());
//            return ResponseEntity.ok(createdQuote);
//        } catch (Exception exception) {
//            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
//        }
        return ResponseEntity.ok(null);
    }


    @Transactional
    @GetMapping("/quoteList")
    @ResponseStatus(HttpStatus.OK)
    public List<Map<String, String>> quoteList(final Authentication authentication) {

        Jwt principal = (Jwt) authentication.getPrincipal();
        Map<String, Object> claims = principal.getClaims();
        String role = getRole(claims);

        return policyService.getAllQuoteList(role);

    }

    private static String getRole(Map<String, Object> claims) {
        List<String> roles = (List<String>) ((Map) claims.get("realm_access")).get("roles");

        final String[] finalRole = {""};
        roles.forEach(role -> {
            if ((role.contains("admin") || role.contains("underwriter"))) {
                finalRole[0] = role;
            }
        });
        return finalRole[0];
    }

    @Transactional
    @GetMapping("/policyList")
    @ResponseStatus(HttpStatus.OK)
    public List<Map<String, String>> policyList(final Authentication authentication) {

        Map<String, Object> claims = ((Jwt) authentication.getPrincipal()).getClaims();
        String role = getRole(claims);

        return policyService.getAllPolicyList(role);
    }

    @Transactional
    @GetMapping("/details/{policyId}")
    @ResponseStatus(HttpStatus.OK)
    public com.insure_sense.BusinessAppMicroservices.api.bancsDbService.dto.Policy getPolicy(@PathVariable("policyId") Long policyId) {
//        return getPolicyDataService.getPolicyData(policyId);
        return new Policy();
    }

    @Transactional
    @GetMapping("/detailsByCaseId/{caseId}")
    @ResponseStatus(HttpStatus.OK)
    public com.insure_sense.BusinessAppMicroservices.api.bancsDbService.dto.Policy getPolicyByCaseId(@PathVariable("caseId") String caseId) {
        Long policyId = policyService.findByCaseId(caseId);
//        return getPolicyDataService.getPolicyData(policyId);
        return  new Policy();
    }

    @Transactional
    @GetMapping("/getPolicyTransactions/{policyId}")
    @ResponseStatus(HttpStatus.OK)
    public List<Map<String, String>> policyList(@PathVariable("policyId") Long policyId) {
        return policyService.getPolicyTransactions(policyId);
    }
    
    @PostMapping("/quickQuote")
    @Transactional
    @ResponseStatus(HttpStatus.OK)
    public Mono<List<PolicyOption>> getQuotes(@RequestBody Policy policy) throws JsonProcessingException{
    	return getQuoteService.getQuotes(policy);
    }
    
    @PostMapping("/saveQuote")
    @Transactional
    @ResponseStatus(HttpStatus.OK)
    public Mono<SaveQuoteResponse> saveQuote(@RequestBody SaveQuoteConvertedRequest request) throws JsonProcessingException {
    	return saveQuoteService.saveQuote(request);
    }
    
    @PostMapping("/searchQuote")
    @Transactional
    @ResponseStatus(HttpStatus.OK)
    public Mono<SearchQuoteResponse> searchQuote(@RequestBody SearchQuoteRequest searchQuoteRequest) throws JsonProcessingException {
		return searchQuoteService.searchQuote(searchQuoteRequest);
    }
    
    @GetMapping("/getQuote")
    @Transactional
    @ResponseStatus(HttpStatus.OK)
    public Mono<GetQuoteConvertedResponse> getQuote(@RequestParam String quoteNumber) throws JsonProcessingException {
		return searchQuoteService.getQuote(quoteNumber);
    }
    
    @PostMapping("/saveParty")
    @Transactional
    @ResponseStatus(HttpStatus.OK)
    public Mono<SavePartyResponse> saveParty(@RequestBody SavePartyRequest savePartyRequest) throws JsonProcessingException {
		return savePartyService.saveParty(savePartyRequest);
    }
    
    @GetMapping("/issuePolicy")
    @Transactional
    @ResponseStatus(HttpStatus.OK)
    public Mono<IssuePolicyResponse> issuePolicy(@RequestParam String proposalNumber)  {
		return issuePolicyService.issuePolicy(proposalNumber);
    }
    
    @GetMapping("/getEntity")
    @Transactional
    @ResponseStatus(HttpStatus.OK)
    public Mono<String> getEntity(@RequestParam String proposalNumber, 
    		@RequestParam String policyNumber) throws JsonProcessingException {
		return getEntityService.issuePolicy(proposalNumber, policyNumber);
    }
    
    @GetMapping("/saveFullProposal")
    @Transactional
    @ResponseStatus(HttpStatus.OK)
    public Mono<String> saveFullProposal() {
		return saveFulProposalService.saveFullProposal();
    }

}
