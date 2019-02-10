package com.github.seratch.jslack.api.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * https://api.slack.com/docs/message-attachments
 */
public class Attachment {

    /**
     * A plain-text summary of the attachment. This text will be used in clients that don't show formatted text
     * (eg. IRC, mobile notifications) and should not contain any markup.
     */
    private String fallback;

    /**
     * This is optional value that specifies callback id when there are buttons.
     */
    private String callbackId;

    /**
     * Like traffic signals, color-coding messages can quickly communicate intent
     * and help separate them from the flow of other messages in the timeline.
     * <p>
     * An optional value that can either be one of good, warning, danger, or any hex color code (eg. #439FE0).
     * This value is used to color the border along the left side of the message attachment.
     */
    private String color;

    /**
     * This is optional text that appears above the message attachment block.
     */
    private String pretext;

    // -----------------------------------------
    // The author parameters will display a small section at the top of a message attachment that can contain the following fields:

    /**
     * Small text used to display the author's name.
     */
    private String authorName;

    /**
     * A valid URL that will hyperlink the author_name text mentioned above. Will only work if author_name is present.
     */
    private String authorLink;

    /**
     * A valid URL that displays a small 16x16px image to the left of the author_name text. Will only work if author_name is present.
     */
    private String authorIcon;

    // -----------------------------------------
    // Attributes for reply_broadcast message (showing a posted message as an attachment)
    // https://api.slack.com/events/message/reply_broadcast

    // "from_url": "https://lost-generation-authors.slack.com/archives/general/p1482960137003543",
    private String fromUrl;
    // "author_subname": "confused",
    private String authorSubname;
    // "channel_id": "C061EG9SL",
    private String channelId;
    // "channel_name": "general",
    private String channelName;
    //"id": 1,
    private String id;

    // # already exists > "fallback": "[December 28th, 2016 1:22 PM] confused: what was there?",
    // # already exists > "ts": "1482960137.003543",
    // # already exists > "author_link": "https://lost-generation-authors.slack.com/team/confused",
    // # already exists > "author_icon": "https://...png",
    // # already exists > "mrkdwn_in": ["text"],
    // # already exists > "text": "island",
    // # already exists > "footer": "5 replies"

    @SerializedName("is_msg_unfurl")
    private boolean msgUnfurl;

    @SerializedName("is_reply_unfurl")
    private boolean replyUnfurl;

    /**
     * The title is displayed as larger, bold text near the top of a message attachment.
     * By passing a valid URL in the title_link parameter (optional), the title text will be hyperlinked.
     */
    private String title;

    /**
     * The title is displayed as larger, bold text near the top of a message attachment.
     * By passing a valid URL in the title_link parameter (optional), the title text will be hyperlinked.
     */
    private String titleLink;

    /**
     * This is the main text in a message attachment, and can contain standard message markup (see details below).
     * The content will automatically collapse if it contains 700+ characters or 5+ linebreaks,
     * and will display a "Show more..." link to expand the content.
     * <p>
     * https://api.slack.com/docs/message-attachments#message_formatting
     */
    private String text;

    /**
     * Fields are defined as an array, and hashes contained within it will be displayed in a table inside the message attachment.
     */
    private List<Field> fields = new ArrayList<>();

    /**
     * A valid URL to an image file that will be displayed inside a message attachment.
     * We currently support the following formats: GIF, JPEG, PNG, and BMP.
     * <p>
     * Large images will be resized to a maximum width of 400px or a maximum height of 500px,
     * while still maintaining the original aspect ratio.
     */
    private String imageUrl;

    /**
     * A valid URL to an image file that will be displayed as a thumbnail on the right side of a message attachment.
     * We currently support the following formats: GIF, JPEG, PNG, and BMP.
     * <p>
     * The thumbnail's longest dimension will be scaled down to 75px while maintaining the aspect ratio of the image.
     * The filesize of the image must also be less than 500 KB.
     * <p>
     * For best results, please use images that are already 75px by 75px.
     */
    private String thumbUrl;

