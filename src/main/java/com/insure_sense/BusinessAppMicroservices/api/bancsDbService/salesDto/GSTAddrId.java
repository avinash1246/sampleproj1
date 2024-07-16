package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.salesDto;

import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Objects;

@NoArgsConstructor
public class GSTAddrId implements Serializable {

    public GSTAddrId(Long addrId, Long gstDataId) {
        this.addrId = addrId;
        this.gstDataId = gstDataId;
    }

    private Long addrId;
    private Long gstDataId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GSTAddrId gstAddrId = (GSTAddrId) o;
        return Objects.equals(addrId, gstAddrId.addrId) && Objects.equals(gstDataId, gstAddrId.gstDataId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(addrId, gstDataId);
    }
}
