package com.github.seratch.jslack.api.model.event;

/**
 * The member_joined_channel event is sent to all WebSocket connections
 * and event subscriptions when users join public or private channels.
 * It's also triggered upon creating a new channel.
 * <p>
 * The provided user value is a user ID belonging to the user that joined the channel.
 * <p>
 * The channel value is the ID for a public channel or private channel (AKA group).
 * <p>
 * The channel_type value is a single letter indicating the type of channel used in channel:
 * <p>
 * C - typically a public channel
 * G - private channels (or groups) return this channel_type
 * The team identifies which workspace the user is from.
 * <p>
 * If the user was invited, the message will include an inviter property containing the user ID of the inviting user.
 * The property will be absent when a user manually joins a channel, or a user is added by default
 * (e.g. #general channel).
 * Also, the property is not available when a channel is converted from a public to private,
 * where the channel history is not shared with the user.
 * <p>
 * This example illustrates an absent inviter property, a result of a channel converting from public to private:
 * <p>
 * {
 * "type": "member_joined_channel",
 * "user": "W06GH7XHN",
 * "channel": "G0698JE0H",
 * "channel_type": "G",
 * "team": "T8MPF7EHL"
 * }
 * This event is supported as a bot user subscription in the Events API.
 * Workspace event subscriptions are also available for tokens holding
 * at least one of the channels:read or groups:read scopes.
 * Which events your app will receive depends on the scopes and their context.
 * For instance, you'll only receive member_joined_channel events for private channels if your app has the groups:read permission.
 * <p>
 * Even bot users receive this delightful event via Bot User subscription, when joining a channel.
 * <p>
 * https://api.slack.com/events/member_joined_channel
 */
public class MemberJoinedChannelEvent implements Event {

    public static final String TYPE_NAME = "member_joined_channel";

    private final String type = TYPE_NAME;
    private String user;
    private String channel;
    private String channelType;
    private String team;
    private String inviter;

    public MemberJoinedChannelEvent() {
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

    public String getChannelType() {
        return this.channelType;
    }

    public String getTeam() {
        return this.team;
    }

    public String getInviter() {
        return this.inviter;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public void setChannelType(String channelType) {
        this.channelType = channelType;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public void setInviter(String inviter) {
        this.inviter = inviter;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof MemberJoinedChannelEvent)) return false;
        final MemberJoinedChannelEvent other = (MemberJoinedChannelEvent) o;
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
        final Object this$channelType = this.getChannelType();
        final Object other$channelType = other.getChannelType();
        if (this$channelType == null ? other$channelType != null : !this$channelType.equals(other$channelType))
            return false;
        final Object this$team = this.getTeam();
        final Object other$team = other.getTeam();
        if (this$team == null ? other$team != null : !this$team.equals(other$team)) return false;
        final Object this$inviter = this.getInviter();
        final Object other$inviter = other.getInviter();
        if (this$inviter == null ? other$inviter != null : !this$inviter.equals(other$inviter)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof MemberJoinedChannelEvent;
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
        final Object $channelType = this.getChannelType();
        result = result * PRIME + ($channelType == null ? 43 : $channelType.hashCode());
        final Object $team = this.getTeam();
        result = result * PRIME + ($team == null ? 43 : $team.hashCode());
        final Object $inviter = this.getInviter();
        result = result * PRIME + ($inviter == null ? 43 : $inviter.hashCode());
        return result;
    }

    public String toString() {
        return "MemberJoinedChannelEvent(type=" + this.getType() + ", user=" + this.getUser() + ", channel=" + this.getChannel() + ", channelType=" + this.getChannelType() + ", team=" + this.getTeam() + ", inviter=" + this.getInviter() + ")";
    }
}