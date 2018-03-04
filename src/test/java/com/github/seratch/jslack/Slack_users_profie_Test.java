package com.github.seratch.jslack;

import com.github.seratch.jslack.api.methods.SlackApiException;
import com.github.seratch.jslack.api.methods.request.users.profile.UsersProfileGetRequest;
import com.github.seratch.jslack.api.methods.request.users.profile.UsersProfileSetRequest;
import com.github.seratch.jslack.api.methods.response.users.profile.UsersProfileGetResponse;
import com.github.seratch.jslack.api.methods.response.users.profile.UsersProfileSetResponse;
import com.github.seratch.jslack.api.model.User;
import org.junit.Test;
import org.slf4j.Logger;

import java.io.IOException;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;

public class Slack_users_profie_Test {

    private static final Logger log = org.slf4j.LoggerFactory.getLogger(Slack_users_profie_Test.class);
    Slack slack = Slack.getInstance();

    @Test
    public void usersProfile() throws IOException, SlackApiException {
        String token = System.getenv(Constants.SLACK_TEST_OAUTH_ACCESS_TOKEN);

        {
            UsersProfileGetResponse response = slack.methods().usersProfileGet(UsersProfileGetRequest.builder().token(token).build());
            assertThat(response.isOk(), is(true));
            assertThat(response.getProfile(), is(notNullValue()));
        }

        {
            UsersProfileSetResponse response = slack.methods().usersProfileSet(
                    UsersProfileSetRequest.builder().token(token).name("skype").value("skype-" + System.currentTimeMillis()).build());
            assertThat(response.isOk(), is(true));
            assertThat(response.getProfile(), is(notNullValue()));
        }

        {
            User.Profile profile = new User.Profile();
            profile.setSkype("skype-" + System.currentTimeMillis());
            UsersProfileSetResponse response = slack.methods().usersProfileSet(
                    UsersProfileSetRequest.builder().token(token).profile(profile).build());
            assertThat(response.isOk(), is(true));
            assertThat(response.getProfile(), is(notNullValue()));
        }
    }

}