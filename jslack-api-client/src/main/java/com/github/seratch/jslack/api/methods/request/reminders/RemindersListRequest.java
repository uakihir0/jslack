package com.github.seratch.jslack.api.methods.request.reminders;

import com.github.seratch.jslack.api.methods.SlackApiRequest;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class RemindersListRequest implements SlackApiRequest {

    /**
     * Authentication token. Requires scope: `reminders:read`
     */
    private String token;

}