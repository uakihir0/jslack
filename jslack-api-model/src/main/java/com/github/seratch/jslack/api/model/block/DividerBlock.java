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

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof DividerBlock)) return false;
        final DividerBlock other = (DividerBlock) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$type = this.getType();
        final Object other$type = other.getType();
        if (this$type == null ? other$type != null : !this$type.equals(other$type)) return false;
        final Object this$blockId = this.getBlockId();
        final Object other$blockId = other.getBlockId();
        if (this$blockId == null ? other$blockId != null : !this$blockId.equals(other$blockId)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof DividerBlock;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $type = this.getType();
        result = result * PRIME + ($type == null ? 43 : $type.hashCode());
        final Object $blockId = this.getBlockId();
        result = result * PRIME + ($blockId == null ? 43 : $blockId.hashCode());
        return result;
    }

    public String toString() {
        return "DividerBlock(type=" + this.getType() + ", blockId=" + this.getBlockId() + ")";
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
