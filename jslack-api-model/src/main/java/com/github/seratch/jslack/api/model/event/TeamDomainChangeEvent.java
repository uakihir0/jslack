package com.github.seratch.jslack.api.model.event;

/**
 * The team_domain_change event is sent to all connections for a workspace when the workspace domain changes.
 * <p>
 * Since the existing domain will continue to work (causing a redirect) until it is claimed by another workspace,
 * clients don't need to do anything special with this event. It is sent for the benefit of our web client,
 * which needs to reload when the domain changes.
 * <p>
 * https://api.slack.com/events/team_domain_change
 */
public class TeamDomainChangeEvent implements Event {

    public static final String TYPE_NAME = "team_domain_change";

    private final String type = TYPE_NAME;
    private String url;
    private String domain;

    public TeamDomainChangeEvent() {
    }

    public String getType() {
        return this.type;
    }

    public String getUrl() {
        return this.url;
    }

    public String getDomain() {
        return this.domain;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof TeamDomainChangeEvent)) return false;
        final TeamDomainChangeEvent other = (TeamDomainChangeEvent) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$type = this.getType();
        final Object other$type = other.getType();
        if (this$type == null ? other$type != null : !this$type.equals(other$type)) return false;
        final Object this$url = this.getUrl();
        final Object other$url = other.getUrl();
        if (this$url == null ? other$url != null : !this$url.equals(other$url)) return false;
        final Object this$domain = this.getDomain();
        final Object other$domain = other.getDomain();
        if (this$domain == null ? other$domain != null : !this$domain.equals(other$domain)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof TeamDomainChangeEvent;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $type = this.getType();
        result = result * PRIME + ($type == null ? 43 : $type.hashCode());
        final Object $url = this.getUrl();
        result = result * PRIME + ($url == null ? 43 : $url.hashCode());
        final Object $domain = this.getDomain();
        result = result * PRIME + ($domain == null ? 43 : $domain.hashCode());
        return result;
    }

    public String toString() {
        return "TeamDomainChangeEvent(type=" + this.getType() + ", url=" + this.getUrl() + ", domain=" + this.getDomain() + ")";
    }
}