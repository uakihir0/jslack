package com.github.seratch.jslack.api.webhook;

public class WebhookResponse {
    private Integer code;
    private String message;
    private String body;

    @java.beans.ConstructorProperties({"code", "message", "body"})
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

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof WebhookResponse)) return false;
        final WebhookResponse other = (WebhookResponse) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$code = this.getCode();
        final Object other$code = other.getCode();
        if (this$code == null ? other$code != null : !this$code.equals(other$code)) return false;
        final Object this$message = this.getMessage();
        final Object other$message = other.getMessage();
        if (this$message == null ? other$message != null : !this$message.equals(other$message)) return false;
        final Object this$body = this.getBody();
        final Object other$body = other.getBody();
        if (this$body == null ? other$body != null : !this$body.equals(other$body)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof WebhookResponse;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $code = this.getCode();
        result = result * PRIME + ($code == null ? 43 : $code.hashCode());
        final Object $message = this.getMessage();
        result = result * PRIME + ($message == null ? 43 : $message.hashCode());
        final Object $body = this.getBody();
        result = result * PRIME + ($body == null ? 43 : $body.hashCode());
        return result;
    }

    public String toString() {
        return "WebhookResponse(code=" + this.getCode() + ", message=" + this.getMessage() + ", body=" + this.getBody() + ")";
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
