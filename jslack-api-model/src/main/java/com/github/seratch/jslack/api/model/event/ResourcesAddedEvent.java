package com.github.seratch.jslack.api.model.event;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Subscribe to this event to receive deliveries as users install your Slack app,
 * add your app to channels and conversations, or approve your app for additional permissions and resources.
 * <p>
 * See Permissions API for further detail.
 * <p>
 * https://api.slack.com/events/resources_added
 */
@Getter
@Setter
public class ResourcesAddedEvent implements Event {

    public static final String TYPE_NAME = "resources_added";

    private final String type = TYPE_NAME;
    private List<ResourceItem> resources;

    @Getter
@Setter
    public static class ResourceItem {
        private Resource resource;
        private List<String> scopes;
    }

    @Getter
@Setter
    public static class Resource {
        private String type;
        private Grant grant;
    }

    @Getter
@Setter
    public static class Grant {
        private String type;
        private String resourceId;
    }

}