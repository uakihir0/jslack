package com.github.seratch.jslack.api.model.dialog;

/**
 * Represents a <a href="https://api.slack.com/dialogs#text_elements">text</a>
 * dialog element<p>
 * <p>
 * {@code Text} elements are single-line plain text fields.
 */
public class DialogTextElement implements DialogElement {

    /**
     * Label displayed to user. Required. No more than 24 characters.
     */
    private String label;

    /**
     * Name of form element. Required. No more than 300 characters.
     */
    private String name;

    /**
     * Type of element.  For a text element, the type is always
     * {@code text} . It's required.
     *
     * @see <a href="https://api.slack.com/dialogs#elements">Dialog form elements</a>
     */
    private final String type = "text";

    /**
     * A default value for this field. Up to 500 characters.
     */
    String value;

    /**
     * A string displayed as needed to help guide users in completing the element.
     * 150 character maximum.
     */
    private String placeholder;

    /**
     * Provide {@code true} when the form element is not required. By default,
     * form elements are required.
     */
    boolean optional;

    /**
     * Maximum input length allowed for element. Up to 150 characters. Defaults to 150.
     */
    public int maxLength;

    /**
     * Minimum input length allowed for element.
     * Type {@code text}: Up to 150 characters. Defaults to 0.
     */
    int minLength;

    /**
     * Helpful text provided to assist users in answering a question. Up to 150 characters.
     */
    String hint;

    /**
     * Subtype for this text type element (e.g. Number)
     */
    DialogSubType subtype;

    DialogTextElement(String label, String name, String value, String placeholder, boolean optional, int maxLength, int minLength, String hint, DialogSubType subtype) {
        this.label = label;
        this.name = name;
        this.value = value;
        this.placeholder = placeholder;
        this.optional = optional;
        this.maxLength = maxLength;
        this.minLength = minLength;
        this.hint = hint;
        this.subtype = subtype;
    }

    public static DialogTextElementBuilder builder() {
        return new DialogTextElementBuilder();
    }

    public String getLabel() {
        return this.label;
    }

    public String getName() {
        return this.name;
    }

    public String getType() {
        return this.type;
    }

    public String getValue() {
        return this.value;
    }

    public String getPlaceholder() {
        return this.placeholder;
    }

    public boolean isOptional() {
        return this.optional;
    }

    public int getMaxLength() {
        return this.maxLength;
    }

    public int getMinLength() {
        return this.minLength;
    }

    public String getHint() {
        return this.hint;
    }

