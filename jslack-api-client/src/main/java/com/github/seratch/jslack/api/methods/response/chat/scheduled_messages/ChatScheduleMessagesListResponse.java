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

    public static class ScheduledMessage {
        private String id;
        private String channelId;
        private Integer postAt;
        private Integer dateCreated;

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
    }

}