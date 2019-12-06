package com.github.seratch.jslack.api.methods;

import com.github.seratch.jslack.SlackConfig;
import com.github.seratch.jslack.common.json.GsonFactory;
import net.socialhub.http.HttpResponse;
import net.socialhub.logger.Logger;

public class SlackApiException extends Exception {

    private static final Logger log = Logger.getLogger(SlackApiException.class);

    private final HttpResponse response;
    private final String responseBody;
    private final SlackApiErrorResponse error;

    public SlackApiException(HttpResponse response, String responseBody) {
        this(SlackConfig.DEFAULT, response, responseBody);
    }

    public SlackApiException(SlackConfig config, HttpResponse response, String responseBody) {
        this.response = response;
        this.responseBody = responseBody;
        SlackApiErrorResponse parsedErrorResponse = null;
        try {
            parsedErrorResponse = GsonFactory.createSnakeCase(config).fromJson(responseBody, SlackApiErrorResponse.class);
        } catch (Exception e) {
            if (log.isDebugEnabled()) {
                String responseToPrint = responseBody.length() > 1000 ? responseBody.subSequence(0, 1000) + " ..." : responseBody;
                log.debug("Failed to parse the error response body: " + responseToPrint);
            }
        }
        this.error = parsedErrorResponse;
    }

    public HttpResponse getResponse() {
        return this.response;
    }

    public String getResponseBody() {
        return this.responseBody;
    }

    public SlackApiErrorResponse getError() {
        return this.error;
    }
}
