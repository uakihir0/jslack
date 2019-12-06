package com.github.seratch.jslack.app_backend.outgoing_webhooks.response;

import com.github.seratch.jslack.api.model.Attachment;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Builder
public class WebhookResponse {
    private String text;
    private List<Attachment> attachments;
}
