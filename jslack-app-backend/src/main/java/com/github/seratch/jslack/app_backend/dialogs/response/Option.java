package com.github.seratch.jslack.app_backend.dialogs.response;

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
    private String label;
    private String value;
}
