package com.github.seratch.jslack.app_backend.ssl_check.payload;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SSLCheckPayload {
    private String sslCheck;
    private String token;
}
