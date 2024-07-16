package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.salesDto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.NoArgsConstructor;




@NoArgsConstructor
public class GSTAddr extends BaseEntity {

    public GSTAddr(Long addrId, Long gstDataId, String addressType, Addr addr) {
        this.addrId = addrId;
        this.gstDataId = gstDataId;
        this.addressType = addressType;
        this.addr = addr;
    }

    public GSTAddr(Long addrId, Long gstDataId) {
        this.addrId = addrId;
        this.gstDataId = gstDataId;
    }


    private Long addrId;


    private Long gstDataId;

    private String addressType;

    @JsonIgnore
    private GSTData gstData;

    private Addr addr;

    public Long getAddrId() {
        return addrId;
    }

    public void setAddrId(Long addrId) {
        this.addrId = addrId;
    }

    public Addr getAddr() {
        return addr;
    }

    public void setAddr(Addr addr) {
        this.addr = addr;
    }

/*    public GSTData getGstData() {
        return gstData;
    }

    public void setGstData(GSTData gstData) {
        this.gstData = gstData;
    }*/

    public String getAddressType() {
        return addressType;
    }

    public void setAddressType(String addressType) {
        this.addressType = addressType;
    }

    public Long getGstDataId() {
        return gstDataId;
    }

    public void setGstDataId(Long gstDataId) {
        this.gstDataId = gstDataId;
    }
}
