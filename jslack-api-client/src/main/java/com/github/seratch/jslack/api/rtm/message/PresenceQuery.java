package com.github.seratch.jslack.api.rtm.message;

import java.util.List;

/**
 * https://api.slack.com/events/presence_query
 */
public class PresenceQuery implements RTMMessage {

    public static final String TYPE_NAME = "presence_query";

    private final String type = TYPE_NAME;
    private List<String> ids;

    public PresenceQuery(List<String> ids) {
        this.ids = ids;
    }

    public PresenceQuery() {
    }

    public static PresenceQueryBuilder builder() {
        return new PresenceQueryBuilder();
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

    public static class PresenceQueryBuilder {
        private List<String> ids;

        PresenceQueryBuilder() {
        }

        public PresenceQuery.PresenceQueryBuilder ids(List<String> ids) {
            this.ids = ids;
            return this;
        }

        public PresenceQuery build() {
            return new PresenceQuery(ids);
        }

        public String toString() {
            return "PresenceQuery.PresenceQueryBuilder(ids=" + this.ids + ")";
        }
    }
}
