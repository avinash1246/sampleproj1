package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.salesDto;

import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Objects;

@NoArgsConstructor
public class CodeListMasterId implements Serializable {

    public CodeListMasterId(String codeListCd, String codeListValue) {
        this.codeListCd = codeListCd;
        this.codeListValue = codeListValue;
    }

    private String codeListCd;
    private String codeListValue;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CodeListMasterId that = (CodeListMasterId) o;
        return Objects.equals(codeListCd, that.codeListCd) &&
                Objects.equals(codeListValue, that.codeListValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codeListCd, codeListValue);
    }
}
