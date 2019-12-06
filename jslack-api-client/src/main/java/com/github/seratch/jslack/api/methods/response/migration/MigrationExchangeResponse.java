package com.github.seratch.jslack.api.methods.response.migration;

import com.github.seratch.jslack.api.methods.SlackApiResponse;

import java.util.List;
import java.util.Map;

public class MigrationExchangeResponse implements SlackApiResponse {

    private boolean ok;
    private String warning;
    private String error;
    private String needed;
    private String provided;

    /**
     * The workspace/team ID containing the mapped users
     */
    private String teamId;

    /**
     * The enterprise grid organization ID containing the workspace/team.
     */
    private String enterpriseId;

    /**
     * A list of User IDs that cannot be mapped or found
     */
    private List<String> invalidUserIds;

    /**
     * A mapping of provided user IDs with mapped user IDs
     */
    private Map<String, String> userIdMap;

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

    public String getTeamId() {
        return this.teamId;
    }

    public String getEnterpriseId() {
        return this.enterpriseId;
    }

    public List<String> getInvalidUserIds() {
        return this.invalidUserIds;
    }

    public Map<String, String> getUserIdMap() {
        return this.userIdMap;
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

    public void setTeamId(String teamId) {
        this.teamId = teamId;
    }

    public void setEnterpriseId(String enterpriseId) {
        this.enterpriseId = enterpriseId;
    }

    public void setInvalidUserIds(List<String> invalidUserIds) {
        this.invalidUserIds = invalidUserIds;
    }

    public void setUserIdMap(Map<String, String> userIdMap) {
        this.userIdMap = userIdMap;
    }
}