package com.github.seratch.jslack.api.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * https://api.slack.com/methods/reactions.get
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Reaction {

    private String name;
    private Integer count;
    private List<String> users;
    private String url;
}