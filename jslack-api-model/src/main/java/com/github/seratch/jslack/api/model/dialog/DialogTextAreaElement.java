package com.github.seratch.jslack.api.model.dialog;

/**
 * Represents a <a href="https://api.slack.com/dialogs#textarea_elements">textarea</a>
 * dialog element<p>
 * <p>
 * A {@code textarea} is a multi-line plain text editing control. You've likely encountered
 * these on the world wide web. Use this element if you want a relatively long answer from
 * users.
 */
public class DialogTextAreaElement implements DialogElement {

    /**
     * Label displayed to user. Required. No more than 24 characters.
     */
    private String label;

    /**
     * Name of form element. Required. No more than 300 characters.
     */
    private String name;

    /**
     * Type of element.  For a textarea, the type is always {@code textarea} . It's required.
     *
     * @see <a href="https://api.slack.com/dialogs#elements">Dialog form elements</a>
     */
    private final String type = "textarea";

    /**
     * A default value for this field.  Up to 500 characters.
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
     * Maximum input length allowed for element. 0-500 characters. Defaults to 150.
     */
    public int maxLength;

    /**
     * Minimum input length allowed for element. 1-500 characters. Defaults to 0.
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

    public DialogTextAreaElement(String label, String name, String value, String placeholder, boolean optional, int maxLength, int minLength, String hint, DialogSubType subtype) {
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

    public DialogTextAreaElement() {
    }

    public static DialogTextAreaElementBuilder builder() {
        return new DialogTextAreaElementBuilder();
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

    public static class DialogTextAreaElementBuilder {
        private String label;
        private String name;
        private String value;
        private String placeholder;
        private boolean optional;
        private int maxLength;
        private int minLength;
        private String hint;
        private DialogSubType subtype;

        DialogTextAreaElementBuilder() {
        }

        public DialogTextAreaElement.DialogTextAreaElementBuilder label(String label) {
            this.label = label;
            return this;
        }

        public DialogTextAreaElement.DialogTextAreaElementBuilder name(String name) {
            this.name = name;
            return this;
        }

        public DialogTextAreaElement.DialogTextAreaElementBuilder value(String value) {
            this.value = value;
            return this;
        }

        public DialogTextAreaElement.DialogTextAreaElementBuilder placeholder(String placeholder) {
            this.placeholder = placeholder;
            return this;
        }

        public DialogTextAreaElement.DialogTextAreaElementBuilder optional(boolean optional) {
            this.optional = optional;
            return this;
        }

        public DialogTextAreaElement.DialogTextAreaElementBuilder maxLength(int maxLength) {
            this.maxLength = maxLength;
            return this;
        }

        public DialogTextAreaElement.DialogTextAreaElementBuilder minLength(int minLength) {
            this.minLength = minLength;
            return this;
        }

        public DialogTextAreaElement.DialogTextAreaElementBuilder hint(String hint) {
            this.hint = hint;
            return this;
        }

        public DialogTextAreaElement.DialogTextAreaElementBuilder subtype(DialogSubType subtype) {
            this.subtype = subtype;
            return this;
        }

        public DialogTextAreaElement build() {
            return new DialogTextAreaElement(label, name, value, placeholder, optional, maxLength, minLength, hint, subtype);
        }

        public String toString() {
            return "DialogTextAreaElement.DialogTextAreaElementBuilder(label=" + this.label + ", name=" + this.name + ", value=" + this.value + ", placeholder=" + this.placeholder + ", optional=" + this.optional + ", maxLength=" + this.maxLength + ", minLength=" + this.minLength + ", hint=" + this.hint + ", subtype=" + this.subtype + ")";
        }
    }
}
