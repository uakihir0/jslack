package com.github.seratch.jslack.api.methods.response.stars;

import com.github.seratch.jslack.api.methods.SlackApiResponse;
import com.github.seratch.jslack.api.model.Attachment;
import com.github.seratch.jslack.api.model.File;
import com.github.seratch.jslack.api.model.Paging;
import com.github.seratch.jslack.api.model.Reaction;
import com.github.seratch.jslack.api.model.block.LayoutBlock;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class StarsListResponse implements SlackApiResponse {

    private boolean ok;
    private String warning;
    private String error;
    private String needed;
    private String provided;

    private List<Item> items;
    private Paging paging;

    public boolean isOk() {
        return this.ok;
    }

    public String getWarning() {
        return this.warning;
    }

    public String getError() {
        return this.error;
    }

    public String getNeeded() {
        return this.needed;
    }

    public String getProvided() {
        return this.provided;
    }

    public List<Item> getItems() {
        return this.items;
    }

    public Paging getPaging() {
        return this.paging;
    }

    public void setOk(boolean ok) {
        this.ok = ok;
    }

    public void setWarning(String warning) {
        this.warning = warning;
    }

    public void setError(String error) {
        this.error = error;
    }

    public void setNeeded(String needed) {
        this.needed = needed;
    }

    public void setProvided(String provided) {
        this.provided = provided;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public void setPaging(Paging paging) {
        this.paging = paging;
    }

    public static class Item {
        private String type;
        private String channel;
        private Message message;
        private Integer dateCreate;
        private File file;
        private Comment comment;

        public String getType() {
            return this.type;
        }

        public String getChannel() {
            return this.channel;
        }

        public Message getMessage() {
            return this.message;
        }

        public Integer getDateCreate() {
            return this.dateCreate;
        }

        public File getFile() {
            return this.file;
        }

        public Comment getComment() {
            return this.comment;
        }

        public void setType(String type) {
            this.type = type;
        }

        public void setChannel(String channel) {
            this.channel = channel;
        }

        public void setMessage(Message message) {
            this.message = message;
        }

        public void setDateCreate(Integer dateCreate) {
            this.dateCreate = dateCreate;
        }

        public void setFile(File file) {
            this.file = file;
        }

        public void setComment(Comment comment) {
            this.comment = comment;
        }
    }

    public static class Message {

        private String type;
        private String subtype;
        private String text;
        private String ts;
        private String botId;
        private String team;

        private List<Attachment> attachments;
        private List<LayoutBlock> blocks;

        private String permalink;
        @SerializedName("is_starred")
        private boolean starred;

        private String clientMsgId;
        private String user;
        private String username;
        private String threadTs;
        private Integer replyCount;
        private Integer replyUsersCount;
        private String latestReply;
        private List<String> replyUsers;

        // https://api.slack.com/messaging/retrieving#threading
        // Parent messages in a thread will no longer explicitly list their replies.
        // Instead of a large replies array containing threaded message replies,
        // we'll provide a lighter-weight list of reply_users,
        // plus a reply_users_count and the latest_reply message.
        // These new fields are already available. We'll remove the replies array on October 18, 2019.
        @Deprecated
        private List<MessageRootReply> replies;
        private boolean subscribed;
        private String lastRead;
        private List<Reaction> reactions;

        public String getType() {
            return this.type;
        }

        public String getSubtype() {
            return this.subtype;
        }

        public String getText() {
            return this.text;
        }

        public String getTs() {
            return this.ts;
        }

        public String getBotId() {
            return this.botId;
        }

        public String getTeam() {
            return this.team;
        }

        public List<Attachment> getAttachments() {
            return this.attachments;
        }

        public List<LayoutBlock> getBlocks() {
            return this.blocks;
        }

        public String getPermalink() {
            return this.permalink;
        }

        public boolean isStarred() {
            return this.starred;
        }

        public String getClientMsgId() {
            return this.clientMsgId;
        }

        public String getUser() {
            return this.user;
        }

        public String getUsername() {
            return this.username;
        }

        public String getThreadTs() {
            return this.threadTs;
        }

        public Integer getReplyCount() {
            return this.replyCount;
        }

        public Integer getReplyUsersCount() {
            return this.replyUsersCount;
        }

        public String getLatestReply() {
            return this.latestReply;
        }

        public List<String> getReplyUsers() {
            return this.replyUsers;
        }

        @Deprecated
        public List<MessageRootReply> getReplies() {
            return this.replies;
        }

        public boolean isSubscribed() {
            return this.subscribed;
        }

        public String getLastRead() {
            return this.lastRead;
        }

        public List<Reaction> getReactions() {
            return this.reactions;
        }

        public void setType(String type) {
            this.type = type;
        }

        public void setSubtype(String subtype) {
            this.subtype = subtype;
        }

        public void setText(String text) {
            this.text = text;
        }

        public void setTs(String ts) {
            this.ts = ts;
        }

        public void setBotId(String botId) {
            this.botId = botId;
        }

        public void setTeam(String team) {
            this.team = team;
        }

        public void setAttachments(List<Attachment> attachments) {
            this.attachments = attachments;
        }

        public void setBlocks(List<LayoutBlock> blocks) {
            this.blocks = blocks;
        }

        public void setPermalink(String permalink) {
            this.permalink = permalink;
        }

        public void setStarred(boolean starred) {
            this.starred = starred;
        }

        public void setClientMsgId(String clientMsgId) {
            this.clientMsgId = clientMsgId;
        }

        public void setUser(String user) {
            this.user = user;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public void setThreadTs(String threadTs) {
            this.threadTs = threadTs;
        }

        public void setReplyCount(Integer replyCount) {
            this.replyCount = replyCount;
        }

        public void setReplyUsersCount(Integer replyUsersCount) {
            this.replyUsersCount = replyUsersCount;
        }

        public void setLatestReply(String latestReply) {
            this.latestReply = latestReply;
        }

        public void setReplyUsers(List<String> replyUsers) {
            this.replyUsers = replyUsers;
        }

        @Deprecated
        public void setReplies(List<MessageRootReply> replies) {
            this.replies = replies;
        }

        public void setSubscribed(boolean subscribed) {
            this.subscribed = subscribed;
        }

        public void setLastRead(String lastRead) {
            this.lastRead = lastRead;
        }

        public void setReactions(List<Reaction> reactions) {
            this.reactions = reactions;
        }

        /**
         * A reply message information in a MessageRoot.
         */
        public static class MessageRootReply {
            private String user;
            private String ts;

            public String getUser() {
                return this.user;
            }

            public String getTs() {
                return this.ts;
            }

            public void setUser(String user) {
                this.user = user;
            }

            public void setTs(String ts) {
                this.ts = ts;
            }
        }
    }

    public static class Comment {
        private String id;
        private Integer created;
        private Integer timestamp;
        private String user;
        @SerializedName("is_intro")
        private boolean intro;
        private String comment;
        private Integer numStars;
        @SerializedName("is_starred")
        private boolean starred;

        public String getId() {
            return this.id;
        }

        public Integer getCreated() {
            return this.created;
        }

        public Integer getTimestamp() {
            return this.timestamp;
        }

        public String getUser() {
            return this.user;
        }

        public boolean isIntro() {
            return this.intro;
        }

        public String getComment() {
            return this.comment;
        }

        public Integer getNumStars() {
            return this.numStars;
        }

        public boolean isStarred() {
            return this.starred;
        }

        public void setId(String id) {
            this.id = id;
        }

        public void setCreated(Integer created) {
            this.created = created;
        }

        public void setTimestamp(Integer timestamp) {
            this.timestamp = timestamp;
        }

        public void setUser(String user) {
            this.user = user;
        }

        public void setIntro(boolean intro) {
            this.intro = intro;
        }

        public void setComment(String comment) {
            this.comment = comment;
        }

        public void setNumStars(Integer numStars) {
            this.numStars = numStars;
        }

        public void setStarred(boolean starred) {
            this.starred = starred;
        }
    }
}
