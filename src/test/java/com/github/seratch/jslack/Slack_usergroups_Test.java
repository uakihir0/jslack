package com.github.seratch.jslack;

import com.github.seratch.jslack.api.methods.request.usergroups.UsergroupsCreateRequest;
import com.github.seratch.jslack.api.methods.request.usergroups.UsergroupsListRequest;
import com.github.seratch.jslack.api.methods.request.usergroups.users.UsergroupUsersListRequest;
import com.github.seratch.jslack.api.methods.response.usergroups.UsergroupsCreateResponse;
import com.github.seratch.jslack.api.methods.response.usergroups.UsergroupsListResponse;
import com.github.seratch.jslack.api.methods.response.usergroups.users.UsergroupUsersListResponse;
import org.junit.Test;
import org.slf4j.Logger;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;

public class Slack_usergroups_Test {

    private static final Logger log = org.slf4j.LoggerFactory.getLogger(Slack_usergroups_Test.class);
    Slack slack = Slack.getInstance();
    String token = System.getenv(Constants.SLACK_TEST_OAUTH_ACCESS_TOKEN);

    @Test
    public void create() throws Exception {
        UsergroupsCreateResponse response = slack.methods().usergroupsCreate(UsergroupsCreateRequest.builder()
                .token(token)
                .name("usergroup-" + System.currentTimeMillis())
                .build());
        assertThat(response.isOk(), is(false));
        assertThat(response.getError(), is(anyOf(
                // For a good old token, "paid_teams_only" can be returned as the error
                equalTo("paid_teams_only"),
                // As of 2018, this code is generally returned for newly created token
                equalTo("missing_scope")
        )));
    }

    @Test
    public void list() throws Exception {
        UsergroupsListResponse response = slack.methods().usergroupsList(UsergroupsListRequest.builder().token(token).build());
        assertThat(response.isOk(), is(true));
    }

    @Test
    public void users() throws Exception {
        UsergroupUsersListResponse response = slack.methods().usergroupUsersList(
                UsergroupUsersListRequest.builder()
                        .token(token)
                        .usergroup("dummy")
                        .build());
        assertThat(response.isOk(), is(false));
        assertThat(response.getError(), is("missing_required_argument"));
    }

}