package com.github.seratch.jslack.api.rtm.message;

import java.util.List;

/**
 * https://api.slack.com/events/presence_sub
 */
public class PresenceSub implements RTMMessage {

    public static final String TYPE_NAME = "presence_sub";

    private final String type = TYPE_NAME;
    private List<String> ids;

    public PresenceSub(List<String> ids) {
        this.ids = ids;
    }

    public PresenceSub() {
    }

    public static PresenceSubBuilder builder() {
        return new PresenceSubBuilder();
    }

    public String getType() {
        return this.type;
    }

    public List<String> getIds() {
        return this.ids;
    }

    public void setIds(List<String> ids) {
        this.ids = ids;
    }

    public static class PresenceSubBuilder {
        private List<String> ids;

        PresenceSubBuilder() {
        }

        public PresenceSub.PresenceSubBuilder ids(List<String> ids) {
            this.ids = ids;
            return this;
        }

        public PresenceSub build() {
            return new PresenceSub(ids);
        }

        public String toString() {
            return "PresenceSub.PresenceSubBuilder(ids=" + this.ids + ")";
        }
    }
}
