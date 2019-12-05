package com.github.seratch.jslack.api.status.v1;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import net.socialhub.http.HttpResponse;

@Data
@Slf4j
public class LegacyStatusApiException extends Exception {

    private final HttpResponse response;
    private final String responseBody;

    public LegacyStatusApiException(HttpResponse response, String responseBody) {
        this.response = response;
        this.responseBody = responseBody;
    }

}
