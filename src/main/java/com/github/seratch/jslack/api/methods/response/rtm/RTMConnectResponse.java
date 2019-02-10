package com.github.seratch.jslack.api.methods.response.rtm;

import com.github.seratch.jslack.api.methods.SlackApiResponse;
import com.github.seratch.jslack.api.model.Team;
import com.github.seratch.jslack.api.model.User;

/**
 * @see <a href="https://api.slack.com/methods/rtm.connect">rtm.connect</a>
 */
public class RTMConnectResponse implements SlackApiResponse {

    private boolean ok;
    private String warning;
    private String error;

    private String url;
    private User self;
    private Team team;

    public RTMConnectResponse() {
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

    public String getUrl() {
        return this.url;
    }

    public User getSelf() {
        return this.self;
    }

    public Team getTeam() {
        return this.team;
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

    public void setUrl(String url) {
        this.url = url;
    }

    public void setSelf(User self) {
        this.self = self;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof RTMConnectResponse)) return false;
        final RTMConnectResponse other = (RTMConnectResponse) o;
        if (!other.canEqual((Object) this)) return false;
        if (this.isOk() != other.isOk()) return false;
        final Object this$warning = this.getWarning();
        final Object other$warning = other.getWarning();
        if (this$warning == null ? other$warning != null : !this$warning.equals(other$warning)) return false;
        final Object this$error = this.getError();
        final Object other$error = other.getError();
        if (this$error == null ? other$error != null : !this$error.equals(other$error)) return false;
        final Object this$url = this.getUrl();
        final Object other$url = other.getUrl();
        if (this$url == null ? other$url != null : !this$url.equals(other$url)) return false;
        final Object this$self = this.getSelf();
        final Object other$self = other.getSelf();
        if (this$self == null ? other$self != null : !this$self.equals(other$self)) return false;
        final Object this$team = this.getTeam();
        final Object other$team = other.getTeam();
        if (this$team == null ? other$team != null : !this$team.equals(other$team)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof RTMConnectResponse;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = result * PRIME + (this.isOk() ? 79 : 97);
        final Object $warning = this.getWarning();
        result = result * PRIME + ($warning == null ? 43 : $warning.hashCode());
        final Object $error = this.getError();
        result = result * PRIME + ($error == null ? 43 : $error.hashCode());
        final Object $url = this.getUrl();
        result = result * PRIME + ($url == null ? 43 : $url.hashCode());
        final Object $self = this.getSelf();
        result = result * PRIME + ($self == null ? 43 : $self.hashCode());
        final Object $team = this.getTeam();
        result = result * PRIME + ($team == null ? 43 : $team.hashCode());
        return result;
    }

    public String toString() {
        return "RTMConnectResponse(ok=" + this.isOk() + ", warning=" + this.getWarning() + ", error=" + this.getError() + ", url=" + this.getUrl() + ", self=" + this.getSelf() + ", team=" + this.getTeam() + ")";
    }
}
