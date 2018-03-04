package com.github.seratch.jslack;

import com.github.seratch.jslack.api.methods.SlackApiException;
import com.github.seratch.jslack.api.methods.request.emoji.EmojiListRequest;
import com.github.seratch.jslack.api.methods.response.emoji.EmojiListResponse;
import org.junit.Test;
import org.slf4j.Logger;

import java.io.IOException;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;

public class Slack_emoji_Test {

    private static final Logger log = org.slf4j.LoggerFactory.getLogger(Slack_emoji_Test.class);
    Slack slack = Slack.getInstance();

    @Test
    public void emoji() throws IOException, SlackApiException {
        String token = System.getenv(Constants.SLACK_TEST_OAUTH_ACCESS_TOKEN);
        {
            EmojiListResponse response = slack.methods().emojiList(EmojiListRequest.builder().token(token).build());
            assertThat(response.isOk(), is(true));
            assertThat(response.getEmoji(), is(notNullValue()));
        }
    }

}