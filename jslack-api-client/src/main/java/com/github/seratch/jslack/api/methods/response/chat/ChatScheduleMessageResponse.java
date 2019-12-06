package com.github.seratch.jslack.api.methods.response.chat;

import com.github.seratch.jslack.api.methods.SlackApiResponse;
import com.github.seratch.jslack.api.model.Attachment;
import com.github.seratch.jslack.api.model.BotProfile;
import com.github.seratch.jslack.api.model.block.LayoutBlock;

import java.util.List;

public class ChatScheduleMessageResponse implements SlackApiResponse {

    private boolean ok;
    private String warning;
    private String error;
    private String needed;
    private String provided;

    private String scheduledMessageId;
    private String channel;
    private Integer postAt;
    private ScheduledMessage message;

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

    public String getScheduledMessageId() {
        return this.scheduledMessageId;
    }

    public String getChannel() {
        return this.channel;
    }

    public Integer getPostAt() {
        return this.postAt;
    }

    public ScheduledMessage getMessage() {
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

    public void setScheduledMessageId(String scheduledMessageId) {
        this.scheduledMessageId = scheduledMessageId;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public void setPostAt(Integer postAt) {
        this.postAt = postAt;
    }

    public void setMessage(ScheduledMessage message) {
        this.message = message;
    }

    public static class ScheduledMessage {
        private String botId;
        private BotProfile botProfile;

        private String type;
        private String team;
        private String user;

        private String text;
        private List<Attachment> attachments;
        private List<LayoutBlock> blocks;

        public String getBotId() {
            return this.botId;
        }

        public BotProfile getBotProfile() {
            return this.botProfile;
        }

        public String getType() {
            return this.type;
        }

        public String getTeam() {
            return this.team;
        }

        public String getUser() {
            return this.user;
        }

        public String getText() {
            return this.text;
        }

        public List<Attachment> getAttachments() {
            return this.attachments;
        }

        public List<LayoutBlock> getBlocks() {
            return this.blocks;
        }

        public void setBotId(String botId) {
            this.botId = botId;
        }

        public void setBotProfile(BotProfile botProfile) {
            this.botProfile = botProfile;
        }

        public void setType(String type) {
            this.type = type;
        }

        public void setTeam(String team) {
            this.team = team;
        }

        public void setUser(String user) {
            this.user = user;
        }

        public void setText(String text) {
            this.text = text;
        }

        public void setAttachments(List<Attachment> attachments) {
            this.attachments = attachments;
        }

        public void setBlocks(List<LayoutBlock> blocks) {
            this.blocks = blocks;
        }
    }
}