package com.github.seratch.jslack.api.methods.response.migration;

import com.github.seratch.jslack.api.methods.SlackApiResponse;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Map;

@Getter
@Setter
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

}