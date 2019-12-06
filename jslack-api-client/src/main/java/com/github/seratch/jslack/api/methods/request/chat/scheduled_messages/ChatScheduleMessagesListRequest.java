package com.github.seratch.jslack.api.methods.request.chat.scheduled_messages;

import com.github.seratch.jslack.api.methods.SlackApiRequest;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class ChatScheduleMessagesListRequest implements SlackApiRequest {

    private String token;

    /**
     * The channel of the scheduled messages
     */
    private String channel;

    /**
     * For pagination purposes, this is the cursor value returned from a previous call to chat.scheduledmessages.list
     * indicating where you want to start this call from.
     */
    private String cursor;

    /**
     * A UNIX timestamp of the latest value in the time range
     */
    private String latest;

    /**
     * Maximum number of original entries to return.
     */
    private Integer limit;

    /**
     * A UNIX timestamp of the oldest value in the time range
     */
    private String oldest;

}