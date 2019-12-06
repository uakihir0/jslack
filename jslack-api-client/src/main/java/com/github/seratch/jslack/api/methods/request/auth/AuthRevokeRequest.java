package com.github.seratch.jslack.api.methods.request.auth;

import com.github.seratch.jslack.api.methods.SlackApiRequest;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class AuthRevokeRequest implements SlackApiRequest {

    /**
     * Authentication token. Requires scope: `none`
     */
    private String token;

    /**
     * Setting this parameter to `1` triggers a _testing mode_ where the specified token will not actually be revoked.
     */
    private boolean test;
}