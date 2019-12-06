package com.github.seratch.jslack.api.model.event;

import com.github.seratch.jslack.api.model.Attachment;
import com.github.seratch.jslack.api.model.File;
import com.github.seratch.jslack.api.model.FileComment;
import com.github.seratch.jslack.api.model.block.LayoutBlock;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * When an item is starred, the star_added event is sent to all connected clients for the authenticated user who starred the item.
 * <p>
 * See the stars.list method for details of the structure of the item property.
 * <p>
 * https://api.slack.com/events/star_added
 */
@Getter
@Setter
public class StarAddedEvent implements Event {

    public static final String TYPE_NAME = "star_added";

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