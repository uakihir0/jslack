package com.github.seratch.jslack.common.http.listener;

import com.github.seratch.jslack.SlackConfig;
import lombok.AllArgsConstructor;
import lombok.Data;
import net.socialhub.http.HttpResponse;

import java.util.function.Consumer;

public abstract class HttpResponseListener implements Consumer<HttpResponseListener.State> {

    public abstract void accept(State state);

    @AllArgsConstructor
    @Data
    public static class State {
        private SlackConfig config;
        private HttpResponse response;
        private String parsedResponseBody;
    }

}
