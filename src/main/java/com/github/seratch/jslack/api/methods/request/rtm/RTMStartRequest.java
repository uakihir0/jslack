package com.github.seratch.jslack.api.methods.request.rtm;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

/**
 * @see <a href="https://api.slack.com/methods/rtm.start">rtm.start</a>
 */
public class RTMStartRequest implements SlackApiRequest {

    private String token;
    private Boolean noUnreads;
    private Boolean mpimAware;

    RTMStartRequest(String token, Boolean noUnreads, Boolean mpimAware) {
        this.token = token;
        this.noUnreads = noUnreads;
        this.mpimAware = mpimAware;
    }

    public static RTMStartRequestBuilder builder() {
        return new RTMStartRequestBuilder();
    }

    public String getToken() {
        return this.token;
    }

    public Boolean getNoUnreads() {
        return this.noUnreads;
    }

    public Boolean getMpimAware() {
        return this.mpimAware;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setNoUnreads(Boolean noUnreads) {
        this.noUnreads = noUnreads;
    }

    public void setMpimAware(Boolean mpimAware) {
        this.mpimAware = mpimAware;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof RTMStartRequest)) return false;
        final RTMStartRequest other = (RTMStartRequest) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$token = this.getToken();
        final Object other$token = other.getToken();
        if (this$token == null ? other$token != null : !this$token.equals(other$token)) return false;
        final Object this$noUnreads = this.getNoUnreads();
        final Object other$noUnreads = other.getNoUnreads();
        if (this$noUnreads == null ? other$noUnreads != null : !this$noUnreads.equals(other$noUnreads)) return false;
        final Object this$mpimAware = this.getMpimAware();
        final Object other$mpimAware = other.getMpimAware();
        if (this$mpimAware == null ? other$mpimAware != null : !this$mpimAware.equals(other$mpimAware)) return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $token = this.getToken();
        result = result * PRIME + ($token == null ? 43 : $token.hashCode());
        final Object $noUnreads = this.getNoUnreads();
        result = result * PRIME + ($noUnreads == null ? 43 : $noUnreads.hashCode());
        final Object $mpimAware = this.getMpimAware();
        result = result * PRIME + ($mpimAware == null ? 43 : $mpimAware.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof RTMStartRequest;
    }

    public String toString() {
        return "RTMStartRequest(token=" + this.getToken() + ", noUnreads=" + this.getNoUnreads() + ", mpimAware=" + this.getMpimAware() + ")";
    }

    public static class RTMStartRequestBuilder {
        private String token;
        private Boolean noUnreads;
        private Boolean mpimAware;

        RTMStartRequestBuilder() {
        }

        public RTMStartRequest.RTMStartRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public RTMStartRequest.RTMStartRequestBuilder noUnreads(Boolean noUnreads) {
            this.noUnreads = noUnreads;
            return this;
        }

        public RTMStartRequest.RTMStartRequestBuilder mpimAware(Boolean mpimAware) {
            this.mpimAware = mpimAware;
            return this;
        }

        public RTMStartRequest build() {
            return new RTMStartRequest(token, noUnreads, mpimAware);
        }

        public String toString() {
            return "RTMStartRequest.RTMStartRequestBuilder(token=" + this.token + ", noUnreads=" + this.noUnreads + ", mpimAware=" + this.mpimAware + ")";
        }
    }
}