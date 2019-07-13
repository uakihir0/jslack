package com.github.seratch.jslack.api.methods.response.reactions;

import com.github.seratch.jslack.api.methods.SlackApiResponse;
import com.github.seratch.jslack.api.model.Attachment;
import com.github.seratch.jslack.api.model.Paging;
import com.github.seratch.jslack.api.model.Reaction;
import com.github.seratch.jslack.api.model.block.LayoutBlock;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ReactionsListResponse implements SlackApiResponse {

    private boolean ok;
    private String warning;
    private String error;
    private String needed;
    private String provided;

    private List<Item> items;
    private Paging paging;

    public ReactionsListResponse() {
    }

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

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof ReactionsListResponse))
            return false;
        final ReactionsListResponse other = (ReactionsListResponse) o;
        if (!other.canEqual((Object) this)) return false;
        if (this.isOk() != other.isOk()) return false;
        final Object this$warning = this.getWarning();
        final Object other$warning = other.getWarning();
        if (this$warning == null ? other$warning != null : !this$warning.equals(other$warning)) return false;
        final Object this$error = this.getError();
        final Object other$error = other.getError();
        if (this$error == null ? other$error != null : !this$error.equals(other$error)) return false;
        final Object this$needed = this.getNeeded();
        final Object other$needed = other.getNeeded();
        if (this$needed == null ? other$needed != null : !this$needed.equals(other$needed)) return false;
        final Object this$provided = this.getProvided();
        final Object other$provided = other.getProvided();
        if (this$provided == null ? other$provided != null : !this$provided.equals(other$provided)) return false;
        final Object this$items = this.getItems();
        final Object other$items = other.getItems();
        if (this$items == null ? other$items != null : !this$items.equals(other$items)) return false;
        final Object this$paging = this.getPaging();
        final Object other$paging = other.getPaging();
        if (this$paging == null ? other$paging != null : !this$paging.equals(other$paging)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof ReactionsListResponse;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = result * PRIME + (this.isOk() ? 79 : 97);
        final Object $warning = this.getWarning();
        result = result * PRIME + ($warning == null ? 43 : $warning.hashCode());
        final Object $error = this.getError();
        result = result * PRIME + ($error == null ? 43 : $error.hashCode());
        final Object $needed = this.getNeeded();
        result = result * PRIME + ($needed == null ? 43 : $needed.hashCode());
        final Object $provided = this.getProvided();
        result = result * PRIME + ($provided == null ? 43 : $provided.hashCode());
        final Object $items = this.getItems();
        result = result * PRIME + ($items == null ? 43 : $items.hashCode());
        final Object $paging = this.getPaging();
        result = result * PRIME + ($paging == null ? 43 : $paging.hashCode());
        return result;
    }

    public String toString() {
        return "ReactionsListResponse(ok=" + this.isOk() + ", warning=" + this.getWarning() + ", error=" + this.getError() + ", needed=" + this.getNeeded() + ", provided=" + this.getProvided() + ", items=" + this.getItems() + ", paging=" + this.getPaging() + ")";
    }

    public static class Item {
        private String type;
        private String channel;
        private Message message;

        public Item() {
        }

        public String getType() {
            return this.type;
        }

        public String getChannel() {
            return this.channel;
        }

        public Message getMessage() {
            return this.message;
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

        public boolean equals(final Object o) {
            if (o == this) return true;
            if (!(o instanceof Item))
                return false;
            final Item other = (Item) o;
            if (!other.canEqual((Object) this)) return false;
            final Object this$type = this.getType();
            final Object other$type = other.getType();
            if (this$type == null ? other$type != null : !this$type.equals(other$type)) return false;
            final Object this$channel = this.getChannel();
            final Object other$channel = other.getChannel();
            if (this$channel == null ? other$channel != null : !this$channel.equals(other$channel)) return false;
            final Object this$message = this.getMessage();
            final Object other$message = other.getMessage();
            if (this$message == null ? other$message != null : !this$message.equals(other$message)) return false;
            return true;
        }

        protected boolean canEqual(final Object other) {
            return other instanceof Item;
        }

        public int hashCode() {
            final int PRIME = 59;
            int result = 1;
            final Object $type = this.getType();
            result = result * PRIME + ($type == null ? 43 : $type.hashCode());
            final Object $channel = this.getChannel();
            result = result * PRIME + ($channel == null ? 43 : $channel.hashCode());
            final Object $message = this.getMessage();
            result = result * PRIME + ($message == null ? 43 : $message.hashCode());
            return result;
        }

        public String toString() {
            return "ReactionsListResponse.Item(type=" + this.getType() + ", channel=" + this.getChannel() + ", message=" + this.getMessage() + ")";
        }

        public static class Message {
            private String type;
            private String subtype;
            private String text;
            private List<Attachment> attachments;
            private List<LayoutBlock> blocks;
            private String ts;
            private String team;
            private String user;
            private String username;
            private String botId;
            private String permalink;
            private List<Reaction> reactions;
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

            public Message() {
            }

            public String getType() {
                return this.type;
            }

            public String getSubtype() {
                return this.subtype;
            }

            public String getText() {
                return this.text;
            }

            public List<Attachment> getAttachments() {
                return this.attachments;
            }

            public List<LayoutBlock> getBlocks() {
                return this.blocks;
            }

            public String getTs() {
                return this.ts;
            }

            public String getTeam() {
                return this.team;
            }

            public String getUser() {
                return this.user;
            }

            public String getUsername() {
                return this.username;
            }

            public String getBotId() {
                return this.botId;
            }

            public String getPermalink() {
                return this.permalink;
            }

            public List<Reaction> getReactions() {
                return this.reactions;
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

            public String getClientMsgId() {
                return this.clientMsgId;
            }

            public Icons getIcons() {
                return this.icons;
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

            public void setAttachments(List<Attachment> attachments) {
                this.attachments = attachments;
            }

            public void setBlocks(List<LayoutBlock> blocks) {
                this.blocks = blocks;
            }

            public void setTs(String ts) {
                this.ts = ts;
            }

            public void setTeam(String team) {
                this.team = team;
            }

            public void setUser(String user) {
                this.user = user;
            }

            public void setUsername(String username) {
                this.username = username;
            }

            public void setBotId(String botId) {
                this.botId = botId;
            }

            public void setPermalink(String permalink) {
                this.permalink = permalink;
            }

            public void setReactions(List<Reaction> reactions) {
                this.reactions = reactions;
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

            public void setClientMsgId(String clientMsgId) {
                this.clientMsgId = clientMsgId;
            }

            public void setIcons(Icons icons) {
                this.icons = icons;
            }

            public boolean equals(final Object o) {
                if (o == this) return true;
                if (!(o instanceof Message))
                    return false;
                final Message other = (Message) o;
                if (!other.canEqual((Object) this)) return false;
                final Object this$type = this.getType();
                final Object other$type = other.getType();
                if (this$type == null ? other$type != null : !this$type.equals(other$type)) return false;
                final Object this$subtype = this.getSubtype();
                final Object other$subtype = other.getSubtype();
                if (this$subtype == null ? other$subtype != null : !this$subtype.equals(other$subtype)) return false;
                final Object this$text = this.getText();
                final Object other$text = other.getText();
                if (this$text == null ? other$text != null : !this$text.equals(other$text)) return false;
                final Object this$attachments = this.getAttachments();
                final Object other$attachments = other.getAttachments();
                if (this$attachments == null ? other$attachments != null : !this$attachments.equals(other$attachments))
                    return false;
                final Object this$blocks = this.getBlocks();
                final Object other$blocks = other.getBlocks();
                if (this$blocks == null ? other$blocks != null : !this$blocks.equals(other$blocks)) return false;
                final Object this$ts = this.getTs();
                final Object other$ts = other.getTs();
                if (this$ts == null ? other$ts != null : !this$ts.equals(other$ts)) return false;
                final Object this$team = this.getTeam();
                final Object other$team = other.getTeam();
                if (this$team == null ? other$team != null : !this$team.equals(other$team)) return false;
                final Object this$user = this.getUser();
                final Object other$user = other.getUser();
                if (this$user == null ? other$user != null : !this$user.equals(other$user)) return false;
                final Object this$username = this.getUsername();
                final Object other$username = other.getUsername();
                if (this$username == null ? other$username != null : !this$username.equals(other$username))
                    return false;
                final Object this$botId = this.getBotId();
                final Object other$botId = other.getBotId();
                if (this$botId == null ? other$botId != null : !this$botId.equals(other$botId)) return false;
                final Object this$permalink = this.getPermalink();
                final Object other$permalink = other.getPermalink();
                if (this$permalink == null ? other$permalink != null : !this$permalink.equals(other$permalink))
                    return false;
                final Object this$reactions = this.getReactions();
                final Object other$reactions = other.getReactions();
                if (this$reactions == null ? other$reactions != null : !this$reactions.equals(other$reactions))
                    return false;
                final Object this$threadTs = this.getThreadTs();
                final Object other$threadTs = other.getThreadTs();
                if (this$threadTs == null ? other$threadTs != null : !this$threadTs.equals(other$threadTs))
                    return false;
                final Object this$replyCount = this.getReplyCount();
                final Object other$replyCount = other.getReplyCount();
                if (this$replyCount == null ? other$replyCount != null : !this$replyCount.equals(other$replyCount))
                    return false;
                final Object this$replyUsersCount = this.getReplyUsersCount();
                final Object other$replyUsersCount = other.getReplyUsersCount();
                if (this$replyUsersCount == null ? other$replyUsersCount != null : !this$replyUsersCount.equals(other$replyUsersCount))
                    return false;
                final Object this$latestReply = this.getLatestReply();
                final Object other$latestReply = other.getLatestReply();
                if (this$latestReply == null ? other$latestReply != null : !this$latestReply.equals(other$latestReply))
                    return false;
                final Object this$replyUsers = this.getReplyUsers();
                final Object other$replyUsers = other.getReplyUsers();
                if (this$replyUsers == null ? other$replyUsers != null : !this$replyUsers.equals(other$replyUsers))
                    return false;
                final Object this$replies = this.getReplies();
                final Object other$replies = other.getReplies();
                if (this$replies == null ? other$replies != null : !this$replies.equals(other$replies)) return false;
                if (this.isSubscribed() != other.isSubscribed()) return false;
                final Object this$lastRead = this.getLastRead();
                final Object other$lastRead = other.getLastRead();
                if (this$lastRead == null ? other$lastRead != null : !this$lastRead.equals(other$lastRead))
                    return false;
                final Object this$clientMsgId = this.getClientMsgId();
                final Object other$clientMsgId = other.getClientMsgId();
                if (this$clientMsgId == null ? other$clientMsgId != null : !this$clientMsgId.equals(other$clientMsgId))
                    return false;
                final Object this$icons = this.getIcons();
                final Object other$icons = other.getIcons();
                if (this$icons == null ? other$icons != null : !this$icons.equals(other$icons)) return false;
                return true;
            }

            protected boolean canEqual(final Object other) {
                return other instanceof Message;
            }

            public int hashCode() {
                final int PRIME = 59;
                int result = 1;
                final Object $type = this.getType();
                result = result * PRIME + ($type == null ? 43 : $type.hashCode());
                final Object $subtype = this.getSubtype();
                result = result * PRIME + ($subtype == null ? 43 : $subtype.hashCode());
                final Object $text = this.getText();
                result = result * PRIME + ($text == null ? 43 : $text.hashCode());
                final Object $attachments = this.getAttachments();
                result = result * PRIME + ($attachments == null ? 43 : $attachments.hashCode());
                final Object $blocks = this.getBlocks();
                result = result * PRIME + ($blocks == null ? 43 : $blocks.hashCode());
                final Object $ts = this.getTs();
                result = result * PRIME + ($ts == null ? 43 : $ts.hashCode());
                final Object $team = this.getTeam();
                result = result * PRIME + ($team == null ? 43 : $team.hashCode());
                final Object $user = this.getUser();
                result = result * PRIME + ($user == null ? 43 : $user.hashCode());
                final Object $username = this.getUsername();
                result = result * PRIME + ($username == null ? 43 : $username.hashCode());
                final Object $botId = this.getBotId();
                result = result * PRIME + ($botId == null ? 43 : $botId.hashCode());
                final Object $permalink = this.getPermalink();
                result = result * PRIME + ($permalink == null ? 43 : $permalink.hashCode());
                final Object $reactions = this.getReactions();
                result = result * PRIME + ($reactions == null ? 43 : $reactions.hashCode());
                final Object $threadTs = this.getThreadTs();
                result = result * PRIME + ($threadTs == null ? 43 : $threadTs.hashCode());
                final Object $replyCount = this.getReplyCount();
                result = result * PRIME + ($replyCount == null ? 43 : $replyCount.hashCode());
                final Object $replyUsersCount = this.getReplyUsersCount();
                result = result * PRIME + ($replyUsersCount == null ? 43 : $replyUsersCount.hashCode());
                final Object $latestReply = this.getLatestReply();
                result = result * PRIME + ($latestReply == null ? 43 : $latestReply.hashCode());
                final Object $replyUsers = this.getReplyUsers();
                result = result * PRIME + ($replyUsers == null ? 43 : $replyUsers.hashCode());
                final Object $replies = this.getReplies();
                result = result * PRIME + ($replies == null ? 43 : $replies.hashCode());
                result = result * PRIME + (this.isSubscribed() ? 79 : 97);
                final Object $lastRead = this.getLastRead();
                result = result * PRIME + ($lastRead == null ? 43 : $lastRead.hashCode());
                final Object $clientMsgId = this.getClientMsgId();
                result = result * PRIME + ($clientMsgId == null ? 43 : $clientMsgId.hashCode());
                final Object $icons = this.getIcons();
                result = result * PRIME + ($icons == null ? 43 : $icons.hashCode());
                return result;
            }

            public String toString() {
                return "ReactionsListResponse.Item.Message(type=" + this.getType() + ", subtype=" + this.getSubtype() + ", text=" + this.getText() + ", attachments=" + this.getAttachments() + ", blocks=" + this.getBlocks() + ", ts=" + this.getTs() + ", team=" + this.getTeam() + ", user=" + this.getUser() + ", username=" + this.getUsername() + ", botId=" + this.getBotId() + ", permalink=" + this.getPermalink() + ", reactions=" + this.getReactions() + ", threadTs=" + this.getThreadTs() + ", replyCount=" + this.getReplyCount() + ", replyUsersCount=" + this.getReplyUsersCount() + ", latestReply=" + this.getLatestReply() + ", replyUsers=" + this.getReplyUsers() + ", replies=" + this.getReplies() + ", subscribed=" + this.isSubscribed() + ", lastRead=" + this.getLastRead() + ", clientMsgId=" + this.getClientMsgId() + ", icons=" + this.getIcons() + ")";
            }

            /**
             * A reply message information in a MessageRoot.
             */
            public static class MessageRootReply {
                private String user;
                private String ts;

                public MessageRootReply() {
                }

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

                public boolean equals(final Object o) {
                    if (o == this) return true;
                    if (!(o instanceof MessageRootReply))
                        return false;
                    final MessageRootReply other = (MessageRootReply) o;
                    if (!other.canEqual((Object) this)) return false;
                    final Object this$user = this.getUser();
                    final Object other$user = other.getUser();
                    if (this$user == null ? other$user != null : !this$user.equals(other$user)) return false;
                    final Object this$ts = this.getTs();
                    final Object other$ts = other.getTs();
                    if (this$ts == null ? other$ts != null : !this$ts.equals(other$ts)) return false;
                    return true;
                }

                protected boolean canEqual(final Object other) {
                    return other instanceof MessageRootReply;
                }

                public int hashCode() {
                    final int PRIME = 59;
                    int result = 1;
                    final Object $user = this.getUser();
                    result = result * PRIME + ($user == null ? 43 : $user.hashCode());
                    final Object $ts = this.getTs();
                    result = result * PRIME + ($ts == null ? 43 : $ts.hashCode());
                    return result;
                }

                public String toString() {
                    return "ReactionsListResponse.Item.Message.MessageRootReply(user=" + this.getUser() + ", ts=" + this.getTs() + ")";
                }
            }

            private boolean subscribed;
            private String lastRead;
            private String clientMsgId;
            private Icons icons;

            public static class Icons {
                @SerializedName("image_36")
                private String image36;
                @SerializedName("image_48")
                private String image48;
                @SerializedName("image_64")
                private String image64;
                @SerializedName("image_72")
                private String image72;

                public Icons() {
                }

                public String getImage36() {
                    return this.image36;
                }

                public String getImage48() {
                    return this.image48;
                }

                public String getImage64() {
                    return this.image64;
                }

                public String getImage72() {
                    return this.image72;
                }

                public void setImage36(String image36) {
                    this.image36 = image36;
                }

                public void setImage48(String image48) {
                    this.image48 = image48;
                }

                public void setImage64(String image64) {
                    this.image64 = image64;
                }

                public void setImage72(String image72) {
                    this.image72 = image72;
                }

                public boolean equals(final Object o) {
                    if (o == this) return true;
                    if (!(o instanceof Icons))
                        return false;
                    final Icons other = (Icons) o;
                    if (!other.canEqual((Object) this)) return false;
                    final Object this$image36 = this.getImage36();
                    final Object other$image36 = other.getImage36();
                    if (this$image36 == null ? other$image36 != null : !this$image36.equals(other$image36))
                        return false;
                    final Object this$image48 = this.getImage48();
                    final Object other$image48 = other.getImage48();
                    if (this$image48 == null ? other$image48 != null : !this$image48.equals(other$image48))
                        return false;
                    final Object this$image64 = this.getImage64();
                    final Object other$image64 = other.getImage64();
                    if (this$image64 == null ? other$image64 != null : !this$image64.equals(other$image64))
                        return false;
                    final Object this$image72 = this.getImage72();
                    final Object other$image72 = other.getImage72();
                    if (this$image72 == null ? other$image72 != null : !this$image72.equals(other$image72))
                        return false;
                    return true;
                }

                protected boolean canEqual(final Object other) {
                    return other instanceof Icons;
                }

                public int hashCode() {
                    final int PRIME = 59;
                    int result = 1;
                    final Object $image36 = this.getImage36();
                    result = result * PRIME + ($image36 == null ? 43 : $image36.hashCode());
                    final Object $image48 = this.getImage48();
                    result = result * PRIME + ($image48 == null ? 43 : $image48.hashCode());
                    final Object $image64 = this.getImage64();
                    result = result * PRIME + ($image64 == null ? 43 : $image64.hashCode());
                    final Object $image72 = this.getImage72();
                    result = result * PRIME + ($image72 == null ? 43 : $image72.hashCode());
                    return result;
                }

                public String toString() {
                    return "ReactionsListResponse.Item.Message.Icons(image36=" + this.getImage36() + ", image48=" + this.getImage48() + ", image64=" + this.getImage64() + ", image72=" + this.getImage72() + ")";
                }
            }
        }
    }
}