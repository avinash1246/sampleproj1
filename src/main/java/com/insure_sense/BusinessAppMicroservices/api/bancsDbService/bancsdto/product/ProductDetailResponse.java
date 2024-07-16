package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.bancsdto.product;

import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.bancsdto.common.MsgResponse;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@NoArgsConstructor
@AllArgsConstructor
public class ProductDetailResponse {
    private List<ProductDetail> productDetail;
    private MsgResponse response;

    public List<ProductDetail> getProductDetail() {
        return productDetail;
    }

    public void setProductDetail(List<ProductDetail> productDetail) {
        this.productDetail = productDetail;
    }

    public MsgResponse getResponse() {
        return response;
    }

    public void setResponse(MsgResponse response) {
        this.response = response;
    }
}
