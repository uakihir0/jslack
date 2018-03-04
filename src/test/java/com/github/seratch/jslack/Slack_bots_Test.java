package com.github.seratch.jslack;

import com.github.seratch.jslack.api.methods.SlackApiException;
import com.github.seratch.jslack.api.methods.request.bots.BotsInfoRequest;
import com.github.seratch.jslack.api.methods.response.bots.BotsInfoResponse;
import org.junit.Test;
import org.slf4j.Logger;

import java.io.IOException;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;

public class Slack_bots_Test {

    private static final Logger log = org.slf4j.LoggerFactory.getLogger(Slack_bots_Test.class);
    Slack slack = Slack.getInstance();

    @Test
    public void botsInfo() throws IOException, SlackApiException {
        String token = System.getenv(Constants.SLACK_TEST_OAUTH_ACCESS_TOKEN);
        String bot = "B03E94MLG"; // hard coded
        BotsInfoResponse response = slack.methods().botsInfo(BotsInfoRequest.builder().token(token).bot(bot).build());
        assertThat(response.isOk(), is(true));
        assertThat(response.getBot(), is(notNullValue()));
    }

}