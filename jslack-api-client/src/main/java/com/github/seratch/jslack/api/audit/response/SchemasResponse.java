package com.github.seratch.jslack.api.audit.response;

import com.github.seratch.jslack.api.audit.AuditApiResponse;

import java.util.List;

public class SchemasResponse implements AuditApiResponse {
    private boolean ok;
    private String warning;
    private String error;
    private String needed;
    private String provided;

    private List<Schema> schemas;

    public boolean isOk() {
        return this.ok;
    }

    public String getWarning() {
        return this.warning;
    }

    public String getError() {
        return this.error;
    }

    public String getNeeded() {
        return this.needed;
    }

    public String getProvided() {
        return this.provided;
    }

    public List<Schema> getSchemas() {
        return this.schemas;
    }

    public void setOk(boolean ok) {
        this.ok = ok;
    }

    public void setWarning(String warning) {
        this.warning = warning;
    }

    public void setError(String error) {
        this.error = error;
    }

    public void setNeeded(String needed) {
        this.needed = needed;
    }

    public void setProvided(String provided) {
        this.provided = provided;
    }

    public void setSchemas(List<Schema> schemas) {
        this.schemas = schemas;
    }

    public static class Schema {
        private String type;
        private Workspace workspace;
        private Enterprise enterprise;
        private User user;
        private File file;
        private Channel channel;
        private App app;
        private Message message;

        public String getType() {
            return this.type;
        }

        public Workspace getWorkspace() {
            return this.workspace;
        }

        public Enterprise getEnterprise() {
            return this.enterprise;
        }

        public User getUser() {
            return this.user;
        }

        public File getFile() {
            return this.file;
        }

        public Channel getChannel() {
            return this.channel;
        }

        public App getApp() {
            return this.app;
        }

        public Message getMessage() {
            return this.message;
        }

        public void setType(String type) {
            this.type = type;
        }

        public void setWorkspace(Workspace workspace) {
            this.workspace = workspace;
        }

        public void setEnterprise(Enterprise enterprise) {
            this.enterprise = enterprise;
        }

        public void setUser(User user) {
            this.user = user;
        }

        public void setFile(File file) {
            this.file = file;
        }

        public void setChannel(Channel channel) {
            this.channel = channel;
        }

        public void setApp(App app) {
            this.app = app;
        }

        public void setMessage(Message message) {
            this.message = message;
        }
    }

    public static class Workspace {
        private String id;
        private String name;
        private String domain;

        public String getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }

        public String getDomain() {
            return this.domain;
        }

        public void setId(String id) {
            this.id = id;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setDomain(String domain) {
            this.domain = domain;
        }
    }

    public static class Enterprise {
        private String id;
        private String name;
        private String domain;

        public String getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }

        public String getDomain() {
            return this.domain;
        }

        public void setId(String id) {
            this.id = id;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setDomain(String domain) {
            this.domain = domain;
        }
    }

    public static class User {
        private String id;
        private String name;
        private String email;
        private String team;

        public String getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }

        public String getEmail() {
            return this.email;
        }

        public String getTeam() {
            return this.team;
        }

        public void setId(String id) {
            this.id = id;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public void setTeam(String team) {
            this.team = team;
        }
    }

    public static class File {
        private String id;
        private String name;
        private String filetype;
        private String title;

        public String getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }

        public String getFiletype() {
            return this.filetype;
        }

        public String getTitle() {
            return this.title;
        }

        public void setId(String id) {
            this.id = id;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setFiletype(String filetype) {
            this.filetype = filetype;
        }

        public void setTitle(String title) {
            this.title = title;
        }
    }

    public static class Channel {
        private String id;
        private String name;
        private String privacy;
        private String isShared;
        private String isOrgShared;
        private String teamsSharedWith;

        public String getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }

        public String getPrivacy() {
            return this.privacy;
        }

        public String getIsShared() {
            return this.isShared;
        }

        public String getIsOrgShared() {
            return this.isOrgShared;
        }

        public String getTeamsSharedWith() {
            return this.teamsSharedWith;
        }

        public void setId(String id) {
            this.id = id;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setPrivacy(String privacy) {
            this.privacy = privacy;
        }

        public void setIsShared(String isShared) {
            this.isShared = isShared;
        }

        public void setIsOrgShared(String isOrgShared) {
            this.isOrgShared = isOrgShared;
        }

        public void setTeamsSharedWith(String teamsSharedWith) {
            this.teamsSharedWith = teamsSharedWith;
        }
    }

    public static class App {
        private String id;
        private String name;
        private String isWorkflowApp;
        private String isDistributed;
        private String isDirectoryApproved;
        private String scopes;

        public String getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }

        public String getIsWorkflowApp() {
            return this.isWorkflowApp;
        }

        public String getIsDistributed() {
            return this.isDistributed;
        }

        public String getIsDirectoryApproved() {
            return this.isDirectoryApproved;
        }

        public String getScopes() {
            return this.scopes;
        }

        public void setId(String id) {
            this.id = id;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setIsWorkflowApp(String isWorkflowApp) {
            this.isWorkflowApp = isWorkflowApp;
        }

        public void setIsDistributed(String isDistributed) {
            this.isDistributed = isDistributed;
        }

        public void setIsDirectoryApproved(String isDirectoryApproved) {
            this.isDirectoryApproved = isDirectoryApproved;
        }

        public void setScopes(String scopes) {
            this.scopes = scopes;
        }
    }

    public static class Message {
        private String team;
        private String channel;
        private String timestamp;

        public String getTeam() {
            return this.team;
        }

        public String getChannel() {
            return this.channel;
        }

        public String getTimestamp() {
            return this.timestamp;
        }

        public void setTeam(String team) {
            this.team = team;
        }

        public void setChannel(String channel) {
            this.channel = channel;
        }

        public void setTimestamp(String timestamp) {
            this.timestamp = timestamp;
        }
    }

}
