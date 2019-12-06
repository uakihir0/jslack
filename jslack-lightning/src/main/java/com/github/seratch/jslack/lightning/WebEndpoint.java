package com.github.seratch.jslack.lightning;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class WebEndpoint {
    private Method method;
    private String path;

    public enum Method {
        GET, POST
    }
}
