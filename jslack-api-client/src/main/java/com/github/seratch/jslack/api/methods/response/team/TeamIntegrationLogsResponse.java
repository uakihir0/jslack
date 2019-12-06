package com.github.seratch.jslack.api.methods.response.team;

import com.github.seratch.jslack.api.methods.SlackApiResponse;
import com.github.seratch.jslack.api.model.IntegrationLog;
import com.github.seratch.jslack.api.model.Paging;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class TeamIntegrationLogsResponse implements SlackApiResponse {

    private boolean ok;
    private String warning;
    private String error;
    private String needed;
    private String provided;

    private List<IntegrationLog> logs;
    private Paging paging;
}