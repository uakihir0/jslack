package com.github.seratch.jslack.api.model.block;

import java.util.ArrayList;
import java.util.List;

/**
 * https://api.slack.com/reference/messaging/blocks#context
 */
public class ContextBlock implements LayoutBlock {
    public static final String TYPE = "context";
    private final String type = TYPE;
    private List<ContextBlockElement> elements = new ArrayList<>();
    private String blockId;

    public ContextBlock(List<ContextBlockElement> elements, String blockId) {
        this.elements = elements;
        this.blockId = blockId;
    }

    public ContextBlock() {
    }

    public static ContextBlockBuilder builder() {
        return new ContextBlockBuilder();
    }

    public String getType() {
        return this.type;
    }

    public List<ContextBlockElement> getElements() {
        return this.elements;
    }

    public String getBlockId() {
        return this.blockId;
    }

    public void setElements(List<ContextBlockElement> elements) {
        this.elements = elements;
    }

    public void setBlockId(String blockId) {
        this.blockId = blockId;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof ContextBlock)) return false;
        final ContextBlock other = (ContextBlock) o;
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
        return other instanceof ContextBlock;
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
        return "ContextBlock(type=" + this.getType() + ", elements=" + this.getElements() + ", blockId=" + this.getBlockId() + ")";
    }

    public static class ContextBlockBuilder {
        private List<ContextBlockElement> elements;
        private String blockId;

        ContextBlockBuilder() {
        }

        public ContextBlock.ContextBlockBuilder elements(List<ContextBlockElement> elements) {
            this.elements = elements;
            return this;
        }

        public ContextBlock.ContextBlockBuilder blockId(String blockId) {
            this.blockId = blockId;
            return this;
        }

        public ContextBlock build() {
            return new ContextBlock(elements, blockId);
        }

        public String toString() {
            return "ContextBlock.ContextBlockBuilder(elements=" + this.elements + ", blockId=" + this.blockId + ")";
        }
    }
}
