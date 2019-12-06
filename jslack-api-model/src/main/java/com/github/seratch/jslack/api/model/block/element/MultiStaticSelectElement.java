package com.github.seratch.jslack.api.model.block.element;

import com.github.seratch.jslack.api.model.block.composition.ConfirmationDialogObject;
import com.github.seratch.jslack.api.model.block.composition.OptionGroupObject;
import com.github.seratch.jslack.api.model.block.composition.OptionObject;
import com.github.seratch.jslack.api.model.block.composition.PlainTextObject;

import java.util.List;

/**
 * https://api.slack.com/reference/block-kit/block-elements#multi_select
 */
public class MultiStaticSelectElement extends BlockElement {
    public static final String TYPE = "multi_static_select";
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

    // https://github.com/seratch/jslack/pull/103
    // The reason I didn't initialize the List<> fields is because Slack (sometimes) gives errors
    // when it encounters an empty list in the generated JSON.
    // The proper solution if/when you don't want un-initialized fields is to have a Gson type adapter that skips empty lists
    // (e.g. something like https://stackoverflow.com/questions/11942118/how-do-you-get-gson-to-omit-null-or-empty-objects-and-empty-arrays-and-lists)
    private List<OptionGroupObject> optionGroups;

    private List<OptionObject> initialOptions;
    private ConfirmationDialogObject confirm;
    private Integer maxSelectedItems;

    public MultiStaticSelectElement(String fallback, PlainTextObject placeholder, String actionId, List<OptionObject> options, List<OptionGroupObject> optionGroups, List<OptionObject> initialOptions, ConfirmationDialogObject confirm, Integer maxSelectedItems) {
        this.fallback = fallback;
        this.placeholder = placeholder;
        this.actionId = actionId;
        this.options = options;
        this.optionGroups = optionGroups;
        this.initialOptions = initialOptions;
        this.confirm = confirm;
        this.maxSelectedItems = maxSelectedItems;
    }

    public MultiStaticSelectElement() {
    }

    public static MultiStaticSelectElementBuilder builder() {
        return new MultiStaticSelectElementBuilder();
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

    public List<OptionGroupObject> getOptionGroups() {
        return this.optionGroups;
    }

    public List<OptionObject> getInitialOptions() {
        return this.initialOptions;
    }

    public ConfirmationDialogObject getConfirm() {
        return this.confirm;
    }

    public Integer getMaxSelectedItems() {
        return this.maxSelectedItems;
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

    public void setOptionGroups(List<OptionGroupObject> optionGroups) {
        this.optionGroups = optionGroups;
    }

    public void setInitialOptions(List<OptionObject> initialOptions) {
        this.initialOptions = initialOptions;
    }

    public void setConfirm(ConfirmationDialogObject confirm) {
        this.confirm = confirm;
    }

    public void setMaxSelectedItems(Integer maxSelectedItems) {
        this.maxSelectedItems = maxSelectedItems;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof MultiStaticSelectElement)) return false;
        final MultiStaticSelectElement other = (MultiStaticSelectElement) o;
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
        final Object this$optionGroups = this.getOptionGroups();
        final Object other$optionGroups = other.getOptionGroups();
        if (this$optionGroups == null ? other$optionGroups != null : !this$optionGroups.equals(other$optionGroups))
            return false;
        final Object this$initialOptions = this.getInitialOptions();
        final Object other$initialOptions = other.getInitialOptions();
        if (this$initialOptions == null ? other$initialOptions != null : !this$initialOptions.equals(other$initialOptions))
            return false;
        final Object this$confirm = this.getConfirm();
        final Object other$confirm = other.getConfirm();
        if (this$confirm == null ? other$confirm != null : !this$confirm.equals(other$confirm)) return false;
        final Object this$maxSelectedItems = this.getMaxSelectedItems();
        final Object other$maxSelectedItems = other.getMaxSelectedItems();
        if (this$maxSelectedItems == null ? other$maxSelectedItems != null : !this$maxSelectedItems.equals(other$maxSelectedItems))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof MultiStaticSelectElement;
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
        final Object $optionGroups = this.getOptionGroups();
        result = result * PRIME + ($optionGroups == null ? 43 : $optionGroups.hashCode());
        final Object $initialOptions = this.getInitialOptions();
        result = result * PRIME + ($initialOptions == null ? 43 : $initialOptions.hashCode());
        final Object $confirm = this.getConfirm();
        result = result * PRIME + ($confirm == null ? 43 : $confirm.hashCode());
        final Object $maxSelectedItems = this.getMaxSelectedItems();
        result = result * PRIME + ($maxSelectedItems == null ? 43 : $maxSelectedItems.hashCode());
        return result;
    }

    public static class MultiStaticSelectElementBuilder {
        private String fallback;
        private PlainTextObject placeholder;
        private String actionId;
        private List<OptionObject> options;
        private List<OptionGroupObject> optionGroups;
        private List<OptionObject> initialOptions;
        private ConfirmationDialogObject confirm;
        private Integer maxSelectedItems;

        MultiStaticSelectElementBuilder() {
        }

        public MultiStaticSelectElement.MultiStaticSelectElementBuilder fallback(String fallback) {
            this.fallback = fallback;
            return this;
        }

        public MultiStaticSelectElement.MultiStaticSelectElementBuilder placeholder(PlainTextObject placeholder) {
            this.placeholder = placeholder;
            return this;
        }

        public MultiStaticSelectElement.MultiStaticSelectElementBuilder actionId(String actionId) {
            this.actionId = actionId;
            return this;
        }

        public MultiStaticSelectElement.MultiStaticSelectElementBuilder options(List<OptionObject> options) {
            this.options = options;
            return this;
        }

        public MultiStaticSelectElement.MultiStaticSelectElementBuilder optionGroups(List<OptionGroupObject> optionGroups) {
            this.optionGroups = optionGroups;
            return this;
        }

        public MultiStaticSelectElement.MultiStaticSelectElementBuilder initialOptions(List<OptionObject> initialOptions) {
            this.initialOptions = initialOptions;
            return this;
        }

        public MultiStaticSelectElement.MultiStaticSelectElementBuilder confirm(ConfirmationDialogObject confirm) {
            this.confirm = confirm;
            return this;
        }

        public MultiStaticSelectElement.MultiStaticSelectElementBuilder maxSelectedItems(Integer maxSelectedItems) {
            this.maxSelectedItems = maxSelectedItems;
            return this;
        }

        public MultiStaticSelectElement build() {
            return new MultiStaticSelectElement(fallback, placeholder, actionId, options, optionGroups, initialOptions, confirm, maxSelectedItems);
        }

        public String toString() {
            return "MultiStaticSelectElement.MultiStaticSelectElementBuilder(fallback=" + this.fallback + ", placeholder=" + this.placeholder + ", actionId=" + this.actionId + ", options=" + this.options + ", optionGroups=" + this.optionGroups + ", initialOptions=" + this.initialOptions + ", confirm=" + this.confirm + ", maxSelectedItems=" + this.maxSelectedItems + ")";
        }
    }
}
