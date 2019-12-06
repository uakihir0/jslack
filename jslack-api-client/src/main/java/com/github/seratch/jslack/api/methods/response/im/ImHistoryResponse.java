package com.github.seratch.jslack.api.methods.response.im;

import com.github.seratch.jslack.api.methods.SlackApiResponse;
import com.github.seratch.jslack.api.model.Message;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ImHistoryResponse implements SlackApiResponse {

    private boolean ok;
    private String warning;
    private String error;
    private String needed;
    private String provided;

    private String latest;
    private List<Message> messages;
    private boolean hasMore;
    private String channelActionsTs;
    private Integer channelActionsCount;
}