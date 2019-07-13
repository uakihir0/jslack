package com.github.seratch.jslack.api.model;

public class Confirmation {
    public static final String OKAY = "Okay";
    public static final String DISMISS = "Cancel";
    private String title;
    private String text;
    private String ok_text = OKAY;
    private String dismiss_text = DISMISS;

    Confirmation(String title, String text, String ok_text, String dismiss_text) {
        this.title = title;
        this.text = text;
        this.ok_text = ok_text;
        this.dismiss_text = dismiss_text;
    }

    public static ConfirmationBuilder builder() {
        return new ConfirmationBuilder();
    }

    public String getTitle() {
        return this.title;
    }

    public String getText() {
        return this.text;
    }

    public String getOk_text() {
        return this.ok_text;
    }

    public String getDismiss_text() {
        return this.dismiss_text;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setOk_text(String ok_text) {
        this.ok_text = ok_text;
    }

    public void setDismiss_text(String dismiss_text) {
        this.dismiss_text = dismiss_text;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Confirmation)) return false;
        final Confirmation other = (Confirmation) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$title = this.getTitle();
        final Object other$title = other.getTitle();
        if (this$title == null ? other$title != null : !this$title.equals(other$title)) return false;
        final Object this$text = this.getText();
        final Object other$text = other.getText();
        if (this$text == null ? other$text != null : !this$text.equals(other$text)) return false;
        final Object this$ok_text = this.getOk_text();
        final Object other$ok_text = other.getOk_text();
        if (this$ok_text == null ? other$ok_text != null : !this$ok_text.equals(other$ok_text)) return false;
        final Object this$dismiss_text = this.getDismiss_text();
        final Object other$dismiss_text = other.getDismiss_text();
        if (this$dismiss_text == null ? other$dismiss_text != null : !this$dismiss_text.equals(other$dismiss_text))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Confirmation;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $title = this.getTitle();
        result = result * PRIME + ($title == null ? 43 : $title.hashCode());
        final Object $text = this.getText();
        result = result * PRIME + ($text == null ? 43 : $text.hashCode());
        final Object $ok_text = this.getOk_text();
        result = result * PRIME + ($ok_text == null ? 43 : $ok_text.hashCode());
        final Object $dismiss_text = this.getDismiss_text();
        result = result * PRIME + ($dismiss_text == null ? 43 : $dismiss_text.hashCode());
        return result;
    }

    public String toString() {
        return "Confirmation(title=" + this.getTitle() + ", text=" + this.getText() + ", ok_text=" + this.getOk_text() + ", dismiss_text=" + this.getDismiss_text() + ")";
    }

    public static class ConfirmationBuilder {
        private String title;
        private String text;
        private String ok_text;
        private String dismiss_text;

        ConfirmationBuilder() {
        }

        public Confirmation.ConfirmationBuilder title(String title) {
            this.title = title;
            return this;
        }

        public Confirmation.ConfirmationBuilder text(String text) {
            this.text = text;
            return this;
        }

        public Confirmation.ConfirmationBuilder ok_text(String ok_text) {
            this.ok_text = ok_text;
            return this;
        }

        public Confirmation.ConfirmationBuilder dismiss_text(String dismiss_text) {
            this.dismiss_text = dismiss_text;
            return this;
        }

        public Confirmation build() {
            return new Confirmation(title, text, ok_text, dismiss_text);
        }

        public String toString() {
            return "Confirmation.ConfirmationBuilder(title=" + this.title + ", text=" + this.text + ", ok_text=" + this.ok_text + ", dismiss_text=" + this.dismiss_text + ")";
        }
    }
}
