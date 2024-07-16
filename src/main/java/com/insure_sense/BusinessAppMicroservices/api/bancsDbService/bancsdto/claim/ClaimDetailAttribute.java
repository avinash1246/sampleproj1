package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.bancsdto.claim;

import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.bancsdto.common.Attribute;
import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.bancsdto.common.MultiSetAttribute;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@NoArgsConstructor
@AllArgsConstructor
public class ClaimDetailAttribute {

    private List<Attribute> attributes;

    private List<MultiSetAttribute> multiSetAttributes;

    public List<Attribute> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<Attribute> attributes) {
        this.attributes = attributes;
    }

    public List<MultiSetAttribute> getMultiSetAttributes() {
        return multiSetAttributes;
    }

    public void setMultiSetAttributes(List<MultiSetAttribute> multiSetAttributes) {
        this.multiSetAttributes = multiSetAttributes;
    }
}
