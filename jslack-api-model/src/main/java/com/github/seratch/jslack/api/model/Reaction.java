package com.github.seratch.jslack.api.model;

import java.util.List;

/**
 * https://api.slack.com/methods/reactions.get
 */
public class Reaction {

    private String name;
    private Integer count;
    private List<String> users;
    private String url;

    public Reaction(String name, Integer count, List<String> users, String url) {
        this.name = name;
        this.count = count;
        this.users = users;
        this.url = url;
    }

    public Reaction() {
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

    public String getUrl() {
        return this.url;
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

    public void setUrl(String url) {
        this.url = url;
    }

    public static class ReactionBuilder {
        private String name;
        private Integer count;
        private List<String> users;
        private String url;

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

        public Reaction.ReactionBuilder url(String url) {
            this.url = url;
            return this;
        }

        public Reaction build() {
            return new Reaction(name, count, users, url);
        }

        public String toString() {
            return "Reaction.ReactionBuilder(name=" + this.name + ", count=" + this.count + ", users=" + this.users + ", url=" + this.url + ")";
        }
    }
}