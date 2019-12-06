package com.github.seratch.jslack.api.model.block.element;

import com.github.seratch.jslack.api.model.block.composition.ConfirmationDialogObject;
import com.github.seratch.jslack.api.model.block.composition.OptionObject;
import com.github.seratch.jslack.api.model.block.composition.PlainTextObject;

import java.util.List;

/**
 * https://api.slack.com/reference/block-kit/block-elements#multi_select
 */
public class MultiExternalSelectElement extends BlockElement {
    public static final String TYPE = "multi_external_select";
    private final String type = TYPE;
    private String fallback;
    private PlainTextObject placeholder;
    private String actionId;
    private List<OptionObject> initialOptions;
    private Integer minQueryLength;
    private ConfirmationDialogObject confirm;
    private Integer maxSelectedItems;

    public MultiExternalSelectElement(String fallback, PlainTextObject placeholder, String actionId, List<OptionObject> initialOptions, Integer minQueryLength, ConfirmationDialogObject confirm, Integer maxSelectedItems) {
        this.fallback = fallback;
        this.placeholder = placeholder;
        this.actionId = actionId;
        this.initialOptions = initialOptions;
        this.minQueryLength = minQueryLength;
        this.confirm = confirm;
        this.maxSelectedItems = maxSelectedItems;
    }

    public MultiExternalSelectElement() {
    }

    public static MultiExternalSelectElementBuilder builder() {
        return new MultiExternalSelectElementBuilder();
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

    public List<OptionObject> getInitialOptions() {
        return this.initialOptions;
    }

    public Integer getMinQueryLength() {
        return this.minQueryLength;
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

    public void setInitialOptions(List<OptionObject> initialOptions) {
        this.initialOptions = initialOptions;
    }

    public void setMinQueryLength(Integer minQueryLength) {
        this.minQueryLength = minQueryLength;
    }

    public void setConfirm(ConfirmationDialogObject confirm) {
        this.confirm = confirm;
    }

    public void setMaxSelectedItems(Integer maxSelectedItems) {
        this.maxSelectedItems = maxSelectedItems;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof MultiExternalSelectElement)) return false;
        final MultiExternalSelectElement other = (MultiExternalSelectElement) o;
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
        final Object this$initialOptions = this.getInitialOptions();
        final Object other$initialOptions = other.getInitialOptions();
        if (this$initialOptions == null ? other$initialOptions != null : !this$initialOptions.equals(other$initialOptions))
            return false;
        final Object this$minQueryLength = this.getMinQueryLength();
        final Object other$minQueryLength = other.getMinQueryLength();
        if (this$minQueryLength == null ? other$minQueryLength != null : !this$minQueryLength.equals(other$minQueryLength))
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
        return other instanceof MultiExternalSelectElement;
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
        final Object $initialOptions = this.getInitialOptions();
        result = result * PRIME + ($initialOptions == null ? 43 : $initialOptions.hashCode());
        final Object $minQueryLength = this.getMinQueryLength();
        result = result * PRIME + ($minQueryLength == null ? 43 : $minQueryLength.hashCode());
        final Object $confirm = this.getConfirm();
        result = result * PRIME + ($confirm == null ? 43 : $confirm.hashCode());
        final Object $maxSelectedItems = this.getMaxSelectedItems();
        result = result * PRIME + ($maxSelectedItems == null ? 43 : $maxSelectedItems.hashCode());
        return result;
    }

    public static class MultiExternalSelectElementBuilder {
        private String fallback;
        private PlainTextObject placeholder;
        private String actionId;
        private List<OptionObject> initialOptions;
        private Integer minQueryLength;
        private ConfirmationDialogObject confirm;
        private Integer maxSelectedItems;

        MultiExternalSelectElementBuilder() {
        }

        public MultiExternalSelectElement.MultiExternalSelectElementBuilder fallback(String fallback) {
            this.fallback = fallback;
            return this;
        }

        public MultiExternalSelectElement.MultiExternalSelectElementBuilder placeholder(PlainTextObject placeholder) {
            this.placeholder = placeholder;
            return this;
        }

        public MultiExternalSelectElement.MultiExternalSelectElementBuilder actionId(String actionId) {
            this.actionId = actionId;
            return this;
        }

        public MultiExternalSelectElement.MultiExternalSelectElementBuilder initialOptions(List<OptionObject> initialOptions) {
            this.initialOptions = initialOptions;
            return this;
        }

        public MultiExternalSelectElement.MultiExternalSelectElementBuilder minQueryLength(Integer minQueryLength) {
            this.minQueryLength = minQueryLength;
            return this;
        }

        public MultiExternalSelectElement.MultiExternalSelectElementBuilder confirm(ConfirmationDialogObject confirm) {
            this.confirm = confirm;
            return this;
        }

        public MultiExternalSelectElement.MultiExternalSelectElementBuilder maxSelectedItems(Integer maxSelectedItems) {
            this.maxSelectedItems = maxSelectedItems;
            return this;
        }

        public MultiExternalSelectElement build() {
            return new MultiExternalSelectElement(fallback, placeholder, actionId, initialOptions, minQueryLength, confirm, maxSelectedItems);
        }

        public String toString() {
            return "MultiExternalSelectElement.MultiExternalSelectElementBuilder(fallback=" + this.fallback + ", placeholder=" + this.placeholder + ", actionId=" + this.actionId + ", initialOptions=" + this.initialOptions + ", minQueryLength=" + this.minQueryLength + ", confirm=" + this.confirm + ", maxSelectedItems=" + this.maxSelectedItems + ")";
        }
    }
}
