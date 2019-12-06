package com.github.seratch.jslack.api.methods.request.views;

import com.github.seratch.jslack.api.methods.SlackApiRequest;
import com.github.seratch.jslack.api.model.view.View;

public class ViewsOpenRequest implements SlackApiRequest {
    private String token;
    private String triggerId;
    private View view;
    private String viewAsString;

    ViewsOpenRequest(String token, String triggerId, View view, String viewAsString) {
        this.token = token;
        this.triggerId = triggerId;
        this.view = view;
        this.viewAsString = viewAsString;
    }

    public static ViewsOpenRequestBuilder builder() {
        return new ViewsOpenRequestBuilder();
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

    public static class ViewsOpenRequestBuilder {
        private String token;
        private String triggerId;
        private View view;
        private String viewAsString;

        ViewsOpenRequestBuilder() {
        }

        public ViewsOpenRequest.ViewsOpenRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public ViewsOpenRequest.ViewsOpenRequestBuilder triggerId(String triggerId) {
            this.triggerId = triggerId;
            return this;
        }

        public ViewsOpenRequest.ViewsOpenRequestBuilder view(View view) {
            this.view = view;
            return this;
        }

        public ViewsOpenRequest.ViewsOpenRequestBuilder viewAsString(String viewAsString) {
            this.viewAsString = viewAsString;
            return this;
        }

        public ViewsOpenRequest build() {
            return new ViewsOpenRequest(token, triggerId, view, viewAsString);
        }

        public String toString() {
            return "ViewsOpenRequest.ViewsOpenRequestBuilder(token=" + this.token + ", triggerId=" + this.triggerId + ", view=" + this.view + ", viewAsString=" + this.viewAsString + ")";
        }
    }
}
