package com.github.seratch.jslack.api.model;

import com.github.seratch.jslack.api.model.block.LayoutBlock;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MatchedItem {

    private String iid;
    private String id;
    private String team;
    private String type;
    private Channel channel;
    private String user;
    private String username;
    private String ts;
    private String title;
    private String text;
    private List<Attachment> attachments;
    private List<LayoutBlock> blocks;
    private String permalink;
    private String name;
    private String subject;
    private String preview;

    private String plainText;
    private String previewPlainText;

    private boolean hasMore;
    private boolean sentToSelf;

    private String botId;

    private String externalId;
    private String externalUrl;

    private String timestamp;
    private String created;

    @SerializedName("is_intro")
    private boolean intro;

    @SerializedName("is_public")
    private boolean _public;

    public MatchedItem() {
    }

    public boolean isPublic() {
        return _public;
    }

    public void setPublic(boolean isPublic) {
        this._public = isPublic;
    }

    private boolean publicUrlShared;

    private String urlPrivate;
    private boolean urlPrivateDownload;

    private boolean permalinkPublic;

    private String editLink;
    private String previewHighlight;

    private Integer lines;
    private Integer linesMore;
    @SerializedName("preview_is_truncated")
    private boolean previewTruncated;
    private boolean hasRichPreview;

    private String mimetype;
    private String filetype;
    private String prettyType;
    @SerializedName("is_external")
    private boolean external;
    @SerializedName("is_starred")
    private boolean starred;
    private String externalType;
    private boolean editable;
    private boolean displayAsBot;
    private Integer size;
    private String mode;
    private String comment;

    @SerializedName("previous_2")
    private OtherItem previous2;
    private OtherItem previous;
    private OtherItem next;
    @SerializedName("next_2")
    private OtherItem next2;

    private File.Shares shares;
    private List<String> channels;
    private List<String> groups;
    private List<String> ims;

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

    private Integer imageExifRotation;

    @SerializedName("original_w")
    private String originalWidth;
    @SerializedName("original_h")
    private String originalHeight;

    private String score;
    private boolean topFile;

    public String getIid() {
        return this.iid;
    }

    public String getId() {
        return this.id;
    }

    public String getTeam() {
        return this.team;
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

    public String getTitle() {
        return this.title;
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

    public String getPermalink() {
        return this.permalink;
    }

    public String getName() {
        return this.name;
    }

    public String getSubject() {
        return this.subject;
    }

    public String getPreview() {
        return this.preview;
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

    public String getExternalId() {
        return this.externalId;
    }

    public String getExternalUrl() {
        return this.externalUrl;
    }

    public String getTimestamp() {
        return this.timestamp;
    }

    public String getCreated() {
        return this.created;
    }

    public boolean isIntro() {
        return this.intro;
    }

    public boolean is_public() {
        return this._public;
    }

    public boolean isPublicUrlShared() {
        return this.publicUrlShared;
    }

    public String getUrlPrivate() {
        return this.urlPrivate;
    }

    public boolean isUrlPrivateDownload() {
        return this.urlPrivateDownload;
    }

    public boolean isPermalinkPublic() {
        return this.permalinkPublic;
    }

    public String getEditLink() {
        return this.editLink;
    }

    public String getPreviewHighlight() {
        return this.previewHighlight;
    }

    public Integer getLines() {
        return this.lines;
    }

    public Integer getLinesMore() {
        return this.linesMore;
    }

    public boolean isPreviewTruncated() {
        return this.previewTruncated;
    }

    public boolean isHasRichPreview() {
        return this.hasRichPreview;
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

    public boolean isExternal() {
        return this.external;
    }

    public boolean isStarred() {
        return this.starred;
    }

    public String getExternalType() {
        return this.externalType;
    }

    public boolean isEditable() {
        return this.editable;
    }

    public boolean isDisplayAsBot() {
        return this.displayAsBot;
    }

    public Integer getSize() {
        return this.size;
    }

    public String getMode() {
        return this.mode;
    }

    public String getComment() {
        return this.comment;
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

    public File.Shares getShares() {
        return this.shares;
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

    public Integer getImageExifRotation() {
        return this.imageExifRotation;
    }

    public String getOriginalWidth() {
        return this.originalWidth;
    }

    public String getOriginalHeight() {
        return this.originalHeight;
    }

    public String getScore() {
        return this.score;
    }

    public boolean isTopFile() {
        return this.topFile;
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

    public void setIid(String iid) {
        this.iid = iid;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setTeam(String team) {
        this.team = team;
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

    public void setTitle(String title) {
        this.title = title;
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

    public void setPermalink(String permalink) {
        this.permalink = permalink;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setPreview(String preview) {
        this.preview = preview;
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

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    public void setExternalUrl(String externalUrl) {
        this.externalUrl = externalUrl;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public void setIntro(boolean intro) {
        this.intro = intro;
    }

    public void set_public(boolean _public) {
        this._public = _public;
    }

    public void setPublicUrlShared(boolean publicUrlShared) {
        this.publicUrlShared = publicUrlShared;
    }

    public void setUrlPrivate(String urlPrivate) {
        this.urlPrivate = urlPrivate;
    }

    public void setUrlPrivateDownload(boolean urlPrivateDownload) {
        this.urlPrivateDownload = urlPrivateDownload;
    }

    public void setPermalinkPublic(boolean permalinkPublic) {
        this.permalinkPublic = permalinkPublic;
    }

    public void setEditLink(String editLink) {
        this.editLink = editLink;
    }

    public void setPreviewHighlight(String previewHighlight) {
        this.previewHighlight = previewHighlight;
    }

    public void setLines(Integer lines) {
        this.lines = lines;
    }

    public void setLinesMore(Integer linesMore) {
        this.linesMore = linesMore;
    }

    public void setPreviewTruncated(boolean previewTruncated) {
        this.previewTruncated = previewTruncated;
    }

    public void setHasRichPreview(boolean hasRichPreview) {
        this.hasRichPreview = hasRichPreview;
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

    public void setExternal(boolean external) {
        this.external = external;
    }

    public void setStarred(boolean starred) {
        this.starred = starred;
    }

    public void setExternalType(String externalType) {
        this.externalType = externalType;
    }

    public void setEditable(boolean editable) {
        this.editable = editable;
    }

    public void setDisplayAsBot(boolean displayAsBot) {
        this.displayAsBot = displayAsBot;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public void setComment(String comment) {
        this.comment = comment;
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

    public void setShares(File.Shares shares) {
        this.shares = shares;
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

    public void setImageExifRotation(Integer imageExifRotation) {
        this.imageExifRotation = imageExifRotation;
    }

    public void setOriginalWidth(String originalWidth) {
        this.originalWidth = originalWidth;
    }

    public void setOriginalHeight(String originalHeight) {
        this.originalHeight = originalHeight;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public void setTopFile(boolean topFile) {
        this.topFile = topFile;
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
        if (!(o instanceof MatchedItem)) return false;
        final MatchedItem other = (MatchedItem) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$iid = this.getIid();
        final Object other$iid = other.getIid();
        if (this$iid == null ? other$iid != null : !this$iid.equals(other$iid)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final Object this$team = this.getTeam();
        final Object other$team = other.getTeam();
        if (this$team == null ? other$team != null : !this$team.equals(other$team)) return false;
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
        final Object this$title = this.getTitle();
        final Object other$title = other.getTitle();
        if (this$title == null ? other$title != null : !this$title.equals(other$title)) return false;
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
        final Object this$permalink = this.getPermalink();
        final Object other$permalink = other.getPermalink();
        if (this$permalink == null ? other$permalink != null : !this$permalink.equals(other$permalink)) return false;
        final Object this$name = this.getName();
        final Object other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
        final Object this$subject = this.getSubject();
        final Object other$subject = other.getSubject();
        if (this$subject == null ? other$subject != null : !this$subject.equals(other$subject)) return false;
        final Object this$preview = this.getPreview();
        final Object other$preview = other.getPreview();
        if (this$preview == null ? other$preview != null : !this$preview.equals(other$preview)) return false;
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
        final Object this$externalId = this.getExternalId();
        final Object other$externalId = other.getExternalId();
        if (this$externalId == null ? other$externalId != null : !this$externalId.equals(other$externalId))
            return false;
        final Object this$externalUrl = this.getExternalUrl();
        final Object other$externalUrl = other.getExternalUrl();
        if (this$externalUrl == null ? other$externalUrl != null : !this$externalUrl.equals(other$externalUrl))
            return false;
        final Object this$timestamp = this.getTimestamp();
        final Object other$timestamp = other.getTimestamp();
        if (this$timestamp == null ? other$timestamp != null : !this$timestamp.equals(other$timestamp)) return false;
        final Object this$created = this.getCreated();
        final Object other$created = other.getCreated();
        if (this$created == null ? other$created != null : !this$created.equals(other$created)) return false;
        if (this.isIntro() != other.isIntro()) return false;
        if (this.is_public() != other.is_public()) return false;
        if (this.isPublicUrlShared() != other.isPublicUrlShared()) return false;
        final Object this$urlPrivate = this.getUrlPrivate();
        final Object other$urlPrivate = other.getUrlPrivate();
        if (this$urlPrivate == null ? other$urlPrivate != null : !this$urlPrivate.equals(other$urlPrivate))
            return false;
        if (this.isUrlPrivateDownload() != other.isUrlPrivateDownload()) return false;
        if (this.isPermalinkPublic() != other.isPermalinkPublic()) return false;
        final Object this$editLink = this.getEditLink();
        final Object other$editLink = other.getEditLink();
        if (this$editLink == null ? other$editLink != null : !this$editLink.equals(other$editLink)) return false;
        final Object this$previewHighlight = this.getPreviewHighlight();
        final Object other$previewHighlight = other.getPreviewHighlight();
        if (this$previewHighlight == null ? other$previewHighlight != null : !this$previewHighlight.equals(other$previewHighlight))
            return false;
        final Object this$lines = this.getLines();
        final Object other$lines = other.getLines();
        if (this$lines == null ? other$lines != null : !this$lines.equals(other$lines)) return false;
        final Object this$linesMore = this.getLinesMore();
        final Object other$linesMore = other.getLinesMore();
        if (this$linesMore == null ? other$linesMore != null : !this$linesMore.equals(other$linesMore)) return false;
        if (this.isPreviewTruncated() != other.isPreviewTruncated()) return false;
        if (this.isHasRichPreview() != other.isHasRichPreview()) return false;
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
        if (this.isExternal() != other.isExternal()) return false;
        if (this.isStarred() != other.isStarred()) return false;
        final Object this$externalType = this.getExternalType();
        final Object other$externalType = other.getExternalType();
        if (this$externalType == null ? other$externalType != null : !this$externalType.equals(other$externalType))
            return false;
        if (this.isEditable() != other.isEditable()) return false;
        if (this.isDisplayAsBot() != other.isDisplayAsBot()) return false;
        final Object this$size = this.getSize();
        final Object other$size = other.getSize();
        if (this$size == null ? other$size != null : !this$size.equals(other$size)) return false;
        final Object this$mode = this.getMode();
        final Object other$mode = other.getMode();
        if (this$mode == null ? other$mode != null : !this$mode.equals(other$mode)) return false;
        final Object this$comment = this.getComment();
        final Object other$comment = other.getComment();
        if (this$comment == null ? other$comment != null : !this$comment.equals(other$comment)) return false;
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
        final Object this$shares = this.getShares();
        final Object other$shares = other.getShares();
        if (this$shares == null ? other$shares != null : !this$shares.equals(other$shares)) return false;
        final Object this$channels = this.getChannels();
        final Object other$channels = other.getChannels();
        if (this$channels == null ? other$channels != null : !this$channels.equals(other$channels)) return false;
        final Object this$groups = this.getGroups();
        final Object other$groups = other.getGroups();
        if (this$groups == null ? other$groups != null : !this$groups.equals(other$groups)) return false;
        final Object this$ims = this.getIms();
        final Object other$ims = other.getIms();
        if (this$ims == null ? other$ims != null : !this$ims.equals(other$ims)) return false;
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
        final Object this$score = this.getScore();
        final Object other$score = other.getScore();
        if (this$score == null ? other$score != null : !this$score.equals(other$score)) return false;
        if (this.isTopFile() != other.isTopFile()) return false;
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
        return other instanceof MatchedItem;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $iid = this.getIid();
        result = result * PRIME + ($iid == null ? 43 : $iid.hashCode());
        final Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final Object $team = this.getTeam();
        result = result * PRIME + ($team == null ? 43 : $team.hashCode());
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
        final Object $title = this.getTitle();
        result = result * PRIME + ($title == null ? 43 : $title.hashCode());
        final Object $text = this.getText();
        result = result * PRIME + ($text == null ? 43 : $text.hashCode());
        final Object $attachments = this.getAttachments();
        result = result * PRIME + ($attachments == null ? 43 : $attachments.hashCode());
        final Object $blocks = this.getBlocks();
        result = result * PRIME + ($blocks == null ? 43 : $blocks.hashCode());
        final Object $permalink = this.getPermalink();
        result = result * PRIME + ($permalink == null ? 43 : $permalink.hashCode());
        final Object $name = this.getName();
        result = result * PRIME + ($name == null ? 43 : $name.hashCode());
        final Object $subject = this.getSubject();
        result = result * PRIME + ($subject == null ? 43 : $subject.hashCode());
        final Object $preview = this.getPreview();
        result = result * PRIME + ($preview == null ? 43 : $preview.hashCode());
        final Object $plainText = this.getPlainText();
        result = result * PRIME + ($plainText == null ? 43 : $plainText.hashCode());
        final Object $previewPlainText = this.getPreviewPlainText();
        result = result * PRIME + ($previewPlainText == null ? 43 : $previewPlainText.hashCode());
        result = result * PRIME + (this.isHasMore() ? 79 : 97);
        result = result * PRIME + (this.isSentToSelf() ? 79 : 97);
        final Object $botId = this.getBotId();
        result = result * PRIME + ($botId == null ? 43 : $botId.hashCode());
        final Object $externalId = this.getExternalId();
        result = result * PRIME + ($externalId == null ? 43 : $externalId.hashCode());
        final Object $externalUrl = this.getExternalUrl();
        result = result * PRIME + ($externalUrl == null ? 43 : $externalUrl.hashCode());
        final Object $timestamp = this.getTimestamp();
        result = result * PRIME + ($timestamp == null ? 43 : $timestamp.hashCode());
        final Object $created = this.getCreated();
        result = result * PRIME + ($created == null ? 43 : $created.hashCode());
        result = result * PRIME + (this.isIntro() ? 79 : 97);
        result = result * PRIME + (this.is_public() ? 79 : 97);
        result = result * PRIME + (this.isPublicUrlShared() ? 79 : 97);
        final Object $urlPrivate = this.getUrlPrivate();
        result = result * PRIME + ($urlPrivate == null ? 43 : $urlPrivate.hashCode());
        result = result * PRIME + (this.isUrlPrivateDownload() ? 79 : 97);
        result = result * PRIME + (this.isPermalinkPublic() ? 79 : 97);
        final Object $editLink = this.getEditLink();
        result = result * PRIME + ($editLink == null ? 43 : $editLink.hashCode());
        final Object $previewHighlight = this.getPreviewHighlight();
        result = result * PRIME + ($previewHighlight == null ? 43 : $previewHighlight.hashCode());
        final Object $lines = this.getLines();
        result = result * PRIME + ($lines == null ? 43 : $lines.hashCode());
        final Object $linesMore = this.getLinesMore();
        result = result * PRIME + ($linesMore == null ? 43 : $linesMore.hashCode());
        result = result * PRIME + (this.isPreviewTruncated() ? 79 : 97);
        result = result * PRIME + (this.isHasRichPreview() ? 79 : 97);
        final Object $mimetype = this.getMimetype();
        result = result * PRIME + ($mimetype == null ? 43 : $mimetype.hashCode());
        final Object $filetype = this.getFiletype();
        result = result * PRIME + ($filetype == null ? 43 : $filetype.hashCode());
        final Object $prettyType = this.getPrettyType();
        result = result * PRIME + ($prettyType == null ? 43 : $prettyType.hashCode());
        result = result * PRIME + (this.isExternal() ? 79 : 97);
        result = result * PRIME + (this.isStarred() ? 79 : 97);
        final Object $externalType = this.getExternalType();
        result = result * PRIME + ($externalType == null ? 43 : $externalType.hashCode());
        result = result * PRIME + (this.isEditable() ? 79 : 97);
        result = result * PRIME + (this.isDisplayAsBot() ? 79 : 97);
        final Object $size = this.getSize();
        result = result * PRIME + ($size == null ? 43 : $size.hashCode());
        final Object $mode = this.getMode();
        result = result * PRIME + ($mode == null ? 43 : $mode.hashCode());
        final Object $comment = this.getComment();
        result = result * PRIME + ($comment == null ? 43 : $comment.hashCode());
        final Object $previous2 = this.getPrevious2();
        result = result * PRIME + ($previous2 == null ? 43 : $previous2.hashCode());
        final Object $previous = this.getPrevious();
        result = result * PRIME + ($previous == null ? 43 : $previous.hashCode());
        final Object $next = this.getNext();
        result = result * PRIME + ($next == null ? 43 : $next.hashCode());
        final Object $next2 = this.getNext2();
        result = result * PRIME + ($next2 == null ? 43 : $next2.hashCode());
        final Object $shares = this.getShares();
        result = result * PRIME + ($shares == null ? 43 : $shares.hashCode());
        final Object $channels = this.getChannels();
        result = result * PRIME + ($channels == null ? 43 : $channels.hashCode());
        final Object $groups = this.getGroups();
        result = result * PRIME + ($groups == null ? 43 : $groups.hashCode());
        final Object $ims = this.getIms();
        result = result * PRIME + ($ims == null ? 43 : $ims.hashCode());
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
        final Object $imageExifRotation = this.getImageExifRotation();
        result = result * PRIME + ($imageExifRotation == null ? 43 : $imageExifRotation.hashCode());
        final Object $originalWidth = this.getOriginalWidth();
        result = result * PRIME + ($originalWidth == null ? 43 : $originalWidth.hashCode());
        final Object $originalHeight = this.getOriginalHeight();
        result = result * PRIME + ($originalHeight == null ? 43 : $originalHeight.hashCode());
        final Object $score = this.getScore();
        result = result * PRIME + ($score == null ? 43 : $score.hashCode());
        result = result * PRIME + (this.isTopFile() ? 79 : 97);
        final Object $to = this.getTo();
        result = result * PRIME + ($to == null ? 43 : $to.hashCode());
        final Object $from = this.getFrom();
        result = result * PRIME + ($from == null ? 43 : $from.hashCode());
        final Object $cc = this.getCc();
        result = result * PRIME + ($cc == null ? 43 : $cc.hashCode());
        return result;
    }

    public String toString() {
        return "MatchedItem(iid=" + this.getIid() + ", id=" + this.getId() + ", team=" + this.getTeam() + ", type=" + this.getType() + ", channel=" + this.getChannel() + ", user=" + this.getUser() + ", username=" + this.getUsername() + ", ts=" + this.getTs() + ", title=" + this.getTitle() + ", text=" + this.getText() + ", attachments=" + this.getAttachments() + ", blocks=" + this.getBlocks() + ", permalink=" + this.getPermalink() + ", name=" + this.getName() + ", subject=" + this.getSubject() + ", preview=" + this.getPreview() + ", plainText=" + this.getPlainText() + ", previewPlainText=" + this.getPreviewPlainText() + ", hasMore=" + this.isHasMore() + ", sentToSelf=" + this.isSentToSelf() + ", botId=" + this.getBotId() + ", externalId=" + this.getExternalId() + ", externalUrl=" + this.getExternalUrl() + ", timestamp=" + this.getTimestamp() + ", created=" + this.getCreated() + ", intro=" + this.isIntro() + ", _public=" + this.is_public() + ", publicUrlShared=" + this.isPublicUrlShared() + ", urlPrivate=" + this.getUrlPrivate() + ", urlPrivateDownload=" + this.isUrlPrivateDownload() + ", permalinkPublic=" + this.isPermalinkPublic() + ", editLink=" + this.getEditLink() + ", previewHighlight=" + this.getPreviewHighlight() + ", lines=" + this.getLines() + ", linesMore=" + this.getLinesMore() + ", previewTruncated=" + this.isPreviewTruncated() + ", hasRichPreview=" + this.isHasRichPreview() + ", mimetype=" + this.getMimetype() + ", filetype=" + this.getFiletype() + ", prettyType=" + this.getPrettyType() + ", external=" + this.isExternal() + ", starred=" + this.isStarred() + ", externalType=" + this.getExternalType() + ", editable=" + this.isEditable() + ", displayAsBot=" + this.isDisplayAsBot() + ", size=" + this.getSize() + ", mode=" + this.getMode() + ", comment=" + this.getComment() + ", previous2=" + this.getPrevious2() + ", previous=" + this.getPrevious() + ", next=" + this.getNext() + ", next2=" + this.getNext2() + ", shares=" + this.getShares() + ", channels=" + this.getChannels() + ", groups=" + this.getGroups() + ", ims=" + this.getIms() + ", thumb64=" + this.getThumb64() + ", thumb64Gif=" + this.getThumb64Gif() + ", thumb64Width=" + this.getThumb64Width() + ", thumb64Height=" + this.getThumb64Height() + ", thumb80=" + this.getThumb80() + ", thumb80Gif=" + this.getThumb80Gif() + ", thumb80Width=" + this.getThumb80Width() + ", thumb80Height=" + this.getThumb80Height() + ", thumb160=" + this.getThumb160() + ", thumb160Gif=" + this.getThumb160Gif() + ", thumb160Width=" + this.getThumb160Width() + ", thumb160Height=" + this.getThumb160Height() + ", thumb360=" + this.getThumb360() + ", thumb360Gif=" + this.getThumb360Gif() + ", thumb360Width=" + this.getThumb360Width() + ", thumb360Height=" + this.getThumb360Height() + ", thumb480=" + this.getThumb480() + ", thumb480Gif=" + this.getThumb480Gif() + ", thumb480Width=" + this.getThumb480Width() + ", thumb480Height=" + this.getThumb480Height() + ", thumb720=" + this.getThumb720() + ", thumb720Gif=" + this.getThumb720Gif() + ", thumb720Width=" + this.getThumb720Width() + ", thumb720Height=" + this.getThumb720Height() + ", thumb800=" + this.getThumb800() + ", thumb800Gif=" + this.getThumb800Gif() + ", thumb800Width=" + this.getThumb800Width() + ", thumb800Height=" + this.getThumb800Height() + ", thumb960=" + this.getThumb960() + ", thumb960Gif=" + this.getThumb960Gif() + ", thumb960Width=" + this.getThumb960Width() + ", thumb960Height=" + this.getThumb960Height() + ", thumb1024=" + this.getThumb1024() + ", thumb1024Gif=" + this.getThumb1024Gif() + ", thumb1024Width=" + this.getThumb1024Width() + ", thumb1024Height=" + this.getThumb1024Height() + ", imageExifRotation=" + this.getImageExifRotation() + ", originalWidth=" + this.getOriginalWidth() + ", originalHeight=" + this.getOriginalHeight() + ", score=" + this.getScore() + ", topFile=" + this.isTopFile() + ", to=" + this.getTo() + ", from=" + this.getFrom() + ", cc=" + this.getCc() + ")";
    }

    public static class OtherItem {
        private String iid;
        private String type;
        private String user;
        private String username;
        private String ts;
        private String text;
        private List<Attachment> attachments;
        private List<LayoutBlock> blocks;
        private String permalink;

        public OtherItem() {
        }

        public String getIid() {
            return this.iid;
        }

        public String getType() {
            return this.type;
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

        public List<Attachment> getAttachments() {
            return this.attachments;
        }

        public List<LayoutBlock> getBlocks() {
            return this.blocks;
        }

        public String getPermalink() {
            return this.permalink;
        }

        public void setIid(String iid) {
            this.iid = iid;
        }

        public void setType(String type) {
            this.type = type;
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

        public void setAttachments(List<Attachment> attachments) {
            this.attachments = attachments;
        }

        public void setBlocks(List<LayoutBlock> blocks) {
            this.blocks = blocks;
        }

        public void setPermalink(String permalink) {
            this.permalink = permalink;
        }

        public boolean equals(final Object o) {
            if (o == this) return true;
            if (!(o instanceof OtherItem)) return false;
            final OtherItem other = (OtherItem) o;
            if (!other.canEqual((Object) this)) return false;
            final Object this$iid = this.getIid();
            final Object other$iid = other.getIid();
            if (this$iid == null ? other$iid != null : !this$iid.equals(other$iid)) return false;
            final Object this$type = this.getType();
            final Object other$type = other.getType();
            if (this$type == null ? other$type != null : !this$type.equals(other$type)) return false;
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
            final Object this$attachments = this.getAttachments();
            final Object other$attachments = other.getAttachments();
            if (this$attachments == null ? other$attachments != null : !this$attachments.equals(other$attachments))
                return false;
            final Object this$blocks = this.getBlocks();
            final Object other$blocks = other.getBlocks();
            if (this$blocks == null ? other$blocks != null : !this$blocks.equals(other$blocks)) return false;
            final Object this$permalink = this.getPermalink();
            final Object other$permalink = other.getPermalink();
            if (this$permalink == null ? other$permalink != null : !this$permalink.equals(other$permalink))
                return false;
            return true;
        }

        protected boolean canEqual(final Object other) {
            return other instanceof OtherItem;
        }

        public int hashCode() {
            final int PRIME = 59;
            int result = 1;
            final Object $iid = this.getIid();
            result = result * PRIME + ($iid == null ? 43 : $iid.hashCode());
            final Object $type = this.getType();
            result = result * PRIME + ($type == null ? 43 : $type.hashCode());
            final Object $user = this.getUser();
            result = result * PRIME + ($user == null ? 43 : $user.hashCode());
            final Object $username = this.getUsername();
            result = result * PRIME + ($username == null ? 43 : $username.hashCode());
            final Object $ts = this.getTs();
            result = result * PRIME + ($ts == null ? 43 : $ts.hashCode());
            final Object $text = this.getText();
            result = result * PRIME + ($text == null ? 43 : $text.hashCode());
            final Object $attachments = this.getAttachments();
            result = result * PRIME + ($attachments == null ? 43 : $attachments.hashCode());
            final Object $blocks = this.getBlocks();
            result = result * PRIME + ($blocks == null ? 43 : $blocks.hashCode());
            final Object $permalink = this.getPermalink();
            result = result * PRIME + ($permalink == null ? 43 : $permalink.hashCode());
            return result;
        }

        public String toString() {
            return "MatchedItem.OtherItem(iid=" + this.getIid() + ", type=" + this.getType() + ", user=" + this.getUser() + ", username=" + this.getUsername() + ", ts=" + this.getTs() + ", text=" + this.getText() + ", attachments=" + this.getAttachments() + ", blocks=" + this.getBlocks() + ", permalink=" + this.getPermalink() + ")";
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
            return "MatchedItem.Address(address=" + this.getAddress() + ", name=" + this.getName() + ", original=" + this.getOriginal() + ")";
        }
    }

}
