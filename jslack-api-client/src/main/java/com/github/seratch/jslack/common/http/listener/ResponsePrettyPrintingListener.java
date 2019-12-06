package com.github.seratch.jslack.common.http.listener;

import com.github.seratch.jslack.SlackConfig;
import com.github.seratch.jslack.common.json.GsonFactory;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import net.socialhub.logger.Logger;

public class ResponsePrettyPrintingListener extends HttpResponseListener {

    private static final Logger log = Logger.getLogger(ResponsePrettyPrintingListener.class);

    private static final JsonParser JSON_PARSER = new JsonParser();

    @Override
    public void accept(State state) {
        SlackConfig config = state.getConfig();
        String body = state.getParsedResponseBody();
        if (config.isPrettyResponseLoggingEnabled() && body != null && body.trim().startsWith("{")) {
            JsonElement jsonObj = JSON_PARSER.parse(body);
            String prettifiedJson = GsonFactory.createSnakeCase(config).toJson(jsonObj);

            log.debug("--- Pretty printing the response ---\n" +
                    prettifiedJson + "\n" +
                    "-----------------------------------------");
        }
    }
}
