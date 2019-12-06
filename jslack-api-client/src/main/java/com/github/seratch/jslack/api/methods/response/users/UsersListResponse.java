package com.github.seratch.jslack.api.methods.response.users;

import com.github.seratch.jslack.api.methods.SlackApiResponse;
import com.github.seratch.jslack.api.model.ResponseMetadata;
import com.github.seratch.jslack.api.model.User;

import java.util.List;

public class UsersListResponse implements SlackApiResponse {

    private boolean ok;
    private String warning;
    private String error;
    private String needed;
    private String provided;

    private String offset; // user id
    private List<User> members;
    private String cacheTs;
    private ResponseMetadata responseMetadata;

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

    public String getOffset() {
        return this.offset;
    }

    public List<User> getMembers() {
        return this.members;
    }

    public String getCacheTs() {
        return this.cacheTs;
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

    public void setOffset(String offset) {
        this.offset = offset;
    }

    public void setMembers(List<User> members) {
        this.members = members;
    }

    public void setCacheTs(String cacheTs) {
        this.cacheTs = cacheTs;
    }

    public void setResponseMetadata(ResponseMetadata responseMetadata) {
        this.responseMetadata = responseMetadata;
    }
}
