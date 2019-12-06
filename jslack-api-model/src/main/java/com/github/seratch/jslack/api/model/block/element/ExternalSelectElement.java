package com.github.seratch.jslack.api.model.block.element;

import com.github.seratch.jslack.api.model.block.composition.ConfirmationDialogObject;
import com.github.seratch.jslack.api.model.block.composition.OptionObject;
import com.github.seratch.jslack.api.model.block.composition.PlainTextObject;

/**
 * https://api.slack.com/reference/messaging/block-elements#external-select
 */
public class ExternalSelectElement extends BlockElement {
    public static final String TYPE = "external_select";
    private final String type = TYPE;
    private String fallback;
    private PlainTextObject placeholder;
    private String actionId;
    private OptionObject initialOption;
    private Integer minQueryLength;
    private ConfirmationDialogObject confirm;

    public ExternalSelectElement(String fallback, PlainTextObject placeholder, String actionId, OptionObject initialOption, Integer minQueryLength, ConfirmationDialogObject confirm) {
        this.fallback = fallback;
        this.placeholder = placeholder;
        this.actionId = actionId;
        this.initialOption = initialOption;
        this.minQueryLength = minQueryLength;
        this.confirm = confirm;
    }

    public ExternalSelectElement() {
    }

    public static ExternalSelectElementBuilder builder() {
        return new ExternalSelectElementBuilder();
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

    public OptionObject getInitialOption() {
        return this.initialOption;
    }

    public Integer getMinQueryLength() {
        return this.minQueryLength;
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

    public void setInitialOption(OptionObject initialOption) {
        this.initialOption = initialOption;
    }

    public void setMinQueryLength(Integer minQueryLength) {
        this.minQueryLength = minQueryLength;
    }

    public void setConfirm(ConfirmationDialogObject confirm) {
        this.confirm = confirm;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof ExternalSelectElement)) return false;
        final ExternalSelectElement other = (ExternalSelectElement) o;
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
        final Object this$initialOption = this.getInitialOption();
        final Object other$initialOption = other.getInitialOption();
        if (this$initialOption == null ? other$initialOption != null : !this$initialOption.equals(other$initialOption))
            return false;
        final Object this$minQueryLength = this.getMinQueryLength();
        final Object other$minQueryLength = other.getMinQueryLength();
        if (this$minQueryLength == null ? other$minQueryLength != null : !this$minQueryLength.equals(other$minQueryLength))
            return false;
        final Object this$confirm = this.getConfirm();
        final Object other$confirm = other.getConfirm();
        if (this$confirm == null ? other$confirm != null : !this$confirm.equals(other$confirm)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof ExternalSelectElement;
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
        final Object $initialOption = this.getInitialOption();
        result = result * PRIME + ($initialOption == null ? 43 : $initialOption.hashCode());
        final Object $minQueryLength = this.getMinQueryLength();
        result = result * PRIME + ($minQueryLength == null ? 43 : $minQueryLength.hashCode());
        final Object $confirm = this.getConfirm();
        result = result * PRIME + ($confirm == null ? 43 : $confirm.hashCode());
        return result;
    }

    public static class ExternalSelectElementBuilder {
        private String fallback;
        private PlainTextObject placeholder;
        private String actionId;
        private OptionObject initialOption;
        private Integer minQueryLength;
        private ConfirmationDialogObject confirm;

        ExternalSelectElementBuilder() {
        }

        public ExternalSelectElement.ExternalSelectElementBuilder fallback(String fallback) {
            this.fallback = fallback;
            return this;
        }

        public ExternalSelectElement.ExternalSelectElementBuilder placeholder(PlainTextObject placeholder) {
            this.placeholder = placeholder;
            return this;
        }

        public ExternalSelectElement.ExternalSelectElementBuilder actionId(String actionId) {
            this.actionId = actionId;
            return this;
        }

        public ExternalSelectElement.ExternalSelectElementBuilder initialOption(OptionObject initialOption) {
            this.initialOption = initialOption;
            return this;
        }

        public ExternalSelectElement.ExternalSelectElementBuilder minQueryLength(Integer minQueryLength) {
            this.minQueryLength = minQueryLength;
            return this;
        }

        public ExternalSelectElement.ExternalSelectElementBuilder confirm(ConfirmationDialogObject confirm) {
            this.confirm = confirm;
            return this;
        }

        public ExternalSelectElement build() {
            return new ExternalSelectElement(fallback, placeholder, actionId, initialOption, minQueryLength, confirm);
        }

        public String toString() {
            return "ExternalSelectElement.ExternalSelectElementBuilder(fallback=" + this.fallback + ", placeholder=" + this.placeholder + ", actionId=" + this.actionId + ", initialOption=" + this.initialOption + ", minQueryLength=" + this.minQueryLength + ", confirm=" + this.confirm + ")";
        }
    }
}
