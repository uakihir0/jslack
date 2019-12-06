package com.github.seratch.jslack.api.status.v2;

import lombok.Getter;
import lombok.Setter;
import net.socialhub.http.HttpResponse;

@Getter
@Setter
public class StatusApiException extends Exception {

    private final HttpResponse response;
    private final String responseBody;

    public StatusApiException(HttpResponse response, String responseBody) {
        this.response = response;
        this.responseBody = responseBody;
    }
}
