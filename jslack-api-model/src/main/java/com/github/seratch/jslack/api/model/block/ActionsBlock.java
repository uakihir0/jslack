package com.github.seratch.jslack.api.model.block;

import com.github.seratch.jslack.api.model.block.element.BlockElement;

import java.util.ArrayList;
import java.util.List;

/**
 * https://api.slack.com/reference/messaging/blocks#actions
 */
public class ActionsBlock implements LayoutBlock {
    public static final String TYPE = "actions";
    private final String type = TYPE;
    private List<BlockElement> elements = new ArrayList<>();
    private String blockId;

    public ActionsBlock(List<BlockElement> elements, String blockId) {
        this.elements = elements;
        this.blockId = blockId;
    }

    public ActionsBlock() {
    }

    public static ActionsBlockBuilder builder() {
        return new ActionsBlockBuilder();
    }

    public String getType() {
        return this.type;
    }

    public List<BlockElement> getElements() {
        return this.elements;
    }

    public String getBlockId() {
        return this.blockId;
    }

    public void setElements(List<BlockElement> elements) {
        this.elements = elements;
    }

    public void setBlockId(String blockId) {
        this.blockId = blockId;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof ActionsBlock)) return false;
        final ActionsBlock other = (ActionsBlock) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$type = this.getType();
        final Object other$type = other.getType();
        if (this$type == null ? other$type != null : !this$type.equals(other$type)) return false;
        final Object this$elements = this.getElements();
        final Object other$elements = other.getElements();
        if (this$elements == null ? other$elements != null : !this$elements.equals(other$elements)) return false;
        final Object this$blockId = this.getBlockId();
        final Object other$blockId = other.getBlockId();
        if (this$blockId == null ? other$blockId != null : !this$blockId.equals(other$blockId)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof ActionsBlock;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $type = this.getType();
        result = result * PRIME + ($type == null ? 43 : $type.hashCode());
        final Object $elements = this.getElements();
        result = result * PRIME + ($elements == null ? 43 : $elements.hashCode());
        final Object $blockId = this.getBlockId();
        result = result * PRIME + ($blockId == null ? 43 : $blockId.hashCode());
        return result;
    }

    public String toString() {
        return "ActionsBlock(type=" + this.getType() + ", elements=" + this.getElements() + ", blockId=" + this.getBlockId() + ")";
    }

    public static class ActionsBlockBuilder {
        private List<BlockElement> elements;
        private String blockId;

        ActionsBlockBuilder() {
        }

        public ActionsBlock.ActionsBlockBuilder elements(List<BlockElement> elements) {
            this.elements = elements;
            return this;
        }

        public ActionsBlock.ActionsBlockBuilder blockId(String blockId) {
            this.blockId = blockId;
            return this;
        }

        public ActionsBlock build() {
            return new ActionsBlock(elements, blockId);
        }

        public String toString() {
            return "ActionsBlock.ActionsBlockBuilder(elements=" + this.elements + ", blockId=" + this.blockId + ")";
        }
    }
}