    public DialogSubType getSubtype() {
        return this.subtype;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void setPlaceholder(String placeholder) {
        this.placeholder = placeholder;
    }

    public void setOptional(boolean optional) {
        this.optional = optional;
    }

    public void setMaxLength(int maxLength) {
        this.maxLength = maxLength;
    }

    public void setMinLength(int minLength) {
        this.minLength = minLength;
    }

    public void setHint(String hint) {
        this.hint = hint;
    }

    public void setSubtype(DialogSubType subtype) {
        this.subtype = subtype;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof DialogTextElement)) return false;
        final DialogTextElement other = (DialogTextElement) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$label = this.getLabel();
        final Object other$label = other.getLabel();
        if (this$label == null ? other$label != null : !this$label.equals(other$label)) return false;
        final Object this$name = this.getName();
        final Object other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
        final Object this$type = this.getType();
        final Object other$type = other.getType();
        if (this$type == null ? other$type != null : !this$type.equals(other$type)) return false;
        final Object this$value = this.getValue();
        final Object other$value = other.getValue();
        if (this$value == null ? other$value != null : !this$value.equals(other$value)) return false;
        final Object this$placeholder = this.getPlaceholder();
        final Object other$placeholder = other.getPlaceholder();
        if (this$placeholder == null ? other$placeholder != null : !this$placeholder.equals(other$placeholder))
            return false;
        if (this.isOptional() != other.isOptional()) return false;
        if (this.getMaxLength() != other.getMaxLength()) return false;
        if (this.getMinLength() != other.getMinLength()) return false;
        final Object this$hint = this.getHint();
        final Object other$hint = other.getHint();
        if (this$hint == null ? other$hint != null : !this$hint.equals(other$hint)) return false;
        final Object this$subtype = this.getSubtype();
        final Object other$subtype = other.getSubtype();
        if (this$subtype == null ? other$subtype != null : !this$subtype.equals(other$subtype)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof DialogTextElement;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $label = this.getLabel();
        result = result * PRIME + ($label == null ? 43 : $label.hashCode());
        final Object $name = this.getName();
        result = result * PRIME + ($name == null ? 43 : $name.hashCode());
        final Object $type = this.getType();
        result = result * PRIME + ($type == null ? 43 : $type.hashCode());
        final Object $value = this.getValue();
        result = result * PRIME + ($value == null ? 43 : $value.hashCode());
        final Object $placeholder = this.getPlaceholder();
        result = result * PRIME + ($placeholder == null ? 43 : $placeholder.hashCode());
        result = result * PRIME + (this.isOptional() ? 79 : 97);
        result = result * PRIME + this.getMaxLength();
        result = result * PRIME + this.getMinLength();
        final Object $hint = this.getHint();
        result = result * PRIME + ($hint == null ? 43 : $hint.hashCode());
        final Object $subtype = this.getSubtype();
        result = result * PRIME + ($subtype == null ? 43 : $subtype.hashCode());
        return result;
    }

    public String toString() {
        return "DialogTextElement(label=" + this.getLabel() + ", name=" + this.getName() + ", type=" + this.getType() + ", value=" + this.getValue() + ", placeholder=" + this.getPlaceholder() + ", optional=" + this.isOptional() + ", maxLength=" + this.getMaxLength() + ", minLength=" + this.getMinLength() + ", hint=" + this.getHint() + ", subtype=" + this.getSubtype() + ")";
    }

    public static class DialogTextElementBuilder {
        private String label;
        private String name;
        private String value;
        private String placeholder;
        private boolean optional;
        private int maxLength;
        private int minLength;
        private String hint;
        private DialogSubType subtype;

        DialogTextElementBuilder() {
        }

        public DialogTextElement.DialogTextElementBuilder label(String label) {
            this.label = label;
            return this;
        }

        public DialogTextElement.DialogTextElementBuilder name(String name) {
            this.name = name;
            return this;
        }

        public DialogTextElement.DialogTextElementBuilder value(String value) {
            this.value = value;
            return this;
        }

        public DialogTextElement.DialogTextElementBuilder placeholder(String placeholder) {
            this.placeholder = placeholder;
            return this;
        }

        public DialogTextElement.DialogTextElementBuilder optional(boolean optional) {
            this.optional = optional;
            return this;
        }

        public DialogTextElement.DialogTextElementBuilder maxLength(int maxLength) {
            this.maxLength = maxLength;
            return this;
        }

        public DialogTextElement.DialogTextElementBuilder minLength(int minLength) {
            this.minLength = minLength;
            return this;
        }

        public DialogTextElement.DialogTextElementBuilder hint(String hint) {
            this.hint = hint;
            return this;
        }

        public DialogTextElement.DialogTextElementBuilder subtype(DialogSubType subtype) {
            this.subtype = subtype;
            return this;
        }

        public DialogTextElement build() {
            return new DialogTextElement(label, name, value, placeholder, optional, maxLength, minLength, hint, subtype);
        }

        public String toString() {
            return "DialogTextElement.DialogTextElementBuilder(label=" + this.label + ", name=" + this.name + ", value=" + this.value + ", placeholder=" + this.placeholder + ", optional=" + this.optional + ", maxLength=" + this.maxLength + ", minLength=" + this.minLength + ", hint=" + this.hint + ", subtype=" + this.subtype + ")";
        }
    }
}
