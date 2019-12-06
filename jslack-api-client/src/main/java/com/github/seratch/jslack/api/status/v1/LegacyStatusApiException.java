package com.github.seratch.jslack.api.status.v1;

import lombok.Data;
import net.socialhub.http.HttpResponse;

@Data
public class LegacyStatusApiException extends Exception {

    private final HttpResponse response;
    private final String responseBody;

    public LegacyStatusApiException(HttpResponse response, String responseBody) {
        this.response = response;
        this.responseBody = responseBody;
    }
}
