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

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof PresenceSub)) return false;
        final PresenceSub other = (PresenceSub) o;
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
        return other instanceof PresenceSub;
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
        return "PresenceSub(type=" + this.getType() + ", ids=" + this.getIds() + ")";
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
