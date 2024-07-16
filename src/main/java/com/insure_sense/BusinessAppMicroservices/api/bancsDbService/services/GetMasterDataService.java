package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.services;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.ClientResponse;
import org.springframework.web.reactive.function.client.WebClient;

import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.bancsdto.product.DomainList;
import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.bancsdto.product.PlanSearchResponse;
import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.dto.MasterData;
import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.dto.ProductListMaster;
import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.dto.SourceUrlConfig;
import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.salesDto.CodeListMaster;
import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.salesDto.ProductCodeListMaster;
import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.salesDto.ProductCoverageMaster;
import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.salesDto.ProductMaster;
import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.salesDto.ProductPlanPropertyMaster;

import reactor.core.publisher.Mono;

@Service
public class GetMasterDataService {

    @Autowired
    private WebClient.Builder webClientBuilder;

    @Autowired
    private SourceUrlConfig sourceUrlConfig;

    public Mono<MasterData> getProductMasters(String productCd) {

        MasterData masterData = new MasterData();

        return buildProductPlan(masterData, productCd)
                .map(masterData1 -> buildPaymentFrequency(masterData1, productCd))
                .flatMap(c -> c.flatMap(c1 -> Mono.just(c1)))
                .map(masterData1 -> buildPlanType(masterData1, productCd))
                .flatMap(c -> c.flatMap(c1 -> Mono.just(c1)));
    }

