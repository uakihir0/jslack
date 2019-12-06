package com.github.seratch.jslack.api.methods.request.dialog;

import com.github.seratch.jslack.api.methods.SlackApiRequest;
import com.github.seratch.jslack.api.model.dialog.Dialog;

public class DialogOpenRequest implements SlackApiRequest {

    /**
     * Authentication token. Requires scope: `none`
     */
    private String token;

    /**
     * The dialog definition. This must be a JSON-encoded string.
     */
    private Dialog dialog;

    private String dialogAsString;

    /**
     * Exchange a trigger to post to the user.
     * <p>
     * Apps can invoke dialogs when users interact with slash commands, message buttons,
     * or message menus. Each interaction will include a trigger_id.<p>
     * <p>
     * As apps can only open a dialog in response to such a user action, the
     * {@code trigger_id} is a required parameter.
     *
     * @see <a href="https://api.slack.com/dialogs#implementation">Implementing dialogs</a>
     */
    private String triggerId;

    DialogOpenRequest(String token, Dialog dialog, String dialogAsString, String triggerId) {
        this.token = token;
        this.dialog = dialog;
        this.dialogAsString = dialogAsString;
        this.triggerId = triggerId;
    }

    public static DialogOpenRequestBuilder builder() {
        return new DialogOpenRequestBuilder();
    }

    public String getToken() {
        return this.token;
    }

    public Dialog getDialog() {
        return this.dialog;
    }

    public String getDialogAsString() {
        return this.dialogAsString;
    }

    public String getTriggerId() {
        return this.triggerId;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setDialog(Dialog dialog) {
        this.dialog = dialog;
    }

    public void setDialogAsString(String dialogAsString) {
        this.dialogAsString = dialogAsString;
    }

    public void setTriggerId(String triggerId) {
        this.triggerId = triggerId;
    }

    public static class DialogOpenRequestBuilder {
        private String token;
        private Dialog dialog;
        private String dialogAsString;
        private String triggerId;

        DialogOpenRequestBuilder() {
        }

        public DialogOpenRequest.DialogOpenRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public DialogOpenRequest.DialogOpenRequestBuilder dialog(Dialog dialog) {
            this.dialog = dialog;
            return this;
        }

        public DialogOpenRequest.DialogOpenRequestBuilder dialogAsString(String dialogAsString) {
            this.dialogAsString = dialogAsString;
            return this;
        }

        public DialogOpenRequest.DialogOpenRequestBuilder triggerId(String triggerId) {
            this.triggerId = triggerId;
            return this;
        }

        public DialogOpenRequest build() {
            return new DialogOpenRequest(token, dialog, dialogAsString, triggerId);
        }

        public String toString() {
            return "DialogOpenRequest.DialogOpenRequestBuilder(token=" + this.token + ", dialog=" + this.dialog + ", dialogAsString=" + this.dialogAsString + ", triggerId=" + this.triggerId + ")";
        }
    }
}
