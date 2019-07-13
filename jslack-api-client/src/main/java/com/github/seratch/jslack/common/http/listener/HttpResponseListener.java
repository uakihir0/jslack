package com.github.seratch.jslack.common.http.listener;

import com.github.seratch.jslack.SlackConfig;
import net.socialhub.http.HttpResponse;

import java.util.function.Consumer;

public abstract class HttpResponseListener implements Consumer<HttpResponseListener.State> {

    public abstract void accept(State state);

    public static class State {
        private SlackConfig config;
        private HttpResponse response;
        private String parsedResponseBody;

        public State(SlackConfig config, HttpResponse response, String parsedResponseBody) {
            this.config = config;
            this.response = response;
            this.parsedResponseBody = parsedResponseBody;
        }

        public SlackConfig getConfig() {
            return this.config;
        }

        public HttpResponse getResponse() {
            return this.response;
        }

        public String getParsedResponseBody() {
            return this.parsedResponseBody;
        }

        public void setConfig(SlackConfig config) {
            this.config = config;
        }

        public void setResponse(HttpResponse response) {
            this.response = response;
        }

        public void setParsedResponseBody(String parsedResponseBody) {
            this.parsedResponseBody = parsedResponseBody;
        }

        public boolean equals(final Object o) {
            if (o == this) return true;
            if (!(o instanceof State)) return false;
            final State other = (State) o;
            if (!other.canEqual((Object) this)) return false;
            final Object this$config = this.getConfig();
            final Object other$config = other.getConfig();
            if (this$config == null ? other$config != null : !this$config.equals(other$config)) return false;
            final Object this$response = this.getResponse();
            final Object other$response = other.getResponse();
            if (this$response == null ? other$response != null : !this$response.equals(other$response)) return false;
            final Object this$parsedResponseBody = this.getParsedResponseBody();
            final Object other$parsedResponseBody = other.getParsedResponseBody();
            if (this$parsedResponseBody == null ? other$parsedResponseBody != null : !this$parsedResponseBody.equals(other$parsedResponseBody))
                return false;
            return true;
        }

        protected boolean canEqual(final Object other) {
            return other instanceof State;
        }

        public int hashCode() {
            final int PRIME = 59;
            int result = 1;
            final Object $config = this.getConfig();
            result = result * PRIME + ($config == null ? 43 : $config.hashCode());
            final Object $response = this.getResponse();
            result = result * PRIME + ($response == null ? 43 : $response.hashCode());
            final Object $parsedResponseBody = this.getParsedResponseBody();
            result = result * PRIME + ($parsedResponseBody == null ? 43 : $parsedResponseBody.hashCode());
            return result;
        }

        public String toString() {
            return "HttpResponseListener.State(config=" + this.getConfig() + ", response=" + this.getResponse() + ", parsedResponseBody=" + this.getParsedResponseBody() + ")";
        }
    }

}
