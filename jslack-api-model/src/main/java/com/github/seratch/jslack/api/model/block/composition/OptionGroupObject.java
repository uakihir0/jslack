package com.github.seratch.jslack.api.model.block.composition;

import java.util.List;

/**
 * https://api.slack.com/reference/messaging/composition-objects#option-group
 */
public class OptionGroupObject {
    private PlainTextObject label;

    // https://github.com/seratch/jslack/pull/103
    // The reason I didn't initialize the List<> fields is because Slack (sometimes) gives errors
    // when it encounters an empty list in the generated JSON.
    // The proper solution if/when you don't want un-initialized fields is to have a Gson type adapter that skips empty lists
    // (e.g. something like https://stackoverflow.com/questions/11942118/how-do-you-get-gson-to-omit-null-or-empty-objects-and-empty-arrays-and-lists)
    private List<OptionObject> options;

    public OptionGroupObject(PlainTextObject label, List<OptionObject> options) {
        this.label = label;
        this.options = options;
    }

    public OptionGroupObject() {
    }

    public static OptionGroupObjectBuilder builder() {
        return new OptionGroupObjectBuilder();
    }

    public PlainTextObject getLabel() {
        return this.label;
    }

    public List<OptionObject> getOptions() {
        return this.options;
    }

    public void setLabel(PlainTextObject label) {
        this.label = label;
    }

    public void setOptions(List<OptionObject> options) {
        this.options = options;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof OptionGroupObject)) return false;
        final OptionGroupObject other = (OptionGroupObject) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$label = this.getLabel();
        final Object other$label = other.getLabel();
        if (this$label == null ? other$label != null : !this$label.equals(other$label)) return false;
        final Object this$options = this.getOptions();
        final Object other$options = other.getOptions();
        if (this$options == null ? other$options != null : !this$options.equals(other$options)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof OptionGroupObject;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $label = this.getLabel();
        result = result * PRIME + ($label == null ? 43 : $label.hashCode());
        final Object $options = this.getOptions();
        result = result * PRIME + ($options == null ? 43 : $options.hashCode());
        return result;
    }

    public String toString() {
        return "OptionGroupObject(label=" + this.getLabel() + ", options=" + this.getOptions() + ")";
    }

    public static class OptionGroupObjectBuilder {
        private PlainTextObject label;
        private List<OptionObject> options;

        OptionGroupObjectBuilder() {
        }

        public OptionGroupObject.OptionGroupObjectBuilder label(PlainTextObject label) {
            this.label = label;
            return this;
        }

        public OptionGroupObject.OptionGroupObjectBuilder options(List<OptionObject> options) {
            this.options = options;
            return this;
        }

        public OptionGroupObject build() {
            return new OptionGroupObject(label, options);
        }

        public String toString() {
            return "OptionGroupObject.OptionGroupObjectBuilder(label=" + this.label + ", options=" + this.options + ")";
        }
    }
}
