package com.github.seratch.jslack.api.model.block;

import com.github.seratch.jslack.api.model.block.composition.PlainTextObject;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

/**
 * https://api.slack.com/reference/messaging/blocks#image
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
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
}
