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