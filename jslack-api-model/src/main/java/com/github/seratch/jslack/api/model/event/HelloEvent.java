package com.github.seratch.jslack.api.model.event;

/**
 * The hello event is sent when a connection is opened to the message server.
 * This allows a client to confirm the connection has been correctly opened.
 * <p>
 * https://api.slack.com/events/hello
 */
public class HelloEvent implements Event {

    public static final String TYPE_NAME = "hello";

    private final String type = TYPE_NAME;

    public HelloEvent() {
    }

    public String getType() {
        return this.type;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof HelloEvent)) return false;
        final HelloEvent other = (HelloEvent) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$type = this.getType();
        final Object other$type = other.getType();
        if (this$type == null ? other$type != null : !this$type.equals(other$type)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof HelloEvent;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $type = this.getType();
        result = result * PRIME + ($type == null ? 43 : $type.hashCode());
        return result;
    }

    public String toString() {
        return "HelloEvent(type=" + this.getType() + ")";
    }
}