package com.github.seratch.jslack.api.model.block;

import com.github.seratch.jslack.api.model.block.composition.TextObject;
import com.github.seratch.jslack.api.model.block.element.BlockElement;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * https://api.slack.com/reference/messaging/blocks#section
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SectionBlock implements LayoutBlock {
    public static final String TYPE = "section";
    private final String type = TYPE;
    private TextObject text;
    private String blockId;
    private List<TextObject> fields;
    private BlockElement accessory;
}
