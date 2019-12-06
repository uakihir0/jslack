package com.github.seratch.jslack.api.model.block.composition;

/**
 * https://api.slack.com/reference/messaging/composition-objects#text
 */
public class MarkdownTextObject extends TextObject {
    public static final String TYPE = "mrkdwn";
    private final String type = TYPE;
    private String text;

    /**
     * The documentation of the Slack API states that the verbatim field is optional.
     * The API examples always render the emoji field (as true, but that is its default value) -- so that is not helpful.
     * I picked the Boolean because basically you have 3 possible states:
     * - true
     * - false
     * - not present (and therefore not rendered in the resulting JSON sent to the Slack API)
     */
    private Boolean verbatim;

    public MarkdownTextObject(String text, Boolean verbatim) {
        this.text = text;
        this.verbatim = verbatim;
    }

    public MarkdownTextObject() {
    }

    public static MarkdownTextObjectBuilder builder() {
        return new MarkdownTextObjectBuilder();
    }

    public String getType() {
        return this.type;
    }

    public String getText() {
        return this.text;
    }

    public Boolean getVerbatim() {
        return this.verbatim;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setVerbatim(Boolean verbatim) {
        this.verbatim = verbatim;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof MarkdownTextObject)) return false;
        final MarkdownTextObject other = (MarkdownTextObject) o;
        if (!other.canEqual((Object) this)) return false;
        if (!super.equals(o)) return false;
        final Object this$type = this.getType();
        final Object other$type = other.getType();
        if (this$type == null ? other$type != null : !this$type.equals(other$type)) return false;
        final Object this$text = this.getText();
        final Object other$text = other.getText();
        if (this$text == null ? other$text != null : !this$text.equals(other$text)) return false;
        final Object this$verbatim = this.getVerbatim();
        final Object other$verbatim = other.getVerbatim();
        if (this$verbatim == null ? other$verbatim != null : !this$verbatim.equals(other$verbatim)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof MarkdownTextObject;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        final Object $type = this.getType();
        result = result * PRIME + ($type == null ? 43 : $type.hashCode());
        final Object $text = this.getText();
        result = result * PRIME + ($text == null ? 43 : $text.hashCode());
        final Object $verbatim = this.getVerbatim();
        result = result * PRIME + ($verbatim == null ? 43 : $verbatim.hashCode());
        return result;
    }

    public static class MarkdownTextObjectBuilder {
        private String text;
        private Boolean verbatim;

        MarkdownTextObjectBuilder() {
        }

        public MarkdownTextObject.MarkdownTextObjectBuilder text(String text) {
            this.text = text;
            return this;
        }

        public MarkdownTextObject.MarkdownTextObjectBuilder verbatim(Boolean verbatim) {
            this.verbatim = verbatim;
            return this;
        }

        public MarkdownTextObject build() {
            return new MarkdownTextObject(text, verbatim);
        }

        public String toString() {
            return "MarkdownTextObject.MarkdownTextObjectBuilder(text=" + this.text + ", verbatim=" + this.verbatim + ")";
        }
    }
}
