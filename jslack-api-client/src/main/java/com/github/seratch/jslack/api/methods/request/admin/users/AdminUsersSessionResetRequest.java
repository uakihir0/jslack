package com.github.seratch.jslack.api.methods.request.admin.users;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

/**
 * https://api.slack.com/methods/admin.users.session.reset
 */
public class AdminUsersSessionResetRequest implements SlackApiRequest {

    /**
     * Authentication token bearing required scopes. (admin.users:write)
     */
    private String token;

    /**
     * The ID of the user to wipe sessions for
     */
    private String userId;

    /**
     * Only expire mobile sessions (default: false)
     */
    private boolean mobileOnly;

    /**
     * Only expire web sessions (default: false)
     */
    private boolean webOnly;

    AdminUsersSessionResetRequest(String token, String userId, boolean mobileOnly, boolean webOnly) {
        this.token = token;
        this.userId = userId;
        this.mobileOnly = mobileOnly;
        this.webOnly = webOnly;
    }

    public static AdminUsersSessionResetRequestBuilder builder() {
        return new AdminUsersSessionResetRequestBuilder();
    }

    public String getToken() {
        return this.token;
    }

    public String getUserId() {
        return this.userId;
    }

    public boolean isMobileOnly() {
        return this.mobileOnly;
    }

    public boolean isWebOnly() {
        return this.webOnly;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setMobileOnly(boolean mobileOnly) {
        this.mobileOnly = mobileOnly;
    }

    public void setWebOnly(boolean webOnly) {
        this.webOnly = webOnly;
    }

    public static class AdminUsersSessionResetRequestBuilder {
        private String token;
        private String userId;
        private boolean mobileOnly;
        private boolean webOnly;

        AdminUsersSessionResetRequestBuilder() {
        }

        public AdminUsersSessionResetRequest.AdminUsersSessionResetRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public AdminUsersSessionResetRequest.AdminUsersSessionResetRequestBuilder userId(String userId) {
            this.userId = userId;
            return this;
        }

        public AdminUsersSessionResetRequest.AdminUsersSessionResetRequestBuilder mobileOnly(boolean mobileOnly) {
            this.mobileOnly = mobileOnly;
            return this;
        }

        public AdminUsersSessionResetRequest.AdminUsersSessionResetRequestBuilder webOnly(boolean webOnly) {
            this.webOnly = webOnly;
            return this;
        }

        public AdminUsersSessionResetRequest build() {
            return new AdminUsersSessionResetRequest(token, userId, mobileOnly, webOnly);
        }

        public String toString() {
            return "AdminUsersSessionResetRequest.AdminUsersSessionResetRequestBuilder(token=" + this.token + ", userId=" + this.userId + ", mobileOnly=" + this.mobileOnly + ", webOnly=" + this.webOnly + ")";
        }
    }
}