package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.salesDto;

import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Objects;

@NoArgsConstructor
public class ProductCoverageId implements Serializable {

    public ProductCoverageId(String productCd, String coverageCd) {
        this.productCd = productCd;
        this.coverageCd = coverageCd;
    }

    private String productCd;
    private String coverageCd;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductCoverageId that = (ProductCoverageId) o;
        return productCd.equals(that.productCd) &&
                coverageCd.equals(that.coverageCd);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productCd, coverageCd);
    }
}
