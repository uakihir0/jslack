package com.github.seratch.jslack.api.methods.response.users;

import com.github.seratch.jslack.api.methods.SlackApiResponse;
import com.google.gson.annotations.SerializedName;

public class UsersIdentityResponse implements SlackApiResponse {

    private boolean ok;
    private String warning;
    private String error;

    private User user;
    private Team team;

    public UsersIdentityResponse() {
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

    public void setUser(User user) {
        this.user = user;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof UsersIdentityResponse)) return false;
        final UsersIdentityResponse other = (UsersIdentityResponse) o;
        if (!other.canEqual((Object) this)) return false;
        if (this.isOk() != other.isOk()) return false;
        final Object this$warning = this.getWarning();
        final Object other$warning = other.getWarning();
        if (this$warning == null ? other$warning != null : !this$warning.equals(other$warning)) return false;
        final Object this$error = this.getError();
        final Object other$error = other.getError();
        if (this$error == null ? other$error != null : !this$error.equals(other$error)) return false;
        final Object this$user = this.getUser();
        final Object other$user = other.getUser();
        if (this$user == null ? other$user != null : !this$user.equals(other$user)) return false;
        final Object this$team = this.getTeam();
        final Object other$team = other.getTeam();
        if (this$team == null ? other$team != null : !this$team.equals(other$team)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof UsersIdentityResponse;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = result * PRIME + (this.isOk() ? 79 : 97);
        final Object $warning = this.getWarning();
        result = result * PRIME + ($warning == null ? 43 : $warning.hashCode());
        final Object $error = this.getError();
        result = result * PRIME + ($error == null ? 43 : $error.hashCode());
        final Object $user = this.getUser();
        result = result * PRIME + ($user == null ? 43 : $user.hashCode());
        final Object $team = this.getTeam();
        result = result * PRIME + ($team == null ? 43 : $team.hashCode());
        return result;
    }

    public String toString() {
        return "UsersIdentityResponse(ok=" + this.isOk() + ", warning=" + this.getWarning() + ", error=" + this.getError() + ", user=" + this.getUser() + ", team=" + this.getTeam() + ")";
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

        public User() {
        }

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

        public boolean equals(final Object o) {
            if (o == this) return true;
            if (!(o instanceof User))
                return false;
            final User other = (User) o;
            if (!other.canEqual((Object) this)) return false;
            final Object this$name = this.getName();
            final Object other$name = other.getName();
            if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
            final Object this$id = this.getId();
            final Object other$id = other.getId();
            if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
            final Object this$email = this.getEmail();
            final Object other$email = other.getEmail();
            if (this$email == null ? other$email != null : !this$email.equals(other$email)) return false;
            final Object this$image24 = this.getImage24();
            final Object other$image24 = other.getImage24();
            if (this$image24 == null ? other$image24 != null : !this$image24.equals(other$image24)) return false;
            final Object this$image32 = this.getImage32();
            final Object other$image32 = other.getImage32();
            if (this$image32 == null ? other$image32 != null : !this$image32.equals(other$image32)) return false;
            final Object this$image48 = this.getImage48();
            final Object other$image48 = other.getImage48();
            if (this$image48 == null ? other$image48 != null : !this$image48.equals(other$image48)) return false;
            final Object this$image72 = this.getImage72();
            final Object other$image72 = other.getImage72();
            if (this$image72 == null ? other$image72 != null : !this$image72.equals(other$image72)) return false;
            final Object this$image192 = this.getImage192();
            final Object other$image192 = other.getImage192();
            if (this$image192 == null ? other$image192 != null : !this$image192.equals(other$image192)) return false;
            final Object this$image512 = this.getImage512();
            final Object other$image512 = other.getImage512();
            if (this$image512 == null ? other$image512 != null : !this$image512.equals(other$image512)) return false;
            return true;
        }

        protected boolean canEqual(final Object other) {
            return other instanceof User;
        }

        public int hashCode() {
            final int PRIME = 59;
            int result = 1;
            final Object $name = this.getName();
            result = result * PRIME + ($name == null ? 43 : $name.hashCode());
            final Object $id = this.getId();
            result = result * PRIME + ($id == null ? 43 : $id.hashCode());
            final Object $email = this.getEmail();
            result = result * PRIME + ($email == null ? 43 : $email.hashCode());
            final Object $image24 = this.getImage24();
            result = result * PRIME + ($image24 == null ? 43 : $image24.hashCode());
            final Object $image32 = this.getImage32();
            result = result * PRIME + ($image32 == null ? 43 : $image32.hashCode());
            final Object $image48 = this.getImage48();
            result = result * PRIME + ($image48 == null ? 43 : $image48.hashCode());
            final Object $image72 = this.getImage72();
            result = result * PRIME + ($image72 == null ? 43 : $image72.hashCode());
            final Object $image192 = this.getImage192();
            result = result * PRIME + ($image192 == null ? 43 : $image192.hashCode());
            final Object $image512 = this.getImage512();
            result = result * PRIME + ($image512 == null ? 43 : $image512.hashCode());
            return result;
        }

        public String toString() {
            return "UsersIdentityResponse.User(name=" + this.getName() + ", id=" + this.getId() + ", email=" + this.getEmail() + ", image24=" + this.getImage24() + ", image32=" + this.getImage32() + ", image48=" + this.getImage48() + ", image72=" + this.getImage72() + ", image192=" + this.getImage192() + ", image512=" + this.getImage512() + ")";
        }
    }

    public static class Team {
        private String name;
        private String id;

        public Team() {
        }

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

        public boolean equals(final Object o) {
            if (o == this) return true;
            if (!(o instanceof Team))
                return false;
            final Team other = (Team) o;
            if (!other.canEqual((Object) this)) return false;
            final Object this$name = this.getName();
            final Object other$name = other.getName();
            if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
            final Object this$id = this.getId();
            final Object other$id = other.getId();
            if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
            return true;
        }

        protected boolean canEqual(final Object other) {
            return other instanceof Team;
        }

        public int hashCode() {
            final int PRIME = 59;
            int result = 1;
            final Object $name = this.getName();
            result = result * PRIME + ($name == null ? 43 : $name.hashCode());
            final Object $id = this.getId();
            result = result * PRIME + ($id == null ? 43 : $id.hashCode());
            return result;
        }

        public String toString() {
            return "UsersIdentityResponse.Team(name=" + this.getName() + ", id=" + this.getId() + ")";
        }
    }
}
