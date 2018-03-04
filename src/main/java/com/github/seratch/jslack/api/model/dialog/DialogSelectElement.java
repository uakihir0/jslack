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

    @java.beans.ConstructorProperties({"label", "name", "value", "placeholder", "optional", "options"})
    DialogSelectElement(String label, String name, String value, String placeholder, boolean optional, List<DialogOption> options) {
        this.label = label;
        this.name = name;
        this.value = value;
        this.placeholder = placeholder;
        this.optional = optional;
        this.options = options;
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

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof DialogSelectElement)) return false;
        final DialogSelectElement other = (DialogSelectElement) o;
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
        final Object this$options = this.getOptions();
        final Object other$options = other.getOptions();
        if (this$options == null ? other$options != null : !this$options.equals(other$options)) return false;
        return true;
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
        final Object $options = this.getOptions();
        result = result * PRIME + ($options == null ? 43 : $options.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof DialogSelectElement;
    }

    public String toString() {
        return "DialogSelectElement(label=" + this.getLabel() + ", name=" + this.getName() + ", type=" + this.getType() + ", value=" + this.getValue() + ", placeholder=" + this.getPlaceholder() + ", optional=" + this.isOptional() + ", options=" + this.getOptions() + ")";
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
