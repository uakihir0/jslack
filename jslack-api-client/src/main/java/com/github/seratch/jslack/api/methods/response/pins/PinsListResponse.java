package com.github.seratch.jslack.api.methods.response.pins;

import com.github.seratch.jslack.api.methods.SlackApiResponse;
import com.github.seratch.jslack.api.model.File;
import com.github.seratch.jslack.api.model.FileComment;
import com.github.seratch.jslack.api.model.Message;

import java.util.List;

public class PinsListResponse implements SlackApiResponse {

    private boolean ok;
    private String warning;
    private String error;
    private String needed;
    private String provided;

    private List<MessageItem> items;

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

    public List<MessageItem> getItems() {
        return this.items;
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

    public void setItems(List<MessageItem> items) {
        this.items = items;
    }

    public static class MessageItem {

        private String type;
        private String channel;
        private Message message;
        private File file;
        private FileComment comment;
        private String createdBy;
        private Integer created;

        public String getType() {
            return this.type;
        }

        public String getChannel() {
            return this.channel;
        }

        public Message getMessage() {
            return this.message;
        }

        public File getFile() {
            return this.file;
        }

        public FileComment getComment() {
            return this.comment;
        }

        public String getCreatedBy() {
            return this.createdBy;
        }

        public Integer getCreated() {
            return this.created;
        }

        public void setType(String type) {
            this.type = type;
        }

        public void setChannel(String channel) {
            this.channel = channel;
        }

        public void setMessage(Message message) {
            this.message = message;
        }

        public void setFile(File file) {
            this.file = file;
        }

        public void setComment(FileComment comment) {
            this.comment = comment;
        }

        public void setCreatedBy(String createdBy) {
            this.createdBy = createdBy;
        }

        public void setCreated(Integer created) {
            this.created = created;
        }
    }

}