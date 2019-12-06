package com.github.seratch.jslack.api.audit.response;

import com.github.seratch.jslack.api.audit.AuditApiResponse;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class SchemasResponse implements AuditApiResponse {
    private boolean ok;
    private String warning;
    private String error;
    private String needed;
    private String provided;

    private List<Schema> schemas;

    @Getter
@Setter
    public static class Schema {
        private String type;
        private Workspace workspace;
        private Enterprise enterprise;
        private User user;
        private File file;
        private Channel channel;
        private App app;
        private Message message;
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
    public static class User {
        private String id;
        private String name;
        private String email;
        private String team;
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
        private String isShared;
        private String isOrgShared;
        private String teamsSharedWith;
    }

    @Getter
@Setter
    public static class App {
        private String id;
        private String name;
        private String isWorkflowApp;
        private String isDistributed;
        private String isDirectoryApproved;
        private String scopes;
    }

    @Getter
@Setter
    public static class Message {
        private String team;
        private String channel;
        private String timestamp;
    }

}
