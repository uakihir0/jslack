package com.github.seratch.jslack.api.model.block;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

/**
 * https://api.slack.com/reference/messaging/blocks#context
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ContextBlock implements LayoutBlock {
    public static final String TYPE = "context";
    private final String type = TYPE;
    @Builder.Default
    private List<ContextBlockElement> elements = new ArrayList<>();
    private String blockId;
}
