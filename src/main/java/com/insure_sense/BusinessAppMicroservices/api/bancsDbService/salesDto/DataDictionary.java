package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.salesDto;

import lombok.NoArgsConstructor;


import java.util.HashMap;
import java.util.Map;


@NoArgsConstructor
public class DataDictionary extends BaseEntity {

    public DataDictionary(String dictKey, String dictValue) {
        this.dictKey = dictKey;
        this.dictValue = dictValue;
    }

    
    private String dictKey;
    private String dictValue;

    public Map<String, String> getMap() {
        Map<String, String> dataMap = new HashMap<>();
        dataMap.put(dictKey, dictValue);
        return dataMap;
    }


    public String getDictKey() {
        return dictKey;
    }

    public void setKey(String dictKey) {
        this.dictKey = dictKey;
    }

    public String getDictValue() {
        return dictValue;
    }

    public void setDictValue(String dictValue) {
        this.dictValue = dictValue;
    }
}
