package com.github.seratch.jslack.api.model;

import com.google.gson.annotations.SerializedName;

public class MatchedItem {

    private String type;
    private Channel channel;
    private String user;
    private String username;
    private String ts;
    private String text;
    private String permalink;
    private String name;
    private String preview;
    private String timestamp;
    @SerializedName("thumb_360")
    private String thumb360;
    @SerializedName("url_private")
    private String urlprivate;

    @SerializedName("previous_2")
    private OtherItem previous2;
    private OtherItem previous;
    private OtherItem next;
    @SerializedName("next_2")
    private OtherItem next2;

    public MatchedItem() {
    }

    public String getType() {
        return this.type;
    }

    public Channel getChannel() {
        return this.channel;
    }

    public String getUser() {
        return this.user;
    }

    public String getUsername() {
        return this.username;
    }

    public String getTs() {
        return this.ts;
    }

    public String getText() {
        return this.text;
    }

    public String getPermalink() {
        return this.permalink;
    }

    public String getName() {
        return this.name;
    }

    public String getPreview() {
        return this.preview;
    }

    public String getTimestamp() {
        return this.timestamp;
    }

    public String getThumb360() {
        return this.thumb360;
    }

    public String getUrlprivate() {
        return this.urlprivate;
    }

    public OtherItem getPrevious2() {
        return this.previous2;
    }

    public OtherItem getPrevious() {
        return this.previous;
    }

    public OtherItem getNext() {
        return this.next;
    }

