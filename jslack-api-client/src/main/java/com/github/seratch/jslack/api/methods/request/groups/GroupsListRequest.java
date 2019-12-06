package com.github.seratch.jslack.api.methods.request.groups;

import com.github.seratch.jslack.api.methods.SlackApiRequest;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class GroupsListRequest implements SlackApiRequest {

    /**
     * Authentication token. Requires scope: `groups:read`
     */
    private String token;

    /**
     * Exclude the `members` from each `group`
     */
    private boolean excludeMembers;

    /**
     * Don't return archived private channels.
     */
    private boolean excludeArchived;

}