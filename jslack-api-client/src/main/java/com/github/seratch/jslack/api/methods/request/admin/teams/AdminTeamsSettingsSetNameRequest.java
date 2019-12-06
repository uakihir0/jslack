package com.github.seratch.jslack.api.methods.request.admin.teams;

import com.github.seratch.jslack.api.methods.SlackApiRequest;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * https://api.slack.com/methods/admin.teams.settings.setName
 */
@Getter
@Setter
@Builder
public class AdminTeamsSettingsSetNameRequest implements SlackApiRequest {

    /**
     * Authentication token bearing required scopes.
     */
    private String token;

    /**
     * ID for the workspace to set the icon for.
     */
    private String teamId;

    private String name;

}
