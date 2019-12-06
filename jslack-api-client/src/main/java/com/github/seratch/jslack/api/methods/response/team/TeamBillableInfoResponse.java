package com.github.seratch.jslack.api.methods.response.team;

import com.github.seratch.jslack.api.methods.SlackApiResponse;
import com.github.seratch.jslack.api.model.BillableInfo;
import lombok.Getter;
import lombok.Setter;

import java.util.Map;

@Getter
@Setter
public class TeamBillableInfoResponse implements SlackApiResponse {

    private boolean ok;
    private String warning;
    private String error;
    private String needed;
    private String provided;

    private Map<String, BillableInfo> billableInfo;
}