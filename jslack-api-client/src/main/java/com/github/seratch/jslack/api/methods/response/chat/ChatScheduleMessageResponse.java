package com.github.seratch.jslack.api.methods.response.chat;

import com.github.seratch.jslack.api.methods.SlackApiResponse;
import com.github.seratch.jslack.api.model.Attachment;
import com.github.seratch.jslack.api.model.BotProfile;
import com.github.seratch.jslack.api.model.block.LayoutBlock;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ChatScheduleMessageResponse implements SlackApiResponse {

    private boolean ok;
    private String warning;
    private String error;
    private String needed;
    private String provided;

    private String scheduledMessageId;
    private String channel;
    private Integer postAt;
    private ScheduledMessage message;

    @Getter
@Setter
    public static class ScheduledMessage {
        private String botId;
        private BotProfile botProfile;

        private String type;
        private String team;
        private String user;

        private String text;
        private List<Attachment> attachments;
        private List<LayoutBlock> blocks;

    }
}