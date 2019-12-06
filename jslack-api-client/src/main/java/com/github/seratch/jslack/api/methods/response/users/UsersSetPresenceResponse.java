package com.github.seratch.jslack.api.methods.response.users;

import com.github.seratch.jslack.api.methods.SlackApiResponse;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UsersSetPresenceResponse implements SlackApiResponse {

    private boolean ok;
    private String warning;
    private String error;
    private String needed;
    private String provided;
}