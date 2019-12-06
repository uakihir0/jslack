package com.github.seratch.jslack.api.methods.response.channels;

import com.github.seratch.jslack.api.methods.SlackApiResponse;
import com.github.seratch.jslack.api.model.Message;

import java.util.List;

public class ChannelsHistoryResponse implements SlackApiResponse {

    private boolean ok;
    private String warning;
    private String error;
    private String needed;
    private String provided;

    private String latest;
    private List<Message> messages;
    private boolean hasMore;
    private String channelActionsTs;
    private Integer channelActionsCount;

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

    public String getLatest() {
        return this.latest;
    }

    public List<Message> getMessages() {
        return this.messages;
    }

    public boolean isHasMore() {
        return this.hasMore;
    }

    public String getChannelActionsTs() {
        return this.channelActionsTs;
    }

    public Integer getChannelActionsCount() {
        return this.channelActionsCount;
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

    public void setLatest(String latest) {
        this.latest = latest;
    }

    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }

    public void setHasMore(boolean hasMore) {
        this.hasMore = hasMore;
    }

    public void setChannelActionsTs(String channelActionsTs) {
        this.channelActionsTs = channelActionsTs;
    }

    public void setChannelActionsCount(Integer channelActionsCount) {
        this.channelActionsCount = channelActionsCount;
    }
}
