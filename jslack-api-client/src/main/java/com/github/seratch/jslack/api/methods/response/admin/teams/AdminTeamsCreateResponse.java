package com.github.seratch.jslack.api.methods.response.admin.teams;

import com.github.seratch.jslack.api.methods.SlackApiResponse;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class AdminTeamsCreateResponse implements SlackApiResponse {

    private boolean ok;
    private String warning;
    private String error;
    private String needed;
    private String provided;

    private String team; // created team id
    private ResponseMetadata responseMetadata;

    @Getter
@Setter
    public static class ResponseMetadata {
        private List<String> messages;
    }

}