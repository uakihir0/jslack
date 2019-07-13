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

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof ConfirmationDialogObject))
            return false;
        final ConfirmationDialogObject other = (ConfirmationDialogObject) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$title = this.getTitle();
        final Object other$title = other.getTitle();
        if (this$title == null ? other$title != null : !this$title.equals(other$title)) return false;
        final Object this$text = this.getText();
        final Object other$text = other.getText();
        if (this$text == null ? other$text != null : !this$text.equals(other$text)) return false;
        final Object this$confirm = this.getConfirm();
        final Object other$confirm = other.getConfirm();
        if (this$confirm == null ? other$confirm != null : !this$confirm.equals(other$confirm)) return false;
        final Object this$deny = this.getDeny();
        final Object other$deny = other.getDeny();
        if (this$deny == null ? other$deny != null : !this$deny.equals(other$deny)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof ConfirmationDialogObject;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $title = this.getTitle();
        result = result * PRIME + ($title == null ? 43 : $title.hashCode());
        final Object $text = this.getText();
        result = result * PRIME + ($text == null ? 43 : $text.hashCode());
        final Object $confirm = this.getConfirm();
        result = result * PRIME + ($confirm == null ? 43 : $confirm.hashCode());
        final Object $deny = this.getDeny();
        result = result * PRIME + ($deny == null ? 43 : $deny.hashCode());
        return result;
    }

    public String toString() {
        return "ConfirmationDialogObject(title=" + this.getTitle() + ", text=" + this.getText() + ", confirm=" + this.getConfirm() + ", deny=" + this.getDeny() + ")";
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
