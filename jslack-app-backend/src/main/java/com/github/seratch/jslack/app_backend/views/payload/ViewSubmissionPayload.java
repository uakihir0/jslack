package com.github.seratch.jslack.app_backend.views.payload;

import com.github.seratch.jslack.api.model.view.View;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

/**
 * <p>
 * see https://api.slack.com/block-kit/surfaces/modals
 */
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ViewSubmissionPayload {
    public static final String TYPE = "view_submission";
    private final String type = TYPE;
    private Team team;
    private User user;
    private String apiAppId;
    private String token;
    private String triggerId;
    private View view;
    private boolean isCleared;

    @Getter
@Setter
    public static class Team {
        private String id;
        private String domain;
        private String enterpriseId;
        private String enterpriseName;
    }

    @Getter
@Setter
    public static class User {
        private String id;
        private String username;
        private String name;
        private String teamId;
    }

}
