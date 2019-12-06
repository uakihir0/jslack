package com.github.seratch.jslack.api.methods.request.mpim;

import com.github.seratch.jslack.api.methods.SlackApiRequest;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Builder
public class MpimOpenRequest implements SlackApiRequest {

    /**
     * Authentication token. Requires scope: `mpim:write`
     */
    private String token;

    /**
     * Comma separated lists of users.
     * The ordering of the users is preserved whenever a MPIM group is returned.
     */
    private List<String> users;

}