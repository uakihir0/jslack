package com.github.seratch.jslack.app_backend.interactive_messages.response;

import com.github.seratch.jslack.api.model.Attachment;
import com.github.seratch.jslack.api.model.block.LayoutBlock;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ActionResponse {
    private String responseType; // ephemeral, in_channel
    private String text;
    private boolean replaceOriginal;
    private boolean deleteOriginal;
    private List<Attachment> attachments;
    private List<LayoutBlock> blocks;
}
