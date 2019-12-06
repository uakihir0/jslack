package com.github.seratch.jslack.api.methods.response.team.profile;

import com.github.seratch.jslack.api.methods.SlackApiResponse;
import com.github.seratch.jslack.api.model.Team;

import java.util.List;

public class TeamProfileGetResponse implements SlackApiResponse {

    private boolean ok;
    private String warning;
    private String error;
    private String needed;
    private String provided;

    private Profiles profile;

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

    public void setNeeded(String needed) {
        this.needed = needed;
    }

    public void setProvided(String provided) {
        this.provided = provided;
    }

    public void setProfile(Profiles profile) {
        this.profile = profile;
    }

    public static class Profiles {
        private List<Team.Profile> fields;

        public List<Team.Profile> getFields() {
            return this.fields;
        }

        public void setFields(List<Team.Profile> fields) {
            this.fields = fields;
        }
    }
}