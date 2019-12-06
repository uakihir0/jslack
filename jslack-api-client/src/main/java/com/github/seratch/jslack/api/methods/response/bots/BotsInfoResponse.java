package com.github.seratch.jslack.api.methods.response.bots;

import com.github.seratch.jslack.api.methods.SlackApiResponse;
import com.github.seratch.jslack.api.model.BotIcons;

public class BotsInfoResponse implements SlackApiResponse {

    public boolean isOk() {
        return this.ok;
    }

    public String getWarning() {
        return this.warning;
    }

    public String getError() {
        return this.error;
    }

    public String getNeeded() {
        return this.needed;
    }

    public String getProvided() {
        return this.provided;
    }

    public Bot getBot() {
        return this.bot;
    }

    public void setOk(boolean ok) {
        this.ok = ok;
    }

    public void setWarning(String warning) {
        this.warning = warning;
    }

    public void setError(String error) {
        this.error = error;
    }

    public void setNeeded(String needed) {
        this.needed = needed;
    }

    public void setProvided(String provided) {
        this.provided = provided;
    }

    public void setBot(Bot bot) {
        this.bot = bot;
    }

    public static class Bot {
        private String id;
        private String appId;
        private String userId;
        private String name;
        private boolean deleted;
        private Integer updated;
        private BotIcons icons;

        public String getId() {
            return this.id;
        }

        public String getAppId() {
            return this.appId;
        }

        public String getUserId() {
            return this.userId;
        }

        public String getName() {
            return this.name;
        }

        public boolean isDeleted() {
            return this.deleted;
        }

        public Integer getUpdated() {
            return this.updated;
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

        public void setUserId(String userId) {
            this.userId = userId;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setDeleted(boolean deleted) {
            this.deleted = deleted;
        }

        public void setUpdated(Integer updated) {
            this.updated = updated;
        }

        public void setIcons(BotIcons icons) {
            this.icons = icons;
        }
    }

    private boolean ok;
    private String warning;
    private String error;
    private String needed;
    private String provided;

    private Bot bot;
}