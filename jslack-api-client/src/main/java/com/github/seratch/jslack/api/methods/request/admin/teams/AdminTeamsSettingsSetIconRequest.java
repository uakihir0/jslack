package com.github.seratch.jslack.api.methods.request.admin.teams;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

/**
 * https://api.slack.com/methods/admin.teams.settings.setIcon
 */
public class AdminTeamsSettingsSetIconRequest implements SlackApiRequest {

    /**
     * Authentication token bearing required scopes.
     */
    private String token;

    /**
     * ID for the workspace to set the icon for.
     */
    private String teamId;

    private String imageUrl;

    AdminTeamsSettingsSetIconRequest(String token, String teamId, String imageUrl) {
        this.token = token;
        this.teamId = teamId;
        this.imageUrl = imageUrl;
    }

    public static AdminTeamsSettingsSetIconRequestBuilder builder() {
        return new AdminTeamsSettingsSetIconRequestBuilder();
    }

    public String getToken() {
        return this.token;
    }

    public String getTeamId() {
        return this.teamId;
    }

    public String getImageUrl() {
        return this.imageUrl;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setTeamId(String teamId) {
        this.teamId = teamId;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public static class AdminTeamsSettingsSetIconRequestBuilder {
        private String token;
        private String teamId;
        private String imageUrl;

        AdminTeamsSettingsSetIconRequestBuilder() {
        }

        public AdminTeamsSettingsSetIconRequest.AdminTeamsSettingsSetIconRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public AdminTeamsSettingsSetIconRequest.AdminTeamsSettingsSetIconRequestBuilder teamId(String teamId) {
            this.teamId = teamId;
            return this;
        }

        public AdminTeamsSettingsSetIconRequest.AdminTeamsSettingsSetIconRequestBuilder imageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }

        public AdminTeamsSettingsSetIconRequest build() {
            return new AdminTeamsSettingsSetIconRequest(token, teamId, imageUrl);
        }

        public String toString() {
            return "AdminTeamsSettingsSetIconRequest.AdminTeamsSettingsSetIconRequestBuilder(token=" + this.token + ", teamId=" + this.teamId + ", imageUrl=" + this.imageUrl + ")";
        }
    }
}
