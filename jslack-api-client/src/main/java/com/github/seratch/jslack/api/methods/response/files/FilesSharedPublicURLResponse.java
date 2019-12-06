package com.github.seratch.jslack.api.methods.response.files;

import com.github.seratch.jslack.api.methods.SlackApiResponse;
import com.github.seratch.jslack.api.model.File;
import com.github.seratch.jslack.api.model.FileComment;
import com.github.seratch.jslack.api.model.Paging;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class FilesSharedPublicURLResponse implements SlackApiResponse {

    private boolean ok;
    private String warning;
    private String error;
    private String needed;
    private String provided;

    private File file;
    private List<FileComment> comments;
    private Paging paging;
}