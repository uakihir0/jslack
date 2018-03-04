package com.github.seratch.jslack.api.methods;

import com.github.seratch.jslack.common.json.GsonFactory;
import net.socialhub.logger.Logger;
import okhttp3.Response;

public class SlackApiException extends Exception {

    private static final Logger log = Logger.getLogger(SlackApiException.class);
    private final Response response;
    private final String responseBody;
    private final SlackApiErrorResponse error;

    public SlackApiException(Response response, String responseBody) {
        this.response = response;
        this.responseBody = responseBody;
        SlackApiErrorResponse parsedErrorResponse = null;
        try {
            parsedErrorResponse = GsonFactory.createSnakeCase().fromJson(responseBody, SlackApiErrorResponse.class);
        } catch (Exception e) {
            log.debug("Failed to parse the error response body: " + responseBody.subSequence(0, 1000) + " ...");
        }
        this.error = parsedErrorResponse;
    }

    public Response getResponse() {
        return this.response;
    }

    public String getResponseBody() {
        return this.responseBody;
    }

    public SlackApiErrorResponse getError() {
        return this.error;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof SlackApiException)) return false;
        final SlackApiException other = (SlackApiException) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$response = this.getResponse();
        final Object other$response = other.getResponse();
        if (this$response == null ? other$response != null : !this$response.equals(other$response)) return false;
        final Object this$responseBody = this.getResponseBody();
        final Object other$responseBody = other.getResponseBody();
        if (this$responseBody == null ? other$responseBody != null : !this$responseBody.equals(other$responseBody))
            return false;
        final Object this$error = this.getError();
        final Object other$error = other.getError();
        if (this$error == null ? other$error != null : !this$error.equals(other$error)) return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $response = this.getResponse();
        result = result * PRIME + ($response == null ? 43 : $response.hashCode());
        final Object $responseBody = this.getResponseBody();
        result = result * PRIME + ($responseBody == null ? 43 : $responseBody.hashCode());
        final Object $error = this.getError();
        result = result * PRIME + ($error == null ? 43 : $error.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof SlackApiException;
    }

    public String toString() {
        return "SlackApiException(response=" + this.getResponse() + ", responseBody=" + this.getResponseBody() + ", error=" + this.getError() + ")";
    }
}
