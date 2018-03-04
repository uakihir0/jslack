package com.github.seratch.jslack;

import com.github.seratch.jslack.api.methods.SlackApiException;
import com.github.seratch.jslack.api.methods.request.dnd.DndInfoRequest;
import com.github.seratch.jslack.api.methods.request.dnd.DndTeamInfoRequest;
import com.github.seratch.jslack.api.methods.request.users.UsersListRequest;
import com.github.seratch.jslack.api.methods.response.dnd.DndInfoResponse;
import com.github.seratch.jslack.api.methods.response.dnd.DndTeamInfoResponse;
import com.github.seratch.jslack.api.model.User;
import org.junit.Test;
import org.slf4j.Logger;

import java.io.IOException;
import java.util.List;

import static java.util.stream.Collectors.toList;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;

public class Slack_dnd_Test {

    private static final Logger log = org.slf4j.LoggerFactory.getLogger(Slack_dnd_Test.class);
    Slack slack = Slack.getInstance();

    @Test
    public void dnd() throws IOException, SlackApiException {
        String token = System.getenv(Constants.SLACK_TEST_OAUTH_ACCESS_TOKEN);

        List<User> members = slack.methods().usersList(UsersListRequest.builder().token(token).presence(1).build()).getMembers();
        {
            String user = members.get(0).getId();
            DndInfoResponse response = slack.methods().dndInfo(DndInfoRequest.builder().token(token).user(user).build());
            assertThat(response.isOk(), is(true));
            assertThat(response.getNextDndStartTs(), is(notNullValue()));
        }

        {
            List<String> users = members.stream().map(m -> m.getId()).collect(toList());
            DndTeamInfoResponse response = slack.methods().dndTeamInfo(DndTeamInfoRequest.builder().token(token).users(users).build());
            assertThat(response.isOk(), is(true));
            assertThat(response.getUsers(), is(notNullValue()));
        }
    }

}