    // Your message attachments may also contain a subtle footer,
    // which is especially useful when citing content in conjunction with author parameters.

    /**
     * Add some brief text to help contextualize and identify an attachment.
     * Limited to 300 characters, and may be truncated further when displayed to users in environments with limited screen real estate.
     */
    private String footer;

    /**
     * To render a small icon beside your footer text, provide a publicly accessible URL string in the footer_icon field.
     * You must also provide a footer for the field to be recognized.
     * <p>
     * We'll render what you provide at 16px by 16px. It's best to use an image that is similarly sized.
     */
    private String footerIcon;

    /**
     * ts (timestamp)
     * Does your attachment relate to something happening at a specific time?
     * <p>
     * By providing the ts field with an integer value in "epoch time",
     * the attachment will display an additional timestamp value as part of the attachment's footer.
     * <p>
     * Use ts when referencing articles or happenings. Your message will have its own timestamp when published.
     */
    private String ts;

    /**
     * By default,
     * <a href="https://api.slack.com/docs/message-formatting#message_formatting>message text
     * in attachments</a> are not formatted. To enable formatting on attachment fields, add the
     * name of the field (as defined in the API) in this list.
     */
    private List<String> mrkdwnIn = new ArrayList<>();

    /**
     * Actions are defined as an array, and hashes contained within it will be displayed in as buttons in the message attachment.
     */
    private List<Action> actions = new ArrayList<>();

    Attachment(String fallback, String callbackId, String color, String pretext, String authorName, String authorLink, String authorIcon, String fromUrl, String authorSubname, String channelId, String channelName, String id, boolean msgUnfurl, boolean replyUnfurl, String title, String titleLink, String text, List<Field> fields, String imageUrl, String thumbUrl, String footer, String footerIcon, String ts, List<String> mrkdwnIn, List<Action> actions) {
        this.fallback = fallback;
        this.callbackId = callbackId;
        this.color = color;
        this.pretext = pretext;
        this.authorName = authorName;
        this.authorLink = authorLink;
        this.authorIcon = authorIcon;
        this.fromUrl = fromUrl;
        this.authorSubname = authorSubname;
        this.channelId = channelId;
        this.channelName = channelName;
        this.id = id;
        this.msgUnfurl = msgUnfurl;
        this.replyUnfurl = replyUnfurl;
        this.title = title;
        this.titleLink = titleLink;
        this.text = text;
        this.fields = fields;
        this.imageUrl = imageUrl;
        this.thumbUrl = thumbUrl;
        this.footer = footer;
        this.footerIcon = footerIcon;
        this.ts = ts;
        this.mrkdwnIn = mrkdwnIn;
        this.actions = actions;
    }

    public static AttachmentBuilder builder() {
        return new AttachmentBuilder();
    }

    public String getFallback() {
        return this.fallback;
    }

    public String getCallbackId() {
        return this.callbackId;
    }

    public String getColor() {
        return this.color;
    }

    public String getPretext() {
        return this.pretext;
    }

    public String getAuthorName() {
        return this.authorName;
    }

    public String getAuthorLink() {
        return this.authorLink;
    }

    public String getAuthorIcon() {
        return this.authorIcon;
    }

    public String getFromUrl() {
        return this.fromUrl;
    }

    public String getAuthorSubname() {
        return this.authorSubname;
    }

    public String getChannelId() {
        return this.channelId;
    }

    public String getChannelName() {
        return this.channelName;
    }

    public String getId() {
        return this.id;
    }

    public boolean isMsgUnfurl() {
        return this.msgUnfurl;
    }

    public boolean isReplyUnfurl() {
        return this.replyUnfurl;
    }

    public String getTitle() {
        return this.title;
    }

    public String getTitleLink() {
        return this.titleLink;
    }

    public String getText() {
        return this.text;
    }

    public List<Field> getFields() {
        return this.fields;
    }

    public String getImageUrl() {
        return this.imageUrl;
    }

    public String getThumbUrl() {
        return this.thumbUrl;
    }

    public String getFooter() {
        return this.footer;
    }

