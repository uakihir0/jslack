package com.github.seratch.jslack.api.methods.request.team;

import com.github.seratch.jslack.api.methods.SlackApiRequest;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class TeamBillableInfoRequest implements SlackApiRequest {

    /**
     * Authentication token. Requires scope: `admin`
     */
    private String token;

    /**
     * A user to retrieve the billable information for. Defaults to all users.
     */
    private String user;

}