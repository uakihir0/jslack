package com.github.seratch.jslack.api.model;

import com.github.seratch.jslack.api.model.block.LayoutBlock;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * https://api.slack.com/docs/message-attachments
 */
public class Attachment {

    private String msgSubtype; // "bot_message"

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

    private String serviceUrl;

    private String serviceName;

    private String serviceIcon;

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

    private String originalUrl;

    // "author_subname": "confused",
    private String authorSubname;
    // "channel_id": "C061EG9SL",
    private String channelId;
    // "channel_name": "general",
    private String channelName;
    //"id": 1,
    private Integer id;

    private String botId;

    private Boolean indent;

    public Attachment(String msgSubtype, String fallback, String callbackId, String color, String pretext, String serviceUrl, String serviceName, String serviceIcon, String authorName, String authorLink, String authorIcon, String fromUrl, String originalUrl, String authorSubname, String channelId, String channelName, Integer id, String botId, Boolean indent, Boolean msgUnfurl, Boolean replyUnfurl, Boolean threadRootUnfurl, Boolean appUnfurl, String appUnfurlUrl, String title, String titleLink, String text, List<Field> fields, String imageUrl, Integer imageWidth, Integer imageHeight, Integer imageBytes, String thumbUrl, Integer thumbWidth, Integer thumbHeight, String videoHtml, Integer videoHtmlWidth, Integer videoHtmlHeight, String footer, String footerIcon, String ts, List<String> mrkdwnIn, List<Action> actions, List<LayoutBlock> blocks, String filename, Integer size, String mimetype, String url, AttachmentMetadata metadata) {
        this.msgSubtype = msgSubtype;
        this.fallback = fallback;
        this.callbackId = callbackId;
        this.color = color;
        this.pretext = pretext;
        this.serviceUrl = serviceUrl;
        this.serviceName = serviceName;
        this.serviceIcon = serviceIcon;
        this.authorName = authorName;
        this.authorLink = authorLink;
        this.authorIcon = authorIcon;
        this.fromUrl = fromUrl;
        this.originalUrl = originalUrl;
        this.authorSubname = authorSubname;
        this.channelId = channelId;
        this.channelName = channelName;
        this.id = id;
        this.botId = botId;
        this.indent = indent;
        this.msgUnfurl = msgUnfurl;
        this.replyUnfurl = replyUnfurl;
        this.threadRootUnfurl = threadRootUnfurl;
        this.appUnfurl = appUnfurl;
        this.appUnfurlUrl = appUnfurlUrl;
        this.title = title;
        this.titleLink = titleLink;
        this.text = text;
        this.fields = fields;
        this.imageUrl = imageUrl;
        this.imageWidth = imageWidth;
        this.imageHeight = imageHeight;
        this.imageBytes = imageBytes;
        this.thumbUrl = thumbUrl;
        this.thumbWidth = thumbWidth;
        this.thumbHeight = thumbHeight;
        this.videoHtml = videoHtml;
        this.videoHtmlWidth = videoHtmlWidth;
        this.videoHtmlHeight = videoHtmlHeight;
        this.footer = footer;
        this.footerIcon = footerIcon;
        this.ts = ts;
        this.mrkdwnIn = mrkdwnIn;
        this.actions = actions;
        this.blocks = blocks;
        this.filename = filename;
        this.size = size;
        this.mimetype = mimetype;
        this.url = url;
        this.metadata = metadata;
    }

    public Attachment() {
    }

    public static AttachmentBuilder builder() {
        return new AttachmentBuilder();
    }

    public Boolean isIndent() {
        return this.indent;
    }

    public void setIndent(Boolean indent) {
        this.indent = indent;
    }

    // # already exists > "fallback": "[December 28th, 2016 1:22 PM] confused: what was there?",
    // # already exists > "ts": "1482960137.003543",
    // # already exists > "author_link": "https://lost-generation-authors.slack.com/team/confused",
    // # already exists > "author_icon": "https://...png",
    // # already exists > "mrkdwn_in": ["text"],
    // # already exists > "text": "island",
    // # already exists > "footer": "5 replies"

    /**
     * NOTE: The the following Booleans (is_msg_unfurl, is_reply_unfurl, is_thread_root_unfurl,
     * is_app_unfurl) default to null intentionally to support block attachments.
     */

    @SerializedName("is_msg_unfurl")
    private Boolean msgUnfurl;

