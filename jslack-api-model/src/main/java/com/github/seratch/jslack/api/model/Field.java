package com.github.seratch.jslack.api.model;

import com.google.gson.annotations.SerializedName;

/**
 * https://api.slack.com/docs/message-attachments
 */
public class Field {

    /**
     * Shown as a bold heading above the value text. It cannot contain markup and will be escaped for you.
     */
    private String title;

    /**
     * The text value of the field. It may contain standard message markup (see details below) and must be escaped as normal. May be multi-line.
     * https://api.slack.com/docs/message-attachments#message_formatting
     */
    private String value;

    /**
     * An optional flag indicating whether the value is short enough to be displayed side-by-side with other values.
     */
    @SerializedName("short")
    private boolean valueShortEnough;

    public Field(String title, String value, boolean valueShortEnough) {
        this.title = title;
        this.value = value;
        this.valueShortEnough = valueShortEnough;
    }

    public Field() {
    }

    public static FieldBuilder builder() {
        return new FieldBuilder();
    }

    public String getTitle() {
        return this.title;
    }

    public String getValue() {
        return this.value;
    }

    public boolean isValueShortEnough() {
        return this.valueShortEnough;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void setValueShortEnough(boolean valueShortEnough) {
        this.valueShortEnough = valueShortEnough;
    }

    public static class FieldBuilder {
        private String title;
        private String value;
        private boolean valueShortEnough;

        FieldBuilder() {
        }

        public Field.FieldBuilder title(String title) {
            this.title = title;
            return this;
        }

        public Field.FieldBuilder value(String value) {
            this.value = value;
            return this;
        }

        public Field.FieldBuilder valueShortEnough(boolean valueShortEnough) {
            this.valueShortEnough = valueShortEnough;
            return this;
        }

        public Field build() {
            return new Field(title, value, valueShortEnough);
        }

        public String toString() {
            return "Field.FieldBuilder(title=" + this.title + ", value=" + this.value + ", valueShortEnough=" + this.valueShortEnough + ")";
        }
    }
}