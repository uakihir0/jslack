package com.github.seratch.jslack.api.model.view;

import com.github.seratch.jslack.api.model.block.composition.PlainTextObject;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ViewState {
    // block_id, action_id
    private Map<String, Map<String, Value>> values;

    /**
     * This class may miss some attributes.
     * If you find missing ones, let us know at https://github.com/seratch/jslack/issues
     */
    @Getter
@Setter
    public static class Value {
        private String type;
        private String value;
        private String selectedDate;
        private String selectedConversation;
        private String selectedChannel;
        private String selectedUser;
        private SelectedOption selectedOption;
        private List<String> selectedUsers;
    }

    @Getter
@Setter
    public static class SelectedOption {
        private PlainTextObject text;
        private String value;
    }
}
