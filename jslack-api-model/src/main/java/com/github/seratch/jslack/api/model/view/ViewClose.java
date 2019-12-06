package com.github.seratch.jslack.api.model.view;

public class ViewClose {
    private String type;
    private String text;
    private boolean emoji;

    public ViewClose(String type, String text, boolean emoji) {
        this.type = type;
        this.text = text;
        this.emoji = emoji;
    }

    public ViewClose() {
    }

    public static ViewCloseBuilder builder() {
        return new ViewCloseBuilder();
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

    public static class ViewCloseBuilder {
        private String type;
        private String text;
        private boolean emoji;

        ViewCloseBuilder() {
        }

        public ViewClose.ViewCloseBuilder type(String type) {
            this.type = type;
            return this;
        }

        public ViewClose.ViewCloseBuilder text(String text) {
            this.text = text;
            return this;
        }

        public ViewClose.ViewCloseBuilder emoji(boolean emoji) {
            this.emoji = emoji;
            return this;
        }

        public ViewClose build() {
            return new ViewClose(type, text, emoji);
        }

        public String toString() {
            return "ViewClose.ViewCloseBuilder(type=" + this.type + ", text=" + this.text + ", emoji=" + this.emoji + ")";
        }
    }
}
