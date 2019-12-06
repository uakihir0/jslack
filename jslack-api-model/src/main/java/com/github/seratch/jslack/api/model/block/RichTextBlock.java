package com.github.seratch.jslack.api.model.block;

import com.github.seratch.jslack.api.model.block.element.BlockElement;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

/**
 * https://api.slack.com/changelog/2019-09-what-they-see-is-what-you-get-and-more-and-less
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RichTextBlock implements LayoutBlock {
    public static final String TYPE = "rich_text";
    private final String type = TYPE;
    @Builder.Default
    private List<BlockElement> elements = new ArrayList<>();
    private String blockId;
}
