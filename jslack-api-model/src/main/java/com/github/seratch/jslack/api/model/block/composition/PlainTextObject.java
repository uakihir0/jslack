package com.github.seratch.jslack.api.model.block.composition;

/**
 * https://api.slack.com/reference/messaging/composition-objects#text
 */
public class PlainTextObject extends TextObject {
    public static final String TYPE = "plain_text";

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
    private Boolean emoji;

    public PlainTextObject(String text, Boolean emoji) {
        this.text = text;
        this.emoji = emoji;
    }

    public PlainTextObject() {
    }

    public static PlainTextObjectBuilder builder() {
        return new PlainTextObjectBuilder();
    }

    public String getType() {
        return this.type;
    }

    public String getText() {
        return this.text;
    }

    public Boolean getEmoji() {
        return this.emoji;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setEmoji(Boolean emoji) {
        this.emoji = emoji;
    }

    public String toString() {
        return "PlainTextObject(type=" + this.getType() + ", text=" + this.getText() + ", emoji=" + this.getEmoji() + ")";
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof PlainTextObject)) return false;
        final PlainTextObject other = (PlainTextObject) o;
        if (!other.canEqual((Object) this)) return false;
        if (!super.equals(o)) return false;
        final Object this$type = this.getType();
        final Object other$type = other.getType();
        if (this$type == null ? other$type != null : !this$type.equals(other$type)) return false;
        final Object this$text = this.getText();
        final Object other$text = other.getText();
        if (this$text == null ? other$text != null : !this$text.equals(other$text)) return false;
        final Object this$emoji = this.getEmoji();
        final Object other$emoji = other.getEmoji();
        if (this$emoji == null ? other$emoji != null : !this$emoji.equals(other$emoji)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof PlainTextObject;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        final Object $type = this.getType();
        result = result * PRIME + ($type == null ? 43 : $type.hashCode());
        final Object $text = this.getText();
        result = result * PRIME + ($text == null ? 43 : $text.hashCode());
        final Object $emoji = this.getEmoji();
        result = result * PRIME + ($emoji == null ? 43 : $emoji.hashCode());
        return result;
    }

    public PlainTextObjectBuilder toBuilder() {
        return new PlainTextObjectBuilder().text(this.text).emoji(this.emoji);
    }

    public static class PlainTextObjectBuilder {
        private String text;
        private Boolean emoji;

        PlainTextObjectBuilder() {
        }

        public PlainTextObject.PlainTextObjectBuilder text(String text) {
            this.text = text;
            return this;
        }

        public PlainTextObject.PlainTextObjectBuilder emoji(Boolean emoji) {
            this.emoji = emoji;
            return this;
        }

        public PlainTextObject build() {
            return new PlainTextObject(text, emoji);
        }

        public String toString() {
            return "PlainTextObject.PlainTextObjectBuilder(text=" + this.text + ", emoji=" + this.emoji + ")";
        }
    }
}
