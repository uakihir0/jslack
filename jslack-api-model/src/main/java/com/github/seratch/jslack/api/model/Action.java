package com.github.seratch.jslack.api.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class Action {
    Action(String id, String name, String text, String style, Type type, String value, Confirmation confirm, List<Option> options, List<Option> selectedOptions, String dataSource, Integer minQueryLength, List<OptionGroup> optionGroups, String url) {
        this.id = id;
        this.name = name;
        this.text = text;
        this.style = style;
        this.type = type;
        this.value = value;
        this.confirm = confirm;
        this.options = options;
        this.selectedOptions = selectedOptions;
        this.dataSource = dataSource;
        this.minQueryLength = minQueryLength;
        this.optionGroups = optionGroups;
        this.url = url;
    }

    public static ActionBuilder builder() {
        return new ActionBuilder();
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getText() {
        return this.text;
    }

    public String getStyle() {
        return this.style;
    }

    public Type getType() {
        return this.type;
    }

    public String getValue() {
        return this.value;
    }

    public Confirmation getConfirm() {
        return this.confirm;
    }

    public List<Option> getOptions() {
        return this.options;
    }

    public List<Option> getSelectedOptions() {
        return this.selectedOptions;
    }

    public String getDataSource() {
        return this.dataSource;
    }

    public Integer getMinQueryLength() {
        return this.minQueryLength;
    }

    public List<OptionGroup> getOptionGroups() {
        return this.optionGroups;
    }

    public String getUrl() {
        return this.url;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void setConfirm(Confirmation confirm) {
        this.confirm = confirm;
    }

    public void setOptions(List<Option> options) {
        this.options = options;
    }

    public void setSelectedOptions(List<Option> selectedOptions) {
        this.selectedOptions = selectedOptions;
    }

    public void setDataSource(String dataSource) {
        this.dataSource = dataSource;
    }

    public void setMinQueryLength(Integer minQueryLength) {
        this.minQueryLength = minQueryLength;
    }

    public void setOptionGroups(List<OptionGroup> optionGroups) {
        this.optionGroups = optionGroups;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Action)) return false;
        final Action other = (Action) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final Object this$name = this.getName();
        final Object other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
        final Object this$text = this.getText();
        final Object other$text = other.getText();
        if (this$text == null ? other$text != null : !this$text.equals(other$text)) return false;
        final Object this$style = this.getStyle();
        final Object other$style = other.getStyle();
        if (this$style == null ? other$style != null : !this$style.equals(other$style)) return false;
        final Object this$type = this.getType();
        final Object other$type = other.getType();
        if (this$type == null ? other$type != null : !this$type.equals(other$type)) return false;
        final Object this$value = this.getValue();
        final Object other$value = other.getValue();
        if (this$value == null ? other$value != null : !this$value.equals(other$value)) return false;
        final Object this$confirm = this.getConfirm();
        final Object other$confirm = other.getConfirm();
        if (this$confirm == null ? other$confirm != null : !this$confirm.equals(other$confirm)) return false;
        final Object this$options = this.getOptions();
        final Object other$options = other.getOptions();
        if (this$options == null ? other$options != null : !this$options.equals(other$options)) return false;
        final Object this$selectedOptions = this.getSelectedOptions();
        final Object other$selectedOptions = other.getSelectedOptions();
        if (this$selectedOptions == null ? other$selectedOptions != null : !this$selectedOptions.equals(other$selectedOptions))
            return false;
        final Object this$dataSource = this.getDataSource();
        final Object other$dataSource = other.getDataSource();
        if (this$dataSource == null ? other$dataSource != null : !this$dataSource.equals(other$dataSource))
            return false;
        final Object this$minQueryLength = this.getMinQueryLength();
        final Object other$minQueryLength = other.getMinQueryLength();
        if (this$minQueryLength == null ? other$minQueryLength != null : !this$minQueryLength.equals(other$minQueryLength))
            return false;
        final Object this$optionGroups = this.getOptionGroups();
        final Object other$optionGroups = other.getOptionGroups();
        if (this$optionGroups == null ? other$optionGroups != null : !this$optionGroups.equals(other$optionGroups))
            return false;
        final Object this$url = this.getUrl();
        final Object other$url = other.getUrl();
        if (this$url == null ? other$url != null : !this$url.equals(other$url)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Action;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final Object $name = this.getName();
        result = result * PRIME + ($name == null ? 43 : $name.hashCode());
        final Object $text = this.getText();
        result = result * PRIME + ($text == null ? 43 : $text.hashCode());
        final Object $style = this.getStyle();
        result = result * PRIME + ($style == null ? 43 : $style.hashCode());
        final Object $type = this.getType();
        result = result * PRIME + ($type == null ? 43 : $type.hashCode());
        final Object $value = this.getValue();
        result = result * PRIME + ($value == null ? 43 : $value.hashCode());
        final Object $confirm = this.getConfirm();
        result = result * PRIME + ($confirm == null ? 43 : $confirm.hashCode());
        final Object $options = this.getOptions();
        result = result * PRIME + ($options == null ? 43 : $options.hashCode());
        final Object $selectedOptions = this.getSelectedOptions();
        result = result * PRIME + ($selectedOptions == null ? 43 : $selectedOptions.hashCode());
        final Object $dataSource = this.getDataSource();
        result = result * PRIME + ($dataSource == null ? 43 : $dataSource.hashCode());
        final Object $minQueryLength = this.getMinQueryLength();
        result = result * PRIME + ($minQueryLength == null ? 43 : $minQueryLength.hashCode());
        final Object $optionGroups = this.getOptionGroups();
        result = result * PRIME + ($optionGroups == null ? 43 : $optionGroups.hashCode());
        final Object $url = this.getUrl();
        result = result * PRIME + ($url == null ? 43 : $url.hashCode());
        return result;
    }

    public String toString() {
        return "Action(id=" + this.getId() + ", name=" + this.getName() + ", text=" + this.getText() + ", style=" + this.getStyle() + ", type=" + this.getType() + ", value=" + this.getValue() + ", confirm=" + this.getConfirm() + ", options=" + this.getOptions() + ", selectedOptions=" + this.getSelectedOptions() + ", dataSource=" + this.getDataSource() + ", minQueryLength=" + this.getMinQueryLength() + ", optionGroups=" + this.getOptionGroups() + ", url=" + this.getUrl() + ")";
    }

    /**
     * Represents the type of action (e.g Message button or message menu)
     *
     * @see <a href="https://api.slack.com/interactive-messages#interaction_types">Interaction Types</a>
     */
    public enum Type {

        /**
         * @see <a href="https://api.slack.com/docs/message-buttons">Message button</a>
         */
        @SerializedName("button")
        BUTTON("button"),

        /**
         * @see <a href="https://api.slack.com/docs/message-menus">Message menus</a>
         */
        @SerializedName("select")
        SELECT("select");

        private final String value;

        Type(String value) {
            this.value = value;
        }

        public String value() {
            return value;
        }
    }

    private String id;
    private String name;
    private String text;
    private String style;
    private Type type = Type.BUTTON;
    private String value;
    private Confirmation confirm;
    private List<Option> options = new ArrayList<>();
    private List<Option> selectedOptions = new ArrayList<>();
    private String dataSource;
    private Integer minQueryLength;
    private List<OptionGroup> optionGroups;
    private String url;

    public static class OptionGroup {
        private String text;
        private List<Option> options;

        public OptionGroup() {
        }

        public String getText() {
            return this.text;
        }

        public List<Option> getOptions() {
            return this.options;
        }

        public void setText(String text) {
            this.text = text;
        }

        public void setOptions(List<Option> options) {
            this.options = options;
        }

        public boolean equals(final Object o) {
            if (o == this) return true;
            if (!(o instanceof OptionGroup)) return false;
            final OptionGroup other = (OptionGroup) o;
            if (!other.canEqual((Object) this)) return false;
            final Object this$text = this.getText();
            final Object other$text = other.getText();
            if (this$text == null ? other$text != null : !this$text.equals(other$text)) return false;
            final Object this$options = this.getOptions();
            final Object other$options = other.getOptions();
            if (this$options == null ? other$options != null : !this$options.equals(other$options)) return false;
            return true;
        }

        protected boolean canEqual(final Object other) {
            return other instanceof OptionGroup;
        }

        public int hashCode() {
            final int PRIME = 59;
            int result = 1;
            final Object $text = this.getText();
            result = result * PRIME + ($text == null ? 43 : $text.hashCode());
            final Object $options = this.getOptions();
            result = result * PRIME + ($options == null ? 43 : $options.hashCode());
            return result;
        }

        public String toString() {
            return "Action.OptionGroup(text=" + this.getText() + ", options=" + this.getOptions() + ")";
        }
    }

    public static class Option {
        private String text;
        private String value;

        public Option() {
        }

        public String getText() {
            return this.text;
        }

        public String getValue() {
            return this.value;
        }

        public void setText(String text) {
            this.text = text;
        }

        public void setValue(String value) {
            this.value = value;
        }

        public boolean equals(final Object o) {
            if (o == this) return true;
            if (!(o instanceof Option)) return false;
            final Option other = (Option) o;
            if (!other.canEqual((Object) this)) return false;
            final Object this$text = this.getText();
            final Object other$text = other.getText();
            if (this$text == null ? other$text != null : !this$text.equals(other$text)) return false;
            final Object this$value = this.getValue();
            final Object other$value = other.getValue();
            if (this$value == null ? other$value != null : !this$value.equals(other$value)) return false;
            return true;
        }

        protected boolean canEqual(final Object other) {
            return other instanceof Option;
        }

        public int hashCode() {
            final int PRIME = 59;
            int result = 1;
            final Object $text = this.getText();
            result = result * PRIME + ($text == null ? 43 : $text.hashCode());
            final Object $value = this.getValue();
            result = result * PRIME + ($value == null ? 43 : $value.hashCode());
            return result;
        }

        public String toString() {
            return "Action.Option(text=" + this.getText() + ", value=" + this.getValue() + ")";
        }
    }

    public static class ActionBuilder {
        private String id;
        private String name;
        private String text;
        private String style;
        private Type type;
        private String value;
        private Confirmation confirm;
        private List<Option> options;
        private List<Option> selectedOptions;
        private String dataSource;
        private Integer minQueryLength;
        private List<OptionGroup> optionGroups;
        private String url;

        ActionBuilder() {
        }

        public Action.ActionBuilder id(String id) {
            this.id = id;
            return this;
        }

        public Action.ActionBuilder name(String name) {
            this.name = name;
            return this;
        }

        public Action.ActionBuilder text(String text) {
            this.text = text;
            return this;
        }

        public Action.ActionBuilder style(String style) {
            this.style = style;
            return this;
        }

        public Action.ActionBuilder type(Type type) {
            this.type = type;
            return this;
        }

        public Action.ActionBuilder value(String value) {
            this.value = value;
            return this;
        }

        public Action.ActionBuilder confirm(Confirmation confirm) {
            this.confirm = confirm;
            return this;
        }

        public Action.ActionBuilder options(List<Option> options) {
            this.options = options;
            return this;
        }

        public Action.ActionBuilder selectedOptions(List<Option> selectedOptions) {
            this.selectedOptions = selectedOptions;
            return this;
        }

        public Action.ActionBuilder dataSource(String dataSource) {
            this.dataSource = dataSource;
            return this;
        }

        public Action.ActionBuilder minQueryLength(Integer minQueryLength) {
            this.minQueryLength = minQueryLength;
            return this;
        }

        public Action.ActionBuilder optionGroups(List<OptionGroup> optionGroups) {
            this.optionGroups = optionGroups;
            return this;
        }

        public Action.ActionBuilder url(String url) {
            this.url = url;
            return this;
        }

        public Action build() {
            return new Action(id, name, text, style, type, value, confirm, options, selectedOptions, dataSource, minQueryLength, optionGroups, url);
        }

        public String toString() {
            return "Action.ActionBuilder(id=" + this.id + ", name=" + this.name + ", text=" + this.text + ", style=" + this.style + ", type=" + this.type + ", value=" + this.value + ", confirm=" + this.confirm + ", options=" + this.options + ", selectedOptions=" + this.selectedOptions + ", dataSource=" + this.dataSource + ", minQueryLength=" + this.minQueryLength + ", optionGroups=" + this.optionGroups + ", url=" + this.url + ")";
        }
    }
}
