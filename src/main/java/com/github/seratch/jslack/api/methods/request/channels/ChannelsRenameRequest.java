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

    @java.beans.ConstructorProperties({"token", "channel", "name", "validate"})
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

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof ChannelsRenameRequest)) return false;
        final ChannelsRenameRequest other = (ChannelsRenameRequest) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$token = this.getToken();
        final Object other$token = other.getToken();
        if (this$token == null ? other$token != null : !this$token.equals(other$token)) return false;
        final Object this$channel = this.getChannel();
        final Object other$channel = other.getChannel();
        if (this$channel == null ? other$channel != null : !this$channel.equals(other$channel)) return false;
        final Object this$name = this.getName();
        final Object other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
        if (this.isValidate() != other.isValidate()) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof ChannelsRenameRequest;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $token = this.getToken();
        result = result * PRIME + ($token == null ? 43 : $token.hashCode());
        final Object $channel = this.getChannel();
        result = result * PRIME + ($channel == null ? 43 : $channel.hashCode());
        final Object $name = this.getName();
        result = result * PRIME + ($name == null ? 43 : $name.hashCode());
        result = result * PRIME + (this.isValidate() ? 79 : 97);
        return result;
    }

    public String toString() {
        return "ChannelsRenameRequest(token=" + this.getToken() + ", channel=" + this.getChannel() + ", name=" + this.getName() + ", validate=" + this.isValidate() + ")";
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