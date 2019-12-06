package com.github.seratch.jslack.api.model.block;

/**
 * https://api.slack.com/reference/messaging/blocks#divider
 */
public class DividerBlock implements LayoutBlock {
    public static final String TYPE = "divider";
    private final String type = TYPE;
    private String blockId;

    public DividerBlock(String blockId) {
        this.blockId = blockId;
    }

    public DividerBlock() {
    }

    public static DividerBlockBuilder builder() {
        return new DividerBlockBuilder();
    }

    public String getType() {
        return this.type;
    }

    public String getBlockId() {
        return this.blockId;
    }

    public void setBlockId(String blockId) {
        this.blockId = blockId;
    }

    public static class DividerBlockBuilder {
        private String blockId;

        DividerBlockBuilder() {
        }

        public DividerBlock.DividerBlockBuilder blockId(String blockId) {
            this.blockId = blockId;
            return this;
        }

        public DividerBlock build() {
            return new DividerBlock(blockId);
        }

        public String toString() {
            return "DividerBlock.DividerBlockBuilder(blockId=" + this.blockId + ")";
        }
    }
}
