package com.github.seratch.jslack.api.methods.request.views;

import com.github.seratch.jslack.api.methods.SlackApiRequest;
import com.github.seratch.jslack.api.model.view.View;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class ViewsPushRequest implements SlackApiRequest {

    private String token;
    private String triggerId;
    private View view;
    private String viewAsString;
}