    public Boolean isMsgUnfurl() {
        return this.msgUnfurl;
    }

    public void setMsgUnfurl(Boolean msgUnfurl) {
        this.msgUnfurl = msgUnfurl;
    }

    @SerializedName("is_reply_unfurl")
    private Boolean replyUnfurl;

    public Boolean isReplyUnfurl() {
        return this.replyUnfurl;
    }

    public void setReplyUnfurl(Boolean replyUnfurl) {
        this.replyUnfurl = replyUnfurl;
    }

    @SerializedName("is_thread_root_unfurl")
    private Boolean threadRootUnfurl;

    public Boolean isThreadRootUnfurl() {
        return this.threadRootUnfurl;
    }

    public void setThreadRootUnfurl(Boolean threadRootUnfurl) {
        this.threadRootUnfurl = threadRootUnfurl;
    }

    @SerializedName("is_app_unfurl")
    private Boolean appUnfurl;

    public Boolean isAppUnfurl() {
        return this.appUnfurl;
    }

    public void setAppUnfurl(Boolean appUnfurl) {
        this.appUnfurl = appUnfurl;
    }

    private String appUnfurlUrl;

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

    private Integer imageWidth;
    private Integer imageHeight;
    private Integer imageBytes;

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

    private Integer thumbWidth;
    private Integer thumbHeight;

    private String videoHtml;

    private Integer videoHtmlWidth;
    private Integer videoHtmlHeight;

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
     * <a href="https://api.slack.com/docs/message-formatting#message_formatting">message text
     * in attachments</a> are not formatted. To enable formatting on attachment fields, add the
     * name of the field (as defined in the API) in this list.
     */
    private List<String> mrkdwnIn = new ArrayList<>();

    /**
     * Actions are defined as an array, and hashes contained within it will be displayed in as buttons in the message attachment.
     */
    private List<Action> actions = new ArrayList<>();

    private List<LayoutBlock> blocks;

    // --------------------------
    // Files

    private String filename;
    private Integer size;
    private String mimetype;
    private String url;
    private AttachmentMetadata metadata;

