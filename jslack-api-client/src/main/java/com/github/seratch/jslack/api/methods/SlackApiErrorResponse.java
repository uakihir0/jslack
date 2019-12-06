package com.github.seratch.jslack.api.methods;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SlackApiErrorResponse implements SlackApiResponse {

    private boolean ok;
    private String warning;
    private String error;
    private String needed;
    private String provided;
}
