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

    public static class Message {
        private String type;
        private String subtype;
        private String text;
        private String ts;
        private String username;
        private String botId;
        private String permalink;
        private List<Reaction> reactions;

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
    }

}