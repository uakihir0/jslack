package com.github.seratch.jslack.api.methods.request.mpim;

import com.github.seratch.jslack.api.methods.SlackApiRequest;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class MpimCloseRequest implements SlackApiRequest {

    /**
     * Authentication token. Requires scope: `mpim:write`
     */
    private String token;

    /**
     * MPIM to close.
     */
    private String channel;

}