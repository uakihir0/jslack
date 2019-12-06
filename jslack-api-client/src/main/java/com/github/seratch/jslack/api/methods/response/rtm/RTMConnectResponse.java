package com.github.seratch.jslack.api.methods.response.rtm;

import com.github.seratch.jslack.api.methods.SlackApiResponse;
import com.github.seratch.jslack.api.model.Team;
import com.github.seratch.jslack.api.model.User;
import lombok.Getter;
import lombok.Setter;

/**
 * @see <a href="https://api.slack.com/methods/rtm.connect">rtm.connect</a>
 */
@Getter
@Setter
public class RTMConnectResponse implements SlackApiResponse {

    private boolean ok;
    private String warning;
    private String error;
    private String needed;
    private String provided;

    private String url;
    private User self;
    private Team team;
}
