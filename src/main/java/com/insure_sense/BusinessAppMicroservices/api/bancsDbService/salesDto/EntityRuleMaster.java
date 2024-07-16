package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.salesDto;

import lombok.NoArgsConstructor;




@NoArgsConstructor
public class EntityRuleMaster extends BaseEntity {

    public EntityRuleMaster(Long entityRuleMappingId, Long entityTypeCd, Long entityValue, Long ruleId) {
        this.entityRuleMappingId = entityRuleMappingId;
        this.entityTypeCd = entityTypeCd;
        this.entityValue = entityValue;
        this.ruleId = ruleId;
    }

    private Long entityRuleMappingId;

    private Long entityTypeCd;
    private Long entityValue;

    private Long ruleId;

    private Integer orderOfAppearance;

    public Long getEntityRuleMappingId() {
        return entityRuleMappingId;
    }

    public void setEntityRuleMappingId(Long entityRuleMappingId) {
        this.entityRuleMappingId = entityRuleMappingId;
    }

    public Long getEntityTypeCd() {
        return entityTypeCd;
    }

    public void setEntityTypeCd(Long entityTypeCd) {
        this.entityTypeCd = entityTypeCd;
    }

    public Long getEntityValue() {
        return entityValue;
    }

    public void setEntityValue(Long entityValue) {
        this.entityValue = entityValue;
    }

    public Long getRuleId() {
        return ruleId;
    }

    public void setRuleId(Long ruleId) {
        this.ruleId = ruleId;
    }

    public Integer getOrderOfAppearance() {
        return orderOfAppearance;
    }

    public void setOrderOfAppearance(Integer orderOfAppearance) {
        this.orderOfAppearance = orderOfAppearance;
    }
}
