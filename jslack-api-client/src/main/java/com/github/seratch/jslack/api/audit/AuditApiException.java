package com.github.seratch.jslack.api.audit;

import com.github.seratch.jslack.SlackConfig;
import com.github.seratch.jslack.common.json.GsonFactory;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import net.socialhub.http.HttpResponse;

@Data
@Slf4j
public class AuditApiException extends Exception {

    private final HttpResponse response;
    private final String responseBody;
    private final AuditApiErrorResponse error;

    public AuditApiException(HttpResponse response, String responseBody) {
        this(SlackConfig.DEFAULT, response, responseBody);
    }

    public AuditApiException(SlackConfig config, HttpResponse response, String responseBody) {
        this.response = response;
        this.responseBody = responseBody;
        AuditApiErrorResponse parsedErrorResponse = null;
        try {
            parsedErrorResponse = GsonFactory.createSnakeCase(config).fromJson(responseBody, AuditApiErrorResponse.class);
        } catch (Exception e) {
            if (log.isDebugEnabled()) {
                String responseToPrint = responseBody.length() > 1000 ? responseBody.subSequence(0, 1000) + " ..." : responseBody;
                log.debug("Failed to parse the error response body: {}", responseToPrint);
            }
        }
        this.error = parsedErrorResponse;
    }

}
