package com.github.seratch.jslack.api.model.block.composition;

/**
 * https://api.slack.com/reference/messaging/composition-objects#option
 */
public class OptionObject {
    private PlainTextObject text;
    private String value;

    public OptionObject(PlainTextObject text, String value) {
        this.text = text;
        this.value = value;
    }

    public OptionObject() {
    }

    public static OptionObjectBuilder builder() {
        return new OptionObjectBuilder();
    }

    public PlainTextObject getText() {
        return this.text;
    }

    public String getValue() {
        return this.value;
    }

    public void setText(PlainTextObject text) {
        this.text = text;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public static class OptionObjectBuilder {
        private PlainTextObject text;
        private String value;

        OptionObjectBuilder() {
        }

        public OptionObject.OptionObjectBuilder text(PlainTextObject text) {
            this.text = text;
            return this;
        }

        public OptionObject.OptionObjectBuilder value(String value) {
            this.value = value;
            return this;
        }

        public OptionObject build() {
            return new OptionObject(text, value);
        }

        public String toString() {
            return "OptionObject.OptionObjectBuilder(text=" + this.text + ", value=" + this.value + ")";
        }
    }
}
