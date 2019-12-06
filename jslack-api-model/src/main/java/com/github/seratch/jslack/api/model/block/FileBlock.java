package com.github.seratch.jslack.api.model.block;

/**
 * https://api.slack.com/reference/messaging/blocks#file
 */
public class FileBlock implements LayoutBlock {
    public static final String TYPE = "file";
    // The type of block. For a context block, type is always file.
    private final String type = TYPE;
    // A string acting as a unique identifier for a block.
    // You can use this block_id when you receive an interaction payload to identify the source of the action.
    // If not specified, a block_id will be generated. Maximum length for this field is 255 characters.
    private String blockId;
    // 	The external unique ID for this file.
    private String externalId;
    // 	At the moment, source will always be remote for a remote file.
    private String source; // "remote"

    public FileBlock(String blockId, String externalId, String source) {
        this.blockId = blockId;
        this.externalId = externalId;
        this.source = source;
    }

    public FileBlock() {
    }

    public static FileBlockBuilder builder() {
        return new FileBlockBuilder();
    }

    public String getType() {
        return this.type;
    }

    public String getBlockId() {
        return this.blockId;
    }

    public String getExternalId() {
        return this.externalId;
    }

    public String getSource() {
        return this.source;
    }

    public void setBlockId(String blockId) {
        this.blockId = blockId;
    }

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public static class FileBlockBuilder {
        private String blockId;
        private String externalId;
        private String source;

        FileBlockBuilder() {
        }

        public FileBlock.FileBlockBuilder blockId(String blockId) {
            this.blockId = blockId;
            return this;
        }

        public FileBlock.FileBlockBuilder externalId(String externalId) {
            this.externalId = externalId;
            return this;
        }

        public FileBlock.FileBlockBuilder source(String source) {
            this.source = source;
            return this;
        }

        public FileBlock build() {
            return new FileBlock(blockId, externalId, source);
        }

        public String toString() {
            return "FileBlock.FileBlockBuilder(blockId=" + this.blockId + ", externalId=" + this.externalId + ", source=" + this.source + ")";
        }
    }
}
