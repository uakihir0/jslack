package com.github.seratch.jslack.app_backend.outgoing_webhooks.payload;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class WebhookPayload {
    private String token;
    private String teamId;
    private String teamDomain;
    private String serviceId;
    private String channelId;
    private String channelName;
    private String timestamp;
    private String userId;
    private String userName;
    private String text;
    private String triggerWord;
}