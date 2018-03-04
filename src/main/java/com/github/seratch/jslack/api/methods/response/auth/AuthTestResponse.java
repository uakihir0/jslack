package com.github.seratch.jslack.api.methods.response.auth;

import com.github.seratch.jslack.api.methods.SlackApiResponse;

public class AuthTestResponse implements SlackApiResponse {

    private boolean ok;
    private String warning;
    private String error;

    private String url;
    private String team;
    private String user;
    private String teamId;
    private String userId;

    public AuthTestResponse() {
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

    public String getTeam() {
        return this.team;
    }

    public String getUser() {
        return this.user;
    }

    public String getTeamId() {
        return this.teamId;
    }

    public String getUserId() {
        return this.userId;
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

    public void setTeam(String team) {
        this.team = team;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setTeamId(String teamId) {
        this.teamId = teamId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof AuthTestResponse)) return false;
        final AuthTestResponse other = (AuthTestResponse) o;
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
        final Object this$team = this.getTeam();
        final Object other$team = other.getTeam();
        if (this$team == null ? other$team != null : !this$team.equals(other$team)) return false;
        final Object this$user = this.getUser();
        final Object other$user = other.getUser();
        if (this$user == null ? other$user != null : !this$user.equals(other$user)) return false;
        final Object this$teamId = this.getTeamId();
        final Object other$teamId = other.getTeamId();
        if (this$teamId == null ? other$teamId != null : !this$teamId.equals(other$teamId)) return false;
        final Object this$userId = this.getUserId();
        final Object other$userId = other.getUserId();
        if (this$userId == null ? other$userId != null : !this$userId.equals(other$userId)) return false;
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
        final Object $url = this.getUrl();
        result = result * PRIME + ($url == null ? 43 : $url.hashCode());
        final Object $team = this.getTeam();
        result = result * PRIME + ($team == null ? 43 : $team.hashCode());
        final Object $user = this.getUser();
        result = result * PRIME + ($user == null ? 43 : $user.hashCode());
        final Object $teamId = this.getTeamId();
        result = result * PRIME + ($teamId == null ? 43 : $teamId.hashCode());
        final Object $userId = this.getUserId();
        result = result * PRIME + ($userId == null ? 43 : $userId.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof AuthTestResponse;
    }

    public String toString() {
        return "AuthTestResponse(ok=" + this.isOk() + ", warning=" + this.getWarning() + ", error=" + this.getError() + ", url=" + this.getUrl() + ", team=" + this.getTeam() + ", user=" + this.getUser() + ", teamId=" + this.getTeamId() + ", userId=" + this.getUserId() + ")";
    }
}