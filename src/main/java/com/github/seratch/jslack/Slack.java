package com.github.seratch.jslack;

import com.github.seratch.jslack.api.methods.MethodsClient;
import com.github.seratch.jslack.api.methods.impl.MethodsClientImpl;
import com.github.seratch.jslack.common.http.SlackHttpClient;
import com.github.seratch.jslack.shortcut.Shortcut;
import com.github.seratch.jslack.shortcut.impl.ShortcutImpl;
import com.github.seratch.jslack.shortcut.model.ApiToken;

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