    public OtherItem getNext2() {
        return this.next2;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setChannel(Channel channel) {
        this.channel = channel;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setTs(String ts) {
        this.ts = ts;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setPermalink(String permalink) {
        this.permalink = permalink;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPreview(String preview) {
        this.preview = preview;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public void setThumb360(String thumb360) {
        this.thumb360 = thumb360;
    }

    public void setUrlprivate(String urlprivate) {
        this.urlprivate = urlprivate;
    }

    public void setPrevious2(OtherItem previous2) {
        this.previous2 = previous2;
    }

    public void setPrevious(OtherItem previous) {
        this.previous = previous;
    }

    public void setNext(OtherItem next) {
        this.next = next;
    }

    public void setNext2(OtherItem next2) {
        this.next2 = next2;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof MatchedItem)) return false;
        final MatchedItem other = (MatchedItem) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$type = this.getType();
        final Object other$type = other.getType();
        if (this$type == null ? other$type != null : !this$type.equals(other$type)) return false;
        final Object this$channel = this.getChannel();
        final Object other$channel = other.getChannel();
        if (this$channel == null ? other$channel != null : !this$channel.equals(other$channel)) return false;
        final Object this$user = this.getUser();
        final Object other$user = other.getUser();
        if (this$user == null ? other$user != null : !this$user.equals(other$user)) return false;
        final Object this$username = this.getUsername();
        final Object other$username = other.getUsername();
        if (this$username == null ? other$username != null : !this$username.equals(other$username)) return false;
        final Object this$ts = this.getTs();
        final Object other$ts = other.getTs();
        if (this$ts == null ? other$ts != null : !this$ts.equals(other$ts)) return false;
        final Object this$text = this.getText();
        final Object other$text = other.getText();
        if (this$text == null ? other$text != null : !this$text.equals(other$text)) return false;
        final Object this$permalink = this.getPermalink();
        final Object other$permalink = other.getPermalink();
        if (this$permalink == null ? other$permalink != null : !this$permalink.equals(other$permalink)) return false;
        final Object this$name = this.getName();
        final Object other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
        final Object this$preview = this.getPreview();
        final Object other$preview = other.getPreview();
        if (this$preview == null ? other$preview != null : !this$preview.equals(other$preview)) return false;
        final Object this$timestamp = this.getTimestamp();
        final Object other$timestamp = other.getTimestamp();
        if (this$timestamp == null ? other$timestamp != null : !this$timestamp.equals(other$timestamp)) return false;
        final Object this$thumb360 = this.getThumb360();
        final Object other$thumb360 = other.getThumb360();
        if (this$thumb360 == null ? other$thumb360 != null : !this$thumb360.equals(other$thumb360)) return false;
        final Object this$urlprivate = this.getUrlprivate();
        final Object other$urlprivate = other.getUrlprivate();
        if (this$urlprivate == null ? other$urlprivate != null : !this$urlprivate.equals(other$urlprivate))
            return false;
        final Object this$previous2 = this.getPrevious2();
        final Object other$previous2 = other.getPrevious2();
        if (this$previous2 == null ? other$previous2 != null : !this$previous2.equals(other$previous2)) return false;
        final Object this$previous = this.getPrevious();
        final Object other$previous = other.getPrevious();
        if (this$previous == null ? other$previous != null : !this$previous.equals(other$previous)) return false;
        final Object this$next = this.getNext();
        final Object other$next = other.getNext();
        if (this$next == null ? other$next != null : !this$next.equals(other$next)) return false;
        final Object this$next2 = this.getNext2();
        final Object other$next2 = other.getNext2();
        if (this$next2 == null ? other$next2 != null : !this$next2.equals(other$next2)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof MatchedItem;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $type = this.getType();
        result = result * PRIME + ($type == null ? 43 : $type.hashCode());
        final Object $channel = this.getChannel();
        result = result * PRIME + ($channel == null ? 43 : $channel.hashCode());
        final Object $user = this.getUser();
        result = result * PRIME + ($user == null ? 43 : $user.hashCode());
        final Object $username = this.getUsername();
        result = result * PRIME + ($username == null ? 43 : $username.hashCode());
        final Object $ts = this.getTs();
        result = result * PRIME + ($ts == null ? 43 : $ts.hashCode());
        final Object $text = this.getText();
        result = result * PRIME + ($text == null ? 43 : $text.hashCode());
        final Object $permalink = this.getPermalink();
        result = result * PRIME + ($permalink == null ? 43 : $permalink.hashCode());
        final Object $name = this.getName();
        result = result * PRIME + ($name == null ? 43 : $name.hashCode());
        final Object $preview = this.getPreview();
        result = result * PRIME + ($preview == null ? 43 : $preview.hashCode());
        final Object $timestamp = this.getTimestamp();
        result = result * PRIME + ($timestamp == null ? 43 : $timestamp.hashCode());
        final Object $thumb360 = this.getThumb360();
        result = result * PRIME + ($thumb360 == null ? 43 : $thumb360.hashCode());
        final Object $urlprivate = this.getUrlprivate();
        result = result * PRIME + ($urlprivate == null ? 43 : $urlprivate.hashCode());
        final Object $previous2 = this.getPrevious2();
        result = result * PRIME + ($previous2 == null ? 43 : $previous2.hashCode());
        final Object $previous = this.getPrevious();
        result = result * PRIME + ($previous == null ? 43 : $previous.hashCode());
        final Object $next = this.getNext();
        result = result * PRIME + ($next == null ? 43 : $next.hashCode());
        final Object $next2 = this.getNext2();
        result = result * PRIME + ($next2 == null ? 43 : $next2.hashCode());
        return result;
    }

    public String toString() {
        return "MatchedItem(type=" + this.getType() + ", channel=" + this.getChannel() + ", user=" + this.getUser() + ", username=" + this.getUsername() + ", ts=" + this.getTs() + ", text=" + this.getText() + ", permalink=" + this.getPermalink() + ", name=" + this.getName() + ", preview=" + this.getPreview() + ", timestamp=" + this.getTimestamp() + ", thumb360=" + this.getThumb360() + ", urlprivate=" + this.getUrlprivate() + ", previous2=" + this.getPrevious2() + ", previous=" + this.getPrevious() + ", next=" + this.getNext() + ", next2=" + this.getNext2() + ")";
    }

    public static class Channel {
        private String id;
        private String name;

        public Channel() {
        }

        public String getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }

        public void setId(String id) {
            this.id = id;
        }

        public void setName(String name) {
            this.name = name;
        }

        public boolean equals(final Object o) {
            if (o == this) return true;
            if (!(o instanceof Channel)) return false;
            final Channel other = (Channel) o;
            if (!other.canEqual((Object) this)) return false;
            final Object this$id = this.getId();
            final Object other$id = other.getId();
            if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
            final Object this$name = this.getName();
            final Object other$name = other.getName();
            if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
            return true;
        }

        protected boolean canEqual(final Object other) {
            return other instanceof Channel;
        }

        public int hashCode() {
            final int PRIME = 59;
            int result = 1;
            final Object $id = this.getId();
            result = result * PRIME + ($id == null ? 43 : $id.hashCode());
            final Object $name = this.getName();
            result = result * PRIME + ($name == null ? 43 : $name.hashCode());
            return result;
        }

        public String toString() {
            return "MatchedItem.Channel(id=" + this.getId() + ", name=" + this.getName() + ")";
        }
    }

    public static class OtherItem {
        private String user;
        private String username;
        private String ts;
        private String text;
        private String type;

        public OtherItem() {
        }

        public String getUser() {
            return this.user;
        }

        public String getUsername() {
            return this.username;
        }

        public String getTs() {
            return this.ts;
        }

        public String getText() {
            return this.text;
        }

        public String getType() {
            return this.type;
        }

        public void setUser(String user) {
            this.user = user;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public void setTs(String ts) {
            this.ts = ts;
        }

        public void setText(String text) {
            this.text = text;
        }

        public void setType(String type) {
            this.type = type;
        }

        public boolean equals(final Object o) {
            if (o == this) return true;
            if (!(o instanceof OtherItem)) return false;
            final OtherItem other = (OtherItem) o;
            if (!other.canEqual((Object) this)) return false;
            final Object this$user = this.getUser();
            final Object other$user = other.getUser();
            if (this$user == null ? other$user != null : !this$user.equals(other$user)) return false;
            final Object this$username = this.getUsername();
            final Object other$username = other.getUsername();
            if (this$username == null ? other$username != null : !this$username.equals(other$username)) return false;
            final Object this$ts = this.getTs();
            final Object other$ts = other.getTs();
            if (this$ts == null ? other$ts != null : !this$ts.equals(other$ts)) return false;
            final Object this$text = this.getText();
            final Object other$text = other.getText();
            if (this$text == null ? other$text != null : !this$text.equals(other$text)) return false;
            final Object this$type = this.getType();
            final Object other$type = other.getType();
            if (this$type == null ? other$type != null : !this$type.equals(other$type)) return false;
            return true;
        }

        protected boolean canEqual(final Object other) {
            return other instanceof OtherItem;
        }

        public int hashCode() {
            final int PRIME = 59;
            int result = 1;
            final Object $user = this.getUser();
            result = result * PRIME + ($user == null ? 43 : $user.hashCode());
            final Object $username = this.getUsername();
            result = result * PRIME + ($username == null ? 43 : $username.hashCode());
            final Object $ts = this.getTs();
            result = result * PRIME + ($ts == null ? 43 : $ts.hashCode());
            final Object $text = this.getText();
            result = result * PRIME + ($text == null ? 43 : $text.hashCode());
            final Object $type = this.getType();
            result = result * PRIME + ($type == null ? 43 : $type.hashCode());
            return result;
        }

        public String toString() {
            return "MatchedItem.OtherItem(user=" + this.getUser() + ", username=" + this.getUsername() + ", ts=" + this.getTs() + ", text=" + this.getText() + ", type=" + this.getType() + ")";
        }
    }

}
