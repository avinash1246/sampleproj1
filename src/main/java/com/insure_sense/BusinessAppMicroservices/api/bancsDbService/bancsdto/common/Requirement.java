package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.bancsdto.common;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Requirement {
    private String requirementName;
    private String requirementStatus;
    private String requiredFrom;
    private String mandatoryOptional;
    private String createdUploadedBy;
    private String uploadedRequirement;

}
