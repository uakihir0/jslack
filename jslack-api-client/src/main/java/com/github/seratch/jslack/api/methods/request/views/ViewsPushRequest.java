package com.github.seratch.jslack.api.methods.request.views;

import com.github.seratch.jslack.api.methods.SlackApiRequest;
import com.github.seratch.jslack.api.model.view.View;

public class ViewsPushRequest implements SlackApiRequest {

    private String token;
    private String triggerId;
    private View view;
    private String viewAsString;

    ViewsPushRequest(String token, String triggerId, View view, String viewAsString) {
        this.token = token;
        this.triggerId = triggerId;
        this.view = view;
        this.viewAsString = viewAsString;
    }

    public static ViewsPushRequestBuilder builder() {
        return new ViewsPushRequestBuilder();
    }

    public String getToken() {
        return this.token;
    }

    public String getTriggerId() {
        return this.triggerId;
    }

    public View getView() {
        return this.view;
    }

    public String getViewAsString() {
        return this.viewAsString;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setTriggerId(String triggerId) {
        this.triggerId = triggerId;
    }

    public void setView(View view) {
        this.view = view;
    }

    public void setViewAsString(String viewAsString) {
        this.viewAsString = viewAsString;
    }

    public static class ViewsPushRequestBuilder {
        private String token;
        private String triggerId;
        private View view;
        private String viewAsString;

        ViewsPushRequestBuilder() {
        }

        public ViewsPushRequest.ViewsPushRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public ViewsPushRequest.ViewsPushRequestBuilder triggerId(String triggerId) {
            this.triggerId = triggerId;
            return this;
        }

        public ViewsPushRequest.ViewsPushRequestBuilder view(View view) {
            this.view = view;
            return this;
        }

        public ViewsPushRequest.ViewsPushRequestBuilder viewAsString(String viewAsString) {
            this.viewAsString = viewAsString;
            return this;
        }

        public ViewsPushRequest build() {
            return new ViewsPushRequest(token, triggerId, view, viewAsString);
        }

        public String toString() {
            return "ViewsPushRequest.ViewsPushRequestBuilder(token=" + this.token + ", triggerId=" + this.triggerId + ", view=" + this.view + ", viewAsString=" + this.viewAsString + ")";
        }
    }
}
