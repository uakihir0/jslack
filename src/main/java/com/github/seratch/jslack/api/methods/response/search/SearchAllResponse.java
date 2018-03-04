package com.github.seratch.jslack.api.methods.response.search;

import com.github.seratch.jslack.api.methods.SlackApiResponse;
import com.github.seratch.jslack.api.model.SearchResult;

public class SearchAllResponse implements SlackApiResponse {

    private boolean ok;
    private String warning;
    private String error;

    private String query;
    private SearchResult messages;
    private SearchResult files;

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

    public String getQuery() {
        return this.query;
    }

    public SearchResult getMessages() {
        return this.messages;
    }

    public SearchResult getFiles() {
        return this.files;
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

    public void setQuery(String query) {
        this.query = query;
    }

    public void setMessages(SearchResult messages) {
        this.messages = messages;
    }

    public void setFiles(SearchResult files) {
        this.files = files;
    }

    public boolean equals(Object o) {
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
        final Object this$query = this.getQuery();
        final Object other$query = other.getQuery();
        if (this$query == null ? other$query != null : !this$query.equals(other$query)) return false;
        final Object this$messages = this.getMessages();
        final Object other$messages = other.getMessages();
        if (this$messages == null ? other$messages != null : !this$messages.equals(other$messages)) return false;
        final Object this$files = this.getFiles();
        final Object other$files = other.getFiles();
        if (this$files == null ? other$files != null : !this$files.equals(other$files)) return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = result * PRIME + (this.isOk() ? 79 : 97);
        final Object $warning = this.getWarning();
        result = result * PRIME + ($warning == null ? 43 : $warning.hashCode());
        final Object $error = this.getError();
        result = result * PRIME + ($error == null ? 43 : $error.hashCode());
        final Object $query = this.getQuery();
        result = result * PRIME + ($query == null ? 43 : $query.hashCode());
        final Object $messages = this.getMessages();
        result = result * PRIME + ($messages == null ? 43 : $messages.hashCode());
        final Object $files = this.getFiles();
        result = result * PRIME + ($files == null ? 43 : $files.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof SearchAllResponse;
    }

    public String toString() {
        return "SearchAllResponse(ok=" + this.isOk() + ", warning=" + this.getWarning() + ", error=" + this.getError() + ", query=" + this.getQuery() + ", messages=" + this.getMessages() + ", files=" + this.getFiles() + ")";
    }
}