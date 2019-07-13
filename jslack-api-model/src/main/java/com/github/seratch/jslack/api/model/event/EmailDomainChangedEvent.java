package com.github.seratch.jslack.api.model.event;

/**
 * The email_domain_changed event is sent to all connections for a workspace
 * when the email domain settings for a workspace change.
 * Most clients can ignore this event.
 * <p>
 * https://api.slack.com/events/email_domain_changed
 */
public class EmailDomainChangedEvent implements Event {

    public static final String TYPE_NAME = "email_domain_changed";

    private final String type = TYPE_NAME;
    private String emailDomain;
    private String eventTs;

    public EmailDomainChangedEvent() {
    }

    public String getType() {
        return this.type;
    }

    public String getEmailDomain() {
        return this.emailDomain;
    }

    public String getEventTs() {
        return this.eventTs;
    }

    public void setEmailDomain(String emailDomain) {
        this.emailDomain = emailDomain;
    }

    public void setEventTs(String eventTs) {
        this.eventTs = eventTs;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof EmailDomainChangedEvent)) return false;
        final EmailDomainChangedEvent other = (EmailDomainChangedEvent) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$type = this.getType();
        final Object other$type = other.getType();
        if (this$type == null ? other$type != null : !this$type.equals(other$type)) return false;
        final Object this$emailDomain = this.getEmailDomain();
        final Object other$emailDomain = other.getEmailDomain();
        if (this$emailDomain == null ? other$emailDomain != null : !this$emailDomain.equals(other$emailDomain))
            return false;
        final Object this$eventTs = this.getEventTs();
        final Object other$eventTs = other.getEventTs();
        if (this$eventTs == null ? other$eventTs != null : !this$eventTs.equals(other$eventTs)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof EmailDomainChangedEvent;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $type = this.getType();
        result = result * PRIME + ($type == null ? 43 : $type.hashCode());
        final Object $emailDomain = this.getEmailDomain();
        result = result * PRIME + ($emailDomain == null ? 43 : $emailDomain.hashCode());
        final Object $eventTs = this.getEventTs();
        result = result * PRIME + ($eventTs == null ? 43 : $eventTs.hashCode());
        return result;
    }

    public String toString() {
        return "EmailDomainChangedEvent(type=" + this.getType() + ", emailDomain=" + this.getEmailDomain() + ", eventTs=" + this.getEventTs() + ")";
    }
}