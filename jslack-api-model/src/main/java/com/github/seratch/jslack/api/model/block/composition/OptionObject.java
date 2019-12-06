package com.github.seratch.jslack.api.model.block.composition;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

/**
 * https://api.slack.com/reference/messaging/composition-objects#option
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OptionObject {
    private PlainTextObject text;
    private String value;
}
