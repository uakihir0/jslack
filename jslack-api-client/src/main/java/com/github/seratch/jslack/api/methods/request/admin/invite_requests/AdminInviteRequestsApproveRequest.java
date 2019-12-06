package com.github.seratch.jslack.api.methods.request.admin.invite_requests;

import com.github.seratch.jslack.api.methods.SlackApiRequest;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * https://api.slack.com/methods/admin.inviteRequests.approve
 */
@Getter
@Setter
@Builder
public class AdminInviteRequestsApproveRequest implements SlackApiRequest {

    /**
     * Authentication token bearing required scopes.
     */
    private String token;

    /**
     * ID of the request to invite.
     */
    private String inviteRequestId;

    /**
     * ID for the workspace where the invite request was made.
     */
    private String teamId;

}
