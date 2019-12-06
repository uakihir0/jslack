package com.github.seratch.jslack.api.model.event;

import java.util.List;

/**
 * Subscribe to this event to receive deliveries as users uninstall your Slack app
 * and remove your app to channels &amp; conversations.
 * <p>
 * See Permissions API for further detail.
 * <p>
 * https://api.slack.com/events/resources_removed
 */
public class ResourcesRemovedEvent implements Event {

    public static final String TYPE_NAME = "resources_removed";

    private final String type = TYPE_NAME;
    private List<ResourceItem> resources;

    public String getType() {
        return this.type;
    }

    public List<ResourceItem> getResources() {
        return this.resources;
    }

    public void setResources(List<ResourceItem> resources) {
        this.resources = resources;
    }

    public static class ResourceItem {
        private Resource resource;
        private List<String> scopes;

        public Resource getResource() {
            return this.resource;
        }

        public List<String> getScopes() {
            return this.scopes;
        }

        public void setResource(Resource resource) {
            this.resource = resource;
        }

        public void setScopes(List<String> scopes) {
            this.scopes = scopes;
        }
    }

    public static class Resource {
        private String type;
        private Grant grant;

        public String getType() {
            return this.type;
        }

        public Grant getGrant() {
            return this.grant;
        }

        public void setType(String type) {
            this.type = type;
        }

        public void setGrant(Grant grant) {
            this.grant = grant;
        }
    }

    public static class Grant {
        private String type;
        private String resourceId;

        public String getType() {
            return this.type;
        }

        public String getResourceId() {
            return this.resourceId;
        }

        public void setType(String type) {
            this.type = type;
        }

        public void setResourceId(String resourceId) {
            this.resourceId = resourceId;
        }
    }

}