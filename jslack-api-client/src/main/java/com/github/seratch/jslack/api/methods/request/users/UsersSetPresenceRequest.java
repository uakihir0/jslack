package com.github.seratch.jslack.api.methods.request.users;

import com.github.seratch.jslack.api.methods.SlackApiRequest;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class UsersSetPresenceRequest implements SlackApiRequest {

    /**
     * Authentication token. Requires scope: `users:write`
     */
    private String token;

    /**
     * Either `auto` or `away`
     */
    private String presence;

}