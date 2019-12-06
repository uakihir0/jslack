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

    public static class Posts {
        private Integer total;
        private List<String> matches;

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
    }
}