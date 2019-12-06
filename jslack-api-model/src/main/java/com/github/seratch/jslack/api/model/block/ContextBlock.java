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
