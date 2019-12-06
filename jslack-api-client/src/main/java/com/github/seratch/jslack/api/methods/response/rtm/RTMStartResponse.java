package com.github.seratch.jslack.api.methods.response.rtm;

import com.github.seratch.jslack.api.methods.SlackApiResponse;
import com.github.seratch.jslack.api.model.*;

import java.util.List;

/**
 * @see <a href="https://api.slack.com/methods/rtm.start">rtm.start</a>
 */
public class RTMStartResponse implements SlackApiResponse {

    private boolean ok;
    private String warning;
    private String error;
    private String needed;
    private String provided;

    private String url;
    private User self;
    private Team team;
    private List<User> users;
    private Prefs prefs;
    private List<Channel> channels;
    private List<Group> groups;
    private List<Im> ims;

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

    public List<User> getUsers() {
        return this.users;
    }

    public Prefs getPrefs() {
        return this.prefs;
    }

    public List<Channel> getChannels() {
        return this.channels;
    }

    public List<Group> getGroups() {
        return this.groups;
    }

    public List<Im> getIms() {
        return this.ims;
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

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public void setPrefs(Prefs prefs) {
        this.prefs = prefs;
    }

    public void setChannels(List<Channel> channels) {
        this.channels = channels;
    }

    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }

    public void setIms(List<Im> ims) {
        this.ims = ims;
    }

    public static class Prefs {
        // TODO
    }
}
