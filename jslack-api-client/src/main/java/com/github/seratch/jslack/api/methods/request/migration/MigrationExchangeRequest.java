package com.github.seratch.jslack.api.methods.request.migration;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

import java.util.List;

/**
 * For Enterprise Grid workspaces, map local user IDs to global user IDs
 */
public class MigrationExchangeRequest implements SlackApiRequest {

    /**
     * Authentication token. Requires scope: `tokens.basic`
     */
    private String token;

    /**
     * Specify `true` to convert `W` global user IDs to workspace-specific `U` IDs. Defaults to `false`.
     */
    private boolean toOld;

    /**
     * A comma-separated list of user ids, up to 400 per request
     */
    private List<String> users;

    MigrationExchangeRequest(String token, boolean toOld, List<String> users) {
        this.token = token;
        this.toOld = toOld;
        this.users = users;
    }

    public static MigrationExchangeRequestBuilder builder() {
        return new MigrationExchangeRequestBuilder();
    }

    public String getToken() {
        return this.token;
    }

    public boolean isToOld() {
        return this.toOld;
    }

    public List<String> getUsers() {
        return this.users;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setToOld(boolean toOld) {
        this.toOld = toOld;
    }

    public void setUsers(List<String> users) {
        this.users = users;
    }

    public static class MigrationExchangeRequestBuilder {
        private String token;
        private boolean toOld;
        private List<String> users;

        MigrationExchangeRequestBuilder() {
        }

        public MigrationExchangeRequest.MigrationExchangeRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public MigrationExchangeRequest.MigrationExchangeRequestBuilder toOld(boolean toOld) {
            this.toOld = toOld;
            return this;
        }

        public MigrationExchangeRequest.MigrationExchangeRequestBuilder users(List<String> users) {
            this.users = users;
            return this;
        }

        public MigrationExchangeRequest build() {
            return new MigrationExchangeRequest(token, toOld, users);
        }

        public String toString() {
            return "MigrationExchangeRequest.MigrationExchangeRequestBuilder(token=" + this.token + ", toOld=" + this.toOld + ", users=" + this.users + ")";
        }
    }
}