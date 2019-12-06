package com.github.seratch.jslack.api.audit.response;

import com.github.seratch.jslack.api.audit.AuditApiResponse;
import com.github.seratch.jslack.api.model.ResponseMetadata;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class LogsResponse implements AuditApiResponse {
    private boolean ok;
    private String warning;
    private String error;
    private String needed;
    private String provided;

    private ResponseMetadata responseMetadata;

    private List<Entry> entries;

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

    public ResponseMetadata getResponseMetadata() {
        return this.responseMetadata;
    }

    public List<Entry> getEntries() {
        return this.entries;
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

    public void setResponseMetadata(ResponseMetadata responseMetadata) {
        this.responseMetadata = responseMetadata;
    }

    public void setEntries(List<Entry> entries) {
        this.entries = entries;
    }

    public static class Entry {
        private String id;
        private Integer dateCreate;
        private String action;
        private Actor actor;
        private Entity entity;
        private Context context;
        private Details details;

        public String getId() {
            return this.id;
        }

        public Integer getDateCreate() {
            return this.dateCreate;
        }

        public String getAction() {
            return this.action;
        }

        public Actor getActor() {
            return this.actor;
        }

        public Entity getEntity() {
            return this.entity;
        }

        public Context getContext() {
            return this.context;
        }

        public Details getDetails() {
            return this.details;
        }

        public void setId(String id) {
            this.id = id;
        }

        public void setDateCreate(Integer dateCreate) {
            this.dateCreate = dateCreate;
        }

        public void setAction(String action) {
            this.action = action;
        }

        public void setActor(Actor actor) {
            this.actor = actor;
        }

        public void setEntity(Entity entity) {
            this.entity = entity;
        }

        public void setContext(Context context) {
            this.context = context;
        }

        public void setDetails(Details details) {
            this.details = details;
        }
    }

    public static class Actor {
        private String type;
        private User user;

        public String getType() {
            return this.type;
        }

        public User getUser() {
            return this.user;
        }

        public void setType(String type) {
            this.type = type;
        }

        public void setUser(User user) {
            this.user = user;
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

    public static class Entity {
        private String type;
        private App app;
        private User user;
        private Usergroup usergroup;
        private Workspace workspace;
        private Enterprise enterprise;
        private File file;
        private Channel channel;

        public String getType() {
            return this.type;
        }

        public App getApp() {
            return this.app;
        }

        public User getUser() {
            return this.user;
        }

        public Usergroup getUsergroup() {
            return this.usergroup;
        }

        public Workspace getWorkspace() {
            return this.workspace;
        }

        public Enterprise getEnterprise() {
            return this.enterprise;
        }

        public File getFile() {
            return this.file;
        }

        public Channel getChannel() {
            return this.channel;
        }

        public void setType(String type) {
            this.type = type;
        }

        public void setApp(App app) {
            this.app = app;
        }

        public void setUser(User user) {
            this.user = user;
        }

        public void setUsergroup(Usergroup usergroup) {
            this.usergroup = usergroup;
        }

        public void setWorkspace(Workspace workspace) {
            this.workspace = workspace;
        }

        public void setEnterprise(Enterprise enterprise) {
            this.enterprise = enterprise;
        }

        public void setFile(File file) {
            this.file = file;
        }

        public void setChannel(Channel channel) {
            this.channel = channel;
        }
    }

    public static class App {
        private String id;
        private String name;
        @SerializedName("is_distributed")
        private Boolean distributed;
        @SerializedName("is_directory_approved")
        private Boolean directoryApproved;
        private List<String> scopes;

        public String getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }

        public Boolean getDistributed() {
            return this.distributed;
        }

        public Boolean getDirectoryApproved() {
            return this.directoryApproved;
        }

        public List<String> getScopes() {
            return this.scopes;
        }

        public void setId(String id) {
            this.id = id;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setDistributed(Boolean distributed) {
            this.distributed = distributed;
        }

        public void setDirectoryApproved(Boolean directoryApproved) {
            this.directoryApproved = directoryApproved;
        }

        public void setScopes(List<String> scopes) {
            this.scopes = scopes;
        }
    }

    public static class Usergroup {
        private String id;
        private String name;

        public String getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }

        public void setId(String id) {
            this.id = id;
        }

        public void setName(String name) {
            this.name = name;
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
        @SerializedName("is_shared")
        private Boolean shared;
        @SerializedName("is_org_shared")
        private Boolean orgShared;
        private List<String> teamsSharedWith;

        public String getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }

        public String getPrivacy() {
            return this.privacy;
        }

        public Boolean getShared() {
            return this.shared;
        }

        public Boolean getOrgShared() {
            return this.orgShared;
        }

        public List<String> getTeamsSharedWith() {
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

        public void setShared(Boolean shared) {
            this.shared = shared;
        }

        public void setOrgShared(Boolean orgShared) {
            this.orgShared = orgShared;
        }

        public void setTeamsSharedWith(List<String> teamsSharedWith) {
            this.teamsSharedWith = teamsSharedWith;
        }
    }

    public static class Context {
        private Location location;
        private String ua;
        private String ipAddress;

        public Location getLocation() {
            return this.location;
        }

        public String getUa() {
            return this.ua;
        }

        public String getIpAddress() {
            return this.ipAddress;
        }

        public void setLocation(Location location) {
            this.location = location;
        }

        public void setUa(String ua) {
            this.ua = ua;
        }

        public void setIpAddress(String ipAddress) {
            this.ipAddress = ipAddress;
        }
    }

    public static class Location {
        private String type;
        private String id;
        private String name;
        private String domain;

        public String getType() {
            return this.type;
        }

        public String getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }

        public String getDomain() {
            return this.domain;
        }

        public void setType(String type) {
            this.type = type;
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

        public Boolean getInternalIntegration() {
            return this.internalIntegration;
        }

        public String getAppOwnerId() {
            return this.appOwnerId;
        }

        public List<String> getNewScopes() {
            return this.newScopes;
        }

        public List<String> getPreviousScopes() {
            return this.previousScopes;
        }

        public String getType() {
            return this.type;
        }

        public Inviter getInviter() {
            return this.inviter;
        }

        public String getNewValue() {
            return this.newValue;
        }

        public String getPreviousValue() {
            return this.previousValue;
        }

        public Kicker getKicker() {
            return this.kicker;
        }

        public String getInstallerUserId() {
            return this.installerUserId;
        }

        public Boolean getAppPreviouslyApproved() {
            return this.appPreviouslyApproved;
        }

        public List<String> getOldScopes() {
            return this.oldScopes;
        }

        public String getName() {
            return this.name;
        }

        public String getBotId() {
            return this.botId;
        }

        public List<Permission> getPermissions() {
            return this.permissions;
        }

        public void setInternalIntegration(Boolean internalIntegration) {
            this.internalIntegration = internalIntegration;
        }

        public void setAppOwnerId(String appOwnerId) {
            this.appOwnerId = appOwnerId;
        }

        public void setNewScopes(List<String> newScopes) {
            this.newScopes = newScopes;
        }

        public void setPreviousScopes(List<String> previousScopes) {
            this.previousScopes = previousScopes;
        }

        public void setType(String type) {
            this.type = type;
        }

        public void setInviter(Inviter inviter) {
            this.inviter = inviter;
        }

        public void setNewValue(String newValue) {
            this.newValue = newValue;
        }

        public void setPreviousValue(String previousValue) {
            this.previousValue = previousValue;
        }

        public void setKicker(Kicker kicker) {
            this.kicker = kicker;
        }

        public void setInstallerUserId(String installerUserId) {
            this.installerUserId = installerUserId;
        }

        public void setAppPreviouslyApproved(Boolean appPreviouslyApproved) {
            this.appPreviouslyApproved = appPreviouslyApproved;
        }

        public void setOldScopes(List<String> oldScopes) {
            this.oldScopes = oldScopes;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setBotId(String botId) {
            this.botId = botId;
        }

        public void setPermissions(List<Permission> permissions) {
            this.permissions = permissions;
        }
    }

    public static class Inviter {
        private String type;
        private User user;
        private String id;
        private String name;
        private String email;

        public String getType() {
            return this.type;
        }

        public User getUser() {
            return this.user;
        }

        public String getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }

        public String getEmail() {
            return this.email;
        }

        public void setType(String type) {
            this.type = type;
        }

        public void setUser(User user) {
            this.user = user;
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
    }

    public static class Kicker {
        private String id;
        private String name;
        private String email;

        public String getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }

        public String getEmail() {
            return this.email;
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
    }

    public static class Permission {
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
        private WildCard wildcard;

        public String getType() {
            return this.type;
        }

        public String getResourceId() {
            return this.resourceId;
        }

        public WildCard getWildcard() {
            return this.wildcard;
        }

        public void setType(String type) {
            this.type = type;
        }

        public void setResourceId(String resourceId) {
            this.resourceId = resourceId;
        }

        public void setWildcard(WildCard wildcard) {
            this.wildcard = wildcard;
        }
    }

    public static class WildCard {
        private String type;

        public String getType() {
            return this.type;
        }

        public void setType(String type) {
            this.type = type;
        }
    }

}
