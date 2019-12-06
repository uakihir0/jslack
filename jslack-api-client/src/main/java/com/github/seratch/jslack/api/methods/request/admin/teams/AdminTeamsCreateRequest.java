package com.github.seratch.jslack.api.methods.request.admin.teams;

import com.github.seratch.jslack.api.methods.SlackApiRequest;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * https://api.slack.com/methods/admin.teams.create
 */
@Getter
@Setter
@Builder
public class AdminTeamsCreateRequest implements SlackApiRequest {

    /**
     * Authentication token bearing required scopes.
     */
    private String token;

    /**
     * Team domain (for example, slacksoftballteam).
     */
    private String teamDomain;

    /**
     * Team name (for example, Slack Softball Team).
     */
    private String teamName;

    /**
     * Description for the team.
     */
    private String teamDescription;

    /**
     * Who can join the team. A team's discoverability can be open, closed, invite_only, or unlisted.
     */
    private String teamDiscoverability;

}
