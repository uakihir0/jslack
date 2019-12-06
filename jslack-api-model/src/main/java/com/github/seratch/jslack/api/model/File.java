package com.github.seratch.jslack.api.model;

import com.github.seratch.jslack.api.model.block.LayoutBlock;
import com.google.gson.annotations.SerializedName;

import java.util.List;
import java.util.Map;

/**
 * https://api.slack.com/types/file
 */
public class File {

    private String id;
    private Integer created;
    private Integer timestamp;
    private String name;
    private String title;
    private String subject;
    private String mimetype;
    private String filetype;
    private String prettyType;
    private String user;
    private String mode;
    private boolean editable;

    @SerializedName("is_external")
    private boolean external;
    private String externalType;
    private String externalId;
    private String externalUrl;

    private String username;
    private Integer size;
    private String urlPrivate;
    private String urlPrivateDownload;

    private String appId;
    private String appName;

    @SerializedName("thumb_64")
    private String thumb64;
    @SerializedName("thumb_64_gif")
    private String thumb64Gif;
    @SerializedName("thumb_64_w")
    private String thumb64Width;
    @SerializedName("thumb_64_h")
    private String thumb64Height;

    @SerializedName("thumb_80")
    private String thumb80;
    @SerializedName("thumb_80_gif")
    private String thumb80Gif;
    @SerializedName("thumb_80_w")
    private String thumb80Width;
    @SerializedName("thumb_80_h")
    private String thumb80Height;

    @SerializedName("thumb_160")
    private String thumb160;
    @SerializedName("thumb_160_gif")
    private String thumb160Gif;
    @SerializedName("thumb_160_w")
    private String thumb160Width;
    @SerializedName("thumb_160_h")
    private String thumb160Height;

    @SerializedName("thumb_360")
    private String thumb360;
    @SerializedName("thumb_360_gif")
    private String thumb360Gif;
    @SerializedName("thumb_360_w")
    private String thumb360Width;
    @SerializedName("thumb_360_h")
    private String thumb360Height;

    @SerializedName("thumb_480")
    private String thumb480;
    @SerializedName("thumb_480_gif")
    private String thumb480Gif;
    @SerializedName("thumb_480_w")
    private String thumb480Width;
    @SerializedName("thumb_480_h")
    private String thumb480Height;

    @SerializedName("thumb_720")
    private String thumb720;
    @SerializedName("thumb_720_gif")
    private String thumb720Gif;
    @SerializedName("thumb_720_w")
    private String thumb720Width;
    @SerializedName("thumb_720_h")
    private String thumb720Height;

    @SerializedName("thumb_800")
    private String thumb800;
    @SerializedName("thumb_800_gif")
    private String thumb800Gif;
    @SerializedName("thumb_800_w")
    private String thumb800Width;
    @SerializedName("thumb_800_h")
    private String thumb800Height;

    @SerializedName("thumb_960")
    private String thumb960;
    @SerializedName("thumb_960_gif")
    private String thumb960Gif;
    @SerializedName("thumb_960_w")
    private String thumb960Width;
    @SerializedName("thumb_960_h")
    private String thumb960Height;

    @SerializedName("thumb_1024")
    private String thumb1024;
    @SerializedName("thumb_1024_gif")
    private String thumb1024Gif;
    @SerializedName("thumb_1024_w")
    private String thumb1024Width;
    @SerializedName("thumb_1024_h")
    private String thumb1024Height;

    private String thumbVideo;

    @SerializedName("thumb_pdf")
    private String thumbPdf;
    @SerializedName("thumb_pdf_w")
    private String thumbPdfWidth;
    @SerializedName("thumb_pdf_h")
    private String thumbPdfHeight;

    private String thumbTiny;

    private String convertedPdf;

    private Integer imageExifRotation;

    @SerializedName("original_w")
    private String originalWidth;
    @SerializedName("original_h")
    private String originalHeight;

    private String deanimateGif;
    private String pjpeg;

    private String permalink;
    private String permalinkPublic;

    private String editLink;

    private boolean hasRichPreview;
    @SerializedName("preview_is_truncated")
    private boolean previewTruncated;
    private String preview;
    private String previewHighlight;

    private String plainText;
    private String previewPlainText;

    private boolean hasMore;
    private boolean sentToSelf;
    private String botId;

    private Integer lines;
    private Integer linesMore;

    @SerializedName("is_public")
    private boolean _public;

