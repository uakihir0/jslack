package com.github.seratch.jslack.api.methods.response.users.profile;

import com.github.seratch.jslack.api.methods.SlackApiResponse;
import com.github.seratch.jslack.api.model.User;

public class UsersProfileSetResponse implements SlackApiResponse {

    private boolean ok;
    private String warning;
    private String error;
    private String needed;
    private String provided;

    private User.Profile profile;
    private String username;

    public UsersProfileSetResponse() {
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

    public User.Profile getProfile() {
        return this.profile;
    }

    public String getUsername() {
        return this.username;
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

    public void setProfile(User.Profile profile) {
        this.profile = profile;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof UsersProfileSetResponse))
            return false;
        final UsersProfileSetResponse other = (UsersProfileSetResponse) o;
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
        final Object this$profile = this.getProfile();
        final Object other$profile = other.getProfile();
        if (this$profile == null ? other$profile != null : !this$profile.equals(other$profile)) return false;
        final Object this$username = this.getUsername();
        final Object other$username = other.getUsername();
        if (this$username == null ? other$username != null : !this$username.equals(other$username)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof UsersProfileSetResponse;
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
        final Object $profile = this.getProfile();
        result = result * PRIME + ($profile == null ? 43 : $profile.hashCode());
        final Object $username = this.getUsername();
        result = result * PRIME + ($username == null ? 43 : $username.hashCode());
        return result;
    }

    public String toString() {
        return "UsersProfileSetResponse(ok=" + this.isOk() + ", warning=" + this.getWarning() + ", error=" + this.getError() + ", needed=" + this.getNeeded() + ", provided=" + this.getProvided() + ", profile=" + this.getProfile() + ", username=" + this.getUsername() + ")";
    }
}