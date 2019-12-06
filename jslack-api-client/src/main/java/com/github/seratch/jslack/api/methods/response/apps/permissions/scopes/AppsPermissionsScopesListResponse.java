package com.github.seratch.jslack.api.methods.response.apps.permissions.scopes;

import com.github.seratch.jslack.api.methods.SlackApiResponse;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class AppsPermissionsScopesListResponse implements SlackApiResponse {

    private boolean ok;
    private String warning;
    private String error;
    private String needed;
    private String provided;

    private List<Scope> scopes;

    @Getter
@Setter
    public static class Scope {
        private List<String> appHome;
        private List<String> team;
        private List<String> channel;
        private List<String> group;
        private List<String> mpim;
        private List<String> im;
        private List<String> user;
    }

}