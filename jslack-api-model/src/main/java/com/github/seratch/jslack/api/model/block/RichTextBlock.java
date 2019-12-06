package com.github.seratch.jslack.api.model.block;

import com.github.seratch.jslack.api.model.block.element.BlockElement;

import java.util.ArrayList;
import java.util.List;

/**
 * https://api.slack.com/changelog/2019-09-what-they-see-is-what-you-get-and-more-and-less
 */
public class RichTextBlock implements LayoutBlock {
    public static final String TYPE = "rich_text";
    private final String type = TYPE;
    private List<BlockElement> elements = new ArrayList<>();
    private String blockId;

    public RichTextBlock(List<BlockElement> elements, String blockId) {
        this.elements = elements;
        this.blockId = blockId;
    }

    public RichTextBlock() {
    }

    public static RichTextBlockBuilder builder() {
        return new RichTextBlockBuilder();
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

    public static class RichTextBlockBuilder {
        private List<BlockElement> elements;
        private String blockId;

        RichTextBlockBuilder() {
        }

        public RichTextBlock.RichTextBlockBuilder elements(List<BlockElement> elements) {
            this.elements = elements;
            return this;
        }

        public RichTextBlock.RichTextBlockBuilder blockId(String blockId) {
            this.blockId = blockId;
            return this;
        }

        public RichTextBlock build() {
            return new RichTextBlock(elements, blockId);
        }

        public String toString() {
            return "RichTextBlock.RichTextBlockBuilder(elements=" + this.elements + ", blockId=" + this.blockId + ")";
        }
    }
}
