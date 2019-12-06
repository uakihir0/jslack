package com.github.seratch.jslack.api.methods.response.api;

import com.github.seratch.jslack.api.methods.SlackApiResponse;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ApiTestResponse implements SlackApiResponse {
    @Getter
@Setter
    public static class Args {
        private String foo;
        private String error;
    }

    private boolean ok;
    private Args args;
    private String warning;
    private String error;
    private String needed;
    private String provided;

}