    private Mono<MasterData> buildPaymentFrequency(MasterData masterData2, String productCd) {

        System.out.println("inside build payment frequency");

        return webClientBuilder
            .build()
            .get()
            .uri(String.valueOf(sourceUrlConfig.getServiceUrl() + "getDomainList"),
                uriBuilder -> uriBuilder
                    .queryParam("productCode", productCd)
                    .queryParam("parameterName", "Payment Frequency")
                    .build())
            .header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_FORM_URLENCODED_VALUE)
            .header("x-api-key", sourceUrlConfig.getApiKey())
            .header("x-api-secret-key", sourceUrlConfig.getApiSecretKey())
            .retrieve()
            .onStatus(HttpStatusCode::is4xxClientError, clientResponse -> Mono.empty())
            .onStatus(HttpStatusCode::is5xxServerError, ClientResponse::createException)
            .bodyToMono(DomainList.class).log()
            .retry(3)
            .map(paymentFrequencyDL -> {
                if (paymentFrequencyDL.getResponse().getResponseCode().equals("200")) {
                    System.out.println("payment frequency"+paymentFrequencyDL.getDomainValues().get(0).getValueDescription());
                    return buildSalesPaymentFrequency(paymentFrequencyDL, masterData2, productCd);
                } else {
                    return masterData2;
                }
            });

    }
    private MasterData buildSalesPaymentFrequency(DomainList payFreqDL, MasterData masterData, String productCd) {

        List<CodeListMaster> newPFCodeLists = new ArrayList<>();
        payFreqDL.getDomainValues().forEach(payFrequencyDL -> {
            CodeListMaster newPayFreqCodeListMaster = new CodeListMaster("GALHLTHPT001"+payFrequencyDL.getAlphaCode(), payFrequencyDL.getAlphaCode(), "GALHLTH - Payment Type", payFrequencyDL.getValueDescription());
            newPFCodeLists.add(newPayFreqCodeListMaster);
        });

        masterData.getCodeLists().addAll(newPFCodeLists);
        return masterData;
    }


    private Mono<MasterData> buildPlanType(MasterData masterData2, String productCd) {

        System.out.println("inside build plan type");

        return webClientBuilder
            .build()
            .get()
            .uri(String.valueOf(sourceUrlConfig.getServiceUrl() + "getDomainList"),
                uriBuilder -> uriBuilder
                    .queryParam("productCode", productCd)
                    .queryParam("parameterName", "Plan Type")
                    .build())
            .header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_FORM_URLENCODED_VALUE)
            .header("x-api-key", sourceUrlConfig.getApiKey())
            .header("x-api-secret-key", sourceUrlConfig.getApiSecretKey())
            .retrieve()
            .onStatus(HttpStatusCode::is4xxClientError, clientResponse -> Mono.empty())
            .onStatus(HttpStatusCode::is5xxServerError, ClientResponse::createException)
            .bodyToMono(DomainList.class).log()
            .retry(3)
            .map(planType -> {
                if (planType.getResponse().getResponseCode().equals("200")) {
                    System.out.println("plan Type"+planType.getDomainValues().get(0).getValueDescription());
                    return buildSalesPlanType(planType, masterData2, productCd);
                } else {
                    return masterData2;
                }
            });

    }
    private MasterData buildSalesPlanType(DomainList planTypeDL, MasterData masterData, String productCd) {

        List<CodeListMaster> newPlanTypeCodeLists = new ArrayList<>();
        planTypeDL.getDomainValues().forEach(planType -> {
            CodeListMaster newPlanTypeMaster = new CodeListMaster("GALHLTHPT001"+planType.getAlphaCode(), planType.getAlphaCode(), "GALHLTH - Plan Type", planType.getValueDescription());
            newPlanTypeCodeLists.add(newPlanTypeMaster);
        });

        masterData.getCodeLists().addAll(newPlanTypeCodeLists);
        return masterData;
    }

    private Mono<MasterData> buildProductPlan(MasterData masterData, String productCd) {

        System.out.println("service url: "+ sourceUrlConfig.getServiceUrl()+"searchPlan");

        return webClientBuilder
            .build()
            .get()
            .uri(String.valueOf(sourceUrlConfig.getServiceUrl()+"searchPlan"),
                uriBuilder -> uriBuilder
                    .queryParam("productCode", productCd)
                    .build())
            .header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_FORM_URLENCODED_VALUE)
            .header("x-api-key", sourceUrlConfig.getApiKey())
            .header("x-api-secret-key", sourceUrlConfig.getApiSecretKey())
            .retrieve()
            .onStatus(HttpStatusCode::is4xxClientError, clientResponse -> Mono.empty())
            .onStatus(HttpStatusCode::is5xxServerError, ClientResponse::createException)
            .bodyToMono(PlanSearchResponse.class).log()
            .retry(3)
            .map(planSearchResponse -> {
                if (planSearchResponse.getResponse().getResponseCode().equals("200")){
                    return buildSalesProductPlan(planSearchResponse, masterData, productCd);
                } else {
                    return new MasterData();
                }
            });
    }
    
    private MasterData buildSalesProductPlan(PlanSearchResponse planSearchResponse, MasterData masterData, String productCd) {
    	
        List<ProductCodeListMaster> newProductCodeLists = new ArrayList<>();
        List<CodeListMaster> newCodeLists = new ArrayList<>();
        List<ProductPlanPropertyMaster> newProductPlanPropertyList = new ArrayList<>();
        List<ProductCoverageMaster> newProductCoverages = new ArrayList<>();

        ProductCodeListMaster newPlanProductCodeList = new ProductCodeListMaster();
        newPlanProductCodeList.setCodeListCd("PLN001CDList");
        newPlanProductCodeList.setCodeListType("Plans");
        newPlanProductCodeList.setProductCd(productCd);
		getProductCoverageDescription(productCd).subscribe(response -> {
			planSearchResponse.getPlanLists().forEach(planList -> {
				CodeListMaster newPlnCodeListMaster = new CodeListMaster("PLN001CDList", planList.getPlanCode(),
						"Gold Plans", planList.getPlanName());
				newCodeLists.add(newPlnCodeListMaster);

				ProductPlanPropertyMaster newSIPlanProperty = new ProductPlanPropertyMaster(null, productCd,
						planList.getPlanCode(), planList.getSubPlanLists().get(0).getSubPlanCode(), "SUMINSURED",
						"GALHLTHG001" + "SI" + planList.getPlanCode(), 1L);
				newProductPlanPropertyList.add(newSIPlanProperty);

				ProductPlanPropertyMaster newDeDPlanProperty = new ProductPlanPropertyMaster(null, productCd,
						planList.getPlanCode(), planList.getSubPlanLists().get(0).getSubPlanCode(), "DEDUCTIBLE",
						"GALHLTHG001" + "DED" + planList.getPlanCode(), 1L);
				newProductPlanPropertyList.add(newDeDPlanProperty);

				final String[] sumInsuredList = { "" };
				planList.getSubPlanLists().get(0).getSubPlanProperty().stream()
						.filter(x -> x.getName().equals("Sum  Insured")).findFirst()
						.ifPresent(si -> sumInsuredList[0] = String.valueOf(si.getValue()));
				String[] sumInsureds = sumInsuredList[0].split(";");
				System.out.println("sumInsureds" + " " + sumInsuredList[0] + " " + sumInsureds[0] + " ");
				for (int i = 1; i <= sumInsureds.length; i++) {
					CodeListMaster newSICodeListMaster = new CodeListMaster("GALHLTHSI001" + planList.getPlanCode(),
							"SI" + i, "GALHLTH SI", sumInsureds[i - 1]);
					newCodeLists.add(newSICodeListMaster);
				}
				;

				final String[] deductibleList = { "" };
				planList.getSubPlanLists().get(0).getSubPlanProperty().stream()
						.filter(x -> x.getName().equals("Deductible")).findFirst()
						.ifPresent(ded -> deductibleList[0] = String.valueOf(ded.getValue()));

				String[] deductibles = deductibleList[0].split(";");
				for (int i = 1; i <= deductibles.length; i++) {
					CodeListMaster newDedCodeListMaster = new CodeListMaster("GALHLTHDED001" + planList.getPlanCode(),
							"DED" + i, "GALHLTH Deductible", deductibles[i - 1]);
					newCodeLists.add(newDedCodeListMaster);
				}
				;

				final String[] optionalCoverages = { null };
				planList.getPlanProperty().stream().filter(x -> x.getName().equals("Optional Covers")).findFirst()
						.ifPresent(ocovers -> optionalCoverages[0] = ocovers.getValue());
				String[] optCovers = optionalCoverages[0].split(";");

				JSONObject responseObj = new JSONObject(response);
				for (int i = 0; i < responseObj.optJSONArray("cover").length(); i++) {
					for (int j = 1; j <= optCovers.length; j++) {
						if (responseObj.optJSONArray("cover").optJSONObject(i).optString("coverCode")
								.equals(optCovers[j - 1])) {
							String coverName = responseObj.optJSONArray("cover").optJSONObject(i)
									.optString("coverName");
							ProductCoverageMaster newProductCoverage = new ProductCoverageMaster(productCd,
									optCovers[j - 1], planList.getPlanCode(), "Optional", "GALHLTHCVR", 0F, null, 0F,
									null, coverName, null, null, 1);
							newProductCoverages.add(newProductCoverage);
						}
					}
				}
			});

		});

        newProductCodeLists.add(newPlanProductCodeList);

        masterData.setCodeLists(newCodeLists);
        masterData.setProductCodeLists(newProductCodeLists);
        masterData.setProductPlanPropertyMasters(newProductPlanPropertyList);
        masterData.setProductCoverages(newProductCoverages);

        return masterData;
    }
    
    public Mono<String> getProductCoverageDescription(String productCd) {
		WebClient webClient = webClientBuilder.baseUrl(sourceUrlConfig.getServiceUrl()).build();

		return webClient.get()
				.uri(uriBuilder -> uriBuilder.path("getProductCoverList").queryParam("productCode", productCd).build())
				.retrieve()
				.onStatus(httpStatus -> httpStatus.isError(),
						clientResponse -> Mono.error(new RuntimeException("Error response received")))
				.bodyToMono(String.class);
	}
    
    public Mono<ProductListMaster> getProductList(String agentCode) {
        System.out.println("agentCode===" + agentCode);

        return webClientBuilder.build().get()
                .uri(sourceUrlConfig.getQuoteUrl() + "getProductList?agentCode=" + agentCode)
                .header("x-api-key", sourceUrlConfig.getApiKey())
                .header("x-api-secret-key", sourceUrlConfig.getApiSecretKey())
                .retrieve()
                .onStatus(HttpStatusCode::is4xxClientError, clientResponse -> {
                    System.out.println("4xx error: " + clientResponse.statusCode());
                    return Mono.empty();
                })
                .onStatus(HttpStatusCode::is5xxServerError, clientResponse -> {
                    System.out.println("5xx error: " + clientResponse.statusCode());
                    return Mono.error(new RuntimeException("Server error"));
                })
                .bodyToMono(String.class)
                .log()
                .retry(3)
                .map(responseString -> {
                    System.out.println("Raw Response: " + responseString);
                    JSONObject response = new JSONObject(responseString);
                    return buildProductList(response);
                });
    }
    
    public ProductListMaster buildProductList(JSONObject response) {
    	ProductListMaster productListMaster = new ProductListMaster();
		List<ProductMaster> productList = new ArrayList<>();
		JSONArray productListArr = response.optJSONArray("productList");
		for (int i = 0; i < productListArr.length(); i++) {
			ProductMaster newProductMaster = new ProductMaster();
			newProductMaster.setProductCd(productListArr.optJSONObject(i).optString("productCode"));
			newProductMaster.setProductName(productListArr.optJSONObject(i).optString("productName"));
			newProductMaster.setLobCd(productListArr.optJSONObject(i).optString("lobCode"));
			newProductMaster.setProductStatus(productListArr.optJSONObject(i).optString("productStatus"));
			productList.add(newProductMaster);
		}
		productListMaster.setProductList(productList);
		return productListMaster;
	}

}