    public String getFooterIcon() {
        return this.footerIcon;
    }

    public String getTs() {
        return this.ts;
    }

    public List<String> getMrkdwnIn() {
        return this.mrkdwnIn;
    }

    public List<Action> getActions() {
        return this.actions;
    }

    public void setFallback(String fallback) {
        this.fallback = fallback;
    }

    public void setCallbackId(String callbackId) {
        this.callbackId = callbackId;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPretext(String pretext) {
        this.pretext = pretext;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public void setAuthorLink(String authorLink) {
        this.authorLink = authorLink;
    }

    public void setAuthorIcon(String authorIcon) {
        this.authorIcon = authorIcon;
    }

    public void setFromUrl(String fromUrl) {
        this.fromUrl = fromUrl;
    }

    public void setAuthorSubname(String authorSubname) {
        this.authorSubname = authorSubname;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setMsgUnfurl(boolean msgUnfurl) {
        this.msgUnfurl = msgUnfurl;
    }

    public void setReplyUnfurl(boolean replyUnfurl) {
        this.replyUnfurl = replyUnfurl;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setTitleLink(String titleLink) {
        this.titleLink = titleLink;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setFields(List<Field> fields) {
        this.fields = fields;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public void setThumbUrl(String thumbUrl) {
        this.thumbUrl = thumbUrl;
    }

    public void setFooter(String footer) {
        this.footer = footer;
    }

    public void setFooterIcon(String footerIcon) {
        this.footerIcon = footerIcon;
    }

    public void setTs(String ts) {
        this.ts = ts;
    }

    public void setMrkdwnIn(List<String> mrkdwnIn) {
        this.mrkdwnIn = mrkdwnIn;
    }

    public void setActions(List<Action> actions) {
        this.actions = actions;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Attachment)) return false;
        final Attachment other = (Attachment) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$fallback = this.getFallback();
        final Object other$fallback = other.getFallback();
        if (this$fallback == null ? other$fallback != null : !this$fallback.equals(other$fallback)) return false;
        final Object this$callbackId = this.getCallbackId();
        final Object other$callbackId = other.getCallbackId();
        if (this$callbackId == null ? other$callbackId != null : !this$callbackId.equals(other$callbackId))
            return false;
        final Object this$color = this.getColor();
        final Object other$color = other.getColor();
        if (this$color == null ? other$color != null : !this$color.equals(other$color)) return false;
        final Object this$pretext = this.getPretext();
        final Object other$pretext = other.getPretext();
        if (this$pretext == null ? other$pretext != null : !this$pretext.equals(other$pretext)) return false;
        final Object this$authorName = this.getAuthorName();
        final Object other$authorName = other.getAuthorName();
        if (this$authorName == null ? other$authorName != null : !this$authorName.equals(other$authorName))
            return false;
        final Object this$authorLink = this.getAuthorLink();
        final Object other$authorLink = other.getAuthorLink();
        if (this$authorLink == null ? other$authorLink != null : !this$authorLink.equals(other$authorLink))
            return false;
        final Object this$authorIcon = this.getAuthorIcon();
        final Object other$authorIcon = other.getAuthorIcon();
        if (this$authorIcon == null ? other$authorIcon != null : !this$authorIcon.equals(other$authorIcon))
            return false;
        final Object this$fromUrl = this.getFromUrl();
        final Object other$fromUrl = other.getFromUrl();
        if (this$fromUrl == null ? other$fromUrl != null : !this$fromUrl.equals(other$fromUrl)) return false;
        final Object this$authorSubname = this.getAuthorSubname();
        final Object other$authorSubname = other.getAuthorSubname();
        if (this$authorSubname == null ? other$authorSubname != null : !this$authorSubname.equals(other$authorSubname))
            return false;
        final Object this$channelId = this.getChannelId();
        final Object other$channelId = other.getChannelId();
        if (this$channelId == null ? other$channelId != null : !this$channelId.equals(other$channelId)) return false;
        final Object this$channelName = this.getChannelName();
        final Object other$channelName = other.getChannelName();
        if (this$channelName == null ? other$channelName != null : !this$channelName.equals(other$channelName))
            return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        if (this.isMsgUnfurl() != other.isMsgUnfurl()) return false;
        if (this.isReplyUnfurl() != other.isReplyUnfurl()) return false;
        final Object this$title = this.getTitle();
        final Object other$title = other.getTitle();
        if (this$title == null ? other$title != null : !this$title.equals(other$title)) return false;
        final Object this$titleLink = this.getTitleLink();
        final Object other$titleLink = other.getTitleLink();
        if (this$titleLink == null ? other$titleLink != null : !this$titleLink.equals(other$titleLink)) return false;
        final Object this$text = this.getText();
        final Object other$text = other.getText();
        if (this$text == null ? other$text != null : !this$text.equals(other$text)) return false;
        final Object this$fields = this.getFields();
        final Object other$fields = other.getFields();
        if (this$fields == null ? other$fields != null : !this$fields.equals(other$fields)) return false;
        final Object this$imageUrl = this.getImageUrl();
        final Object other$imageUrl = other.getImageUrl();
        if (this$imageUrl == null ? other$imageUrl != null : !this$imageUrl.equals(other$imageUrl)) return false;
        final Object this$thumbUrl = this.getThumbUrl();
        final Object other$thumbUrl = other.getThumbUrl();
        if (this$thumbUrl == null ? other$thumbUrl != null : !this$thumbUrl.equals(other$thumbUrl)) return false;
        final Object this$footer = this.getFooter();
        final Object other$footer = other.getFooter();
        if (this$footer == null ? other$footer != null : !this$footer.equals(other$footer)) return false;
        final Object this$footerIcon = this.getFooterIcon();
        final Object other$footerIcon = other.getFooterIcon();
        if (this$footerIcon == null ? other$footerIcon != null : !this$footerIcon.equals(other$footerIcon))
            return false;
        final Object this$ts = this.getTs();
        final Object other$ts = other.getTs();
        if (this$ts == null ? other$ts != null : !this$ts.equals(other$ts)) return false;
        final Object this$mrkdwnIn = this.getMrkdwnIn();
        final Object other$mrkdwnIn = other.getMrkdwnIn();
        if (this$mrkdwnIn == null ? other$mrkdwnIn != null : !this$mrkdwnIn.equals(other$mrkdwnIn)) return false;
        final Object this$actions = this.getActions();
        final Object other$actions = other.getActions();
        if (this$actions == null ? other$actions != null : !this$actions.equals(other$actions)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Attachment;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $fallback = this.getFallback();
        result = result * PRIME + ($fallback == null ? 43 : $fallback.hashCode());
        final Object $callbackId = this.getCallbackId();
        result = result * PRIME + ($callbackId == null ? 43 : $callbackId.hashCode());
        final Object $color = this.getColor();
        result = result * PRIME + ($color == null ? 43 : $color.hashCode());
        final Object $pretext = this.getPretext();
        result = result * PRIME + ($pretext == null ? 43 : $pretext.hashCode());
        final Object $authorName = this.getAuthorName();
        result = result * PRIME + ($authorName == null ? 43 : $authorName.hashCode());
        final Object $authorLink = this.getAuthorLink();
        result = result * PRIME + ($authorLink == null ? 43 : $authorLink.hashCode());
        final Object $authorIcon = this.getAuthorIcon();
        result = result * PRIME + ($authorIcon == null ? 43 : $authorIcon.hashCode());
        final Object $fromUrl = this.getFromUrl();
        result = result * PRIME + ($fromUrl == null ? 43 : $fromUrl.hashCode());
        final Object $authorSubname = this.getAuthorSubname();
        result = result * PRIME + ($authorSubname == null ? 43 : $authorSubname.hashCode());
        final Object $channelId = this.getChannelId();
        result = result * PRIME + ($channelId == null ? 43 : $channelId.hashCode());
        final Object $channelName = this.getChannelName();
        result = result * PRIME + ($channelName == null ? 43 : $channelName.hashCode());
        final Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        result = result * PRIME + (this.isMsgUnfurl() ? 79 : 97);
        result = result * PRIME + (this.isReplyUnfurl() ? 79 : 97);
        final Object $title = this.getTitle();
        result = result * PRIME + ($title == null ? 43 : $title.hashCode());
        final Object $titleLink = this.getTitleLink();
        result = result * PRIME + ($titleLink == null ? 43 : $titleLink.hashCode());
        final Object $text = this.getText();
        result = result * PRIME + ($text == null ? 43 : $text.hashCode());
        final Object $fields = this.getFields();
        result = result * PRIME + ($fields == null ? 43 : $fields.hashCode());
        final Object $imageUrl = this.getImageUrl();
        result = result * PRIME + ($imageUrl == null ? 43 : $imageUrl.hashCode());
        final Object $thumbUrl = this.getThumbUrl();
        result = result * PRIME + ($thumbUrl == null ? 43 : $thumbUrl.hashCode());
        final Object $footer = this.getFooter();
        result = result * PRIME + ($footer == null ? 43 : $footer.hashCode());
        final Object $footerIcon = this.getFooterIcon();
        result = result * PRIME + ($footerIcon == null ? 43 : $footerIcon.hashCode());
        final Object $ts = this.getTs();
        result = result * PRIME + ($ts == null ? 43 : $ts.hashCode());
        final Object $mrkdwnIn = this.getMrkdwnIn();
        result = result * PRIME + ($mrkdwnIn == null ? 43 : $mrkdwnIn.hashCode());
        final Object $actions = this.getActions();
        result = result * PRIME + ($actions == null ? 43 : $actions.hashCode());
        return result;
    }

    public String toString() {
        return "Attachment(fallback=" + this.getFallback() + ", callbackId=" + this.getCallbackId() + ", color=" + this.getColor() + ", pretext=" + this.getPretext() + ", authorName=" + this.getAuthorName() + ", authorLink=" + this.getAuthorLink() + ", authorIcon=" + this.getAuthorIcon() + ", fromUrl=" + this.getFromUrl() + ", authorSubname=" + this.getAuthorSubname() + ", channelId=" + this.getChannelId() + ", channelName=" + this.getChannelName() + ", id=" + this.getId() + ", msgUnfurl=" + this.isMsgUnfurl() + ", replyUnfurl=" + this.isReplyUnfurl() + ", title=" + this.getTitle() + ", titleLink=" + this.getTitleLink() + ", text=" + this.getText() + ", fields=" + this.getFields() + ", imageUrl=" + this.getImageUrl() + ", thumbUrl=" + this.getThumbUrl() + ", footer=" + this.getFooter() + ", footerIcon=" + this.getFooterIcon() + ", ts=" + this.getTs() + ", mrkdwnIn=" + this.getMrkdwnIn() + ", actions=" + this.getActions() + ")";
    }

    public static class AttachmentBuilder {
        private String fallback;
        private String callbackId;
        private String color;
        private String pretext;
        private String authorName;
        private String authorLink;
        private String authorIcon;
        private String fromUrl;
        private String authorSubname;
        private String channelId;
        private String channelName;
        private String id;
        private boolean msgUnfurl;
        private boolean replyUnfurl;
        private String title;
        private String titleLink;
        private String text;
        private List<Field> fields;
        private String imageUrl;
        private String thumbUrl;
        private String footer;
        private String footerIcon;
        private String ts;
        private List<String> mrkdwnIn;
        private List<Action> actions;

        AttachmentBuilder() {
        }

        public Attachment.AttachmentBuilder fallback(String fallback) {
            this.fallback = fallback;
            return this;
        }

        public Attachment.AttachmentBuilder callbackId(String callbackId) {
            this.callbackId = callbackId;
            return this;
        }

        public Attachment.AttachmentBuilder color(String color) {
            this.color = color;
            return this;
        }

        public Attachment.AttachmentBuilder pretext(String pretext) {
            this.pretext = pretext;
            return this;
        }

        public Attachment.AttachmentBuilder authorName(String authorName) {
            this.authorName = authorName;
            return this;
        }

        public Attachment.AttachmentBuilder authorLink(String authorLink) {
            this.authorLink = authorLink;
            return this;
        }

        public Attachment.AttachmentBuilder authorIcon(String authorIcon) {
            this.authorIcon = authorIcon;
            return this;
        }

        public Attachment.AttachmentBuilder fromUrl(String fromUrl) {
            this.fromUrl = fromUrl;
            return this;
        }

        public Attachment.AttachmentBuilder authorSubname(String authorSubname) {
            this.authorSubname = authorSubname;
            return this;
        }

        public Attachment.AttachmentBuilder channelId(String channelId) {
            this.channelId = channelId;
            return this;
        }

        public Attachment.AttachmentBuilder channelName(String channelName) {
            this.channelName = channelName;
            return this;
        }

        public Attachment.AttachmentBuilder id(String id) {
            this.id = id;
            return this;
        }

        public Attachment.AttachmentBuilder msgUnfurl(boolean msgUnfurl) {
            this.msgUnfurl = msgUnfurl;
            return this;
        }

        public Attachment.AttachmentBuilder replyUnfurl(boolean replyUnfurl) {
            this.replyUnfurl = replyUnfurl;
            return this;
        }

        public Attachment.AttachmentBuilder title(String title) {
            this.title = title;
            return this;
        }

        public Attachment.AttachmentBuilder titleLink(String titleLink) {
            this.titleLink = titleLink;
            return this;
        }

        public Attachment.AttachmentBuilder text(String text) {
            this.text = text;
            return this;
        }

        public Attachment.AttachmentBuilder fields(List<Field> fields) {
            this.fields = fields;
            return this;
        }

        public Attachment.AttachmentBuilder imageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }

        public Attachment.AttachmentBuilder thumbUrl(String thumbUrl) {
            this.thumbUrl = thumbUrl;
            return this;
        }

        public Attachment.AttachmentBuilder footer(String footer) {
            this.footer = footer;
            return this;
        }

        public Attachment.AttachmentBuilder footerIcon(String footerIcon) {
            this.footerIcon = footerIcon;
            return this;
        }

        public Attachment.AttachmentBuilder ts(String ts) {
            this.ts = ts;
            return this;
        }

        public Attachment.AttachmentBuilder mrkdwnIn(List<String> mrkdwnIn) {
            this.mrkdwnIn = mrkdwnIn;
            return this;
        }

        public Attachment.AttachmentBuilder actions(List<Action> actions) {
            this.actions = actions;
            return this;
        }

        public Attachment build() {
            return new Attachment(fallback, callbackId, color, pretext, authorName, authorLink, authorIcon, fromUrl, authorSubname, channelId, channelName, id, msgUnfurl, replyUnfurl, title, titleLink, text, fields, imageUrl, thumbUrl, footer, footerIcon, ts, mrkdwnIn, actions);
        }

        public String toString() {
            return "Attachment.AttachmentBuilder(fallback=" + this.fallback + ", callbackId=" + this.callbackId + ", color=" + this.color + ", pretext=" + this.pretext + ", authorName=" + this.authorName + ", authorLink=" + this.authorLink + ", authorIcon=" + this.authorIcon + ", fromUrl=" + this.fromUrl + ", authorSubname=" + this.authorSubname + ", channelId=" + this.channelId + ", channelName=" + this.channelName + ", id=" + this.id + ", msgUnfurl=" + this.msgUnfurl + ", replyUnfurl=" + this.replyUnfurl + ", title=" + this.title + ", titleLink=" + this.titleLink + ", text=" + this.text + ", fields=" + this.fields + ", imageUrl=" + this.imageUrl + ", thumbUrl=" + this.thumbUrl + ", footer=" + this.footer + ", footerIcon=" + this.footerIcon + ", ts=" + this.ts + ", mrkdwnIn=" + this.mrkdwnIn + ", actions=" + this.actions + ")";
        }
    }
}
