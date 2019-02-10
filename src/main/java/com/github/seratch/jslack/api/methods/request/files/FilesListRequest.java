package com.github.seratch.jslack.api.methods.request.files;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

import java.util.List;

public class FilesListRequest implements SlackApiRequest {

    /**
     * Authentication token. Requires scope: `files:read`
     */
    private String token;

    /**
     * Filter files created by a single user.
     */
    private String user;

    /**
     * Filter files appearing in a specific channel, indicated by its ID.
     */
    private String channel;

    /**
     * Filter files created after this timestamp (inclusive).
     */
    private String tsFrom;

    /**
     * Filter files created before this timestamp (inclusive).
     */
    private String tsTo;

    /**
     * Filter files by type:\n\n* `all` - All files
     * <p>
     * `spaces` - Posts\n* `snippets` - Snippets
     * `images` - Image files
     * `gdocs` - Google docs
     * `zips` - Zip files
     * `pdfs` - PDF files
     * <p>
     * You can pass multiple values in the types argument, like `types=spaces,snippets`.
     * The default value is `all`, which does not filter the list.
     */
    private List<String> types;

    private Integer count;

    private Integer page;

    @java.beans.ConstructorProperties({"token", "user", "channel", "tsFrom", "tsTo", "types", "count", "page"})
    FilesListRequest(String token, String user, String channel, String tsFrom, String tsTo, List<String> types, Integer count, Integer page) {
        this.token = token;
        this.user = user;
        this.channel = channel;
        this.tsFrom = tsFrom;
        this.tsTo = tsTo;
        this.types = types;
        this.count = count;
        this.page = page;
    }

    public static FilesListRequestBuilder builder() {
        return new FilesListRequestBuilder();
    }

    public String getToken() {
        return this.token;
    }

    public String getUser() {
        return this.user;
    }

    public String getChannel() {
        return this.channel;
    }

    public String getTsFrom() {
        return this.tsFrom;
    }

    public String getTsTo() {
        return this.tsTo;
    }

    public List<String> getTypes() {
        return this.types;
    }

    public Integer getCount() {
        return this.count;
    }

    public Integer getPage() {
        return this.page;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public void setTsFrom(String tsFrom) {
        this.tsFrom = tsFrom;
    }

    public void setTsTo(String tsTo) {
        this.tsTo = tsTo;
    }

    public void setTypes(List<String> types) {
        this.types = types;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof FilesListRequest)) return false;
        final FilesListRequest other = (FilesListRequest) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$token = this.getToken();
        final Object other$token = other.getToken();
        if (this$token == null ? other$token != null : !this$token.equals(other$token)) return false;
        final Object this$user = this.getUser();
        final Object other$user = other.getUser();
        if (this$user == null ? other$user != null : !this$user.equals(other$user)) return false;
        final Object this$channel = this.getChannel();
        final Object other$channel = other.getChannel();
        if (this$channel == null ? other$channel != null : !this$channel.equals(other$channel)) return false;
        final Object this$tsFrom = this.getTsFrom();
        final Object other$tsFrom = other.getTsFrom();
        if (this$tsFrom == null ? other$tsFrom != null : !this$tsFrom.equals(other$tsFrom)) return false;
        final Object this$tsTo = this.getTsTo();
        final Object other$tsTo = other.getTsTo();
        if (this$tsTo == null ? other$tsTo != null : !this$tsTo.equals(other$tsTo)) return false;
        final Object this$types = this.getTypes();
        final Object other$types = other.getTypes();
        if (this$types == null ? other$types != null : !this$types.equals(other$types)) return false;
        final Object this$count = this.getCount();
        final Object other$count = other.getCount();
        if (this$count == null ? other$count != null : !this$count.equals(other$count)) return false;
        final Object this$page = this.getPage();
        final Object other$page = other.getPage();
        if (this$page == null ? other$page != null : !this$page.equals(other$page)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof FilesListRequest;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $token = this.getToken();
        result = result * PRIME + ($token == null ? 43 : $token.hashCode());
        final Object $user = this.getUser();
        result = result * PRIME + ($user == null ? 43 : $user.hashCode());
        final Object $channel = this.getChannel();
        result = result * PRIME + ($channel == null ? 43 : $channel.hashCode());
        final Object $tsFrom = this.getTsFrom();
        result = result * PRIME + ($tsFrom == null ? 43 : $tsFrom.hashCode());
        final Object $tsTo = this.getTsTo();
        result = result * PRIME + ($tsTo == null ? 43 : $tsTo.hashCode());
        final Object $types = this.getTypes();
        result = result * PRIME + ($types == null ? 43 : $types.hashCode());
        final Object $count = this.getCount();
        result = result * PRIME + ($count == null ? 43 : $count.hashCode());
        final Object $page = this.getPage();
        result = result * PRIME + ($page == null ? 43 : $page.hashCode());
        return result;
    }

    public String toString() {
        return "FilesListRequest(token=" + this.getToken() + ", user=" + this.getUser() + ", channel=" + this.getChannel() + ", tsFrom=" + this.getTsFrom() + ", tsTo=" + this.getTsTo() + ", types=" + this.getTypes() + ", count=" + this.getCount() + ", page=" + this.getPage() + ")";
    }

    public static class FilesListRequestBuilder {
        private String token;
        private String user;
        private String channel;
        private String tsFrom;
        private String tsTo;
        private List<String> types;
        private Integer count;
        private Integer page;

        FilesListRequestBuilder() {
        }

        public FilesListRequest.FilesListRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public FilesListRequest.FilesListRequestBuilder user(String user) {
            this.user = user;
            return this;
        }

        public FilesListRequest.FilesListRequestBuilder channel(String channel) {
            this.channel = channel;
            return this;
        }

        public FilesListRequest.FilesListRequestBuilder tsFrom(String tsFrom) {
            this.tsFrom = tsFrom;
            return this;
        }

        public FilesListRequest.FilesListRequestBuilder tsTo(String tsTo) {
            this.tsTo = tsTo;
            return this;
        }

        public FilesListRequest.FilesListRequestBuilder types(List<String> types) {
            this.types = types;
            return this;
        }

        public FilesListRequest.FilesListRequestBuilder count(Integer count) {
            this.count = count;
            return this;
        }

        public FilesListRequest.FilesListRequestBuilder page(Integer page) {
            this.page = page;
            return this;
        }

        public FilesListRequest build() {
            return new FilesListRequest(token, user, channel, tsFrom, tsTo, types, count, page);
        }

        public String toString() {
            return "FilesListRequest.FilesListRequestBuilder(token=" + this.token + ", user=" + this.user + ", channel=" + this.channel + ", tsFrom=" + this.tsFrom + ", tsTo=" + this.tsTo + ", types=" + this.types + ", count=" + this.count + ", page=" + this.page + ")";
        }
    }
}