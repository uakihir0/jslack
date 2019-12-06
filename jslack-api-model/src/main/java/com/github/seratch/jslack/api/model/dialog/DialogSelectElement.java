package com.github.seratch.jslack.api.model.dialog;

import java.util.List;

/**
 * Represents a <a href="https://api.slack.com/dialogs#select_elements">select</a>
 * dialog element<p>
 * <p>
 * Use the {@code select} element for multiple choice selections allowing users to pick a
 * single item from a list. True to web roots, this selection is displayed as a dropdown
 * menu.
 */
public class DialogSelectElement implements DialogElement {

    /**
     * Label displayed to user. Required. No more than 24 characters.
     */
    private String label;

    /**
     * Name of form element. Required. No more than 300 characters.
     */
    private String name;

    /**
     * Type of element.  For a dropdown (select), the type is always
     * {@code select} . It's required.
     *
     * @see <a href="https://api.slack.com/dialogs#elements">Dialog form elements</a>
     */
    private final String type = "select";

    /**
     * A default value for this field.  Must match a value presented in {@link DialogOption}s.
     */
    String value;

    /**
     * A string displayed as needed to help guide users in completing the element.
     * 150 character maximum.
     */
    private String placeholder;

    /**
     * Provide true when the form element is not required. By default, form elements are
     * required.
     */
    private boolean optional;

    /**
     * Provide up to 100 option element attributes. Required for this type.
     */
    private List<DialogOption> options;

    public DialogSelectElement(String label, String name, String value, String placeholder, boolean optional, List<DialogOption> options) {
        this.label = label;
        this.name = name;
        this.value = value;
        this.placeholder = placeholder;
        this.optional = optional;
        this.options = options;
    }

    public DialogSelectElement() {
    }

    public static DialogSelectElementBuilder builder() {
        return new DialogSelectElementBuilder();
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

    public List<DialogOption> getOptions() {
        return this.options;
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

    public void setOptions(List<DialogOption> options) {
        this.options = options;
    }

    public static class DialogSelectElementBuilder {
        private String label;
        private String name;
        private String value;
        private String placeholder;
        private boolean optional;
        private List<DialogOption> options;

        DialogSelectElementBuilder() {
        }

        public DialogSelectElement.DialogSelectElementBuilder label(String label) {
            this.label = label;
            return this;
        }

        public DialogSelectElement.DialogSelectElementBuilder name(String name) {
            this.name = name;
            return this;
        }

        public DialogSelectElement.DialogSelectElementBuilder value(String value) {
            this.value = value;
            return this;
        }

        public DialogSelectElement.DialogSelectElementBuilder placeholder(String placeholder) {
            this.placeholder = placeholder;
            return this;
        }

        public DialogSelectElement.DialogSelectElementBuilder optional(boolean optional) {
            this.optional = optional;
            return this;
        }

        public DialogSelectElement.DialogSelectElementBuilder options(List<DialogOption> options) {
            this.options = options;
            return this;
        }

        public DialogSelectElement build() {
            return new DialogSelectElement(label, name, value, placeholder, optional, options);
        }

        public String toString() {
            return "DialogSelectElement.DialogSelectElementBuilder(label=" + this.label + ", name=" + this.name + ", value=" + this.value + ", placeholder=" + this.placeholder + ", optional=" + this.optional + ", options=" + this.options + ")";
        }
    }
}
