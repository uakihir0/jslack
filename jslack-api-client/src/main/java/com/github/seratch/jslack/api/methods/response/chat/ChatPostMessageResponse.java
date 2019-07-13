package com.github.seratch.jslack.api.methods.response.chat;

import com.github.seratch.jslack.api.methods.SlackApiResponse;
import com.github.seratch.jslack.api.model.Message;

import java.util.List;

public class ChatPostMessageResponse implements SlackApiResponse {

    private boolean ok;
    private String warning;
    private String error;
    private String needed;
    private String provided;

    private ResponseMetadata responseMetadata;

    public ChatPostMessageResponse() {
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

    public ResponseMetadata getResponseMetadata() {
        return this.responseMetadata;
    }

    public String getChannel() {
        return this.channel;
    }

    public String getTs() {
        return this.ts;
    }

    public Message getMessage() {
        return this.message;
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

    public void setResponseMetadata(ResponseMetadata responseMetadata) {
        this.responseMetadata = responseMetadata;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public void setTs(String ts) {
        this.ts = ts;
    }

    public void setMessage(Message message) {
        this.message = message;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof ChatPostMessageResponse)) return false;
        final ChatPostMessageResponse other = (ChatPostMessageResponse) o;
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
        final Object this$responseMetadata = this.getResponseMetadata();
        final Object other$responseMetadata = other.getResponseMetadata();
        if (this$responseMetadata == null ? other$responseMetadata != null : !this$responseMetadata.equals(other$responseMetadata))
            return false;
        final Object this$channel = this.getChannel();
        final Object other$channel = other.getChannel();
        if (this$channel == null ? other$channel != null : !this$channel.equals(other$channel)) return false;
        final Object this$ts = this.getTs();
        final Object other$ts = other.getTs();
        if (this$ts == null ? other$ts != null : !this$ts.equals(other$ts)) return false;
        final Object this$message = this.getMessage();
        final Object other$message = other.getMessage();
        if (this$message == null ? other$message != null : !this$message.equals(other$message)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof ChatPostMessageResponse;
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
        final Object $responseMetadata = this.getResponseMetadata();
        result = result * PRIME + ($responseMetadata == null ? 43 : $responseMetadata.hashCode());
        final Object $channel = this.getChannel();
        result = result * PRIME + ($channel == null ? 43 : $channel.hashCode());
        final Object $ts = this.getTs();
        result = result * PRIME + ($ts == null ? 43 : $ts.hashCode());
        final Object $message = this.getMessage();
        result = result * PRIME + ($message == null ? 43 : $message.hashCode());
        return result;
    }

    public String toString() {
        return "ChatPostMessageResponse(ok=" + this.isOk() + ", warning=" + this.getWarning() + ", error=" + this.getError() + ", needed=" + this.getNeeded() + ", provided=" + this.getProvided() + ", responseMetadata=" + this.getResponseMetadata() + ", channel=" + this.getChannel() + ", ts=" + this.getTs() + ", message=" + this.getMessage() + ")";
    }

    public static class ResponseMetadata {
        private List<String> messages;

        public ResponseMetadata() {
        }

        public List<String> getMessages() {
            return this.messages;
        }

        public void setMessages(List<String> messages) {
            this.messages = messages;
        }

        public boolean equals(final Object o) {
            if (o == this) return true;
            if (!(o instanceof ResponseMetadata))
                return false;
            final ResponseMetadata other = (ResponseMetadata) o;
            if (!other.canEqual((Object) this)) return false;
            final Object this$messages = this.getMessages();
            final Object other$messages = other.getMessages();
            if (this$messages == null ? other$messages != null : !this$messages.equals(other$messages)) return false;
            return true;
        }

        protected boolean canEqual(final Object other) {
            return other instanceof ResponseMetadata;
        }

        public int hashCode() {
            final int PRIME = 59;
            int result = 1;
            final Object $messages = this.getMessages();
            result = result * PRIME + ($messages == null ? 43 : $messages.hashCode());
            return result;
        }

        public String toString() {
            return "ChatPostMessageResponse.ResponseMetadata(messages=" + this.getMessages() + ")";
        }
    }

    private String channel;
    private String ts;
    private Message message;
}