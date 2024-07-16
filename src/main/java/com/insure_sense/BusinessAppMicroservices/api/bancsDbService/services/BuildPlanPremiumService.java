package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.services;

import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.dto.PlanPremiumSummary;
import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.salesDto.GroupCvgOptionsRateMaster;
import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.salesDto.GroupPlanRateMaster;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@Service
public class BuildPlanPremiumService {

    public List<PlanPremiumSummary> buildPlanPremium(Map<String, Object> basePlan) {


        String sumInsured = (String) basePlan.get("baseSumInsured");
        String familyType = (String) basePlan.get("baseFamilyType");

        Double employerShareEmpOnly = null;
        Double employerShareESC = null;

        System.out.println("getting plan premiums "+  sumInsured + " , " + familyType);

//        if ((Objects.equals(familyType, "E")) || Objects.equals(familyType, "EPORPIL")) {
//            employerShareEmpOnly = groupPlanRateMasterRepository.findAllBySumInsuredCdAndFamilyTypeCd(sumInsured, "E").get(0).getPlanRate();
//            employerShareESC = employerShareEmpOnly;
//        } else {
//            employerShareEmpOnly = groupPlanRateMasterRepository.findAllBySumInsuredCdAndFamilyTypeCd(sumInsured, "E").get(0).getPlanRate();
//            employerShareESC = groupPlanRateMasterRepository.findAllBySumInsuredCdAndFamilyTypeCd(sumInsured, "ESC").get(0).getPlanRate();
//        }

//        System.out.println("employer share : "+ employerShareEmpOnly + employerShareESC);
//        List<GroupPlanRateMaster> masterPremiums =  groupPlanRateMasterRepository.findAll();

        List<GroupPlanRateMaster> masterPremiums = new ArrayList<>();
        List<PlanPremiumSummary> planPremiums = new ArrayList<>();

        masterPremiums.forEach(masterPremium -> {

            PlanPremiumSummary planPremium = new PlanPremiumSummary(masterPremium.getPlanRateMasterId(),
                masterPremium.getSumInsuredCd(), masterPremium.getFamilyTypeCd(), masterPremium.getPlanRate());


            System.out.println("family type: "+ masterPremium.getFamilyTypeCd());
            if ((Objects.equals(masterPremium.getFamilyTypeCd(), "E")) || Objects.equals(masterPremium.getFamilyTypeCd(), "EPORPIL")) {
                planPremium.setEmployerShare(employerShareEmpOnly);

                System.out.println("");
                if (masterPremium.getPlanRate() - employerShareEmpOnly > 0) {
                    planPremium.setEmployeeShare(masterPremium.getPlanRate() - employerShareEmpOnly);
                } else {
                    planPremium.setEmployeeShare(0.00D);
                }
                planPremiums.add(planPremium);
            } else {
                planPremium.setEmployerShare(employerShareESC);
                if (masterPremium.getPlanRate() - employerShareESC > 0) {
                    planPremium.setEmployeeShare(masterPremium.getPlanRate() - employerShareESC);
                } else {
                    planPremium.setEmployeeShare(0.00D);
                }
                planPremiums.add(planPremium);
            }
        });

        return planPremiums;
    }

    public List<PlanPremiumSummary> buildCvgOptionsPremium(Map<String, Object> basePlan) {

        List<PlanPremiumSummary> planPremiums = new ArrayList<>();
        List<GroupCvgOptionsRateMaster> cvgOptionsRates = new ArrayList<>();
//        List<GroupCvgOptionsRateMaster> cvgOptionsRates = groupCvgOptionsRateMasterRepository.findAllByOrderByOrderOfAppearanceAsc();


        cvgOptionsRates.forEach(cvgOptionRate -> {

            PlanPremiumSummary planPremium = new PlanPremiumSummary(cvgOptionRate.getCvgOptRateMasterId());

            planPremium.setCvgGrpCd(cvgOptionRate.getCvgGrpCd());
            planPremium.setPlanRate(cvgOptionRate.getCvgGrpRate());
            planPremium.setSumInsuredCd(cvgOptionRate.getSumInsuredCd());
            planPremium.setEmployerShare(0D);
            planPremium.setEmployeeShare(cvgOptionRate.getCvgGrpRate());

            planPremiums.add(planPremium);

        });

        return planPremiums;
    }


}
