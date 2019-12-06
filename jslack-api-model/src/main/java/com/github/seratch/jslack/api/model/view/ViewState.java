package com.github.seratch.jslack.api.model.view;

import com.github.seratch.jslack.api.model.block.composition.PlainTextObject;

import java.util.List;
import java.util.Map;

public class ViewState {
    // block_id, action_id
    private Map<String, Map<String, Value>> values;

    public ViewState(Map<String, Map<String, Value>> values) {
        this.values = values;
    }

    public ViewState() {
    }

    public static ViewStateBuilder builder() {
        return new ViewStateBuilder();
    }

    public Map<String, Map<String, Value>> getValues() {
        return this.values;
    }

    public void setValues(Map<String, Map<String, Value>> values) {
        this.values = values;
    }

    /**
     * This class may miss some attributes.
     * If you find missing ones, let us know at https://github.com/seratch/jslack/issues
     */
    public static class Value {
        private String type;
        private String value;
        private String selectedDate;
        private String selectedConversation;
        private String selectedChannel;
        private String selectedUser;
        private SelectedOption selectedOption;
        private List<String> selectedUsers;

        public String getType() {
            return this.type;
        }

        public String getValue() {
            return this.value;
        }

        public String getSelectedDate() {
            return this.selectedDate;
        }

        public String getSelectedConversation() {
            return this.selectedConversation;
        }

        public String getSelectedChannel() {
            return this.selectedChannel;
        }

        public String getSelectedUser() {
            return this.selectedUser;
        }

        public SelectedOption getSelectedOption() {
            return this.selectedOption;
        }

        public List<String> getSelectedUsers() {
            return this.selectedUsers;
        }

        public void setType(String type) {
            this.type = type;
        }

        public void setValue(String value) {
            this.value = value;
        }

        public void setSelectedDate(String selectedDate) {
            this.selectedDate = selectedDate;
        }

        public void setSelectedConversation(String selectedConversation) {
            this.selectedConversation = selectedConversation;
        }

        public void setSelectedChannel(String selectedChannel) {
            this.selectedChannel = selectedChannel;
        }

        public void setSelectedUser(String selectedUser) {
            this.selectedUser = selectedUser;
        }

        public void setSelectedOption(SelectedOption selectedOption) {
            this.selectedOption = selectedOption;
        }

        public void setSelectedUsers(List<String> selectedUsers) {
            this.selectedUsers = selectedUsers;
        }
    }

    public static class SelectedOption {
        private PlainTextObject text;
        private String value;

        public PlainTextObject getText() {
            return this.text;
        }

        public String getValue() {
            return this.value;
        }

        public void setText(PlainTextObject text) {
            this.text = text;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }

    public static class ViewStateBuilder {
        private Map<String, Map<String, Value>> values;

        ViewStateBuilder() {
        }

        public ViewState.ViewStateBuilder values(Map<String, Map<String, Value>> values) {
            this.values = values;
            return this;
        }

        public ViewState build() {
            return new ViewState(values);
        }

        public String toString() {
            return "ViewState.ViewStateBuilder(values=" + this.values + ")";
        }
    }
}
