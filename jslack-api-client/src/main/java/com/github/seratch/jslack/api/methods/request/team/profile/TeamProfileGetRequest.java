package com.github.seratch.jslack.api.methods.request.team.profile;

import com.github.seratch.jslack.api.methods.SlackApiRequest;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class TeamProfileGetRequest implements SlackApiRequest {

    /**
     * Authentication token. Requires scope: `users.profile:read`
     */
    private String token;

    /**
     * Filter by visibility.
     */
    private String visibility;

}