    public File(String id, Integer created, Integer timestamp, String name, String title, String subject, String mimetype, String filetype, String prettyType, String user, String mode, boolean editable, boolean external, String externalType, String externalId, String externalUrl, String username, Integer size, String urlPrivate, String urlPrivateDownload, String appId, String appName, String thumb64, String thumb64Gif, String thumb64Width, String thumb64Height, String thumb80, String thumb80Gif, String thumb80Width, String thumb80Height, String thumb160, String thumb160Gif, String thumb160Width, String thumb160Height, String thumb360, String thumb360Gif, String thumb360Width, String thumb360Height, String thumb480, String thumb480Gif, String thumb480Width, String thumb480Height, String thumb720, String thumb720Gif, String thumb720Width, String thumb720Height, String thumb800, String thumb800Gif, String thumb800Width, String thumb800Height, String thumb960, String thumb960Gif, String thumb960Width, String thumb960Height, String thumb1024, String thumb1024Gif, String thumb1024Width, String thumb1024Height, String thumbVideo, String thumbPdf, String thumbPdfWidth, String thumbPdfHeight, String thumbTiny, String convertedPdf, Integer imageExifRotation, String originalWidth, String originalHeight, String deanimateGif, String pjpeg, String permalink, String permalinkPublic, String editLink, boolean hasRichPreview, boolean previewTruncated, String preview, String previewHighlight, String plainText, String previewPlainText, boolean hasMore, boolean sentToSelf, String botId, Integer lines, Integer linesMore, boolean _public, boolean publicUrlShared, boolean displayAsBot, List<String> channels, List<String> groups, List<String> ims, FileComment initialComment, Integer numStars, boolean starred, List<String> pinnedTo, List<Reaction> reactions, Integer commentsCount, String channelActionsTs, Integer channelActionsCount, List<Attachment> attachments, List<LayoutBlock> blocks, Shares shares, List<Address> to, List<Address> from, List<Address> cc, Map<String, PinnedInfo> pinnedInfo) {
        this.id = id;
        this.created = created;
        this.timestamp = timestamp;
        this.name = name;
        this.title = title;
        this.subject = subject;
        this.mimetype = mimetype;
        this.filetype = filetype;
        this.prettyType = prettyType;
        this.user = user;
        this.mode = mode;
        this.editable = editable;
        this.external = external;
        this.externalType = externalType;
        this.externalId = externalId;
        this.externalUrl = externalUrl;
        this.username = username;
        this.size = size;
        this.urlPrivate = urlPrivate;
        this.urlPrivateDownload = urlPrivateDownload;
        this.appId = appId;
        this.appName = appName;
        this.thumb64 = thumb64;
        this.thumb64Gif = thumb64Gif;
        this.thumb64Width = thumb64Width;
        this.thumb64Height = thumb64Height;
        this.thumb80 = thumb80;
        this.thumb80Gif = thumb80Gif;
        this.thumb80Width = thumb80Width;
        this.thumb80Height = thumb80Height;
        this.thumb160 = thumb160;
        this.thumb160Gif = thumb160Gif;
        this.thumb160Width = thumb160Width;
        this.thumb160Height = thumb160Height;
        this.thumb360 = thumb360;
        this.thumb360Gif = thumb360Gif;
        this.thumb360Width = thumb360Width;
        this.thumb360Height = thumb360Height;
        this.thumb480 = thumb480;
        this.thumb480Gif = thumb480Gif;
        this.thumb480Width = thumb480Width;
        this.thumb480Height = thumb480Height;
        this.thumb720 = thumb720;
        this.thumb720Gif = thumb720Gif;
        this.thumb720Width = thumb720Width;
        this.thumb720Height = thumb720Height;
        this.thumb800 = thumb800;
        this.thumb800Gif = thumb800Gif;
        this.thumb800Width = thumb800Width;
        this.thumb800Height = thumb800Height;
        this.thumb960 = thumb960;
        this.thumb960Gif = thumb960Gif;
        this.thumb960Width = thumb960Width;
        this.thumb960Height = thumb960Height;
        this.thumb1024 = thumb1024;
        this.thumb1024Gif = thumb1024Gif;
        this.thumb1024Width = thumb1024Width;
        this.thumb1024Height = thumb1024Height;
        this.thumbVideo = thumbVideo;
        this.thumbPdf = thumbPdf;
        this.thumbPdfWidth = thumbPdfWidth;
        this.thumbPdfHeight = thumbPdfHeight;
        this.thumbTiny = thumbTiny;
        this.convertedPdf = convertedPdf;
        this.imageExifRotation = imageExifRotation;
        this.originalWidth = originalWidth;
        this.originalHeight = originalHeight;
        this.deanimateGif = deanimateGif;
        this.pjpeg = pjpeg;
        this.permalink = permalink;
        this.permalinkPublic = permalinkPublic;
        this.editLink = editLink;
        this.hasRichPreview = hasRichPreview;
        this.previewTruncated = previewTruncated;
        this.preview = preview;
        this.previewHighlight = previewHighlight;
        this.plainText = plainText;
        this.previewPlainText = previewPlainText;
        this.hasMore = hasMore;
        this.sentToSelf = sentToSelf;
        this.botId = botId;
        this.lines = lines;
        this.linesMore = linesMore;
        this._public = _public;
        this.publicUrlShared = publicUrlShared;
        this.displayAsBot = displayAsBot;
        this.channels = channels;
        this.groups = groups;
        this.ims = ims;
        this.initialComment = initialComment;
        this.numStars = numStars;
        this.starred = starred;
        this.pinnedTo = pinnedTo;
        this.reactions = reactions;
        this.commentsCount = commentsCount;
        this.channelActionsTs = channelActionsTs;
        this.channelActionsCount = channelActionsCount;
        this.attachments = attachments;
        this.blocks = blocks;
        this.shares = shares;
        this.to = to;
        this.from = from;
        this.cc = cc;
        this.pinnedInfo = pinnedInfo;
    }

    public File() {
    }

    public static FileBuilder builder() {
        return new FileBuilder();
    }

    public boolean isPublic() {
        return _public;
    }

    public void setPublic(boolean isPublic) {
        this._public = isPublic;
    }

    private boolean publicUrlShared;
    private boolean displayAsBot;

    private List<String> channels;
    private List<String> groups;
    private List<String> ims;
    private FileComment initialComment;
    private Integer numStars;

    @SerializedName("is_starred")
    private boolean starred;

    private List<String> pinnedTo;
    private List<Reaction> reactions;
    private Integer commentsCount;

    private String channelActionsTs;
    private Integer channelActionsCount;

    private List<Attachment> attachments;
    private List<LayoutBlock> blocks;

    private Shares shares;

    public String getId() {
        return this.id;
    }

    public Integer getCreated() {
        return this.created;
    }

    public Integer getTimestamp() {
        return this.timestamp;
    }

    public String getName() {
        return this.name;
    }

    public String getTitle() {
        return this.title;
    }

    public String getSubject() {
        return this.subject;
    }

    public String getMimetype() {
        return this.mimetype;
    }

    public String getFiletype() {
        return this.filetype;
    }

    public String getPrettyType() {
        return this.prettyType;
    }

    public String getUser() {
        return this.user;
    }

    public String getMode() {
        return this.mode;
    }

    public boolean isEditable() {
        return this.editable;
    }

    public boolean isExternal() {
        return this.external;
    }

    public String getExternalType() {
        return this.externalType;
    }

    public String getExternalId() {
        return this.externalId;
    }

    public String getExternalUrl() {
        return this.externalUrl;
    }

    public String getUsername() {
        return this.username;
    }

    public Integer getSize() {
        return this.size;
    }

    public String getUrlPrivate() {
        return this.urlPrivate;
    }

    public String getUrlPrivateDownload() {
        return this.urlPrivateDownload;
    }

    public String getAppId() {
        return this.appId;
    }

    public String getAppName() {
        return this.appName;
    }

    public String getThumb64() {
        return this.thumb64;
    }

    public String getThumb64Gif() {
        return this.thumb64Gif;
    }

    public String getThumb64Width() {
        return this.thumb64Width;
    }

    public String getThumb64Height() {
        return this.thumb64Height;
    }

    public String getThumb80() {
        return this.thumb80;
    }

    public String getThumb80Gif() {
        return this.thumb80Gif;
    }

    public String getThumb80Width() {
        return this.thumb80Width;
    }

    public String getThumb80Height() {
        return this.thumb80Height;
    }

