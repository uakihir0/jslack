package com.github.seratch.jslack.api.model.block.composition;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

/**
 * https://api.slack.com/reference/messaging/composition-objects#confirm
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ConfirmationDialogObject {
    private PlainTextObject title;
    private TextObject text;
    private PlainTextObject confirm;
    private PlainTextObject deny;
}
