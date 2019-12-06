package com.github.seratch.jslack.api.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

/**
 * https://api.slack.com/methods/reminders.add
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Reminder {

    private String id;
    private String creator;
    private String user;
    private String text;
    private boolean recurring;
    private Integer time;
    private Integer completeTs;
}