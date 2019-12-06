package com.github.seratch.jslack.api.methods.response.views;

import com.github.seratch.jslack.api.methods.SlackApiResponse;
import com.github.seratch.jslack.api.model.view.View;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ViewsPushResponse implements SlackApiResponse {

    private boolean ok;
    private String warning;
    private String error;
    private String needed;
    private String provided;

    private View view;

    private ResponseMetadata responseMetadata;

    @Getter
@Setter
    public static class ResponseMetadata {
        private List<String> messages;
    }
}
