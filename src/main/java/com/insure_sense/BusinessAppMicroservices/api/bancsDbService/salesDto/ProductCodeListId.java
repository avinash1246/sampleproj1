package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.salesDto;

import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Objects;

@NoArgsConstructor
public class ProductCodeListId  implements Serializable {

    public ProductCodeListId(String productCd, String codeListCd) {
        this.productCd = productCd;
        this.codeListCd = codeListCd;
    }

    private String productCd;
    private String codeListCd;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductCodeListId that = (ProductCodeListId) o;
        return Objects.equals(productCd, that.productCd) &&
                Objects.equals(codeListCd, that.codeListCd);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productCd, codeListCd);
    }
}
