package com.github.seratch.jslack.api.methods.response.dnd;

import com.github.seratch.jslack.api.methods.SlackApiResponse;
import lombok.Getter;
import lombok.Setter;

import java.util.Map;

@Getter
@Setter
public class DndTeamInfoResponse implements SlackApiResponse {

    private boolean ok;
    private String warning;
    private String error;
    private String needed;
    private String provided;

    // user.id -> info
    private Map<String, DndTeamMemberInfo> users;

    @Getter
@Setter
    public static class DndTeamMemberInfo {
        private boolean dndEnabled;
        private Integer nextDndStartTs;
        private Integer nextDndEndTs;
    }
}