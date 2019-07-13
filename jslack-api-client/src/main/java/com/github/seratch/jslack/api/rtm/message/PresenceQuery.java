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

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof PresenceQuery)) return false;
        final PresenceQuery other = (PresenceQuery) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$type = this.getType();
        final Object other$type = other.getType();
        if (this$type == null ? other$type != null : !this$type.equals(other$type)) return false;
        final Object this$ids = this.getIds();
        final Object other$ids = other.getIds();
        if (this$ids == null ? other$ids != null : !this$ids.equals(other$ids)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof PresenceQuery;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $type = this.getType();
        result = result * PRIME + ($type == null ? 43 : $type.hashCode());
        final Object $ids = this.getIds();
        result = result * PRIME + ($ids == null ? 43 : $ids.hashCode());
        return result;
    }

    public String toString() {
        return "PresenceQuery(type=" + this.getType() + ", ids=" + this.getIds() + ")";
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
