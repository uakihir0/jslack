package com.github.seratch.jslack.api.methods.request.admin.teams;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

/**
 * https://api.slack.com/methods/admin.teams.create
 */
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

    AdminTeamsCreateRequest(String token, String teamDomain, String teamName, String teamDescription, String teamDiscoverability) {
        this.token = token;
        this.teamDomain = teamDomain;
        this.teamName = teamName;
        this.teamDescription = teamDescription;
        this.teamDiscoverability = teamDiscoverability;
    }

    public static AdminTeamsCreateRequestBuilder builder() {
        return new AdminTeamsCreateRequestBuilder();
    }

    public String getToken() {
        return this.token;
    }

    public String getTeamDomain() {
        return this.teamDomain;
    }

    public String getTeamName() {
        return this.teamName;
    }

    public String getTeamDescription() {
        return this.teamDescription;
    }

    public String getTeamDiscoverability() {
        return this.teamDiscoverability;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setTeamDomain(String teamDomain) {
        this.teamDomain = teamDomain;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public void setTeamDescription(String teamDescription) {
        this.teamDescription = teamDescription;
    }

    public void setTeamDiscoverability(String teamDiscoverability) {
        this.teamDiscoverability = teamDiscoverability;
    }

    public static class AdminTeamsCreateRequestBuilder {
        private String token;
        private String teamDomain;
        private String teamName;
        private String teamDescription;
        private String teamDiscoverability;

        AdminTeamsCreateRequestBuilder() {
        }

        public AdminTeamsCreateRequest.AdminTeamsCreateRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public AdminTeamsCreateRequest.AdminTeamsCreateRequestBuilder teamDomain(String teamDomain) {
            this.teamDomain = teamDomain;
            return this;
        }

        public AdminTeamsCreateRequest.AdminTeamsCreateRequestBuilder teamName(String teamName) {
            this.teamName = teamName;
            return this;
        }

        public AdminTeamsCreateRequest.AdminTeamsCreateRequestBuilder teamDescription(String teamDescription) {
            this.teamDescription = teamDescription;
            return this;
        }

        public AdminTeamsCreateRequest.AdminTeamsCreateRequestBuilder teamDiscoverability(String teamDiscoverability) {
            this.teamDiscoverability = teamDiscoverability;
            return this;
        }

        public AdminTeamsCreateRequest build() {
            return new AdminTeamsCreateRequest(token, teamDomain, teamName, teamDescription, teamDiscoverability);
        }

        public String toString() {
            return "AdminTeamsCreateRequest.AdminTeamsCreateRequestBuilder(token=" + this.token + ", teamDomain=" + this.teamDomain + ", teamName=" + this.teamName + ", teamDescription=" + this.teamDescription + ", teamDiscoverability=" + this.teamDiscoverability + ")";
        }
    }
}
