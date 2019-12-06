package com.github.seratch.jslack.api.methods.request.users;

import com.github.seratch.jslack.api.methods.SlackApiRequest;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * Delete the user profile photo
 */
@Getter
@Setter
@Builder
public class UsersDeletePhotoRequest implements SlackApiRequest {

    /**
     * Authentication token. Requires scope: `users.profile:write`
     */
    private String token;

}
