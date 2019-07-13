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

    @SerializedName("is_thread_root_unfurl")
    private boolean threadRootUnfurl;

    private String appUnfurlUrl;

    @SerializedName("is_app_unfurl")
    private boolean appUnfurl;

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
     * <a href="https://api.slack.com/docs/message-formatting#message_formatting>message text
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
    private String metadata;

    Attachment(String msgSubtype, String fallback, String callbackId, String color, String pretext, String serviceUrl, String serviceName, String serviceIcon, String authorName, String authorLink, String authorIcon, String fromUrl, String originalUrl, String authorSubname, String channelId, String channelName, Integer id, String botId, boolean msgUnfurl, boolean replyUnfurl, boolean threadRootUnfurl, String appUnfurlUrl, boolean appUnfurl, String title, String titleLink, String text, List<Field> fields, String imageUrl, Integer imageWidth, Integer imageHeight, Integer imageBytes, String thumbUrl, Integer thumbWidth, Integer thumbHeight, String videoHtml, Integer videoHtmlWidth, Integer videoHtmlHeight, String footer, String footerIcon, String ts, List<String> mrkdwnIn, List<Action> actions, List<LayoutBlock> blocks, String filename, Integer size, String mimetype, String url, String metadata) {
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
        this.msgUnfurl = msgUnfurl;
        this.replyUnfurl = replyUnfurl;
        this.threadRootUnfurl = threadRootUnfurl;
        this.appUnfurlUrl = appUnfurlUrl;
        this.appUnfurl = appUnfurl;
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

    public static AttachmentBuilder builder() {
        return new AttachmentBuilder();
    }

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

    public boolean isMsgUnfurl() {
        return this.msgUnfurl;
    }

    public boolean isReplyUnfurl() {
        return this.replyUnfurl;
    }

    public boolean isThreadRootUnfurl() {
        return this.threadRootUnfurl;
    }

    public String getAppUnfurlUrl() {
        return this.appUnfurlUrl;
    }

    public boolean isAppUnfurl() {
        return this.appUnfurl;
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

    public String getMetadata() {
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

    public void setMsgUnfurl(boolean msgUnfurl) {
        this.msgUnfurl = msgUnfurl;
    }

    public void setReplyUnfurl(boolean replyUnfurl) {
        this.replyUnfurl = replyUnfurl;
    }

    public void setThreadRootUnfurl(boolean threadRootUnfurl) {
        this.threadRootUnfurl = threadRootUnfurl;
    }

    public void setAppUnfurlUrl(String appUnfurlUrl) {
        this.appUnfurlUrl = appUnfurlUrl;
    }

    public void setAppUnfurl(boolean appUnfurl) {
        this.appUnfurl = appUnfurl;
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

    public void setMetadata(String metadata) {
        this.metadata = metadata;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Attachment)) return false;
        final Attachment other = (Attachment) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$msgSubtype = this.getMsgSubtype();
        final Object other$msgSubtype = other.getMsgSubtype();
        if (this$msgSubtype == null ? other$msgSubtype != null : !this$msgSubtype.equals(other$msgSubtype))
            return false;
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
        final Object this$serviceUrl = this.getServiceUrl();
        final Object other$serviceUrl = other.getServiceUrl();
        if (this$serviceUrl == null ? other$serviceUrl != null : !this$serviceUrl.equals(other$serviceUrl))
            return false;
        final Object this$serviceName = this.getServiceName();
        final Object other$serviceName = other.getServiceName();
        if (this$serviceName == null ? other$serviceName != null : !this$serviceName.equals(other$serviceName))
            return false;
        final Object this$serviceIcon = this.getServiceIcon();
        final Object other$serviceIcon = other.getServiceIcon();
        if (this$serviceIcon == null ? other$serviceIcon != null : !this$serviceIcon.equals(other$serviceIcon))
            return false;
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
        final Object this$originalUrl = this.getOriginalUrl();
        final Object other$originalUrl = other.getOriginalUrl();
        if (this$originalUrl == null ? other$originalUrl != null : !this$originalUrl.equals(other$originalUrl))
            return false;
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
        final Object this$botId = this.getBotId();
        final Object other$botId = other.getBotId();
        if (this$botId == null ? other$botId != null : !this$botId.equals(other$botId)) return false;
        if (this.isMsgUnfurl() != other.isMsgUnfurl()) return false;
        if (this.isReplyUnfurl() != other.isReplyUnfurl()) return false;
        if (this.isThreadRootUnfurl() != other.isThreadRootUnfurl()) return false;
        final Object this$appUnfurlUrl = this.getAppUnfurlUrl();
        final Object other$appUnfurlUrl = other.getAppUnfurlUrl();
        if (this$appUnfurlUrl == null ? other$appUnfurlUrl != null : !this$appUnfurlUrl.equals(other$appUnfurlUrl))
            return false;
        if (this.isAppUnfurl() != other.isAppUnfurl()) return false;
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
        final Object this$imageWidth = this.getImageWidth();
        final Object other$imageWidth = other.getImageWidth();
        if (this$imageWidth == null ? other$imageWidth != null : !this$imageWidth.equals(other$imageWidth))
            return false;
        final Object this$imageHeight = this.getImageHeight();
        final Object other$imageHeight = other.getImageHeight();
        if (this$imageHeight == null ? other$imageHeight != null : !this$imageHeight.equals(other$imageHeight))
            return false;
        final Object this$imageBytes = this.getImageBytes();
        final Object other$imageBytes = other.getImageBytes();
        if (this$imageBytes == null ? other$imageBytes != null : !this$imageBytes.equals(other$imageBytes))
            return false;
        final Object this$thumbUrl = this.getThumbUrl();
        final Object other$thumbUrl = other.getThumbUrl();
        if (this$thumbUrl == null ? other$thumbUrl != null : !this$thumbUrl.equals(other$thumbUrl)) return false;
        final Object this$thumbWidth = this.getThumbWidth();
        final Object other$thumbWidth = other.getThumbWidth();
        if (this$thumbWidth == null ? other$thumbWidth != null : !this$thumbWidth.equals(other$thumbWidth))
            return false;
        final Object this$thumbHeight = this.getThumbHeight();
        final Object other$thumbHeight = other.getThumbHeight();
        if (this$thumbHeight == null ? other$thumbHeight != null : !this$thumbHeight.equals(other$thumbHeight))
            return false;
        final Object this$videoHtml = this.getVideoHtml();
        final Object other$videoHtml = other.getVideoHtml();
        if (this$videoHtml == null ? other$videoHtml != null : !this$videoHtml.equals(other$videoHtml)) return false;
        final Object this$videoHtmlWidth = this.getVideoHtmlWidth();
        final Object other$videoHtmlWidth = other.getVideoHtmlWidth();
        if (this$videoHtmlWidth == null ? other$videoHtmlWidth != null : !this$videoHtmlWidth.equals(other$videoHtmlWidth))
            return false;
        final Object this$videoHtmlHeight = this.getVideoHtmlHeight();
        final Object other$videoHtmlHeight = other.getVideoHtmlHeight();
        if (this$videoHtmlHeight == null ? other$videoHtmlHeight != null : !this$videoHtmlHeight.equals(other$videoHtmlHeight))
            return false;
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
        final Object this$blocks = this.getBlocks();
        final Object other$blocks = other.getBlocks();
        if (this$blocks == null ? other$blocks != null : !this$blocks.equals(other$blocks)) return false;
        final Object this$filename = this.getFilename();
        final Object other$filename = other.getFilename();
        if (this$filename == null ? other$filename != null : !this$filename.equals(other$filename)) return false;
        final Object this$size = this.getSize();
        final Object other$size = other.getSize();
        if (this$size == null ? other$size != null : !this$size.equals(other$size)) return false;
        final Object this$mimetype = this.getMimetype();
        final Object other$mimetype = other.getMimetype();
        if (this$mimetype == null ? other$mimetype != null : !this$mimetype.equals(other$mimetype)) return false;
        final Object this$url = this.getUrl();
        final Object other$url = other.getUrl();
        if (this$url == null ? other$url != null : !this$url.equals(other$url)) return false;
        final Object this$metadata = this.getMetadata();
        final Object other$metadata = other.getMetadata();
        if (this$metadata == null ? other$metadata != null : !this$metadata.equals(other$metadata)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Attachment;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $msgSubtype = this.getMsgSubtype();
        result = result * PRIME + ($msgSubtype == null ? 43 : $msgSubtype.hashCode());
        final Object $fallback = this.getFallback();
        result = result * PRIME + ($fallback == null ? 43 : $fallback.hashCode());
        final Object $callbackId = this.getCallbackId();
        result = result * PRIME + ($callbackId == null ? 43 : $callbackId.hashCode());
        final Object $color = this.getColor();
        result = result * PRIME + ($color == null ? 43 : $color.hashCode());
        final Object $pretext = this.getPretext();
        result = result * PRIME + ($pretext == null ? 43 : $pretext.hashCode());
        final Object $serviceUrl = this.getServiceUrl();
        result = result * PRIME + ($serviceUrl == null ? 43 : $serviceUrl.hashCode());
        final Object $serviceName = this.getServiceName();
        result = result * PRIME + ($serviceName == null ? 43 : $serviceName.hashCode());
        final Object $serviceIcon = this.getServiceIcon();
        result = result * PRIME + ($serviceIcon == null ? 43 : $serviceIcon.hashCode());
        final Object $authorName = this.getAuthorName();
        result = result * PRIME + ($authorName == null ? 43 : $authorName.hashCode());
        final Object $authorLink = this.getAuthorLink();
        result = result * PRIME + ($authorLink == null ? 43 : $authorLink.hashCode());
        final Object $authorIcon = this.getAuthorIcon();
        result = result * PRIME + ($authorIcon == null ? 43 : $authorIcon.hashCode());
        final Object $fromUrl = this.getFromUrl();
        result = result * PRIME + ($fromUrl == null ? 43 : $fromUrl.hashCode());
        final Object $originalUrl = this.getOriginalUrl();
        result = result * PRIME + ($originalUrl == null ? 43 : $originalUrl.hashCode());
        final Object $authorSubname = this.getAuthorSubname();
        result = result * PRIME + ($authorSubname == null ? 43 : $authorSubname.hashCode());
        final Object $channelId = this.getChannelId();
        result = result * PRIME + ($channelId == null ? 43 : $channelId.hashCode());
        final Object $channelName = this.getChannelName();
        result = result * PRIME + ($channelName == null ? 43 : $channelName.hashCode());
        final Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final Object $botId = this.getBotId();
        result = result * PRIME + ($botId == null ? 43 : $botId.hashCode());
        result = result * PRIME + (this.isMsgUnfurl() ? 79 : 97);
        result = result * PRIME + (this.isReplyUnfurl() ? 79 : 97);
        result = result * PRIME + (this.isThreadRootUnfurl() ? 79 : 97);
        final Object $appUnfurlUrl = this.getAppUnfurlUrl();
        result = result * PRIME + ($appUnfurlUrl == null ? 43 : $appUnfurlUrl.hashCode());
        result = result * PRIME + (this.isAppUnfurl() ? 79 : 97);
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
        final Object $imageWidth = this.getImageWidth();
        result = result * PRIME + ($imageWidth == null ? 43 : $imageWidth.hashCode());
        final Object $imageHeight = this.getImageHeight();
        result = result * PRIME + ($imageHeight == null ? 43 : $imageHeight.hashCode());
        final Object $imageBytes = this.getImageBytes();
        result = result * PRIME + ($imageBytes == null ? 43 : $imageBytes.hashCode());
        final Object $thumbUrl = this.getThumbUrl();
        result = result * PRIME + ($thumbUrl == null ? 43 : $thumbUrl.hashCode());
        final Object $thumbWidth = this.getThumbWidth();
        result = result * PRIME + ($thumbWidth == null ? 43 : $thumbWidth.hashCode());
        final Object $thumbHeight = this.getThumbHeight();
        result = result * PRIME + ($thumbHeight == null ? 43 : $thumbHeight.hashCode());
        final Object $videoHtml = this.getVideoHtml();
        result = result * PRIME + ($videoHtml == null ? 43 : $videoHtml.hashCode());
        final Object $videoHtmlWidth = this.getVideoHtmlWidth();
        result = result * PRIME + ($videoHtmlWidth == null ? 43 : $videoHtmlWidth.hashCode());
        final Object $videoHtmlHeight = this.getVideoHtmlHeight();
        result = result * PRIME + ($videoHtmlHeight == null ? 43 : $videoHtmlHeight.hashCode());
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
        final Object $blocks = this.getBlocks();
        result = result * PRIME + ($blocks == null ? 43 : $blocks.hashCode());
        final Object $filename = this.getFilename();
        result = result * PRIME + ($filename == null ? 43 : $filename.hashCode());
        final Object $size = this.getSize();
        result = result * PRIME + ($size == null ? 43 : $size.hashCode());
        final Object $mimetype = this.getMimetype();
        result = result * PRIME + ($mimetype == null ? 43 : $mimetype.hashCode());
        final Object $url = this.getUrl();
        result = result * PRIME + ($url == null ? 43 : $url.hashCode());
        final Object $metadata = this.getMetadata();
        result = result * PRIME + ($metadata == null ? 43 : $metadata.hashCode());
        return result;
    }

    public String toString() {
        return "Attachment(msgSubtype=" + this.getMsgSubtype() + ", fallback=" + this.getFallback() + ", callbackId=" + this.getCallbackId() + ", color=" + this.getColor() + ", pretext=" + this.getPretext() + ", serviceUrl=" + this.getServiceUrl() + ", serviceName=" + this.getServiceName() + ", serviceIcon=" + this.getServiceIcon() + ", authorName=" + this.getAuthorName() + ", authorLink=" + this.getAuthorLink() + ", authorIcon=" + this.getAuthorIcon() + ", fromUrl=" + this.getFromUrl() + ", originalUrl=" + this.getOriginalUrl() + ", authorSubname=" + this.getAuthorSubname() + ", channelId=" + this.getChannelId() + ", channelName=" + this.getChannelName() + ", id=" + this.getId() + ", botId=" + this.getBotId() + ", msgUnfurl=" + this.isMsgUnfurl() + ", replyUnfurl=" + this.isReplyUnfurl() + ", threadRootUnfurl=" + this.isThreadRootUnfurl() + ", appUnfurlUrl=" + this.getAppUnfurlUrl() + ", appUnfurl=" + this.isAppUnfurl() + ", title=" + this.getTitle() + ", titleLink=" + this.getTitleLink() + ", text=" + this.getText() + ", fields=" + this.getFields() + ", imageUrl=" + this.getImageUrl() + ", imageWidth=" + this.getImageWidth() + ", imageHeight=" + this.getImageHeight() + ", imageBytes=" + this.getImageBytes() + ", thumbUrl=" + this.getThumbUrl() + ", thumbWidth=" + this.getThumbWidth() + ", thumbHeight=" + this.getThumbHeight() + ", videoHtml=" + this.getVideoHtml() + ", videoHtmlWidth=" + this.getVideoHtmlWidth() + ", videoHtmlHeight=" + this.getVideoHtmlHeight() + ", footer=" + this.getFooter() + ", footerIcon=" + this.getFooterIcon() + ", ts=" + this.getTs() + ", mrkdwnIn=" + this.getMrkdwnIn() + ", actions=" + this.getActions() + ", blocks=" + this.getBlocks() + ", filename=" + this.getFilename() + ", size=" + this.getSize() + ", mimetype=" + this.getMimetype() + ", url=" + this.getUrl() + ", metadata=" + this.getMetadata() + ")";
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
        private boolean msgUnfurl;
        private boolean replyUnfurl;
        private boolean threadRootUnfurl;
        private String appUnfurlUrl;
        private boolean appUnfurl;
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
        private String metadata;

        AttachmentBuilder() {
        }

        public Attachment.AttachmentBuilder msgSubtype(String msgSubtype) {
            this.msgSubtype = msgSubtype;
            return this;
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

        public Attachment.AttachmentBuilder serviceUrl(String serviceUrl) {
            this.serviceUrl = serviceUrl;
            return this;
        }

        public Attachment.AttachmentBuilder serviceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }

        public Attachment.AttachmentBuilder serviceIcon(String serviceIcon) {
            this.serviceIcon = serviceIcon;
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

        public Attachment.AttachmentBuilder originalUrl(String originalUrl) {
            this.originalUrl = originalUrl;
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

        public Attachment.AttachmentBuilder id(Integer id) {
            this.id = id;
            return this;
        }

        public Attachment.AttachmentBuilder botId(String botId) {
            this.botId = botId;
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

        public Attachment.AttachmentBuilder threadRootUnfurl(boolean threadRootUnfurl) {
            this.threadRootUnfurl = threadRootUnfurl;
            return this;
        }

        public Attachment.AttachmentBuilder appUnfurlUrl(String appUnfurlUrl) {
            this.appUnfurlUrl = appUnfurlUrl;
            return this;
        }

        public Attachment.AttachmentBuilder appUnfurl(boolean appUnfurl) {
            this.appUnfurl = appUnfurl;
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

        public Attachment.AttachmentBuilder imageWidth(Integer imageWidth) {
            this.imageWidth = imageWidth;
            return this;
        }

        public Attachment.AttachmentBuilder imageHeight(Integer imageHeight) {
            this.imageHeight = imageHeight;
            return this;
        }

        public Attachment.AttachmentBuilder imageBytes(Integer imageBytes) {
            this.imageBytes = imageBytes;
            return this;
        }

        public Attachment.AttachmentBuilder thumbUrl(String thumbUrl) {
            this.thumbUrl = thumbUrl;
            return this;
        }

        public Attachment.AttachmentBuilder thumbWidth(Integer thumbWidth) {
            this.thumbWidth = thumbWidth;
            return this;
        }

        public Attachment.AttachmentBuilder thumbHeight(Integer thumbHeight) {
            this.thumbHeight = thumbHeight;
            return this;
        }

        public Attachment.AttachmentBuilder videoHtml(String videoHtml) {
            this.videoHtml = videoHtml;
            return this;
        }

        public Attachment.AttachmentBuilder videoHtmlWidth(Integer videoHtmlWidth) {
            this.videoHtmlWidth = videoHtmlWidth;
            return this;
        }

        public Attachment.AttachmentBuilder videoHtmlHeight(Integer videoHtmlHeight) {
            this.videoHtmlHeight = videoHtmlHeight;
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

        public Attachment.AttachmentBuilder blocks(List<LayoutBlock> blocks) {
            this.blocks = blocks;
            return this;
        }

        public Attachment.AttachmentBuilder filename(String filename) {
            this.filename = filename;
            return this;
        }

        public Attachment.AttachmentBuilder size(Integer size) {
            this.size = size;
            return this;
        }

        public Attachment.AttachmentBuilder mimetype(String mimetype) {
            this.mimetype = mimetype;
            return this;
        }

        public Attachment.AttachmentBuilder url(String url) {
            this.url = url;
            return this;
        }

        public Attachment.AttachmentBuilder metadata(String metadata) {
            this.metadata = metadata;
            return this;
        }

        public Attachment build() {
            return new Attachment(msgSubtype, fallback, callbackId, color, pretext, serviceUrl, serviceName, serviceIcon, authorName, authorLink, authorIcon, fromUrl, originalUrl, authorSubname, channelId, channelName, id, botId, msgUnfurl, replyUnfurl, threadRootUnfurl, appUnfurlUrl, appUnfurl, title, titleLink, text, fields, imageUrl, imageWidth, imageHeight, imageBytes, thumbUrl, thumbWidth, thumbHeight, videoHtml, videoHtmlWidth, videoHtmlHeight, footer, footerIcon, ts, mrkdwnIn, actions, blocks, filename, size, mimetype, url, metadata);
        }

        public String toString() {
            return "Attachment.AttachmentBuilder(msgSubtype=" + this.msgSubtype + ", fallback=" + this.fallback + ", callbackId=" + this.callbackId + ", color=" + this.color + ", pretext=" + this.pretext + ", serviceUrl=" + this.serviceUrl + ", serviceName=" + this.serviceName + ", serviceIcon=" + this.serviceIcon + ", authorName=" + this.authorName + ", authorLink=" + this.authorLink + ", authorIcon=" + this.authorIcon + ", fromUrl=" + this.fromUrl + ", originalUrl=" + this.originalUrl + ", authorSubname=" + this.authorSubname + ", channelId=" + this.channelId + ", channelName=" + this.channelName + ", id=" + this.id + ", botId=" + this.botId + ", msgUnfurl=" + this.msgUnfurl + ", replyUnfurl=" + this.replyUnfurl + ", threadRootUnfurl=" + this.threadRootUnfurl + ", appUnfurlUrl=" + this.appUnfurlUrl + ", appUnfurl=" + this.appUnfurl + ", title=" + this.title + ", titleLink=" + this.titleLink + ", text=" + this.text + ", fields=" + this.fields + ", imageUrl=" + this.imageUrl + ", imageWidth=" + this.imageWidth + ", imageHeight=" + this.imageHeight + ", imageBytes=" + this.imageBytes + ", thumbUrl=" + this.thumbUrl + ", thumbWidth=" + this.thumbWidth + ", thumbHeight=" + this.thumbHeight + ", videoHtml=" + this.videoHtml + ", videoHtmlWidth=" + this.videoHtmlWidth + ", videoHtmlHeight=" + this.videoHtmlHeight + ", footer=" + this.footer + ", footerIcon=" + this.footerIcon + ", ts=" + this.ts + ", mrkdwnIn=" + this.mrkdwnIn + ", actions=" + this.actions + ", blocks=" + this.blocks + ", filename=" + this.filename + ", size=" + this.size + ", mimetype=" + this.mimetype + ", url=" + this.url + ", metadata=" + this.metadata + ")";
        }
    }
}
