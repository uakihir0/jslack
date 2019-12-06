package com.github.seratch.jslack.api.methods.request.users;

import com.github.seratch.jslack.api.methods.SlackApiRequest;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class UsersLookupByEmailRequest implements SlackApiRequest {

    /**
     * Authentication token. Requires scope: `users:read.email`
     */
    private String token;

    /**
     * An email address belonging to a user in the workspace
     */
    private String email;

}