package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.salesDto;
import java.time.LocalDateTime;

public abstract class BaseEntity {

    private String createdBy;

    protected LocalDateTime createdDate;

    private String lastModifiedBy;

    private LocalDateTime lastModifiedDate;

    private Long version;

    private Boolean isDeleted = false;

    public BaseEntity() {
    }

    public Boolean getDeleted() {
        return isDeleted;
    }

    public void setDeleted(Boolean deleted) {
        isDeleted = deleted;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }
}
