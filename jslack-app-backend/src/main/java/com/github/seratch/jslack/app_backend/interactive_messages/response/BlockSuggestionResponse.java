package com.github.seratch.jslack.app_backend.interactive_messages.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BlockSuggestionResponse {

    private List<Option> options;
    private List<OptionGroup> optionGroups;

}
