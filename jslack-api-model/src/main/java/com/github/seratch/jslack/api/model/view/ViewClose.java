package com.github.seratch.jslack.api.model.view;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ViewClose {
    private String type;
    private String text;
    private boolean emoji;
}
