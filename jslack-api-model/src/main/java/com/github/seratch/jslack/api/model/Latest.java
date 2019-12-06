package com.github.seratch.jslack.api.model;

import com.github.seratch.jslack.api.model.block.LayoutBlock;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Latest {

    private String clientMsgId;

    private String type;
    private String subtype;
    private String team;
    private String user;
    private String username;
    private String text;
    private String topic; // groups
    private List<Attachment> attachments;
    private List<LayoutBlock> blocks;
    private List<File> files;
    private List<Reaction> reactions;
    private Message.MessageRoot root;
    private boolean upload;
    private boolean displayAsBot;
    private String botId;
    private String botLink;
    private String threadTs;
    private String ts;
    private Message.Icons icons;
    private List<String> xFiles;
}
