package com.github.seratch.jslack.api.methods.response.users;

import com.github.seratch.jslack.api.methods.SlackApiResponse;
import com.google.gson.annotations.SerializedName;

public class UsersIdentityResponse implements SlackApiResponse {

    private boolean ok;
    private String warning;
    private String error;
    private String needed;
    private String provided;

    private User user;
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

    public User getUser() {
        return this.user;
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

    public void setUser(User user) {
        this.user = user;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public static class User {
        private String name;
        private String id;
        private String email;
        @SerializedName("image_24")
        private String image24;
        @SerializedName("image_32")
        private String image32;
        @SerializedName("image_48")
        private String image48;
        @SerializedName("image_72")
        private String image72;
        @SerializedName("image_192")
        private String image192;
        @SerializedName("image_512")
        private String image512;

        public String getName() {
            return this.name;
        }

        public String getId() {
            return this.id;
        }

        public String getEmail() {
            return this.email;
        }

        public String getImage24() {
            return this.image24;
        }

        public String getImage32() {
            return this.image32;
        }

        public String getImage48() {
            return this.image48;
        }

        public String getImage72() {
            return this.image72;
        }

        public String getImage192() {
            return this.image192;
        }

        public String getImage512() {
            return this.image512;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setId(String id) {
            this.id = id;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public void setImage24(String image24) {
            this.image24 = image24;
        }

        public void setImage32(String image32) {
            this.image32 = image32;
        }

        public void setImage48(String image48) {
            this.image48 = image48;
        }

        public void setImage72(String image72) {
            this.image72 = image72;
        }

        public void setImage192(String image192) {
            this.image192 = image192;
        }

        public void setImage512(String image512) {
            this.image512 = image512;
        }
    }

    public static class Team {
        private String name;
        private String id;

        public String getName() {
            return this.name;
        }

        public String getId() {
            return this.id;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setId(String id) {
            this.id = id;
        }
    }
}