    public String getMsgSubtype() {
        return this.msgSubtype;
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

    public String getServiceUrl() {
        return this.serviceUrl;
    }

    public String getServiceName() {
        return this.serviceName;
    }

    public String getServiceIcon() {
        return this.serviceIcon;
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

    public String getOriginalUrl() {
        return this.originalUrl;
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

    public Integer getId() {
        return this.id;
    }

    public String getBotId() {
        return this.botId;
    }

    public String getAppUnfurlUrl() {
        return this.appUnfurlUrl;
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

    public Integer getImageWidth() {
        return this.imageWidth;
    }

    public Integer getImageHeight() {
        return this.imageHeight;
    }

    public Integer getImageBytes() {
        return this.imageBytes;
    }

    public String getThumbUrl() {
        return this.thumbUrl;
    }

    public Integer getThumbWidth() {
        return this.thumbWidth;
    }

    public Integer getThumbHeight() {
        return this.thumbHeight;
    }

    public String getVideoHtml() {
        return this.videoHtml;
    }

    public Integer getVideoHtmlWidth() {
        return this.videoHtmlWidth;
    }

    public Integer getVideoHtmlHeight() {
        return this.videoHtmlHeight;
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

    public List<LayoutBlock> getBlocks() {
        return this.blocks;
    }

    public String getFilename() {
        return this.filename;
    }

    public Integer getSize() {
        return this.size;
    }

    public String getMimetype() {
        return this.mimetype;
    }

    public String getUrl() {
        return this.url;
    }

    public AttachmentMetadata getMetadata() {
        return this.metadata;
    }

    public void setMsgSubtype(String msgSubtype) {
        this.msgSubtype = msgSubtype;
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

    public void setServiceUrl(String serviceUrl) {
        this.serviceUrl = serviceUrl;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public void setServiceIcon(String serviceIcon) {
        this.serviceIcon = serviceIcon;
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

    public void setOriginalUrl(String originalUrl) {
        this.originalUrl = originalUrl;
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

    public void setId(Integer id) {
        this.id = id;
    }

    public void setBotId(String botId) {
        this.botId = botId;
    }

    public void setAppUnfurlUrl(String appUnfurlUrl) {
        this.appUnfurlUrl = appUnfurlUrl;
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

    public void setImageWidth(Integer imageWidth) {
        this.imageWidth = imageWidth;
    }

    public void setImageHeight(Integer imageHeight) {
        this.imageHeight = imageHeight;
    }

    public void setImageBytes(Integer imageBytes) {
        this.imageBytes = imageBytes;
    }

    public void setThumbUrl(String thumbUrl) {
        this.thumbUrl = thumbUrl;
    }

    public void setThumbWidth(Integer thumbWidth) {
        this.thumbWidth = thumbWidth;
    }

    public void setThumbHeight(Integer thumbHeight) {
        this.thumbHeight = thumbHeight;
    }

    public void setVideoHtml(String videoHtml) {
        this.videoHtml = videoHtml;
    }

    public void setVideoHtmlWidth(Integer videoHtmlWidth) {
        this.videoHtmlWidth = videoHtmlWidth;
    }

    public void setVideoHtmlHeight(Integer videoHtmlHeight) {
        this.videoHtmlHeight = videoHtmlHeight;
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

    public void setBlocks(List<LayoutBlock> blocks) {
        this.blocks = blocks;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public void setMimetype(String mimetype) {
        this.mimetype = mimetype;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setMetadata(AttachmentMetadata metadata) {
        this.metadata = metadata;
    }

    public static class AttachmentMetadata {

        @SerializedName("thumb_64")
        private Boolean thumb64;
        @SerializedName("thumb_80")
        private Boolean thumb80;
        @SerializedName("thumb_160")
        private Boolean thumb160;

        @SerializedName("original_w")
        private Integer originalWidth;
        @SerializedName("original_h")
        private Integer originalHeight;

        @SerializedName("thumb_360_w")
        private Integer thumb360Width;
        @SerializedName("thumb_360_h")
        private Integer thumb360Height;

        private String format;
        private String extension;
        private Integer rotation;
        private String thumbTiny;

        public AttachmentMetadata(Boolean thumb64, Boolean thumb80, Boolean thumb160, Integer originalWidth, Integer originalHeight, Integer thumb360Width, Integer thumb360Height, String format, String extension, Integer rotation, String thumbTiny) {
            this.thumb64 = thumb64;
            this.thumb80 = thumb80;
            this.thumb160 = thumb160;
            this.originalWidth = originalWidth;
            this.originalHeight = originalHeight;
            this.thumb360Width = thumb360Width;
            this.thumb360Height = thumb360Height;
            this.format = format;
            this.extension = extension;
            this.rotation = rotation;
            this.thumbTiny = thumbTiny;
        }

        public AttachmentMetadata() {
        }

        public static AttachmentMetadataBuilder builder() {
            return new AttachmentMetadataBuilder();
        }

        public Boolean getThumb64() {
            return this.thumb64;
        }

        public Boolean getThumb80() {
            return this.thumb80;
        }

        public Boolean getThumb160() {
            return this.thumb160;
        }

        public Integer getOriginalWidth() {
            return this.originalWidth;
        }

        public Integer getOriginalHeight() {
            return this.originalHeight;
        }

        public Integer getThumb360Width() {
            return this.thumb360Width;
        }

        public Integer getThumb360Height() {
            return this.thumb360Height;
        }

        public String getFormat() {
            return this.format;
        }

        public String getExtension() {
            return this.extension;
        }

        public Integer getRotation() {
            return this.rotation;
        }

        public String getThumbTiny() {
            return this.thumbTiny;
        }

        public void setThumb64(Boolean thumb64) {
            this.thumb64 = thumb64;
        }

        public void setThumb80(Boolean thumb80) {
            this.thumb80 = thumb80;
        }

        public void setThumb160(Boolean thumb160) {
            this.thumb160 = thumb160;
        }

        public void setOriginalWidth(Integer originalWidth) {
            this.originalWidth = originalWidth;
        }

        public void setOriginalHeight(Integer originalHeight) {
            this.originalHeight = originalHeight;
        }

        public void setThumb360Width(Integer thumb360Width) {
            this.thumb360Width = thumb360Width;
        }

        public void setThumb360Height(Integer thumb360Height) {
            this.thumb360Height = thumb360Height;
        }

        public void setFormat(String format) {
            this.format = format;
        }

        public void setExtension(String extension) {
            this.extension = extension;
        }

        public void setRotation(Integer rotation) {
            this.rotation = rotation;
        }

        public void setThumbTiny(String thumbTiny) {
            this.thumbTiny = thumbTiny;
        }

        public static class AttachmentMetadataBuilder {
            private Boolean thumb64;
            private Boolean thumb80;
            private Boolean thumb160;
            private Integer originalWidth;
            private Integer originalHeight;
            private Integer thumb360Width;
            private Integer thumb360Height;
            private String format;
            private String extension;
            private Integer rotation;
            private String thumbTiny;

            AttachmentMetadataBuilder() {
            }

            public AttachmentMetadata.AttachmentMetadataBuilder thumb64(Boolean thumb64) {
                this.thumb64 = thumb64;
                return this;
            }

            public AttachmentMetadata.AttachmentMetadataBuilder thumb80(Boolean thumb80) {
                this.thumb80 = thumb80;
                return this;
            }

            public AttachmentMetadata.AttachmentMetadataBuilder thumb160(Boolean thumb160) {
                this.thumb160 = thumb160;
                return this;
            }

            public AttachmentMetadata.AttachmentMetadataBuilder originalWidth(Integer originalWidth) {
                this.originalWidth = originalWidth;
                return this;
            }

            public AttachmentMetadata.AttachmentMetadataBuilder originalHeight(Integer originalHeight) {
                this.originalHeight = originalHeight;
                return this;
            }

            public AttachmentMetadata.AttachmentMetadataBuilder thumb360Width(Integer thumb360Width) {
                this.thumb360Width = thumb360Width;
                return this;
            }

            public AttachmentMetadata.AttachmentMetadataBuilder thumb360Height(Integer thumb360Height) {
                this.thumb360Height = thumb360Height;
                return this;
            }

            public AttachmentMetadata.AttachmentMetadataBuilder format(String format) {
                this.format = format;
                return this;
            }

            public AttachmentMetadata.AttachmentMetadataBuilder extension(String extension) {
                this.extension = extension;
                return this;
            }

            public AttachmentMetadata.AttachmentMetadataBuilder rotation(Integer rotation) {
                this.rotation = rotation;
                return this;
            }

            public AttachmentMetadata.AttachmentMetadataBuilder thumbTiny(String thumbTiny) {
                this.thumbTiny = thumbTiny;
                return this;
            }

            public AttachmentMetadata build() {
                return new AttachmentMetadata(thumb64, thumb80, thumb160, originalWidth, originalHeight, thumb360Width, thumb360Height, format, extension, rotation, thumbTiny);
            }

            public String toString() {
                return "Attachment.AttachmentMetadata.AttachmentMetadataBuilder(thumb64=" + this.thumb64 + ", thumb80=" + this.thumb80 + ", thumb160=" + this.thumb160 + ", originalWidth=" + this.originalWidth + ", originalHeight=" + this.originalHeight + ", thumb360Width=" + this.thumb360Width + ", thumb360Height=" + this.thumb360Height + ", format=" + this.format + ", extension=" + this.extension + ", rotation=" + this.rotation + ", thumbTiny=" + this.thumbTiny + ")";
            }
        }
    }

    public static class AttachmentBuilder {
        private String msgSubtype;
        private String fallback;
        private String callbackId;
        private String color;
        private String pretext;
        private String serviceUrl;
        private String serviceName;
        private String serviceIcon;
        private String authorName;
        private String authorLink;
        private String authorIcon;
        private String fromUrl;
        private String originalUrl;
        private String authorSubname;
        private String channelId;
        private String channelName;
        private Integer id;
        private String botId;
        private Boolean indent;
        private Boolean msgUnfurl;
        private Boolean replyUnfurl;
        private Boolean threadRootUnfurl;
        private Boolean appUnfurl;
        private String appUnfurlUrl;
        private String title;
        private String titleLink;
        private String text;
        private List<Field> fields;
        private String imageUrl;
        private Integer imageWidth;
        private Integer imageHeight;
        private Integer imageBytes;
        private String thumbUrl;
        private Integer thumbWidth;
        private Integer thumbHeight;
        private String videoHtml;
        private Integer videoHtmlWidth;
        private Integer videoHtmlHeight;
        private String footer;
        private String footerIcon;
        private String ts;
        private List<String> mrkdwnIn;
        private List<Action> actions;
        private List<LayoutBlock> blocks;
        private String filename;
        private Integer size;
        private String mimetype;
        private String url;
        private AttachmentMetadata metadata;

        AttachmentBuilder() {
        }

        public AttachmentBuilder msgSubtype(String msgSubtype) {
            this.msgSubtype = msgSubtype;
            return this;
        }

        public AttachmentBuilder fallback(String fallback) {
            this.fallback = fallback;
            return this;
        }

        public AttachmentBuilder callbackId(String callbackId) {
            this.callbackId = callbackId;
            return this;
        }

        public AttachmentBuilder color(String color) {
            this.color = color;
            return this;
        }

        public AttachmentBuilder pretext(String pretext) {
            this.pretext = pretext;
            return this;
        }

        public AttachmentBuilder serviceUrl(String serviceUrl) {
            this.serviceUrl = serviceUrl;
            return this;
        }

        public AttachmentBuilder serviceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }

        public AttachmentBuilder serviceIcon(String serviceIcon) {
            this.serviceIcon = serviceIcon;
            return this;
        }

        public AttachmentBuilder authorName(String authorName) {
            this.authorName = authorName;
            return this;
        }

        public AttachmentBuilder authorLink(String authorLink) {
            this.authorLink = authorLink;
            return this;
        }

        public AttachmentBuilder authorIcon(String authorIcon) {
            this.authorIcon = authorIcon;
            return this;
        }

        public AttachmentBuilder fromUrl(String fromUrl) {
            this.fromUrl = fromUrl;
            return this;
        }

        public AttachmentBuilder originalUrl(String originalUrl) {
            this.originalUrl = originalUrl;
            return this;
        }

        public AttachmentBuilder authorSubname(String authorSubname) {
            this.authorSubname = authorSubname;
            return this;
        }

        public AttachmentBuilder channelId(String channelId) {
            this.channelId = channelId;
            return this;
        }

        public AttachmentBuilder channelName(String channelName) {
            this.channelName = channelName;
            return this;
        }

        public AttachmentBuilder id(Integer id) {
            this.id = id;
            return this;
        }

        public AttachmentBuilder botId(String botId) {
            this.botId = botId;
            return this;
        }

        public AttachmentBuilder indent(Boolean indent) {
            this.indent = indent;
            return this;
        }

        public AttachmentBuilder msgUnfurl(Boolean msgUnfurl) {
            this.msgUnfurl = msgUnfurl;
            return this;
        }

        public AttachmentBuilder replyUnfurl(Boolean replyUnfurl) {
            this.replyUnfurl = replyUnfurl;
            return this;
        }

        public AttachmentBuilder threadRootUnfurl(Boolean threadRootUnfurl) {
            this.threadRootUnfurl = threadRootUnfurl;
            return this;
        }

        public AttachmentBuilder appUnfurl(Boolean appUnfurl) {
            this.appUnfurl = appUnfurl;
            return this;
        }

        public AttachmentBuilder appUnfurlUrl(String appUnfurlUrl) {
            this.appUnfurlUrl = appUnfurlUrl;
            return this;
        }

        public AttachmentBuilder title(String title) {
            this.title = title;
            return this;
        }

        public AttachmentBuilder titleLink(String titleLink) {
            this.titleLink = titleLink;
            return this;
        }

        public AttachmentBuilder text(String text) {
            this.text = text;
            return this;
        }

        public AttachmentBuilder fields(List<Field> fields) {
            this.fields = fields;
            return this;
        }

        public AttachmentBuilder imageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }

        public AttachmentBuilder imageWidth(Integer imageWidth) {
            this.imageWidth = imageWidth;
            return this;
        }

        public AttachmentBuilder imageHeight(Integer imageHeight) {
            this.imageHeight = imageHeight;
            return this;
        }

        public AttachmentBuilder imageBytes(Integer imageBytes) {
            this.imageBytes = imageBytes;
            return this;
        }

        public AttachmentBuilder thumbUrl(String thumbUrl) {
            this.thumbUrl = thumbUrl;
            return this;
        }

        public AttachmentBuilder thumbWidth(Integer thumbWidth) {
            this.thumbWidth = thumbWidth;
            return this;
        }

        public AttachmentBuilder thumbHeight(Integer thumbHeight) {
            this.thumbHeight = thumbHeight;
            return this;
        }

        public AttachmentBuilder videoHtml(String videoHtml) {
            this.videoHtml = videoHtml;
            return this;
        }

        public AttachmentBuilder videoHtmlWidth(Integer videoHtmlWidth) {
            this.videoHtmlWidth = videoHtmlWidth;
            return this;
        }

        public AttachmentBuilder videoHtmlHeight(Integer videoHtmlHeight) {
            this.videoHtmlHeight = videoHtmlHeight;
            return this;
        }

        public AttachmentBuilder footer(String footer) {
            this.footer = footer;
            return this;
        }

        public AttachmentBuilder footerIcon(String footerIcon) {
            this.footerIcon = footerIcon;
            return this;
        }

        public AttachmentBuilder ts(String ts) {
            this.ts = ts;
            return this;
        }

        public AttachmentBuilder mrkdwnIn(List<String> mrkdwnIn) {
            this.mrkdwnIn = mrkdwnIn;
            return this;
        }

        public AttachmentBuilder actions(List<Action> actions) {
            this.actions = actions;
            return this;
        }

        public AttachmentBuilder blocks(List<LayoutBlock> blocks) {
            this.blocks = blocks;
            return this;
        }

        public AttachmentBuilder filename(String filename) {
            this.filename = filename;
            return this;
        }

        public AttachmentBuilder size(Integer size) {
            this.size = size;
            return this;
        }

        public AttachmentBuilder mimetype(String mimetype) {
            this.mimetype = mimetype;
            return this;
        }

        public AttachmentBuilder url(String url) {
            this.url = url;
            return this;
        }

        public AttachmentBuilder metadata(AttachmentMetadata metadata) {
            this.metadata = metadata;
            return this;
        }

        public Attachment build() {
            return new Attachment(msgSubtype, fallback, callbackId, color, pretext, serviceUrl, serviceName, serviceIcon, authorName, authorLink, authorIcon, fromUrl, originalUrl, authorSubname, channelId, channelName, id, botId, indent, msgUnfurl, replyUnfurl, threadRootUnfurl, appUnfurl, appUnfurlUrl, title, titleLink, text, fields, imageUrl, imageWidth, imageHeight, imageBytes, thumbUrl, thumbWidth, thumbHeight, videoHtml, videoHtmlWidth, videoHtmlHeight, footer, footerIcon, ts, mrkdwnIn, actions, blocks, filename, size, mimetype, url, metadata);
        }

        public String toString() {
            return "Attachment.AttachmentBuilder(msgSubtype=" + this.msgSubtype + ", fallback=" + this.fallback + ", callbackId=" + this.callbackId + ", color=" + this.color + ", pretext=" + this.pretext + ", serviceUrl=" + this.serviceUrl + ", serviceName=" + this.serviceName + ", serviceIcon=" + this.serviceIcon + ", authorName=" + this.authorName + ", authorLink=" + this.authorLink + ", authorIcon=" + this.authorIcon + ", fromUrl=" + this.fromUrl + ", originalUrl=" + this.originalUrl + ", authorSubname=" + this.authorSubname + ", channelId=" + this.channelId + ", channelName=" + this.channelName + ", id=" + this.id + ", botId=" + this.botId + ", indent=" + this.indent + ", msgUnfurl=" + this.msgUnfurl + ", replyUnfurl=" + this.replyUnfurl + ", threadRootUnfurl=" + this.threadRootUnfurl + ", appUnfurl=" + this.appUnfurl + ", appUnfurlUrl=" + this.appUnfurlUrl + ", title=" + this.title + ", titleLink=" + this.titleLink + ", text=" + this.text + ", fields=" + this.fields + ", imageUrl=" + this.imageUrl + ", imageWidth=" + this.imageWidth + ", imageHeight=" + this.imageHeight + ", imageBytes=" + this.imageBytes + ", thumbUrl=" + this.thumbUrl + ", thumbWidth=" + this.thumbWidth + ", thumbHeight=" + this.thumbHeight + ", videoHtml=" + this.videoHtml + ", videoHtmlWidth=" + this.videoHtmlWidth + ", videoHtmlHeight=" + this.videoHtmlHeight + ", footer=" + this.footer + ", footerIcon=" + this.footerIcon + ", ts=" + this.ts + ", mrkdwnIn=" + this.mrkdwnIn + ", actions=" + this.actions + ", blocks=" + this.blocks + ", filename=" + this.filename + ", size=" + this.size + ", mimetype=" + this.mimetype + ", url=" + this.url + ", metadata=" + this.metadata + ")";
        }
    }
}