package com.github.seratch.jslack.api.methods.request.dialog;

import com.github.seratch.jslack.api.methods.SlackApiRequest;
import com.github.seratch.jslack.api.model.dialog.Dialog;

public class DialogOpenRequest implements SlackApiRequest {

    private String token;

    /**
     * The dialog definition. This must be a JSON-encoded string.
     */
    private Dialog dialog;

    /**
     * Apps can invoke dialogs when users interact with slash commands, message buttons,
     * or message menus. Each interaction will include a trigger_id.<p>
     * <p>
     * As apps can only open a dialog in response to such a user action, the
     * {@code trigger_id} is a required parameter.
     *
     * @see <a href="https://api.slack.com/dialogs#implementation">Implementing dialogs</a>
     */
    private String triggerId;

    @java.beans.ConstructorProperties({"token", "dialog", "triggerId"})
    DialogOpenRequest(String token, Dialog dialog, String triggerId) {
        this.token = token;
        this.dialog = dialog;
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

    public String getTriggerId() {
        return this.triggerId;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setDialog(Dialog dialog) {
        this.dialog = dialog;
    }

    public void setTriggerId(String triggerId) {
        this.triggerId = triggerId;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof DialogOpenRequest)) return false;
        final DialogOpenRequest other = (DialogOpenRequest) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$token = this.getToken();
        final Object other$token = other.getToken();
        if (this$token == null ? other$token != null : !this$token.equals(other$token)) return false;
        final Object this$dialog = this.getDialog();
        final Object other$dialog = other.getDialog();
        if (this$dialog == null ? other$dialog != null : !this$dialog.equals(other$dialog)) return false;
        final Object this$triggerId = this.getTriggerId();
        final Object other$triggerId = other.getTriggerId();
        if (this$triggerId == null ? other$triggerId != null : !this$triggerId.equals(other$triggerId)) return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $token = this.getToken();
        result = result * PRIME + ($token == null ? 43 : $token.hashCode());
        final Object $dialog = this.getDialog();
        result = result * PRIME + ($dialog == null ? 43 : $dialog.hashCode());
        final Object $triggerId = this.getTriggerId();
        result = result * PRIME + ($triggerId == null ? 43 : $triggerId.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof DialogOpenRequest;
    }

    public String toString() {
        return "DialogOpenRequest(token=" + this.getToken() + ", dialog=" + this.getDialog() + ", triggerId=" + this.getTriggerId() + ")";
    }

    public static class DialogOpenRequestBuilder {
        private String token;
        private Dialog dialog;
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

        public DialogOpenRequest.DialogOpenRequestBuilder triggerId(String triggerId) {
            this.triggerId = triggerId;
            return this;
        }

        public DialogOpenRequest build() {
            return new DialogOpenRequest(token, dialog, triggerId);
        }

        public String toString() {
            return "DialogOpenRequest.DialogOpenRequestBuilder(token=" + this.token + ", dialog=" + this.dialog + ", triggerId=" + this.triggerId + ")";
        }
    }
}
