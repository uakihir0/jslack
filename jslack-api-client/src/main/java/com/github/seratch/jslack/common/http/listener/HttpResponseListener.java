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
    }

}
