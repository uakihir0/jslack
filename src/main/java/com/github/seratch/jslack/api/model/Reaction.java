package com.github.seratch.jslack.api.model;

import java.util.List;

/**
 * https://api.slack.com/methods/reactions.get
 */
public class Reaction {

    private String name;
    private Integer count;
    private List<String> users;

    Reaction(String name, Integer count, List<String> users) {
        this.name = name;
        this.count = count;
        this.users = users;
    }

    public static ReactionBuilder builder() {
        return new ReactionBuilder();
    }

    public String getName() {
        return this.name;
    }

    public Integer getCount() {
        return this.count;
    }

    public List<String> getUsers() {
        return this.users;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public void setUsers(List<String> users) {
        this.users = users;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof Reaction)) return false;
        final Reaction other = (Reaction) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$name = this.getName();
        final Object other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
        final Object this$count = this.getCount();
        final Object other$count = other.getCount();
        if (this$count == null ? other$count != null : !this$count.equals(other$count)) return false;
        final Object this$users = this.getUsers();
        final Object other$users = other.getUsers();
        if (this$users == null ? other$users != null : !this$users.equals(other$users)) return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $name = this.getName();
        result = result * PRIME + ($name == null ? 43 : $name.hashCode());
        final Object $count = this.getCount();
        result = result * PRIME + ($count == null ? 43 : $count.hashCode());
        final Object $users = this.getUsers();
        result = result * PRIME + ($users == null ? 43 : $users.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof Reaction;
    }

    public String toString() {
        return "Reaction(name=" + this.getName() + ", count=" + this.getCount() + ", users=" + this.getUsers() + ")";
    }

    public static class ReactionBuilder {
        private String name;
        private Integer count;
        private List<String> users;

        ReactionBuilder() {
        }

        public Reaction.ReactionBuilder name(String name) {
            this.name = name;
            return this;
        }

        public Reaction.ReactionBuilder count(Integer count) {
            this.count = count;
            return this;
        }

        public Reaction.ReactionBuilder users(List<String> users) {
            this.users = users;
            return this;
        }

        public Reaction build() {
            return new Reaction(name, count, users);
        }

        public String toString() {
            return "Reaction.ReactionBuilder(name=" + this.name + ", count=" + this.count + ", users=" + this.users + ")";
        }
    }
}