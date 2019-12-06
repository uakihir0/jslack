package com.github.seratch.jslack.api.model.block.element;

import com.github.seratch.jslack.api.model.block.ContextBlockElement;
import lombok.*;

/**
 * https://api.slack.com/reference/messaging/block-elements#image
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ImageElement extends BlockElement implements ContextBlockElement {
    public static final String TYPE = "image";
    private final String type = TYPE;
    private String fallback;
    private String imageUrl;
    private Integer imageWidth;
    private Integer imageHeight;
    private Integer imageBytes;
    private String altText;
}
