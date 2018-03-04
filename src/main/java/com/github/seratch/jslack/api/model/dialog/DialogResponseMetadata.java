package com.github.seratch.jslack.api.model.dialog;

import java.util.List;

public class DialogResponseMetadata {

    private List<String> messages;

    public DialogResponseMetadata() {
    }

    public List<String> getMessages() {
        return this.messages;
    }

    public void setMessages(List<String> messages) {
        this.messages = messages;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof DialogResponseMetadata)) return false;
        final DialogResponseMetadata other = (DialogResponseMetadata) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$messages = this.getMessages();
        final Object other$messages = other.getMessages();
        if (this$messages == null ? other$messages != null : !this$messages.equals(other$messages)) return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $messages = this.getMessages();
        result = result * PRIME + ($messages == null ? 43 : $messages.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof DialogResponseMetadata;
    }

    public String toString() {
        return "DialogResponseMetadata(messages=" + this.getMessages() + ")";
    }
}
