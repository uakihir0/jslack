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
    private String needed;
    private String provided;

    private String url;
    private User self;
    private Team team;

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

    public void setNeeded(String needed) {
        this.needed = needed;
    }

    public void setProvided(String provided) {
        this.provided = provided;
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
}
