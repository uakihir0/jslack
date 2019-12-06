package com.github.seratch.jslack.api.model.block.element;

import com.github.seratch.jslack.api.model.block.composition.ConfirmationDialogObject;
import com.github.seratch.jslack.api.model.block.composition.OptionObject;
import com.github.seratch.jslack.api.model.block.composition.PlainTextObject;

import java.util.List;

/**
 * https://api.slack.com/reference/block-kit/block-elements#radio
 */
public class RadioButtonsElement extends BlockElement {
    public static final String TYPE = "radio_buttons";
    private final String type = TYPE;
    private String fallback;

    private PlainTextObject placeholder;
    private String actionId;

    // https://github.com/seratch/jslack/pull/103
    // The reason I didn't initialize the List<> fields is because Slack (sometimes) gives errors
    // when it encounters an empty list in the generated JSON.
    // The proper solution if/when you don't want un-initialized fields is to have a Gson type adapter that skips empty lists
    // (e.g. something like https://stackoverflow.com/questions/11942118/how-do-you-get-gson-to-omit-null-or-empty-objects-and-empty-arrays-and-lists)
    private List<OptionObject> options;

    private OptionObject initialOption;
    private ConfirmationDialogObject confirm;

    public RadioButtonsElement(String fallback, PlainTextObject placeholder, String actionId, List<OptionObject> options, OptionObject initialOption, ConfirmationDialogObject confirm) {
        this.fallback = fallback;
        this.placeholder = placeholder;
        this.actionId = actionId;
        this.options = options;
        this.initialOption = initialOption;
        this.confirm = confirm;
    }

    public RadioButtonsElement() {
    }

    public static RadioButtonsElementBuilder builder() {
        return new RadioButtonsElementBuilder();
    }

    public String getType() {
        return this.type;
    }

    public String getFallback() {
        return this.fallback;
    }

    public PlainTextObject getPlaceholder() {
        return this.placeholder;
    }

    public String getActionId() {
        return this.actionId;
    }

    public List<OptionObject> getOptions() {
        return this.options;
    }

    public OptionObject getInitialOption() {
        return this.initialOption;
    }

    public ConfirmationDialogObject getConfirm() {
        return this.confirm;
    }

    public void setFallback(String fallback) {
        this.fallback = fallback;
    }

    public void setPlaceholder(PlainTextObject placeholder) {
        this.placeholder = placeholder;
    }

    public void setActionId(String actionId) {
        this.actionId = actionId;
    }

    public void setOptions(List<OptionObject> options) {
        this.options = options;
    }

    public void setInitialOption(OptionObject initialOption) {
        this.initialOption = initialOption;
    }

    public void setConfirm(ConfirmationDialogObject confirm) {
        this.confirm = confirm;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof RadioButtonsElement)) return false;
        final RadioButtonsElement other = (RadioButtonsElement) o;
        if (!other.canEqual((Object) this)) return false;
        if (!super.equals(o)) return false;
        final Object this$type = this.getType();
        final Object other$type = other.getType();
        if (this$type == null ? other$type != null : !this$type.equals(other$type)) return false;
        final Object this$fallback = this.getFallback();
        final Object other$fallback = other.getFallback();
        if (this$fallback == null ? other$fallback != null : !this$fallback.equals(other$fallback)) return false;
        final Object this$placeholder = this.getPlaceholder();
        final Object other$placeholder = other.getPlaceholder();
        if (this$placeholder == null ? other$placeholder != null : !this$placeholder.equals(other$placeholder))
            return false;
        final Object this$actionId = this.getActionId();
        final Object other$actionId = other.getActionId();
        if (this$actionId == null ? other$actionId != null : !this$actionId.equals(other$actionId)) return false;
        final Object this$options = this.getOptions();
        final Object other$options = other.getOptions();
        if (this$options == null ? other$options != null : !this$options.equals(other$options)) return false;
        final Object this$initialOption = this.getInitialOption();
        final Object other$initialOption = other.getInitialOption();
        if (this$initialOption == null ? other$initialOption != null : !this$initialOption.equals(other$initialOption))
            return false;
        final Object this$confirm = this.getConfirm();
        final Object other$confirm = other.getConfirm();
        if (this$confirm == null ? other$confirm != null : !this$confirm.equals(other$confirm)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof RadioButtonsElement;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        final Object $type = this.getType();
        result = result * PRIME + ($type == null ? 43 : $type.hashCode());
        final Object $fallback = this.getFallback();
        result = result * PRIME + ($fallback == null ? 43 : $fallback.hashCode());
        final Object $placeholder = this.getPlaceholder();
        result = result * PRIME + ($placeholder == null ? 43 : $placeholder.hashCode());
        final Object $actionId = this.getActionId();
        result = result * PRIME + ($actionId == null ? 43 : $actionId.hashCode());
        final Object $options = this.getOptions();
        result = result * PRIME + ($options == null ? 43 : $options.hashCode());
        final Object $initialOption = this.getInitialOption();
        result = result * PRIME + ($initialOption == null ? 43 : $initialOption.hashCode());
        final Object $confirm = this.getConfirm();
        result = result * PRIME + ($confirm == null ? 43 : $confirm.hashCode());
        return result;
    }

    public static class RadioButtonsElementBuilder {
        private String fallback;
        private PlainTextObject placeholder;
        private String actionId;
        private List<OptionObject> options;
        private OptionObject initialOption;
        private ConfirmationDialogObject confirm;

        RadioButtonsElementBuilder() {
        }

        public RadioButtonsElement.RadioButtonsElementBuilder fallback(String fallback) {
            this.fallback = fallback;
            return this;
        }

        public RadioButtonsElement.RadioButtonsElementBuilder placeholder(PlainTextObject placeholder) {
            this.placeholder = placeholder;
            return this;
        }

        public RadioButtonsElement.RadioButtonsElementBuilder actionId(String actionId) {
            this.actionId = actionId;
            return this;
        }

        public RadioButtonsElement.RadioButtonsElementBuilder options(List<OptionObject> options) {
            this.options = options;
            return this;
        }

        public RadioButtonsElement.RadioButtonsElementBuilder initialOption(OptionObject initialOption) {
            this.initialOption = initialOption;
            return this;
        }

        public RadioButtonsElement.RadioButtonsElementBuilder confirm(ConfirmationDialogObject confirm) {
            this.confirm = confirm;
            return this;
        }

        public RadioButtonsElement build() {
            return new RadioButtonsElement(fallback, placeholder, actionId, options, initialOption, confirm);
        }

        public String toString() {
            return "RadioButtonsElement.RadioButtonsElementBuilder(fallback=" + this.fallback + ", placeholder=" + this.placeholder + ", actionId=" + this.actionId + ", options=" + this.options + ", initialOption=" + this.initialOption + ", confirm=" + this.confirm + ")";
        }
    }
}
