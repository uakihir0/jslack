package com.github.seratch.jslack.api.methods.request.team;

import com.github.seratch.jslack.api.methods.SlackApiRequest;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class TeamInfoRequest implements SlackApiRequest {

    /**
     * Authentication token. Requires scope: `team:read`
     */
    private String token;

}