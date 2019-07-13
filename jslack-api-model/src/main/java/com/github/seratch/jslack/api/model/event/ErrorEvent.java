package com.github.seratch.jslack.api.model.event;

/**
 * If there was a problem connecting an error will be returned,
 * including a descriptive error message:
 *
 * <pre>
 * {
 *     "type": "error",
 *     "error": {
 *         "code": 1,
 *         "msg": "Socket URL has expired"
 *     }
 * }
 * </pre>
 * <p>
 * https://api.slack.com/rtm
 */
public class ErrorEvent implements Event {

    public static final String TYPE_NAME = "error";

    private final String type = TYPE_NAME;
    private Error error;

    public ErrorEvent() {
    }

    public String getType() {
        return this.type;
    }

    public Error getError() {
        return this.error;
    }

    public void setError(Error error) {
        this.error = error;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof ErrorEvent)) return false;
        final ErrorEvent other = (ErrorEvent) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$type = this.getType();
        final Object other$type = other.getType();
        if (this$type == null ? other$type != null : !this$type.equals(other$type)) return false;
        final Object this$error = this.getError();
        final Object other$error = other.getError();
        if (this$error == null ? other$error != null : !this$error.equals(other$error)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof ErrorEvent;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $type = this.getType();
        result = result * PRIME + ($type == null ? 43 : $type.hashCode());
        final Object $error = this.getError();
        result = result * PRIME + ($error == null ? 43 : $error.hashCode());
        return result;
    }

    public String toString() {
        return "ErrorEvent(type=" + this.getType() + ", error=" + this.getError() + ")";
    }

    public static class Error {
        private Integer code;
        private String msg;

        public Error() {
        }

        public Integer getCode() {
            return this.code;
        }

        public String getMsg() {
            return this.msg;
        }

        public void setCode(Integer code) {
            this.code = code;
        }

        public void setMsg(String msg) {
            this.msg = msg;
        }

        public boolean equals(final Object o) {
            if (o == this) return true;
            if (!(o instanceof Error)) return false;
            final Error other = (Error) o;
            if (!other.canEqual((Object) this)) return false;
            final Object this$code = this.getCode();
            final Object other$code = other.getCode();
            if (this$code == null ? other$code != null : !this$code.equals(other$code)) return false;
            final Object this$msg = this.getMsg();
            final Object other$msg = other.getMsg();
            if (this$msg == null ? other$msg != null : !this$msg.equals(other$msg)) return false;
            return true;
        }

        protected boolean canEqual(final Object other) {
            return other instanceof Error;
        }

        public int hashCode() {
            final int PRIME = 59;
            int result = 1;
            final Object $code = this.getCode();
            result = result * PRIME + ($code == null ? 43 : $code.hashCode());
            final Object $msg = this.getMsg();
            result = result * PRIME + ($msg == null ? 43 : $msg.hashCode());
            return result;
        }

        public String toString() {
            return "ErrorEvent.Error(code=" + this.getCode() + ", msg=" + this.getMsg() + ")";
        }
    }
}