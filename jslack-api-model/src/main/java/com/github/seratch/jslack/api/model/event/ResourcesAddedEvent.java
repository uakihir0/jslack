package com.github.seratch.jslack.api.model.event;

import java.util.List;

/**
 * Subscribe to this event to receive deliveries as users install your Slack app,
 * add your app to channels and conversations, or approve your app for additional permissions and resources.
 * <p>
 * See Permissions API for further detail.
 * <p>
 * https://api.slack.com/events/resources_added
 */
public class ResourcesAddedEvent implements Event {

    public static final String TYPE_NAME = "resources_added";

    private final String type = TYPE_NAME;
    private List<ResourceItem> resources;

    public ResourcesAddedEvent() {
    }

    public String getType() {
        return this.type;
    }

    public List<ResourceItem> getResources() {
        return this.resources;
    }

    public void setResources(List<ResourceItem> resources) {
        this.resources = resources;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof ResourcesAddedEvent)) return false;
        final ResourcesAddedEvent other = (ResourcesAddedEvent) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$type = this.getType();
        final Object other$type = other.getType();
        if (this$type == null ? other$type != null : !this$type.equals(other$type)) return false;
        final Object this$resources = this.getResources();
        final Object other$resources = other.getResources();
        if (this$resources == null ? other$resources != null : !this$resources.equals(other$resources)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof ResourcesAddedEvent;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $type = this.getType();
        result = result * PRIME + ($type == null ? 43 : $type.hashCode());
        final Object $resources = this.getResources();
        result = result * PRIME + ($resources == null ? 43 : $resources.hashCode());
        return result;
    }

    public String toString() {
        return "ResourcesAddedEvent(type=" + this.getType() + ", resources=" + this.getResources() + ")";
    }

    public static class ResourceItem {
        private Resource resource;
        private List<String> scopes;

        public ResourceItem() {
        }

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

        public boolean equals(final Object o) {
            if (o == this) return true;
            if (!(o instanceof ResourceItem)) return false;
            final ResourceItem other = (ResourceItem) o;
            if (!other.canEqual((Object) this)) return false;
            final Object this$resource = this.getResource();
            final Object other$resource = other.getResource();
            if (this$resource == null ? other$resource != null : !this$resource.equals(other$resource)) return false;
            final Object this$scopes = this.getScopes();
            final Object other$scopes = other.getScopes();
            if (this$scopes == null ? other$scopes != null : !this$scopes.equals(other$scopes)) return false;
            return true;
        }

        protected boolean canEqual(final Object other) {
            return other instanceof ResourceItem;
        }

        public int hashCode() {
            final int PRIME = 59;
            int result = 1;
            final Object $resource = this.getResource();
            result = result * PRIME + ($resource == null ? 43 : $resource.hashCode());
            final Object $scopes = this.getScopes();
            result = result * PRIME + ($scopes == null ? 43 : $scopes.hashCode());
            return result;
        }

        public String toString() {
            return "ResourcesAddedEvent.ResourceItem(resource=" + this.getResource() + ", scopes=" + this.getScopes() + ")";
        }
    }

    public static class Resource {
        private String type;
        private Grant grant;

        public Resource() {
        }

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

        public boolean equals(final Object o) {
            if (o == this) return true;
            if (!(o instanceof Resource)) return false;
            final Resource other = (Resource) o;
            if (!other.canEqual((Object) this)) return false;
            final Object this$type = this.getType();
            final Object other$type = other.getType();
            if (this$type == null ? other$type != null : !this$type.equals(other$type)) return false;
            final Object this$grant = this.getGrant();
            final Object other$grant = other.getGrant();
            if (this$grant == null ? other$grant != null : !this$grant.equals(other$grant)) return false;
            return true;
        }

        protected boolean canEqual(final Object other) {
            return other instanceof Resource;
        }

        public int hashCode() {
            final int PRIME = 59;
            int result = 1;
            final Object $type = this.getType();
            result = result * PRIME + ($type == null ? 43 : $type.hashCode());
            final Object $grant = this.getGrant();
            result = result * PRIME + ($grant == null ? 43 : $grant.hashCode());
            return result;
        }

        public String toString() {
            return "ResourcesAddedEvent.Resource(type=" + this.getType() + ", grant=" + this.getGrant() + ")";
        }
    }

    public static class Grant {
        private String type;
        private String resourceId;

        public Grant() {
        }

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

        public boolean equals(final Object o) {
            if (o == this) return true;
            if (!(o instanceof Grant)) return false;
            final Grant other = (Grant) o;
            if (!other.canEqual((Object) this)) return false;
            final Object this$type = this.getType();
            final Object other$type = other.getType();
            if (this$type == null ? other$type != null : !this$type.equals(other$type)) return false;
            final Object this$resourceId = this.getResourceId();
            final Object other$resourceId = other.getResourceId();
            if (this$resourceId == null ? other$resourceId != null : !this$resourceId.equals(other$resourceId))
                return false;
            return true;
        }

        protected boolean canEqual(final Object other) {
            return other instanceof Grant;
        }

        public int hashCode() {
            final int PRIME = 59;
            int result = 1;
            final Object $type = this.getType();
            result = result * PRIME + ($type == null ? 43 : $type.hashCode());
            final Object $resourceId = this.getResourceId();
            result = result * PRIME + ($resourceId == null ? 43 : $resourceId.hashCode());
            return result;
        }

        public String toString() {
            return "ResourcesAddedEvent.Grant(type=" + this.getType() + ", resourceId=" + this.getResourceId() + ")";
        }
    }

}