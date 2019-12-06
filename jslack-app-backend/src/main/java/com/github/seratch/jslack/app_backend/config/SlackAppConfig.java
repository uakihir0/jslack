package com.github.seratch.jslack.app_backend.config;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

/**
 * https://api.slack.com/apps
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SlackAppConfig {
    // https://api.slack.com/docs/oauth
    private String clientId;
    // https://api.slack.com/docs/oauth
    private String clientSecret;
    // https://api.slack.com/docs/oauth
    private String redirectUri;
}
