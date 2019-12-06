package com.github.seratch.jslack.api.model.block;

import com.github.seratch.jslack.api.model.block.composition.TextObject;
import com.github.seratch.jslack.api.model.block.element.BlockElement;

import java.util.List;

/**
 * https://api.slack.com/reference/messaging/blocks#section
 */
public class SectionBlock implements LayoutBlock {
    public static final String TYPE = "section";
    private final String type = TYPE;
    private TextObject text;
    private String blockId;
    private List<TextObject> fields;
    private BlockElement accessory;

    public SectionBlock(TextObject text, String blockId, List<TextObject> fields, BlockElement accessory) {
        this.text = text;
        this.blockId = blockId;
        this.fields = fields;
        this.accessory = accessory;
    }

    public SectionBlock() {
    }

    public static SectionBlockBuilder builder() {
        return new SectionBlockBuilder();
    }

    public String getType() {
        return this.type;
    }

    public TextObject getText() {
        return this.text;
    }

    public String getBlockId() {
        return this.blockId;
    }

    public List<TextObject> getFields() {
        return this.fields;
    }

    public BlockElement getAccessory() {
        return this.accessory;
    }

    public void setText(TextObject text) {
        this.text = text;
    }

    public void setBlockId(String blockId) {
        this.blockId = blockId;
    }

    public void setFields(List<TextObject> fields) {
        this.fields = fields;
    }

    public void setAccessory(BlockElement accessory) {
        this.accessory = accessory;
    }

    public static class SectionBlockBuilder {
        private TextObject text;
        private String blockId;
        private List<TextObject> fields;
        private BlockElement accessory;

        SectionBlockBuilder() {
        }

        public SectionBlock.SectionBlockBuilder text(TextObject text) {
            this.text = text;
            return this;
        }

        public SectionBlock.SectionBlockBuilder blockId(String blockId) {
            this.blockId = blockId;
            return this;
        }

        public SectionBlock.SectionBlockBuilder fields(List<TextObject> fields) {
            this.fields = fields;
            return this;
        }

        public SectionBlock.SectionBlockBuilder accessory(BlockElement accessory) {
            this.accessory = accessory;
            return this;
        }

        public SectionBlock build() {
            return new SectionBlock(text, blockId, fields, accessory);
        }

        public String toString() {
            return "SectionBlock.SectionBlockBuilder(text=" + this.text + ", blockId=" + this.blockId + ", fields=" + this.fields + ", accessory=" + this.accessory + ")";
        }
    }
}
