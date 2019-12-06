package com.github.seratch.jslack.api.methods.request.dnd;

import com.github.seratch.jslack.api.methods.SlackApiRequest;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Builder
public class DndTeamInfoRequest implements SlackApiRequest {

    /**
     * Authentication token. Requires scope: `dnd:read`
     */
    private String token;

    /**
     * Comma-separated list of users to fetch Do Not Disturb status for
     */
    private List<String> users;

}