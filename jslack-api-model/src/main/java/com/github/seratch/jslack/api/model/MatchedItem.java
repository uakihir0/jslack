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

    private String fileId;
    private String externalId;
    private String externalUrl;

    private String timestamp;
    private String created;

    @SerializedName("is_intro")
    private boolean intro;

    @SerializedName("is_public")
    private boolean _public;

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
    @SerializedName("is_mpim")
    private boolean mpim;
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

    private String thumbTiny;

    private String thumbPdf;
    @SerializedName("thumb_pdf_w")
    private String thumbPdfWidth;
    @SerializedName("thumb_pdf_h")
    private String thumbPdfHeight;

    private Integer imageExifRotation;

    @SerializedName("original_w")
    private String originalWidth;
    @SerializedName("original_h")
    private String originalHeight;

    private String score;
    private boolean topFile;

    private String deanimateGif;

    private String channelActionsTs;
    private Integer channelActionsCount;

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

    public String getFileId() {
        return this.fileId;
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

    public boolean isMpim() {
        return this.mpim;
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

    public String getThumbTiny() {
        return this.thumbTiny;
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

    public String getDeanimateGif() {
        return this.deanimateGif;
    }

    public String getChannelActionsTs() {
        return this.channelActionsTs;
    }

    public Integer getChannelActionsCount() {
        return this.channelActionsCount;
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

    public void setFileId(String fileId) {
        this.fileId = fileId;
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

    public void setMpim(boolean mpim) {
        this.mpim = mpim;
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

    public void setThumbTiny(String thumbTiny) {
        this.thumbTiny = thumbTiny;
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

    public void setDeanimateGif(String deanimateGif) {
        this.deanimateGif = deanimateGif;
    }

    public void setChannelActionsTs(String channelActionsTs) {
        this.channelActionsTs = channelActionsTs;
    }

    public void setChannelActionsCount(Integer channelActionsCount) {
        this.channelActionsCount = channelActionsCount;
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

}
