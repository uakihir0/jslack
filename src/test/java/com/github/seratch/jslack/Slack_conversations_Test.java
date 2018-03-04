package com.github.seratch.jslack;

import com.github.seratch.jslack.api.methods.SlackApiException;
import com.github.seratch.jslack.api.methods.request.conversations.*;
import com.github.seratch.jslack.api.methods.request.users.UsersListRequest;
import com.github.seratch.jslack.api.methods.response.conversations.*;
import com.github.seratch.jslack.api.methods.response.users.UsersListResponse;
import com.github.seratch.jslack.api.model.Conversation;
import com.github.seratch.jslack.api.model.ConversationType;
import com.github.seratch.jslack.api.model.User;
import org.junit.Test;
import org.slf4j.Logger;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;

public class Slack_conversations_Test {

    private static final Logger log = org.slf4j.LoggerFactory.getLogger(Slack_conversations_Test.class);
    Slack slack = Slack.getInstance();
    String token = System.getenv(Constants.SLACK_TEST_OAUTH_ACCESS_TOKEN);

    @Test
    public void channelConversation() throws IOException, SlackApiException {

        {
            ConversationsListResponse listResponse = slack.methods().conversationsList(
                    ConversationsListRequest.builder()
                            .token(token)
                            .excludeArchived(true)
                            .limit(10)
                            .types(Arrays.asList(ConversationType.PUBLIC_CHANNEL))
                            .build());
            assertThat(listResponse.isOk(), is(true));
            assertThat(listResponse.getChannels(), is(notNullValue()));
        }

        ConversationsCreateResponse createPublicResponse = slack.methods().conversationsCreate(
                ConversationsCreateRequest.builder()
                        .token(token).name("test" + System.currentTimeMillis())
                        .isPrivate(false)
                        .build());
        assertThat(createPublicResponse.isOk(), is(true));
        assertThat(createPublicResponse.getChannel(), is(notNullValue()));
        assertThat(createPublicResponse.getChannel().isPrivate(), is(false));

        Conversation channel = createPublicResponse.getChannel();

        ConversationsCreateResponse createPrivateResponse = slack.methods().conversationsCreate(
                ConversationsCreateRequest.builder()
                        .token(token).name("test" + System.currentTimeMillis())
                        .isPrivate(true)
                        .build());
        assertThat(createPrivateResponse.isOk(), is(true));
        assertThat(createPrivateResponse.getChannel(), is(notNullValue()));
        assertThat(createPrivateResponse.getChannel().isPrivate(), is(true));

        {
            ConversationsInfoResponse infoResponse = slack.methods().conversationsInfo(
                    ConversationsInfoRequest.builder()
                            .token(token)
                            .channel(channel.getId())
                            .includeLocale(true)
                            .build());
            assertThat(infoResponse.isOk(), is(true));
            Conversation fetchedConversation = infoResponse.getChannel();
            assertThat(fetchedConversation.isMember(), is(true));
            assertThat(fetchedConversation.isGeneral(), is(false));
            assertThat(fetchedConversation.isArchived(), is(false));
            assertThat(fetchedConversation.isIm(), is(false));
            assertThat(fetchedConversation.isMpim(), is(false));
            assertThat(fetchedConversation.isGroup(), is(false));

        }

        {
            ConversationsSetPurposeResponse setPurposeResponse = slack.methods().conversationsSetPurpose(
                    ConversationsSetPurposeRequest.builder()
                            .token(token)
                            .channel(channel.getId())
                            .purpose("purpose")
                            .build());
            assertThat(setPurposeResponse.isOk(), is(true));
            assertThat(setPurposeResponse.getChannel().getPurpose().getValue(), is("purpose"));
        }

        {
            ConversationsSetTopicResponse setTopicResponse = slack.methods().conversationsSetTopic(
                    ConversationsSetTopicRequest.builder()
                            .token(token)
                            .channel(channel.getId())
                            .topic("topic")
                            .build());
            assertThat(setTopicResponse.isOk(), is(true));
            assertThat(setTopicResponse.getChannel().getTopic().getValue(), is("topic"));
        }

        {
            ConversationsHistoryResponse historyResponse = slack.methods().conversationsHistory(
                    ConversationsHistoryRequest.builder()
                            .token(token)
                            .channel(channel.getId())
                            .limit(10)
                            .build());
            assertThat(historyResponse.isOk(), is(true));
            assertThat(historyResponse.isHasMore(), is(false));
        }

        {
            ConversationsMembersResponse membersResponse = slack.methods().conversationsMembers(
                    ConversationsMembersRequest.builder()
                            .token(token)
                            .channel(channel.getId())
                            .build());
            assertThat(membersResponse.isOk(), is(true));
            assertThat(membersResponse.getMembers(), is(notNullValue()));
            assertThat(membersResponse.getMembers().isEmpty(), is(false));

            UsersListResponse usersListResponse = slack.methods().usersList(
                    UsersListRequest.builder().token(token).build());
            String invitee = null;
            for (User user : usersListResponse.getMembers()) {
                if (!membersResponse.getMembers().contains(user.getId())) {
                    invitee = user.getId();
                    break;
                }
            }

            ConversationsInviteResponse inviteResponse = slack.methods().conversationsInvite(
                    ConversationsInviteRequest.builder()
                            .token(token)
                            .channel(channel.getId())
                            .users(Arrays.asList(invitee))
                            .build());
            assertThat(inviteResponse.isOk(), is(true));

            ConversationsKickResponse kickResponse = slack.methods().conversationsKick(
                    ConversationsKickRequest.builder()
                            .token(token)
                            .channel(channel.getId())
                            .user(invitee)
                            .build());
            assertThat(kickResponse.isOk(), is(true));
        }

        {
            ConversationsLeaveResponse leaveResponse = slack.methods().conversationsLeave(
                    ConversationsLeaveRequest.builder()
                            .token(token)
                            .channel(channel.getId())
                            .build());
            assertThat(leaveResponse.isOk(), is(true));
        }

        {
            ConversationsJoinResponse joinResponse = slack.methods().conversationsJoin(
                    ConversationsJoinRequest.builder()
                            .token(token)
                            .channel(channel.getId())
                            .build());
            assertThat(joinResponse.isOk(), is(true));
        }

        {
            ConversationsRenameResponse renameResponse = slack.methods().conversationsRename(
                    ConversationsRenameRequest.builder()
                            .token(token)
                            .channel(channel.getId())
                            .name(channel.getName() + "-1")
                            .build());
            assertThat(renameResponse.isOk(), is(true));
        }

        {
            ConversationsArchiveResponse archieveResponse = slack.methods().conversationsArchive(
                    ConversationsArchiveRequest.builder()
                            .token(token)
                            .channel(channel.getId())
                            .build());
            assertThat(archieveResponse.isOk(), is(true));
        }

        {
            ConversationsInfoResponse infoResponse = slack.methods().conversationsInfo(
                    ConversationsInfoRequest.builder()
                            .token(token)
                            .channel(channel.getId())
                            .build());
            assertThat(infoResponse.isOk(), is(true));
            Conversation fetchedChannel = infoResponse.getChannel();
            assertThat(fetchedChannel.isMember(), is(false));
            assertThat(fetchedChannel.isGeneral(), is(false));
            assertThat(fetchedChannel.isArchived(), is(true));
        }
    }

    @Test
    public void imConversation() throws IOException, SlackApiException {

        UsersListResponse usersListResponse = slack.methods().usersList(
                UsersListRequest.builder().token(token).build());
        List<User> users = usersListResponse.getMembers();
        String userId = users.get(0).getId();

        ConversationsOpenResponse openResponse = slack.methods().conversationsOpen(
                ConversationsOpenRequest.builder()
                        .token(token)
                        .users(Arrays.asList(userId))
                        .returnIm(true)
                        .build());
        assertThat(openResponse.isOk(), is(true));

        ConversationsMembersResponse membersResponse = slack.methods().conversationsMembers(
                ConversationsMembersRequest.builder()
                        .token(token)
                        .channel(openResponse.getChannel().getId())
                        .build());
        assertThat(membersResponse.isOk(), is(true));
        assertThat(membersResponse.getMembers(), is(notNullValue()));
        assertThat(membersResponse.getMembers().isEmpty(), is(false));

        ConversationsCloseResponse closeResponse = slack.methods().conversationsClose(
                ConversationsCloseRequest.builder().token(token).channel(openResponse.getChannel().getId()).build());
        assertThat(closeResponse.isOk(), is(true));
    }
}
