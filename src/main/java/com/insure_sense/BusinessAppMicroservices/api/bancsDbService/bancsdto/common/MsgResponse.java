package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.bancsdto.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@NoArgsConstructor
@AllArgsConstructor
public class MsgResponse {
    private String responseCode;
    private String responseMessage;
    private List<RMessage> messages;

    public String getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }

    public String getResponseMessage() {
        return responseMessage;
    }

    public void setResponseMessage(String responseMessage) {
        this.responseMessage = responseMessage;
    }

    public List<RMessage> getMessages() {
        return messages;
    }

    public void setMessages(List<RMessage> messages) {
        this.messages = messages;
    }
}
