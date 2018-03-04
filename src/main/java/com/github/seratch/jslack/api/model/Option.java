package com.github.seratch.jslack.api.model;

public class Option {
    private String text;
    private String value;

    @java.beans.ConstructorProperties({"text", "value"})
    Option(String text, String value) {
        this.text = text;
        this.value = value;
    }

    public static OptionBuilder builder() {
        return new OptionBuilder();
    }

    public String getText() {
        return this.text;
    }

    public String getValue() {
        return this.value;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof Option)) return false;
        final Option other = (Option) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$text = this.getText();
        final Object other$text = other.getText();
        if (this$text == null ? other$text != null : !this$text.equals(other$text)) return false;
        final Object this$value = this.getValue();
        final Object other$value = other.getValue();
        if (this$value == null ? other$value != null : !this$value.equals(other$value)) return false;
        return true;
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

    protected boolean canEqual(Object other) {
        return other instanceof Option;
    }

    public String toString() {
        return "Option(text=" + this.getText() + ", value=" + this.getValue() + ")";
    }

    public static class OptionBuilder {
        private String text;
        private String value;

        OptionBuilder() {
        }

        public Option.OptionBuilder text(String text) {
            this.text = text;
            return this;
        }

        public Option.OptionBuilder value(String value) {
            this.value = value;
            return this;
        }

        public Option build() {
            return new Option(text, value);
        }

        public String toString() {
            return "Option.OptionBuilder(text=" + this.text + ", value=" + this.value + ")";
        }
    }
}
