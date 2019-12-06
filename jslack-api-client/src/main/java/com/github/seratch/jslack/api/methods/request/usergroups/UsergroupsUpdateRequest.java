package com.github.seratch.jslack.api.methods.request.usergroups;

import com.github.seratch.jslack.api.methods.SlackApiRequest;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Builder
public class UsergroupsUpdateRequest implements SlackApiRequest {

    /**
     * Authentication token. Requires scope: `usergroups:write`
     */
    private String token;

    /**
     * The encoded ID of the User Group to update.
     */
    private String usergroup;

    /**
     * A name for the User Group. Must be unique among User Groups.
     */
    private String name;

    /**
     * A mention handle. Must be unique among channels, users and User Groups.
     */
    private String handle;

    /**
     * A short description of the User Group.
     */
    private String description;

    /**
     * A comma separated string of encoded channel IDs for which the User Group uses as a default.
     */
    private List<String> channels;

    /**
     * Include the number of users in the User Group.
     */
    private boolean includeCount;

}