package com.github.seratch.jslack.app_backend.events.payload;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UrlVerificationPayload {
    public static final String TYPE = "url_verification";
    private final String type = TYPE;

    private String token;
    private String challenge;
}
