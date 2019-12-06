package com.github.seratch.jslack.api.methods.response.usergroups.users;

import com.github.seratch.jslack.api.methods.SlackApiResponse;
import com.github.seratch.jslack.api.model.Usergroup;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UsergroupUsersUpdateResponse implements SlackApiResponse {

    private boolean ok;
    private String warning;
    private String error;
    private String needed;
    private String provided;

    private Usergroup usergroup;
}