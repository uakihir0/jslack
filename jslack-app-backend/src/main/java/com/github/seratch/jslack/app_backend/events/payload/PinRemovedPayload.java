package com.github.seratch.jslack.app_backend.events.payload;

import com.github.seratch.jslack.api.model.event.PinRemovedEvent;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class PinRemovedPayload implements EventsApiPayload<PinRemovedEvent> {

    private String token;
    private String enterpriseId;
    private String teamId;
    private String apiAppId;
    private String type;
    private List<String> authedUsers;
    private List<String> authedTeams;
    private String eventId;
    private Integer eventTime;

    private PinRemovedEvent event;
}
