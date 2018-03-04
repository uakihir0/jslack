package com.github.seratch.jslack.api.methods.response.reactions;

import com.github.seratch.jslack.api.methods.SlackApiResponse;
import com.github.seratch.jslack.api.model.MessageItem;
import com.github.seratch.jslack.api.model.Paging;

import java.util.List;

public class ReactionsListResponse implements SlackApiResponse {

    private boolean ok;
    private String warning;
    private String error;

    private List<MessageItem> items;
    private Paging paging;

    public ReactionsListResponse() {
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

    public List<MessageItem> getItems() {
        return this.items;
    }

    public Paging getPaging() {
        return this.paging;
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

    public void setItems(List<MessageItem> items) {
        this.items = items;
    }

    public void setPaging(Paging paging) {
        this.paging = paging;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof ReactionsListResponse)) return false;
        final ReactionsListResponse other = (ReactionsListResponse) o;
        if (!other.canEqual((Object) this)) return false;
        if (this.isOk() != other.isOk()) return false;
        final Object this$warning = this.getWarning();
        final Object other$warning = other.getWarning();
        if (this$warning == null ? other$warning != null : !this$warning.equals(other$warning)) return false;
        final Object this$error = this.getError();
        final Object other$error = other.getError();
        if (this$error == null ? other$error != null : !this$error.equals(other$error)) return false;
        final Object this$items = this.getItems();
        final Object other$items = other.getItems();
        if (this$items == null ? other$items != null : !this$items.equals(other$items)) return false;
        final Object this$paging = this.getPaging();
        final Object other$paging = other.getPaging();
        if (this$paging == null ? other$paging != null : !this$paging.equals(other$paging)) return false;
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
        final Object $items = this.getItems();
        result = result * PRIME + ($items == null ? 43 : $items.hashCode());
        final Object $paging = this.getPaging();
        result = result * PRIME + ($paging == null ? 43 : $paging.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof ReactionsListResponse;
    }

    public String toString() {
        return "ReactionsListResponse(ok=" + this.isOk() + ", warning=" + this.getWarning() + ", error=" + this.getError() + ", items=" + this.getItems() + ", paging=" + this.getPaging() + ")";
    }
}