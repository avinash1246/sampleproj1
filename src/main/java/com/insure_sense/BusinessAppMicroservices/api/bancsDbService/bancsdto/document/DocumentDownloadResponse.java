package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.bancsdto.document;

import com.insure_sense.BusinessAppMicroservices.api.bancsDbService.bancsdto.common.MsgResponse;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
public class DocumentDownloadResponse {

    private String base64ByteArray;
    private String fileName;
    private MsgResponse response;

    public String getBase64ByteArray() {
        return base64ByteArray;
    }

    public void setBase64ByteArray(String base64ByteArray) {
        this.base64ByteArray = base64ByteArray;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public MsgResponse getResponse() {
        return response;
    }

    public void setResponse(MsgResponse response) {
        this.response = response;
    }
}
