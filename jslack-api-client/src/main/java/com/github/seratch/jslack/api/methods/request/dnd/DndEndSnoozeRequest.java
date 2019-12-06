package com.github.seratch.jslack.api.methods.request.dnd;

import com.github.seratch.jslack.api.methods.SlackApiRequest;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class DndEndSnoozeRequest implements SlackApiRequest {

    /**
     * Authentication token. Requires scope: `dnd:write`
     */
    private String token;

}