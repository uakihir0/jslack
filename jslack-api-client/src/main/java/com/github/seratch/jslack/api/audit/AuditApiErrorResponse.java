package com.github.seratch.jslack.api.audit;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AuditApiErrorResponse implements AuditApiResponse {

    private boolean ok;
    private String warning;
    private String error;
    private String needed;
    private String provided;
}
