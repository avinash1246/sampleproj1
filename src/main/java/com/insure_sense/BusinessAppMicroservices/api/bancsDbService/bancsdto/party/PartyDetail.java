package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.bancsdto.party;

import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.bancsdto.common.PartyAttribute;
import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.bancsdto.common.PartyMultiSetAttribute;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@NoArgsConstructor
@AllArgsConstructor
public class PartyDetail {

    private List<PartyAttribute> attributes;

    private List<PartyMultiSetAttribute> multiSetAttributes;

//    ID Type
//    ID Number
//    PAN Number
//    UID
//    Marital Status
//    Educational Qualification
//    Monthly Gross Income
//    STD Code
//    Emergency Phone Number Val
//    Is The Mailing/Communication Address Same As The Primary Address?

    public List<PartyAttribute> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<PartyAttribute> attributes) {
        this.attributes = attributes;
    }

    public List<PartyMultiSetAttribute> getMultiSetAttributes() {
        return multiSetAttributes;
    }

    public void setMultiSetAttributes(List<PartyMultiSetAttribute> multiSetAttributes) {
        this.multiSetAttributes = multiSetAttributes;
    }
}
