package com.github.seratch.jslack.api.model.dialog;

import java.util.List;

/**
 * Represents a Slack Modal Dialog
 *
 * @see <a href="https://api.slack.com/dialogs">Slack Modal Dialog</a>
 */
public class Dialog {

    /**
     * User-facing title of this entire dialog. 24 characters to work with and it's required.
     */
    private String title;

    /**
     * An identifier strictly for you to recognize submissions of this particular instance of
     * a dialog. Use something meaningful to your app. 255 characters maximum.
     * Absolutely required.
     */
    private String callbackId;

    /**
     * Up to 5 form elements are allowed per dialog. Required.
     */
    private List<DialogElement> elements;

    /**
     * User-facing string for whichever button-like thing submits the form, depending on
     * form factor. Defaults to {@code Submit}, localized in whichever language the end user
     * prefers. 24 characters maximum, and may contain only a single word.
     */
    private String submitLabel;

    Dialog(String title, String callbackId, List<DialogElement> elements, String submitLabel) {
        this.title = title;
        this.callbackId = callbackId;
        this.elements = elements;
        this.submitLabel = submitLabel;
    }

    public static DialogBuilder builder() {
        return new DialogBuilder();
    }

    public String getTitle() {
        return this.title;
    }

    public String getCallbackId() {
        return this.callbackId;
    }

    public List<DialogElement> getElements() {
        return this.elements;
    }

    public String getSubmitLabel() {
        return this.submitLabel;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCallbackId(String callbackId) {
        this.callbackId = callbackId;
    }

    public void setElements(List<DialogElement> elements) {
        this.elements = elements;
    }

    public void setSubmitLabel(String submitLabel) {
        this.submitLabel = submitLabel;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Dialog)) return false;
        final Dialog other = (Dialog) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$title = this.getTitle();
        final Object other$title = other.getTitle();
        if (this$title == null ? other$title != null : !this$title.equals(other$title)) return false;
        final Object this$callbackId = this.getCallbackId();
        final Object other$callbackId = other.getCallbackId();
        if (this$callbackId == null ? other$callbackId != null : !this$callbackId.equals(other$callbackId))
            return false;
        final Object this$elements = this.getElements();
        final Object other$elements = other.getElements();
        if (this$elements == null ? other$elements != null : !this$elements.equals(other$elements)) return false;
        final Object this$submitLabel = this.getSubmitLabel();
        final Object other$submitLabel = other.getSubmitLabel();
        if (this$submitLabel == null ? other$submitLabel != null : !this$submitLabel.equals(other$submitLabel))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Dialog;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $title = this.getTitle();
        result = result * PRIME + ($title == null ? 43 : $title.hashCode());
        final Object $callbackId = this.getCallbackId();
        result = result * PRIME + ($callbackId == null ? 43 : $callbackId.hashCode());
        final Object $elements = this.getElements();
        result = result * PRIME + ($elements == null ? 43 : $elements.hashCode());
        final Object $submitLabel = this.getSubmitLabel();
        result = result * PRIME + ($submitLabel == null ? 43 : $submitLabel.hashCode());
        return result;
    }

    public String toString() {
        return "Dialog(title=" + this.getTitle() + ", callbackId=" + this.getCallbackId() + ", elements=" + this.getElements() + ", submitLabel=" + this.getSubmitLabel() + ")";
    }

    public static class DialogBuilder {
        private String title;
        private String callbackId;
        private List<DialogElement> elements;
        private String submitLabel;

        DialogBuilder() {
        }

        public Dialog.DialogBuilder title(String title) {
            this.title = title;
            return this;
        }

        public Dialog.DialogBuilder callbackId(String callbackId) {
            this.callbackId = callbackId;
            return this;
        }

        public Dialog.DialogBuilder elements(List<DialogElement> elements) {
            this.elements = elements;
            return this;
        }

        public Dialog.DialogBuilder submitLabel(String submitLabel) {
            this.submitLabel = submitLabel;
            return this;
        }

        public Dialog build() {
            return new Dialog(title, callbackId, elements, submitLabel);
        }

        public String toString() {
            return "Dialog.DialogBuilder(title=" + this.title + ", callbackId=" + this.callbackId + ", elements=" + this.elements + ", submitLabel=" + this.submitLabel + ")";
        }
    }
}
