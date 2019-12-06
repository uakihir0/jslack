package com.github.seratch.jslack.api.methods.request.im;

import com.github.seratch.jslack.api.methods.SlackApiRequest;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class ImRepliesRequest implements SlackApiRequest {

    /**
     * Authentication token. Requires scope: `im:history`
     */
    private String token;

    /**
     * Direct message channel to fetch thread from.
     */
    private String channel;

    /**
     * Unique identifier of a thread's parent message.
     */
    private String threadTs;

}