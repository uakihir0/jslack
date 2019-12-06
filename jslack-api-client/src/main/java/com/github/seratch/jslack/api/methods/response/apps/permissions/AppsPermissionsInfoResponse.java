package com.github.seratch.jslack.api.methods.response.apps.permissions;

import com.github.seratch.jslack.api.methods.SlackApiResponse;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class AppsPermissionsInfoResponse implements SlackApiResponse {

    private boolean ok;
    private String warning;
    private String error;
    private String needed;
    private String provided;

    private Info info;

    @Getter
@Setter
    public static class Info {
        private Permissions team;
        private Permissions channel;
        private Permissions group;
        private Permissions mpim;
        private Permissions im;
        private Permissions appHome;

        @Getter
@Setter
        public static class Permissions {
            private List<String> scopes;
            private Resources resources;

            @Getter
@Setter
            public static class Resources {
                private List<String> ids;
                private boolean wildcard;
                private List<String> excludedIds;
            }
        }
    }

}