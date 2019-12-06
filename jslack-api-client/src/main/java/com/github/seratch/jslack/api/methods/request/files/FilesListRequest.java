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

    /**
     * https://api.slack.com/changelog/2019-03-wild-west-for-files-no-more
     * <p>
     * In order to gather information on tombstoned files in Free workspaces,
     * so that you can delete or revoke them, pass the show_files_hidden_by_limit parameter.
     * While the yielded files will still be redacted,
     * you'll gain the id of the files so that you can delete or revoke them.
     */
    private boolean showFilesHiddenByLimit;

    FilesListRequest(String token, String user, String channel, String tsFrom, String tsTo, List<String> types, Integer count, Integer page, boolean showFilesHiddenByLimit) {
        this.token = token;
        this.user = user;
        this.channel = channel;
        this.tsFrom = tsFrom;
        this.tsTo = tsTo;
        this.types = types;
        this.count = count;
        this.page = page;
        this.showFilesHiddenByLimit = showFilesHiddenByLimit;
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

    public boolean isShowFilesHiddenByLimit() {
        return this.showFilesHiddenByLimit;
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

    public void setShowFilesHiddenByLimit(boolean showFilesHiddenByLimit) {
        this.showFilesHiddenByLimit = showFilesHiddenByLimit;
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
        private boolean showFilesHiddenByLimit;

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

        public FilesListRequest.FilesListRequestBuilder showFilesHiddenByLimit(boolean showFilesHiddenByLimit) {
            this.showFilesHiddenByLimit = showFilesHiddenByLimit;
            return this;
        }

        public FilesListRequest build() {
            return new FilesListRequest(token, user, channel, tsFrom, tsTo, types, count, page, showFilesHiddenByLimit);
        }

        public String toString() {
            return "FilesListRequest.FilesListRequestBuilder(token=" + this.token + ", user=" + this.user + ", channel=" + this.channel + ", tsFrom=" + this.tsFrom + ", tsTo=" + this.tsTo + ", types=" + this.types + ", count=" + this.count + ", page=" + this.page + ", showFilesHiddenByLimit=" + this.showFilesHiddenByLimit + ")";
        }
    }
}