    public String getThumb160() {
        return this.thumb160;
    }

    public String getThumb160Gif() {
        return this.thumb160Gif;
    }

    public String getThumb160Width() {
        return this.thumb160Width;
    }

    public String getThumb160Height() {
        return this.thumb160Height;
    }

    public String getThumb360() {
        return this.thumb360;
    }

    public String getThumb360Gif() {
        return this.thumb360Gif;
    }

    public String getThumb360Width() {
        return this.thumb360Width;
    }

    public String getThumb360Height() {
        return this.thumb360Height;
    }

    public String getThumb480() {
        return this.thumb480;
    }

    public String getThumb480Gif() {
        return this.thumb480Gif;
    }

    public String getThumb480Width() {
        return this.thumb480Width;
    }

    public String getThumb480Height() {
        return this.thumb480Height;
    }

    public String getThumb720() {
        return this.thumb720;
    }

    public String getThumb720Gif() {
        return this.thumb720Gif;
    }

    public String getThumb720Width() {
        return this.thumb720Width;
    }

    public String getThumb720Height() {
        return this.thumb720Height;
    }

    public String getThumb800() {
        return this.thumb800;
    }

    public String getThumb800Gif() {
        return this.thumb800Gif;
    }

    public String getThumb800Width() {
        return this.thumb800Width;
    }

    public String getThumb800Height() {
        return this.thumb800Height;
    }

    public String getThumb960() {
        return this.thumb960;
    }

    public String getThumb960Gif() {
        return this.thumb960Gif;
    }

    public String getThumb960Width() {
        return this.thumb960Width;
    }

    public String getThumb960Height() {
        return this.thumb960Height;
    }

    public String getThumb1024() {
        return this.thumb1024;
    }

    public String getThumb1024Gif() {
        return this.thumb1024Gif;
    }

    public String getThumb1024Width() {
        return this.thumb1024Width;
    }

    public String getThumb1024Height() {
        return this.thumb1024Height;
    }

    public String getThumbVideo() {
        return this.thumbVideo;
    }

    public String getThumbPdf() {
        return this.thumbPdf;
    }

    public String getThumbPdfWidth() {
        return this.thumbPdfWidth;
    }

    public String getThumbPdfHeight() {
        return this.thumbPdfHeight;
    }

    public String getThumbTiny() {
        return this.thumbTiny;
    }

    public String getConvertedPdf() {
        return this.convertedPdf;
    }

    public Integer getImageExifRotation() {
        return this.imageExifRotation;
    }

    public String getOriginalWidth() {
        return this.originalWidth;
    }

    public String getOriginalHeight() {
        return this.originalHeight;
    }

    public String getDeanimateGif() {
        return this.deanimateGif;
    }

    public String getPjpeg() {
        return this.pjpeg;
    }

    public String getPermalink() {
        return this.permalink;
    }

    public String getPermalinkPublic() {
        return this.permalinkPublic;
    }

    public String getEditLink() {
        return this.editLink;
    }

    public boolean isHasRichPreview() {
        return this.hasRichPreview;
    }

    public boolean isPreviewTruncated() {
        return this.previewTruncated;
    }

    public String getPreview() {
        return this.preview;
    }

    public String getPreviewHighlight() {
        return this.previewHighlight;
    }

    public String getPlainText() {
        return this.plainText;
    }

    public String getPreviewPlainText() {
        return this.previewPlainText;
    }

    public boolean isHasMore() {
        return this.hasMore;
    }

    public boolean isSentToSelf() {
        return this.sentToSelf;
    }

    public String getBotId() {
        return this.botId;
    }

    public Integer getLines() {
        return this.lines;
    }

    public Integer getLinesMore() {
        return this.linesMore;
    }

    public boolean isPublicUrlShared() {
        return this.publicUrlShared;
    }

    public boolean isDisplayAsBot() {
        return this.displayAsBot;
    }

    public List<String> getChannels() {
        return this.channels;
    }

    public List<String> getGroups() {
        return this.groups;
    }

    public List<String> getIms() {
        return this.ims;
    }

    public FileComment getInitialComment() {
        return this.initialComment;
    }

    public Integer getNumStars() {
        return this.numStars;
    }

    public boolean isStarred() {
        return this.starred;
    }

    public List<String> getPinnedTo() {
        return this.pinnedTo;
    }

    public List<Reaction> getReactions() {
        return this.reactions;
    }

    public Integer getCommentsCount() {
        return this.commentsCount;
    }

    public String getChannelActionsTs() {
        return this.channelActionsTs;
    }

    public Integer getChannelActionsCount() {
        return this.channelActionsCount;
    }

    public List<Attachment> getAttachments() {
        return this.attachments;
    }

    public List<LayoutBlock> getBlocks() {
        return this.blocks;
    }

    public Shares getShares() {
        return this.shares;
    }

    public List<Address> getTo() {
        return this.to;
    }

    public List<Address> getFrom() {
        return this.from;
    }

    public List<Address> getCc() {
        return this.cc;
    }

