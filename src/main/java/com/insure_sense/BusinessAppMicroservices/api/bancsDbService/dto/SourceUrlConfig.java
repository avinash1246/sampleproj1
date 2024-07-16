package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.dto;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
@ConfigurationProperties(prefix = "source")
@ComponentScan
public class SourceUrlConfig {
	
	@Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    String serviceUrl;
    String quoteUrl;
    String apiKey;
    String apiSecretKey;

    public String getServiceUrl() {
        return serviceUrl;
    }

    public void setServiceUrl(String serviceUrl) {
        this.serviceUrl = serviceUrl;
    }

    public String getQuoteUrl() {
        return quoteUrl;
    }

    public void setQuoteUrl(String quoteUrl) {
        this.quoteUrl = quoteUrl;
    }

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    public String getApiSecretKey() {
        return apiSecretKey;
    }

    public void setApiSecretKey(String apiSecretKey) {
        this.apiSecretKey = apiSecretKey;
    }
}
