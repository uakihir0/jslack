package com.github.seratch.jslack;

import com.github.seratch.jslack.api.methods.request.reminders.RemindersAddRequest;
import com.github.seratch.jslack.api.methods.request.reminders.RemindersCompleteRequest;
import com.github.seratch.jslack.api.methods.request.reminders.RemindersDeleteRequest;
import com.github.seratch.jslack.api.methods.request.reminders.RemindersInfoRequest;
import com.github.seratch.jslack.api.methods.response.reminders.RemindersAddResponse;
import com.github.seratch.jslack.api.methods.response.reminders.RemindersCompleteResponse;
import com.github.seratch.jslack.api.methods.response.reminders.RemindersDeleteResponse;
import com.github.seratch.jslack.api.methods.response.reminders.RemindersInfoResponse;
import org.junit.Test;
import org.slf4j.Logger;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class Slack_reminders_Test {

    private static final Logger log = org.slf4j.LoggerFactory.getLogger(Slack_reminders_Test.class);
    Slack slack = new Slack();
    String token = System.getenv(Constants.SLACK_TEST_OAUTH_ACCESS_TOKEN);

    @Test
    public void test() throws Exception {
        RemindersAddResponse addResponse = slack.methods().remindersAdd(RemindersAddRequest.builder()
                .token(token)
                .text("Don't forget it!")
                .time("10")
                .build());
        assertThat(addResponse.isOk(), is(true));

        String reminderId = addResponse.getReminder().getId();

        RemindersInfoResponse infoResponse = slack.methods().remindersInfo(RemindersInfoRequest.builder()
                .token(token)
                .reminder(reminderId)
                .build());
        assertThat(infoResponse.isOk(), is(true));

        RemindersCompleteResponse completeResponse = slack.methods().remindersComplete(RemindersCompleteRequest.builder()
                .token(token)
                .reminder(reminderId)
                .build());
        assertThat(completeResponse.isOk(), is(true));

        RemindersDeleteResponse deleteResponse = slack.methods().remindersDelete(RemindersDeleteRequest.builder()
                .token(token)
                .reminder(reminderId)
                .build());
        assertThat(deleteResponse.isOk(), is(true));
    }

}