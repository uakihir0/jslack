package com.github.seratch.jslack.api.methods.request.stars;

import com.github.seratch.jslack.api.methods.SlackApiRequest;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class StarsListRequest implements SlackApiRequest {

    /**
     * Authentication token. Requires scope: `stars:read`
     */
    private String token;

    private Integer count;

    private Integer page;

}