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

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof OptionObject)) return false;
        final OptionObject other = (OptionObject) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$text = this.getText();
        final Object other$text = other.getText();
        if (this$text == null ? other$text != null : !this$text.equals(other$text)) return false;
        final Object this$value = this.getValue();
        final Object other$value = other.getValue();
        if (this$value == null ? other$value != null : !this$value.equals(other$value)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof OptionObject;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $text = this.getText();
        result = result * PRIME + ($text == null ? 43 : $text.hashCode());
        final Object $value = this.getValue();
        result = result * PRIME + ($value == null ? 43 : $value.hashCode());
        return result;
    }

    public String toString() {
        return "OptionObject(text=" + this.getText() + ", value=" + this.getValue() + ")";
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
