package com.github.seratch.jslack.api.methods.response.files.remote;

import com.github.seratch.jslack.api.methods.SlackApiResponse;
import com.github.seratch.jslack.api.model.File;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FilesRemoteUpdateResponse implements SlackApiResponse {

    private boolean ok;
    private String warning;
    private String error;
    private String needed;
    private String provided;

    private File file;
}