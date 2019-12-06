package com.github.seratch.jslack.api.methods.request.channels;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

public class ChannelsCreateRequest implements SlackApiRequest {

    /**
     * Authentication token. Requires scope: `channels:write`
     */
    private String token;

    /**
     * Name of channel to create
     */
    private String name;

    /**
     * Whether to return errors on invalid channel name instead of modifying it to meet the specified criteria.
     */
    private boolean validate;

    ChannelsCreateRequest(String token, String name, boolean validate) {
        this.token = token;
        this.name = name;
        this.validate = validate;
    }

    public static ChannelsCreateRequestBuilder builder() {
        return new ChannelsCreateRequestBuilder();
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

    public static class ChannelsCreateRequestBuilder {
        private String token;
        private String name;
        private boolean validate;

        ChannelsCreateRequestBuilder() {
        }

        public ChannelsCreateRequest.ChannelsCreateRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public ChannelsCreateRequest.ChannelsCreateRequestBuilder name(String name) {
            this.name = name;
            return this;
        }

        public ChannelsCreateRequest.ChannelsCreateRequestBuilder validate(boolean validate) {
            this.validate = validate;
            return this;
        }

        public ChannelsCreateRequest build() {
            return new ChannelsCreateRequest(token, name, validate);
        }

        public String toString() {
            return "ChannelsCreateRequest.ChannelsCreateRequestBuilder(token=" + this.token + ", name=" + this.name + ", validate=" + this.validate + ")";
        }
    }
}