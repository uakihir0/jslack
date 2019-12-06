package com.github.seratch.jslack.api.methods.request.channels;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

public class ChannelsRenameRequest implements SlackApiRequest {

    /**
     * Authentication token. Requires scope: `channels:write`
     */
    private String token;

    /**
     * Channel to rename
     */
    private String channel;

    /**
     * New name for channel.
     */
    private String name;

    /**
     * Whether to return errors on invalid channel name instead of modifying it to meet the specified criteria.
     */
    private boolean validate;

    ChannelsRenameRequest(String token, String channel, String name, boolean validate) {
        this.token = token;
        this.channel = channel;
        this.name = name;
        this.validate = validate;
    }

    public static ChannelsRenameRequestBuilder builder() {
        return new ChannelsRenameRequestBuilder();
    }

    public String getToken() {
        return this.token;
    }

    public String getChannel() {
        return this.channel;
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

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setValidate(boolean validate) {
        this.validate = validate;
    }

    public static class ChannelsRenameRequestBuilder {
        private String token;
        private String channel;
        private String name;
        private boolean validate;

        ChannelsRenameRequestBuilder() {
        }

        public ChannelsRenameRequest.ChannelsRenameRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public ChannelsRenameRequest.ChannelsRenameRequestBuilder channel(String channel) {
            this.channel = channel;
            return this;
        }

        public ChannelsRenameRequest.ChannelsRenameRequestBuilder name(String name) {
            this.name = name;
            return this;
        }

        public ChannelsRenameRequest.ChannelsRenameRequestBuilder validate(boolean validate) {
            this.validate = validate;
            return this;
        }

        public ChannelsRenameRequest build() {
            return new ChannelsRenameRequest(token, channel, name, validate);
        }

        public String toString() {
            return "ChannelsRenameRequest.ChannelsRenameRequestBuilder(token=" + this.token + ", channel=" + this.channel + ", name=" + this.name + ", validate=" + this.validate + ")";
        }
    }
}