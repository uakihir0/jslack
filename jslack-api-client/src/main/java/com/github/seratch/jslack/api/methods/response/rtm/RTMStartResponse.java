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

    public RTMStartResponse() {
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

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof RTMStartResponse)) return false;
        final RTMStartResponse other = (RTMStartResponse) o;
        if (!other.canEqual((Object) this)) return false;
        if (this.isOk() != other.isOk()) return false;
        final Object this$warning = this.getWarning();
        final Object other$warning = other.getWarning();
        if (this$warning == null ? other$warning != null : !this$warning.equals(other$warning)) return false;
        final Object this$error = this.getError();
        final Object other$error = other.getError();
        if (this$error == null ? other$error != null : !this$error.equals(other$error)) return false;
        final Object this$needed = this.getNeeded();
        final Object other$needed = other.getNeeded();
        if (this$needed == null ? other$needed != null : !this$needed.equals(other$needed)) return false;
        final Object this$provided = this.getProvided();
        final Object other$provided = other.getProvided();
        if (this$provided == null ? other$provided != null : !this$provided.equals(other$provided)) return false;
        final Object this$url = this.getUrl();
        final Object other$url = other.getUrl();
        if (this$url == null ? other$url != null : !this$url.equals(other$url)) return false;
        final Object this$self = this.getSelf();
        final Object other$self = other.getSelf();
        if (this$self == null ? other$self != null : !this$self.equals(other$self)) return false;
        final Object this$team = this.getTeam();
        final Object other$team = other.getTeam();
        if (this$team == null ? other$team != null : !this$team.equals(other$team)) return false;
        final Object this$users = this.getUsers();
        final Object other$users = other.getUsers();
        if (this$users == null ? other$users != null : !this$users.equals(other$users)) return false;
        final Object this$prefs = this.getPrefs();
        final Object other$prefs = other.getPrefs();
        if (this$prefs == null ? other$prefs != null : !this$prefs.equals(other$prefs)) return false;
        final Object this$channels = this.getChannels();
        final Object other$channels = other.getChannels();
        if (this$channels == null ? other$channels != null : !this$channels.equals(other$channels)) return false;
        final Object this$groups = this.getGroups();
        final Object other$groups = other.getGroups();
        if (this$groups == null ? other$groups != null : !this$groups.equals(other$groups)) return false;
        final Object this$ims = this.getIms();
        final Object other$ims = other.getIms();
        if (this$ims == null ? other$ims != null : !this$ims.equals(other$ims)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof RTMStartResponse;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = result * PRIME + (this.isOk() ? 79 : 97);
        final Object $warning = this.getWarning();
        result = result * PRIME + ($warning == null ? 43 : $warning.hashCode());
        final Object $error = this.getError();
        result = result * PRIME + ($error == null ? 43 : $error.hashCode());
        final Object $needed = this.getNeeded();
        result = result * PRIME + ($needed == null ? 43 : $needed.hashCode());
        final Object $provided = this.getProvided();
        result = result * PRIME + ($provided == null ? 43 : $provided.hashCode());
        final Object $url = this.getUrl();
        result = result * PRIME + ($url == null ? 43 : $url.hashCode());
        final Object $self = this.getSelf();
        result = result * PRIME + ($self == null ? 43 : $self.hashCode());
        final Object $team = this.getTeam();
        result = result * PRIME + ($team == null ? 43 : $team.hashCode());
        final Object $users = this.getUsers();
        result = result * PRIME + ($users == null ? 43 : $users.hashCode());
        final Object $prefs = this.getPrefs();
        result = result * PRIME + ($prefs == null ? 43 : $prefs.hashCode());
        final Object $channels = this.getChannels();
        result = result * PRIME + ($channels == null ? 43 : $channels.hashCode());
        final Object $groups = this.getGroups();
        result = result * PRIME + ($groups == null ? 43 : $groups.hashCode());
        final Object $ims = this.getIms();
        result = result * PRIME + ($ims == null ? 43 : $ims.hashCode());
        return result;
    }

    public String toString() {
        return "RTMStartResponse(ok=" + this.isOk() + ", warning=" + this.getWarning() + ", error=" + this.getError() + ", needed=" + this.getNeeded() + ", provided=" + this.getProvided() + ", url=" + this.getUrl() + ", self=" + this.getSelf() + ", team=" + this.getTeam() + ", users=" + this.getUsers() + ", prefs=" + this.getPrefs() + ", channels=" + this.getChannels() + ", groups=" + this.getGroups() + ", ims=" + this.getIms() + ")";
    }

    public static class Prefs {
        public Prefs() {
        }

        public boolean equals(final Object o) {
            if (o == this) return true;
            if (!(o instanceof Prefs)) return false;
            final Prefs other = (Prefs) o;
            if (!other.canEqual((Object) this)) return false;
            return true;
        }

        protected boolean canEqual(final Object other) {
            return other instanceof Prefs;
        }

        public int hashCode() {
            int result = 1;
            return result;
        }

        public String toString() {
            return "RTMStartResponse.Prefs()";
        }
        // TODO
    }
}
