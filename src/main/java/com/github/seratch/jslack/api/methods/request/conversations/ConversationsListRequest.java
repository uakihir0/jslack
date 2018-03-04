package com.github.seratch.jslack.api.methods.request.conversations;

import com.github.seratch.jslack.api.methods.SlackApiRequest;
import com.github.seratch.jslack.api.model.ConversationType;

import java.util.List;

public class ConversationsListRequest implements SlackApiRequest {

    private String token;
    private String cursor;
    private boolean excludeArchived;
    private Integer limit;
    private List<ConversationType> types;

    @java.beans.ConstructorProperties({"token", "cursor", "excludeArchived", "limit", "types"})
    ConversationsListRequest(String token, String cursor, boolean excludeArchived, Integer limit, List<ConversationType> types) {
        this.token = token;
        this.cursor = cursor;
        this.excludeArchived = excludeArchived;
        this.limit = limit;
        this.types = types;
    }

    public static ConversationsListRequestBuilder builder() {
        return new ConversationsListRequestBuilder();
    }

    public String getToken() {
        return this.token;
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

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof ConversationsListRequest)) return false;
        final ConversationsListRequest other = (ConversationsListRequest) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$token = this.getToken();
        final Object other$token = other.getToken();
        if (this$token == null ? other$token != null : !this$token.equals(other$token)) return false;
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

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $token = this.getToken();
        result = result * PRIME + ($token == null ? 43 : $token.hashCode());
        final Object $cursor = this.getCursor();
        result = result * PRIME + ($cursor == null ? 43 : $cursor.hashCode());
        result = result * PRIME + (this.isExcludeArchived() ? 79 : 97);
        final Object $limit = this.getLimit();
        result = result * PRIME + ($limit == null ? 43 : $limit.hashCode());
        final Object $types = this.getTypes();
        result = result * PRIME + ($types == null ? 43 : $types.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof ConversationsListRequest;
    }

    public String toString() {
        return "ConversationsListRequest(token=" + this.getToken() + ", cursor=" + this.getCursor() + ", excludeArchived=" + this.isExcludeArchived() + ", limit=" + this.getLimit() + ", types=" + this.getTypes() + ")";
    }

    public static class ConversationsListRequestBuilder {
        private String token;
        private String cursor;
        private boolean excludeArchived;
        private Integer limit;
        private List<ConversationType> types;

        ConversationsListRequestBuilder() {
        }

        public ConversationsListRequest.ConversationsListRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public ConversationsListRequest.ConversationsListRequestBuilder cursor(String cursor) {
            this.cursor = cursor;
            return this;
        }

        public ConversationsListRequest.ConversationsListRequestBuilder excludeArchived(boolean excludeArchived) {
            this.excludeArchived = excludeArchived;
            return this;
        }

        public ConversationsListRequest.ConversationsListRequestBuilder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        public ConversationsListRequest.ConversationsListRequestBuilder types(List<ConversationType> types) {
            this.types = types;
            return this;
        }

        public ConversationsListRequest build() {
            return new ConversationsListRequest(token, cursor, excludeArchived, limit, types);
        }

        public String toString() {
            return "ConversationsListRequest.ConversationsListRequestBuilder(token=" + this.token + ", cursor=" + this.cursor + ", excludeArchived=" + this.excludeArchived + ", limit=" + this.limit + ", types=" + this.types + ")";
        }
    }
}
