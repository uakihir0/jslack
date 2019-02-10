package com.github.seratch.jslack.api.methods.request.users;

import com.github.seratch.jslack.api.methods.SlackApiRequest;
import com.github.seratch.jslack.api.model.ConversationType;

import java.util.List;

/**
 * List conversations the calling user may access.
 */
public class UsersConversationsRequest implements SlackApiRequest {

    /**
     * Authentication token. Requires scope: `conversations:read`
     */
    private String token;

    /**
     * Browse conversations by a specific user ID's membership.
     * Non-public channels are restricted to those where the calling user shares membership."
     */
    private String user;

    /**
     * Paginate through collections of data by setting the `cursor` parameter to
     * a `next_cursor` attribute returned by a previous request's `response_metadata`.
     * Default value fetches the first \"page\" of the collection. See [pagination](/docs/pagination) for more detail.
     */
    private String cursor;

    /**
     * Set to `true` to exclude archived channels from the list
     */
    private boolean excludeArchived;

    /**
     * The maximum number of items to return. Fewer than the requested number of items may be returned,
     * even if the end of the list hasn't been reached. Must be an integer no larger than 1000.
     */
    private Integer limit;

    /**
     * Mix and match channel types by providing a comma-separated list of
     * any combination of `public_channel`, `private_channel`, `mpim`, `im`
     */
    private List<ConversationType> types;

    @java.beans.ConstructorProperties({"token", "user", "cursor", "excludeArchived", "limit", "types"})
    UsersConversationsRequest(String token, String user, String cursor, boolean excludeArchived, Integer limit, List<ConversationType> types) {
        this.token = token;
        this.user = user;
        this.cursor = cursor;
        this.excludeArchived = excludeArchived;
        this.limit = limit;
        this.types = types;
    }

    public static UsersConversationsRequestBuilder builder() {
        return new UsersConversationsRequestBuilder();
    }

    public String getToken() {
        return this.token;
    }

    public String getUser() {
        return this.user;
    }

    public String getCursor() {
        return this.cursor;
    }

    public boolean isExcludeArchived() {
        return this.excludeArchived;
    }

    public Integer getLimit() {
        return this.limit;
    }

    public List<ConversationType> getTypes() {
        return this.types;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public void setExcludeArchived(boolean excludeArchived) {
        this.excludeArchived = excludeArchived;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public void setTypes(List<ConversationType> types) {
        this.types = types;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof UsersConversationsRequest)) return false;
        final UsersConversationsRequest other = (UsersConversationsRequest) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$token = this.getToken();
        final Object other$token = other.getToken();
        if (this$token == null ? other$token != null : !this$token.equals(other$token)) return false;
        final Object this$user = this.getUser();
        final Object other$user = other.getUser();
        if (this$user == null ? other$user != null : !this$user.equals(other$user)) return false;
        final Object this$cursor = this.getCursor();
        final Object other$cursor = other.getCursor();
        if (this$cursor == null ? other$cursor != null : !this$cursor.equals(other$cursor)) return false;
        if (this.isExcludeArchived() != other.isExcludeArchived()) return false;
        final Object this$limit = this.getLimit();
        final Object other$limit = other.getLimit();
        if (this$limit == null ? other$limit != null : !this$limit.equals(other$limit)) return false;
        final Object this$types = this.getTypes();
        final Object other$types = other.getTypes();
        if (this$types == null ? other$types != null : !this$types.equals(other$types)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof UsersConversationsRequest;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $token = this.getToken();
        result = result * PRIME + ($token == null ? 43 : $token.hashCode());
        final Object $user = this.getUser();
        result = result * PRIME + ($user == null ? 43 : $user.hashCode());
        final Object $cursor = this.getCursor();
        result = result * PRIME + ($cursor == null ? 43 : $cursor.hashCode());
        result = result * PRIME + (this.isExcludeArchived() ? 79 : 97);
        final Object $limit = this.getLimit();
        result = result * PRIME + ($limit == null ? 43 : $limit.hashCode());
        final Object $types = this.getTypes();
        result = result * PRIME + ($types == null ? 43 : $types.hashCode());
        return result;
    }

    public String toString() {
        return "UsersConversationsRequest(token=" + this.getToken() + ", user=" + this.getUser() + ", cursor=" + this.getCursor() + ", excludeArchived=" + this.isExcludeArchived() + ", limit=" + this.getLimit() + ", types=" + this.getTypes() + ")";
    }

    public static class UsersConversationsRequestBuilder {
        private String token;
        private String user;
        private String cursor;
        private boolean excludeArchived;
        private Integer limit;
        private List<ConversationType> types;

        UsersConversationsRequestBuilder() {
        }

        public UsersConversationsRequest.UsersConversationsRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public UsersConversationsRequest.UsersConversationsRequestBuilder user(String user) {
            this.user = user;
            return this;
        }

        public UsersConversationsRequest.UsersConversationsRequestBuilder cursor(String cursor) {
            this.cursor = cursor;
            return this;
        }

        public UsersConversationsRequest.UsersConversationsRequestBuilder excludeArchived(boolean excludeArchived) {
            this.excludeArchived = excludeArchived;
            return this;
        }

        public UsersConversationsRequest.UsersConversationsRequestBuilder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        public UsersConversationsRequest.UsersConversationsRequestBuilder types(List<ConversationType> types) {
            this.types = types;
            return this;
        }

        public UsersConversationsRequest build() {
            return new UsersConversationsRequest(token, user, cursor, excludeArchived, limit, types);
        }

        public String toString() {
            return "UsersConversationsRequest.UsersConversationsRequestBuilder(token=" + this.token + ", user=" + this.user + ", cursor=" + this.cursor + ", excludeArchived=" + this.excludeArchived + ", limit=" + this.limit + ", types=" + this.types + ")";
        }
    }
}
