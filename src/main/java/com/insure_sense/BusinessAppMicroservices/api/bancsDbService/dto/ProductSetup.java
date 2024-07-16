package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.dto;

import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.salesDto.ProductCodeListMaster;
import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.salesDto.ProductCoverageMaster;
import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.salesDto.ProductMaster;
import lombok.AllArgsConstructor;

import java.util.List;


@AllArgsConstructor
public class ProductSetup {

    public ProductSetup() {
    }

    ProductMaster productMaster;
    List<ProductCodeListMaster> productCodeLists;
    List<ProductCoverageMaster> productCoverages;

    public ProductMaster getProductMaster() {
        return productMaster;
    }

    public void setProductMaster(ProductMaster productMaster) {
        this.productMaster = productMaster;
    }

    public List<ProductCodeListMaster> getProductCodeLists() {
        return productCodeLists;
    }

    public void setProductCodeLists(List<ProductCodeListMaster> productCodeLists) {
        this.productCodeLists = productCodeLists;
    }

    public List<ProductCoverageMaster> getProductCoverages() {
        return productCoverages;
    }

    public void setProductCoverages(List<ProductCoverageMaster> productCoverages) {
        this.productCoverages = productCoverages;
    }
}
