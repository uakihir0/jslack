package com.github.seratch.jslack.app_backend.interactive_messages.payload;

import com.github.seratch.jslack.common.json.GsonFactory;
import lombok.Getter;
import lombok.Setter;

public class PayloadTypeDetector {

    @Getter
@Setter
    public static class Payload {
        private String type;
    }

    public String detectType(String json) {
        Payload payload = GsonFactory.createSnakeCase().fromJson(json, Payload.class);
        return payload.getType();
    }

}
