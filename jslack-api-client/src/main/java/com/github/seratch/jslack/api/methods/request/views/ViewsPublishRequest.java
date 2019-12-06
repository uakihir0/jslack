package com.github.seratch.jslack.api.methods.request.views;

import com.github.seratch.jslack.api.methods.SlackApiRequest;
import com.github.seratch.jslack.api.model.view.View;

public class ViewsPublishRequest implements SlackApiRequest {
    private String token;
    private View view;
    private String viewAsString;
    private String userId;
    private String hash;

    ViewsPublishRequest(String token, View view, String viewAsString, String userId, String hash) {
        this.token = token;
        this.view = view;
        this.viewAsString = viewAsString;
        this.userId = userId;
        this.hash = hash;
    }

    public static ViewsPublishRequestBuilder builder() {
        return new ViewsPublishRequestBuilder();
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

    public String getUserId() {
        return this.userId;
    }

    public String getHash() {
        return this.hash;
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

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public static class ViewsPublishRequestBuilder {
        private String token;
        private View view;
        private String viewAsString;
        private String userId;
        private String hash;

        ViewsPublishRequestBuilder() {
        }

        public ViewsPublishRequest.ViewsPublishRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public ViewsPublishRequest.ViewsPublishRequestBuilder view(View view) {
            this.view = view;
            return this;
        }

        public ViewsPublishRequest.ViewsPublishRequestBuilder viewAsString(String viewAsString) {
            this.viewAsString = viewAsString;
            return this;
        }

        public ViewsPublishRequest.ViewsPublishRequestBuilder userId(String userId) {
            this.userId = userId;
            return this;
        }

        public ViewsPublishRequest.ViewsPublishRequestBuilder hash(String hash) {
            this.hash = hash;
            return this;
        }

        public ViewsPublishRequest build() {
            return new ViewsPublishRequest(token, view, viewAsString, userId, hash);
        }

        public String toString() {
            return "ViewsPublishRequest.ViewsPublishRequestBuilder(token=" + this.token + ", view=" + this.view + ", viewAsString=" + this.viewAsString + ", userId=" + this.userId + ", hash=" + this.hash + ")";
        }
    }
}
