package com.github.seratch.jslack.api.model.block.element;

import com.github.seratch.jslack.api.model.block.composition.PlainTextObject;

/**
 * https://api.slack.com/reference/block-kit/block-elements#input
 */
public class PlainTextInputElement extends BlockElement {
    public static final String TYPE = "plain_text_input";
    private final String type = TYPE;
    private String actionId;
    private PlainTextObject placeholder;
    private String initialValue;
    private boolean multiline;
    private Integer minLength;
    private Integer maxLength;

    public PlainTextInputElement(String actionId, PlainTextObject placeholder, String initialValue, boolean multiline, Integer minLength, Integer maxLength) {
        this.actionId = actionId;
        this.placeholder = placeholder;
        this.initialValue = initialValue;
        this.multiline = multiline;
        this.minLength = minLength;
        this.maxLength = maxLength;
    }

    public PlainTextInputElement() {
    }

    public static PlainTextInputElementBuilder builder() {
        return new PlainTextInputElementBuilder();
    }

    public String getType() {
        return this.type;
    }

    public String getActionId() {
        return this.actionId;
    }

    public PlainTextObject getPlaceholder() {
        return this.placeholder;
    }

    public String getInitialValue() {
        return this.initialValue;
    }

    public boolean isMultiline() {
        return this.multiline;
    }

    public Integer getMinLength() {
        return this.minLength;
    }

    public Integer getMaxLength() {
        return this.maxLength;
    }

    public void setActionId(String actionId) {
        this.actionId = actionId;
    }

    public void setPlaceholder(PlainTextObject placeholder) {
        this.placeholder = placeholder;
    }

    public void setInitialValue(String initialValue) {
        this.initialValue = initialValue;
    }

    public void setMultiline(boolean multiline) {
        this.multiline = multiline;
    }

    public void setMinLength(Integer minLength) {
        this.minLength = minLength;
    }

    public void setMaxLength(Integer maxLength) {
        this.maxLength = maxLength;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof PlainTextInputElement)) return false;
        final PlainTextInputElement other = (PlainTextInputElement) o;
        if (!other.canEqual((Object) this)) return false;
        if (!super.equals(o)) return false;
        final Object this$type = this.getType();
        final Object other$type = other.getType();
        if (this$type == null ? other$type != null : !this$type.equals(other$type)) return false;
        final Object this$actionId = this.getActionId();
        final Object other$actionId = other.getActionId();
        if (this$actionId == null ? other$actionId != null : !this$actionId.equals(other$actionId)) return false;
        final Object this$placeholder = this.getPlaceholder();
        final Object other$placeholder = other.getPlaceholder();
        if (this$placeholder == null ? other$placeholder != null : !this$placeholder.equals(other$placeholder))
            return false;
        final Object this$initialValue = this.getInitialValue();
        final Object other$initialValue = other.getInitialValue();
        if (this$initialValue == null ? other$initialValue != null : !this$initialValue.equals(other$initialValue))
            return false;
        if (this.isMultiline() != other.isMultiline()) return false;
        final Object this$minLength = this.getMinLength();
        final Object other$minLength = other.getMinLength();
        if (this$minLength == null ? other$minLength != null : !this$minLength.equals(other$minLength)) return false;
        final Object this$maxLength = this.getMaxLength();
        final Object other$maxLength = other.getMaxLength();
        if (this$maxLength == null ? other$maxLength != null : !this$maxLength.equals(other$maxLength)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof PlainTextInputElement;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        final Object $type = this.getType();
        result = result * PRIME + ($type == null ? 43 : $type.hashCode());
        final Object $actionId = this.getActionId();
        result = result * PRIME + ($actionId == null ? 43 : $actionId.hashCode());
        final Object $placeholder = this.getPlaceholder();
        result = result * PRIME + ($placeholder == null ? 43 : $placeholder.hashCode());
        final Object $initialValue = this.getInitialValue();
        result = result * PRIME + ($initialValue == null ? 43 : $initialValue.hashCode());
        result = result * PRIME + (this.isMultiline() ? 79 : 97);
        final Object $minLength = this.getMinLength();
        result = result * PRIME + ($minLength == null ? 43 : $minLength.hashCode());
        final Object $maxLength = this.getMaxLength();
        result = result * PRIME + ($maxLength == null ? 43 : $maxLength.hashCode());
        return result;
    }

    public static class PlainTextInputElementBuilder {
        private String actionId;
        private PlainTextObject placeholder;
        private String initialValue;
        private boolean multiline;
        private Integer minLength;
        private Integer maxLength;

        PlainTextInputElementBuilder() {
        }

        public PlainTextInputElement.PlainTextInputElementBuilder actionId(String actionId) {
            this.actionId = actionId;
            return this;
        }

        public PlainTextInputElement.PlainTextInputElementBuilder placeholder(PlainTextObject placeholder) {
            this.placeholder = placeholder;
            return this;
        }

        public PlainTextInputElement.PlainTextInputElementBuilder initialValue(String initialValue) {
            this.initialValue = initialValue;
            return this;
        }

        public PlainTextInputElement.PlainTextInputElementBuilder multiline(boolean multiline) {
            this.multiline = multiline;
            return this;
        }

        public PlainTextInputElement.PlainTextInputElementBuilder minLength(Integer minLength) {
            this.minLength = minLength;
            return this;
        }

        public PlainTextInputElement.PlainTextInputElementBuilder maxLength(Integer maxLength) {
            this.maxLength = maxLength;
            return this;
        }

        public PlainTextInputElement build() {
            return new PlainTextInputElement(actionId, placeholder, initialValue, multiline, minLength, maxLength);
        }

        public String toString() {
            return "PlainTextInputElement.PlainTextInputElementBuilder(actionId=" + this.actionId + ", placeholder=" + this.placeholder + ", initialValue=" + this.initialValue + ", multiline=" + this.multiline + ", minLength=" + this.minLength + ", maxLength=" + this.maxLength + ")";
        }
    }
}
