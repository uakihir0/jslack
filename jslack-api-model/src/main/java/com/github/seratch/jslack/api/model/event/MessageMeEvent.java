package com.github.seratch.jslack.api.model.event;

/**
 * https://api.slack.com/events/message/me_message
 */
public class MessageMeEvent implements Event {

    public static final String TYPE_NAME = "message";
    public static final String SUBTYPE_NAME = "me_message";

    private final String type = TYPE_NAME;
    private final String subtype = SUBTYPE_NAME;
    private String channel;

    private String username;
    private String botId;

    private String text;

    private String eventTs;
    private String ts;
    private String channelType; // app_home, channel, group, im, mpim

    public String getType() {
        return this.type;
    }

    public String getSubtype() {
        return this.subtype;
    }

    public String getChannel() {
        return this.channel;
    }

    public String getUsername() {
        return this.username;
    }

    public String getBotId() {
        return this.botId;
    }

    public String getText() {
        return this.text;
    }

    public String getEventTs() {
        return this.eventTs;
    }

    public String getTs() {
        return this.ts;
    }

    public String getChannelType() {
        return this.channelType;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setBotId(String botId) {
        this.botId = botId;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setEventTs(String eventTs) {
        this.eventTs = eventTs;
    }

    public void setTs(String ts) {
        this.ts = ts;
    }

    public void setChannelType(String channelType) {
        this.channelType = channelType;
    }
}
