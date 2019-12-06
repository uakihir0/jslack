package com.github.seratch.jslack.app_backend.interactive_messages.payload;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

/**
 * https://api.slack.com/reference/block-kit/block-elements#external_multi_select
 */
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BlockSuggestionPayload {

    public static final String TYPE = "block_suggestion";
    private final String type = TYPE;

    private Team team;
    private User user;
    private Container container;
    private String apiAppId;
    private String token;
    private String actionId;
    private String blockId;
    private String value;
    private Channel channel;

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

    @Getter
@Setter
    public static class Container {
        private String type;
        private String messageTs;
        private Integer attachmentId;
        private String channelId;
        private String text;
        @SerializedName("is_ephemeral")
        private boolean ephemeral;
    }

    @Getter
@Setter
    public static class Channel {
        private String id;
        private String name;
    }

}
