package com.github.seratch.jslack.api.methods.response.reactions;

import com.github.seratch.jslack.api.methods.SlackApiResponse;
import com.github.seratch.jslack.api.model.Reaction;

import java.util.List;

public class ReactionsGetResponse implements SlackApiResponse {

    private boolean ok;
    private String warning;
    private String error;
    private String needed;
    private String provided;

    private String type;
    private String channel;
    private Message message;

    public ReactionsGetResponse() {
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

    public String getType() {
        return this.type;
    }

    public String getChannel() {
        return this.channel;
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

    public void setType(String type) {
        this.type = type;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public void setMessage(Message message) {
        this.message = message;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof ReactionsGetResponse)) return false;
        final ReactionsGetResponse other = (ReactionsGetResponse) o;
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
        final Object this$type = this.getType();
        final Object other$type = other.getType();
        if (this$type == null ? other$type != null : !this$type.equals(other$type)) return false;
        final Object this$channel = this.getChannel();
        final Object other$channel = other.getChannel();
        if (this$channel == null ? other$channel != null : !this$channel.equals(other$channel)) return false;
        final Object this$message = this.getMessage();
        final Object other$message = other.getMessage();
        if (this$message == null ? other$message != null : !this$message.equals(other$message)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof ReactionsGetResponse;
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
        final Object $type = this.getType();
        result = result * PRIME + ($type == null ? 43 : $type.hashCode());
        final Object $channel = this.getChannel();
        result = result * PRIME + ($channel == null ? 43 : $channel.hashCode());
        final Object $message = this.getMessage();
        result = result * PRIME + ($message == null ? 43 : $message.hashCode());
        return result;
    }

    public String toString() {
        return "ReactionsGetResponse(ok=" + this.isOk() + ", warning=" + this.getWarning() + ", error=" + this.getError() + ", needed=" + this.getNeeded() + ", provided=" + this.getProvided() + ", type=" + this.getType() + ", channel=" + this.getChannel() + ", message=" + this.getMessage() + ")";
    }

    public static class Message {
        private String type;
        private String subtype;
        private String text;
        private String ts;
        private String username;
        private String botId;
        private String permalink;
        private List<Reaction> reactions;

        public Message() {
        }

        public String getType() {
            return this.type;
        }

        public String getSubtype() {
            return this.subtype;
        }

        public String getText() {
            return this.text;
        }

        public String getTs() {
            return this.ts;
        }

        public String getUsername() {
            return this.username;
        }

        public String getBotId() {
            return this.botId;
        }

        public String getPermalink() {
            return this.permalink;
        }

        public List<Reaction> getReactions() {
            return this.reactions;
        }

        public void setType(String type) {
            this.type = type;
        }

        public void setSubtype(String subtype) {
            this.subtype = subtype;
        }

        public void setText(String text) {
            this.text = text;
        }

        public void setTs(String ts) {
            this.ts = ts;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public void setBotId(String botId) {
            this.botId = botId;
        }

        public void setPermalink(String permalink) {
            this.permalink = permalink;
        }

        public void setReactions(List<Reaction> reactions) {
            this.reactions = reactions;
        }

        public boolean equals(final Object o) {
            if (o == this) return true;
            if (!(o instanceof Message))
                return false;
            final Message other = (Message) o;
            if (!other.canEqual((Object) this)) return false;
            final Object this$type = this.getType();
            final Object other$type = other.getType();
            if (this$type == null ? other$type != null : !this$type.equals(other$type)) return false;
            final Object this$subtype = this.getSubtype();
            final Object other$subtype = other.getSubtype();
            if (this$subtype == null ? other$subtype != null : !this$subtype.equals(other$subtype)) return false;
            final Object this$text = this.getText();
            final Object other$text = other.getText();
            if (this$text == null ? other$text != null : !this$text.equals(other$text)) return false;
            final Object this$ts = this.getTs();
            final Object other$ts = other.getTs();
            if (this$ts == null ? other$ts != null : !this$ts.equals(other$ts)) return false;
            final Object this$username = this.getUsername();
            final Object other$username = other.getUsername();
            if (this$username == null ? other$username != null : !this$username.equals(other$username)) return false;
            final Object this$botId = this.getBotId();
            final Object other$botId = other.getBotId();
            if (this$botId == null ? other$botId != null : !this$botId.equals(other$botId)) return false;
            final Object this$permalink = this.getPermalink();
            final Object other$permalink = other.getPermalink();
            if (this$permalink == null ? other$permalink != null : !this$permalink.equals(other$permalink))
                return false;
            final Object this$reactions = this.getReactions();
            final Object other$reactions = other.getReactions();
            if (this$reactions == null ? other$reactions != null : !this$reactions.equals(other$reactions))
                return false;
            return true;
        }

        protected boolean canEqual(final Object other) {
            return other instanceof Message;
        }

        public int hashCode() {
            final int PRIME = 59;
            int result = 1;
            final Object $type = this.getType();
            result = result * PRIME + ($type == null ? 43 : $type.hashCode());
            final Object $subtype = this.getSubtype();
            result = result * PRIME + ($subtype == null ? 43 : $subtype.hashCode());
            final Object $text = this.getText();
            result = result * PRIME + ($text == null ? 43 : $text.hashCode());
            final Object $ts = this.getTs();
            result = result * PRIME + ($ts == null ? 43 : $ts.hashCode());
            final Object $username = this.getUsername();
            result = result * PRIME + ($username == null ? 43 : $username.hashCode());
            final Object $botId = this.getBotId();
            result = result * PRIME + ($botId == null ? 43 : $botId.hashCode());
            final Object $permalink = this.getPermalink();
            result = result * PRIME + ($permalink == null ? 43 : $permalink.hashCode());
            final Object $reactions = this.getReactions();
            result = result * PRIME + ($reactions == null ? 43 : $reactions.hashCode());
            return result;
        }

        public String toString() {
            return "ReactionsGetResponse.Message(type=" + this.getType() + ", subtype=" + this.getSubtype() + ", text=" + this.getText() + ", ts=" + this.getTs() + ", username=" + this.getUsername() + ", botId=" + this.getBotId() + ", permalink=" + this.getPermalink() + ", reactions=" + this.getReactions() + ")";
        }
    }

}