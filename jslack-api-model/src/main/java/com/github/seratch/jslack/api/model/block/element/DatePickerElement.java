package com.github.seratch.jslack.api.model.block.element;

import com.github.seratch.jslack.api.model.block.composition.ConfirmationDialogObject;
import com.github.seratch.jslack.api.model.block.composition.PlainTextObject;

/**
 * https://api.slack.com/reference/messaging/block-elements#datepicker
 */
public class DatePickerElement extends BlockElement {
    public static final String TYPE = "datepicker";
    private final String type = TYPE;
    private String fallback;
    private String actionId;
    private PlainTextObject placeholder;
    private String initialDate;
    private ConfirmationDialogObject confirm;

    public DatePickerElement(String fallback, String actionId, PlainTextObject placeholder, String initialDate, ConfirmationDialogObject confirm) {
        this.fallback = fallback;
        this.actionId = actionId;
        this.placeholder = placeholder;
        this.initialDate = initialDate;
        this.confirm = confirm;
    }

    public DatePickerElement() {
    }

    public static DatePickerElementBuilder builder() {
        return new DatePickerElementBuilder();
    }

    public String getType() {
        return this.type;
    }

    public String getFallback() {
        return this.fallback;
    }

    public String getActionId() {
        return this.actionId;
    }

    public PlainTextObject getPlaceholder() {
        return this.placeholder;
    }

    public String getInitialDate() {
        return this.initialDate;
    }

    public ConfirmationDialogObject getConfirm() {
        return this.confirm;
    }

    public void setFallback(String fallback) {
        this.fallback = fallback;
    }

    public void setActionId(String actionId) {
        this.actionId = actionId;
    }

    public void setPlaceholder(PlainTextObject placeholder) {
        this.placeholder = placeholder;
    }

    public void setInitialDate(String initialDate) {
        this.initialDate = initialDate;
    }

    public void setConfirm(ConfirmationDialogObject confirm) {
        this.confirm = confirm;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof DatePickerElement)) return false;
        final DatePickerElement other = (DatePickerElement) o;
        if (!other.canEqual((Object) this)) return false;
        if (!super.equals(o)) return false;
        final Object this$type = this.getType();
        final Object other$type = other.getType();
        if (this$type == null ? other$type != null : !this$type.equals(other$type)) return false;
        final Object this$fallback = this.getFallback();
        final Object other$fallback = other.getFallback();
        if (this$fallback == null ? other$fallback != null : !this$fallback.equals(other$fallback)) return false;
        final Object this$actionId = this.getActionId();
        final Object other$actionId = other.getActionId();
        if (this$actionId == null ? other$actionId != null : !this$actionId.equals(other$actionId)) return false;
        final Object this$placeholder = this.getPlaceholder();
        final Object other$placeholder = other.getPlaceholder();
        if (this$placeholder == null ? other$placeholder != null : !this$placeholder.equals(other$placeholder))
            return false;
        final Object this$initialDate = this.getInitialDate();
        final Object other$initialDate = other.getInitialDate();
        if (this$initialDate == null ? other$initialDate != null : !this$initialDate.equals(other$initialDate))
            return false;
        final Object this$confirm = this.getConfirm();
        final Object other$confirm = other.getConfirm();
        if (this$confirm == null ? other$confirm != null : !this$confirm.equals(other$confirm)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof DatePickerElement;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        final Object $type = this.getType();
        result = result * PRIME + ($type == null ? 43 : $type.hashCode());
        final Object $fallback = this.getFallback();
        result = result * PRIME + ($fallback == null ? 43 : $fallback.hashCode());
        final Object $actionId = this.getActionId();
        result = result * PRIME + ($actionId == null ? 43 : $actionId.hashCode());
        final Object $placeholder = this.getPlaceholder();
        result = result * PRIME + ($placeholder == null ? 43 : $placeholder.hashCode());
        final Object $initialDate = this.getInitialDate();
        result = result * PRIME + ($initialDate == null ? 43 : $initialDate.hashCode());
        final Object $confirm = this.getConfirm();
        result = result * PRIME + ($confirm == null ? 43 : $confirm.hashCode());
        return result;
    }

    public static class DatePickerElementBuilder {
        private String fallback;
        private String actionId;
        private PlainTextObject placeholder;
        private String initialDate;
        private ConfirmationDialogObject confirm;

        DatePickerElementBuilder() {
        }

        public DatePickerElement.DatePickerElementBuilder fallback(String fallback) {
            this.fallback = fallback;
            return this;
        }

        public DatePickerElement.DatePickerElementBuilder actionId(String actionId) {
            this.actionId = actionId;
            return this;
        }

        public DatePickerElement.DatePickerElementBuilder placeholder(PlainTextObject placeholder) {
            this.placeholder = placeholder;
            return this;
        }

        public DatePickerElement.DatePickerElementBuilder initialDate(String initialDate) {
            this.initialDate = initialDate;
            return this;
        }

        public DatePickerElement.DatePickerElementBuilder confirm(ConfirmationDialogObject confirm) {
            this.confirm = confirm;
            return this;
        }

        public DatePickerElement build() {
            return new DatePickerElement(fallback, actionId, placeholder, initialDate, confirm);
        }

        public String toString() {
            return "DatePickerElement.DatePickerElementBuilder(fallback=" + this.fallback + ", actionId=" + this.actionId + ", placeholder=" + this.placeholder + ", initialDate=" + this.initialDate + ", confirm=" + this.confirm + ")";
        }
    }
}
