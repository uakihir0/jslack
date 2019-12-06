package com.github.seratch.jslack.api.model.block.element;

import com.github.seratch.jslack.api.model.block.composition.ConfirmationDialogObject;
import com.github.seratch.jslack.api.model.block.composition.PlainTextObject;

/**
 * https://api.slack.com/reference/messaging/block-elements#users-select
 */
public class UsersSelectElement extends BlockElement {
    public static final String TYPE = "users_select";
    private final String type = TYPE;
    private String fallback;

    private PlainTextObject placeholder;
    private String actionId;
    private String initialUser;
    private ConfirmationDialogObject confirm;

    public UsersSelectElement(String fallback, PlainTextObject placeholder, String actionId, String initialUser, ConfirmationDialogObject confirm) {
        this.fallback = fallback;
        this.placeholder = placeholder;
        this.actionId = actionId;
        this.initialUser = initialUser;
        this.confirm = confirm;
    }

    public UsersSelectElement() {
    }

    public static UsersSelectElementBuilder builder() {
        return new UsersSelectElementBuilder();
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

    public String getInitialUser() {
        return this.initialUser;
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

    public void setInitialUser(String initialUser) {
        this.initialUser = initialUser;
    }

    public void setConfirm(ConfirmationDialogObject confirm) {
        this.confirm = confirm;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof UsersSelectElement)) return false;
        final UsersSelectElement other = (UsersSelectElement) o;
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
        final Object this$initialUser = this.getInitialUser();
        final Object other$initialUser = other.getInitialUser();
        if (this$initialUser == null ? other$initialUser != null : !this$initialUser.equals(other$initialUser))
            return false;
        final Object this$confirm = this.getConfirm();
        final Object other$confirm = other.getConfirm();
        if (this$confirm == null ? other$confirm != null : !this$confirm.equals(other$confirm)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof UsersSelectElement;
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
        final Object $initialUser = this.getInitialUser();
        result = result * PRIME + ($initialUser == null ? 43 : $initialUser.hashCode());
        final Object $confirm = this.getConfirm();
        result = result * PRIME + ($confirm == null ? 43 : $confirm.hashCode());
        return result;
    }

    public static class UsersSelectElementBuilder {
        private String fallback;
        private PlainTextObject placeholder;
        private String actionId;
        private String initialUser;
        private ConfirmationDialogObject confirm;

        UsersSelectElementBuilder() {
        }

        public UsersSelectElement.UsersSelectElementBuilder fallback(String fallback) {
            this.fallback = fallback;
            return this;
        }

        public UsersSelectElement.UsersSelectElementBuilder placeholder(PlainTextObject placeholder) {
            this.placeholder = placeholder;
            return this;
        }

        public UsersSelectElement.UsersSelectElementBuilder actionId(String actionId) {
            this.actionId = actionId;
            return this;
        }

        public UsersSelectElement.UsersSelectElementBuilder initialUser(String initialUser) {
            this.initialUser = initialUser;
            return this;
        }

        public UsersSelectElement.UsersSelectElementBuilder confirm(ConfirmationDialogObject confirm) {
            this.confirm = confirm;
            return this;
        }

        public UsersSelectElement build() {
            return new UsersSelectElement(fallback, placeholder, actionId, initialUser, confirm);
        }

        public String toString() {
            return "UsersSelectElement.UsersSelectElementBuilder(fallback=" + this.fallback + ", placeholder=" + this.placeholder + ", actionId=" + this.actionId + ", initialUser=" + this.initialUser + ", confirm=" + this.confirm + ")";
        }
    }
}
