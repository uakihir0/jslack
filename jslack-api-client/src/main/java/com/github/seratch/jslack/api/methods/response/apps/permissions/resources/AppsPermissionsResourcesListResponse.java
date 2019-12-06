package com.github.seratch.jslack.api.methods.response.apps.permissions.resources;

import com.github.seratch.jslack.api.methods.SlackApiResponse;
import com.github.seratch.jslack.api.model.ResponseMetadata;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class AppsPermissionsResourcesListResponse implements SlackApiResponse {

    private boolean ok;
    private String warning;
    private String error;
    private String needed;
    private String provided;

    private List<Resource> resources;
    private ResponseMetadata responseMetadata;

    @Getter
@Setter
    public static class Resource {
        private String id;
        private String type;
    }

}