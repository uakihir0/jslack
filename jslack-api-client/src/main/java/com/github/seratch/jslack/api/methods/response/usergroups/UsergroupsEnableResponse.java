package com.github.seratch.jslack.api.methods.response.usergroups;

import com.github.seratch.jslack.api.methods.SlackApiResponse;
import com.github.seratch.jslack.api.model.Usergroup;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UsergroupsEnableResponse implements SlackApiResponse {

    private boolean ok;
    private String warning;
    private String error;
    private String needed;
    private String provided;

    private Usergroup usergroup;
}