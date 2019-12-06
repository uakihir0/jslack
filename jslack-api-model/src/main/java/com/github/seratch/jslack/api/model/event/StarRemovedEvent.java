package com.github.seratch.jslack.api.model.event;

import com.github.seratch.jslack.api.model.Attachment;
import com.github.seratch.jslack.api.model.File;
import com.github.seratch.jslack.api.model.FileComment;
import com.github.seratch.jslack.api.model.block.LayoutBlock;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 *
 */
@Getter
@Setter
public class StarRemovedEvent implements Event {

    public static final String TYPE_NAME = "star_removed";

    private final String type = TYPE_NAME;
    private String user;
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