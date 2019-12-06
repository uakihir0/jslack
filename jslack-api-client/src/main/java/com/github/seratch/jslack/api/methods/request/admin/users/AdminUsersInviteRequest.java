package com.github.seratch.jslack.api.methods.request.admin.users;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

import java.util.List;

/**
 * https://api.slack.com/methods/admin.users.invite
 */
public class AdminUsersInviteRequest implements SlackApiRequest {

    /**
     * Authentication token bearing required scopes.
     */
    private String token;

    /**
     * A comma-separated list of channel_ids for this user to join. At least one channel is required.
     */
    private List<String> channelIds;

    /**
     * The email address of the person to invite.
     */
    private String email;

    /**
     * Workspace Id
     */
    private String teamId;

    /**
     * An optional message to send to the user in the invite email.
     */
    private String customMessage;

    /**
     * Timestamp when guest account should be disabled.
     * Only include this timestamp if you inviting a guest user and you want their account to expire on a certain date.
     */
    private String guestExpirationTs;

    /**
     * Is this user a multi-channel guest user? (default: false)
     */
    private boolean isRestricted;

    /**
     * Is this user a single channel guest user? (default: false)
     */
    private boolean isUltraRestricted;

    /**
     * Full name of the user.
     */
    private String realName;

    /**
     * Allow this invite to be resent in the future if a user has not signed up yet. (default: false)
     */
    private boolean resend;

    AdminUsersInviteRequest(String token, List<String> channelIds, String email, String teamId, String customMessage, String guestExpirationTs, boolean isRestricted, boolean isUltraRestricted, String realName, boolean resend) {
        this.token = token;
        this.channelIds = channelIds;
        this.email = email;
        this.teamId = teamId;
        this.customMessage = customMessage;
        this.guestExpirationTs = guestExpirationTs;
        this.isRestricted = isRestricted;
        this.isUltraRestricted = isUltraRestricted;
        this.realName = realName;
        this.resend = resend;
    }

    public static AdminUsersInviteRequestBuilder builder() {
        return new AdminUsersInviteRequestBuilder();
    }

    public String getToken() {
        return this.token;
    }

    public List<String> getChannelIds() {
        return this.channelIds;
    }

    public String getEmail() {
        return this.email;
    }

    public String getTeamId() {
        return this.teamId;
    }

    public String getCustomMessage() {
        return this.customMessage;
    }

    public String getGuestExpirationTs() {
        return this.guestExpirationTs;
    }

    public boolean isRestricted() {
        return this.isRestricted;
    }

    public boolean isUltraRestricted() {
        return this.isUltraRestricted;
    }

    public String getRealName() {
        return this.realName;
    }

    public boolean isResend() {
        return this.resend;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setChannelIds(List<String> channelIds) {
        this.channelIds = channelIds;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTeamId(String teamId) {
        this.teamId = teamId;
    }

    public void setCustomMessage(String customMessage) {
        this.customMessage = customMessage;
    }

    public void setGuestExpirationTs(String guestExpirationTs) {
        this.guestExpirationTs = guestExpirationTs;
    }

    public void setRestricted(boolean isRestricted) {
        this.isRestricted = isRestricted;
    }

    public void setUltraRestricted(boolean isUltraRestricted) {
        this.isUltraRestricted = isUltraRestricted;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public void setResend(boolean resend) {
        this.resend = resend;
    }

    public static class AdminUsersInviteRequestBuilder {
        private String token;
        private List<String> channelIds;
        private String email;
        private String teamId;
        private String customMessage;
        private String guestExpirationTs;
        private boolean isRestricted;
        private boolean isUltraRestricted;
        private String realName;
        private boolean resend;

        AdminUsersInviteRequestBuilder() {
        }

        public AdminUsersInviteRequest.AdminUsersInviteRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public AdminUsersInviteRequest.AdminUsersInviteRequestBuilder channelIds(List<String> channelIds) {
            this.channelIds = channelIds;
            return this;
        }

        public AdminUsersInviteRequest.AdminUsersInviteRequestBuilder email(String email) {
            this.email = email;
            return this;
        }

        public AdminUsersInviteRequest.AdminUsersInviteRequestBuilder teamId(String teamId) {
            this.teamId = teamId;
            return this;
        }

        public AdminUsersInviteRequest.AdminUsersInviteRequestBuilder customMessage(String customMessage) {
            this.customMessage = customMessage;
            return this;
        }

        public AdminUsersInviteRequest.AdminUsersInviteRequestBuilder guestExpirationTs(String guestExpirationTs) {
            this.guestExpirationTs = guestExpirationTs;
            return this;
        }

        public AdminUsersInviteRequest.AdminUsersInviteRequestBuilder isRestricted(boolean isRestricted) {
            this.isRestricted = isRestricted;
            return this;
        }

        public AdminUsersInviteRequest.AdminUsersInviteRequestBuilder isUltraRestricted(boolean isUltraRestricted) {
            this.isUltraRestricted = isUltraRestricted;
            return this;
        }

        public AdminUsersInviteRequest.AdminUsersInviteRequestBuilder realName(String realName) {
            this.realName = realName;
            return this;
        }

        public AdminUsersInviteRequest.AdminUsersInviteRequestBuilder resend(boolean resend) {
            this.resend = resend;
            return this;
        }

        public AdminUsersInviteRequest build() {
            return new AdminUsersInviteRequest(token, channelIds, email, teamId, customMessage, guestExpirationTs, isRestricted, isUltraRestricted, realName, resend);
        }

        public String toString() {
            return "AdminUsersInviteRequest.AdminUsersInviteRequestBuilder(token=" + this.token + ", channelIds=" + this.channelIds + ", email=" + this.email + ", teamId=" + this.teamId + ", customMessage=" + this.customMessage + ", guestExpirationTs=" + this.guestExpirationTs + ", isRestricted=" + this.isRestricted + ", isUltraRestricted=" + this.isUltraRestricted + ", realName=" + this.realName + ", resend=" + this.resend + ")";
        }
    }
}
