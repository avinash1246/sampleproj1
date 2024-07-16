package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.kafkaconfig;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.services.*;
import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.dto.RatingData;
import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.salesDto.Policy;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.config.ListenerContainerCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.listener.AbstractMessageListenerContainer;
import org.springframework.kafka.listener.DefaultAfterRollbackProcessor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.backoff.FixedBackOff;

import java.util.List;
import java.util.Map;
import java.util.function.Function;

@Component
@Slf4j
public class KafkaConfig {

    @Autowired
    private PolicyService policyService;
//
//    @Autowired
//    private UpdatePolicyDataService updatePolicyDataService;
//
//    @Autowired
//    private GetPolicyDataService getPolicyDataService;
//
//    @Autowired
//    private CreatePolicyChangeService createPolicyChangeService;
//
//    @Autowired
//    private GetRatingDataService getRatingDataService;

    ObjectMapper o =  new ObjectMapper();
    Gson g = new Gson();

    @Bean
    public Function<Long, com.insure_sense.BusinessAppMicroservices.api.bancsDbService.dto.Policy> quoteDetails() {
        return policyId -> {
//            com.insure_sense.BusinessAppMicroservices.api.bancsDbService.dto.Policy quote
//                = getPolicyDataService.getPolicyData(policyId);
//            return quote;

            return new com.insure_sense.BusinessAppMicroservices.api.bancsDbService.dto.Policy();
        };
    }

    @Bean
    public Function<Long, com.insure_sense.BusinessAppMicroservices.api.bancsDbService.dto.Policy> uwQuoteDetails() {
        return policyId -> {
//            com.insure_sense.BusinessAppMicroservices.api.bancsDbService.dto.Policy quote
//                = getPolicyDataService.getPolicyData(policyId);
//            return quote;

            return new com.insure_sense.BusinessAppMicroservices.api.bancsDbService.dto.Policy();
        };
    }

    @Bean
    public Function<Long, List<Map<String, String>>> policyTransactions() {
        return policyId -> {
            System.out.println("policy txns for id "+policyId);
            return policyService.getPolicyTransactions(policyId);
        };
    }

    @Bean
    public Function<Policy, RatingData> ratingData() {
        return quote -> {
//            System.out.println("rating data for id: "+quote.getPolicyId());
//            return getRatingDataService.getBaseRatingData(quote);
            return new RatingData();
        };
    }


    @Transactional
    @Bean
    public Function<Policy, com.insure_sense.BusinessAppMicroservices.api.bancsDbService.dto.Policy> issueQuote() {
        return quote -> {
//            Long policyId = updatePolicyDataService.savePolicyData(quote);
//            com.insure_sense.BusinessAppMicroservices.api.bancsDbService.dto.Policy createdQuote
//                = getPolicyDataService.getPolicyData(policyId);
//            createdQuote.setInvocRef(quote.getInvocRef());
//
//            try {
//                System.out.println("policyExt: "+ o.writeValueAsString(createdQuote.getPolicyExt()));
//            } catch (JsonProcessingException e) {
//                e.printStackTrace();
//            }
//            return createdQuote;

            return new com.insure_sense.BusinessAppMicroservices.api.bancsDbService.dto.Policy();
        };
    }

    @Transactional
    @Bean
    public Function<Policy, com.insure_sense.BusinessAppMicroservices.api.bancsDbService.dto.Policy> initPolicyChange() {
        return quote -> {
//
//            Policy changeQuote
//                = createPolicyChangeService.initPolicyChange(quote);
//
//            changeQuote.setInvocRef(quote.getInvocRef());
//            Long policyId = updatePolicyDataService.savePolicyData(changeQuote);
//
//            com.insure_sense.BusinessAppMicroservices.api.bancsDbService.dto.Policy createdQuote
//                = getPolicyDataService.getPolicyData(policyId);
//
//            createdQuote.setInvocRef(quote.getInvocRef());
//            return createdQuote;

            return new com.insure_sense.BusinessAppMicroservices.api.bancsDbService.dto.Policy();
        };
    }

    @Transactional
    @Bean
    public Function<Policy, com.insure_sense.BusinessAppMicroservices.api.bancsDbService.dto.Policy> issuePolicy() {
        return quote -> {
//            Long policyId = updatePolicyDataService.savePolicyData(quote);
//            com.insure_sense.BusinessAppMicroservices.api.bancsDbService.dto.Policy createdPolicy
//                                                            = getPolicyDataService.getPolicyData(policyId);
//            createdPolicy.setInvocRef(quote.getInvocRef());
//            return createdPolicy;

            return new com.insure_sense.BusinessAppMicroservices.api.bancsDbService.dto.Policy();
        };
    }

    @Bean
    public ListenerContainerCustomizer<AbstractMessageListenerContainer<byte[], byte[]>> customizer() {
        // Disable retry in the AfterRollbackProcessor
        return (container, destination, group) -> container.setAfterRollbackProcessor(
            new DefaultAfterRollbackProcessor<byte[], byte[]>(
                (record, exception) -> System.out.println("Discarding failed record: " + record),
                new FixedBackOff(0L, 0)));
    }
}
