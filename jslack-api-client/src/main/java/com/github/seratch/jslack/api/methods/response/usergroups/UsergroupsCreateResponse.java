package com.github.seratch.jslack.api.methods.response.usergroups;

import com.github.seratch.jslack.api.methods.SlackApiResponse;
import com.github.seratch.jslack.api.model.Usergroup;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UsergroupsCreateResponse implements SlackApiResponse {

    private boolean ok;
    private String warning;
    private String error;
    private String needed; // "usergroups:write"
    private String provided; // some permissions

    private Usergroup usergroup;
}