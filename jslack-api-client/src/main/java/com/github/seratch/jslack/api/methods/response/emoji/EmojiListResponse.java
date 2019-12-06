package com.github.seratch.jslack.api.methods.response.emoji;

import com.github.seratch.jslack.api.methods.SlackApiResponse;

import java.util.Map;

public class EmojiListResponse implements SlackApiResponse {

    private boolean ok;
    private String warning;
    private String error;
    private String needed;
    private String provided;

    private Map<String, String> emoji;
    private String cacheTs;

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

    public Map<String, String> getEmoji() {
        return this.emoji;
    }

    public String getCacheTs() {
        return this.cacheTs;
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

    public void setEmoji(Map<String, String> emoji) {
        this.emoji = emoji;
    }

    public void setCacheTs(String cacheTs) {
        this.cacheTs = cacheTs;
    }
}