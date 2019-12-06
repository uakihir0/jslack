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
