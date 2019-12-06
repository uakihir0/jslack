package com.github.seratch.jslack.api.model;

/**
 * https://api.slack.com/methods/reminders.add
 */
public class Reminder {

    private String id;
    private String creator;
    private String user;
    private String text;
    private boolean recurring;
    private Integer time;
    private Integer completeTs;

    public Reminder(String id, String creator, String user, String text, boolean recurring, Integer time, Integer completeTs) {
        this.id = id;
        this.creator = creator;
        this.user = user;
        this.text = text;
        this.recurring = recurring;
        this.time = time;
        this.completeTs = completeTs;
    }

    public Reminder() {
    }

    public static ReminderBuilder builder() {
        return new ReminderBuilder();
    }

    public String getId() {
        return this.id;
    }

    public String getCreator() {
        return this.creator;
    }

    public String getUser() {
        return this.user;
    }

    public String getText() {
        return this.text;
    }

    public boolean isRecurring() {
        return this.recurring;
    }

    public Integer getTime() {
        return this.time;
    }

    public Integer getCompleteTs() {
        return this.completeTs;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setRecurring(boolean recurring) {
        this.recurring = recurring;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    public void setCompleteTs(Integer completeTs) {
        this.completeTs = completeTs;
    }

    public static class ReminderBuilder {
        private String id;
        private String creator;
        private String user;
        private String text;
        private boolean recurring;
        private Integer time;
        private Integer completeTs;

        ReminderBuilder() {
        }

        public Reminder.ReminderBuilder id(String id) {
            this.id = id;
            return this;
        }

        public Reminder.ReminderBuilder creator(String creator) {
            this.creator = creator;
            return this;
        }

        public Reminder.ReminderBuilder user(String user) {
            this.user = user;
            return this;
        }

        public Reminder.ReminderBuilder text(String text) {
            this.text = text;
            return this;
        }

        public Reminder.ReminderBuilder recurring(boolean recurring) {
            this.recurring = recurring;
            return this;
        }

        public Reminder.ReminderBuilder time(Integer time) {
            this.time = time;
            return this;
        }

        public Reminder.ReminderBuilder completeTs(Integer completeTs) {
            this.completeTs = completeTs;
            return this;
        }

        public Reminder build() {
            return new Reminder(id, creator, user, text, recurring, time, completeTs);
        }

        public String toString() {
            return "Reminder.ReminderBuilder(id=" + this.id + ", creator=" + this.creator + ", user=" + this.user + ", text=" + this.text + ", recurring=" + this.recurring + ", time=" + this.time + ", completeTs=" + this.completeTs + ")";
        }
    }
}