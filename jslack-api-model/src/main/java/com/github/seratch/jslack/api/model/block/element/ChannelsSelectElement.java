package com.github.seratch.jslack.api.model.block.element;

import com.github.seratch.jslack.api.model.block.composition.ConfirmationDialogObject;
import com.github.seratch.jslack.api.model.block.composition.PlainTextObject;

/**
 * https://api.slack.com/reference/messaging/block-elements#channels-select
 */
public class ChannelsSelectElement extends BlockElement {
    public static final String TYPE = "channels_select";
    private final String type = TYPE;
    private String fallback;
    private PlainTextObject placeholder;
    private String actionId;
    private String initialChannel;
    private ConfirmationDialogObject confirm;

    public ChannelsSelectElement(String fallback, PlainTextObject placeholder, String actionId, String initialChannel, ConfirmationDialogObject confirm) {
        this.fallback = fallback;
        this.placeholder = placeholder;
        this.actionId = actionId;
        this.initialChannel = initialChannel;
        this.confirm = confirm;
    }

    public ChannelsSelectElement() {
    }

    public static ChannelsSelectElementBuilder builder() {
        return new ChannelsSelectElementBuilder();
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

    public String getInitialChannel() {
        return this.initialChannel;
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

    public void setInitialChannel(String initialChannel) {
        this.initialChannel = initialChannel;
    }

    public void setConfirm(ConfirmationDialogObject confirm) {
        this.confirm = confirm;
    }

    public String toString() {
        return "ChannelsSelectElement(type=" + this.getType() + ", fallback=" + this.getFallback() + ", placeholder=" + this.getPlaceholder() + ", actionId=" + this.getActionId() + ", initialChannel=" + this.getInitialChannel() + ", confirm=" + this.getConfirm() + ")";
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof ChannelsSelectElement)) return false;
        final ChannelsSelectElement other = (ChannelsSelectElement) o;
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
        final Object this$initialChannel = this.getInitialChannel();
        final Object other$initialChannel = other.getInitialChannel();
        if (this$initialChannel == null ? other$initialChannel != null : !this$initialChannel.equals(other$initialChannel))
            return false;
        final Object this$confirm = this.getConfirm();
        final Object other$confirm = other.getConfirm();
        if (this$confirm == null ? other$confirm != null : !this$confirm.equals(other$confirm)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof ChannelsSelectElement;
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
        final Object $initialChannel = this.getInitialChannel();
        result = result * PRIME + ($initialChannel == null ? 43 : $initialChannel.hashCode());
        final Object $confirm = this.getConfirm();
        result = result * PRIME + ($confirm == null ? 43 : $confirm.hashCode());
        return result;
    }

    public static class ChannelsSelectElementBuilder {
        private String fallback;
        private PlainTextObject placeholder;
        private String actionId;
        private String initialChannel;
        private ConfirmationDialogObject confirm;

        ChannelsSelectElementBuilder() {
        }

        public ChannelsSelectElement.ChannelsSelectElementBuilder fallback(String fallback) {
            this.fallback = fallback;
            return this;
        }

        public ChannelsSelectElement.ChannelsSelectElementBuilder placeholder(PlainTextObject placeholder) {
            this.placeholder = placeholder;
            return this;
        }

        public ChannelsSelectElement.ChannelsSelectElementBuilder actionId(String actionId) {
            this.actionId = actionId;
            return this;
        }

        public ChannelsSelectElement.ChannelsSelectElementBuilder initialChannel(String initialChannel) {
            this.initialChannel = initialChannel;
            return this;
        }

        public ChannelsSelectElement.ChannelsSelectElementBuilder confirm(ConfirmationDialogObject confirm) {
            this.confirm = confirm;
            return this;
        }

        public ChannelsSelectElement build() {
            return new ChannelsSelectElement(fallback, placeholder, actionId, initialChannel, confirm);
        }

        public String toString() {
            return "ChannelsSelectElement.ChannelsSelectElementBuilder(fallback=" + this.fallback + ", placeholder=" + this.placeholder + ", actionId=" + this.actionId + ", initialChannel=" + this.initialChannel + ", confirm=" + this.confirm + ")";
        }
    }
}
