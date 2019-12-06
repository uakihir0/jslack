package com.github.seratch.jslack.api.model;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Action {
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
    @Builder.Default
    private Type type = Type.BUTTON;
    private String value;
    private Confirmation confirm;
    private List<Option> options = new ArrayList<>();
    private List<Option> selectedOptions = new ArrayList<>();
    private String dataSource;
    private Integer minQueryLength;
    private List<OptionGroup> optionGroups;
    private String url;

    @Getter
@Setter
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class OptionGroup {
        private String text;
        private List<Option> options;
    }

    @Getter
@Setter
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Option {
        private String text;
        private String value;
    }
}
