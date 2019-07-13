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

    public MigrationExchangeResponse() {
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

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof MigrationExchangeResponse))
            return false;
        final MigrationExchangeResponse other = (MigrationExchangeResponse) o;
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
        final Object this$teamId = this.getTeamId();
        final Object other$teamId = other.getTeamId();
        if (this$teamId == null ? other$teamId != null : !this$teamId.equals(other$teamId)) return false;
        final Object this$enterpriseId = this.getEnterpriseId();
        final Object other$enterpriseId = other.getEnterpriseId();
        if (this$enterpriseId == null ? other$enterpriseId != null : !this$enterpriseId.equals(other$enterpriseId))
            return false;
        final Object this$invalidUserIds = this.getInvalidUserIds();
        final Object other$invalidUserIds = other.getInvalidUserIds();
        if (this$invalidUserIds == null ? other$invalidUserIds != null : !this$invalidUserIds.equals(other$invalidUserIds))
            return false;
        final Object this$userIdMap = this.getUserIdMap();
        final Object other$userIdMap = other.getUserIdMap();
        if (this$userIdMap == null ? other$userIdMap != null : !this$userIdMap.equals(other$userIdMap)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof MigrationExchangeResponse;
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
        final Object $teamId = this.getTeamId();
        result = result * PRIME + ($teamId == null ? 43 : $teamId.hashCode());
        final Object $enterpriseId = this.getEnterpriseId();
        result = result * PRIME + ($enterpriseId == null ? 43 : $enterpriseId.hashCode());
        final Object $invalidUserIds = this.getInvalidUserIds();
        result = result * PRIME + ($invalidUserIds == null ? 43 : $invalidUserIds.hashCode());
        final Object $userIdMap = this.getUserIdMap();
        result = result * PRIME + ($userIdMap == null ? 43 : $userIdMap.hashCode());
        return result;
    }

    public String toString() {
        return "MigrationExchangeResponse(ok=" + this.isOk() + ", warning=" + this.getWarning() + ", error=" + this.getError() + ", needed=" + this.getNeeded() + ", provided=" + this.getProvided() + ", teamId=" + this.getTeamId() + ", enterpriseId=" + this.getEnterpriseId() + ", invalidUserIds=" + this.getInvalidUserIds() + ", userIdMap=" + this.getUserIdMap() + ")";
    }
}