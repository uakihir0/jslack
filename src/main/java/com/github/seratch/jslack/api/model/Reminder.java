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

    @java.beans.ConstructorProperties({"id", "creator", "user", "text", "recurring", "time", "completeTs"})
    Reminder(String id, String creator, String user, String text, boolean recurring, Integer time, Integer completeTs) {
        this.id = id;
        this.creator = creator;
        this.user = user;
        this.text = text;
        this.recurring = recurring;
        this.time = time;
        this.completeTs = completeTs;
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

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Reminder)) return false;
        final Reminder other = (Reminder) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final Object this$creator = this.getCreator();
        final Object other$creator = other.getCreator();
        if (this$creator == null ? other$creator != null : !this$creator.equals(other$creator)) return false;
        final Object this$user = this.getUser();
        final Object other$user = other.getUser();
        if (this$user == null ? other$user != null : !this$user.equals(other$user)) return false;
        final Object this$text = this.getText();
        final Object other$text = other.getText();
        if (this$text == null ? other$text != null : !this$text.equals(other$text)) return false;
        if (this.isRecurring() != other.isRecurring()) return false;
        final Object this$time = this.getTime();
        final Object other$time = other.getTime();
        if (this$time == null ? other$time != null : !this$time.equals(other$time)) return false;
        final Object this$completeTs = this.getCompleteTs();
        final Object other$completeTs = other.getCompleteTs();
        if (this$completeTs == null ? other$completeTs != null : !this$completeTs.equals(other$completeTs))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Reminder;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final Object $creator = this.getCreator();
        result = result * PRIME + ($creator == null ? 43 : $creator.hashCode());
        final Object $user = this.getUser();
        result = result * PRIME + ($user == null ? 43 : $user.hashCode());
        final Object $text = this.getText();
        result = result * PRIME + ($text == null ? 43 : $text.hashCode());
        result = result * PRIME + (this.isRecurring() ? 79 : 97);
        final Object $time = this.getTime();
        result = result * PRIME + ($time == null ? 43 : $time.hashCode());
        final Object $completeTs = this.getCompleteTs();
        result = result * PRIME + ($completeTs == null ? 43 : $completeTs.hashCode());
        return result;
    }

    public String toString() {
        return "Reminder(id=" + this.getId() + ", creator=" + this.getCreator() + ", user=" + this.getUser() + ", text=" + this.getText() + ", recurring=" + this.isRecurring() + ", time=" + this.getTime() + ", completeTs=" + this.getCompleteTs() + ")";
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