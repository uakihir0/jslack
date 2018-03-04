package com.github.seratch.jslack.api.methods.response.team.profile;

import com.github.seratch.jslack.api.methods.SlackApiResponse;
import com.github.seratch.jslack.api.model.Team;

import java.util.List;

public class TeamProfileGetResponse implements SlackApiResponse {

    private boolean ok;
    private String warning;
    private String error;

    private Profiles profile;

    public TeamProfileGetResponse() {
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

    public Profiles getProfile() {
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

    public void setProfile(Profiles profile) {
        this.profile = profile;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof TeamProfileGetResponse)) return false;
        final TeamProfileGetResponse other = (TeamProfileGetResponse) o;
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
        return other instanceof TeamProfileGetResponse;
    }

    public String toString() {
        return "TeamProfileGetResponse(ok=" + this.isOk() + ", warning=" + this.getWarning() + ", error=" + this.getError() + ", profile=" + this.getProfile() + ")";
    }

    public static class Profiles {
        private List<Team.Profile> fields;

        public Profiles() {
        }

        public List<Team.Profile> getFields() {
            return this.fields;
        }

        public void setFields(List<Team.Profile> fields) {
            this.fields = fields;
        }

        public boolean equals(Object o) {
            if (o == this) return true;
            if (!(o instanceof Profiles)) return false;
            final Profiles other = (Profiles) o;
            if (!other.canEqual((Object) this)) return false;
            final Object this$fields = this.getFields();
            final Object other$fields = other.getFields();
            if (this$fields == null ? other$fields != null : !this$fields.equals(other$fields)) return false;
            return true;
        }

        public int hashCode() {
            final int PRIME = 59;
            int result = 1;
            final Object $fields = this.getFields();
            result = result * PRIME + ($fields == null ? 43 : $fields.hashCode());
            return result;
        }

        protected boolean canEqual(Object other) {
            return other instanceof Profiles;
        }

        public String toString() {
            return "TeamProfileGetResponse.Profiles(fields=" + this.getFields() + ")";
        }
    }
}