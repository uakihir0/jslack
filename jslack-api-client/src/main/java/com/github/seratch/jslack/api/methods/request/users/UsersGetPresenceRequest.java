package com.github.seratch.jslack.api.methods.request.users;

import com.github.seratch.jslack.api.methods.SlackApiRequest;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class UsersGetPresenceRequest implements SlackApiRequest {

    /**
     * Authentication token. Requires scope: `users:read`
     */
    private String token;

    /**
     * User to get presence info on. Defaults to the authed user.
     */
    private String user;

}