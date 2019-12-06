package com.github.seratch.jslack.app_backend.slash_commands.payload;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SlashCommandPayload {
    private String token;
    private String teamId;
    private String teamDomain;
    private String enterpriseId;
    private String enterpriseName;
    private String channelId;
    private String channelName;
    private String userId;
    private String userName;
    private String command;
    private String text;
    private String responseUrl;
    private String triggerId;
}
