package com.github.seratch.jslack.app_backend.events.payload;

import com.github.seratch.jslack.api.model.event.GroupDeletedEvent;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class GroupDeletedPayload implements EventsApiPayload<GroupDeletedEvent> {

    private String token;
    private String enterpriseId;
    private String teamId;
    private String apiAppId;
    private String type;
    private List<String> authedUsers;
    private List<String> authedTeams;
    private String eventId;
    private Integer eventTime;

    private GroupDeletedEvent event;
}
