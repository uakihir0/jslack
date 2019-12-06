package com.github.seratch.jslack.api.methods.response.users.profile;

import com.github.seratch.jslack.api.methods.SlackApiResponse;
import com.github.seratch.jslack.api.model.User;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UsersProfileGetResponse implements SlackApiResponse {

    private boolean ok;
    private String warning;
    private String error;
    private String needed;
    private String provided;

    private User.Profile profile;
}