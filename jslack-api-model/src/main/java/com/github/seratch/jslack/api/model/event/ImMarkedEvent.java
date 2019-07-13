package com.github.seratch.jslack.api.model.event;

/**
 * The im_marked event is sent to all open connections for a user
 * when that user moves the read cursor in a direct message channel by calling the im.mark API method.
 * <p>
 * https://api.slack.com/events/im_marked
 */
public class ImMarkedEvent implements Event {

    public static final String TYPE_NAME = "im_marked";

    private final String type = TYPE_NAME;
    private String channel;
    private String ts;

    public ImMarkedEvent() {
    }

    public String getType() {
        return this.type;
    }

    public String getChannel() {
        return this.channel;
    }

    public String getTs() {
        return this.ts;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public void setTs(String ts) {
        this.ts = ts;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof ImMarkedEvent)) return false;
        final ImMarkedEvent other = (ImMarkedEvent) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$type = this.getType();
        final Object other$type = other.getType();
        if (this$type == null ? other$type != null : !this$type.equals(other$type)) return false;
        final Object this$channel = this.getChannel();
        final Object other$channel = other.getChannel();
        if (this$channel == null ? other$channel != null : !this$channel.equals(other$channel)) return false;
        final Object this$ts = this.getTs();
        final Object other$ts = other.getTs();
        if (this$ts == null ? other$ts != null : !this$ts.equals(other$ts)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof ImMarkedEvent;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $type = this.getType();
        result = result * PRIME + ($type == null ? 43 : $type.hashCode());
        final Object $channel = this.getChannel();
        result = result * PRIME + ($channel == null ? 43 : $channel.hashCode());
        final Object $ts = this.getTs();
        result = result * PRIME + ($ts == null ? 43 : $ts.hashCode());
        return result;
    }

    public String toString() {
        return "ImMarkedEvent(type=" + this.getType() + ", channel=" + this.getChannel() + ", ts=" + this.getTs() + ")";
    }
}