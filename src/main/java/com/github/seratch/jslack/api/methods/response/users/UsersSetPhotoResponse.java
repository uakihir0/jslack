package com.github.seratch.jslack.api.methods.response.users;

import com.github.seratch.jslack.api.methods.SlackApiResponse;
import com.github.seratch.jslack.api.model.User;

public class UsersSetPhotoResponse implements SlackApiResponse {

    private boolean ok;
    private String warning;
    private String error;

    private User.Profile profile;

    public UsersSetPhotoResponse() {
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

    public User.Profile getProfile() {
        return this.profile;
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

    public void setProfile(User.Profile profile) {
        this.profile = profile;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof UsersSetPhotoResponse)) return false;
        final UsersSetPhotoResponse other = (UsersSetPhotoResponse) o;
        if (!other.canEqual((Object) this)) return false;
        if (this.isOk() != other.isOk()) return false;
        final Object this$warning = this.getWarning();
        final Object other$warning = other.getWarning();
        if (this$warning == null ? other$warning != null : !this$warning.equals(other$warning)) return false;
        final Object this$error = this.getError();
        final Object other$error = other.getError();
        if (this$error == null ? other$error != null : !this$error.equals(other$error)) return false;
        final Object this$profile = this.getProfile();
        final Object other$profile = other.getProfile();
        if (this$profile == null ? other$profile != null : !this$profile.equals(other$profile)) return false;
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
        final Object $profile = this.getProfile();
        result = result * PRIME + ($profile == null ? 43 : $profile.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof UsersSetPhotoResponse;
    }

    public String toString() {
        return "UsersSetPhotoResponse(ok=" + this.isOk() + ", warning=" + this.getWarning() + ", error=" + this.getError() + ", profile=" + this.getProfile() + ")";
    }
}
