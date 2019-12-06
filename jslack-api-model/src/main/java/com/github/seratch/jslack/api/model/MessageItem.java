package com.github.seratch.jslack.api.model;

import lombok.Getter;
import lombok.Setter;

@Deprecated
@Getter
@Setter
public class MessageItem {

    private String type;
    private String channel;
    private Message message;
    private File file;
    private FileComment comment;
    private Integer created;
}
