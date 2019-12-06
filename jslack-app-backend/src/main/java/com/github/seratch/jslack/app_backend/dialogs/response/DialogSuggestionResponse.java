package com.github.seratch.jslack.app_backend.dialogs.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Response data to react to an action where a user clicked on a dialog which has
 * "type": "select" and "data_source": "external"
 * <p>
 * see https://api.slack.com/dialogs
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DialogSuggestionResponse {

    private List<Option> options;
    private List<OptionGroup> optionGroups;
}
