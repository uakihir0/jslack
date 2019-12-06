package com.github.seratch.jslack.api.model.dialog;

/**
 * A dialog element option used with {@link DialogSelectElement}s
 */
public class DialogOption {
    private String label;
    private String value;

    public DialogOption(String label, String value) {
        this.label = label;
        this.value = value;
    }

    public DialogOption() {
    }

    public static DialogOptionBuilder builder() {
        return new DialogOptionBuilder();
    }

    public String getLabel() {
        return this.label;
    }

    public String getValue() {
        return this.value;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public static class DialogOptionBuilder {
        private String label;
        private String value;

        DialogOptionBuilder() {
        }

        public DialogOption.DialogOptionBuilder label(String label) {
            this.label = label;
            return this;
        }

        public DialogOption.DialogOptionBuilder value(String value) {
            this.value = value;
            return this;
        }

        public DialogOption build() {
            return new DialogOption(label, value);
        }

        public String toString() {
            return "DialogOption.DialogOptionBuilder(label=" + this.label + ", value=" + this.value + ")";
        }
    }
}
