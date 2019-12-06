package com.github.seratch.jslack.api.methods.request.admin.teams;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

/**
 * https://api.slack.com/methods/admin.teams.settings.setDescription
 */
public class AdminTeamsSettingsSetDescriptionRequest implements SlackApiRequest {

    /**
     * Authentication token bearing required scopes.
     */
    private String token;

    /**
     * ID for the workspace to set the description for.
     */
    private String teamId;

    private String description;

    AdminTeamsSettingsSetDescriptionRequest(String token, String teamId, String description) {
        this.token = token;
        this.teamId = teamId;
        this.description = description;
    }

    public static AdminTeamsSettingsSetDescriptionRequestBuilder builder() {
        return new AdminTeamsSettingsSetDescriptionRequestBuilder();
    }

    public String getToken() {
        return this.token;
    }

    public String getTeamId() {
        return this.teamId;
    }

    public String getDescription() {
        return this.description;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setTeamId(String teamId) {
        this.teamId = teamId;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public static class AdminTeamsSettingsSetDescriptionRequestBuilder {
        private String token;
        private String teamId;
        private String description;

        AdminTeamsSettingsSetDescriptionRequestBuilder() {
        }

        public AdminTeamsSettingsSetDescriptionRequest.AdminTeamsSettingsSetDescriptionRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public AdminTeamsSettingsSetDescriptionRequest.AdminTeamsSettingsSetDescriptionRequestBuilder teamId(String teamId) {
            this.teamId = teamId;
            return this;
        }

        public AdminTeamsSettingsSetDescriptionRequest.AdminTeamsSettingsSetDescriptionRequestBuilder description(String description) {
            this.description = description;
            return this;
        }

        public AdminTeamsSettingsSetDescriptionRequest build() {
            return new AdminTeamsSettingsSetDescriptionRequest(token, teamId, description);
        }

        public String toString() {
            return "AdminTeamsSettingsSetDescriptionRequest.AdminTeamsSettingsSetDescriptionRequestBuilder(token=" + this.token + ", teamId=" + this.teamId + ", description=" + this.description + ")";
        }
    }
}
