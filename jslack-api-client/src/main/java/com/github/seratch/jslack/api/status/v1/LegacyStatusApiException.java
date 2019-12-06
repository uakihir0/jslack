package com.github.seratch.jslack.api.status.v1;

import net.socialhub.http.HttpResponse;

public class LegacyStatusApiException extends Exception {

    private final HttpResponse response;
    private final String responseBody;

    public LegacyStatusApiException(HttpResponse response, String responseBody) {
        this.response = response;
        this.responseBody = responseBody;
    }

    public HttpResponse getResponse() {
        return this.response;
    }

    public String getResponseBody() {
        return this.responseBody;
    }
}
