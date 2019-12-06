package com.github.seratch.jslack.api.methods.response.mpim;

import com.github.seratch.jslack.api.methods.SlackApiResponse;
import com.github.seratch.jslack.api.model.Group;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MpimOpenResponse implements SlackApiResponse {

    private boolean ok;
    private String warning;
    private String error;
    private String needed;
    private String provided;

    private Group group;
}