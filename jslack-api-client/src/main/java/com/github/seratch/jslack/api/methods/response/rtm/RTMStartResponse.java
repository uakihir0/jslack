package com.github.seratch.jslack.api.methods.response.rtm;

import com.github.seratch.jslack.api.methods.SlackApiResponse;
import com.github.seratch.jslack.api.model.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @see <a href="https://api.slack.com/methods/rtm.start">rtm.start</a>
 */
@Getter
@Setter
public class RTMStartResponse implements SlackApiResponse {

    private boolean ok;
    private String warning;
    private String error;
    private String needed;
    private String provided;

    private String url;
    private User self;
    private Team team;
    private List<User> users;
    private Prefs prefs;
    private List<Channel> channels;
    private List<Group> groups;
    private List<Im> ims;

    @Getter
@Setter
    public static class Prefs {
        // TODO
    }
}
