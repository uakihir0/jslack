package com.github.seratch.jslack.api.methods.request.pins;

import com.github.seratch.jslack.api.methods.SlackApiRequest;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class PinsListRequest implements SlackApiRequest {

    /**
     * Authentication token. Requires scope: `pins:read`
     */
    private String token;

    /**
     * Channel to get pinned items for.
     */
    private String channel;

}