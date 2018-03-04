package com.github.seratch.jslack;

import com.github.seratch.jslack.api.methods.SlackApiException;
import com.github.seratch.jslack.api.methods.request.oauth.OAuthAccessRequest;
import com.github.seratch.jslack.api.methods.response.oauth.OAuthAccessResponse;
import org.junit.Test;
import org.slf4j.Logger;

import java.io.IOException;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class Slack_oauth_Test {

    private static final Logger log = org.slf4j.LoggerFactory.getLogger(Slack_oauth_Test.class);
    Slack slack = Slack.getInstance();

    @Test
    public void test() throws IOException, SlackApiException {
        {
            OAuthAccessResponse response = slack.methods().oauthAccess(OAuthAccessRequest.builder()
                    .clientId("3485157640.XXXX")
                    .clientSecret("XXXXX")
                    .code("")
                    .redirectUri("http://seratch.net/foo")
                    .build());
            assertThat(response.isOk(), is(false));
        }
    }

}