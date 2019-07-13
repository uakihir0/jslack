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

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof ImageBlock)) return false;
        final ImageBlock other = (ImageBlock) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$type = this.getType();
        final Object other$type = other.getType();
        if (this$type == null ? other$type != null : !this$type.equals(other$type)) return false;
        final Object this$fallback = this.getFallback();
        final Object other$fallback = other.getFallback();
        if (this$fallback == null ? other$fallback != null : !this$fallback.equals(other$fallback)) return false;
        final Object this$imageUrl = this.getImageUrl();
        final Object other$imageUrl = other.getImageUrl();
        if (this$imageUrl == null ? other$imageUrl != null : !this$imageUrl.equals(other$imageUrl)) return false;
        final Object this$imageWidth = this.getImageWidth();
        final Object other$imageWidth = other.getImageWidth();
        if (this$imageWidth == null ? other$imageWidth != null : !this$imageWidth.equals(other$imageWidth))
            return false;
        final Object this$imageHeight = this.getImageHeight();
        final Object other$imageHeight = other.getImageHeight();
        if (this$imageHeight == null ? other$imageHeight != null : !this$imageHeight.equals(other$imageHeight))
            return false;
        final Object this$imageBytes = this.getImageBytes();
        final Object other$imageBytes = other.getImageBytes();
        if (this$imageBytes == null ? other$imageBytes != null : !this$imageBytes.equals(other$imageBytes))
            return false;
        final Object this$altText = this.getAltText();
        final Object other$altText = other.getAltText();
        if (this$altText == null ? other$altText != null : !this$altText.equals(other$altText)) return false;
        final Object this$title = this.getTitle();
        final Object other$title = other.getTitle();
        if (this$title == null ? other$title != null : !this$title.equals(other$title)) return false;
        final Object this$blockId = this.getBlockId();
        final Object other$blockId = other.getBlockId();
        if (this$blockId == null ? other$blockId != null : !this$blockId.equals(other$blockId)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof ImageBlock;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $type = this.getType();
        result = result * PRIME + ($type == null ? 43 : $type.hashCode());
        final Object $fallback = this.getFallback();
        result = result * PRIME + ($fallback == null ? 43 : $fallback.hashCode());
        final Object $imageUrl = this.getImageUrl();
        result = result * PRIME + ($imageUrl == null ? 43 : $imageUrl.hashCode());
        final Object $imageWidth = this.getImageWidth();
        result = result * PRIME + ($imageWidth == null ? 43 : $imageWidth.hashCode());
        final Object $imageHeight = this.getImageHeight();
        result = result * PRIME + ($imageHeight == null ? 43 : $imageHeight.hashCode());
        final Object $imageBytes = this.getImageBytes();
        result = result * PRIME + ($imageBytes == null ? 43 : $imageBytes.hashCode());
        final Object $altText = this.getAltText();
        result = result * PRIME + ($altText == null ? 43 : $altText.hashCode());
        final Object $title = this.getTitle();
        result = result * PRIME + ($title == null ? 43 : $title.hashCode());
        final Object $blockId = this.getBlockId();
        result = result * PRIME + ($blockId == null ? 43 : $blockId.hashCode());
        return result;
    }

    public String toString() {
        return "ImageBlock(type=" + this.getType() + ", fallback=" + this.getFallback() + ", imageUrl=" + this.getImageUrl() + ", imageWidth=" + this.getImageWidth() + ", imageHeight=" + this.getImageHeight() + ", imageBytes=" + this.getImageBytes() + ", altText=" + this.getAltText() + ", title=" + this.getTitle() + ", blockId=" + this.getBlockId() + ")";
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
