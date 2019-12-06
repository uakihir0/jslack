package com.github.seratch.jslack.app_backend.dialogs.payload;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

import java.util.Map;

/**
 * <p>
 * see https://api.slack.com/dialogs
 */
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DialogSubmissionPayload {

    public static final String TYPE = "dialog_submission";

    private final String type = TYPE;
    private String callbackId;
    private Map<String, String> submission;
    private String state;
    private Team team;
    private User user;
    private Channel channel;
    private String actionTs;
    private String token;
    private String responseUrl;

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
    public static class Channel {
        private String id;
        private String name;
    }

    @Getter
@Setter
    public static class User {
        private String id;
        private String name;
        private String teamId;
    }

}
