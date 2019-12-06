package com.github.seratch.jslack.api.webhook;

public class WebhookResponse {
    private Integer code;
    private String message;
    private String body;

    WebhookResponse(Integer code, String message, String body) {
        this.code = code;
        this.message = message;
        this.body = body;
    }

    public static WebhookResponseBuilder builder() {
        return new WebhookResponseBuilder();
    }

    public Integer getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }

    public String getBody() {
        return this.body;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public static class WebhookResponseBuilder {
        private Integer code;
        private String message;
        private String body;

        WebhookResponseBuilder() {
        }

        public WebhookResponse.WebhookResponseBuilder code(Integer code) {
            this.code = code;
            return this;
        }

        public WebhookResponse.WebhookResponseBuilder message(String message) {
            this.message = message;
            return this;
        }

        public WebhookResponse.WebhookResponseBuilder body(String body) {
            this.body = body;
            return this;
        }

        public WebhookResponse build() {
            return new WebhookResponse(code, message, body);
        }

        public String toString() {
            return "WebhookResponse.WebhookResponseBuilder(code=" + this.code + ", message=" + this.message + ", body=" + this.body + ")";
        }
    }
}
