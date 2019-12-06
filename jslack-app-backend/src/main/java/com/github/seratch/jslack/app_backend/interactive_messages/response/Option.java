package com.github.seratch.jslack.app_backend.interactive_messages.response;

import com.github.seratch.jslack.api.model.block.composition.TextObject;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Option {
    private TextObject text;
    private String value;
}
