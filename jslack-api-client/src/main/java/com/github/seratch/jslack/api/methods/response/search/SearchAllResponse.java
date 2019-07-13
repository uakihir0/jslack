package com.github.seratch.jslack.api.methods.response.search;

import com.github.seratch.jslack.api.methods.SlackApiResponse;
import com.github.seratch.jslack.api.model.SearchResult;

import java.util.List;

public class SearchAllResponse implements SlackApiResponse {

    private boolean ok;
    private String warning;
    private String error;
    private String needed;
    private String provided;

    private String query;
    private SearchResult messages;
    private SearchResult files;
    private Posts posts;

    public SearchAllResponse() {
    }

    public boolean isOk() {
        return this.ok;
    }

    public String getWarning() {
        return this.warning;
    }

    public String getError() {
        return this.error;
    }

    public String getNeeded() {
        return this.needed;
    }

    public String getProvided() {
        return this.provided;
    }

    public String getQuery() {
        return this.query;
    }

    public SearchResult getMessages() {
        return this.messages;
    }

    public SearchResult getFiles() {
        return this.files;
    }

    public Posts getPosts() {
        return this.posts;
    }

    public void setOk(boolean ok) {
        this.ok = ok;
    }

    public void setWarning(String warning) {
        this.warning = warning;
    }

    public void setError(String error) {
        this.error = error;
    }

    public void setNeeded(String needed) {
        this.needed = needed;
    }

    public void setProvided(String provided) {
        this.provided = provided;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public void setMessages(SearchResult messages) {
        this.messages = messages;
    }

    public void setFiles(SearchResult files) {
        this.files = files;
    }

    public void setPosts(Posts posts) {
        this.posts = posts;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof SearchAllResponse)) return false;
        final SearchAllResponse other = (SearchAllResponse) o;
        if (!other.canEqual((Object) this)) return false;
        if (this.isOk() != other.isOk()) return false;
        final Object this$warning = this.getWarning();
        final Object other$warning = other.getWarning();
        if (this$warning == null ? other$warning != null : !this$warning.equals(other$warning)) return false;
        final Object this$error = this.getError();
        final Object other$error = other.getError();
        if (this$error == null ? other$error != null : !this$error.equals(other$error)) return false;
        final Object this$needed = this.getNeeded();
        final Object other$needed = other.getNeeded();
        if (this$needed == null ? other$needed != null : !this$needed.equals(other$needed)) return false;
        final Object this$provided = this.getProvided();
        final Object other$provided = other.getProvided();
        if (this$provided == null ? other$provided != null : !this$provided.equals(other$provided)) return false;
        final Object this$query = this.getQuery();
        final Object other$query = other.getQuery();
        if (this$query == null ? other$query != null : !this$query.equals(other$query)) return false;
        final Object this$messages = this.getMessages();
        final Object other$messages = other.getMessages();
        if (this$messages == null ? other$messages != null : !this$messages.equals(other$messages)) return false;
        final Object this$files = this.getFiles();
        final Object other$files = other.getFiles();
        if (this$files == null ? other$files != null : !this$files.equals(other$files)) return false;
        final Object this$posts = this.getPosts();
        final Object other$posts = other.getPosts();
        if (this$posts == null ? other$posts != null : !this$posts.equals(other$posts)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof SearchAllResponse;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = result * PRIME + (this.isOk() ? 79 : 97);
        final Object $warning = this.getWarning();
        result = result * PRIME + ($warning == null ? 43 : $warning.hashCode());
        final Object $error = this.getError();
        result = result * PRIME + ($error == null ? 43 : $error.hashCode());
        final Object $needed = this.getNeeded();
        result = result * PRIME + ($needed == null ? 43 : $needed.hashCode());
        final Object $provided = this.getProvided();
        result = result * PRIME + ($provided == null ? 43 : $provided.hashCode());
        final Object $query = this.getQuery();
        result = result * PRIME + ($query == null ? 43 : $query.hashCode());
        final Object $messages = this.getMessages();
        result = result * PRIME + ($messages == null ? 43 : $messages.hashCode());
        final Object $files = this.getFiles();
        result = result * PRIME + ($files == null ? 43 : $files.hashCode());
        final Object $posts = this.getPosts();
        result = result * PRIME + ($posts == null ? 43 : $posts.hashCode());
        return result;
    }

    public String toString() {
        return "SearchAllResponse(ok=" + this.isOk() + ", warning=" + this.getWarning() + ", error=" + this.getError() + ", needed=" + this.getNeeded() + ", provided=" + this.getProvided() + ", query=" + this.getQuery() + ", messages=" + this.getMessages() + ", files=" + this.getFiles() + ", posts=" + this.getPosts() + ")";
    }

    public static class Posts {
        private Integer total;
        private List<String> matches;

        public Posts() {
        }

        public Integer getTotal() {
            return this.total;
        }

        public List<String> getMatches() {
            return this.matches;
        }

        public void setTotal(Integer total) {
            this.total = total;
        }

        public void setMatches(List<String> matches) {
            this.matches = matches;
        }

        public boolean equals(final Object o) {
            if (o == this) return true;
            if (!(o instanceof Posts)) return false;
            final Posts other = (Posts) o;
            if (!other.canEqual((Object) this)) return false;
            final Object this$total = this.getTotal();
            final Object other$total = other.getTotal();
            if (this$total == null ? other$total != null : !this$total.equals(other$total)) return false;
            final Object this$matches = this.getMatches();
            final Object other$matches = other.getMatches();
            if (this$matches == null ? other$matches != null : !this$matches.equals(other$matches)) return false;
            return true;
        }

        protected boolean canEqual(final Object other) {
            return other instanceof Posts;
        }

        public int hashCode() {
            final int PRIME = 59;
            int result = 1;
            final Object $total = this.getTotal();
            result = result * PRIME + ($total == null ? 43 : $total.hashCode());
            final Object $matches = this.getMatches();
            result = result * PRIME + ($matches == null ? 43 : $matches.hashCode());
            return result;
        }

        public String toString() {
            return "SearchAllResponse.Posts(total=" + this.getTotal() + ", matches=" + this.getMatches() + ")";
        }
    }
}