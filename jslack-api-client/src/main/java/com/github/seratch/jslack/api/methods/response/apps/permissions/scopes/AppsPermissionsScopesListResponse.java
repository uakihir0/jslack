package com.github.seratch.jslack.api.methods.response.apps.permissions.scopes;

import com.github.seratch.jslack.api.methods.SlackApiResponse;

import java.util.List;

public class AppsPermissionsScopesListResponse implements SlackApiResponse {

    private boolean ok;
    private String warning;
    private String error;
    private String needed;
    private String provided;

    private List<Scope> scopes;

    public AppsPermissionsScopesListResponse() {
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

    public List<Scope> getScopes() {
        return this.scopes;
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

    public void setScopes(List<Scope> scopes) {
        this.scopes = scopes;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof AppsPermissionsScopesListResponse))
            return false;
        final AppsPermissionsScopesListResponse other = (AppsPermissionsScopesListResponse) o;
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
        final Object this$scopes = this.getScopes();
        final Object other$scopes = other.getScopes();
        if (this$scopes == null ? other$scopes != null : !this$scopes.equals(other$scopes)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof AppsPermissionsScopesListResponse;
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
        final Object $scopes = this.getScopes();
        result = result * PRIME + ($scopes == null ? 43 : $scopes.hashCode());
        return result;
    }

    public String toString() {
        return "AppsPermissionsScopesListResponse(ok=" + this.isOk() + ", warning=" + this.getWarning() + ", error=" + this.getError() + ", needed=" + this.getNeeded() + ", provided=" + this.getProvided() + ", scopes=" + this.getScopes() + ")";
    }

    public static class Scope {
        private List<String> appHome;
        private List<String> team;
        private List<String> channel;
        private List<String> group;
        private List<String> mpim;
        private List<String> im;
        private List<String> user;

        public Scope() {
        }

        public List<String> getAppHome() {
            return this.appHome;
        }

        public List<String> getTeam() {
            return this.team;
        }

        public List<String> getChannel() {
            return this.channel;
        }

        public List<String> getGroup() {
            return this.group;
        }

        public List<String> getMpim() {
            return this.mpim;
        }

        public List<String> getIm() {
            return this.im;
        }

        public List<String> getUser() {
            return this.user;
        }

        public void setAppHome(List<String> appHome) {
            this.appHome = appHome;
        }

        public void setTeam(List<String> team) {
            this.team = team;
        }

        public void setChannel(List<String> channel) {
            this.channel = channel;
        }

        public void setGroup(List<String> group) {
            this.group = group;
        }

        public void setMpim(List<String> mpim) {
            this.mpim = mpim;
        }

        public void setIm(List<String> im) {
            this.im = im;
        }

        public void setUser(List<String> user) {
            this.user = user;
        }

        public boolean equals(final Object o) {
            if (o == this) return true;
            if (!(o instanceof Scope))
                return false;
            final Scope other = (Scope) o;
            if (!other.canEqual((Object) this)) return false;
            final Object this$appHome = this.getAppHome();
            final Object other$appHome = other.getAppHome();
            if (this$appHome == null ? other$appHome != null : !this$appHome.equals(other$appHome)) return false;
            final Object this$team = this.getTeam();
            final Object other$team = other.getTeam();
            if (this$team == null ? other$team != null : !this$team.equals(other$team)) return false;
            final Object this$channel = this.getChannel();
            final Object other$channel = other.getChannel();
            if (this$channel == null ? other$channel != null : !this$channel.equals(other$channel)) return false;
            final Object this$group = this.getGroup();
            final Object other$group = other.getGroup();
            if (this$group == null ? other$group != null : !this$group.equals(other$group)) return false;
            final Object this$mpim = this.getMpim();
            final Object other$mpim = other.getMpim();
            if (this$mpim == null ? other$mpim != null : !this$mpim.equals(other$mpim)) return false;
            final Object this$im = this.getIm();
            final Object other$im = other.getIm();
            if (this$im == null ? other$im != null : !this$im.equals(other$im)) return false;
            final Object this$user = this.getUser();
            final Object other$user = other.getUser();
            if (this$user == null ? other$user != null : !this$user.equals(other$user)) return false;
            return true;
        }

        protected boolean canEqual(final Object other) {
            return other instanceof Scope;
        }

        public int hashCode() {
            final int PRIME = 59;
            int result = 1;
            final Object $appHome = this.getAppHome();
            result = result * PRIME + ($appHome == null ? 43 : $appHome.hashCode());
            final Object $team = this.getTeam();
            result = result * PRIME + ($team == null ? 43 : $team.hashCode());
            final Object $channel = this.getChannel();
            result = result * PRIME + ($channel == null ? 43 : $channel.hashCode());
            final Object $group = this.getGroup();
            result = result * PRIME + ($group == null ? 43 : $group.hashCode());
            final Object $mpim = this.getMpim();
            result = result * PRIME + ($mpim == null ? 43 : $mpim.hashCode());
            final Object $im = this.getIm();
            result = result * PRIME + ($im == null ? 43 : $im.hashCode());
            final Object $user = this.getUser();
            result = result * PRIME + ($user == null ? 43 : $user.hashCode());
            return result;
        }

        public String toString() {
            return "AppsPermissionsScopesListResponse.Scope(appHome=" + this.getAppHome() + ", team=" + this.getTeam() + ", channel=" + this.getChannel() + ", group=" + this.getGroup() + ", mpim=" + this.getMpim() + ", im=" + this.getIm() + ", user=" + this.getUser() + ")";
        }
    }

}