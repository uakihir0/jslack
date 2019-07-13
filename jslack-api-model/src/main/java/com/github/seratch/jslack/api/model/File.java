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

    public File(String id, Integer created, Integer timestamp, String name, String title, String subject, String mimetype, String filetype, String prettyType, String user, String mode, boolean editable, boolean external, String externalType, String username, Integer size, String urlPrivate, String urlPrivateDownload, String appId, String appName, String thumb64, String thumb64Gif, String thumb64Width, String thumb64Height, String thumb80, String thumb80Gif, String thumb80Width, String thumb80Height, String thumb160, String thumb160Gif, String thumb160Width, String thumb160Height, String thumb360, String thumb360Gif, String thumb360Width, String thumb360Height, String thumb480, String thumb480Gif, String thumb480Width, String thumb480Height, String thumb720, String thumb720Gif, String thumb720Width, String thumb720Height, String thumb800, String thumb800Gif, String thumb800Width, String thumb800Height, String thumb960, String thumb960Gif, String thumb960Width, String thumb960Height, String thumb1024, String thumb1024Gif, String thumb1024Width, String thumb1024Height, String thumbVideo, Integer imageExifRotation, String originalWidth, String originalHeight, String deanimateGif, String pjpeg, String permalink, String permalinkPublic, String editLink, boolean hasRichPreview, boolean previewTruncated, String preview, String previewHighlight, String plainText, String previewPlainText, boolean hasMore, boolean sentToSelf, String botId, Integer lines, Integer linesMore, boolean _public, boolean publicUrlShared, boolean displayAsBot, List<String> channels, List<String> groups, List<String> ims, FileComment initialComment, Integer numStars, boolean starred, List<String> pinnedTo, List<Reaction> reactions, Integer commentsCount, List<Attachment> attachments, List<LayoutBlock> blocks, Shares shares, List<Address> to, List<Address> from, List<Address> cc) {
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
        this.attachments = attachments;
        this.blocks = blocks;
        this.shares = shares;
        this.to = to;
        this.from = from;
        this.cc = cc;
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

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof File)) return false;
        final File other = (File) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final Object this$created = this.getCreated();
        final Object other$created = other.getCreated();
        if (this$created == null ? other$created != null : !this$created.equals(other$created)) return false;
        final Object this$timestamp = this.getTimestamp();
        final Object other$timestamp = other.getTimestamp();
        if (this$timestamp == null ? other$timestamp != null : !this$timestamp.equals(other$timestamp)) return false;
        final Object this$name = this.getName();
        final Object other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
        final Object this$title = this.getTitle();
        final Object other$title = other.getTitle();
        if (this$title == null ? other$title != null : !this$title.equals(other$title)) return false;
        final Object this$subject = this.getSubject();
        final Object other$subject = other.getSubject();
        if (this$subject == null ? other$subject != null : !this$subject.equals(other$subject)) return false;
        final Object this$mimetype = this.getMimetype();
        final Object other$mimetype = other.getMimetype();
        if (this$mimetype == null ? other$mimetype != null : !this$mimetype.equals(other$mimetype)) return false;
        final Object this$filetype = this.getFiletype();
        final Object other$filetype = other.getFiletype();
        if (this$filetype == null ? other$filetype != null : !this$filetype.equals(other$filetype)) return false;
        final Object this$prettyType = this.getPrettyType();
        final Object other$prettyType = other.getPrettyType();
        if (this$prettyType == null ? other$prettyType != null : !this$prettyType.equals(other$prettyType))
            return false;
        final Object this$user = this.getUser();
        final Object other$user = other.getUser();
        if (this$user == null ? other$user != null : !this$user.equals(other$user)) return false;
        final Object this$mode = this.getMode();
        final Object other$mode = other.getMode();
        if (this$mode == null ? other$mode != null : !this$mode.equals(other$mode)) return false;
        if (this.isEditable() != other.isEditable()) return false;
        if (this.isExternal() != other.isExternal()) return false;
        final Object this$externalType = this.getExternalType();
        final Object other$externalType = other.getExternalType();
        if (this$externalType == null ? other$externalType != null : !this$externalType.equals(other$externalType))
            return false;
        final Object this$username = this.getUsername();
        final Object other$username = other.getUsername();
        if (this$username == null ? other$username != null : !this$username.equals(other$username)) return false;
        final Object this$size = this.getSize();
        final Object other$size = other.getSize();
        if (this$size == null ? other$size != null : !this$size.equals(other$size)) return false;
        final Object this$urlPrivate = this.getUrlPrivate();
        final Object other$urlPrivate = other.getUrlPrivate();
        if (this$urlPrivate == null ? other$urlPrivate != null : !this$urlPrivate.equals(other$urlPrivate))
            return false;
        final Object this$urlPrivateDownload = this.getUrlPrivateDownload();
        final Object other$urlPrivateDownload = other.getUrlPrivateDownload();
        if (this$urlPrivateDownload == null ? other$urlPrivateDownload != null : !this$urlPrivateDownload.equals(other$urlPrivateDownload))
            return false;
        final Object this$appId = this.getAppId();
        final Object other$appId = other.getAppId();
        if (this$appId == null ? other$appId != null : !this$appId.equals(other$appId)) return false;
        final Object this$appName = this.getAppName();
        final Object other$appName = other.getAppName();
        if (this$appName == null ? other$appName != null : !this$appName.equals(other$appName)) return false;
        final Object this$thumb64 = this.getThumb64();
        final Object other$thumb64 = other.getThumb64();
        if (this$thumb64 == null ? other$thumb64 != null : !this$thumb64.equals(other$thumb64)) return false;
        final Object this$thumb64Gif = this.getThumb64Gif();
        final Object other$thumb64Gif = other.getThumb64Gif();
        if (this$thumb64Gif == null ? other$thumb64Gif != null : !this$thumb64Gif.equals(other$thumb64Gif))
            return false;
        final Object this$thumb64Width = this.getThumb64Width();
        final Object other$thumb64Width = other.getThumb64Width();
        if (this$thumb64Width == null ? other$thumb64Width != null : !this$thumb64Width.equals(other$thumb64Width))
            return false;
        final Object this$thumb64Height = this.getThumb64Height();
        final Object other$thumb64Height = other.getThumb64Height();
        if (this$thumb64Height == null ? other$thumb64Height != null : !this$thumb64Height.equals(other$thumb64Height))
            return false;
        final Object this$thumb80 = this.getThumb80();
        final Object other$thumb80 = other.getThumb80();
        if (this$thumb80 == null ? other$thumb80 != null : !this$thumb80.equals(other$thumb80)) return false;
        final Object this$thumb80Gif = this.getThumb80Gif();
        final Object other$thumb80Gif = other.getThumb80Gif();
        if (this$thumb80Gif == null ? other$thumb80Gif != null : !this$thumb80Gif.equals(other$thumb80Gif))
            return false;
        final Object this$thumb80Width = this.getThumb80Width();
        final Object other$thumb80Width = other.getThumb80Width();
        if (this$thumb80Width == null ? other$thumb80Width != null : !this$thumb80Width.equals(other$thumb80Width))
            return false;
        final Object this$thumb80Height = this.getThumb80Height();
        final Object other$thumb80Height = other.getThumb80Height();
        if (this$thumb80Height == null ? other$thumb80Height != null : !this$thumb80Height.equals(other$thumb80Height))
            return false;
        final Object this$thumb160 = this.getThumb160();
        final Object other$thumb160 = other.getThumb160();
        if (this$thumb160 == null ? other$thumb160 != null : !this$thumb160.equals(other$thumb160)) return false;
        final Object this$thumb160Gif = this.getThumb160Gif();
        final Object other$thumb160Gif = other.getThumb160Gif();
        if (this$thumb160Gif == null ? other$thumb160Gif != null : !this$thumb160Gif.equals(other$thumb160Gif))
            return false;
        final Object this$thumb160Width = this.getThumb160Width();
        final Object other$thumb160Width = other.getThumb160Width();
        if (this$thumb160Width == null ? other$thumb160Width != null : !this$thumb160Width.equals(other$thumb160Width))
            return false;
        final Object this$thumb160Height = this.getThumb160Height();
        final Object other$thumb160Height = other.getThumb160Height();
        if (this$thumb160Height == null ? other$thumb160Height != null : !this$thumb160Height.equals(other$thumb160Height))
            return false;
        final Object this$thumb360 = this.getThumb360();
        final Object other$thumb360 = other.getThumb360();
        if (this$thumb360 == null ? other$thumb360 != null : !this$thumb360.equals(other$thumb360)) return false;
        final Object this$thumb360Gif = this.getThumb360Gif();
        final Object other$thumb360Gif = other.getThumb360Gif();
        if (this$thumb360Gif == null ? other$thumb360Gif != null : !this$thumb360Gif.equals(other$thumb360Gif))
            return false;
        final Object this$thumb360Width = this.getThumb360Width();
        final Object other$thumb360Width = other.getThumb360Width();
        if (this$thumb360Width == null ? other$thumb360Width != null : !this$thumb360Width.equals(other$thumb360Width))
            return false;
        final Object this$thumb360Height = this.getThumb360Height();
        final Object other$thumb360Height = other.getThumb360Height();
        if (this$thumb360Height == null ? other$thumb360Height != null : !this$thumb360Height.equals(other$thumb360Height))
            return false;
        final Object this$thumb480 = this.getThumb480();
        final Object other$thumb480 = other.getThumb480();
        if (this$thumb480 == null ? other$thumb480 != null : !this$thumb480.equals(other$thumb480)) return false;
        final Object this$thumb480Gif = this.getThumb480Gif();
        final Object other$thumb480Gif = other.getThumb480Gif();
        if (this$thumb480Gif == null ? other$thumb480Gif != null : !this$thumb480Gif.equals(other$thumb480Gif))
            return false;
        final Object this$thumb480Width = this.getThumb480Width();
        final Object other$thumb480Width = other.getThumb480Width();
        if (this$thumb480Width == null ? other$thumb480Width != null : !this$thumb480Width.equals(other$thumb480Width))
            return false;
        final Object this$thumb480Height = this.getThumb480Height();
        final Object other$thumb480Height = other.getThumb480Height();
        if (this$thumb480Height == null ? other$thumb480Height != null : !this$thumb480Height.equals(other$thumb480Height))
            return false;
        final Object this$thumb720 = this.getThumb720();
        final Object other$thumb720 = other.getThumb720();
        if (this$thumb720 == null ? other$thumb720 != null : !this$thumb720.equals(other$thumb720)) return false;
        final Object this$thumb720Gif = this.getThumb720Gif();
        final Object other$thumb720Gif = other.getThumb720Gif();
        if (this$thumb720Gif == null ? other$thumb720Gif != null : !this$thumb720Gif.equals(other$thumb720Gif))
            return false;
        final Object this$thumb720Width = this.getThumb720Width();
        final Object other$thumb720Width = other.getThumb720Width();
        if (this$thumb720Width == null ? other$thumb720Width != null : !this$thumb720Width.equals(other$thumb720Width))
            return false;
        final Object this$thumb720Height = this.getThumb720Height();
        final Object other$thumb720Height = other.getThumb720Height();
        if (this$thumb720Height == null ? other$thumb720Height != null : !this$thumb720Height.equals(other$thumb720Height))
            return false;
        final Object this$thumb800 = this.getThumb800();
        final Object other$thumb800 = other.getThumb800();
        if (this$thumb800 == null ? other$thumb800 != null : !this$thumb800.equals(other$thumb800)) return false;
        final Object this$thumb800Gif = this.getThumb800Gif();
        final Object other$thumb800Gif = other.getThumb800Gif();
        if (this$thumb800Gif == null ? other$thumb800Gif != null : !this$thumb800Gif.equals(other$thumb800Gif))
            return false;
        final Object this$thumb800Width = this.getThumb800Width();
        final Object other$thumb800Width = other.getThumb800Width();
        if (this$thumb800Width == null ? other$thumb800Width != null : !this$thumb800Width.equals(other$thumb800Width))
            return false;
        final Object this$thumb800Height = this.getThumb800Height();
        final Object other$thumb800Height = other.getThumb800Height();
        if (this$thumb800Height == null ? other$thumb800Height != null : !this$thumb800Height.equals(other$thumb800Height))
            return false;
        final Object this$thumb960 = this.getThumb960();
        final Object other$thumb960 = other.getThumb960();
        if (this$thumb960 == null ? other$thumb960 != null : !this$thumb960.equals(other$thumb960)) return false;
        final Object this$thumb960Gif = this.getThumb960Gif();
        final Object other$thumb960Gif = other.getThumb960Gif();
        if (this$thumb960Gif == null ? other$thumb960Gif != null : !this$thumb960Gif.equals(other$thumb960Gif))
            return false;
        final Object this$thumb960Width = this.getThumb960Width();
        final Object other$thumb960Width = other.getThumb960Width();
        if (this$thumb960Width == null ? other$thumb960Width != null : !this$thumb960Width.equals(other$thumb960Width))
            return false;
        final Object this$thumb960Height = this.getThumb960Height();
        final Object other$thumb960Height = other.getThumb960Height();
        if (this$thumb960Height == null ? other$thumb960Height != null : !this$thumb960Height.equals(other$thumb960Height))
            return false;
        final Object this$thumb1024 = this.getThumb1024();
        final Object other$thumb1024 = other.getThumb1024();
        if (this$thumb1024 == null ? other$thumb1024 != null : !this$thumb1024.equals(other$thumb1024)) return false;
        final Object this$thumb1024Gif = this.getThumb1024Gif();
        final Object other$thumb1024Gif = other.getThumb1024Gif();
        if (this$thumb1024Gif == null ? other$thumb1024Gif != null : !this$thumb1024Gif.equals(other$thumb1024Gif))
            return false;
        final Object this$thumb1024Width = this.getThumb1024Width();
        final Object other$thumb1024Width = other.getThumb1024Width();
        if (this$thumb1024Width == null ? other$thumb1024Width != null : !this$thumb1024Width.equals(other$thumb1024Width))
            return false;
        final Object this$thumb1024Height = this.getThumb1024Height();
        final Object other$thumb1024Height = other.getThumb1024Height();
        if (this$thumb1024Height == null ? other$thumb1024Height != null : !this$thumb1024Height.equals(other$thumb1024Height))
            return false;
        final Object this$thumbVideo = this.getThumbVideo();
        final Object other$thumbVideo = other.getThumbVideo();
        if (this$thumbVideo == null ? other$thumbVideo != null : !this$thumbVideo.equals(other$thumbVideo))
            return false;
        final Object this$imageExifRotation = this.getImageExifRotation();
        final Object other$imageExifRotation = other.getImageExifRotation();
        if (this$imageExifRotation == null ? other$imageExifRotation != null : !this$imageExifRotation.equals(other$imageExifRotation))
            return false;
        final Object this$originalWidth = this.getOriginalWidth();
        final Object other$originalWidth = other.getOriginalWidth();
        if (this$originalWidth == null ? other$originalWidth != null : !this$originalWidth.equals(other$originalWidth))
            return false;
        final Object this$originalHeight = this.getOriginalHeight();
        final Object other$originalHeight = other.getOriginalHeight();
        if (this$originalHeight == null ? other$originalHeight != null : !this$originalHeight.equals(other$originalHeight))
            return false;
        final Object this$deanimateGif = this.getDeanimateGif();
        final Object other$deanimateGif = other.getDeanimateGif();
        if (this$deanimateGif == null ? other$deanimateGif != null : !this$deanimateGif.equals(other$deanimateGif))
            return false;
        final Object this$pjpeg = this.getPjpeg();
        final Object other$pjpeg = other.getPjpeg();
        if (this$pjpeg == null ? other$pjpeg != null : !this$pjpeg.equals(other$pjpeg)) return false;
        final Object this$permalink = this.getPermalink();
        final Object other$permalink = other.getPermalink();
        if (this$permalink == null ? other$permalink != null : !this$permalink.equals(other$permalink)) return false;
        final Object this$permalinkPublic = this.getPermalinkPublic();
        final Object other$permalinkPublic = other.getPermalinkPublic();
        if (this$permalinkPublic == null ? other$permalinkPublic != null : !this$permalinkPublic.equals(other$permalinkPublic))
            return false;
        final Object this$editLink = this.getEditLink();
        final Object other$editLink = other.getEditLink();
        if (this$editLink == null ? other$editLink != null : !this$editLink.equals(other$editLink)) return false;
        if (this.isHasRichPreview() != other.isHasRichPreview()) return false;
        if (this.isPreviewTruncated() != other.isPreviewTruncated()) return false;
        final Object this$preview = this.getPreview();
        final Object other$preview = other.getPreview();
        if (this$preview == null ? other$preview != null : !this$preview.equals(other$preview)) return false;
        final Object this$previewHighlight = this.getPreviewHighlight();
        final Object other$previewHighlight = other.getPreviewHighlight();
        if (this$previewHighlight == null ? other$previewHighlight != null : !this$previewHighlight.equals(other$previewHighlight))
            return false;
        final Object this$plainText = this.getPlainText();
        final Object other$plainText = other.getPlainText();
        if (this$plainText == null ? other$plainText != null : !this$plainText.equals(other$plainText)) return false;
        final Object this$previewPlainText = this.getPreviewPlainText();
        final Object other$previewPlainText = other.getPreviewPlainText();
        if (this$previewPlainText == null ? other$previewPlainText != null : !this$previewPlainText.equals(other$previewPlainText))
            return false;
        if (this.isHasMore() != other.isHasMore()) return false;
        if (this.isSentToSelf() != other.isSentToSelf()) return false;
        final Object this$botId = this.getBotId();
        final Object other$botId = other.getBotId();
        if (this$botId == null ? other$botId != null : !this$botId.equals(other$botId)) return false;
        final Object this$lines = this.getLines();
        final Object other$lines = other.getLines();
        if (this$lines == null ? other$lines != null : !this$lines.equals(other$lines)) return false;
        final Object this$linesMore = this.getLinesMore();
        final Object other$linesMore = other.getLinesMore();
        if (this$linesMore == null ? other$linesMore != null : !this$linesMore.equals(other$linesMore)) return false;
        if (this.isPublic() != other.isPublic()) return false;
        if (this.isPublicUrlShared() != other.isPublicUrlShared()) return false;
        if (this.isDisplayAsBot() != other.isDisplayAsBot()) return false;
        final Object this$channels = this.getChannels();
        final Object other$channels = other.getChannels();
        if (this$channels == null ? other$channels != null : !this$channels.equals(other$channels)) return false;
        final Object this$groups = this.getGroups();
        final Object other$groups = other.getGroups();
        if (this$groups == null ? other$groups != null : !this$groups.equals(other$groups)) return false;
        final Object this$ims = this.getIms();
        final Object other$ims = other.getIms();
        if (this$ims == null ? other$ims != null : !this$ims.equals(other$ims)) return false;
        final Object this$initialComment = this.getInitialComment();
        final Object other$initialComment = other.getInitialComment();
        if (this$initialComment == null ? other$initialComment != null : !this$initialComment.equals(other$initialComment))
            return false;
        final Object this$numStars = this.getNumStars();
        final Object other$numStars = other.getNumStars();
        if (this$numStars == null ? other$numStars != null : !this$numStars.equals(other$numStars)) return false;
        if (this.isStarred() != other.isStarred()) return false;
        final Object this$pinnedTo = this.getPinnedTo();
        final Object other$pinnedTo = other.getPinnedTo();
        if (this$pinnedTo == null ? other$pinnedTo != null : !this$pinnedTo.equals(other$pinnedTo)) return false;
        final Object this$reactions = this.getReactions();
        final Object other$reactions = other.getReactions();
        if (this$reactions == null ? other$reactions != null : !this$reactions.equals(other$reactions)) return false;
        final Object this$commentsCount = this.getCommentsCount();
        final Object other$commentsCount = other.getCommentsCount();
        if (this$commentsCount == null ? other$commentsCount != null : !this$commentsCount.equals(other$commentsCount))
            return false;
        final Object this$attachments = this.getAttachments();
        final Object other$attachments = other.getAttachments();
        if (this$attachments == null ? other$attachments != null : !this$attachments.equals(other$attachments))
            return false;
        final Object this$blocks = this.getBlocks();
        final Object other$blocks = other.getBlocks();
        if (this$blocks == null ? other$blocks != null : !this$blocks.equals(other$blocks)) return false;
        final Object this$shares = this.getShares();
        final Object other$shares = other.getShares();
        if (this$shares == null ? other$shares != null : !this$shares.equals(other$shares)) return false;
        final Object this$to = this.getTo();
        final Object other$to = other.getTo();
        if (this$to == null ? other$to != null : !this$to.equals(other$to)) return false;
        final Object this$from = this.getFrom();
        final Object other$from = other.getFrom();
        if (this$from == null ? other$from != null : !this$from.equals(other$from)) return false;
        final Object this$cc = this.getCc();
        final Object other$cc = other.getCc();
        if (this$cc == null ? other$cc != null : !this$cc.equals(other$cc)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof File;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final Object $created = this.getCreated();
        result = result * PRIME + ($created == null ? 43 : $created.hashCode());
        final Object $timestamp = this.getTimestamp();
        result = result * PRIME + ($timestamp == null ? 43 : $timestamp.hashCode());
        final Object $name = this.getName();
        result = result * PRIME + ($name == null ? 43 : $name.hashCode());
        final Object $title = this.getTitle();
        result = result * PRIME + ($title == null ? 43 : $title.hashCode());
        final Object $subject = this.getSubject();
        result = result * PRIME + ($subject == null ? 43 : $subject.hashCode());
        final Object $mimetype = this.getMimetype();
        result = result * PRIME + ($mimetype == null ? 43 : $mimetype.hashCode());
        final Object $filetype = this.getFiletype();
        result = result * PRIME + ($filetype == null ? 43 : $filetype.hashCode());
        final Object $prettyType = this.getPrettyType();
        result = result * PRIME + ($prettyType == null ? 43 : $prettyType.hashCode());
        final Object $user = this.getUser();
        result = result * PRIME + ($user == null ? 43 : $user.hashCode());
        final Object $mode = this.getMode();
        result = result * PRIME + ($mode == null ? 43 : $mode.hashCode());
        result = result * PRIME + (this.isEditable() ? 79 : 97);
        result = result * PRIME + (this.isExternal() ? 79 : 97);
        final Object $externalType = this.getExternalType();
        result = result * PRIME + ($externalType == null ? 43 : $externalType.hashCode());
        final Object $username = this.getUsername();
        result = result * PRIME + ($username == null ? 43 : $username.hashCode());
        final Object $size = this.getSize();
        result = result * PRIME + ($size == null ? 43 : $size.hashCode());
        final Object $urlPrivate = this.getUrlPrivate();
        result = result * PRIME + ($urlPrivate == null ? 43 : $urlPrivate.hashCode());
        final Object $urlPrivateDownload = this.getUrlPrivateDownload();
        result = result * PRIME + ($urlPrivateDownload == null ? 43 : $urlPrivateDownload.hashCode());
        final Object $appId = this.getAppId();
        result = result * PRIME + ($appId == null ? 43 : $appId.hashCode());
        final Object $appName = this.getAppName();
        result = result * PRIME + ($appName == null ? 43 : $appName.hashCode());
        final Object $thumb64 = this.getThumb64();
        result = result * PRIME + ($thumb64 == null ? 43 : $thumb64.hashCode());
        final Object $thumb64Gif = this.getThumb64Gif();
        result = result * PRIME + ($thumb64Gif == null ? 43 : $thumb64Gif.hashCode());
        final Object $thumb64Width = this.getThumb64Width();
        result = result * PRIME + ($thumb64Width == null ? 43 : $thumb64Width.hashCode());
        final Object $thumb64Height = this.getThumb64Height();
        result = result * PRIME + ($thumb64Height == null ? 43 : $thumb64Height.hashCode());
        final Object $thumb80 = this.getThumb80();
        result = result * PRIME + ($thumb80 == null ? 43 : $thumb80.hashCode());
        final Object $thumb80Gif = this.getThumb80Gif();
        result = result * PRIME + ($thumb80Gif == null ? 43 : $thumb80Gif.hashCode());
        final Object $thumb80Width = this.getThumb80Width();
        result = result * PRIME + ($thumb80Width == null ? 43 : $thumb80Width.hashCode());
        final Object $thumb80Height = this.getThumb80Height();
        result = result * PRIME + ($thumb80Height == null ? 43 : $thumb80Height.hashCode());
        final Object $thumb160 = this.getThumb160();
        result = result * PRIME + ($thumb160 == null ? 43 : $thumb160.hashCode());
        final Object $thumb160Gif = this.getThumb160Gif();
        result = result * PRIME + ($thumb160Gif == null ? 43 : $thumb160Gif.hashCode());
        final Object $thumb160Width = this.getThumb160Width();
        result = result * PRIME + ($thumb160Width == null ? 43 : $thumb160Width.hashCode());
        final Object $thumb160Height = this.getThumb160Height();
        result = result * PRIME + ($thumb160Height == null ? 43 : $thumb160Height.hashCode());
        final Object $thumb360 = this.getThumb360();
        result = result * PRIME + ($thumb360 == null ? 43 : $thumb360.hashCode());
        final Object $thumb360Gif = this.getThumb360Gif();
        result = result * PRIME + ($thumb360Gif == null ? 43 : $thumb360Gif.hashCode());
        final Object $thumb360Width = this.getThumb360Width();
        result = result * PRIME + ($thumb360Width == null ? 43 : $thumb360Width.hashCode());
        final Object $thumb360Height = this.getThumb360Height();
        result = result * PRIME + ($thumb360Height == null ? 43 : $thumb360Height.hashCode());
        final Object $thumb480 = this.getThumb480();
        result = result * PRIME + ($thumb480 == null ? 43 : $thumb480.hashCode());
        final Object $thumb480Gif = this.getThumb480Gif();
        result = result * PRIME + ($thumb480Gif == null ? 43 : $thumb480Gif.hashCode());
        final Object $thumb480Width = this.getThumb480Width();
        result = result * PRIME + ($thumb480Width == null ? 43 : $thumb480Width.hashCode());
        final Object $thumb480Height = this.getThumb480Height();
        result = result * PRIME + ($thumb480Height == null ? 43 : $thumb480Height.hashCode());
        final Object $thumb720 = this.getThumb720();
        result = result * PRIME + ($thumb720 == null ? 43 : $thumb720.hashCode());
        final Object $thumb720Gif = this.getThumb720Gif();
        result = result * PRIME + ($thumb720Gif == null ? 43 : $thumb720Gif.hashCode());
        final Object $thumb720Width = this.getThumb720Width();
        result = result * PRIME + ($thumb720Width == null ? 43 : $thumb720Width.hashCode());
        final Object $thumb720Height = this.getThumb720Height();
        result = result * PRIME + ($thumb720Height == null ? 43 : $thumb720Height.hashCode());
        final Object $thumb800 = this.getThumb800();
        result = result * PRIME + ($thumb800 == null ? 43 : $thumb800.hashCode());
        final Object $thumb800Gif = this.getThumb800Gif();
        result = result * PRIME + ($thumb800Gif == null ? 43 : $thumb800Gif.hashCode());
        final Object $thumb800Width = this.getThumb800Width();
        result = result * PRIME + ($thumb800Width == null ? 43 : $thumb800Width.hashCode());
        final Object $thumb800Height = this.getThumb800Height();
        result = result * PRIME + ($thumb800Height == null ? 43 : $thumb800Height.hashCode());
        final Object $thumb960 = this.getThumb960();
        result = result * PRIME + ($thumb960 == null ? 43 : $thumb960.hashCode());
        final Object $thumb960Gif = this.getThumb960Gif();
        result = result * PRIME + ($thumb960Gif == null ? 43 : $thumb960Gif.hashCode());
        final Object $thumb960Width = this.getThumb960Width();
        result = result * PRIME + ($thumb960Width == null ? 43 : $thumb960Width.hashCode());
        final Object $thumb960Height = this.getThumb960Height();
        result = result * PRIME + ($thumb960Height == null ? 43 : $thumb960Height.hashCode());
        final Object $thumb1024 = this.getThumb1024();
        result = result * PRIME + ($thumb1024 == null ? 43 : $thumb1024.hashCode());
        final Object $thumb1024Gif = this.getThumb1024Gif();
        result = result * PRIME + ($thumb1024Gif == null ? 43 : $thumb1024Gif.hashCode());
        final Object $thumb1024Width = this.getThumb1024Width();
        result = result * PRIME + ($thumb1024Width == null ? 43 : $thumb1024Width.hashCode());
        final Object $thumb1024Height = this.getThumb1024Height();
        result = result * PRIME + ($thumb1024Height == null ? 43 : $thumb1024Height.hashCode());
        final Object $thumbVideo = this.getThumbVideo();
        result = result * PRIME + ($thumbVideo == null ? 43 : $thumbVideo.hashCode());
        final Object $imageExifRotation = this.getImageExifRotation();
        result = result * PRIME + ($imageExifRotation == null ? 43 : $imageExifRotation.hashCode());
        final Object $originalWidth = this.getOriginalWidth();
        result = result * PRIME + ($originalWidth == null ? 43 : $originalWidth.hashCode());
        final Object $originalHeight = this.getOriginalHeight();
        result = result * PRIME + ($originalHeight == null ? 43 : $originalHeight.hashCode());
        final Object $deanimateGif = this.getDeanimateGif();
        result = result * PRIME + ($deanimateGif == null ? 43 : $deanimateGif.hashCode());
        final Object $pjpeg = this.getPjpeg();
        result = result * PRIME + ($pjpeg == null ? 43 : $pjpeg.hashCode());
        final Object $permalink = this.getPermalink();
        result = result * PRIME + ($permalink == null ? 43 : $permalink.hashCode());
        final Object $permalinkPublic = this.getPermalinkPublic();
        result = result * PRIME + ($permalinkPublic == null ? 43 : $permalinkPublic.hashCode());
        final Object $editLink = this.getEditLink();
        result = result * PRIME + ($editLink == null ? 43 : $editLink.hashCode());
        result = result * PRIME + (this.isHasRichPreview() ? 79 : 97);
        result = result * PRIME + (this.isPreviewTruncated() ? 79 : 97);
        final Object $preview = this.getPreview();
        result = result * PRIME + ($preview == null ? 43 : $preview.hashCode());
        final Object $previewHighlight = this.getPreviewHighlight();
        result = result * PRIME + ($previewHighlight == null ? 43 : $previewHighlight.hashCode());
        final Object $plainText = this.getPlainText();
        result = result * PRIME + ($plainText == null ? 43 : $plainText.hashCode());
        final Object $previewPlainText = this.getPreviewPlainText();
        result = result * PRIME + ($previewPlainText == null ? 43 : $previewPlainText.hashCode());
        result = result * PRIME + (this.isHasMore() ? 79 : 97);
        result = result * PRIME + (this.isSentToSelf() ? 79 : 97);
        final Object $botId = this.getBotId();
        result = result * PRIME + ($botId == null ? 43 : $botId.hashCode());
        final Object $lines = this.getLines();
        result = result * PRIME + ($lines == null ? 43 : $lines.hashCode());
        final Object $linesMore = this.getLinesMore();
        result = result * PRIME + ($linesMore == null ? 43 : $linesMore.hashCode());
        result = result * PRIME + (this.isPublic() ? 79 : 97);
        result = result * PRIME + (this.isPublicUrlShared() ? 79 : 97);
        result = result * PRIME + (this.isDisplayAsBot() ? 79 : 97);
        final Object $channels = this.getChannels();
        result = result * PRIME + ($channels == null ? 43 : $channels.hashCode());
        final Object $groups = this.getGroups();
        result = result * PRIME + ($groups == null ? 43 : $groups.hashCode());
        final Object $ims = this.getIms();
        result = result * PRIME + ($ims == null ? 43 : $ims.hashCode());
        final Object $initialComment = this.getInitialComment();
        result = result * PRIME + ($initialComment == null ? 43 : $initialComment.hashCode());
        final Object $numStars = this.getNumStars();
        result = result * PRIME + ($numStars == null ? 43 : $numStars.hashCode());
        result = result * PRIME + (this.isStarred() ? 79 : 97);
        final Object $pinnedTo = this.getPinnedTo();
        result = result * PRIME + ($pinnedTo == null ? 43 : $pinnedTo.hashCode());
        final Object $reactions = this.getReactions();
        result = result * PRIME + ($reactions == null ? 43 : $reactions.hashCode());
        final Object $commentsCount = this.getCommentsCount();
        result = result * PRIME + ($commentsCount == null ? 43 : $commentsCount.hashCode());
        final Object $attachments = this.getAttachments();
        result = result * PRIME + ($attachments == null ? 43 : $attachments.hashCode());
        final Object $blocks = this.getBlocks();
        result = result * PRIME + ($blocks == null ? 43 : $blocks.hashCode());
        final Object $shares = this.getShares();
        result = result * PRIME + ($shares == null ? 43 : $shares.hashCode());
        final Object $to = this.getTo();
        result = result * PRIME + ($to == null ? 43 : $to.hashCode());
        final Object $from = this.getFrom();
        result = result * PRIME + ($from == null ? 43 : $from.hashCode());
        final Object $cc = this.getCc();
        result = result * PRIME + ($cc == null ? 43 : $cc.hashCode());
        return result;
    }

    public String toString() {
        return "File(id=" + this.getId() + ", created=" + this.getCreated() + ", timestamp=" + this.getTimestamp() + ", name=" + this.getName() + ", title=" + this.getTitle() + ", subject=" + this.getSubject() + ", mimetype=" + this.getMimetype() + ", filetype=" + this.getFiletype() + ", prettyType=" + this.getPrettyType() + ", user=" + this.getUser() + ", mode=" + this.getMode() + ", editable=" + this.isEditable() + ", external=" + this.isExternal() + ", externalType=" + this.getExternalType() + ", username=" + this.getUsername() + ", size=" + this.getSize() + ", urlPrivate=" + this.getUrlPrivate() + ", urlPrivateDownload=" + this.getUrlPrivateDownload() + ", appId=" + this.getAppId() + ", appName=" + this.getAppName() + ", thumb64=" + this.getThumb64() + ", thumb64Gif=" + this.getThumb64Gif() + ", thumb64Width=" + this.getThumb64Width() + ", thumb64Height=" + this.getThumb64Height() + ", thumb80=" + this.getThumb80() + ", thumb80Gif=" + this.getThumb80Gif() + ", thumb80Width=" + this.getThumb80Width() + ", thumb80Height=" + this.getThumb80Height() + ", thumb160=" + this.getThumb160() + ", thumb160Gif=" + this.getThumb160Gif() + ", thumb160Width=" + this.getThumb160Width() + ", thumb160Height=" + this.getThumb160Height() + ", thumb360=" + this.getThumb360() + ", thumb360Gif=" + this.getThumb360Gif() + ", thumb360Width=" + this.getThumb360Width() + ", thumb360Height=" + this.getThumb360Height() + ", thumb480=" + this.getThumb480() + ", thumb480Gif=" + this.getThumb480Gif() + ", thumb480Width=" + this.getThumb480Width() + ", thumb480Height=" + this.getThumb480Height() + ", thumb720=" + this.getThumb720() + ", thumb720Gif=" + this.getThumb720Gif() + ", thumb720Width=" + this.getThumb720Width() + ", thumb720Height=" + this.getThumb720Height() + ", thumb800=" + this.getThumb800() + ", thumb800Gif=" + this.getThumb800Gif() + ", thumb800Width=" + this.getThumb800Width() + ", thumb800Height=" + this.getThumb800Height() + ", thumb960=" + this.getThumb960() + ", thumb960Gif=" + this.getThumb960Gif() + ", thumb960Width=" + this.getThumb960Width() + ", thumb960Height=" + this.getThumb960Height() + ", thumb1024=" + this.getThumb1024() + ", thumb1024Gif=" + this.getThumb1024Gif() + ", thumb1024Width=" + this.getThumb1024Width() + ", thumb1024Height=" + this.getThumb1024Height() + ", thumbVideo=" + this.getThumbVideo() + ", imageExifRotation=" + this.getImageExifRotation() + ", originalWidth=" + this.getOriginalWidth() + ", originalHeight=" + this.getOriginalHeight() + ", deanimateGif=" + this.getDeanimateGif() + ", pjpeg=" + this.getPjpeg() + ", permalink=" + this.getPermalink() + ", permalinkPublic=" + this.getPermalinkPublic() + ", editLink=" + this.getEditLink() + ", hasRichPreview=" + this.isHasRichPreview() + ", previewTruncated=" + this.isPreviewTruncated() + ", preview=" + this.getPreview() + ", previewHighlight=" + this.getPreviewHighlight() + ", plainText=" + this.getPlainText() + ", previewPlainText=" + this.getPreviewPlainText() + ", hasMore=" + this.isHasMore() + ", sentToSelf=" + this.isSentToSelf() + ", botId=" + this.getBotId() + ", lines=" + this.getLines() + ", linesMore=" + this.getLinesMore() + ", _public=" + this.isPublic() + ", publicUrlShared=" + this.isPublicUrlShared() + ", displayAsBot=" + this.isDisplayAsBot() + ", channels=" + this.getChannels() + ", groups=" + this.getGroups() + ", ims=" + this.getIms() + ", initialComment=" + this.getInitialComment() + ", numStars=" + this.getNumStars() + ", starred=" + this.isStarred() + ", pinnedTo=" + this.getPinnedTo() + ", reactions=" + this.getReactions() + ", commentsCount=" + this.getCommentsCount() + ", attachments=" + this.getAttachments() + ", blocks=" + this.getBlocks() + ", shares=" + this.getShares() + ", to=" + this.getTo() + ", from=" + this.getFrom() + ", cc=" + this.getCc() + ")";
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

        public Shares() {
        }

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

        public boolean equals(final Object o) {
            if (o == this) return true;
            if (!(o instanceof Shares)) return false;
            final Shares other = (Shares) o;
            if (!other.canEqual((Object) this)) return false;
            final Object this$publicChannels = this.getPublicChannels();
            final Object other$publicChannels = other.getPublicChannels();
            if (this$publicChannels == null ? other$publicChannels != null : !this$publicChannels.equals(other$publicChannels))
                return false;
            final Object this$privateChannels = this.getPrivateChannels();
            final Object other$privateChannels = other.getPrivateChannels();
            if (this$privateChannels == null ? other$privateChannels != null : !this$privateChannels.equals(other$privateChannels))
                return false;
            return true;
        }

        protected boolean canEqual(final Object other) {
            return other instanceof Shares;
        }

        public int hashCode() {
            final int PRIME = 59;
            int result = 1;
            final Object $publicChannels = this.getPublicChannels();
            result = result * PRIME + ($publicChannels == null ? 43 : $publicChannels.hashCode());
            final Object $privateChannels = this.getPrivateChannels();
            result = result * PRIME + ($privateChannels == null ? 43 : $privateChannels.hashCode());
            return result;
        }

        public String toString() {
            return "File.Shares(publicChannels=" + this.getPublicChannels() + ", privateChannels=" + this.getPrivateChannels() + ")";
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

        public ShareDetail() {
        }

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

        public boolean equals(final Object o) {
            if (o == this) return true;
            if (!(o instanceof ShareDetail)) return false;
            final ShareDetail other = (ShareDetail) o;
            if (!other.canEqual((Object) this)) return false;
            final Object this$replyUsers = this.getReplyUsers();
            final Object other$replyUsers = other.getReplyUsers();
            if (this$replyUsers == null ? other$replyUsers != null : !this$replyUsers.equals(other$replyUsers))
                return false;
            final Object this$replyUsersCount = this.getReplyUsersCount();
            final Object other$replyUsersCount = other.getReplyUsersCount();
            if (this$replyUsersCount == null ? other$replyUsersCount != null : !this$replyUsersCount.equals(other$replyUsersCount))
                return false;
            final Object this$replyCount = this.getReplyCount();
            final Object other$replyCount = other.getReplyCount();
            if (this$replyCount == null ? other$replyCount != null : !this$replyCount.equals(other$replyCount))
                return false;
            final Object this$ts = this.getTs();
            final Object other$ts = other.getTs();
            if (this$ts == null ? other$ts != null : !this$ts.equals(other$ts)) return false;
            final Object this$threadTs = this.getThreadTs();
            final Object other$threadTs = other.getThreadTs();
            if (this$threadTs == null ? other$threadTs != null : !this$threadTs.equals(other$threadTs)) return false;
            final Object this$latestReply = this.getLatestReply();
            final Object other$latestReply = other.getLatestReply();
            if (this$latestReply == null ? other$latestReply != null : !this$latestReply.equals(other$latestReply))
                return false;
            final Object this$channelName = this.getChannelName();
            final Object other$channelName = other.getChannelName();
            if (this$channelName == null ? other$channelName != null : !this$channelName.equals(other$channelName))
                return false;
            final Object this$teamId = this.getTeamId();
            final Object other$teamId = other.getTeamId();
            if (this$teamId == null ? other$teamId != null : !this$teamId.equals(other$teamId)) return false;
            return true;
        }

        protected boolean canEqual(final Object other) {
            return other instanceof ShareDetail;
        }

        public int hashCode() {
            final int PRIME = 59;
            int result = 1;
            final Object $replyUsers = this.getReplyUsers();
            result = result * PRIME + ($replyUsers == null ? 43 : $replyUsers.hashCode());
            final Object $replyUsersCount = this.getReplyUsersCount();
            result = result * PRIME + ($replyUsersCount == null ? 43 : $replyUsersCount.hashCode());
            final Object $replyCount = this.getReplyCount();
            result = result * PRIME + ($replyCount == null ? 43 : $replyCount.hashCode());
            final Object $ts = this.getTs();
            result = result * PRIME + ($ts == null ? 43 : $ts.hashCode());
            final Object $threadTs = this.getThreadTs();
            result = result * PRIME + ($threadTs == null ? 43 : $threadTs.hashCode());
            final Object $latestReply = this.getLatestReply();
            result = result * PRIME + ($latestReply == null ? 43 : $latestReply.hashCode());
            final Object $channelName = this.getChannelName();
            result = result * PRIME + ($channelName == null ? 43 : $channelName.hashCode());
            final Object $teamId = this.getTeamId();
            result = result * PRIME + ($teamId == null ? 43 : $teamId.hashCode());
            return result;
        }

        public String toString() {
            return "File.ShareDetail(replyUsers=" + this.getReplyUsers() + ", replyUsersCount=" + this.getReplyUsersCount() + ", replyCount=" + this.getReplyCount() + ", ts=" + this.getTs() + ", threadTs=" + this.getThreadTs() + ", latestReply=" + this.getLatestReply() + ", channelName=" + this.getChannelName() + ", teamId=" + this.getTeamId() + ")";
        }
    }

    private List<Address> to;
    private List<Address> from;
    private List<Address> cc;

    public static class Address {
        private String address;
        private String name;
        private String original;

        public Address() {
        }

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

        public boolean equals(final Object o) {
            if (o == this) return true;
            if (!(o instanceof Address)) return false;
            final Address other = (Address) o;
            if (!other.canEqual((Object) this)) return false;
            final Object this$address = this.getAddress();
            final Object other$address = other.getAddress();
            if (this$address == null ? other$address != null : !this$address.equals(other$address)) return false;
            final Object this$name = this.getName();
            final Object other$name = other.getName();
            if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
            final Object this$original = this.getOriginal();
            final Object other$original = other.getOriginal();
            if (this$original == null ? other$original != null : !this$original.equals(other$original)) return false;
            return true;
        }

        protected boolean canEqual(final Object other) {
            return other instanceof Address;
        }

        public int hashCode() {
            final int PRIME = 59;
            int result = 1;
            final Object $address = this.getAddress();
            result = result * PRIME + ($address == null ? 43 : $address.hashCode());
            final Object $name = this.getName();
            result = result * PRIME + ($name == null ? 43 : $name.hashCode());
            final Object $original = this.getOriginal();
            result = result * PRIME + ($original == null ? 43 : $original.hashCode());
            return result;
        }

        public String toString() {
            return "File.Address(address=" + this.getAddress() + ", name=" + this.getName() + ", original=" + this.getOriginal() + ")";
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
        private List<Attachment> attachments;
        private List<LayoutBlock> blocks;
        private Shares shares;
        private List<Address> to;
        private List<Address> from;
        private List<Address> cc;

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

        public File build() {
            return new File(id, created, timestamp, name, title, subject, mimetype, filetype, prettyType, user, mode, editable, external, externalType, username, size, urlPrivate, urlPrivateDownload, appId, appName, thumb64, thumb64Gif, thumb64Width, thumb64Height, thumb80, thumb80Gif, thumb80Width, thumb80Height, thumb160, thumb160Gif, thumb160Width, thumb160Height, thumb360, thumb360Gif, thumb360Width, thumb360Height, thumb480, thumb480Gif, thumb480Width, thumb480Height, thumb720, thumb720Gif, thumb720Width, thumb720Height, thumb800, thumb800Gif, thumb800Width, thumb800Height, thumb960, thumb960Gif, thumb960Width, thumb960Height, thumb1024, thumb1024Gif, thumb1024Width, thumb1024Height, thumbVideo, imageExifRotation, originalWidth, originalHeight, deanimateGif, pjpeg, permalink, permalinkPublic, editLink, hasRichPreview, previewTruncated, preview, previewHighlight, plainText, previewPlainText, hasMore, sentToSelf, botId, lines, linesMore, _public, publicUrlShared, displayAsBot, channels, groups, ims, initialComment, numStars, starred, pinnedTo, reactions, commentsCount, attachments, blocks, shares, to, from, cc);
        }

        public String toString() {
            return "File.FileBuilder(id=" + this.id + ", created=" + this.created + ", timestamp=" + this.timestamp + ", name=" + this.name + ", title=" + this.title + ", subject=" + this.subject + ", mimetype=" + this.mimetype + ", filetype=" + this.filetype + ", prettyType=" + this.prettyType + ", user=" + this.user + ", mode=" + this.mode + ", editable=" + this.editable + ", external=" + this.external + ", externalType=" + this.externalType + ", username=" + this.username + ", size=" + this.size + ", urlPrivate=" + this.urlPrivate + ", urlPrivateDownload=" + this.urlPrivateDownload + ", appId=" + this.appId + ", appName=" + this.appName + ", thumb64=" + this.thumb64 + ", thumb64Gif=" + this.thumb64Gif + ", thumb64Width=" + this.thumb64Width + ", thumb64Height=" + this.thumb64Height + ", thumb80=" + this.thumb80 + ", thumb80Gif=" + this.thumb80Gif + ", thumb80Width=" + this.thumb80Width + ", thumb80Height=" + this.thumb80Height + ", thumb160=" + this.thumb160 + ", thumb160Gif=" + this.thumb160Gif + ", thumb160Width=" + this.thumb160Width + ", thumb160Height=" + this.thumb160Height + ", thumb360=" + this.thumb360 + ", thumb360Gif=" + this.thumb360Gif + ", thumb360Width=" + this.thumb360Width + ", thumb360Height=" + this.thumb360Height + ", thumb480=" + this.thumb480 + ", thumb480Gif=" + this.thumb480Gif + ", thumb480Width=" + this.thumb480Width + ", thumb480Height=" + this.thumb480Height + ", thumb720=" + this.thumb720 + ", thumb720Gif=" + this.thumb720Gif + ", thumb720Width=" + this.thumb720Width + ", thumb720Height=" + this.thumb720Height + ", thumb800=" + this.thumb800 + ", thumb800Gif=" + this.thumb800Gif + ", thumb800Width=" + this.thumb800Width + ", thumb800Height=" + this.thumb800Height + ", thumb960=" + this.thumb960 + ", thumb960Gif=" + this.thumb960Gif + ", thumb960Width=" + this.thumb960Width + ", thumb960Height=" + this.thumb960Height + ", thumb1024=" + this.thumb1024 + ", thumb1024Gif=" + this.thumb1024Gif + ", thumb1024Width=" + this.thumb1024Width + ", thumb1024Height=" + this.thumb1024Height + ", thumbVideo=" + this.thumbVideo + ", imageExifRotation=" + this.imageExifRotation + ", originalWidth=" + this.originalWidth + ", originalHeight=" + this.originalHeight + ", deanimateGif=" + this.deanimateGif + ", pjpeg=" + this.pjpeg + ", permalink=" + this.permalink + ", permalinkPublic=" + this.permalinkPublic + ", editLink=" + this.editLink + ", hasRichPreview=" + this.hasRichPreview + ", previewTruncated=" + this.previewTruncated + ", preview=" + this.preview + ", previewHighlight=" + this.previewHighlight + ", plainText=" + this.plainText + ", previewPlainText=" + this.previewPlainText + ", hasMore=" + this.hasMore + ", sentToSelf=" + this.sentToSelf + ", botId=" + this.botId + ", lines=" + this.lines + ", linesMore=" + this.linesMore + ", _public=" + this._public + ", publicUrlShared=" + this.publicUrlShared + ", displayAsBot=" + this.displayAsBot + ", channels=" + this.channels + ", groups=" + this.groups + ", ims=" + this.ims + ", initialComment=" + this.initialComment + ", numStars=" + this.numStars + ", starred=" + this.starred + ", pinnedTo=" + this.pinnedTo + ", reactions=" + this.reactions + ", commentsCount=" + this.commentsCount + ", attachments=" + this.attachments + ", blocks=" + this.blocks + ", shares=" + this.shares + ", to=" + this.to + ", from=" + this.from + ", cc=" + this.cc + ")";
        }
    }
}