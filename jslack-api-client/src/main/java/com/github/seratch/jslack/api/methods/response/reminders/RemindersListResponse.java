package com.github.seratch.jslack.api.methods.response.reminders;

import com.github.seratch.jslack.api.methods.SlackApiResponse;
import com.github.seratch.jslack.api.model.Reminder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class RemindersListResponse implements SlackApiResponse {

    private boolean ok;
    private String warning;
    private String error;
    private String needed;
    private String provided;

    private List<Reminder> reminders;
}