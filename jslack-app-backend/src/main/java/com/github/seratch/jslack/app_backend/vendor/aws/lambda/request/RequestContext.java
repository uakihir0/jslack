package com.github.seratch.jslack.app_backend.vendor.aws.lambda.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RequestContext {
    private String accountId;
    private String resourceId;
    private String stage;
    private String requestId;
    private Identity identity;
    private String resourcePath;
    private String httpMethod;
    private String apiId;
}
