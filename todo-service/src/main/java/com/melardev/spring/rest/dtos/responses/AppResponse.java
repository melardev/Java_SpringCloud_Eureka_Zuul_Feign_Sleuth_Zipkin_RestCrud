package com.melardev.spring.rest.dtos.responses;

import java.util.ArrayList;
import java.util.List;

public class AppResponse {
    private Boolean success;
    private List<String> fullMessages;

    public AppResponse(boolean success, String message) {
        this.success = success;
        addFullMessage(message);
    }

    public Boolean getSuccess() {
        return success;
    }

    public List<String> getFullMessages() {
        return fullMessages;
    }

    public void setFullMessages(List<String> fullMessages) {
        this.fullMessages = fullMessages;
    }

    public AppResponse() {
        System.out.println("Created AppResponse");
    }

    public AppResponse(boolean success) {
        this.success = success;
        fullMessages = new ArrayList<>();
    }

    public boolean isSuccess() {
        return success;
    }


    protected void addFullMessage(String message) {
        if (message == null)
            return;
        if (fullMessages == null)
            fullMessages = new ArrayList<>();

        fullMessages.add(message);
    }

}