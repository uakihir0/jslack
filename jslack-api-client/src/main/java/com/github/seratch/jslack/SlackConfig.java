package com.github.seratch.jslack;

import com.github.seratch.jslack.common.http.listener.DetailedLoggingListener;
import com.github.seratch.jslack.common.http.listener.HttpResponseListener;
import com.github.seratch.jslack.common.http.listener.ResponsePrettyPrintingListener;

import java.util.ArrayList;
import java.util.List;

public class SlackConfig {

    public static final SlackConfig DEFAULT = new SlackConfig() {
        @Override
        public void setPrettyResponseLoggingEnabled(boolean prettyResponseLoggingEnabled) {
            throw new UnsupportedOperationException("This config is immutable");
        }

        @Override
        public void setLibraryMaintainerMode(boolean libraryMaintainerMode) {
            throw new UnsupportedOperationException("This config is immutable");
        }
    };

    public SlackConfig() {
        getHttpClientResponseHandlers().add(new DetailedLoggingListener());
        getHttpClientResponseHandlers().add(new ResponsePrettyPrintingListener());
    }

    private boolean prettyResponseLoggingEnabled = false;

    /**
     * Don't enable this flag in production. This flag enables some validation features for development.
     */
    private boolean libraryMaintainerMode = false;

    private List<HttpResponseListener> httpClientResponseHandlers = new ArrayList<>();

    public boolean isPrettyResponseLoggingEnabled() {
        return this.prettyResponseLoggingEnabled;
    }

    public boolean isLibraryMaintainerMode() {
        return this.libraryMaintainerMode;
    }

    public List<HttpResponseListener> getHttpClientResponseHandlers() {
        return this.httpClientResponseHandlers;
    }

    public void setPrettyResponseLoggingEnabled(boolean prettyResponseLoggingEnabled) {
        this.prettyResponseLoggingEnabled = prettyResponseLoggingEnabled;
    }

    public void setLibraryMaintainerMode(boolean libraryMaintainerMode) {
        this.libraryMaintainerMode = libraryMaintainerMode;
    }

    public void setHttpClientResponseHandlers(List<HttpResponseListener> httpClientResponseHandlers) {
        this.httpClientResponseHandlers = httpClientResponseHandlers;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof SlackConfig)) return false;
        final SlackConfig other = (SlackConfig) o;
        if (!other.canEqual((Object) this)) return false;
        if (this.isPrettyResponseLoggingEnabled() != other.isPrettyResponseLoggingEnabled()) return false;
        if (this.isLibraryMaintainerMode() != other.isLibraryMaintainerMode()) return false;
        final Object this$httpClientResponseHandlers = this.getHttpClientResponseHandlers();
        final Object other$httpClientResponseHandlers = other.getHttpClientResponseHandlers();
        if (this$httpClientResponseHandlers == null ? other$httpClientResponseHandlers != null : !this$httpClientResponseHandlers.equals(other$httpClientResponseHandlers))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof SlackConfig;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = result * PRIME + (this.isPrettyResponseLoggingEnabled() ? 79 : 97);
        result = result * PRIME + (this.isLibraryMaintainerMode() ? 79 : 97);
        final Object $httpClientResponseHandlers = this.getHttpClientResponseHandlers();
        result = result * PRIME + ($httpClientResponseHandlers == null ? 43 : $httpClientResponseHandlers.hashCode());
        return result;
    }

    public String toString() {
        return "SlackConfig(prettyResponseLoggingEnabled=" + this.isPrettyResponseLoggingEnabled() + ", libraryMaintainerMode=" + this.isLibraryMaintainerMode() + ", httpClientResponseHandlers=" + this.getHttpClientResponseHandlers() + ")";
    }
}