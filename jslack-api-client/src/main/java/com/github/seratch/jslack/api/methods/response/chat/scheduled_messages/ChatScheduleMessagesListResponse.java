package com.github.seratch.jslack.api.methods.response.chat.scheduled_messages;

import com.github.seratch.jslack.api.methods.SlackApiResponse;
import com.github.seratch.jslack.api.model.ResponseMetadata;

import java.util.List;

public class ChatScheduleMessagesListResponse implements SlackApiResponse {

    private boolean ok;
    private String warning;
    private String error;
    private String needed;
    private String provided;

    private List<ScheduledMessage> scheduledMessages;
    private ResponseMetadata responseMetadata;

    public ChatScheduleMessagesListResponse() {
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

    public List<ScheduledMessage> getScheduledMessages() {
        return this.scheduledMessages;
    }

    public ResponseMetadata getResponseMetadata() {
        return this.responseMetadata;
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

    public void setScheduledMessages(List<ScheduledMessage> scheduledMessages) {
        this.scheduledMessages = scheduledMessages;
    }

    public void setResponseMetadata(ResponseMetadata responseMetadata) {
        this.responseMetadata = responseMetadata;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof ChatScheduleMessagesListResponse))
            return false;
        final ChatScheduleMessagesListResponse other = (ChatScheduleMessagesListResponse) o;
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
        final Object this$scheduledMessages = this.getScheduledMessages();
        final Object other$scheduledMessages = other.getScheduledMessages();
        if (this$scheduledMessages == null ? other$scheduledMessages != null : !this$scheduledMessages.equals(other$scheduledMessages))
            return false;
        final Object this$responseMetadata = this.getResponseMetadata();
        final Object other$responseMetadata = other.getResponseMetadata();
        if (this$responseMetadata == null ? other$responseMetadata != null : !this$responseMetadata.equals(other$responseMetadata))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof ChatScheduleMessagesListResponse;
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
        final Object $scheduledMessages = this.getScheduledMessages();
        result = result * PRIME + ($scheduledMessages == null ? 43 : $scheduledMessages.hashCode());
        final Object $responseMetadata = this.getResponseMetadata();
        result = result * PRIME + ($responseMetadata == null ? 43 : $responseMetadata.hashCode());
        return result;
    }

    public String toString() {
        return "ChatScheduleMessagesListResponse(ok=" + this.isOk() + ", warning=" + this.getWarning() + ", error=" + this.getError() + ", needed=" + this.getNeeded() + ", provided=" + this.getProvided() + ", scheduledMessages=" + this.getScheduledMessages() + ", responseMetadata=" + this.getResponseMetadata() + ")";
    }

    public static class ScheduledMessage {
        private String id;
        private String channelId;
        private Integer postAt;
        private Integer dateCreated;

        public ScheduledMessage() {
        }

        public String getId() {
            return this.id;
        }

        public String getChannelId() {
            return this.channelId;
        }

        public Integer getPostAt() {
            return this.postAt;
        }

        public Integer getDateCreated() {
            return this.dateCreated;
        }

        public void setId(String id) {
            this.id = id;
        }

        public void setChannelId(String channelId) {
            this.channelId = channelId;
        }

        public void setPostAt(Integer postAt) {
            this.postAt = postAt;
        }

        public void setDateCreated(Integer dateCreated) {
            this.dateCreated = dateCreated;
        }

        public boolean equals(final Object o) {
            if (o == this) return true;
            if (!(o instanceof ScheduledMessage))
                return false;
            final ScheduledMessage other = (ScheduledMessage) o;
            if (!other.canEqual((Object) this)) return false;
            final Object this$id = this.getId();
            final Object other$id = other.getId();
            if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
            final Object this$channelId = this.getChannelId();
            final Object other$channelId = other.getChannelId();
            if (this$channelId == null ? other$channelId != null : !this$channelId.equals(other$channelId))
                return false;
            final Object this$postAt = this.getPostAt();
            final Object other$postAt = other.getPostAt();
            if (this$postAt == null ? other$postAt != null : !this$postAt.equals(other$postAt)) return false;
            final Object this$dateCreated = this.getDateCreated();
            final Object other$dateCreated = other.getDateCreated();
            if (this$dateCreated == null ? other$dateCreated != null : !this$dateCreated.equals(other$dateCreated))
                return false;
            return true;
        }

        protected boolean canEqual(final Object other) {
            return other instanceof ScheduledMessage;
        }

        public int hashCode() {
            final int PRIME = 59;
            int result = 1;
            final Object $id = this.getId();
            result = result * PRIME + ($id == null ? 43 : $id.hashCode());
            final Object $channelId = this.getChannelId();
            result = result * PRIME + ($channelId == null ? 43 : $channelId.hashCode());
            final Object $postAt = this.getPostAt();
            result = result * PRIME + ($postAt == null ? 43 : $postAt.hashCode());
            final Object $dateCreated = this.getDateCreated();
            result = result * PRIME + ($dateCreated == null ? 43 : $dateCreated.hashCode());
            return result;
        }

        public String toString() {
            return "ChatScheduleMessagesListResponse.ScheduledMessage(id=" + this.getId() + ", channelId=" + this.getChannelId() + ", postAt=" + this.getPostAt() + ", dateCreated=" + this.getDateCreated() + ")";
        }
    }

}