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

    public BotChangedEvent() {
    }

    public String getType() {
        return this.type;
    }

    public Bot getBot() {
        return this.bot;
    }

    public void setBot(Bot bot) {
        this.bot = bot;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof BotChangedEvent)) return false;
        final BotChangedEvent other = (BotChangedEvent) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$type = this.getType();
        final Object other$type = other.getType();
        if (this$type == null ? other$type != null : !this$type.equals(other$type)) return false;
        final Object this$bot = this.getBot();
        final Object other$bot = other.getBot();
        if (this$bot == null ? other$bot != null : !this$bot.equals(other$bot)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof BotChangedEvent;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $type = this.getType();
        result = result * PRIME + ($type == null ? 43 : $type.hashCode());
        final Object $bot = this.getBot();
        result = result * PRIME + ($bot == null ? 43 : $bot.hashCode());
        return result;
    }

    public String toString() {
        return "BotChangedEvent(type=" + this.getType() + ", bot=" + this.getBot() + ")";
    }

    public static class Bot {
        private String id;
        private String appId;
        private String name;
        private BotIcons icons;

        public Bot() {
        }

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

        public boolean equals(final Object o) {
            if (o == this) return true;
            if (!(o instanceof Bot)) return false;
            final Bot other = (Bot) o;
            if (!other.canEqual((Object) this)) return false;
            final Object this$id = this.getId();
            final Object other$id = other.getId();
            if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
            final Object this$appId = this.getAppId();
            final Object other$appId = other.getAppId();
            if (this$appId == null ? other$appId != null : !this$appId.equals(other$appId)) return false;
            final Object this$name = this.getName();
            final Object other$name = other.getName();
            if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
            final Object this$icons = this.getIcons();
            final Object other$icons = other.getIcons();
            if (this$icons == null ? other$icons != null : !this$icons.equals(other$icons)) return false;
            return true;
        }

        protected boolean canEqual(final Object other) {
            return other instanceof Bot;
        }

        public int hashCode() {
            final int PRIME = 59;
            int result = 1;
            final Object $id = this.getId();
            result = result * PRIME + ($id == null ? 43 : $id.hashCode());
            final Object $appId = this.getAppId();
            result = result * PRIME + ($appId == null ? 43 : $appId.hashCode());
            final Object $name = this.getName();
            result = result * PRIME + ($name == null ? 43 : $name.hashCode());
            final Object $icons = this.getIcons();
            result = result * PRIME + ($icons == null ? 43 : $icons.hashCode());
            return result;
        }

        public String toString() {
            return "BotChangedEvent.Bot(id=" + this.getId() + ", appId=" + this.getAppId() + ", name=" + this.getName() + ", icons=" + this.getIcons() + ")";
        }
    }

}