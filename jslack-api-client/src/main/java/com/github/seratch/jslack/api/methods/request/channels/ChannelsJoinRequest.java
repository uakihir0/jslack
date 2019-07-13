package com.github.seratch.jslack.api.methods.request.channels;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

public class ChannelsJoinRequest implements SlackApiRequest {

    /**
     * Authentication token. Requires scope: `channels:write`
     */
    private String token;

    /**
     * Name of channel to join
     */
    private String name;

    /**
     * Whether to return errors on invalid channel name instead of modifying it to meet the specified criteria.
     */
    private boolean validate;

    ChannelsJoinRequest(String token, String name, boolean validate) {
        this.token = token;
        this.name = name;
        this.validate = validate;
    }

    public static ChannelsJoinRequestBuilder builder() {
        return new ChannelsJoinRequestBuilder();
    }

    public String getToken() {
        return this.token;
    }

    public String getName() {
        return this.name;
    }

    public boolean isValidate() {
        return this.validate;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setValidate(boolean validate) {
        this.validate = validate;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof ChannelsJoinRequest)) return false;
        final ChannelsJoinRequest other = (ChannelsJoinRequest) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$token = this.getToken();
        final Object other$token = other.getToken();
        if (this$token == null ? other$token != null : !this$token.equals(other$token)) return false;
        final Object this$name = this.getName();
        final Object other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
        if (this.isValidate() != other.isValidate()) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof ChannelsJoinRequest;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $token = this.getToken();
        result = result * PRIME + ($token == null ? 43 : $token.hashCode());
        final Object $name = this.getName();
        result = result * PRIME + ($name == null ? 43 : $name.hashCode());
        result = result * PRIME + (this.isValidate() ? 79 : 97);
        return result;
    }

    public String toString() {
        return "ChannelsJoinRequest(token=" + this.getToken() + ", name=" + this.getName() + ", validate=" + this.isValidate() + ")";
    }

    public static class ChannelsJoinRequestBuilder {
        private String token;
        private String name;
        private boolean validate;

        ChannelsJoinRequestBuilder() {
        }

        public ChannelsJoinRequest.ChannelsJoinRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public ChannelsJoinRequest.ChannelsJoinRequestBuilder name(String name) {
            this.name = name;
            return this;
        }

        public ChannelsJoinRequest.ChannelsJoinRequestBuilder validate(boolean validate) {
            this.validate = validate;
            return this;
        }

        public ChannelsJoinRequest build() {
            return new ChannelsJoinRequest(token, name, validate);
        }

        public String toString() {
            return "ChannelsJoinRequest.ChannelsJoinRequestBuilder(token=" + this.token + ", name=" + this.name + ", validate=" + this.validate + ")";
        }
    }
}