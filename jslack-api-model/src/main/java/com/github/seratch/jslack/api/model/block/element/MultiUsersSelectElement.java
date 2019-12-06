package com.github.seratch.jslack.api.model.block.element;

import com.github.seratch.jslack.api.model.block.composition.ConfirmationDialogObject;
import com.github.seratch.jslack.api.model.block.composition.PlainTextObject;

import java.util.List;

/**
 * https://api.slack.com/reference/block-kit/block-elements#multi_select
 */
public class MultiUsersSelectElement extends BlockElement {
    public static final String TYPE = "multi_users_select";
    private final String type = TYPE;
    private String fallback;

    private PlainTextObject placeholder;
    private String actionId;
    private List<String> initialUsers;
    private ConfirmationDialogObject confirm;
    private Integer maxSelectedItems;

    public MultiUsersSelectElement(String fallback, PlainTextObject placeholder, String actionId, List<String> initialUsers, ConfirmationDialogObject confirm, Integer maxSelectedItems) {
        this.fallback = fallback;
        this.placeholder = placeholder;
        this.actionId = actionId;
        this.initialUsers = initialUsers;
        this.confirm = confirm;
        this.maxSelectedItems = maxSelectedItems;
    }

    public MultiUsersSelectElement() {
    }

    public static MultiUsersSelectElementBuilder builder() {
        return new MultiUsersSelectElementBuilder();
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

    public List<String> getInitialUsers() {
        return this.initialUsers;
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

    public void setInitialUsers(List<String> initialUsers) {
        this.initialUsers = initialUsers;
    }

    public void setConfirm(ConfirmationDialogObject confirm) {
        this.confirm = confirm;
    }

    public void setMaxSelectedItems(Integer maxSelectedItems) {
        this.maxSelectedItems = maxSelectedItems;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof MultiUsersSelectElement)) return false;
        final MultiUsersSelectElement other = (MultiUsersSelectElement) o;
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
        final Object this$initialUsers = this.getInitialUsers();
        final Object other$initialUsers = other.getInitialUsers();
        if (this$initialUsers == null ? other$initialUsers != null : !this$initialUsers.equals(other$initialUsers))
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
        return other instanceof MultiUsersSelectElement;
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
        final Object $initialUsers = this.getInitialUsers();
        result = result * PRIME + ($initialUsers == null ? 43 : $initialUsers.hashCode());
        final Object $confirm = this.getConfirm();
        result = result * PRIME + ($confirm == null ? 43 : $confirm.hashCode());
        final Object $maxSelectedItems = this.getMaxSelectedItems();
        result = result * PRIME + ($maxSelectedItems == null ? 43 : $maxSelectedItems.hashCode());
        return result;
    }

    public static class MultiUsersSelectElementBuilder {
        private String fallback;
        private PlainTextObject placeholder;
        private String actionId;
        private List<String> initialUsers;
        private ConfirmationDialogObject confirm;
        private Integer maxSelectedItems;

        MultiUsersSelectElementBuilder() {
        }

        public MultiUsersSelectElement.MultiUsersSelectElementBuilder fallback(String fallback) {
            this.fallback = fallback;
            return this;
        }

        public MultiUsersSelectElement.MultiUsersSelectElementBuilder placeholder(PlainTextObject placeholder) {
            this.placeholder = placeholder;
            return this;
        }

        public MultiUsersSelectElement.MultiUsersSelectElementBuilder actionId(String actionId) {
            this.actionId = actionId;
            return this;
        }

        public MultiUsersSelectElement.MultiUsersSelectElementBuilder initialUsers(List<String> initialUsers) {
            this.initialUsers = initialUsers;
            return this;
        }

        public MultiUsersSelectElement.MultiUsersSelectElementBuilder confirm(ConfirmationDialogObject confirm) {
            this.confirm = confirm;
            return this;
        }

        public MultiUsersSelectElement.MultiUsersSelectElementBuilder maxSelectedItems(Integer maxSelectedItems) {
            this.maxSelectedItems = maxSelectedItems;
            return this;
        }

        public MultiUsersSelectElement build() {
            return new MultiUsersSelectElement(fallback, placeholder, actionId, initialUsers, confirm, maxSelectedItems);
        }

        public String toString() {
            return "MultiUsersSelectElement.MultiUsersSelectElementBuilder(fallback=" + this.fallback + ", placeholder=" + this.placeholder + ", actionId=" + this.actionId + ", initialUsers=" + this.initialUsers + ", confirm=" + this.confirm + ", maxSelectedItems=" + this.maxSelectedItems + ")";
        }
    }
}
