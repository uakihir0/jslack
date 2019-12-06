package com.github.seratch.jslack.api.model.view;

public class ViewTitle {
    private String type;
    private String text;
    private boolean emoji;

    public ViewTitle(String type, String text, boolean emoji) {
        this.type = type;
        this.text = text;
        this.emoji = emoji;
    }

    public ViewTitle() {
    }

    public static ViewTitleBuilder builder() {
        return new ViewTitleBuilder();
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

    public static class ViewTitleBuilder {
        private String type;
        private String text;
        private boolean emoji;

        ViewTitleBuilder() {
        }

        public ViewTitle.ViewTitleBuilder type(String type) {
            this.type = type;
            return this;
        }

        public ViewTitle.ViewTitleBuilder text(String text) {
            this.text = text;
            return this;
        }

        public ViewTitle.ViewTitleBuilder emoji(boolean emoji) {
            this.emoji = emoji;
            return this;
        }

        public ViewTitle build() {
            return new ViewTitle(type, text, emoji);
        }

        public String toString() {
            return "ViewTitle.ViewTitleBuilder(type=" + this.type + ", text=" + this.text + ", emoji=" + this.emoji + ")";
        }
    }
}
