package com.github.seratch.jslack.api.model.event;

import lombok.Getter;
import lombok.Setter;

/**
 * This Events API-only event is sent via subscription whenever a Slack app is completely uninstalled.
 * <p>
 * You should also receive tokens_revoked events for revoked tokens.
 * An app is not uninstalled until its final user and bot tokens are revoked.
 * <p>
 * The example above details the complete Events API payload, including the event wrapper.
 * The team_id indicates which workspace uninstalled the Slack app identified by api_app_id.
 * <p>
 * https://api.slack.com/events/app_uninstalled
 */
@Getter
@Setter
public class AppUninstalledEvent implements Event {

    public static final String TYPE_NAME = "app_uninstalled";

    private final String type = TYPE_NAME;

}