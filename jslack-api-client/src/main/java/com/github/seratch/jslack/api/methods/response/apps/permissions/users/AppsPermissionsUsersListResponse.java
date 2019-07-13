package com.github.seratch.jslack.api.methods.response.apps.permissions.users;

import com.github.seratch.jslack.api.methods.SlackApiResponse;
import com.github.seratch.jslack.api.model.ResponseMetadata;

import java.util.List;

public class AppsPermissionsUsersListResponse implements SlackApiResponse {

    private boolean ok;
    private String warning;
    private String error;
    private String needed;
    private String provided;

    private List<Resource> resources;
    private ResponseMetadata responseMetadata;

    public AppsPermissionsUsersListResponse() {
    }

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

    public List<Resource> getResources() {
        return this.resources;
    }

    public ResponseMetadata getResponseMetadata() {
        return this.responseMetadata;
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

    public void setResources(List<Resource> resources) {
        this.resources = resources;
    }

    public void setResponseMetadata(ResponseMetadata responseMetadata) {
        this.responseMetadata = responseMetadata;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof AppsPermissionsUsersListResponse))
            return false;
        final AppsPermissionsUsersListResponse other = (AppsPermissionsUsersListResponse) o;
        if (!other.canEqual((Object) this)) return false;
        if (this.isOk() != other.isOk()) return false;
        final Object this$warning = this.getWarning();
        final Object other$warning = other.getWarning();
        if (this$warning == null ? other$warning != null : !this$warning.equals(other$warning)) return false;
        final Object this$error = this.getError();
        final Object other$error = other.getError();
        if (this$error == null ? other$error != null : !this$error.equals(other$error)) return false;
        final Object this$needed = this.getNeeded();
        final Object other$needed = other.getNeeded();
        if (this$needed == null ? other$needed != null : !this$needed.equals(other$needed)) return false;
        final Object this$provided = this.getProvided();
        final Object other$provided = other.getProvided();
        if (this$provided == null ? other$provided != null : !this$provided.equals(other$provided)) return false;
        final Object this$resources = this.getResources();
        final Object other$resources = other.getResources();
        if (this$resources == null ? other$resources != null : !this$resources.equals(other$resources)) return false;
        final Object this$responseMetadata = this.getResponseMetadata();
        final Object other$responseMetadata = other.getResponseMetadata();
        if (this$responseMetadata == null ? other$responseMetadata != null : !this$responseMetadata.equals(other$responseMetadata))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof AppsPermissionsUsersListResponse;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = result * PRIME + (this.isOk() ? 79 : 97);
        final Object $warning = this.getWarning();
        result = result * PRIME + ($warning == null ? 43 : $warning.hashCode());
        final Object $error = this.getError();
        result = result * PRIME + ($error == null ? 43 : $error.hashCode());
        final Object $needed = this.getNeeded();
        result = result * PRIME + ($needed == null ? 43 : $needed.hashCode());
        final Object $provided = this.getProvided();
        result = result * PRIME + ($provided == null ? 43 : $provided.hashCode());
        final Object $resources = this.getResources();
        result = result * PRIME + ($resources == null ? 43 : $resources.hashCode());
        final Object $responseMetadata = this.getResponseMetadata();
        result = result * PRIME + ($responseMetadata == null ? 43 : $responseMetadata.hashCode());
        return result;
    }

    public String toString() {
        return "AppsPermissionsUsersListResponse(ok=" + this.isOk() + ", warning=" + this.getWarning() + ", error=" + this.getError() + ", needed=" + this.getNeeded() + ", provided=" + this.getProvided() + ", resources=" + this.getResources() + ", responseMetadata=" + this.getResponseMetadata() + ")";
    }

    public static class Resource {
        private String id;
        private String type;
        private List<String> scopes;

        public Resource() {
        }

        public String getId() {
            return this.id;
        }

        public String getType() {
            return this.type;
        }

        public List<String> getScopes() {
            return this.scopes;
        }

        public void setId(String id) {
            this.id = id;
        }

        public void setType(String type) {
            this.type = type;
        }

        public void setScopes(List<String> scopes) {
            this.scopes = scopes;
        }

        public boolean equals(final Object o) {
            if (o == this) return true;
            if (!(o instanceof Resource))
                return false;
            final Resource other = (Resource) o;
            if (!other.canEqual((Object) this)) return false;
            final Object this$id = this.getId();
            final Object other$id = other.getId();
            if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
            final Object this$type = this.getType();
            final Object other$type = other.getType();
            if (this$type == null ? other$type != null : !this$type.equals(other$type)) return false;
            final Object this$scopes = this.getScopes();
            final Object other$scopes = other.getScopes();
            if (this$scopes == null ? other$scopes != null : !this$scopes.equals(other$scopes)) return false;
            return true;
        }

        protected boolean canEqual(final Object other) {
            return other instanceof Resource;
        }

        public int hashCode() {
            final int PRIME = 59;
            int result = 1;
            final Object $id = this.getId();
            result = result * PRIME + ($id == null ? 43 : $id.hashCode());
            final Object $type = this.getType();
            result = result * PRIME + ($type == null ? 43 : $type.hashCode());
            final Object $scopes = this.getScopes();
            result = result * PRIME + ($scopes == null ? 43 : $scopes.hashCode());
            return result;
        }

        public String toString() {
            return "AppsPermissionsUsersListResponse.Resource(id=" + this.getId() + ", type=" + this.getType() + ", scopes=" + this.getScopes() + ")";
        }
    }

}