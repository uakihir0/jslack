package com.github.seratch.jslack.api.methods.response.apps.permissions;

import com.github.seratch.jslack.api.methods.SlackApiResponse;

import java.util.List;

public class AppsPermissionsInfoResponse implements SlackApiResponse {

    private boolean ok;
    private String warning;
    private String error;

    private Info info;

    public AppsPermissionsInfoResponse() {
    }

    public boolean isOk() {
        return this.ok;
    }

    public String getWarning() {
        return this.warning;
    }

    public String getError() {
        return this.error;
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

    public void setInfo(Info info) {
        this.info = info;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof AppsPermissionsInfoResponse))
            return false;
        final AppsPermissionsInfoResponse other = (AppsPermissionsInfoResponse) o;
        if (!other.canEqual((Object) this)) return false;
        if (this.isOk() != other.isOk()) return false;
        final Object this$warning = this.getWarning();
        final Object other$warning = other.getWarning();
        if (this$warning == null ? other$warning != null : !this$warning.equals(other$warning)) return false;
        final Object this$error = this.getError();
        final Object other$error = other.getError();
        if (this$error == null ? other$error != null : !this$error.equals(other$error)) return false;
        final Object this$info = this.getInfo();
        final Object other$info = other.getInfo();
        if (this$info == null ? other$info != null : !this$info.equals(other$info)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof AppsPermissionsInfoResponse;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = result * PRIME + (this.isOk() ? 79 : 97);
        final Object $warning = this.getWarning();
        result = result * PRIME + ($warning == null ? 43 : $warning.hashCode());
        final Object $error = this.getError();
        result = result * PRIME + ($error == null ? 43 : $error.hashCode());
        final Object $info = this.getInfo();
        result = result * PRIME + ($info == null ? 43 : $info.hashCode());
        return result;
    }

    public String toString() {
        return "AppsPermissionsInfoResponse(ok=" + this.isOk() + ", warning=" + this.getWarning() + ", error=" + this.getError() + ", info=" + this.getInfo() + ")";
    }

    public static class Info {
        private Permissions team;
        private Permissions channel;
        private Permissions group;
        private Permissions mpim;
        private Permissions im;
        private Permissions appHome;

        public Info() {
        }

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

        public boolean equals(final Object o) {
            if (o == this) return true;
            if (!(o instanceof Info))
                return false;
            final Info other = (Info) o;
            if (!other.canEqual((Object) this)) return false;
            final Object this$team = this.getTeam();
            final Object other$team = other.getTeam();
            if (this$team == null ? other$team != null : !this$team.equals(other$team)) return false;
            final Object this$channel = this.getChannel();
            final Object other$channel = other.getChannel();
            if (this$channel == null ? other$channel != null : !this$channel.equals(other$channel)) return false;
            final Object this$group = this.getGroup();
            final Object other$group = other.getGroup();
            if (this$group == null ? other$group != null : !this$group.equals(other$group)) return false;
            final Object this$mpim = this.getMpim();
            final Object other$mpim = other.getMpim();
            if (this$mpim == null ? other$mpim != null : !this$mpim.equals(other$mpim)) return false;
            final Object this$im = this.getIm();
            final Object other$im = other.getIm();
            if (this$im == null ? other$im != null : !this$im.equals(other$im)) return false;
            final Object this$appHome = this.getAppHome();
            final Object other$appHome = other.getAppHome();
            if (this$appHome == null ? other$appHome != null : !this$appHome.equals(other$appHome)) return false;
            return true;
        }

        protected boolean canEqual(final Object other) {
            return other instanceof Info;
        }

        public int hashCode() {
            final int PRIME = 59;
            int result = 1;
            final Object $team = this.getTeam();
            result = result * PRIME + ($team == null ? 43 : $team.hashCode());
            final Object $channel = this.getChannel();
            result = result * PRIME + ($channel == null ? 43 : $channel.hashCode());
            final Object $group = this.getGroup();
            result = result * PRIME + ($group == null ? 43 : $group.hashCode());
            final Object $mpim = this.getMpim();
            result = result * PRIME + ($mpim == null ? 43 : $mpim.hashCode());
            final Object $im = this.getIm();
            result = result * PRIME + ($im == null ? 43 : $im.hashCode());
            final Object $appHome = this.getAppHome();
            result = result * PRIME + ($appHome == null ? 43 : $appHome.hashCode());
            return result;
        }

        public String toString() {
            return "AppsPermissionsInfoResponse.Info(team=" + this.getTeam() + ", channel=" + this.getChannel() + ", group=" + this.getGroup() + ", mpim=" + this.getMpim() + ", im=" + this.getIm() + ", appHome=" + this.getAppHome() + ")";
        }

        public static class Permissions {
            private List<String> scopes;
            private Resources resources;

            public Permissions() {
            }

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

            public boolean equals(final Object o) {
                if (o == this) return true;
                if (!(o instanceof Permissions))
                    return false;
                final Permissions other = (Permissions) o;
                if (!other.canEqual((Object) this)) return false;
                final Object this$scopes = this.getScopes();
                final Object other$scopes = other.getScopes();
                if (this$scopes == null ? other$scopes != null : !this$scopes.equals(other$scopes)) return false;
                final Object this$resources = this.getResources();
                final Object other$resources = other.getResources();
                if (this$resources == null ? other$resources != null : !this$resources.equals(other$resources))
                    return false;
                return true;
            }

            protected boolean canEqual(final Object other) {
                return other instanceof Permissions;
            }

            public int hashCode() {
                final int PRIME = 59;
                int result = 1;
                final Object $scopes = this.getScopes();
                result = result * PRIME + ($scopes == null ? 43 : $scopes.hashCode());
                final Object $resources = this.getResources();
                result = result * PRIME + ($resources == null ? 43 : $resources.hashCode());
                return result;
            }

            public String toString() {
                return "AppsPermissionsInfoResponse.Info.Permissions(scopes=" + this.getScopes() + ", resources=" + this.getResources() + ")";
            }

            public static class Resources {
                private List<String> ids;
                private boolean wildcard;
                private List<String> excludedIds;

                public Resources() {
                }

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

                public boolean equals(final Object o) {
                    if (o == this) return true;
                    if (!(o instanceof Resources))
                        return false;
                    final Resources other = (Resources) o;
                    if (!other.canEqual((Object) this)) return false;
                    final Object this$ids = this.getIds();
                    final Object other$ids = other.getIds();
                    if (this$ids == null ? other$ids != null : !this$ids.equals(other$ids)) return false;
                    if (this.isWildcard() != other.isWildcard()) return false;
                    final Object this$excludedIds = this.getExcludedIds();
                    final Object other$excludedIds = other.getExcludedIds();
                    if (this$excludedIds == null ? other$excludedIds != null : !this$excludedIds.equals(other$excludedIds))
                        return false;
                    return true;
                }

                protected boolean canEqual(final Object other) {
                    return other instanceof Resources;
                }

                public int hashCode() {
                    final int PRIME = 59;
                    int result = 1;
                    final Object $ids = this.getIds();
                    result = result * PRIME + ($ids == null ? 43 : $ids.hashCode());
                    result = result * PRIME + (this.isWildcard() ? 79 : 97);
                    final Object $excludedIds = this.getExcludedIds();
                    result = result * PRIME + ($excludedIds == null ? 43 : $excludedIds.hashCode());
                    return result;
                }

                public String toString() {
                    return "AppsPermissionsInfoResponse.Info.Permissions.Resources(ids=" + this.getIds() + ", wildcard=" + this.isWildcard() + ", excludedIds=" + this.getExcludedIds() + ")";
                }
            }
        }
    }

}