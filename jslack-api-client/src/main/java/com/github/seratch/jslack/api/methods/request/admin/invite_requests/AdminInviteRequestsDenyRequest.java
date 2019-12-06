package com.github.seratch.jslack.api.methods.request.admin.invite_requests;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

/**
 * https://api.slack.com/methods/admin.inviteRequests.deny
 */
public class AdminInviteRequestsDenyRequest implements SlackApiRequest {

    /**
     * Authentication token bearing required scopes.
     */
    private String token;

    /**
     * ID of the request to deny.
     */
    private String inviteRequestId;

    /**
     * ID for the workspace where the invite request was made.
     */
    private String teamId;

    AdminInviteRequestsDenyRequest(String token, String inviteRequestId, String teamId) {
        this.token = token;
        this.inviteRequestId = inviteRequestId;
        this.teamId = teamId;
    }

    public static AdminInviteRequestsDenyRequestBuilder builder() {
        return new AdminInviteRequestsDenyRequestBuilder();
    }

    public String getToken() {
        return this.token;
    }

    public String getInviteRequestId() {
        return this.inviteRequestId;
    }

    public String getTeamId() {
        return this.teamId;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setInviteRequestId(String inviteRequestId) {
        this.inviteRequestId = inviteRequestId;
    }

    public void setTeamId(String teamId) {
        this.teamId = teamId;
    }

    public static class AdminInviteRequestsDenyRequestBuilder {
        private String token;
        private String inviteRequestId;
        private String teamId;

        AdminInviteRequestsDenyRequestBuilder() {
        }

        public AdminInviteRequestsDenyRequest.AdminInviteRequestsDenyRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public AdminInviteRequestsDenyRequest.AdminInviteRequestsDenyRequestBuilder inviteRequestId(String inviteRequestId) {
            this.inviteRequestId = inviteRequestId;
            return this;
        }

        public AdminInviteRequestsDenyRequest.AdminInviteRequestsDenyRequestBuilder teamId(String teamId) {
            this.teamId = teamId;
            return this;
        }

        public AdminInviteRequestsDenyRequest build() {
            return new AdminInviteRequestsDenyRequest(token, inviteRequestId, teamId);
        }

        public String toString() {
            return "AdminInviteRequestsDenyRequest.AdminInviteRequestsDenyRequestBuilder(token=" + this.token + ", inviteRequestId=" + this.inviteRequestId + ", teamId=" + this.teamId + ")";
        }
    }
}
