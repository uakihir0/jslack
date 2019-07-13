package com.github.seratch.jslack.api.methods.request.conversations;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

import java.util.List;

public class ConversationsOpenRequest implements SlackApiRequest {

    /**
     * Authentication token. Requires scope: `conversations:write`
     */
    private String token;

    /**
     * Resume a conversation by supplying an `im` or `mpim`'s ID. Or provide the `users` field instead.
     */
    private String channel;

    /**
     * Boolean, indicates you want the full IM channel definition in the response.
     */
    private boolean returnIm;

    /**
     * Comma separated lists of users. If only one user is included, this creates a 1:1 DM.
     * The ordering of the users is preserved whenever a multi-person direct message is returned.
     * Supply a `channel` when not supplying `users`.
     */
    private List<String> users;

    ConversationsOpenRequest(String token, String channel, boolean returnIm, List<String> users) {
        this.token = token;
        this.channel = channel;
        this.returnIm = returnIm;
        this.users = users;
    }

    public static ConversationsOpenRequestBuilder builder() {
        return new ConversationsOpenRequestBuilder();
    }

    public String getToken() {
        return this.token;
    }

    public String getChannel() {
        return this.channel;
    }

    public boolean isReturnIm() {
        return this.returnIm;
    }

    public List<String> getUsers() {
        return this.users;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public void setReturnIm(boolean returnIm) {
        this.returnIm = returnIm;
    }

    public void setUsers(List<String> users) {
        this.users = users;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof ConversationsOpenRequest))
            return false;
        final ConversationsOpenRequest other = (ConversationsOpenRequest) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$token = this.getToken();
        final Object other$token = other.getToken();
        if (this$token == null ? other$token != null : !this$token.equals(other$token)) return false;
        final Object this$channel = this.getChannel();
        final Object other$channel = other.getChannel();
        if (this$channel == null ? other$channel != null : !this$channel.equals(other$channel)) return false;
        if (this.isReturnIm() != other.isReturnIm()) return false;
        final Object this$users = this.getUsers();
        final Object other$users = other.getUsers();
        if (this$users == null ? other$users != null : !this$users.equals(other$users)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof ConversationsOpenRequest;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $token = this.getToken();
        result = result * PRIME + ($token == null ? 43 : $token.hashCode());
        final Object $channel = this.getChannel();
        result = result * PRIME + ($channel == null ? 43 : $channel.hashCode());
        result = result * PRIME + (this.isReturnIm() ? 79 : 97);
        final Object $users = this.getUsers();
        result = result * PRIME + ($users == null ? 43 : $users.hashCode());
        return result;
    }

    public String toString() {
        return "ConversationsOpenRequest(token=" + this.getToken() + ", channel=" + this.getChannel() + ", returnIm=" + this.isReturnIm() + ", users=" + this.getUsers() + ")";
    }

    public static class ConversationsOpenRequestBuilder {
        private String token;
        private String channel;
        private boolean returnIm;
        private List<String> users;

        ConversationsOpenRequestBuilder() {
        }

        public ConversationsOpenRequest.ConversationsOpenRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public ConversationsOpenRequest.ConversationsOpenRequestBuilder channel(String channel) {
            this.channel = channel;
            return this;
        }

        public ConversationsOpenRequest.ConversationsOpenRequestBuilder returnIm(boolean returnIm) {
            this.returnIm = returnIm;
            return this;
        }

        public ConversationsOpenRequest.ConversationsOpenRequestBuilder users(List<String> users) {
            this.users = users;
            return this;
        }

        public ConversationsOpenRequest build() {
            return new ConversationsOpenRequest(token, channel, returnIm, users);
        }

        public String toString() {
            return "ConversationsOpenRequest.ConversationsOpenRequestBuilder(token=" + this.token + ", channel=" + this.channel + ", returnIm=" + this.returnIm + ", users=" + this.users + ")";
        }
    }
}
