package com.github.seratch.jslack.api.webhook;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class WebhookResponse {
    private Integer code;
    private String message;
    private String body;
}
