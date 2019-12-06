package com.github.seratch.jslack.api.methods.request.im;

import com.github.seratch.jslack.api.methods.SlackApiRequest;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class ImCloseRequest implements SlackApiRequest {

    /**
     * Authentication token. Requires scope: `im:write`
     */
    private String token;

    /**
     * Direct message channel to close.
     */
    private String channel;
}