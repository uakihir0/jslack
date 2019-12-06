package com.github.seratch.jslack.api.methods.request.admin.teams;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

/**
 * https://api.slack.com/methods/admin.teams.settings.setName
 */
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

    AdminTeamsSettingsSetNameRequest(String token, String teamId, String name) {
        this.token = token;
        this.teamId = teamId;
        this.name = name;
    }

    public static AdminTeamsSettingsSetNameRequestBuilder builder() {
        return new AdminTeamsSettingsSetNameRequestBuilder();
    }

    public String getToken() {
        return this.token;
    }

    public String getTeamId() {
        return this.teamId;
    }

    public String getName() {
        return this.name;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setTeamId(String teamId) {
        this.teamId = teamId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static class AdminTeamsSettingsSetNameRequestBuilder {
        private String token;
        private String teamId;
        private String name;

        AdminTeamsSettingsSetNameRequestBuilder() {
        }

        public AdminTeamsSettingsSetNameRequest.AdminTeamsSettingsSetNameRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public AdminTeamsSettingsSetNameRequest.AdminTeamsSettingsSetNameRequestBuilder teamId(String teamId) {
            this.teamId = teamId;
            return this;
        }

        public AdminTeamsSettingsSetNameRequest.AdminTeamsSettingsSetNameRequestBuilder name(String name) {
            this.name = name;
            return this;
        }

        public AdminTeamsSettingsSetNameRequest build() {
            return new AdminTeamsSettingsSetNameRequest(token, teamId, name);
        }

        public String toString() {
            return "AdminTeamsSettingsSetNameRequest.AdminTeamsSettingsSetNameRequestBuilder(token=" + this.token + ", teamId=" + this.teamId + ", name=" + this.name + ")";
        }
    }
}
