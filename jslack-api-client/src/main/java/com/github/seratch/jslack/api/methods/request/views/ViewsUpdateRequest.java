package com.github.seratch.jslack.api.methods.request.views;

import com.github.seratch.jslack.api.methods.SlackApiRequest;
import com.github.seratch.jslack.api.model.view.View;

public class ViewsUpdateRequest implements SlackApiRequest {
    private String token;
    private View view;
    private String viewAsString;
    private String externalId;
    private String hash;
    private String viewId;

    ViewsUpdateRequest(String token, View view, String viewAsString, String externalId, String hash, String viewId) {
        this.token = token;
        this.view = view;
        this.viewAsString = viewAsString;
        this.externalId = externalId;
        this.hash = hash;
        this.viewId = viewId;
    }

    public static ViewsUpdateRequestBuilder builder() {
        return new ViewsUpdateRequestBuilder();
    }

    public String getToken() {
        return this.token;
    }

    public View getView() {
        return this.view;
    }

    public String getViewAsString() {
        return this.viewAsString;
    }

    public String getExternalId() {
        return this.externalId;
    }

    public String getHash() {
        return this.hash;
    }

    public String getViewId() {
        return this.viewId;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setView(View view) {
        this.view = view;
    }

    public void setViewAsString(String viewAsString) {
        this.viewAsString = viewAsString;
    }

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public void setViewId(String viewId) {
        this.viewId = viewId;
    }

    public static class ViewsUpdateRequestBuilder {
        private String token;
        private View view;
        private String viewAsString;
        private String externalId;
        private String hash;
        private String viewId;

        ViewsUpdateRequestBuilder() {
        }

        public ViewsUpdateRequest.ViewsUpdateRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public ViewsUpdateRequest.ViewsUpdateRequestBuilder view(View view) {
            this.view = view;
            return this;
        }

        public ViewsUpdateRequest.ViewsUpdateRequestBuilder viewAsString(String viewAsString) {
            this.viewAsString = viewAsString;
            return this;
        }

        public ViewsUpdateRequest.ViewsUpdateRequestBuilder externalId(String externalId) {
            this.externalId = externalId;
            return this;
        }

        public ViewsUpdateRequest.ViewsUpdateRequestBuilder hash(String hash) {
            this.hash = hash;
            return this;
        }

        public ViewsUpdateRequest.ViewsUpdateRequestBuilder viewId(String viewId) {
            this.viewId = viewId;
            return this;
        }

        public ViewsUpdateRequest build() {
            return new ViewsUpdateRequest(token, view, viewAsString, externalId, hash, viewId);
        }

        public String toString() {
            return "ViewsUpdateRequest.ViewsUpdateRequestBuilder(token=" + this.token + ", view=" + this.view + ", viewAsString=" + this.viewAsString + ", externalId=" + this.externalId + ", hash=" + this.hash + ", viewId=" + this.viewId + ")";
        }
    }
}
