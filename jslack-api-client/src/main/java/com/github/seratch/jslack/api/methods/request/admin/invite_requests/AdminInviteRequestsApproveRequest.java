package com.github.seratch.jslack.api.methods.request.admin.invite_requests;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

/**
 * https://api.slack.com/methods/admin.inviteRequests.approve
 */
public class AdminInviteRequestsApproveRequest implements SlackApiRequest {

    /**
     * Authentication token bearing required scopes.
     */
    private String token;

    /**
     * ID of the request to invite.
     */
    private String inviteRequestId;

    /**
     * ID for the workspace where the invite request was made.
     */
    private String teamId;

    AdminInviteRequestsApproveRequest(String token, String inviteRequestId, String teamId) {
        this.token = token;
        this.inviteRequestId = inviteRequestId;
        this.teamId = teamId;
    }

    public static AdminInviteRequestsApproveRequestBuilder builder() {
        return new AdminInviteRequestsApproveRequestBuilder();
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

    public static class AdminInviteRequestsApproveRequestBuilder {
        private String token;
        private String inviteRequestId;
        private String teamId;

        AdminInviteRequestsApproveRequestBuilder() {
        }

        public AdminInviteRequestsApproveRequest.AdminInviteRequestsApproveRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public AdminInviteRequestsApproveRequest.AdminInviteRequestsApproveRequestBuilder inviteRequestId(String inviteRequestId) {
            this.inviteRequestId = inviteRequestId;
            return this;
        }

        public AdminInviteRequestsApproveRequest.AdminInviteRequestsApproveRequestBuilder teamId(String teamId) {
            this.teamId = teamId;
            return this;
        }

        public AdminInviteRequestsApproveRequest build() {
            return new AdminInviteRequestsApproveRequest(token, inviteRequestId, teamId);
        }

        public String toString() {
            return "AdminInviteRequestsApproveRequest.AdminInviteRequestsApproveRequestBuilder(token=" + this.token + ", inviteRequestId=" + this.inviteRequestId + ", teamId=" + this.teamId + ")";
        }
    }
}
