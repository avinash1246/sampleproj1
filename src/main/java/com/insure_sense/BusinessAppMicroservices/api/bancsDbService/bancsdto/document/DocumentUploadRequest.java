package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.bancsdto.document;

import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.bancsdto.common.Attribute;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@NoArgsConstructor
@AllArgsConstructor
public class DocumentUploadRequest {

    private String flag;
    //Static "sharedPath" or "bytearray"
    private String base64Array;
    private String fileName;
    private String documentType;
    private String sharedPath;
    //Path of upload - Central location path where file was stored by the application
    private List<Attribute> attributes;

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public String getBase64Array() {
        return base64Array;
    }

    public void setBase64Array(String base64Array) {
        this.base64Array = base64Array;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getDocumentType() {
        return documentType;
    }

    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    public String getSharedPath() {
        return sharedPath;
    }

    public void setSharedPath(String sharedPath) {
        this.sharedPath = sharedPath;
    }

    public List<Attribute> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<Attribute> attributes) {
        this.attributes = attributes;
    }
}
