package com.github.seratch.jslack.api.model.event;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 *
 */
@Getter
@Setter
public class ScopeGrantedEvent implements Event {

    public static final String TYPE_NAME = "scope_granted";

    private final String type = TYPE_NAME;
    private List<String> scopes;
    private String triggerId;

}