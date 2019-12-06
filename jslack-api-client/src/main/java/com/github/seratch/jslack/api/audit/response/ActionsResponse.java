package com.github.seratch.jslack.api.audit.response;

import com.github.seratch.jslack.api.audit.AuditApiResponse;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ActionsResponse implements AuditApiResponse {
    private boolean ok;
    private String warning;
    private String error;
    private String needed;
    private String provided;

    private Actions actions;

    @Getter
@Setter
    public static class Actions {
        private List<String> workspaceOrOrg;
        private List<String> user;
        private List<String> file;
        private List<String> channel;
        private List<String> app;
        private List<String> message;
    }
}
