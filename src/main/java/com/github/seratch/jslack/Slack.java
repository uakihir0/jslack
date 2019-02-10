package com.github.seratch.jslack;

import com.github.seratch.jslack.api.methods.MethodsClient;
import com.github.seratch.jslack.api.methods.impl.MethodsClientImpl;
import com.github.seratch.jslack.api.scim.SCIMClient;
import com.github.seratch.jslack.api.scim.SCIMClientImpl;
import com.github.seratch.jslack.api.webhook.Payload;
import com.github.seratch.jslack.api.webhook.WebhookResponse;
import com.github.seratch.jslack.common.http.SlackHttpClient;
import com.github.seratch.jslack.shortcut.Shortcut;
import com.github.seratch.jslack.shortcut.impl.ShortcutImpl;
import com.github.seratch.jslack.shortcut.model.ApiToken;
import okhttp3.Response;

import java.io.IOException;

/**
 * Slack Integrations
 * <p>
 * https://{your team name}.slack.com/apps/manage/custom-integrations
 */
public class Slack {

    private static final Slack SINGLETON = new Slack(new SlackHttpClient());

    private final SlackHttpClient httpClient;

    public Slack() {
        this.httpClient = new SlackHttpClient();
    }

    private Slack(SlackHttpClient httpClient) {
        this.httpClient = httpClient;
    }

    public static Slack getInstance() {
        return SINGLETON;
    }

    public static Slack getInstance(SlackHttpClient httpClient) {
        return new Slack(httpClient);
    }

    /**
     * Send a data to Incoming Webhook endpoint.
     */
    public WebhookResponse send(String url, Payload payload) throws IOException {
        Response httpResponse = this.httpClient.postJsonPostRequest(url, payload);
        String body = httpResponse.body().string();
        SlackHttpClient.debugLog(httpResponse, body);

        return WebhookResponse.builder()
                .code(httpResponse.code())
                .message(httpResponse.message())
                .body(body)
                .build();
    }

    /**
     * Creates a SCIM api client.
     */
    public SCIMClient scim() {
        return new SCIMClientImpl(httpClient);
    }

    /**
     * Creates a Methods API client.
     */
    public MethodsClient methods() {
        return new MethodsClientImpl(httpClient);
    }

    public Shortcut shortcut() {
        return new ShortcutImpl(this);
    }

    public Shortcut shortcut(ApiToken apiToken) {
        return new ShortcutImpl(this, apiToken);
    }

}
