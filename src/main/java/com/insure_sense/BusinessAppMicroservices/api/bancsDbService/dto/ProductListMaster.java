package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.dto;

import java.util.List;

import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.salesDto.ProductMaster;

public class ProductListMaster {
	private List<ProductMaster> productList;

	public List<ProductMaster> getProductList() {
		return productList;
	}

	public void setProductList(List<ProductMaster> productList) {
		this.productList = productList;
	}
}
