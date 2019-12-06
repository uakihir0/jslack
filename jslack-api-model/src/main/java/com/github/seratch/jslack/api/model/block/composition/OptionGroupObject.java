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
