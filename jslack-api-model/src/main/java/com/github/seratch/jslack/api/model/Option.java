package com.github.seratch.jslack.api.model;

public class Option {
    private String text;
    private String value;

    public Option(String text, String value) {
        this.text = text;
        this.value = value;
    }

    public Option() {
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
