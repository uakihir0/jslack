package com.github.seratch.jslack.api.model.view;

import com.github.seratch.jslack.api.model.block.LayoutBlock;

import java.util.List;

/**
 * Represents a Slack Modal View
 *
 * @see <a href="https://api.slack.com/block-kit/surfaces/modals">Modals</a>
 */
public class View {

    private String id;
    private String teamId;
    private String type; // modal, home
    private ViewTitle title;
    private ViewSubmit submit;
    private ViewClose close;
    private List<LayoutBlock> blocks;
    private String privateMetadata;
    private String callbackId;
    private String externalId;
    private ViewState state;
    private String hash;
    private Boolean clearOnClose; // must be nullable for App Home
    private Boolean notifyOnClose;  // must be nullable for App Home
    private String rootViewId;
    private String previousViewId; // views.update
    private String appId;
    private String botId;

    public View(String id, String teamId, String type, ViewTitle title, ViewSubmit submit, ViewClose close, List<LayoutBlock> blocks, String privateMetadata, String callbackId, String externalId, ViewState state, String hash, Boolean clearOnClose, Boolean notifyOnClose, String rootViewId, String previousViewId, String appId, String botId) {
        this.id = id;
        this.teamId = teamId;
        this.type = type;
        this.title = title;
        this.submit = submit;
        this.close = close;
        this.blocks = blocks;
        this.privateMetadata = privateMetadata;
        this.callbackId = callbackId;
        this.externalId = externalId;
        this.state = state;
        this.hash = hash;
        this.clearOnClose = clearOnClose;
        this.notifyOnClose = notifyOnClose;
        this.rootViewId = rootViewId;
        this.previousViewId = previousViewId;
        this.appId = appId;
        this.botId = botId;
    }

    public View() {
    }

    public static ViewBuilder builder() {
        return new ViewBuilder();
    }

    public String getId() {
        return this.id;
    }

    public String getTeamId() {
        return this.teamId;
    }

    public String getType() {
        return this.type;
    }

    public ViewTitle getTitle() {
        return this.title;
    }

    public ViewSubmit getSubmit() {
        return this.submit;
    }

    public ViewClose getClose() {
        return this.close;
    }

    public List<LayoutBlock> getBlocks() {
        return this.blocks;
    }

    public String getPrivateMetadata() {
        return this.privateMetadata;
    }

    public String getCallbackId() {
        return this.callbackId;
    }

    public String getExternalId() {
        return this.externalId;
    }

    public ViewState getState() {
        return this.state;
    }

    public String getHash() {
        return this.hash;
    }

    public Boolean getClearOnClose() {
        return this.clearOnClose;
    }

    public Boolean getNotifyOnClose() {
        return this.notifyOnClose;
    }

    public String getRootViewId() {
        return this.rootViewId;
    }

    public String getPreviousViewId() {
        return this.previousViewId;
    }

    public String getAppId() {
        return this.appId;
    }

    public String getBotId() {
        return this.botId;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setTeamId(String teamId) {
        this.teamId = teamId;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setTitle(ViewTitle title) {
        this.title = title;
    }

    public void setSubmit(ViewSubmit submit) {
        this.submit = submit;
    }

    public void setClose(ViewClose close) {
        this.close = close;
    }

    public void setBlocks(List<LayoutBlock> blocks) {
        this.blocks = blocks;
    }

    public void setPrivateMetadata(String privateMetadata) {
        this.privateMetadata = privateMetadata;
    }

    public void setCallbackId(String callbackId) {
        this.callbackId = callbackId;
    }

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    public void setState(ViewState state) {
        this.state = state;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public void setClearOnClose(Boolean clearOnClose) {
        this.clearOnClose = clearOnClose;
    }

    public void setNotifyOnClose(Boolean notifyOnClose) {
        this.notifyOnClose = notifyOnClose;
    }

    public void setRootViewId(String rootViewId) {
        this.rootViewId = rootViewId;
    }

    public void setPreviousViewId(String previousViewId) {
        this.previousViewId = previousViewId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public void setBotId(String botId) {
        this.botId = botId;
    }

    public static class ViewBuilder {
        private String id;
        private String teamId;
        private String type;
        private ViewTitle title;
        private ViewSubmit submit;
        private ViewClose close;
        private List<LayoutBlock> blocks;
        private String privateMetadata;
        private String callbackId;
        private String externalId;
        private ViewState state;
        private String hash;
        private Boolean clearOnClose;
        private Boolean notifyOnClose;
        private String rootViewId;
        private String previousViewId;
        private String appId;
        private String botId;

        ViewBuilder() {
        }

        public View.ViewBuilder id(String id) {
            this.id = id;
            return this;
        }

        public View.ViewBuilder teamId(String teamId) {
            this.teamId = teamId;
            return this;
        }

        public View.ViewBuilder type(String type) {
            this.type = type;
            return this;
        }

        public View.ViewBuilder title(ViewTitle title) {
            this.title = title;
            return this;
        }

        public View.ViewBuilder submit(ViewSubmit submit) {
            this.submit = submit;
            return this;
        }

        public View.ViewBuilder close(ViewClose close) {
            this.close = close;
            return this;
        }

        public View.ViewBuilder blocks(List<LayoutBlock> blocks) {
            this.blocks = blocks;
            return this;
        }

        public View.ViewBuilder privateMetadata(String privateMetadata) {
            this.privateMetadata = privateMetadata;
            return this;
        }

        public View.ViewBuilder callbackId(String callbackId) {
            this.callbackId = callbackId;
            return this;
        }

        public View.ViewBuilder externalId(String externalId) {
            this.externalId = externalId;
            return this;
        }

        public View.ViewBuilder state(ViewState state) {
            this.state = state;
            return this;
        }

        public View.ViewBuilder hash(String hash) {
            this.hash = hash;
            return this;
        }

        public View.ViewBuilder clearOnClose(Boolean clearOnClose) {
            this.clearOnClose = clearOnClose;
            return this;
        }

        public View.ViewBuilder notifyOnClose(Boolean notifyOnClose) {
            this.notifyOnClose = notifyOnClose;
            return this;
        }

        public View.ViewBuilder rootViewId(String rootViewId) {
            this.rootViewId = rootViewId;
            return this;
        }

        public View.ViewBuilder previousViewId(String previousViewId) {
            this.previousViewId = previousViewId;
            return this;
        }

        public View.ViewBuilder appId(String appId) {
            this.appId = appId;
            return this;
        }

        public View.ViewBuilder botId(String botId) {
            this.botId = botId;
            return this;
        }

        public View build() {
            return new View(id, teamId, type, title, submit, close, blocks, privateMetadata, callbackId, externalId, state, hash, clearOnClose, notifyOnClose, rootViewId, previousViewId, appId, botId);
        }

        public String toString() {
            return "View.ViewBuilder(id=" + this.id + ", teamId=" + this.teamId + ", type=" + this.type + ", title=" + this.title + ", submit=" + this.submit + ", close=" + this.close + ", blocks=" + this.blocks + ", privateMetadata=" + this.privateMetadata + ", callbackId=" + this.callbackId + ", externalId=" + this.externalId + ", state=" + this.state + ", hash=" + this.hash + ", clearOnClose=" + this.clearOnClose + ", notifyOnClose=" + this.notifyOnClose + ", rootViewId=" + this.rootViewId + ", previousViewId=" + this.previousViewId + ", appId=" + this.appId + ", botId=" + this.botId + ")";
        }
    }
}
