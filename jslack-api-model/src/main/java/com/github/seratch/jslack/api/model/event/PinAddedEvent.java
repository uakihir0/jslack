package com.github.seratch.jslack.api.model.event;

import com.github.seratch.jslack.api.model.Attachment;
import com.github.seratch.jslack.api.model.File;
import com.github.seratch.jslack.api.model.FileComment;
import com.github.seratch.jslack.api.model.block.LayoutBlock;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * When an item is pinned in a channel, the pin_added event is sent to all members of that channel.
 * <p>
 * https://api.slack.com/events/pin_added
 */
@Getter
@Setter
public class PinAddedEvent implements Event {

    public static final String TYPE_NAME = "pin_added";

    private final String type = TYPE_NAME;
    private String user;
    private String channelId;
    private Item item;
    private String eventTs;

    @Getter
@Setter
    public static class Item {
        private String type;
        private String channel;
        private String createdBy; // user id
        private Integer created;

        private Message message;
        private File file; // TODO: correct definition
        private FileComment comment; // TODO: correct definition
    }

    @Getter
@Setter
    public static class Message {
        private String clientMsgId;
        private String type;
        private String user;
        private String text;
        private List<LayoutBlock> blocks;
        private List<Attachment> attachments;
        private String ts;
        private List<String> pinnedTo;
        private String permalink;
    }

}