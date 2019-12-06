package com.github.seratch.jslack.app_backend.message_actions.payload;

import com.github.seratch.jslack.api.model.Message;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

/**
 * see https://api.slack.com/actions
 * see https://github.com/slackapi/bolt/blob/dae21827c1c11720e5d6c8f23abcddb2d983b1f2/src/types/actions/message-action.ts
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MessageActionPayload {

    public static final String TYPE = "message_action";

    private final String type = TYPE;
    private String callbackId;
    private String triggerId;
    private String messageTs;
    private String responseUrl;
    private Message message;
    private Team team;
    private User user;
    private Channel channel;
    private String token;
    private String actionTs;

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
