package com.github.seratch.jslack.api.model.block.element;

import java.util.ArrayList;
import java.util.List;

/**
 * https://api.slack.com/changelog/2019-09-what-they-see-is-what-you-get-and-more-and-less
 */
public class RichTextSectionElement extends BlockElement implements RichTextElement {
    public static final String TYPE = "rich_text_section";
    private final String type = TYPE;
    private List<RichTextElement> elements = new ArrayList<>();

    public RichTextSectionElement(List<RichTextElement> elements) {
        this.elements = elements;
    }

    public RichTextSectionElement() {
    }

    public static RichTextSectionElementBuilder builder() {
        return new RichTextSectionElementBuilder();
    }

    public String getType() {
        return this.type;
    }

    public List<RichTextElement> getElements() {
        return this.elements;
    }

    public void setElements(List<RichTextElement> elements) {
        this.elements = elements;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof RichTextSectionElement)) return false;
        final RichTextSectionElement other = (RichTextSectionElement) o;
        if (!other.canEqual((Object) this)) return false;
        if (!super.equals(o)) return false;
        final Object this$type = this.getType();
        final Object other$type = other.getType();
        if (this$type == null ? other$type != null : !this$type.equals(other$type)) return false;
        final Object this$elements = this.getElements();
        final Object other$elements = other.getElements();
        if (this$elements == null ? other$elements != null : !this$elements.equals(other$elements)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof RichTextSectionElement;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        final Object $type = this.getType();
        result = result * PRIME + ($type == null ? 43 : $type.hashCode());
        final Object $elements = this.getElements();
        result = result * PRIME + ($elements == null ? 43 : $elements.hashCode());
        return result;
    }

    // -------------------------------
    // Elements
    // -------------------------------

    public static class Text implements RichTextElement {
        public static final String TYPE = "text";
        private final String type = TYPE;
        private String text;
        private TextStyle style;

        public Text(String text, TextStyle style) {
            this.text = text;
            this.style = style;
        }

        public Text() {
        }

        public static TextBuilder builder() {
            return new TextBuilder();
        }

        public String getType() {
            return this.type;
        }

        public String getText() {
            return this.text;
        }

        public TextStyle getStyle() {
            return this.style;
        }

        public void setText(String text) {
            this.text = text;
        }

        public void setStyle(TextStyle style) {
            this.style = style;
        }

        public static class TextBuilder {
            private String text;
            private TextStyle style;

            TextBuilder() {
            }

            public Text.TextBuilder text(String text) {
                this.text = text;
                return this;
            }

            public Text.TextBuilder style(TextStyle style) {
                this.style = style;
                return this;
            }

            public Text build() {
                return new Text(text, style);
            }

            public String toString() {
                return "RichTextSectionElement.Text.TextBuilder(text=" + this.text + ", style=" + this.style + ")";
            }
        }
    }

    public static class Channel implements RichTextElement {
        public static final String TYPE = "channel";
        private final String type = TYPE;
        private String channelId; // C12345678
        private TextStyle style;

        public Channel(String channelId, TextStyle style) {
            this.channelId = channelId;
            this.style = style;
        }

        public Channel() {
        }

        public static ChannelBuilder builder() {
            return new ChannelBuilder();
        }

        public String getType() {
            return this.type;
        }

        public String getChannelId() {
            return this.channelId;
        }

        public TextStyle getStyle() {
            return this.style;
        }

        public void setChannelId(String channelId) {
            this.channelId = channelId;
        }

        public void setStyle(TextStyle style) {
            this.style = style;
        }

        public static class ChannelBuilder {
            private String channelId;
            private TextStyle style;

            ChannelBuilder() {
            }

            public Channel.ChannelBuilder channelId(String channelId) {
                this.channelId = channelId;
                return this;
            }

            public Channel.ChannelBuilder style(TextStyle style) {
                this.style = style;
                return this;
            }

            public Channel build() {
                return new Channel(channelId, style);
            }

            public String toString() {
                return "RichTextSectionElement.Channel.ChannelBuilder(channelId=" + this.channelId + ", style=" + this.style + ")";
            }
        }
    }

    public static class User implements RichTextElement {
        public static final String TYPE = "user";
        private final String type = TYPE;
        private String userId; // W12345678
        private TextStyle style;

        public User(String userId, TextStyle style) {
            this.userId = userId;
            this.style = style;
        }

        public User() {
        }

        public static UserBuilder builder() {
            return new UserBuilder();
        }

        public String getType() {
            return this.type;
        }

        public String getUserId() {
            return this.userId;
        }

        public TextStyle getStyle() {
            return this.style;
        }

        public void setUserId(String userId) {
            this.userId = userId;
        }

        public void setStyle(TextStyle style) {
            this.style = style;
        }

        public static class UserBuilder {
            private String userId;
            private TextStyle style;

            UserBuilder() {
            }

            public User.UserBuilder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public User.UserBuilder style(TextStyle style) {
                this.style = style;
                return this;
            }

            public User build() {
                return new User(userId, style);
            }

            public String toString() {
                return "RichTextSectionElement.User.UserBuilder(userId=" + this.userId + ", style=" + this.style + ")";
            }
        }
    }

    public static class Emoji implements RichTextElement {
        public static final String TYPE = "emoji";
        private final String type = TYPE;
        private String name;

        public Emoji(String name) {
            this.name = name;
        }

        public Emoji() {
        }

        public static EmojiBuilder builder() {
            return new EmojiBuilder();
        }

        public String getType() {
            return this.type;
        }

        public String getName() {
            return this.name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public static class EmojiBuilder {
            private String name;

            EmojiBuilder() {
            }

            public Emoji.EmojiBuilder name(String name) {
                this.name = name;
                return this;
            }

            public Emoji build() {
                return new Emoji(name);
            }

            public String toString() {
                return "RichTextSectionElement.Emoji.EmojiBuilder(name=" + this.name + ")";
            }
        }
    }

    public static class Link implements RichTextElement {
        public static final String TYPE = "link";
        private final String type = TYPE;
        private String url;
        private String text;
        private TextStyle style;

        public Link(String url, String text, TextStyle style) {
            this.url = url;
            this.text = text;
            this.style = style;
        }

        public Link() {
        }

        public static LinkBuilder builder() {
            return new LinkBuilder();
        }

        public String getType() {
            return this.type;
        }

        public String getUrl() {
            return this.url;
        }

        public String getText() {
            return this.text;
        }

        public TextStyle getStyle() {
            return this.style;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public void setText(String text) {
            this.text = text;
        }

        public void setStyle(TextStyle style) {
            this.style = style;
        }

        public static class LinkBuilder {
            private String url;
            private String text;
            private TextStyle style;

            LinkBuilder() {
            }

            public Link.LinkBuilder url(String url) {
                this.url = url;
                return this;
            }

            public Link.LinkBuilder text(String text) {
                this.text = text;
                return this;
            }

            public Link.LinkBuilder style(TextStyle style) {
                this.style = style;
                return this;
            }

            public Link build() {
                return new Link(url, text, style);
            }

            public String toString() {
                return "RichTextSectionElement.Link.LinkBuilder(url=" + this.url + ", text=" + this.text + ", style=" + this.style + ")";
            }
        }
    }

    public static class Team implements RichTextElement {
        public static final String TYPE = "team";
        private final String type = TYPE;
        private String teamId;
        private TextStyle style;

        public Team(String teamId, TextStyle style) {
            this.teamId = teamId;
            this.style = style;
        }

        public Team() {
        }

        public static TeamBuilder builder() {
            return new TeamBuilder();
        }

        public String getType() {
            return this.type;
        }

        public String getTeamId() {
            return this.teamId;
        }

        public TextStyle getStyle() {
            return this.style;
        }

        public void setTeamId(String teamId) {
            this.teamId = teamId;
        }

        public void setStyle(TextStyle style) {
            this.style = style;
        }

        public static class TeamBuilder {
            private String teamId;
            private TextStyle style;

            TeamBuilder() {
            }

            public Team.TeamBuilder teamId(String teamId) {
                this.teamId = teamId;
                return this;
            }

            public Team.TeamBuilder style(TextStyle style) {
                this.style = style;
                return this;
            }

            public Team build() {
                return new Team(teamId, style);
            }

            public String toString() {
                return "RichTextSectionElement.Team.TeamBuilder(teamId=" + this.teamId + ", style=" + this.style + ")";
            }
        }
    }

    public static class UserGroup implements RichTextElement {
        public static final String TYPE = "usergroup";
        private final String type = TYPE;
        private String usergroupId;

        public UserGroup(String usergroupId) {
            this.usergroupId = usergroupId;
        }

        public UserGroup() {
        }

        public static UserGroupBuilder builder() {
            return new UserGroupBuilder();
        }

        public String getType() {
            return this.type;
        }

        public String getUsergroupId() {
            return this.usergroupId;
        }

        public void setUsergroupId(String usergroupId) {
            this.usergroupId = usergroupId;
        }

        public static class UserGroupBuilder {
            private String usergroupId;

            UserGroupBuilder() {
            }

            public UserGroup.UserGroupBuilder usergroupId(String usergroupId) {
                this.usergroupId = usergroupId;
                return this;
            }

            public UserGroup build() {
                return new UserGroup(usergroupId);
            }

            public String toString() {
                return "RichTextSectionElement.UserGroup.UserGroupBuilder(usergroupId=" + this.usergroupId + ")";
            }
        }
    }

    public static class Date implements RichTextElement {
        public static final String TYPE = "date";
        private final String type = TYPE;
        private String timestamp;

        public Date(String timestamp) {
            this.timestamp = timestamp;
        }

        public Date() {
        }

        public static DateBuilder builder() {
            return new DateBuilder();
        }

        public String getType() {
            return this.type;
        }

        public String getTimestamp() {
            return this.timestamp;
        }

        public void setTimestamp(String timestamp) {
            this.timestamp = timestamp;
        }

        public static class DateBuilder {
            private String timestamp;

            DateBuilder() {
            }

            public Date.DateBuilder timestamp(String timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            public Date build() {
                return new Date(timestamp);
            }

            public String toString() {
                return "RichTextSectionElement.Date.DateBuilder(timestamp=" + this.timestamp + ")";
            }
        }
    }

    public static class Broadcast implements RichTextElement {
        public static final String TYPE = "broadcast";
        private final String type = TYPE;
        private String range; // channel, here, ..

        public Broadcast(String range) {
            this.range = range;
        }

        public Broadcast() {
        }

        public static BroadcastBuilder builder() {
            return new BroadcastBuilder();
        }

        public String getType() {
            return this.type;
        }

        public String getRange() {
            return this.range;
        }

        public void setRange(String range) {
            this.range = range;
        }

        public static class BroadcastBuilder {
            private String range;

            BroadcastBuilder() {
            }

            public Broadcast.BroadcastBuilder range(String range) {
                this.range = range;
                return this;
            }

            public Broadcast build() {
                return new Broadcast(range);
            }

            public String toString() {
                return "RichTextSectionElement.Broadcast.BroadcastBuilder(range=" + this.range + ")";
            }
        }
    }

    // -------------------------------

    public static class TextStyle {
        private boolean bold;
        private boolean italic;
        private boolean strike;

        public TextStyle(boolean bold, boolean italic, boolean strike) {
            this.bold = bold;
            this.italic = italic;
            this.strike = strike;
        }

        public TextStyle() {
        }

        public static TextStyleBuilder builder() {
            return new TextStyleBuilder();
        }

        public boolean isBold() {
            return this.bold;
        }

        public boolean isItalic() {
            return this.italic;
        }

        public boolean isStrike() {
            return this.strike;
        }

        public void setBold(boolean bold) {
            this.bold = bold;
        }

        public void setItalic(boolean italic) {
            this.italic = italic;
        }

        public void setStrike(boolean strike) {
            this.strike = strike;
        }

        public static class TextStyleBuilder {
            private boolean bold;
            private boolean italic;
            private boolean strike;

            TextStyleBuilder() {
            }

            public TextStyle.TextStyleBuilder bold(boolean bold) {
                this.bold = bold;
                return this;
            }

            public TextStyle.TextStyleBuilder italic(boolean italic) {
                this.italic = italic;
                return this;
            }

            public TextStyle.TextStyleBuilder strike(boolean strike) {
                this.strike = strike;
                return this;
            }

            public TextStyle build() {
                return new TextStyle(bold, italic, strike);
            }

            public String toString() {
                return "RichTextSectionElement.TextStyle.TextStyleBuilder(bold=" + this.bold + ", italic=" + this.italic + ", strike=" + this.strike + ")";
            }
        }
    }

    public static class RichTextSectionElementBuilder {
        private List<RichTextElement> elements;

        RichTextSectionElementBuilder() {
        }

        public RichTextSectionElement.RichTextSectionElementBuilder elements(List<RichTextElement> elements) {
            this.elements = elements;
            return this;
        }

        public RichTextSectionElement build() {
            return new RichTextSectionElement(elements);
        }

        public String toString() {
            return "RichTextSectionElement.RichTextSectionElementBuilder(elements=" + this.elements + ")";
        }
    }
}