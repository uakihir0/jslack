package com.github.seratch.jslack.api.methods.response.team.profile;

import com.github.seratch.jslack.api.methods.SlackApiResponse;
import com.github.seratch.jslack.api.model.Team;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class TeamProfileGetResponse implements SlackApiResponse {

    private boolean ok;
    private String warning;
    private String error;
    private String needed;
    private String provided;

    private Profiles profile;

    @Getter
@Setter
    public static class Profiles {
        private List<Team.Profile> fields;
    }
}