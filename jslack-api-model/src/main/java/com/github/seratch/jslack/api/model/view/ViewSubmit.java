package com.github.seratch.jslack.api.model.view;

public class ViewSubmit {
    private String type;
    private String text;
    private boolean emoji;

    public ViewSubmit(String type, String text, boolean emoji) {
        this.type = type;
        this.text = text;
        this.emoji = emoji;
    }

    public ViewSubmit() {
    }

    public static ViewSubmitBuilder builder() {
        return new ViewSubmitBuilder();
    }

    public String getType() {
        return this.type;
    }

    public String getText() {
        return this.text;
    }

    public boolean isEmoji() {
        return this.emoji;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setEmoji(boolean emoji) {
        this.emoji = emoji;
    }

    public static class ViewSubmitBuilder {
        private String type;
        private String text;
        private boolean emoji;

        ViewSubmitBuilder() {
        }

        public ViewSubmit.ViewSubmitBuilder type(String type) {
            this.type = type;
            return this;
        }

        public ViewSubmit.ViewSubmitBuilder text(String text) {
            this.text = text;
            return this;
        }

        public ViewSubmit.ViewSubmitBuilder emoji(boolean emoji) {
            this.emoji = emoji;
            return this;
        }

        public ViewSubmit build() {
            return new ViewSubmit(type, text, emoji);
        }

        public String toString() {
            return "ViewSubmit.ViewSubmitBuilder(type=" + this.type + ", text=" + this.text + ", emoji=" + this.emoji + ")";
        }
    }
}
