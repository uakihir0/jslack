package com.github.seratch.jslack.api.methods.request.admin.users;

import com.github.seratch.jslack.api.methods.SlackApiRequest;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * https://api.slack.com/methods/admin.users.assign
 */
@Getter
@Setter
@Builder
public class AdminUsersAssignRequest implements SlackApiRequest {

    /**
     * Authentication token bearing required scopes.
     */
    private String token;

    /**
     * Workspace Id.
     */
    private String teamId;

    /**
     * The ID of the user to add to the workspace.
     */
    private String userId;

    /**
     * True if user should be added to the workspace as a guest.
     */
    private boolean isRestricted;

    /**
     * True if user should be added to the workspace as a single-channel guest.
     */
    private boolean isUltraRestricted;

}
