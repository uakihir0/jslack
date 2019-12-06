package com.github.seratch.jslack.api.model.block.composition;

/**
 * https://api.slack.com/reference/messaging/composition-objects#confirm
 */
public class ConfirmationDialogObject {
    private PlainTextObject title;
    private TextObject text;
    private PlainTextObject confirm;
    private PlainTextObject deny;

    public ConfirmationDialogObject(PlainTextObject title, TextObject text, PlainTextObject confirm, PlainTextObject deny) {
        this.title = title;
        this.text = text;
        this.confirm = confirm;
        this.deny = deny;
    }

    public ConfirmationDialogObject() {
    }

    public static ConfirmationDialogObjectBuilder builder() {
        return new ConfirmationDialogObjectBuilder();
    }

    public PlainTextObject getTitle() {
        return this.title;
    }

    public TextObject getText() {
        return this.text;
    }

    public PlainTextObject getConfirm() {
        return this.confirm;
    }

    public PlainTextObject getDeny() {
        return this.deny;
    }

    public void setTitle(PlainTextObject title) {
        this.title = title;
    }

    public void setText(TextObject text) {
        this.text = text;
    }

    public void setConfirm(PlainTextObject confirm) {
        this.confirm = confirm;
    }

    public void setDeny(PlainTextObject deny) {
        this.deny = deny;
    }

    public static class ConfirmationDialogObjectBuilder {
        private PlainTextObject title;
        private TextObject text;
        private PlainTextObject confirm;
        private PlainTextObject deny;

        ConfirmationDialogObjectBuilder() {
        }

        public ConfirmationDialogObject.ConfirmationDialogObjectBuilder title(PlainTextObject title) {
            this.title = title;
            return this;
        }

        public ConfirmationDialogObject.ConfirmationDialogObjectBuilder text(TextObject text) {
            this.text = text;
            return this;
        }

        public ConfirmationDialogObject.ConfirmationDialogObjectBuilder confirm(PlainTextObject confirm) {
            this.confirm = confirm;
            return this;
        }

        public ConfirmationDialogObject.ConfirmationDialogObjectBuilder deny(PlainTextObject deny) {
            this.deny = deny;
            return this;
        }

        public ConfirmationDialogObject build() {
            return new ConfirmationDialogObject(title, text, confirm, deny);
        }

        public String toString() {
            return "ConfirmationDialogObject.ConfirmationDialogObjectBuilder(title=" + this.title + ", text=" + this.text + ", confirm=" + this.confirm + ", deny=" + this.deny + ")";
        }
    }
}
