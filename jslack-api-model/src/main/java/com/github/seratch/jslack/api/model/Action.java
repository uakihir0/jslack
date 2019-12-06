package com.github.seratch.jslack.api.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class Action {
    public Action(String id, String name, String text, String style, Type type, String value, Confirmation confirm, List<Option> options, List<Option> selectedOptions, String dataSource, Integer minQueryLength, List<OptionGroup> optionGroups, String url) {
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

    public Action() {
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

        public OptionGroup(String text, List<Option> options) {
            this.text = text;
            this.options = options;
        }

        public OptionGroup() {
        }

        public static OptionGroupBuilder builder() {
            return new OptionGroupBuilder();
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

        public static class OptionGroupBuilder {
            private String text;
            private List<Option> options;

            OptionGroupBuilder() {
            }

            public OptionGroup.OptionGroupBuilder text(String text) {
                this.text = text;
                return this;
            }

            public OptionGroup.OptionGroupBuilder options(List<Option> options) {
                this.options = options;
                return this;
            }

            public OptionGroup build() {
                return new OptionGroup(text, options);
            }

            public String toString() {
                return "Action.OptionGroup.OptionGroupBuilder(text=" + this.text + ", options=" + this.options + ")";
            }
        }
    }

    public static class Option {
        private String text;
        private String value;

        public Option(String text, String value) {
            this.text = text;
            this.value = value;
        }

        public Option() {
        }

        public static OptionBuilder builder() {
            return new OptionBuilder();
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

        public static class OptionBuilder {
            private String text;
            private String value;

            OptionBuilder() {
            }

            public Option.OptionBuilder text(String text) {
                this.text = text;
                return this;
            }

            public Option.OptionBuilder value(String value) {
                this.value = value;
                return this;
            }

            public Option build() {
                return new Option(text, value);
            }

            public String toString() {
                return "Action.Option.OptionBuilder(text=" + this.text + ", value=" + this.value + ")";
            }
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
