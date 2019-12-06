package com.github.seratch.jslack.api.methods.response.admin.users;

import com.github.seratch.jslack.api.methods.SlackApiResponse;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class AdminUsersRemoveResponse implements SlackApiResponse {

    private boolean ok;
    private String warning;
    private String error;
    private String needed;
    private String provided;

    private ResponseMetadata responseMetadata;

    @Getter
@Setter
    public static class ResponseMetadata {
        private List<String> messages;
    }

}