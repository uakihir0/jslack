package com.github.seratch.jslack.api.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * https://api.slack.com/types/file
 */
public class File {

    private String id;
    private Integer created;
    private Integer timestamp;
    private String name;
    private String title;
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

    @SerializedName("thumb_64")
    private String thumb64;
    @SerializedName("thumb_80")
    private String thumb80;

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
    @SerializedName("thumb_480_w")
    private String thumb480Width;
    @SerializedName("thumb_480_h")
    private String thumb480Height;

    @SerializedName("thumb_160")
    private String thumb160;

    private String permalink;
    private String permalinkPublic;

    private String editLink;

    private String preview;
    private String previewHighlight;

    private Integer lines;
    private Integer linesMoe;

    @SerializedName("is_public")
    private boolean _public;

    File(String id, Integer created, Integer timestamp, String name, String title, String mimetype, String filetype, String prettyType, String user, String mode, boolean editable, boolean external, String externalType, String username, Integer size, String urlPrivate, String urlPrivateDownload, String thumb64, String thumb80, String thumb360, String thumb360Gif, String thumb360Width, String thumb360Height, String thumb480, String thumb480Width, String thumb480Height, String thumb160, String permalink, String permalinkPublic, String editLink, String preview, String previewHighlight, Integer lines, Integer linesMoe, boolean _public, boolean publicUrlShared, boolean displayAsBot, List<String> channels, List<String> groups, List<String> ims, FileComment initialComment, Integer numStars, boolean starred, List<String> pinnedTo, List<Reaction> reactions, Integer commentsCount) {
        this.id = id;
        this.created = created;
        this.timestamp = timestamp;
        this.name = name;
        this.title = title;
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
        this.thumb64 = thumb64;
        this.thumb80 = thumb80;
        this.thumb360 = thumb360;
        this.thumb360Gif = thumb360Gif;
        this.thumb360Width = thumb360Width;
        this.thumb360Height = thumb360Height;
        this.thumb480 = thumb480;
        this.thumb480Width = thumb480Width;
        this.thumb480Height = thumb480Height;
        this.thumb160 = thumb160;
        this.permalink = permalink;
        this.permalinkPublic = permalinkPublic;
        this.editLink = editLink;
        this.preview = preview;
        this.previewHighlight = previewHighlight;
        this.lines = lines;
        this.linesMoe = linesMoe;
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

    public String getThumb64() {
        return this.thumb64;
    }

    public String getThumb80() {
        return this.thumb80;
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

    public String getThumb480Width() {
        return this.thumb480Width;
    }

    public String getThumb480Height() {
        return this.thumb480Height;
    }

    public String getThumb160() {
        return this.thumb160;
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

    public String getPreview() {
        return this.preview;
    }

    public String getPreviewHighlight() {
        return this.previewHighlight;
    }

    public Integer getLines() {
        return this.lines;
    }

    public Integer getLinesMoe() {
        return this.linesMoe;
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

    public void setThumb64(String thumb64) {
        this.thumb64 = thumb64;
    }

    public void setThumb80(String thumb80) {
        this.thumb80 = thumb80;
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

    public void setThumb480Width(String thumb480Width) {
        this.thumb480Width = thumb480Width;
    }

    public void setThumb480Height(String thumb480Height) {
        this.thumb480Height = thumb480Height;
    }

    public void setThumb160(String thumb160) {
        this.thumb160 = thumb160;
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

    public void setPreview(String preview) {
        this.preview = preview;
    }

    public void setPreviewHighlight(String previewHighlight) {
        this.previewHighlight = previewHighlight;
    }

    public void setLines(Integer lines) {
        this.lines = lines;
    }

    public void setLinesMoe(Integer linesMoe) {
        this.linesMoe = linesMoe;
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

    public boolean equals(Object o) {
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
        final Object this$thumb64 = this.getThumb64();
        final Object other$thumb64 = other.getThumb64();
        if (this$thumb64 == null ? other$thumb64 != null : !this$thumb64.equals(other$thumb64)) return false;
        final Object this$thumb80 = this.getThumb80();
        final Object other$thumb80 = other.getThumb80();
        if (this$thumb80 == null ? other$thumb80 != null : !this$thumb80.equals(other$thumb80)) return false;
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
        final Object this$thumb480Width = this.getThumb480Width();
        final Object other$thumb480Width = other.getThumb480Width();
        if (this$thumb480Width == null ? other$thumb480Width != null : !this$thumb480Width.equals(other$thumb480Width))
            return false;
        final Object this$thumb480Height = this.getThumb480Height();
        final Object other$thumb480Height = other.getThumb480Height();
        if (this$thumb480Height == null ? other$thumb480Height != null : !this$thumb480Height.equals(other$thumb480Height))
            return false;
        final Object this$thumb160 = this.getThumb160();
        final Object other$thumb160 = other.getThumb160();
        if (this$thumb160 == null ? other$thumb160 != null : !this$thumb160.equals(other$thumb160)) return false;
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
        final Object this$preview = this.getPreview();
        final Object other$preview = other.getPreview();
        if (this$preview == null ? other$preview != null : !this$preview.equals(other$preview)) return false;
        final Object this$previewHighlight = this.getPreviewHighlight();
        final Object other$previewHighlight = other.getPreviewHighlight();
        if (this$previewHighlight == null ? other$previewHighlight != null : !this$previewHighlight.equals(other$previewHighlight))
            return false;
        final Object this$lines = this.getLines();
        final Object other$lines = other.getLines();
        if (this$lines == null ? other$lines != null : !this$lines.equals(other$lines)) return false;
        final Object this$linesMoe = this.getLinesMoe();
        final Object other$linesMoe = other.getLinesMoe();
        if (this$linesMoe == null ? other$linesMoe != null : !this$linesMoe.equals(other$linesMoe)) return false;
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
        return true;
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
        final Object $thumb64 = this.getThumb64();
        result = result * PRIME + ($thumb64 == null ? 43 : $thumb64.hashCode());
        final Object $thumb80 = this.getThumb80();
        result = result * PRIME + ($thumb80 == null ? 43 : $thumb80.hashCode());
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
        final Object $thumb480Width = this.getThumb480Width();
        result = result * PRIME + ($thumb480Width == null ? 43 : $thumb480Width.hashCode());
        final Object $thumb480Height = this.getThumb480Height();
        result = result * PRIME + ($thumb480Height == null ? 43 : $thumb480Height.hashCode());
        final Object $thumb160 = this.getThumb160();
        result = result * PRIME + ($thumb160 == null ? 43 : $thumb160.hashCode());
        final Object $permalink = this.getPermalink();
        result = result * PRIME + ($permalink == null ? 43 : $permalink.hashCode());
        final Object $permalinkPublic = this.getPermalinkPublic();
        result = result * PRIME + ($permalinkPublic == null ? 43 : $permalinkPublic.hashCode());
        final Object $editLink = this.getEditLink();
        result = result * PRIME + ($editLink == null ? 43 : $editLink.hashCode());
        final Object $preview = this.getPreview();
        result = result * PRIME + ($preview == null ? 43 : $preview.hashCode());
        final Object $previewHighlight = this.getPreviewHighlight();
        result = result * PRIME + ($previewHighlight == null ? 43 : $previewHighlight.hashCode());
        final Object $lines = this.getLines();
        result = result * PRIME + ($lines == null ? 43 : $lines.hashCode());
        final Object $linesMoe = this.getLinesMoe();
        result = result * PRIME + ($linesMoe == null ? 43 : $linesMoe.hashCode());
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
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof File;
    }

    public String toString() {
        return "File(id=" + this.getId() + ", created=" + this.getCreated() + ", timestamp=" + this.getTimestamp() + ", name=" + this.getName() + ", title=" + this.getTitle() + ", mimetype=" + this.getMimetype() + ", filetype=" + this.getFiletype() + ", prettyType=" + this.getPrettyType() + ", user=" + this.getUser() + ", mode=" + this.getMode() + ", editable=" + this.isEditable() + ", external=" + this.isExternal() + ", externalType=" + this.getExternalType() + ", username=" + this.getUsername() + ", size=" + this.getSize() + ", urlPrivate=" + this.getUrlPrivate() + ", urlPrivateDownload=" + this.getUrlPrivateDownload() + ", thumb64=" + this.getThumb64() + ", thumb80=" + this.getThumb80() + ", thumb360=" + this.getThumb360() + ", thumb360Gif=" + this.getThumb360Gif() + ", thumb360Width=" + this.getThumb360Width() + ", thumb360Height=" + this.getThumb360Height() + ", thumb480=" + this.getThumb480() + ", thumb480Width=" + this.getThumb480Width() + ", thumb480Height=" + this.getThumb480Height() + ", thumb160=" + this.getThumb160() + ", permalink=" + this.getPermalink() + ", permalinkPublic=" + this.getPermalinkPublic() + ", editLink=" + this.getEditLink() + ", preview=" + this.getPreview() + ", previewHighlight=" + this.getPreviewHighlight() + ", lines=" + this.getLines() + ", linesMoe=" + this.getLinesMoe() + ", _public=" + this.isPublic() + ", publicUrlShared=" + this.isPublicUrlShared() + ", displayAsBot=" + this.isDisplayAsBot() + ", channels=" + this.getChannels() + ", groups=" + this.getGroups() + ", ims=" + this.getIms() + ", initialComment=" + this.getInitialComment() + ", numStars=" + this.getNumStars() + ", starred=" + this.isStarred() + ", pinnedTo=" + this.getPinnedTo() + ", reactions=" + this.getReactions() + ", commentsCount=" + this.getCommentsCount() + ")";
    }

    public static class FileBuilder {
        private String id;
        private Integer created;
        private Integer timestamp;
        private String name;
        private String title;
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
        private String thumb64;
        private String thumb80;
        private String thumb360;
        private String thumb360Gif;
        private String thumb360Width;
        private String thumb360Height;
        private String thumb480;
        private String thumb480Width;
        private String thumb480Height;
        private String thumb160;
        private String permalink;
        private String permalinkPublic;
        private String editLink;
        private String preview;
        private String previewHighlight;
        private Integer lines;
        private Integer linesMoe;
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

        public File.FileBuilder thumb64(String thumb64) {
            this.thumb64 = thumb64;
            return this;
        }

        public File.FileBuilder thumb80(String thumb80) {
            this.thumb80 = thumb80;
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

        public File.FileBuilder thumb480Width(String thumb480Width) {
            this.thumb480Width = thumb480Width;
            return this;
        }

        public File.FileBuilder thumb480Height(String thumb480Height) {
            this.thumb480Height = thumb480Height;
            return this;
        }

        public File.FileBuilder thumb160(String thumb160) {
            this.thumb160 = thumb160;
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

        public File.FileBuilder preview(String preview) {
            this.preview = preview;
            return this;
        }

        public File.FileBuilder previewHighlight(String previewHighlight) {
            this.previewHighlight = previewHighlight;
            return this;
        }

        public File.FileBuilder lines(Integer lines) {
            this.lines = lines;
            return this;
        }

        public File.FileBuilder linesMoe(Integer linesMoe) {
            this.linesMoe = linesMoe;
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

        public File build() {
            return new File(id, created, timestamp, name, title, mimetype, filetype, prettyType, user, mode, editable, external, externalType, username, size, urlPrivate, urlPrivateDownload, thumb64, thumb80, thumb360, thumb360Gif, thumb360Width, thumb360Height, thumb480, thumb480Width, thumb480Height, thumb160, permalink, permalinkPublic, editLink, preview, previewHighlight, lines, linesMoe, _public, publicUrlShared, displayAsBot, channels, groups, ims, initialComment, numStars, starred, pinnedTo, reactions, commentsCount);
        }

        public String toString() {
            return "File.FileBuilder(id=" + this.id + ", created=" + this.created + ", timestamp=" + this.timestamp + ", name=" + this.name + ", title=" + this.title + ", mimetype=" + this.mimetype + ", filetype=" + this.filetype + ", prettyType=" + this.prettyType + ", user=" + this.user + ", mode=" + this.mode + ", editable=" + this.editable + ", external=" + this.external + ", externalType=" + this.externalType + ", username=" + this.username + ", size=" + this.size + ", urlPrivate=" + this.urlPrivate + ", urlPrivateDownload=" + this.urlPrivateDownload + ", thumb64=" + this.thumb64 + ", thumb80=" + this.thumb80 + ", thumb360=" + this.thumb360 + ", thumb360Gif=" + this.thumb360Gif + ", thumb360Width=" + this.thumb360Width + ", thumb360Height=" + this.thumb360Height + ", thumb480=" + this.thumb480 + ", thumb480Width=" + this.thumb480Width + ", thumb480Height=" + this.thumb480Height + ", thumb160=" + this.thumb160 + ", permalink=" + this.permalink + ", permalinkPublic=" + this.permalinkPublic + ", editLink=" + this.editLink + ", preview=" + this.preview + ", previewHighlight=" + this.previewHighlight + ", lines=" + this.lines + ", linesMoe=" + this.linesMoe + ", _public=" + this._public + ", publicUrlShared=" + this.publicUrlShared + ", displayAsBot=" + this.displayAsBot + ", channels=" + this.channels + ", groups=" + this.groups + ", ims=" + this.ims + ", initialComment=" + this.initialComment + ", numStars=" + this.numStars + ", starred=" + this.starred + ", pinnedTo=" + this.pinnedTo + ", reactions=" + this.reactions + ", commentsCount=" + this.commentsCount + ")";
        }
    }
}