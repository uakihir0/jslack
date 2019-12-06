package com.github.seratch.jslack.api.model.block.element;

import com.github.seratch.jslack.api.model.block.composition.ConfirmationDialogObject;
import com.github.seratch.jslack.api.model.block.composition.PlainTextObject;

import java.util.List;

/**
 * https://api.slack.com/reference/block-kit/block-elements#multi_select
 */
public class MultiConversationsSelectElement extends BlockElement {
    public static final String TYPE = "multi_conversations_select";
    private final String type = TYPE;
    private String fallback;
    private PlainTextObject placeholder;
    private String actionId;
    private List<String> initialConversations;
    private ConfirmationDialogObject confirm;
    private Integer maxSelectedItems;

    public MultiConversationsSelectElement(String fallback, PlainTextObject placeholder, String actionId, List<String> initialConversations, ConfirmationDialogObject confirm, Integer maxSelectedItems) {
        this.fallback = fallback;
        this.placeholder = placeholder;
        this.actionId = actionId;
        this.initialConversations = initialConversations;
        this.confirm = confirm;
        this.maxSelectedItems = maxSelectedItems;
    }

    public MultiConversationsSelectElement() {
    }

    public static MultiConversationsSelectElementBuilder builder() {
        return new MultiConversationsSelectElementBuilder();
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

    public List<String> getInitialConversations() {
        return this.initialConversations;
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

    public void setInitialConversations(List<String> initialConversations) {
        this.initialConversations = initialConversations;
    }

    public void setConfirm(ConfirmationDialogObject confirm) {
        this.confirm = confirm;
    }

    public void setMaxSelectedItems(Integer maxSelectedItems) {
        this.maxSelectedItems = maxSelectedItems;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof MultiConversationsSelectElement))
            return false;
        final MultiConversationsSelectElement other = (MultiConversationsSelectElement) o;
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
        final Object this$initialConversations = this.getInitialConversations();
        final Object other$initialConversations = other.getInitialConversations();
        if (this$initialConversations == null ? other$initialConversations != null : !this$initialConversations.equals(other$initialConversations))
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
        return other instanceof MultiConversationsSelectElement;
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
        final Object $initialConversations = this.getInitialConversations();
        result = result * PRIME + ($initialConversations == null ? 43 : $initialConversations.hashCode());
        final Object $confirm = this.getConfirm();
        result = result * PRIME + ($confirm == null ? 43 : $confirm.hashCode());
        final Object $maxSelectedItems = this.getMaxSelectedItems();
        result = result * PRIME + ($maxSelectedItems == null ? 43 : $maxSelectedItems.hashCode());
        return result;
    }

    public static class MultiConversationsSelectElementBuilder {
        private String fallback;
        private PlainTextObject placeholder;
        private String actionId;
        private List<String> initialConversations;
        private ConfirmationDialogObject confirm;
        private Integer maxSelectedItems;

        MultiConversationsSelectElementBuilder() {
        }

        public MultiConversationsSelectElement.MultiConversationsSelectElementBuilder fallback(String fallback) {
            this.fallback = fallback;
            return this;
        }

        public MultiConversationsSelectElement.MultiConversationsSelectElementBuilder placeholder(PlainTextObject placeholder) {
            this.placeholder = placeholder;
            return this;
        }

        public MultiConversationsSelectElement.MultiConversationsSelectElementBuilder actionId(String actionId) {
            this.actionId = actionId;
            return this;
        }

        public MultiConversationsSelectElement.MultiConversationsSelectElementBuilder initialConversations(List<String> initialConversations) {
            this.initialConversations = initialConversations;
            return this;
        }

        public MultiConversationsSelectElement.MultiConversationsSelectElementBuilder confirm(ConfirmationDialogObject confirm) {
            this.confirm = confirm;
            return this;
        }

        public MultiConversationsSelectElement.MultiConversationsSelectElementBuilder maxSelectedItems(Integer maxSelectedItems) {
            this.maxSelectedItems = maxSelectedItems;
            return this;
        }

        public MultiConversationsSelectElement build() {
            return new MultiConversationsSelectElement(fallback, placeholder, actionId, initialConversations, confirm, maxSelectedItems);
        }

        public String toString() {
            return "MultiConversationsSelectElement.MultiConversationsSelectElementBuilder(fallback=" + this.fallback + ", placeholder=" + this.placeholder + ", actionId=" + this.actionId + ", initialConversations=" + this.initialConversations + ", confirm=" + this.confirm + ", maxSelectedItems=" + this.maxSelectedItems + ")";
        }
    }
}
