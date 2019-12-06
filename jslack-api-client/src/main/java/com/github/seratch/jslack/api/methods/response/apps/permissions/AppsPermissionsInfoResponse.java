package com.github.seratch.jslack.api.methods.response.apps.permissions;

import com.github.seratch.jslack.api.methods.SlackApiResponse;

import java.util.List;

public class AppsPermissionsInfoResponse implements SlackApiResponse {

    private boolean ok;
    private String warning;
    private String error;
    private String needed;
    private String provided;

    private Info info;

    public boolean isOk() {
        return this.ok;
    }

    public String getWarning() {
        return this.warning;
    }

    public String getError() {
        return this.error;
    }

    public String getNeeded() {
        return this.needed;
    }

    public String getProvided() {
        return this.provided;
    }

    public Info getInfo() {
        return this.info;
    }

    public void setOk(boolean ok) {
        this.ok = ok;
    }

    public void setWarning(String warning) {
        this.warning = warning;
    }

    public void setError(String error) {
        this.error = error;
    }

    public void setNeeded(String needed) {
        this.needed = needed;
    }

    public void setProvided(String provided) {
        this.provided = provided;
    }

    public void setInfo(Info info) {
        this.info = info;
    }

    public static class Info {
        private Permissions team;
        private Permissions channel;
        private Permissions group;
        private Permissions mpim;
        private Permissions im;
        private Permissions appHome;

        public Permissions getTeam() {
            return this.team;
        }

        public Permissions getChannel() {
            return this.channel;
        }

        public Permissions getGroup() {
            return this.group;
        }

        public Permissions getMpim() {
            return this.mpim;
        }

        public Permissions getIm() {
            return this.im;
        }

        public Permissions getAppHome() {
            return this.appHome;
        }

        public void setTeam(Permissions team) {
            this.team = team;
        }

        public void setChannel(Permissions channel) {
            this.channel = channel;
        }

        public void setGroup(Permissions group) {
            this.group = group;
        }

        public void setMpim(Permissions mpim) {
            this.mpim = mpim;
        }

        public void setIm(Permissions im) {
            this.im = im;
        }

        public void setAppHome(Permissions appHome) {
            this.appHome = appHome;
        }

        public static class Permissions {
            private List<String> scopes;
            private Resources resources;

            public List<String> getScopes() {
                return this.scopes;
            }

            public Resources getResources() {
                return this.resources;
            }

            public void setScopes(List<String> scopes) {
                this.scopes = scopes;
            }

            public void setResources(Resources resources) {
                this.resources = resources;
            }

            public static class Resources {
                private List<String> ids;
                private boolean wildcard;
                private List<String> excludedIds;

                public List<String> getIds() {
                    return this.ids;
                }

                public boolean isWildcard() {
                    return this.wildcard;
                }

                public List<String> getExcludedIds() {
                    return this.excludedIds;
                }

                public void setIds(List<String> ids) {
                    this.ids = ids;
                }

                public void setWildcard(boolean wildcard) {
                    this.wildcard = wildcard;
                }

                public void setExcludedIds(List<String> excludedIds) {
                    this.excludedIds = excludedIds;
                }
            }
        }
    }

}