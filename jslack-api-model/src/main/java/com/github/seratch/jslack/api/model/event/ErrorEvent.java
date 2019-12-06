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

    public String getType() {
        return this.type;
    }

    public Error getError() {
        return this.error;
    }

    public void setError(Error error) {
        this.error = error;
    }

    public static class Error {
        private Integer code;
        private String msg;

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
    }
}