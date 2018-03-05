package com.github.seratch.jslack.api.methods.request.users.profile;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

public class UsersProfileGetRequest implements SlackApiRequest {

    private String token;
    private String user;
    private Integer includeLabels;

    UsersProfileGetRequest(String token, String user, Integer includeLabels) {
        this.token = token;
        this.user = user;
        this.includeLabels = includeLabels;
    }

    public static UsersProfileGetRequestBuilder builder() {
        return new UsersProfileGetRequestBuilder();
    }

    public String getToken() {
        return this.token;
    }

    public String getUser() {
        return this.user;
    }

    public Integer getIncludeLabels() {
        return this.includeLabels;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setIncludeLabels(Integer includeLabels) {
        this.includeLabels = includeLabels;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof UsersProfileGetRequest)) return false;
        final UsersProfileGetRequest other = (UsersProfileGetRequest) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$token = this.getToken();
        final Object other$token = other.getToken();
        if (this$token == null ? other$token != null : !this$token.equals(other$token)) return false;
        final Object this$user = this.getUser();
        final Object other$user = other.getUser();
        if (this$user == null ? other$user != null : !this$user.equals(other$user)) return false;
        final Object this$includeLabels = this.getIncludeLabels();
        final Object other$includeLabels = other.getIncludeLabels();
        if (this$includeLabels == null ? other$includeLabels != null : !this$includeLabels.equals(other$includeLabels))
            return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $token = this.getToken();
        result = result * PRIME + ($token == null ? 43 : $token.hashCode());
        final Object $user = this.getUser();
        result = result * PRIME + ($user == null ? 43 : $user.hashCode());
        final Object $includeLabels = this.getIncludeLabels();
        result = result * PRIME + ($includeLabels == null ? 43 : $includeLabels.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof UsersProfileGetRequest;
    }

    public String toString() {
        return "UsersProfileGetRequest(token=" + this.getToken() + ", user=" + this.getUser() + ", includeLabels=" + this.getIncludeLabels() + ")";
    }

    public static class UsersProfileGetRequestBuilder {
        private String token;
        private String user;
        private Integer includeLabels;

        UsersProfileGetRequestBuilder() {
        }

        public UsersProfileGetRequest.UsersProfileGetRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public UsersProfileGetRequest.UsersProfileGetRequestBuilder user(String user) {
            this.user = user;
            return this;
        }

        public UsersProfileGetRequest.UsersProfileGetRequestBuilder includeLabels(Integer includeLabels) {
            this.includeLabels = includeLabels;
            return this;
        }

        public UsersProfileGetRequest build() {
            return new UsersProfileGetRequest(token, user, includeLabels);
        }

        public String toString() {
            return "UsersProfileGetRequest.UsersProfileGetRequestBuilder(token=" + this.token + ", user=" + this.user + ", includeLabels=" + this.includeLabels + ")";
        }
    }
}