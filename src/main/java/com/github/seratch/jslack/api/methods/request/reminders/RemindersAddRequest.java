package com.github.seratch.jslack.api.methods.request.reminders;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

public class RemindersAddRequest implements SlackApiRequest {

    private String token;
    private String text;
    private String time;
    private String user;

    @java.beans.ConstructorProperties({"token", "text", "time", "user"})
    RemindersAddRequest(String token, String text, String time, String user) {
        this.token = token;
        this.text = text;
        this.time = time;
        this.user = user;
    }

    public static RemindersAddRequestBuilder builder() {
        return new RemindersAddRequestBuilder();
    }

    public String getToken() {
        return this.token;
    }

    public String getText() {
        return this.text;
    }

    public String getTime() {
        return this.time;
    }

    public String getUser() {
        return this.user;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof RemindersAddRequest)) return false;
        final RemindersAddRequest other = (RemindersAddRequest) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$token = this.getToken();
        final Object other$token = other.getToken();
        if (this$token == null ? other$token != null : !this$token.equals(other$token)) return false;
        final Object this$text = this.getText();
        final Object other$text = other.getText();
        if (this$text == null ? other$text != null : !this$text.equals(other$text)) return false;
        final Object this$time = this.getTime();
        final Object other$time = other.getTime();
        if (this$time == null ? other$time != null : !this$time.equals(other$time)) return false;
        final Object this$user = this.getUser();
        final Object other$user = other.getUser();
        if (this$user == null ? other$user != null : !this$user.equals(other$user)) return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $token = this.getToken();
        result = result * PRIME + ($token == null ? 43 : $token.hashCode());
        final Object $text = this.getText();
        result = result * PRIME + ($text == null ? 43 : $text.hashCode());
        final Object $time = this.getTime();
        result = result * PRIME + ($time == null ? 43 : $time.hashCode());
        final Object $user = this.getUser();
        result = result * PRIME + ($user == null ? 43 : $user.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof RemindersAddRequest;
    }

    public String toString() {
        return "RemindersAddRequest(token=" + this.getToken() + ", text=" + this.getText() + ", time=" + this.getTime() + ", user=" + this.getUser() + ")";
    }

    public static class RemindersAddRequestBuilder {
        private String token;
        private String text;
        private String time;
        private String user;

        RemindersAddRequestBuilder() {
        }

        public RemindersAddRequest.RemindersAddRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public RemindersAddRequest.RemindersAddRequestBuilder text(String text) {
            this.text = text;
            return this;
        }

        public RemindersAddRequest.RemindersAddRequestBuilder time(String time) {
            this.time = time;
            return this;
        }

        public RemindersAddRequest.RemindersAddRequestBuilder user(String user) {
            this.user = user;
            return this;
        }

        public RemindersAddRequest build() {
            return new RemindersAddRequest(token, text, time, user);
        }

        public String toString() {
            return "RemindersAddRequest.RemindersAddRequestBuilder(token=" + this.token + ", text=" + this.text + ", time=" + this.time + ", user=" + this.user + ")";
        }
    }
}