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

    public static class Link {
        private String domain;
        private String url;

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
    }
}