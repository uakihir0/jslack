package com.github.seratch.jslack.api.model;

public class Confirmation {
    public static final String OKAY = "Okay";
    public static final String DISMISS = "Cancel";
    private String title;
    private String text;
    private String okText = OKAY;
    private String dismissText = DISMISS;

    public Confirmation(String title, String text, String okText, String dismissText) {
        this.title = title;
        this.text = text;
        this.okText = okText;
        this.dismissText = dismissText;
    }

    public Confirmation() {
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

    public String getOkText() {
        return this.okText;
    }

    public String getDismissText() {
        return this.dismissText;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setOkText(String okText) {
        this.okText = okText;
    }

    public void setDismissText(String dismissText) {
        this.dismissText = dismissText;
    }

    public static class ConfirmationBuilder {
        private String title;
        private String text;
        private String okText;
        private String dismissText;

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

        public Confirmation.ConfirmationBuilder okText(String okText) {
            this.okText = okText;
            return this;
        }

        public Confirmation.ConfirmationBuilder dismissText(String dismissText) {
            this.dismissText = dismissText;
            return this;
        }

        public Confirmation build() {
            return new Confirmation(title, text, okText, dismissText);
        }

        public String toString() {
            return "Confirmation.ConfirmationBuilder(title=" + this.title + ", text=" + this.text + ", okText=" + this.okText + ", dismissText=" + this.dismissText + ")";
        }
    }
}
