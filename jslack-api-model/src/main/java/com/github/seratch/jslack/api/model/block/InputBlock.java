package com.github.seratch.jslack.api.model.block;

import com.github.seratch.jslack.api.model.block.composition.PlainTextObject;
import com.github.seratch.jslack.api.model.block.element.BlockElement;

/**
 * https://api.slack.com/reference/messaging/blocks#input
 */
public class InputBlock implements LayoutBlock {
    public static final String TYPE = "input";
    private final String type = TYPE;

    private String blockId;

    /**
     * A label that appears above an input element in the form of a text object that must have type of plain_text.
     * Maximum length for the text in this field is 2000 characters.
     */
    private PlainTextObject label;

    /**
     * An plain-text input element, a select menu element, or a multi-select menu element.
     */
    private BlockElement element;

    /**
     * An optional hint that appears below an input element in a lighter grey.
     * It must be a a text object with a type of plain_text.
     * Maximum length for the text in this field is 2000 characters.
     */
    private String hint;

    /**
     * A boolean that indicates whether the input element may be empty when a user submits the modal.
     * Defaults to false.
     */
    private boolean optional;

    public InputBlock(String blockId, PlainTextObject label, BlockElement element, String hint, boolean optional) {
        this.blockId = blockId;
        this.label = label;
        this.element = element;
        this.hint = hint;
        this.optional = optional;
    }

    public InputBlock() {
    }

    public static InputBlockBuilder builder() {
        return new InputBlockBuilder();
    }

    public String getType() {
        return this.type;
    }

    public String getBlockId() {
        return this.blockId;
    }

    public PlainTextObject getLabel() {
        return this.label;
    }

    public BlockElement getElement() {
        return this.element;
    }

    public String getHint() {
        return this.hint;
    }

    public boolean isOptional() {
        return this.optional;
    }

    public void setBlockId(String blockId) {
        this.blockId = blockId;
    }

    public void setLabel(PlainTextObject label) {
        this.label = label;
    }

    public void setElement(BlockElement element) {
        this.element = element;
    }

    public void setHint(String hint) {
        this.hint = hint;
    }

    public void setOptional(boolean optional) {
        this.optional = optional;
    }

    public static class InputBlockBuilder {
        private String blockId;
        private PlainTextObject label;
        private BlockElement element;
        private String hint;
        private boolean optional;

        InputBlockBuilder() {
        }

        public InputBlock.InputBlockBuilder blockId(String blockId) {
            this.blockId = blockId;
            return this;
        }

        public InputBlock.InputBlockBuilder label(PlainTextObject label) {
            this.label = label;
            return this;
        }

        public InputBlock.InputBlockBuilder element(BlockElement element) {
            this.element = element;
            return this;
        }

        public InputBlock.InputBlockBuilder hint(String hint) {
            this.hint = hint;
            return this;
        }

        public InputBlock.InputBlockBuilder optional(boolean optional) {
            this.optional = optional;
            return this;
        }

        public InputBlock build() {
            return new InputBlock(blockId, label, element, hint, optional);
        }

        public String toString() {
            return "InputBlock.InputBlockBuilder(blockId=" + this.blockId + ", label=" + this.label + ", element=" + this.element + ", hint=" + this.hint + ", optional=" + this.optional + ")";
        }
    }
}
