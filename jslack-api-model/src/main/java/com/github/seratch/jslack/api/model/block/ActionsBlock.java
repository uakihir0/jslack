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
