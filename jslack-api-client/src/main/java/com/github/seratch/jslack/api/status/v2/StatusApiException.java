package com.github.seratch.jslack.api.status.v2;

import net.socialhub.http.HttpResponse;

public class StatusApiException extends Exception {

    private final HttpResponse response;
    private final String responseBody;

    public StatusApiException(HttpResponse response, String responseBody) {
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
