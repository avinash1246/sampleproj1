package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.dto;

import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.salesDto.HealthLocationRiskMaster;
import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.salesDto.LocationRiskMaster;
import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.salesDto.OccRiskBaseRateMaster;
import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.salesDto.WorkersClassificationRateMaster;
import lombok.AllArgsConstructor;

import java.util.List;


@AllArgsConstructor
public class RatingData {

    public RatingData() {
    }

    private Long policyId;
    private String caseId;
    private List<LocationRiskMaster> locationRatingData;
    private List<OccRiskBaseRateMaster> occupancyRatingData;
    private List<WorkersClassificationRateMaster> workersClassificationRateMasters;
    private List<HealthLocationRiskMaster> healthLocationRatingData;

    public Long getPolicyId() {
        return policyId;
    }

    public void setPolicyId(Long policyId) {
        this.policyId = policyId;
    }

    public String getCaseId() {
        return caseId;
    }

    public void setCaseId(String caseId) {
        this.caseId = caseId;
    }

    public List<LocationRiskMaster> getLocationRatingData() {
        return locationRatingData;
    }

    public void setLocationRatingData(List<LocationRiskMaster> locationRatingData) {
        this.locationRatingData = locationRatingData;
    }

    public List<OccRiskBaseRateMaster> getOccupancyRatingData() {
        return occupancyRatingData;
    }

    public void setOccupancyRatingData(List<OccRiskBaseRateMaster> occupancyRatingData) {
        this.occupancyRatingData = occupancyRatingData;
    }

    public List<WorkersClassificationRateMaster> getWorkersClassificationRateMasters() {
        return workersClassificationRateMasters;
    }

    public void setWorkersClassificationRateMasters(List<WorkersClassificationRateMaster> workersClassificationRateMasters) {
        this.workersClassificationRateMasters = workersClassificationRateMasters;
    }

    public List<HealthLocationRiskMaster> getHealthLocationRatingData() {
        return healthLocationRatingData;
    }

    public void setHealthLocationRatingData(List<HealthLocationRiskMaster> healthLocationRatingData) {
        this.healthLocationRatingData = healthLocationRatingData;
    }
}
