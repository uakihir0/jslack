package com.github.seratch.jslack.api.model.block.element;

import com.github.seratch.jslack.api.model.block.composition.ConfirmationDialogObject;
import com.github.seratch.jslack.api.model.block.composition.PlainTextObject;

/**
 * https://api.slack.com/reference/messaging/block-elements#button
 */
public class ButtonElement extends BlockElement {
    public static final String TYPE = "button";
    private final String type = TYPE;
    private String fallback;
    private PlainTextObject text;
    private String actionId;
    private String url;
    private String value;
    private String style; // possible values: primary, danger
    private ConfirmationDialogObject confirm;

    public ButtonElement(String fallback, PlainTextObject text, String actionId, String url, String value, String style, ConfirmationDialogObject confirm) {
        this.fallback = fallback;
        this.text = text;
        this.actionId = actionId;
        this.url = url;
        this.value = value;
        this.style = style;
        this.confirm = confirm;
    }

    public ButtonElement() {
    }

    public static ButtonElementBuilder builder() {
        return new ButtonElementBuilder();
    }

    public String getType() {
        return this.type;
    }

    public String getFallback() {
        return this.fallback;
    }

    public PlainTextObject getText() {
        return this.text;
    }

    public String getActionId() {
        return this.actionId;
    }

    public String getUrl() {
        return this.url;
    }

    public String getValue() {
        return this.value;
    }

    public String getStyle() {
        return this.style;
    }

    public ConfirmationDialogObject getConfirm() {
        return this.confirm;
    }

    public void setFallback(String fallback) {
        this.fallback = fallback;
    }

    public void setText(PlainTextObject text) {
        this.text = text;
    }

    public void setActionId(String actionId) {
        this.actionId = actionId;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public void setConfirm(ConfirmationDialogObject confirm) {
        this.confirm = confirm;
    }

    public String toString() {
        return "ButtonElement(type=" + this.getType() + ", fallback=" + this.getFallback() + ", text=" + this.getText() + ", actionId=" + this.getActionId() + ", url=" + this.getUrl() + ", value=" + this.getValue() + ", style=" + this.getStyle() + ", confirm=" + this.getConfirm() + ")";
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof ButtonElement)) return false;
        final ButtonElement other = (ButtonElement) o;
        if (!other.canEqual((Object) this)) return false;
        if (!super.equals(o)) return false;
        final Object this$type = this.getType();
        final Object other$type = other.getType();
        if (this$type == null ? other$type != null : !this$type.equals(other$type)) return false;
        final Object this$fallback = this.getFallback();
        final Object other$fallback = other.getFallback();
        if (this$fallback == null ? other$fallback != null : !this$fallback.equals(other$fallback)) return false;
        final Object this$text = this.getText();
        final Object other$text = other.getText();
        if (this$text == null ? other$text != null : !this$text.equals(other$text)) return false;
        final Object this$actionId = this.getActionId();
        final Object other$actionId = other.getActionId();
        if (this$actionId == null ? other$actionId != null : !this$actionId.equals(other$actionId)) return false;
        final Object this$url = this.getUrl();
        final Object other$url = other.getUrl();
        if (this$url == null ? other$url != null : !this$url.equals(other$url)) return false;
        final Object this$value = this.getValue();
        final Object other$value = other.getValue();
        if (this$value == null ? other$value != null : !this$value.equals(other$value)) return false;
        final Object this$style = this.getStyle();
        final Object other$style = other.getStyle();
        if (this$style == null ? other$style != null : !this$style.equals(other$style)) return false;
        final Object this$confirm = this.getConfirm();
        final Object other$confirm = other.getConfirm();
        if (this$confirm == null ? other$confirm != null : !this$confirm.equals(other$confirm)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof ButtonElement;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        final Object $type = this.getType();
        result = result * PRIME + ($type == null ? 43 : $type.hashCode());
        final Object $fallback = this.getFallback();
        result = result * PRIME + ($fallback == null ? 43 : $fallback.hashCode());
        final Object $text = this.getText();
        result = result * PRIME + ($text == null ? 43 : $text.hashCode());
        final Object $actionId = this.getActionId();
        result = result * PRIME + ($actionId == null ? 43 : $actionId.hashCode());
        final Object $url = this.getUrl();
        result = result * PRIME + ($url == null ? 43 : $url.hashCode());
        final Object $value = this.getValue();
        result = result * PRIME + ($value == null ? 43 : $value.hashCode());
        final Object $style = this.getStyle();
        result = result * PRIME + ($style == null ? 43 : $style.hashCode());
        final Object $confirm = this.getConfirm();
        result = result * PRIME + ($confirm == null ? 43 : $confirm.hashCode());
        return result;
    }

    public static class ButtonElementBuilder {
        private String fallback;
        private PlainTextObject text;
        private String actionId;
        private String url;
        private String value;
        private String style;
        private ConfirmationDialogObject confirm;

        ButtonElementBuilder() {
        }

        public ButtonElement.ButtonElementBuilder fallback(String fallback) {
            this.fallback = fallback;
            return this;
        }

        public ButtonElement.ButtonElementBuilder text(PlainTextObject text) {
            this.text = text;
            return this;
        }

        public ButtonElement.ButtonElementBuilder actionId(String actionId) {
            this.actionId = actionId;
            return this;
        }

        public ButtonElement.ButtonElementBuilder url(String url) {
            this.url = url;
            return this;
        }

        public ButtonElement.ButtonElementBuilder value(String value) {
            this.value = value;
            return this;
        }

        public ButtonElement.ButtonElementBuilder style(String style) {
            this.style = style;
            return this;
        }

        public ButtonElement.ButtonElementBuilder confirm(ConfirmationDialogObject confirm) {
            this.confirm = confirm;
            return this;
        }

        public ButtonElement build() {
            return new ButtonElement(fallback, text, actionId, url, value, style, confirm);
        }

        public String toString() {
            return "ButtonElement.ButtonElementBuilder(fallback=" + this.fallback + ", text=" + this.text + ", actionId=" + this.actionId + ", url=" + this.url + ", value=" + this.value + ", style=" + this.style + ", confirm=" + this.confirm + ")";
        }
    }
}
