package com.github.seratch.jslack.api.methods.request.users;

import com.github.seratch.jslack.api.methods.SlackApiRequest;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class UsersIdentityRequest implements SlackApiRequest {

    /**
     * Authentication token. Requires scope: `identity.basic`
     */
    private String token;

}