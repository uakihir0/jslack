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

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof SectionBlock)) return false;
        final SectionBlock other = (SectionBlock) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$type = this.getType();
        final Object other$type = other.getType();
        if (this$type == null ? other$type != null : !this$type.equals(other$type)) return false;
        final Object this$text = this.getText();
        final Object other$text = other.getText();
        if (this$text == null ? other$text != null : !this$text.equals(other$text)) return false;
        final Object this$blockId = this.getBlockId();
        final Object other$blockId = other.getBlockId();
        if (this$blockId == null ? other$blockId != null : !this$blockId.equals(other$blockId)) return false;
        final Object this$fields = this.getFields();
        final Object other$fields = other.getFields();
        if (this$fields == null ? other$fields != null : !this$fields.equals(other$fields)) return false;
        final Object this$accessory = this.getAccessory();
        final Object other$accessory = other.getAccessory();
        if (this$accessory == null ? other$accessory != null : !this$accessory.equals(other$accessory)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof SectionBlock;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $type = this.getType();
        result = result * PRIME + ($type == null ? 43 : $type.hashCode());
        final Object $text = this.getText();
        result = result * PRIME + ($text == null ? 43 : $text.hashCode());
        final Object $blockId = this.getBlockId();
        result = result * PRIME + ($blockId == null ? 43 : $blockId.hashCode());
        final Object $fields = this.getFields();
        result = result * PRIME + ($fields == null ? 43 : $fields.hashCode());
        final Object $accessory = this.getAccessory();
        result = result * PRIME + ($accessory == null ? 43 : $accessory.hashCode());
        return result;
    }

    public String toString() {
        return "SectionBlock(type=" + this.getType() + ", text=" + this.getText() + ", blockId=" + this.getBlockId() + ", fields=" + this.getFields() + ", accessory=" + this.getAccessory() + ")";
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
