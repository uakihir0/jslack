package com.github.seratch.jslack.lightning.util;

import com.github.seratch.jslack.app_backend.dialogs.payload.DialogCancellationPayload;
import com.github.seratch.jslack.app_backend.dialogs.payload.DialogSubmissionPayload;
import com.github.seratch.jslack.app_backend.dialogs.payload.DialogSuggestionPayload;
import com.github.seratch.jslack.app_backend.events.payload.EventsApiPayload;
import com.github.seratch.jslack.app_backend.events.payload.UrlVerificationPayload;
import com.github.seratch.jslack.app_backend.interactive_messages.payload.AttachmentActionPayload;
import com.github.seratch.jslack.app_backend.interactive_messages.payload.BlockActionPayload;
import com.github.seratch.jslack.app_backend.interactive_messages.payload.BlockSuggestionPayload;
import com.github.seratch.jslack.app_backend.message_actions.payload.MessageActionPayload;
import com.github.seratch.jslack.app_backend.oauth.payload.VerificationCodePayload;
import com.github.seratch.jslack.app_backend.util.JsonPayloadExtractor;
import com.github.seratch.jslack.app_backend.util.OutgoingWebhooksRequestDetector;
import com.github.seratch.jslack.app_backend.util.SSLCheckRequestDetector;
import com.github.seratch.jslack.app_backend.util.SlashCommandRequestDetector;
import com.github.seratch.jslack.app_backend.views.payload.ViewClosedPayload;
import com.github.seratch.jslack.app_backend.views.payload.ViewSubmissionPayload;
import com.github.seratch.jslack.common.json.GsonFactory;
import com.github.seratch.jslack.lightning.AppConfig;
import com.github.seratch.jslack.lightning.request.Request;
import com.github.seratch.jslack.lightning.request.RequestHeaders;
import com.github.seratch.jslack.lightning.request.builtin.*;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.jetbrains.annotations.Nullable;

import java.util.Map;

@Getter
@Setter
@Slf4j
public class SlackRequestParser {

    private JsonPayloadExtractor jsonPayloadExtractor = new JsonPayloadExtractor();
    private SlashCommandRequestDetector commandRequestDetector = new SlashCommandRequestDetector();
    private SSLCheckRequestDetector sslCheckRequestDetector = new SSLCheckRequestDetector();
    private OutgoingWebhooksRequestDetector webhookRequestDetector = new OutgoingWebhooksRequestDetector();
    private Gson gson = GsonFactory.createSnakeCase();

    private final AppConfig appConfig;

    @Getter
@Setter
    @Builder
    public static class HttpRequest {
        private String requestUri;
        private Map<String, String> queryString;
        private String requestBody;
        private RequestHeaders headers;
        private String remoteAddress;
    }

    public SlackRequestParser(AppConfig appConfig) {
        this.appConfig = appConfig;
    }

    @Nullable
    public Request<?> parse(HttpRequest httpRequest) {
        String requestUri = httpRequest.getRequestUri();
        String requestBody = httpRequest.getRequestBody();
        RequestHeaders headers = httpRequest.getHeaders();
        Request<?> slackRequest = null;
        try {
            String jsonPayload = jsonPayloadExtractor.extractIfExists(requestBody);
            if (jsonPayload != null) {
                JsonObject payload = gson.fromJson(jsonPayload, JsonElement.class).getAsJsonObject();
                String payloadType = payload.get("type").getAsString();
                switch (payloadType) {
                    case AttachmentActionPayload.TYPE:
                        slackRequest = new AttachmentActionRequest(requestBody, jsonPayload, headers);
                        break;
                    case BlockActionPayload.TYPE:
                        slackRequest = new BlockActionRequest(requestBody, jsonPayload, headers);
                        break;
                    case BlockSuggestionPayload.TYPE:
                        slackRequest = new BlockSuggestionRequest(requestBody, jsonPayload, headers);
                        break;
                    case MessageActionPayload.TYPE:
                        slackRequest = new MessageActionRequest(requestBody, jsonPayload, headers);
                        break;
                    case EventsApiPayload.TYPE:
                        slackRequest = new EventRequest(jsonPayload, headers);
                        break;
                    case UrlVerificationPayload.TYPE:
                        slackRequest = new UrlVerificationRequest(jsonPayload, headers);
                        break;
                    case DialogCancellationPayload.TYPE:
                        slackRequest = new DialogCancellationRequest(requestBody, jsonPayload, headers);
                        break;
                    case DialogSubmissionPayload.TYPE:
                        slackRequest = new DialogSubmissionRequest(requestBody, jsonPayload, headers);
                        break;
                    case DialogSuggestionPayload.TYPE:
                        slackRequest = new DialogSuggestionRequest(requestBody, jsonPayload, headers);
                        break;
                    case ViewSubmissionPayload.TYPE:
                        slackRequest = new ViewSubmissionRequest(requestBody, jsonPayload, headers);
                        break;
                    case ViewClosedPayload.TYPE:
                        slackRequest = new ViewClosedRequest(requestBody, jsonPayload, headers);
                        break;
                    default:
                        log.warn("No request pattern detected for {}", jsonPayload);
                }
            } else {
                if (commandRequestDetector.isCommand(requestBody)) {
                    slackRequest = new SlashCommandRequest(requestBody, headers);
                } else if (sslCheckRequestDetector.isSSLCheckRequest(requestBody)) {
                    slackRequest = new SSLCheckRequest(requestBody, headers);
                } else if (webhookRequestDetector.isWebhook(requestBody)) {
                    slackRequest = new OutgoingWebhooksRequest(requestBody, headers);
                } else if (appConfig.isOAuthStartEnabled() && appConfig.getOauthStartRequestURI().equals(requestUri)) {
                    slackRequest = new OAuthStartRequest(requestBody, headers);
                } else if (appConfig.isOAuthCallbackEnabled() && appConfig.getOauthCallbackRequestURI().equals(requestUri)) {
                    VerificationCodePayload payload = VerificationCodePayload.from(httpRequest.getQueryString());
                    slackRequest = new OAuthCallbackRequest(requestBody, payload, headers);
                } else {
                    log.warn("No request pattern detected for {}", requestBody);
                }
            }
            return slackRequest;

        } finally {
            if (slackRequest != null) {
                slackRequest.updateContext(appConfig);

                String ipAddress = headers.get("X-FORWARDED-FOR");
                if (ipAddress == null) {
                    ipAddress = httpRequest.getRemoteAddress();
                }
                slackRequest.setClientIpAddress(ipAddress);
            }
        }
    }

}
