package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.services;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class PartyService {

    public List<Map<String, String>> getPartyList() {
        return new ArrayList<>();
    }
}
