package com.github.seratch.jslack.api.methods.request.conversations;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

public class ConversationsRenameRequest implements SlackApiRequest {

    /**
     * Authentication token. Requires scope: `conversations:write`
     */
    private String token;

    /**
     * ID of conversation to rename
     */
    private String channel;

    /**
     * New name for conversation.
     * <p>
     * Conversation names can only contain lowercase letters, numbers, hyphens, and underscores, and must
     * be 21 characters or less. We will validate the submitted channel name and modify it to meet the above
     * criteria. When calling this method, we recommend storing the channel's name value that is returned
     * in the response.
     */
    private String name;

    @java.beans.ConstructorProperties({"token", "channel", "name"})
    ConversationsRenameRequest(String token, String channel, String name) {
        this.token = token;
        this.channel = channel;
        this.name = name;
    }

    public static ConversationsRenameRequestBuilder builder() {
        return new ConversationsRenameRequestBuilder();
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

    public void setToken(String token) {
        this.token = token;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof ConversationsRenameRequest))
            return false;
        final ConversationsRenameRequest other = (ConversationsRenameRequest) o;
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
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof ConversationsRenameRequest;
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
        return result;
    }

    public String toString() {
        return "ConversationsRenameRequest(token=" + this.getToken() + ", channel=" + this.getChannel() + ", name=" + this.getName() + ")";
    }

    public static class ConversationsRenameRequestBuilder {
        private String token;
        private String channel;
        private String name;

        ConversationsRenameRequestBuilder() {
        }

        public ConversationsRenameRequest.ConversationsRenameRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public ConversationsRenameRequest.ConversationsRenameRequestBuilder channel(String channel) {
            this.channel = channel;
            return this;
        }

        public ConversationsRenameRequest.ConversationsRenameRequestBuilder name(String name) {
            this.name = name;
            return this;
        }

        public ConversationsRenameRequest build() {
            return new ConversationsRenameRequest(token, channel, name);
        }

        public String toString() {
            return "ConversationsRenameRequest.ConversationsRenameRequestBuilder(token=" + this.token + ", channel=" + this.channel + ", name=" + this.name + ")";
        }
    }
}