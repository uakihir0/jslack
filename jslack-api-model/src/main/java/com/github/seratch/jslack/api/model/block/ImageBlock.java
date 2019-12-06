package com.github.seratch.jslack.api.model.block;

import com.github.seratch.jslack.api.model.block.composition.PlainTextObject;

/**
 * https://api.slack.com/reference/messaging/blocks#image
 */
public class ImageBlock implements LayoutBlock {
    public static final String TYPE = "image";
    private final String type = TYPE;
    private String fallback;

    private String imageUrl;
    private Integer imageWidth;
    private Integer imageHeight;
    private Integer imageBytes;

    private String altText;
    private PlainTextObject title;
    private String blockId;

    public ImageBlock(String fallback, String imageUrl, Integer imageWidth, Integer imageHeight, Integer imageBytes, String altText, PlainTextObject title, String blockId) {
        this.fallback = fallback;
        this.imageUrl = imageUrl;
        this.imageWidth = imageWidth;
        this.imageHeight = imageHeight;
        this.imageBytes = imageBytes;
        this.altText = altText;
        this.title = title;
        this.blockId = blockId;
    }

    public ImageBlock() {
    }

    public static ImageBlockBuilder builder() {
        return new ImageBlockBuilder();
    }

    public String getType() {
        return this.type;
    }

    public String getFallback() {
        return this.fallback;
    }

    public String getImageUrl() {
        return this.imageUrl;
    }

    public Integer getImageWidth() {
        return this.imageWidth;
    }

    public Integer getImageHeight() {
        return this.imageHeight;
    }

    public Integer getImageBytes() {
        return this.imageBytes;
    }

    public String getAltText() {
        return this.altText;
    }

    public PlainTextObject getTitle() {
        return this.title;
    }

    public String getBlockId() {
        return this.blockId;
    }

    public void setFallback(String fallback) {
        this.fallback = fallback;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public void setImageWidth(Integer imageWidth) {
        this.imageWidth = imageWidth;
    }

    public void setImageHeight(Integer imageHeight) {
        this.imageHeight = imageHeight;
    }

    public void setImageBytes(Integer imageBytes) {
        this.imageBytes = imageBytes;
    }

    public void setAltText(String altText) {
        this.altText = altText;
    }

    public void setTitle(PlainTextObject title) {
        this.title = title;
    }

    public void setBlockId(String blockId) {
        this.blockId = blockId;
    }

    public static class ImageBlockBuilder {
        private String fallback;
        private String imageUrl;
        private Integer imageWidth;
        private Integer imageHeight;
        private Integer imageBytes;
        private String altText;
        private PlainTextObject title;
        private String blockId;

        ImageBlockBuilder() {
        }

        public ImageBlock.ImageBlockBuilder fallback(String fallback) {
            this.fallback = fallback;
            return this;
        }

        public ImageBlock.ImageBlockBuilder imageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }

        public ImageBlock.ImageBlockBuilder imageWidth(Integer imageWidth) {
            this.imageWidth = imageWidth;
            return this;
        }

        public ImageBlock.ImageBlockBuilder imageHeight(Integer imageHeight) {
            this.imageHeight = imageHeight;
            return this;
        }

        public ImageBlock.ImageBlockBuilder imageBytes(Integer imageBytes) {
            this.imageBytes = imageBytes;
            return this;
        }

        public ImageBlock.ImageBlockBuilder altText(String altText) {
            this.altText = altText;
            return this;
        }

        public ImageBlock.ImageBlockBuilder title(PlainTextObject title) {
            this.title = title;
            return this;
        }

        public ImageBlock.ImageBlockBuilder blockId(String blockId) {
            this.blockId = blockId;
            return this;
        }

        public ImageBlock build() {
            return new ImageBlock(fallback, imageUrl, imageWidth, imageHeight, imageBytes, altText, title, blockId);
        }

        public String toString() {
            return "ImageBlock.ImageBlockBuilder(fallback=" + this.fallback + ", imageUrl=" + this.imageUrl + ", imageWidth=" + this.imageWidth + ", imageHeight=" + this.imageHeight + ", imageBytes=" + this.imageBytes + ", altText=" + this.altText + ", title=" + this.title + ", blockId=" + this.blockId + ")";
        }
    }
}
