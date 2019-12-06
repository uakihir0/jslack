package com.github.seratch.jslack.lightning.model.builtin;

import com.github.seratch.jslack.lightning.model.Bot;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DefaultBot implements Bot {

    private String enterpriseId;
    private String teamId;
    private String teamName;

    private String scope;

    private String botId;
    private String botUserId;
    private String botScope;
    private String botAccessToken;

    private Long installedAt;
}
