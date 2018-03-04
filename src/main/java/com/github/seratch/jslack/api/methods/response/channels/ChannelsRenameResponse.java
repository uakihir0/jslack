package com.github.seratch.jslack.api.methods.response.channels;

import com.github.seratch.jslack.api.methods.SlackApiResponse;
import com.google.gson.annotations.SerializedName;

public class ChannelsRenameResponse implements SlackApiResponse {

    private boolean ok;
    private String warning;
    private String error;

    private RenamedChannel channel;

    public ChannelsRenameResponse() {
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

    public RenamedChannel getChannel() {
        return this.channel;
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

    public void setChannel(RenamedChannel channel) {
        this.channel = channel;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof ChannelsRenameResponse)) return false;
        final ChannelsRenameResponse other = (ChannelsRenameResponse) o;
        if (!other.canEqual((Object) this)) return false;
        if (this.isOk() != other.isOk()) return false;
        final Object this$warning = this.getWarning();
        final Object other$warning = other.getWarning();
        if (this$warning == null ? other$warning != null : !this$warning.equals(other$warning)) return false;
        final Object this$error = this.getError();
        final Object other$error = other.getError();
        if (this$error == null ? other$error != null : !this$error.equals(other$error)) return false;
        final Object this$channel = this.getChannel();
        final Object other$channel = other.getChannel();
        if (this$channel == null ? other$channel != null : !this$channel.equals(other$channel)) return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = result * PRIME + (this.isOk() ? 79 : 97);
        final Object $warning = this.getWarning();
        result = result * PRIME + ($warning == null ? 43 : $warning.hashCode());
        final Object $error = this.getError();
        result = result * PRIME + ($error == null ? 43 : $error.hashCode());
        final Object $channel = this.getChannel();
        result = result * PRIME + ($channel == null ? 43 : $channel.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof ChannelsRenameResponse;
    }

    public String toString() {
        return "ChannelsRenameResponse(ok=" + this.isOk() + ", warning=" + this.getWarning() + ", error=" + this.getError() + ", channel=" + this.getChannel() + ")";
    }

    public static class RenamedChannel {
        private String id;
        @SerializedName("is_channel")
        private boolean channel;
        private String name;
        private int created;

        public RenamedChannel() {
        }

        public String getId() {
            return this.id;
        }

        public boolean isChannel() {
            return this.channel;
        }

        public String getName() {
            return this.name;
        }

        public int getCreated() {
            return this.created;
        }

        public void setId(String id) {
            this.id = id;
        }

        public void setChannel(boolean channel) {
            this.channel = channel;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setCreated(int created) {
            this.created = created;
        }

        public boolean equals(Object o) {
            if (o == this) return true;
            if (!(o instanceof RenamedChannel)) return false;
            final RenamedChannel other = (RenamedChannel) o;
            if (!other.canEqual((Object) this)) return false;
            final Object this$id = this.getId();
            final Object other$id = other.getId();
            if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
            if (this.isChannel() != other.isChannel()) return false;
            final Object this$name = this.getName();
            final Object other$name = other.getName();
            if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
            if (this.getCreated() != other.getCreated()) return false;
            return true;
        }

        public int hashCode() {
            final int PRIME = 59;
            int result = 1;
            final Object $id = this.getId();
            result = result * PRIME + ($id == null ? 43 : $id.hashCode());
            result = result * PRIME + (this.isChannel() ? 79 : 97);
            final Object $name = this.getName();
            result = result * PRIME + ($name == null ? 43 : $name.hashCode());
            result = result * PRIME + this.getCreated();
            return result;
        }

        protected boolean canEqual(Object other) {
            return other instanceof RenamedChannel;
        }

        public String toString() {
            return "ChannelsRenameResponse.RenamedChannel(id=" + this.getId() + ", channel=" + this.isChannel() + ", name=" + this.getName() + ", created=" + this.getCreated() + ")";
        }
    }

}
