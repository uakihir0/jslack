package com.github.seratch.jslack.api.model.event;

/**
 * This app event notifies your app when a user has entered into the App Home space—that's the place
 * where a user exchanges DMs with your app.
 * <p>
 * Your Slack app must have a bot user configured and installed to use this event.
 * <p>
 * Use the app_home_opened event to begin a friendly onboarding flow from your app,
 * a whimsical welcome message, or a deep-dive into a detailed dialog.
 * Since the app_home_opened event is only sent to your app when a user has already clicked on your app,
 * you can rest assured that your attentions are welcome.
 * <p>
 * Note: app_home_opened events are sent each time a user enters into the App Home space.
 * Verify that this is the first interaction between a user and your app before triggering your onboarding flow.
 * <p>
 * app_home_opened events are just like other message events sent over the Events API, but their type indicates app_home_opened.
 * <p>
 * https://api.slack.com/events/app_home_opened
 */
public class AppHomeOpenedEvent implements Event {

    public static final String TYPE_NAME = "app_home_opened";

    private final String type = TYPE_NAME;
    private String user;
    private String channel;
    private String eventTs;

    public AppHomeOpenedEvent() {
    }

    public String getType() {
        return this.type;
    }

    public String getUser() {
        return this.user;
    }

    public String getChannel() {
        return this.channel;
    }

    public String getEventTs() {
        return this.eventTs;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public void setEventTs(String eventTs) {
        this.eventTs = eventTs;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof AppHomeOpenedEvent)) return false;
        final AppHomeOpenedEvent other = (AppHomeOpenedEvent) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$type = this.getType();
        final Object other$type = other.getType();
        if (this$type == null ? other$type != null : !this$type.equals(other$type)) return false;
        final Object this$user = this.getUser();
        final Object other$user = other.getUser();
        if (this$user == null ? other$user != null : !this$user.equals(other$user)) return false;
        final Object this$channel = this.getChannel();
        final Object other$channel = other.getChannel();
        if (this$channel == null ? other$channel != null : !this$channel.equals(other$channel)) return false;
        final Object this$eventTs = this.getEventTs();
        final Object other$eventTs = other.getEventTs();
        if (this$eventTs == null ? other$eventTs != null : !this$eventTs.equals(other$eventTs)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof AppHomeOpenedEvent;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $type = this.getType();
        result = result * PRIME + ($type == null ? 43 : $type.hashCode());
        final Object $user = this.getUser();
        result = result * PRIME + ($user == null ? 43 : $user.hashCode());
        final Object $channel = this.getChannel();
        result = result * PRIME + ($channel == null ? 43 : $channel.hashCode());
        final Object $eventTs = this.getEventTs();
        result = result * PRIME + ($eventTs == null ? 43 : $eventTs.hashCode());
        return result;
    }

    public String toString() {
        return "AppHomeOpenedEvent(type=" + this.getType() + ", user=" + this.getUser() + ", channel=" + this.getChannel() + ", eventTs=" + this.getEventTs() + ")";
    }
}