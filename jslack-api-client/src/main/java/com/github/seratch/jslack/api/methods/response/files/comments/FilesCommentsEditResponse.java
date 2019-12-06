package com.github.seratch.jslack.api.methods.response.files.comments;

import com.github.seratch.jslack.api.methods.SlackApiResponse;
import com.github.seratch.jslack.api.model.FileComment;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FilesCommentsEditResponse implements SlackApiResponse {

    private boolean ok;
    private String warning;
    private String error;
    private String needed;
    private String provided;

    private FileComment comment;
}