package com.github.seratch.jslack.api.methods.response.reactions;

import com.github.seratch.jslack.api.methods.SlackApiResponse;
import com.github.seratch.jslack.api.model.Attachment;
import com.github.seratch.jslack.api.model.BotProfile;
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

            public String getInviter() {
                return this.inviter;
            }

            public String getUserTeam() {
                return this.userTeam;
            }

            public String getSourceTeam() {
                return this.sourceTeam;
            }

            public Icons getIcons() {
                return this.icons;
            }

            public UserProfile getUserProfile() {
                return this.userProfile;
            }

            public BotProfile getBotProfile() {
                return this.botProfile;
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

            public void setInviter(String inviter) {
                this.inviter = inviter;
            }

            public void setUserTeam(String userTeam) {
                this.userTeam = userTeam;
            }

            public void setSourceTeam(String sourceTeam) {
                this.sourceTeam = sourceTeam;
            }

            public void setIcons(Icons icons) {
                this.icons = icons;
            }

            public void setUserProfile(UserProfile userProfile) {
                this.userProfile = userProfile;
            }

            public void setBotProfile(BotProfile botProfile) {
                this.botProfile = botProfile;
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

            private boolean subscribed;
            private String lastRead;
            private String clientMsgId;
            private String inviter;
            private String userTeam;
            private String sourceTeam;
            private Icons icons;
            private UserProfile userProfile;
            private BotProfile botProfile;

            public static class Icons {
                @SerializedName("image_36")
                private String image36;
                @SerializedName("image_48")
                private String image48;
                @SerializedName("image_64")
                private String image64;
                @SerializedName("image_72")
                private String image72;

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
            }

            public static class UserProfile {
                private String avatarHash;
                @SerializedName("image_72")
                private String image72;
                private String firstName;
                private String realName;
                private String displayName;
                private String team;
                private String name;
                /**
                 * is_restricted indicates the user is a multi-channel guest.
                 * see also: https://get.slack.help/hc/en-us/articles/201314026-roles-and-permissions-in-slack
                 */
                @SerializedName("is_restricted")
                private boolean restricted;
                /**
                 * is_ultra_restricted indicates they are a single channel guest.
                 * see also: https://get.slack.help/hc/en-us/articles/201314026-roles-and-permissions-in-slack
                 */
                @SerializedName("is_ultra_restricted")
                private boolean ultraRestricted;

                public String getAvatarHash() {
                    return this.avatarHash;
                }

                public String getImage72() {
                    return this.image72;
                }

                public String getFirstName() {
                    return this.firstName;
                }

                public String getRealName() {
                    return this.realName;
                }

                public String getDisplayName() {
                    return this.displayName;
                }

                public String getTeam() {
                    return this.team;
                }

                public String getName() {
                    return this.name;
                }

                public boolean isRestricted() {
                    return this.restricted;
                }

                public boolean isUltraRestricted() {
                    return this.ultraRestricted;
                }

                public void setAvatarHash(String avatarHash) {
                    this.avatarHash = avatarHash;
                }

                public void setImage72(String image72) {
                    this.image72 = image72;
                }

                public void setFirstName(String firstName) {
                    this.firstName = firstName;
                }

                public void setRealName(String realName) {
                    this.realName = realName;
                }

                public void setDisplayName(String displayName) {
                    this.displayName = displayName;
                }

                public void setTeam(String team) {
                    this.team = team;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public void setRestricted(boolean restricted) {
                    this.restricted = restricted;
                }

                public void setUltraRestricted(boolean ultraRestricted) {
                    this.ultraRestricted = ultraRestricted;
                }
            }
        }
    }
}