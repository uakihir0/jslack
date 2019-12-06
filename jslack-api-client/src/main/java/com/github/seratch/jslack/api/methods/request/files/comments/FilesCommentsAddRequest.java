package com.github.seratch.jslack.api.methods.request.files.comments;

import com.github.seratch.jslack.api.methods.SlackApiRequest;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class FilesCommentsAddRequest implements SlackApiRequest {

    /**
     * Authentication token. Requires scope: `files:write:user`
     */
    private String token;

    /**
     * File to add a comment to.
     */
    private String file;

    /**
     * Text of the comment to add.
     */
    private String comment;

}