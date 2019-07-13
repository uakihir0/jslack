package com.github.seratch.jslack.api.model.event;

import java.util.List;

/**
 * The thread_ts field only appears when the link was shared within a message thread.
 * <p>
 * https://api.slack.com/events/link_shared
 */
public class LinkSharedEvent implements Event {

    public static final String TYPE_NAME = "link_shared";

    private final String type = TYPE_NAME;
    private String channel;
    private String user;
    private String messageTs;
    private String threadTs;
    private List<Link> links;

    public LinkSharedEvent() {
    }

    public String getType() {
        return this.type;
    }

    public String getChannel() {
        return this.channel;
    }

    public String getUser() {
        return this.user;
    }

    public String getMessageTs() {
        return this.messageTs;
    }

    public String getThreadTs() {
        return this.threadTs;
    }

    public List<Link> getLinks() {
        return this.links;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setMessageTs(String messageTs) {
        this.messageTs = messageTs;
    }

    public void setThreadTs(String threadTs) {
        this.threadTs = threadTs;
    }

    public void setLinks(List<Link> links) {
        this.links = links;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof LinkSharedEvent)) return false;
        final LinkSharedEvent other = (LinkSharedEvent) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$type = this.getType();
        final Object other$type = other.getType();
        if (this$type == null ? other$type != null : !this$type.equals(other$type)) return false;
        final Object this$channel = this.getChannel();
        final Object other$channel = other.getChannel();
        if (this$channel == null ? other$channel != null : !this$channel.equals(other$channel)) return false;
        final Object this$user = this.getUser();
        final Object other$user = other.getUser();
        if (this$user == null ? other$user != null : !this$user.equals(other$user)) return false;
        final Object this$messageTs = this.getMessageTs();
        final Object other$messageTs = other.getMessageTs();
        if (this$messageTs == null ? other$messageTs != null : !this$messageTs.equals(other$messageTs)) return false;
        final Object this$threadTs = this.getThreadTs();
        final Object other$threadTs = other.getThreadTs();
        if (this$threadTs == null ? other$threadTs != null : !this$threadTs.equals(other$threadTs)) return false;
        final Object this$links = this.getLinks();
        final Object other$links = other.getLinks();
        if (this$links == null ? other$links != null : !this$links.equals(other$links)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof LinkSharedEvent;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $type = this.getType();
        result = result * PRIME + ($type == null ? 43 : $type.hashCode());
        final Object $channel = this.getChannel();
        result = result * PRIME + ($channel == null ? 43 : $channel.hashCode());
        final Object $user = this.getUser();
        result = result * PRIME + ($user == null ? 43 : $user.hashCode());
        final Object $messageTs = this.getMessageTs();
        result = result * PRIME + ($messageTs == null ? 43 : $messageTs.hashCode());
        final Object $threadTs = this.getThreadTs();
        result = result * PRIME + ($threadTs == null ? 43 : $threadTs.hashCode());
        final Object $links = this.getLinks();
        result = result * PRIME + ($links == null ? 43 : $links.hashCode());
        return result;
    }

    public String toString() {
        return "LinkSharedEvent(type=" + this.getType() + ", channel=" + this.getChannel() + ", user=" + this.getUser() + ", messageTs=" + this.getMessageTs() + ", threadTs=" + this.getThreadTs() + ", links=" + this.getLinks() + ")";
    }

    public static class Link {
        private String domain;
        private String url;

        public Link() {
        }

        public String getDomain() {
            return this.domain;
        }

        public String getUrl() {
            return this.url;
        }

        public void setDomain(String domain) {
            this.domain = domain;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public boolean equals(final Object o) {
            if (o == this) return true;
            if (!(o instanceof Link)) return false;
            final Link other = (Link) o;
            if (!other.canEqual((Object) this)) return false;
            final Object this$domain = this.getDomain();
            final Object other$domain = other.getDomain();
            if (this$domain == null ? other$domain != null : !this$domain.equals(other$domain)) return false;
            final Object this$url = this.getUrl();
            final Object other$url = other.getUrl();
            if (this$url == null ? other$url != null : !this$url.equals(other$url)) return false;
            return true;
        }

        protected boolean canEqual(final Object other) {
            return other instanceof Link;
        }

        public int hashCode() {
            final int PRIME = 59;
            int result = 1;
            final Object $domain = this.getDomain();
            result = result * PRIME + ($domain == null ? 43 : $domain.hashCode());
            final Object $url = this.getUrl();
            result = result * PRIME + ($url == null ? 43 : $url.hashCode());
            return result;
        }

        public String toString() {
            return "LinkSharedEvent.Link(domain=" + this.getDomain() + ", url=" + this.getUrl() + ")";
        }
    }
}