    public Map<String, PinnedInfo> getPinnedInfo() {
        return this.pinnedInfo;
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

    public void setName(String name) {
        this.name = name;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setMimetype(String mimetype) {
        this.mimetype = mimetype;
    }

    public void setFiletype(String filetype) {
        this.filetype = filetype;
    }

    public void setPrettyType(String prettyType) {
        this.prettyType = prettyType;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public void setEditable(boolean editable) {
        this.editable = editable;
    }

    public void setExternal(boolean external) {
        this.external = external;
    }

    public void setExternalType(String externalType) {
        this.externalType = externalType;
    }

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    public void setExternalUrl(String externalUrl) {
        this.externalUrl = externalUrl;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public void setUrlPrivate(String urlPrivate) {
        this.urlPrivate = urlPrivate;
    }

    public void setUrlPrivateDownload(String urlPrivateDownload) {
        this.urlPrivateDownload = urlPrivateDownload;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public void setThumb64(String thumb64) {
        this.thumb64 = thumb64;
    }

    public void setThumb64Gif(String thumb64Gif) {
        this.thumb64Gif = thumb64Gif;
    }

    public void setThumb64Width(String thumb64Width) {
        this.thumb64Width = thumb64Width;
    }

    public void setThumb64Height(String thumb64Height) {
        this.thumb64Height = thumb64Height;
    }

    public void setThumb80(String thumb80) {
        this.thumb80 = thumb80;
    }

    public void setThumb80Gif(String thumb80Gif) {
        this.thumb80Gif = thumb80Gif;
    }

    public void setThumb80Width(String thumb80Width) {
        this.thumb80Width = thumb80Width;
    }

    public void setThumb80Height(String thumb80Height) {
        this.thumb80Height = thumb80Height;
    }

    public void setThumb160(String thumb160) {
        this.thumb160 = thumb160;
    }

    public void setThumb160Gif(String thumb160Gif) {
        this.thumb160Gif = thumb160Gif;
    }

    public void setThumb160Width(String thumb160Width) {
        this.thumb160Width = thumb160Width;
    }

    public void setThumb160Height(String thumb160Height) {
        this.thumb160Height = thumb160Height;
    }

    public void setThumb360(String thumb360) {
        this.thumb360 = thumb360;
    }

    public void setThumb360Gif(String thumb360Gif) {
        this.thumb360Gif = thumb360Gif;
    }

    public void setThumb360Width(String thumb360Width) {
        this.thumb360Width = thumb360Width;
    }

    public void setThumb360Height(String thumb360Height) {
        this.thumb360Height = thumb360Height;
    }

    public void setThumb480(String thumb480) {
        this.thumb480 = thumb480;
    }

    public void setThumb480Gif(String thumb480Gif) {
        this.thumb480Gif = thumb480Gif;
    }

    public void setThumb480Width(String thumb480Width) {
        this.thumb480Width = thumb480Width;
    }

    public void setThumb480Height(String thumb480Height) {
        this.thumb480Height = thumb480Height;
    }

    public void setThumb720(String thumb720) {
        this.thumb720 = thumb720;
    }

    public void setThumb720Gif(String thumb720Gif) {
        this.thumb720Gif = thumb720Gif;
    }

    public void setThumb720Width(String thumb720Width) {
        this.thumb720Width = thumb720Width;
    }

    public void setThumb720Height(String thumb720Height) {
        this.thumb720Height = thumb720Height;
    }

    public void setThumb800(String thumb800) {
        this.thumb800 = thumb800;
    }

    public void setThumb800Gif(String thumb800Gif) {
        this.thumb800Gif = thumb800Gif;
    }

    public void setThumb800Width(String thumb800Width) {
        this.thumb800Width = thumb800Width;
    }

    public void setThumb800Height(String thumb800Height) {
        this.thumb800Height = thumb800Height;
    }

    public void setThumb960(String thumb960) {
        this.thumb960 = thumb960;
    }

    public void setThumb960Gif(String thumb960Gif) {
        this.thumb960Gif = thumb960Gif;
    }

    public void setThumb960Width(String thumb960Width) {
        this.thumb960Width = thumb960Width;
    }

    public void setThumb960Height(String thumb960Height) {
        this.thumb960Height = thumb960Height;
    }

    public void setThumb1024(String thumb1024) {
        this.thumb1024 = thumb1024;
    }

    public void setThumb1024Gif(String thumb1024Gif) {
        this.thumb1024Gif = thumb1024Gif;
    }

    public void setThumb1024Width(String thumb1024Width) {
        this.thumb1024Width = thumb1024Width;
    }

    public void setThumb1024Height(String thumb1024Height) {
        this.thumb1024Height = thumb1024Height;
    }

    public void setThumbVideo(String thumbVideo) {
        this.thumbVideo = thumbVideo;
    }

    public void setThumbPdf(String thumbPdf) {
        this.thumbPdf = thumbPdf;
    }

    public void setThumbPdfWidth(String thumbPdfWidth) {
        this.thumbPdfWidth = thumbPdfWidth;
    }

    public void setThumbPdfHeight(String thumbPdfHeight) {
        this.thumbPdfHeight = thumbPdfHeight;
    }

    public void setThumbTiny(String thumbTiny) {
        this.thumbTiny = thumbTiny;
    }

    public void setConvertedPdf(String convertedPdf) {
        this.convertedPdf = convertedPdf;
    }

    public void setImageExifRotation(Integer imageExifRotation) {
        this.imageExifRotation = imageExifRotation;
    }

    public void setOriginalWidth(String originalWidth) {
        this.originalWidth = originalWidth;
    }

    public void setOriginalHeight(String originalHeight) {
        this.originalHeight = originalHeight;
    }

    public void setDeanimateGif(String deanimateGif) {
        this.deanimateGif = deanimateGif;
    }

    public void setPjpeg(String pjpeg) {
        this.pjpeg = pjpeg;
    }

    public void setPermalink(String permalink) {
        this.permalink = permalink;
    }

    public void setPermalinkPublic(String permalinkPublic) {
        this.permalinkPublic = permalinkPublic;
    }

    public void setEditLink(String editLink) {
        this.editLink = editLink;
    }

    public void setHasRichPreview(boolean hasRichPreview) {
        this.hasRichPreview = hasRichPreview;
    }

    public void setPreviewTruncated(boolean previewTruncated) {
        this.previewTruncated = previewTruncated;
    }

    public void setPreview(String preview) {
        this.preview = preview;
    }

    public void setPreviewHighlight(String previewHighlight) {
        this.previewHighlight = previewHighlight;
    }

    public void setPlainText(String plainText) {
        this.plainText = plainText;
    }

    public void setPreviewPlainText(String previewPlainText) {
        this.previewPlainText = previewPlainText;
    }

    public void setHasMore(boolean hasMore) {
        this.hasMore = hasMore;
    }

    public void setSentToSelf(boolean sentToSelf) {
        this.sentToSelf = sentToSelf;
    }

    public void setBotId(String botId) {
        this.botId = botId;
    }

    public void setLines(Integer lines) {
        this.lines = lines;
    }

    public void setLinesMore(Integer linesMore) {
        this.linesMore = linesMore;
    }

    public void setPublicUrlShared(boolean publicUrlShared) {
        this.publicUrlShared = publicUrlShared;
    }

    public void setDisplayAsBot(boolean displayAsBot) {
        this.displayAsBot = displayAsBot;
    }

    public void setChannels(List<String> channels) {
        this.channels = channels;
    }

    public void setGroups(List<String> groups) {
        this.groups = groups;
    }

    public void setIms(List<String> ims) {
        this.ims = ims;
    }

    public void setInitialComment(FileComment initialComment) {
        this.initialComment = initialComment;
    }

    public void setNumStars(Integer numStars) {
        this.numStars = numStars;
    }

    public void setStarred(boolean starred) {
        this.starred = starred;
    }

    public void setPinnedTo(List<String> pinnedTo) {
        this.pinnedTo = pinnedTo;
    }

    public void setReactions(List<Reaction> reactions) {
        this.reactions = reactions;
    }

    public void setCommentsCount(Integer commentsCount) {
        this.commentsCount = commentsCount;
    }

    public void setChannelActionsTs(String channelActionsTs) {
        this.channelActionsTs = channelActionsTs;
    }

    public void setChannelActionsCount(Integer channelActionsCount) {
        this.channelActionsCount = channelActionsCount;
    }

    public void setAttachments(List<Attachment> attachments) {
        this.attachments = attachments;
    }

    public void setBlocks(List<LayoutBlock> blocks) {
        this.blocks = blocks;
    }

    public void setShares(Shares shares) {
        this.shares = shares;
    }

    public void setTo(List<Address> to) {
        this.to = to;
    }

    public void setFrom(List<Address> from) {
        this.from = from;
    }

    public void setCc(List<Address> cc) {
        this.cc = cc;
    }

    public void setPinnedInfo(Map<String, PinnedInfo> pinnedInfo) {
        this.pinnedInfo = pinnedInfo;
    }

    public static class Shares {

        /**
         * The key of the Map: channel ID
         */
        @SerializedName("public")
        private Map<String, List<ShareDetail>> publicChannels;

        /**
         * The key of the Map: channel ID
         */
        @SerializedName("private")
        private Map<String, List<ShareDetail>> privateChannels;

        public Map<String, List<ShareDetail>> getPublicChannels() {
            return this.publicChannels;
        }

        public Map<String, List<ShareDetail>> getPrivateChannels() {
            return this.privateChannels;
        }

        public void setPublicChannels(Map<String, List<ShareDetail>> publicChannels) {
            this.publicChannels = publicChannels;
        }

        public void setPrivateChannels(Map<String, List<ShareDetail>> privateChannels) {
            this.privateChannels = privateChannels;
        }
    }

    public static class ShareDetail {
        private List<String> replyUsers;
        private Integer replyUsersCount;
        private Integer replyCount;
        private String ts;
        private String threadTs;
        private String latestReply;
        private String channelName;
        private String teamId;

        public List<String> getReplyUsers() {
            return this.replyUsers;
        }

        public Integer getReplyUsersCount() {
            return this.replyUsersCount;
        }

        public Integer getReplyCount() {
            return this.replyCount;
        }

        public String getTs() {
            return this.ts;
        }

        public String getThreadTs() {
            return this.threadTs;
        }

        public String getLatestReply() {
            return this.latestReply;
        }

        public String getChannelName() {
            return this.channelName;
        }

        public String getTeamId() {
            return this.teamId;
        }

        public void setReplyUsers(List<String> replyUsers) {
            this.replyUsers = replyUsers;
        }

        public void setReplyUsersCount(Integer replyUsersCount) {
            this.replyUsersCount = replyUsersCount;
        }

        public void setReplyCount(Integer replyCount) {
            this.replyCount = replyCount;
        }

        public void setTs(String ts) {
            this.ts = ts;
        }

        public void setThreadTs(String threadTs) {
            this.threadTs = threadTs;
        }

        public void setLatestReply(String latestReply) {
            this.latestReply = latestReply;
        }

        public void setChannelName(String channelName) {
            this.channelName = channelName;
        }

        public void setTeamId(String teamId) {
            this.teamId = teamId;
        }
    }

    private List<Address> to;
    private List<Address> from;
    private List<Address> cc;

    public static class Address {
        private String address;
        private String name;
        private String original;

        public String getAddress() {
            return this.address;
        }

        public String getName() {
            return this.name;
        }

        public String getOriginal() {
            return this.original;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setOriginal(String original) {
            this.original = original;
        }
    }

    private Map<String, PinnedInfo> pinnedInfo; // C00000000 -> {}

    public static class PinnedInfo {
        private String pinnedBy; // U00000000
        private Integer pinnedTs;

        public String getPinnedBy() {
            return this.pinnedBy;
        }

        public Integer getPinnedTs() {
            return this.pinnedTs;
        }

        public void setPinnedBy(String pinnedBy) {
            this.pinnedBy = pinnedBy;
        }

        public void setPinnedTs(Integer pinnedTs) {
            this.pinnedTs = pinnedTs;
        }
    }

    public static class FileBuilder {
        private String id;
        private Integer created;
        private Integer timestamp;
        private String name;
        private String title;
        private String subject;
        private String mimetype;
        private String filetype;
        private String prettyType;
        private String user;
        private String mode;
        private boolean editable;
        private boolean external;
        private String externalType;
        private String externalId;
        private String externalUrl;
        private String username;
        private Integer size;
        private String urlPrivate;
        private String urlPrivateDownload;
        private String appId;
        private String appName;
        private String thumb64;
        private String thumb64Gif;
        private String thumb64Width;
        private String thumb64Height;
        private String thumb80;
        private String thumb80Gif;
        private String thumb80Width;
        private String thumb80Height;
        private String thumb160;
        private String thumb160Gif;
        private String thumb160Width;
        private String thumb160Height;
        private String thumb360;
        private String thumb360Gif;
        private String thumb360Width;
        private String thumb360Height;
        private String thumb480;
        private String thumb480Gif;
        private String thumb480Width;
        private String thumb480Height;
        private String thumb720;
        private String thumb720Gif;
        private String thumb720Width;
        private String thumb720Height;
        private String thumb800;
        private String thumb800Gif;
        private String thumb800Width;
        private String thumb800Height;
        private String thumb960;
        private String thumb960Gif;
        private String thumb960Width;
        private String thumb960Height;
        private String thumb1024;
        private String thumb1024Gif;
        private String thumb1024Width;
        private String thumb1024Height;
        private String thumbVideo;
        private String thumbPdf;
        private String thumbPdfWidth;
        private String thumbPdfHeight;
        private String thumbTiny;
        private String convertedPdf;
        private Integer imageExifRotation;
        private String originalWidth;
        private String originalHeight;
        private String deanimateGif;
        private String pjpeg;
        private String permalink;
        private String permalinkPublic;
        private String editLink;
        private boolean hasRichPreview;
        private boolean previewTruncated;
        private String preview;
        private String previewHighlight;
        private String plainText;
        private String previewPlainText;
        private boolean hasMore;
        private boolean sentToSelf;
        private String botId;
        private Integer lines;
        private Integer linesMore;
        private boolean _public;
        private boolean publicUrlShared;
        private boolean displayAsBot;
        private List<String> channels;
        private List<String> groups;
        private List<String> ims;
        private FileComment initialComment;
        private Integer numStars;
        private boolean starred;
        private List<String> pinnedTo;
        private List<Reaction> reactions;
        private Integer commentsCount;
        private String channelActionsTs;
        private Integer channelActionsCount;
        private List<Attachment> attachments;
        private List<LayoutBlock> blocks;
        private Shares shares;
        private List<Address> to;
        private List<Address> from;
        private List<Address> cc;
        private Map<String, PinnedInfo> pinnedInfo;

        FileBuilder() {
        }

        public File.FileBuilder id(String id) {
            this.id = id;
            return this;
        }

        public File.FileBuilder created(Integer created) {
            this.created = created;
            return this;
        }

        public File.FileBuilder timestamp(Integer timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        public File.FileBuilder name(String name) {
            this.name = name;
            return this;
        }

        public File.FileBuilder title(String title) {
            this.title = title;
            return this;
        }

        public File.FileBuilder subject(String subject) {
            this.subject = subject;
            return this;
        }

        public File.FileBuilder mimetype(String mimetype) {
            this.mimetype = mimetype;
            return this;
        }

        public File.FileBuilder filetype(String filetype) {
            this.filetype = filetype;
            return this;
        }

        public File.FileBuilder prettyType(String prettyType) {
            this.prettyType = prettyType;
            return this;
        }

        public File.FileBuilder user(String user) {
            this.user = user;
            return this;
        }

        public File.FileBuilder mode(String mode) {
            this.mode = mode;
            return this;
        }

        public File.FileBuilder editable(boolean editable) {
            this.editable = editable;
            return this;
        }

        public File.FileBuilder external(boolean external) {
            this.external = external;
            return this;
        }

        public File.FileBuilder externalType(String externalType) {
            this.externalType = externalType;
            return this;
        }

        public File.FileBuilder externalId(String externalId) {
            this.externalId = externalId;
            return this;
        }

        public File.FileBuilder externalUrl(String externalUrl) {
            this.externalUrl = externalUrl;
            return this;
        }

        public File.FileBuilder username(String username) {
            this.username = username;
            return this;
        }

        public File.FileBuilder size(Integer size) {
            this.size = size;
            return this;
        }

        public File.FileBuilder urlPrivate(String urlPrivate) {
            this.urlPrivate = urlPrivate;
            return this;
        }

        public File.FileBuilder urlPrivateDownload(String urlPrivateDownload) {
            this.urlPrivateDownload = urlPrivateDownload;
            return this;
        }

        public File.FileBuilder appId(String appId) {
            this.appId = appId;
            return this;
        }

        public File.FileBuilder appName(String appName) {
            this.appName = appName;
            return this;
        }

        public File.FileBuilder thumb64(String thumb64) {
            this.thumb64 = thumb64;
            return this;
        }

        public File.FileBuilder thumb64Gif(String thumb64Gif) {
            this.thumb64Gif = thumb64Gif;
            return this;
        }

        public File.FileBuilder thumb64Width(String thumb64Width) {
            this.thumb64Width = thumb64Width;
            return this;
        }

        public File.FileBuilder thumb64Height(String thumb64Height) {
            this.thumb64Height = thumb64Height;
            return this;
        }

        public File.FileBuilder thumb80(String thumb80) {
            this.thumb80 = thumb80;
            return this;
        }

        public File.FileBuilder thumb80Gif(String thumb80Gif) {
            this.thumb80Gif = thumb80Gif;
            return this;
        }

        public File.FileBuilder thumb80Width(String thumb80Width) {
            this.thumb80Width = thumb80Width;
            return this;
        }

        public File.FileBuilder thumb80Height(String thumb80Height) {
            this.thumb80Height = thumb80Height;
            return this;
        }

        public File.FileBuilder thumb160(String thumb160) {
            this.thumb160 = thumb160;
            return this;
        }

        public File.FileBuilder thumb160Gif(String thumb160Gif) {
            this.thumb160Gif = thumb160Gif;
            return this;
        }

        public File.FileBuilder thumb160Width(String thumb160Width) {
            this.thumb160Width = thumb160Width;
            return this;
        }

        public File.FileBuilder thumb160Height(String thumb160Height) {
            this.thumb160Height = thumb160Height;
            return this;
        }

        public File.FileBuilder thumb360(String thumb360) {
            this.thumb360 = thumb360;
            return this;
        }

        public File.FileBuilder thumb360Gif(String thumb360Gif) {
            this.thumb360Gif = thumb360Gif;
            return this;
        }

        public File.FileBuilder thumb360Width(String thumb360Width) {
            this.thumb360Width = thumb360Width;
            return this;
        }

        public File.FileBuilder thumb360Height(String thumb360Height) {
            this.thumb360Height = thumb360Height;
            return this;
        }

        public File.FileBuilder thumb480(String thumb480) {
            this.thumb480 = thumb480;
            return this;
        }

        public File.FileBuilder thumb480Gif(String thumb480Gif) {
            this.thumb480Gif = thumb480Gif;
            return this;
        }

        public File.FileBuilder thumb480Width(String thumb480Width) {
            this.thumb480Width = thumb480Width;
            return this;
        }

        public File.FileBuilder thumb480Height(String thumb480Height) {
            this.thumb480Height = thumb480Height;
            return this;
        }

        public File.FileBuilder thumb720(String thumb720) {
            this.thumb720 = thumb720;
            return this;
        }

        public File.FileBuilder thumb720Gif(String thumb720Gif) {
            this.thumb720Gif = thumb720Gif;
            return this;
        }

        public File.FileBuilder thumb720Width(String thumb720Width) {
            this.thumb720Width = thumb720Width;
            return this;
        }

        public File.FileBuilder thumb720Height(String thumb720Height) {
            this.thumb720Height = thumb720Height;
            return this;
        }

        public File.FileBuilder thumb800(String thumb800) {
            this.thumb800 = thumb800;
            return this;
        }

        public File.FileBuilder thumb800Gif(String thumb800Gif) {
            this.thumb800Gif = thumb800Gif;
            return this;
        }

        public File.FileBuilder thumb800Width(String thumb800Width) {
            this.thumb800Width = thumb800Width;
            return this;
        }

        public File.FileBuilder thumb800Height(String thumb800Height) {
            this.thumb800Height = thumb800Height;
            return this;
        }

        public File.FileBuilder thumb960(String thumb960) {
            this.thumb960 = thumb960;
            return this;
        }

        public File.FileBuilder thumb960Gif(String thumb960Gif) {
            this.thumb960Gif = thumb960Gif;
            return this;
        }

        public File.FileBuilder thumb960Width(String thumb960Width) {
            this.thumb960Width = thumb960Width;
            return this;
        }

        public File.FileBuilder thumb960Height(String thumb960Height) {
            this.thumb960Height = thumb960Height;
            return this;
        }

        public File.FileBuilder thumb1024(String thumb1024) {
            this.thumb1024 = thumb1024;
            return this;
        }

        public File.FileBuilder thumb1024Gif(String thumb1024Gif) {
            this.thumb1024Gif = thumb1024Gif;
            return this;
        }

        public File.FileBuilder thumb1024Width(String thumb1024Width) {
            this.thumb1024Width = thumb1024Width;
            return this;
        }

        public File.FileBuilder thumb1024Height(String thumb1024Height) {
            this.thumb1024Height = thumb1024Height;
            return this;
        }

        public File.FileBuilder thumbVideo(String thumbVideo) {
            this.thumbVideo = thumbVideo;
            return this;
        }

        public File.FileBuilder thumbPdf(String thumbPdf) {
            this.thumbPdf = thumbPdf;
            return this;
        }

        public File.FileBuilder thumbPdfWidth(String thumbPdfWidth) {
            this.thumbPdfWidth = thumbPdfWidth;
            return this;
        }

        public File.FileBuilder thumbPdfHeight(String thumbPdfHeight) {
            this.thumbPdfHeight = thumbPdfHeight;
            return this;
        }

        public File.FileBuilder thumbTiny(String thumbTiny) {
            this.thumbTiny = thumbTiny;
            return this;
        }

        public File.FileBuilder convertedPdf(String convertedPdf) {
            this.convertedPdf = convertedPdf;
            return this;
        }

        public File.FileBuilder imageExifRotation(Integer imageExifRotation) {
            this.imageExifRotation = imageExifRotation;
            return this;
        }

        public File.FileBuilder originalWidth(String originalWidth) {
            this.originalWidth = originalWidth;
            return this;
        }

        public File.FileBuilder originalHeight(String originalHeight) {
            this.originalHeight = originalHeight;
            return this;
        }

        public File.FileBuilder deanimateGif(String deanimateGif) {
            this.deanimateGif = deanimateGif;
            return this;
        }

        public File.FileBuilder pjpeg(String pjpeg) {
            this.pjpeg = pjpeg;
            return this;
        }

        public File.FileBuilder permalink(String permalink) {
            this.permalink = permalink;
            return this;
        }

        public File.FileBuilder permalinkPublic(String permalinkPublic) {
            this.permalinkPublic = permalinkPublic;
            return this;
        }

        public File.FileBuilder editLink(String editLink) {
            this.editLink = editLink;
            return this;
        }

        public File.FileBuilder hasRichPreview(boolean hasRichPreview) {
            this.hasRichPreview = hasRichPreview;
            return this;
        }

        public File.FileBuilder previewTruncated(boolean previewTruncated) {
            this.previewTruncated = previewTruncated;
            return this;
        }

        public File.FileBuilder preview(String preview) {
            this.preview = preview;
            return this;
        }

        public File.FileBuilder previewHighlight(String previewHighlight) {
            this.previewHighlight = previewHighlight;
            return this;
        }

        public File.FileBuilder plainText(String plainText) {
            this.plainText = plainText;
            return this;
        }

        public File.FileBuilder previewPlainText(String previewPlainText) {
            this.previewPlainText = previewPlainText;
            return this;
        }

        public File.FileBuilder hasMore(boolean hasMore) {
            this.hasMore = hasMore;
            return this;
        }

        public File.FileBuilder sentToSelf(boolean sentToSelf) {
            this.sentToSelf = sentToSelf;
            return this;
        }

        public File.FileBuilder botId(String botId) {
            this.botId = botId;
            return this;
        }

        public File.FileBuilder lines(Integer lines) {
            this.lines = lines;
            return this;
        }

        public File.FileBuilder linesMore(Integer linesMore) {
            this.linesMore = linesMore;
            return this;
        }

        public File.FileBuilder _public(boolean _public) {
            this._public = _public;
            return this;
        }

        public File.FileBuilder publicUrlShared(boolean publicUrlShared) {
            this.publicUrlShared = publicUrlShared;
            return this;
        }

        public File.FileBuilder displayAsBot(boolean displayAsBot) {
            this.displayAsBot = displayAsBot;
            return this;
        }

        public File.FileBuilder channels(List<String> channels) {
            this.channels = channels;
            return this;
        }

        public File.FileBuilder groups(List<String> groups) {
            this.groups = groups;
            return this;
        }

        public File.FileBuilder ims(List<String> ims) {
            this.ims = ims;
            return this;
        }

        public File.FileBuilder initialComment(FileComment initialComment) {
            this.initialComment = initialComment;
            return this;
        }

        public File.FileBuilder numStars(Integer numStars) {
            this.numStars = numStars;
            return this;
        }

        public File.FileBuilder starred(boolean starred) {
            this.starred = starred;
            return this;
        }

        public File.FileBuilder pinnedTo(List<String> pinnedTo) {
            this.pinnedTo = pinnedTo;
            return this;
        }

        public File.FileBuilder reactions(List<Reaction> reactions) {
            this.reactions = reactions;
            return this;
        }

        public File.FileBuilder commentsCount(Integer commentsCount) {
            this.commentsCount = commentsCount;
            return this;
        }

        public File.FileBuilder channelActionsTs(String channelActionsTs) {
            this.channelActionsTs = channelActionsTs;
            return this;
        }

        public File.FileBuilder channelActionsCount(Integer channelActionsCount) {
            this.channelActionsCount = channelActionsCount;
            return this;
        }

        public File.FileBuilder attachments(List<Attachment> attachments) {
            this.attachments = attachments;
            return this;
        }

        public File.FileBuilder blocks(List<LayoutBlock> blocks) {
            this.blocks = blocks;
            return this;
        }

        public File.FileBuilder shares(Shares shares) {
            this.shares = shares;
            return this;
        }

        public File.FileBuilder to(List<Address> to) {
            this.to = to;
            return this;
        }

        public File.FileBuilder from(List<Address> from) {
            this.from = from;
            return this;
        }

        public File.FileBuilder cc(List<Address> cc) {
            this.cc = cc;
            return this;
        }

        public File.FileBuilder pinnedInfo(Map<String, PinnedInfo> pinnedInfo) {
            this.pinnedInfo = pinnedInfo;
            return this;
        }

        public File build() {
            return new File(id, created, timestamp, name, title, subject, mimetype, filetype, prettyType, user, mode, editable, external, externalType, externalId, externalUrl, username, size, urlPrivate, urlPrivateDownload, appId, appName, thumb64, thumb64Gif, thumb64Width, thumb64Height, thumb80, thumb80Gif, thumb80Width, thumb80Height, thumb160, thumb160Gif, thumb160Width, thumb160Height, thumb360, thumb360Gif, thumb360Width, thumb360Height, thumb480, thumb480Gif, thumb480Width, thumb480Height, thumb720, thumb720Gif, thumb720Width, thumb720Height, thumb800, thumb800Gif, thumb800Width, thumb800Height, thumb960, thumb960Gif, thumb960Width, thumb960Height, thumb1024, thumb1024Gif, thumb1024Width, thumb1024Height, thumbVideo, thumbPdf, thumbPdfWidth, thumbPdfHeight, thumbTiny, convertedPdf, imageExifRotation, originalWidth, originalHeight, deanimateGif, pjpeg, permalink, permalinkPublic, editLink, hasRichPreview, previewTruncated, preview, previewHighlight, plainText, previewPlainText, hasMore, sentToSelf, botId, lines, linesMore, _public, publicUrlShared, displayAsBot, channels, groups, ims, initialComment, numStars, starred, pinnedTo, reactions, commentsCount, channelActionsTs, channelActionsCount, attachments, blocks, shares, to, from, cc, pinnedInfo);
        }

        public String toString() {
            return "File.FileBuilder(id=" + this.id + ", created=" + this.created + ", timestamp=" + this.timestamp + ", name=" + this.name + ", title=" + this.title + ", subject=" + this.subject + ", mimetype=" + this.mimetype + ", filetype=" + this.filetype + ", prettyType=" + this.prettyType + ", user=" + this.user + ", mode=" + this.mode + ", editable=" + this.editable + ", external=" + this.external + ", externalType=" + this.externalType + ", externalId=" + this.externalId + ", externalUrl=" + this.externalUrl + ", username=" + this.username + ", size=" + this.size + ", urlPrivate=" + this.urlPrivate + ", urlPrivateDownload=" + this.urlPrivateDownload + ", appId=" + this.appId + ", appName=" + this.appName + ", thumb64=" + this.thumb64 + ", thumb64Gif=" + this.thumb64Gif + ", thumb64Width=" + this.thumb64Width + ", thumb64Height=" + this.thumb64Height + ", thumb80=" + this.thumb80 + ", thumb80Gif=" + this.thumb80Gif + ", thumb80Width=" + this.thumb80Width + ", thumb80Height=" + this.thumb80Height + ", thumb160=" + this.thumb160 + ", thumb160Gif=" + this.thumb160Gif + ", thumb160Width=" + this.thumb160Width + ", thumb160Height=" + this.thumb160Height + ", thumb360=" + this.thumb360 + ", thumb360Gif=" + this.thumb360Gif + ", thumb360Width=" + this.thumb360Width + ", thumb360Height=" + this.thumb360Height + ", thumb480=" + this.thumb480 + ", thumb480Gif=" + this.thumb480Gif + ", thumb480Width=" + this.thumb480Width + ", thumb480Height=" + this.thumb480Height + ", thumb720=" + this.thumb720 + ", thumb720Gif=" + this.thumb720Gif + ", thumb720Width=" + this.thumb720Width + ", thumb720Height=" + this.thumb720Height + ", thumb800=" + this.thumb800 + ", thumb800Gif=" + this.thumb800Gif + ", thumb800Width=" + this.thumb800Width + ", thumb800Height=" + this.thumb800Height + ", thumb960=" + this.thumb960 + ", thumb960Gif=" + this.thumb960Gif + ", thumb960Width=" + this.thumb960Width + ", thumb960Height=" + this.thumb960Height + ", thumb1024=" + this.thumb1024 + ", thumb1024Gif=" + this.thumb1024Gif + ", thumb1024Width=" + this.thumb1024Width + ", thumb1024Height=" + this.thumb1024Height + ", thumbVideo=" + this.thumbVideo + ", thumbPdf=" + this.thumbPdf + ", thumbPdfWidth=" + this.thumbPdfWidth + ", thumbPdfHeight=" + this.thumbPdfHeight + ", thumbTiny=" + this.thumbTiny + ", convertedPdf=" + this.convertedPdf + ", imageExifRotation=" + this.imageExifRotation + ", originalWidth=" + this.originalWidth + ", originalHeight=" + this.originalHeight + ", deanimateGif=" + this.deanimateGif + ", pjpeg=" + this.pjpeg + ", permalink=" + this.permalink + ", permalinkPublic=" + this.permalinkPublic + ", editLink=" + this.editLink + ", hasRichPreview=" + this.hasRichPreview + ", previewTruncated=" + this.previewTruncated + ", preview=" + this.preview + ", previewHighlight=" + this.previewHighlight + ", plainText=" + this.plainText + ", previewPlainText=" + this.previewPlainText + ", hasMore=" + this.hasMore + ", sentToSelf=" + this.sentToSelf + ", botId=" + this.botId + ", lines=" + this.lines + ", linesMore=" + this.linesMore + ", _public=" + this._public + ", publicUrlShared=" + this.publicUrlShared + ", displayAsBot=" + this.displayAsBot + ", channels=" + this.channels + ", groups=" + this.groups + ", ims=" + this.ims + ", initialComment=" + this.initialComment + ", numStars=" + this.numStars + ", starred=" + this.starred + ", pinnedTo=" + this.pinnedTo + ", reactions=" + this.reactions + ", commentsCount=" + this.commentsCount + ", channelActionsTs=" + this.channelActionsTs + ", channelActionsCount=" + this.channelActionsCount + ", attachments=" + this.attachments + ", blocks=" + this.blocks + ", shares=" + this.shares + ", to=" + this.to + ", from=" + this.from + ", cc=" + this.cc + ", pinnedInfo=" + this.pinnedInfo + ")";
        }
    }
}