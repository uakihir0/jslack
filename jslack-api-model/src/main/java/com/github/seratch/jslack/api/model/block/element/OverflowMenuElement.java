package com.github.seratch.jslack.api.model.block.element;

import com.github.seratch.jslack.api.model.block.composition.ConfirmationDialogObject;
import com.github.seratch.jslack.api.model.block.composition.OptionObject;

import java.util.List;

/**
 * https://api.slack.com/reference/messaging/block-elements#overflow
 */
public class OverflowMenuElement extends BlockElement {
    public static final String TYPE = "overflow";
    private final String type = TYPE;
    private String fallback;

    private String actionId;

    // https://github.com/seratch/jslack/pull/103
    // The reason I didn't initialize the List<> fields is because Slack (sometimes) gives errors
    // when it encounters an empty list in the generated JSON.
    // The proper solution if/when you don't want un-initialized fields is to have a Gson type adapter that skips empty lists
    // (e.g. something like https://stackoverflow.com/questions/11942118/how-do-you-get-gson-to-omit-null-or-empty-objects-and-empty-arrays-and-lists)
    private List<OptionObject> options;

    private ConfirmationDialogObject confirm;

    public OverflowMenuElement(String fallback, String actionId, List<OptionObject> options, ConfirmationDialogObject confirm) {
        this.fallback = fallback;
        this.actionId = actionId;
        this.options = options;
        this.confirm = confirm;
    }

    public OverflowMenuElement() {
    }

    public static OverflowMenuElementBuilder builder() {
        return new OverflowMenuElementBuilder();
    }

    public String getType() {
        return this.type;
    }

    public String getFallback() {
        return this.fallback;
    }

    public String getActionId() {
        return this.actionId;
    }

    public List<OptionObject> getOptions() {
        return this.options;
    }

    public ConfirmationDialogObject getConfirm() {
        return this.confirm;
    }

    public void setFallback(String fallback) {
        this.fallback = fallback;
    }

    public void setActionId(String actionId) {
        this.actionId = actionId;
    }

    public void setOptions(List<OptionObject> options) {
        this.options = options;
    }

    public void setConfirm(ConfirmationDialogObject confirm) {
        this.confirm = confirm;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof OverflowMenuElement)) return false;
        final OverflowMenuElement other = (OverflowMenuElement) o;
        if (!other.canEqual((Object) this)) return false;
        if (!super.equals(o)) return false;
        final Object this$type = this.getType();
        final Object other$type = other.getType();
        if (this$type == null ? other$type != null : !this$type.equals(other$type)) return false;
        final Object this$fallback = this.getFallback();
        final Object other$fallback = other.getFallback();
        if (this$fallback == null ? other$fallback != null : !this$fallback.equals(other$fallback)) return false;
        final Object this$actionId = this.getActionId();
        final Object other$actionId = other.getActionId();
        if (this$actionId == null ? other$actionId != null : !this$actionId.equals(other$actionId)) return false;
        final Object this$options = this.getOptions();
        final Object other$options = other.getOptions();
        if (this$options == null ? other$options != null : !this$options.equals(other$options)) return false;
        final Object this$confirm = this.getConfirm();
        final Object other$confirm = other.getConfirm();
        if (this$confirm == null ? other$confirm != null : !this$confirm.equals(other$confirm)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof OverflowMenuElement;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        final Object $type = this.getType();
        result = result * PRIME + ($type == null ? 43 : $type.hashCode());
        final Object $fallback = this.getFallback();
        result = result * PRIME + ($fallback == null ? 43 : $fallback.hashCode());
        final Object $actionId = this.getActionId();
        result = result * PRIME + ($actionId == null ? 43 : $actionId.hashCode());
        final Object $options = this.getOptions();
        result = result * PRIME + ($options == null ? 43 : $options.hashCode());
        final Object $confirm = this.getConfirm();
        result = result * PRIME + ($confirm == null ? 43 : $confirm.hashCode());
        return result;
    }

    public static class OverflowMenuElementBuilder {
        private String fallback;
        private String actionId;
        private List<OptionObject> options;
        private ConfirmationDialogObject confirm;

        OverflowMenuElementBuilder() {
        }

        public OverflowMenuElement.OverflowMenuElementBuilder fallback(String fallback) {
            this.fallback = fallback;
            return this;
        }

        public OverflowMenuElement.OverflowMenuElementBuilder actionId(String actionId) {
            this.actionId = actionId;
            return this;
        }

        public OverflowMenuElement.OverflowMenuElementBuilder options(List<OptionObject> options) {
            this.options = options;
            return this;
        }

        public OverflowMenuElement.OverflowMenuElementBuilder confirm(ConfirmationDialogObject confirm) {
            this.confirm = confirm;
            return this;
        }

        public OverflowMenuElement build() {
            return new OverflowMenuElement(fallback, actionId, options, confirm);
        }

        public String toString() {
            return "OverflowMenuElement.OverflowMenuElementBuilder(fallback=" + this.fallback + ", actionId=" + this.actionId + ", options=" + this.options + ", confirm=" + this.confirm + ")";
        }
    }
}
