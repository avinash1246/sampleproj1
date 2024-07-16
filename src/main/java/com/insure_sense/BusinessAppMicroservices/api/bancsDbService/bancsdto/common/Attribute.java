package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.bancsdto.common;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
public class Attribute {

    private String name;
    private String value;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

	public Attribute(String name, String value) {
		super();
		this.name = name;
		this.value = value;
	}
    
}
