package com.github.seratch.jslack.api.model.block.element;

import com.github.seratch.jslack.api.model.block.composition.ConfirmationDialogObject;
import com.github.seratch.jslack.api.model.block.composition.PlainTextObject;

/**
 * https://api.slack.com/reference/messaging/block-elements#conversations-select
 */
public class ConversationsSelectElement extends BlockElement {
    public static final String TYPE = "conversations_select";
    private final String type = TYPE;
    private String fallback;
    private PlainTextObject placeholder;
    private String actionId;
    private String initialConversation;
    private ConfirmationDialogObject confirm;

    public ConversationsSelectElement(String fallback, PlainTextObject placeholder, String actionId, String initialConversation, ConfirmationDialogObject confirm) {
        this.fallback = fallback;
        this.placeholder = placeholder;
        this.actionId = actionId;
        this.initialConversation = initialConversation;
        this.confirm = confirm;
    }

    public ConversationsSelectElement() {
    }

    public static ConversationsSelectElementBuilder builder() {
        return new ConversationsSelectElementBuilder();
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

    public String getInitialConversation() {
        return this.initialConversation;
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

    public void setInitialConversation(String initialConversation) {
        this.initialConversation = initialConversation;
    }

    public void setConfirm(ConfirmationDialogObject confirm) {
        this.confirm = confirm;
    }

    public String toString() {
        return "ConversationsSelectElement(type=" + this.getType() + ", fallback=" + this.getFallback() + ", placeholder=" + this.getPlaceholder() + ", actionId=" + this.getActionId() + ", initialConversation=" + this.getInitialConversation() + ", confirm=" + this.getConfirm() + ")";
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof ConversationsSelectElement)) return false;
        final ConversationsSelectElement other = (ConversationsSelectElement) o;
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
        final Object this$initialConversation = this.getInitialConversation();
        final Object other$initialConversation = other.getInitialConversation();
        if (this$initialConversation == null ? other$initialConversation != null : !this$initialConversation.equals(other$initialConversation))
            return false;
        final Object this$confirm = this.getConfirm();
        final Object other$confirm = other.getConfirm();
        if (this$confirm == null ? other$confirm != null : !this$confirm.equals(other$confirm)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof ConversationsSelectElement;
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
        final Object $initialConversation = this.getInitialConversation();
        result = result * PRIME + ($initialConversation == null ? 43 : $initialConversation.hashCode());
        final Object $confirm = this.getConfirm();
        result = result * PRIME + ($confirm == null ? 43 : $confirm.hashCode());
        return result;
    }

    public static class ConversationsSelectElementBuilder {
        private String fallback;
        private PlainTextObject placeholder;
        private String actionId;
        private String initialConversation;
        private ConfirmationDialogObject confirm;

        ConversationsSelectElementBuilder() {
        }

        public ConversationsSelectElement.ConversationsSelectElementBuilder fallback(String fallback) {
            this.fallback = fallback;
            return this;
        }

        public ConversationsSelectElement.ConversationsSelectElementBuilder placeholder(PlainTextObject placeholder) {
            this.placeholder = placeholder;
            return this;
        }

        public ConversationsSelectElement.ConversationsSelectElementBuilder actionId(String actionId) {
            this.actionId = actionId;
            return this;
        }

        public ConversationsSelectElement.ConversationsSelectElementBuilder initialConversation(String initialConversation) {
            this.initialConversation = initialConversation;
            return this;
        }

        public ConversationsSelectElement.ConversationsSelectElementBuilder confirm(ConfirmationDialogObject confirm) {
            this.confirm = confirm;
            return this;
        }

        public ConversationsSelectElement build() {
            return new ConversationsSelectElement(fallback, placeholder, actionId, initialConversation, confirm);
        }

        public String toString() {
            return "ConversationsSelectElement.ConversationsSelectElementBuilder(fallback=" + this.fallback + ", placeholder=" + this.placeholder + ", actionId=" + this.actionId + ", initialConversation=" + this.initialConversation + ", confirm=" + this.confirm + ")";
        }
    }
}
