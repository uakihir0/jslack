package com.github.seratch.jslack.api.model.event;

import com.github.seratch.jslack.api.model.BotIcons;

/**
 * The bot_changed event is sent to all connections for a workspace when an integration "bot" is updated.
 * Clients can use this to update their local list of bots.
 * <p>
 * If the bot belongs to a Slack app, the event will also include an app_id pointing to its parent app.
 * <p>
 * https://api.slack.com/events/bot_changed
 */
public class BotChangedEvent implements Event {

    public static final String TYPE_NAME = "bot_changed";

    private final String type = TYPE_NAME;
    private Bot bot;

    public String getType() {
        return this.type;
    }

    public Bot getBot() {
        return this.bot;
    }

    public void setBot(Bot bot) {
        this.bot = bot;
    }

    public static class Bot {
        private String id;
        private String appId;
        private String name;
        private BotIcons icons;

        public String getId() {
            return this.id;
        }

        public String getAppId() {
            return this.appId;
        }

        public String getName() {
            return this.name;
        }

        public BotIcons getIcons() {
            return this.icons;
        }

        public void setId(String id) {
            this.id = id;
        }

        public void setAppId(String appId) {
            this.appId = appId;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setIcons(BotIcons icons) {
            this.icons = icons;
        }
    }

}