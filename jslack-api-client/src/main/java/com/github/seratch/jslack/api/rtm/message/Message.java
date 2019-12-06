package com.github.seratch.jslack.api.rtm.message;

import com.github.seratch.jslack.api.model.Attachment;
import com.github.seratch.jslack.api.model.block.LayoutBlock;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * https://api.slack.com/events/message
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Message implements RTMMessage {

    public static final String TYPE_NAME = "message";

    private Long id;
    private final String type = TYPE_NAME;
    private String channel;

    private String text;
    private List<LayoutBlock> blocks;
    private List<Attachment> attachments;
}
