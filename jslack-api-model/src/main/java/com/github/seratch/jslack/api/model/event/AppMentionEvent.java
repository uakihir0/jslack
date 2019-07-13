package com.github.seratch.jslack.api.model.event;

/**
 * This app event allows your app to subscribe to message events that directly mention your bot user.
 * <p>
 * Your Slack app must have a bot user configured and installed to utilize this event.
 * <p>
 * Instead of receiving all messages in a channel and having to filter through them for those mentioning your app,
 * as you would when subscribing to message.channels,
 * you'll receive only the messages pertinent to your app.
 * <p>
 * Messages sent via this subscription arrive as an app_mention event, not as a message as with other message.* event types.
 * However, your app can treat its contents similarly.
 * <p>
 * Messages sent to your app in direct message conversations are not dispatched via app_mention,
 * whether the app is explicitly mentioned or otherwise.
 * Subscribe to message.im events to receive messages directed to your bot user in direct message conversations.
 * <p>
 * https://api.slack.com/events/app_mention
 */
public class AppMentionEvent implements Event {

    public static final String TYPE_NAME = "app_mention";

    private final String type = TYPE_NAME;
    private String user;
    private String text;
    private String ts;
    private String channel;
    private String eventTs;

    private String threadTs;

    public AppMentionEvent() {
    }

    public String getType() {
        return this.type;
    }

    public String getUser() {
        return this.user;
    }

    public String getText() {
        return this.text;
    }

    public String getTs() {
        return this.ts;
    }

    public String getChannel() {
        return this.channel;
    }

    public String getEventTs() {
        return this.eventTs;
    }

    public String getThreadTs() {
        return this.threadTs;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setTs(String ts) {
        this.ts = ts;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public void setEventTs(String eventTs) {
        this.eventTs = eventTs;
    }

    public void setThreadTs(String threadTs) {
        this.threadTs = threadTs;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof AppMentionEvent)) return false;
        final AppMentionEvent other = (AppMentionEvent) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$type = this.getType();
        final Object other$type = other.getType();
        if (this$type == null ? other$type != null : !this$type.equals(other$type)) return false;
        final Object this$user = this.getUser();
        final Object other$user = other.getUser();
        if (this$user == null ? other$user != null : !this$user.equals(other$user)) return false;
        final Object this$text = this.getText();
        final Object other$text = other.getText();
        if (this$text == null ? other$text != null : !this$text.equals(other$text)) return false;
        final Object this$ts = this.getTs();
        final Object other$ts = other.getTs();
        if (this$ts == null ? other$ts != null : !this$ts.equals(other$ts)) return false;
        final Object this$channel = this.getChannel();
        final Object other$channel = other.getChannel();
        if (this$channel == null ? other$channel != null : !this$channel.equals(other$channel)) return false;
        final Object this$eventTs = this.getEventTs();
        final Object other$eventTs = other.getEventTs();
        if (this$eventTs == null ? other$eventTs != null : !this$eventTs.equals(other$eventTs)) return false;
        final Object this$threadTs = this.getThreadTs();
        final Object other$threadTs = other.getThreadTs();
        if (this$threadTs == null ? other$threadTs != null : !this$threadTs.equals(other$threadTs)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof AppMentionEvent;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $type = this.getType();
        result = result * PRIME + ($type == null ? 43 : $type.hashCode());
        final Object $user = this.getUser();
        result = result * PRIME + ($user == null ? 43 : $user.hashCode());
        final Object $text = this.getText();
        result = result * PRIME + ($text == null ? 43 : $text.hashCode());
        final Object $ts = this.getTs();
        result = result * PRIME + ($ts == null ? 43 : $ts.hashCode());
        final Object $channel = this.getChannel();
        result = result * PRIME + ($channel == null ? 43 : $channel.hashCode());
        final Object $eventTs = this.getEventTs();
        result = result * PRIME + ($eventTs == null ? 43 : $eventTs.hashCode());
        final Object $threadTs = this.getThreadTs();
        result = result * PRIME + ($threadTs == null ? 43 : $threadTs.hashCode());
        return result;
    }

    public String toString() {
        return "AppMentionEvent(type=" + this.getType() + ", user=" + this.getUser() + ", text=" + this.getText() + ", ts=" + this.getTs() + ", channel=" + this.getChannel() + ", eventTs=" + this.getEventTs() + ", threadTs=" + this.getThreadTs() + ")";
    }
}