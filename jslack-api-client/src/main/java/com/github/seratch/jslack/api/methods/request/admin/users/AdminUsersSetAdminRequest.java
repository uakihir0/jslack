package com.github.seratch.jslack.api.methods.request.admin.users;

import com.github.seratch.jslack.api.methods.SlackApiRequest;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * https://api.slack.com/methods/admin.users.setAdmin
 */
@Getter
@Setter
@Builder
public class AdminUsersSetAdminRequest implements SlackApiRequest {

    /**
     * Authentication token bearing required scopes.
     */
    private String token;

    /**
     * Workspace Id
     */
    private String teamId;

    /**
     * The ID of the user to designate as an admin.
     */
    private String userId;

}
