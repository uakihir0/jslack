package com.github.seratch.jslack.api.audit.response;

import com.github.seratch.jslack.api.audit.AuditApiResponse;
import com.github.seratch.jslack.api.model.ResponseMetadata;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class LogsResponse implements AuditApiResponse {
    private boolean ok;
    private String warning;
    private String error;
    private String needed;
    private String provided;

    private ResponseMetadata responseMetadata;

    private List<Entry> entries;

    @Getter
@Setter
    public static class Entry {
        private String id;
        private Integer dateCreate;
        private String action;
        private Actor actor;
        private Entity entity;
        private Context context;
        private Details details;
    }

    @Getter
@Setter
    public static class Actor {
        private String type;
        private User user;
    }

    @Getter
@Setter
    public static class User {
        private String id;
        private String name;
        private String email;
        private String team;
    }

    @Getter
@Setter
    public static class Entity {
        private String type;
        private App app;
        private User user;
        private Usergroup usergroup;
        private Workspace workspace;
        private Enterprise enterprise;
        private File file;
        private Channel channel;
    }

    @Getter
@Setter
    public static class App {
        private String id;
        private String name;
        @SerializedName("is_distributed")
        private Boolean distributed;
        @SerializedName("is_directory_approved")
        private Boolean directoryApproved;
        private List<String> scopes;
    }

    @Getter
@Setter
    public static class Usergroup {
        private String id;
        private String name;
    }

    @Getter
@Setter
    public static class Workspace {
        private String id;
        private String name;
        private String domain;
    }

    @Getter
@Setter
    public static class Enterprise {
        private String id;
        private String name;
        private String domain;
    }

    @Getter
@Setter
    public static class File {
        private String id;
        private String name;
        private String filetype;
        private String title;
    }

    @Getter
@Setter
    public static class Channel {
        private String id;
        private String name;
        private String privacy;
        @SerializedName("is_shared")
        private Boolean shared;
        @SerializedName("is_org_shared")
        private Boolean orgShared;
        private List<String> teamsSharedWith;
    }

    @Getter
@Setter
    public static class Context {
        private Location location;
        private String ua;
        private String ipAddress;
    }

    @Getter
@Setter
    public static class Location {
        private String type;
        private String id;
        private String name;
        private String domain;
    }

    @Getter
@Setter
    public static class Details {
        @SerializedName("is_internal_integration")
        private Boolean internalIntegration;
        private String appOwnerId;
        private List<String> newScopes;
        private List<String> previousScopes;
        private String type;
        private Inviter inviter;
        private String newValue;
        private String previousValue;
        private Kicker kicker;
        private String installerUserId;
        private Boolean appPreviouslyApproved;
        private List<String> oldScopes;
        private String name;
        private String botId;
        private List<Permission> permissions;
    }

    @Getter
@Setter
    public static class Inviter {
        private String type;
        private User user;
        private String id;
        private String name;
        private String email;
    }

    @Getter
@Setter
    public static class Kicker {
        private String id;
        private String name;
        private String email;
    }

    @Getter
@Setter
    public static class Permission {
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
        private WildCard wildcard;
    }

    @Getter
@Setter
    public static class WildCard {
        private String type;
    }

}
