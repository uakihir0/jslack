package com.github.seratch.jslack.api.methods.response.channels;

import com.github.seratch.jslack.api.methods.SlackApiResponse;
import com.github.seratch.jslack.api.model.Channel;

import java.util.List;

public class ChannelsListResponse implements SlackApiResponse {

    private boolean ok;
    private String warning;
    private String error;

    private List<Channel> channels;

    public ChannelsListResponse() {
    }

    public boolean isOk() {
        return this.ok;
    }

    public String getWarning() {
        return this.warning;
    }

    public String getError() {
        return this.error;
    }

    public List<Channel> getChannels() {
        return this.channels;
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

    public void setChannels(List<Channel> channels) {
        this.channels = channels;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof ChannelsListResponse)) return false;
        final ChannelsListResponse other = (ChannelsListResponse) o;
        if (!other.canEqual((Object) this)) return false;
        if (this.isOk() != other.isOk()) return false;
        final Object this$warning = this.getWarning();
        final Object other$warning = other.getWarning();
        if (this$warning == null ? other$warning != null : !this$warning.equals(other$warning)) return false;
        final Object this$error = this.getError();
        final Object other$error = other.getError();
        if (this$error == null ? other$error != null : !this$error.equals(other$error)) return false;
        final Object this$channels = this.getChannels();
        final Object other$channels = other.getChannels();
        if (this$channels == null ? other$channels != null : !this$channels.equals(other$channels)) return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = result * PRIME + (this.isOk() ? 79 : 97);
        final Object $warning = this.getWarning();
        result = result * PRIME + ($warning == null ? 43 : $warning.hashCode());
        final Object $error = this.getError();
        result = result * PRIME + ($error == null ? 43 : $error.hashCode());
        final Object $channels = this.getChannels();
        result = result * PRIME + ($channels == null ? 43 : $channels.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof ChannelsListResponse;
    }

    public String toString() {
        return "ChannelsListResponse(ok=" + this.isOk() + ", warning=" + this.getWarning() + ", error=" + this.getError() + ", channels=" + this.getChannels() + ")";
    }
}
