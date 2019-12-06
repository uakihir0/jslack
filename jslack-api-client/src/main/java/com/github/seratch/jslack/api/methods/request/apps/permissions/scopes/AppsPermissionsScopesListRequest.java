package com.github.seratch.jslack.api.methods.request.apps.permissions.scopes;

import com.github.seratch.jslack.api.methods.SlackApiRequest;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class AppsPermissionsScopesListRequest implements SlackApiRequest {

    private String token;

}