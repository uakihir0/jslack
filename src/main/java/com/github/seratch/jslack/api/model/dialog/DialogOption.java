package com.github.seratch.jslack.api.model.dialog;

/**
 * A dialog element option used with {@link DialogSelectElement}s
 */
public class DialogOption {
    private String label;
    private String value;

    @java.beans.ConstructorProperties({"label", "value"})
    DialogOption(String label, String value) {
        this.label = label;
        this.value = value;
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

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof DialogOption)) return false;
        final DialogOption other = (DialogOption) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$label = this.getLabel();
        final Object other$label = other.getLabel();
        if (this$label == null ? other$label != null : !this$label.equals(other$label)) return false;
        final Object this$value = this.getValue();
        final Object other$value = other.getValue();
        if (this$value == null ? other$value != null : !this$value.equals(other$value)) return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $label = this.getLabel();
        result = result * PRIME + ($label == null ? 43 : $label.hashCode());
        final Object $value = this.getValue();
        result = result * PRIME + ($value == null ? 43 : $value.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof DialogOption;
    }

    public String toString() {
        return "DialogOption(label=" + this.getLabel() + ", value=" + this.getValue() + ")";
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
