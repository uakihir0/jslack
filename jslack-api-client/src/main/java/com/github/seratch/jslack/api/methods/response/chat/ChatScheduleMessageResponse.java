package com.github.seratch.jslack.api.methods.response.chat;

import com.github.seratch.jslack.api.methods.SlackApiResponse;
import com.github.seratch.jslack.api.model.Attachment;
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

    public ChatScheduleMessageResponse() {
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

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof ChatScheduleMessageResponse))
            return false;
        final ChatScheduleMessageResponse other = (ChatScheduleMessageResponse) o;
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
        final Object this$scheduledMessageId = this.getScheduledMessageId();
        final Object other$scheduledMessageId = other.getScheduledMessageId();
        if (this$scheduledMessageId == null ? other$scheduledMessageId != null : !this$scheduledMessageId.equals(other$scheduledMessageId))
            return false;
        final Object this$channel = this.getChannel();
        final Object other$channel = other.getChannel();
        if (this$channel == null ? other$channel != null : !this$channel.equals(other$channel)) return false;
        final Object this$postAt = this.getPostAt();
        final Object other$postAt = other.getPostAt();
        if (this$postAt == null ? other$postAt != null : !this$postAt.equals(other$postAt)) return false;
        final Object this$message = this.getMessage();
        final Object other$message = other.getMessage();
        if (this$message == null ? other$message != null : !this$message.equals(other$message)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof ChatScheduleMessageResponse;
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
        final Object $scheduledMessageId = this.getScheduledMessageId();
        result = result * PRIME + ($scheduledMessageId == null ? 43 : $scheduledMessageId.hashCode());
        final Object $channel = this.getChannel();
        result = result * PRIME + ($channel == null ? 43 : $channel.hashCode());
        final Object $postAt = this.getPostAt();
        result = result * PRIME + ($postAt == null ? 43 : $postAt.hashCode());
        final Object $message = this.getMessage();
        result = result * PRIME + ($message == null ? 43 : $message.hashCode());
        return result;
    }

    public String toString() {
        return "ChatScheduleMessageResponse(ok=" + this.isOk() + ", warning=" + this.getWarning() + ", error=" + this.getError() + ", needed=" + this.getNeeded() + ", provided=" + this.getProvided() + ", scheduledMessageId=" + this.getScheduledMessageId() + ", channel=" + this.getChannel() + ", postAt=" + this.getPostAt() + ", message=" + this.getMessage() + ")";
    }

    public static class ScheduledMessage {
        private String botId;
        private String type;
        private String team;
        private String user;

        private String text;
        private List<Attachment> attachments;
        private List<LayoutBlock> blocks;

        public ScheduledMessage() {
        }

        public String getBotId() {
            return this.botId;
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

        public boolean equals(final Object o) {
            if (o == this) return true;
            if (!(o instanceof ScheduledMessage))
                return false;
            final ScheduledMessage other = (ScheduledMessage) o;
            if (!other.canEqual((Object) this)) return false;
            final Object this$botId = this.getBotId();
            final Object other$botId = other.getBotId();
            if (this$botId == null ? other$botId != null : !this$botId.equals(other$botId)) return false;
            final Object this$type = this.getType();
            final Object other$type = other.getType();
            if (this$type == null ? other$type != null : !this$type.equals(other$type)) return false;
            final Object this$team = this.getTeam();
            final Object other$team = other.getTeam();
            if (this$team == null ? other$team != null : !this$team.equals(other$team)) return false;
            final Object this$user = this.getUser();
            final Object other$user = other.getUser();
            if (this$user == null ? other$user != null : !this$user.equals(other$user)) return false;
            final Object this$text = this.getText();
            final Object other$text = other.getText();
            if (this$text == null ? other$text != null : !this$text.equals(other$text)) return false;
            final Object this$attachments = this.getAttachments();
            final Object other$attachments = other.getAttachments();
            if (this$attachments == null ? other$attachments != null : !this$attachments.equals(other$attachments))
                return false;
            final Object this$blocks = this.getBlocks();
            final Object other$blocks = other.getBlocks();
            if (this$blocks == null ? other$blocks != null : !this$blocks.equals(other$blocks)) return false;
            return true;
        }

        protected boolean canEqual(final Object other) {
            return other instanceof ScheduledMessage;
        }

        public int hashCode() {
            final int PRIME = 59;
            int result = 1;
            final Object $botId = this.getBotId();
            result = result * PRIME + ($botId == null ? 43 : $botId.hashCode());
            final Object $type = this.getType();
            result = result * PRIME + ($type == null ? 43 : $type.hashCode());
            final Object $team = this.getTeam();
            result = result * PRIME + ($team == null ? 43 : $team.hashCode());
            final Object $user = this.getUser();
            result = result * PRIME + ($user == null ? 43 : $user.hashCode());
            final Object $text = this.getText();
            result = result * PRIME + ($text == null ? 43 : $text.hashCode());
            final Object $attachments = this.getAttachments();
            result = result * PRIME + ($attachments == null ? 43 : $attachments.hashCode());
            final Object $blocks = this.getBlocks();
            result = result * PRIME + ($blocks == null ? 43 : $blocks.hashCode());
            return result;
        }

        public String toString() {
            return "ChatScheduleMessageResponse.ScheduledMessage(botId=" + this.getBotId() + ", type=" + this.getType() + ", team=" + this.getTeam() + ", user=" + this.getUser() + ", text=" + this.getText() + ", attachments=" + this.getAttachments() + ", blocks=" + this.getBlocks() + ")";
        }
    }
}