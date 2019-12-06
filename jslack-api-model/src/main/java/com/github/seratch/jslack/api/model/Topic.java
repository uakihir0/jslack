package com.github.seratch.jslack.api.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Topic {
    private String value;
    private String creator;
    private Integer lastSet;
}
