package com.github.seratch.jslack.api.methods.impl;

import com.github.seratch.jslack.api.methods.Methods;
import com.github.seratch.jslack.api.methods.MethodsClient;
import com.github.seratch.jslack.api.methods.RequestConfigurator;
import com.github.seratch.jslack.api.methods.SlackApiException;
import com.github.seratch.jslack.api.methods.request.api.ApiTestRequest;
import com.github.seratch.jslack.api.methods.request.apps.AppsUninstallRequest;
import com.github.seratch.jslack.api.methods.request.apps.permissions.AppsPermissionsInfoRequest;
import com.github.seratch.jslack.api.methods.request.apps.permissions.AppsPermissionsRequestRequest;
import com.github.seratch.jslack.api.methods.request.apps.permissions.resources.AppsPermissionsResourcesListRequest;
import com.github.seratch.jslack.api.methods.request.apps.permissions.scopes.AppsPermissionsScopesListRequest;
import com.github.seratch.jslack.api.methods.request.apps.permissions.users.AppsPermissionsUsersListRequest;
import com.github.seratch.jslack.api.methods.request.apps.permissions.users.AppsPermissionsUsersRequestRequest;
import com.github.seratch.jslack.api.methods.request.auth.AuthRevokeRequest;
import com.github.seratch.jslack.api.methods.request.auth.AuthTestRequest;
import com.github.seratch.jslack.api.methods.request.bots.BotsInfoRequest;
import com.github.seratch.jslack.api.methods.request.channels.*;
import com.github.seratch.jslack.api.methods.request.chat.*;
import com.github.seratch.jslack.api.methods.request.chat.scheduled_messages.ChatScheduleMessagesListRequest;
import com.github.seratch.jslack.api.methods.request.conversations.*;
import com.github.seratch.jslack.api.methods.request.dialog.DialogOpenRequest;
import com.github.seratch.jslack.api.methods.request.dnd.*;
import com.github.seratch.jslack.api.methods.request.emoji.EmojiListRequest;
import com.github.seratch.jslack.api.methods.request.files.*;
import com.github.seratch.jslack.api.methods.request.files.comments.FilesCommentsAddRequest;
import com.github.seratch.jslack.api.methods.request.files.comments.FilesCommentsDeleteRequest;
import com.github.seratch.jslack.api.methods.request.files.comments.FilesCommentsEditRequest;
import com.github.seratch.jslack.api.methods.request.groups.*;
import com.github.seratch.jslack.api.methods.request.im.*;
import com.github.seratch.jslack.api.methods.request.migration.MigrationExchangeRequest;
import com.github.seratch.jslack.api.methods.request.mpim.*;
import com.github.seratch.jslack.api.methods.request.oauth.OAuthAccessRequest;
import com.github.seratch.jslack.api.methods.request.oauth.OAuthTokenRequest;
import com.github.seratch.jslack.api.methods.request.pins.PinsAddRequest;
import com.github.seratch.jslack.api.methods.request.pins.PinsListRequest;
import com.github.seratch.jslack.api.methods.request.pins.PinsRemoveRequest;
import com.github.seratch.jslack.api.methods.request.reactions.ReactionsAddRequest;
import com.github.seratch.jslack.api.methods.request.reactions.ReactionsGetRequest;
import com.github.seratch.jslack.api.methods.request.reactions.ReactionsListRequest;
import com.github.seratch.jslack.api.methods.request.reactions.ReactionsRemoveRequest;
import com.github.seratch.jslack.api.methods.request.reminders.*;
import com.github.seratch.jslack.api.methods.request.rtm.RTMConnectRequest;
import com.github.seratch.jslack.api.methods.request.rtm.RTMStartRequest;
import com.github.seratch.jslack.api.methods.request.search.SearchAllRequest;
import com.github.seratch.jslack.api.methods.request.search.SearchFilesRequest;
import com.github.seratch.jslack.api.methods.request.search.SearchMessagesRequest;
import com.github.seratch.jslack.api.methods.request.stars.StarsAddRequest;
import com.github.seratch.jslack.api.methods.request.stars.StarsListRequest;
import com.github.seratch.jslack.api.methods.request.stars.StarsRemoveRequest;
import com.github.seratch.jslack.api.methods.request.team.TeamAccessLogsRequest;
import com.github.seratch.jslack.api.methods.request.team.TeamBillableInfoRequest;
import com.github.seratch.jslack.api.methods.request.team.TeamInfoRequest;
import com.github.seratch.jslack.api.methods.request.team.TeamIntegrationLogsRequest;
import com.github.seratch.jslack.api.methods.request.team.profile.TeamProfileGetRequest;
import com.github.seratch.jslack.api.methods.request.usergroups.*;
import com.github.seratch.jslack.api.methods.request.usergroups.users.UsergroupUsersListRequest;
import com.github.seratch.jslack.api.methods.request.usergroups.users.UsergroupUsersUpdateRequest;
import com.github.seratch.jslack.api.methods.request.users.*;
import com.github.seratch.jslack.api.methods.request.users.profile.UsersProfileGetRequest;
import com.github.seratch.jslack.api.methods.request.users.profile.UsersProfileSetRequest;
import com.github.seratch.jslack.api.methods.response.api.ApiTestResponse;
import com.github.seratch.jslack.api.methods.response.apps.AppsUninstallResponse;
import com.github.seratch.jslack.api.methods.response.apps.permissions.AppsPermissionsInfoResponse;
import com.github.seratch.jslack.api.methods.response.apps.permissions.AppsPermissionsRequestResponse;
import com.github.seratch.jslack.api.methods.response.apps.permissions.resources.AppsPermissionsResourcesListResponse;
import com.github.seratch.jslack.api.methods.response.apps.permissions.scopes.AppsPermissionsScopesListResponse;
import com.github.seratch.jslack.api.methods.response.apps.permissions.users.AppsPermissionsUsersListResponse;
import com.github.seratch.jslack.api.methods.response.apps.permissions.users.AppsPermissionsUsersRequestResponse;
import com.github.seratch.jslack.api.methods.response.auth.AuthRevokeResponse;
import com.github.seratch.jslack.api.methods.response.auth.AuthTestResponse;
import com.github.seratch.jslack.api.methods.response.bots.BotsInfoResponse;
import com.github.seratch.jslack.api.methods.response.channels.*;
import com.github.seratch.jslack.api.methods.response.chat.*;
import com.github.seratch.jslack.api.methods.response.chat.scheduled_messages.ChatScheduleMessagesListResponse;
import com.github.seratch.jslack.api.methods.response.conversations.*;
import com.github.seratch.jslack.api.methods.response.dialog.DialogOpenResponse;
import com.github.seratch.jslack.api.methods.response.dnd.*;
import com.github.seratch.jslack.api.methods.response.emoji.EmojiListResponse;
import com.github.seratch.jslack.api.methods.response.files.*;
import com.github.seratch.jslack.api.methods.response.files.comments.FilesCommentsAddResponse;
import com.github.seratch.jslack.api.methods.response.files.comments.FilesCommentsDeleteResponse;
import com.github.seratch.jslack.api.methods.response.files.comments.FilesCommentsEditResponse;
import com.github.seratch.jslack.api.methods.response.groups.*;
import com.github.seratch.jslack.api.methods.response.im.*;
import com.github.seratch.jslack.api.methods.response.migration.MigrationExchangeResponse;
import com.github.seratch.jslack.api.methods.response.mpim.*;
import com.github.seratch.jslack.api.methods.response.oauth.OAuthAccessResponse;
import com.github.seratch.jslack.api.methods.response.oauth.OAuthTokenResponse;
import com.github.seratch.jslack.api.methods.response.pins.PinsAddResponse;
import com.github.seratch.jslack.api.methods.response.pins.PinsListResponse;
import com.github.seratch.jslack.api.methods.response.pins.PinsRemoveResponse;
import com.github.seratch.jslack.api.methods.response.reactions.ReactionsAddResponse;
import com.github.seratch.jslack.api.methods.response.reactions.ReactionsGetResponse;
import com.github.seratch.jslack.api.methods.response.reactions.ReactionsListResponse;
import com.github.seratch.jslack.api.methods.response.reactions.ReactionsRemoveResponse;
import com.github.seratch.jslack.api.methods.response.reminders.*;
import com.github.seratch.jslack.api.methods.response.rtm.RTMConnectResponse;
import com.github.seratch.jslack.api.methods.response.rtm.RTMStartResponse;
import com.github.seratch.jslack.api.methods.response.search.SearchAllResponse;
import com.github.seratch.jslack.api.methods.response.search.SearchFilesResponse;
import com.github.seratch.jslack.api.methods.response.search.SearchMessagesResponse;
import com.github.seratch.jslack.api.methods.response.stars.StarsAddResponse;
import com.github.seratch.jslack.api.methods.response.stars.StarsListResponse;
import com.github.seratch.jslack.api.methods.response.stars.StarsRemoveResponse;
import com.github.seratch.jslack.api.methods.response.team.TeamAccessLogsResponse;
import com.github.seratch.jslack.api.methods.response.team.TeamBillableInfoResponse;
import com.github.seratch.jslack.api.methods.response.team.TeamInfoResponse;
import com.github.seratch.jslack.api.methods.response.team.TeamIntegrationLogsResponse;
import com.github.seratch.jslack.api.methods.response.team.profile.TeamProfileGetResponse;
import com.github.seratch.jslack.api.methods.response.usergroups.*;
import com.github.seratch.jslack.api.methods.response.usergroups.users.UsergroupUsersListResponse;
import com.github.seratch.jslack.api.methods.response.usergroups.users.UsergroupUsersUpdateResponse;
import com.github.seratch.jslack.api.methods.response.users.*;
import com.github.seratch.jslack.api.methods.response.users.profile.UsersProfileGetResponse;
import com.github.seratch.jslack.api.methods.response.users.profile.UsersProfileSetResponse;
import com.github.seratch.jslack.common.http.SlackHttpClient;
import net.socialhub.logger.Logger;
import okhttp3.FormBody;
import okhttp3.MultipartBody;
import okhttp3.Response;

import java.io.IOException;

import static com.github.seratch.jslack.api.methods.RequestFormBuilder.toForm;
import static com.github.seratch.jslack.api.methods.RequestFormBuilder.toMultipartBody;

public class MethodsClientImpl implements MethodsClient {

    private static final Logger log = Logger.getLogger(MethodsClientImpl.class);
    private String endpointUrlPrefix = "https://slack.com/api/";

    private final SlackHttpClient slackHttpClient;

    public MethodsClientImpl(SlackHttpClient slackHttpClient) {
        this.slackHttpClient = slackHttpClient;
    }

    @Override
    public void setEndpointUrlPrefix(String endpointUrlPrefix) {
        this.endpointUrlPrefix = endpointUrlPrefix;
    }

    // ----------------------------------------------------------------------------------
    // public methods
    // ----------------------------------------------------------------------------------

    @Override
    public ApiTestResponse apiTest(ApiTestRequest req) throws IOException, SlackApiException {
        return doPostForm(toForm(req), Methods.API_TEST, ApiTestResponse.class);
    }

    @Override
    public ApiTestResponse apiTest(RequestConfigurator<ApiTestRequest.ApiTestRequestBuilder> req) throws IOException, SlackApiException {
        return apiTest(req.configure(ApiTestRequest.builder()).build());
    }

    @Override
    public AppsUninstallResponse appsUninstall(AppsUninstallRequest req) throws IOException, SlackApiException {
        return doPostFormWithToken(toForm(req), Methods.APPS_UNINSTALL, req.getToken(), AppsUninstallResponse.class);
    }

    @Override
    public AppsUninstallResponse appsUninstall(RequestConfigurator<AppsUninstallRequest.AppsUninstallRequestBuilder> req) throws IOException, SlackApiException {
        return appsUninstall(req.configure(AppsUninstallRequest.builder()).build());
    }

    @Override
    public AppsPermissionsInfoResponse appsPermissionsInfo(AppsPermissionsInfoRequest req) throws IOException, SlackApiException {
        return doPostFormWithToken(toForm(req), Methods.APPS_PERMISSIONS_INFO, req.getToken(), AppsPermissionsInfoResponse.class);
    }

    @Override
    public AppsPermissionsInfoResponse appsPermissionsInfo(RequestConfigurator<AppsPermissionsInfoRequest.AppsPermissionsInfoRequestBuilder> req) throws IOException, SlackApiException {
        return appsPermissionsInfo(req.configure(AppsPermissionsInfoRequest.builder()).build());
    }

    @Override
    public AppsPermissionsRequestResponse appsPermissionsRequest(AppsPermissionsRequestRequest req) throws IOException, SlackApiException {
        return doPostFormWithToken(toForm(req), Methods.APPS_PERMISSIONS_REQUEST, req.getToken(), AppsPermissionsRequestResponse.class);
    }

    @Override
    public AppsPermissionsRequestResponse appsPermissionsRequest(RequestConfigurator<AppsPermissionsRequestRequest.AppsPermissionsRequestRequestBuilder> req) throws IOException, SlackApiException {
        return appsPermissionsRequest(req.configure(AppsPermissionsRequestRequest.builder()).build());
    }

    @Override
    public AppsPermissionsResourcesListResponse appsPermissionsResourcesList(AppsPermissionsResourcesListRequest req) throws IOException, SlackApiException {
        return doPostFormWithToken(toForm(req), Methods.APPS_PERMISSIONS_RESOURCES_LIST, req.getToken(), AppsPermissionsResourcesListResponse.class);
    }

    @Override
    public AppsPermissionsScopesListResponse appsPermissionsScopesList(AppsPermissionsScopesListRequest req) throws IOException, SlackApiException {
        return doPostFormWithToken(toForm(req), Methods.APPS_PERMISSIONS_SCOPES_LIST, req.getToken(), AppsPermissionsScopesListResponse.class);
    }

    @Override
    public AppsPermissionsUsersListResponse appsPermissionsUsersList(AppsPermissionsUsersListRequest req) throws IOException, SlackApiException {
        return doPostFormWithToken(toForm(req), Methods.APPS_PERMISSIONS_USERS_LIST, req.getToken(), AppsPermissionsUsersListResponse.class);
    }

    @Override
    public AppsPermissionsUsersRequestResponse appsPermissionsUsersRequest(AppsPermissionsUsersRequestRequest req) throws IOException, SlackApiException {
        return doPostFormWithToken(toForm(req), Methods.APPS_PERMISSIONS_USERS_REQUEST, req.getToken(), AppsPermissionsUsersRequestResponse.class);
    }

    @Override
    public AuthRevokeResponse authRevoke(AuthRevokeRequest req) throws IOException, SlackApiException {
        return doPostFormWithToken(toForm(req), Methods.AUTH_REVOKE, req.getToken(), AuthRevokeResponse.class);
    }

    @Override
    public AuthRevokeResponse authRevoke(RequestConfigurator<AuthRevokeRequest.AuthRevokeRequestBuilder> req) throws IOException, SlackApiException {
        return authRevoke(req.configure(AuthRevokeRequest.builder()).build());
    }

    @Override
    public AuthTestResponse authTest(AuthTestRequest req) throws IOException, SlackApiException {
        return doPostFormWithToken(toForm(req), Methods.AUTH_TEST, req.getToken(), AuthTestResponse.class);
    }

    @Override
    public AuthTestResponse authTest(RequestConfigurator<AuthTestRequest.AuthTestRequestBuilder> req) throws IOException, SlackApiException {
        return authTest(req.configure(AuthTestRequest.builder()).build());
    }

    @Override
    public BotsInfoResponse botsInfo(BotsInfoRequest req) throws IOException, SlackApiException {
        return doPostFormWithToken(toForm(req), Methods.BOTS_INFO, req.getToken(), BotsInfoResponse.class);
    }

    @Override
    public BotsInfoResponse botsInfo(RequestConfigurator<BotsInfoRequest.BotsInfoRequestBuilder> req) throws IOException, SlackApiException {
        return botsInfo(req.configure(BotsInfoRequest.builder()).build());
    }

    @Override
    public ChannelsArchiveResponse channelsArchive(ChannelsArchiveRequest req) throws IOException, SlackApiException {
        return doPostFormWithToken(toForm(req), Methods.CHANNELS_ARCHIVE, req.getToken(), ChannelsArchiveResponse.class);
    }

    @Override
    public ChannelsArchiveResponse channelsArchive(RequestConfigurator<ChannelsArchiveRequest.ChannelsArchiveRequestBuilder> req) throws IOException, SlackApiException {
        return channelsArchive(req.configure(ChannelsArchiveRequest.builder()).build());
    }

    @Override
    public ChannelsCreateResponse channelsCreate(ChannelsCreateRequest req) throws IOException, SlackApiException {
        return doPostFormWithToken(toForm(req), Methods.CHANNELS_CREATE, req.getToken(), ChannelsCreateResponse.class);
    }

    @Override
    public ChannelsCreateResponse channelsCreate(RequestConfigurator<ChannelsCreateRequest.ChannelsCreateRequestBuilder> req) throws IOException, SlackApiException {
        return channelsCreate(req.configure(ChannelsCreateRequest.builder()).build());
    }

    @Override
    public ChannelsHistoryResponse channelsHistory(ChannelsHistoryRequest req) throws IOException, SlackApiException {
        return doPostFormWithToken(toForm(req), Methods.CHANNELS_HISTORY, req.getToken(), ChannelsHistoryResponse.class);
    }

    @Override
    public ChannelsHistoryResponse channelsHistory(RequestConfigurator<ChannelsHistoryRequest.ChannelsHistoryRequestBuilder> req) throws IOException, SlackApiException {
        return channelsHistory(req.configure(ChannelsHistoryRequest.builder()).build());
    }

    @Override
    public ChannelsRepliesResponse channelsReplies(ChannelsRepliesRequest req) throws IOException, SlackApiException {
        return doPostFormWithToken(toForm(req), Methods.CHANNELS_REPLIES, req.getToken(), ChannelsRepliesResponse.class);
    }

    @Override
    public ChannelsRepliesResponse channelsReplies(RequestConfigurator<ChannelsRepliesRequest.ChannelsRepliesRequestBuilder> req) throws IOException, SlackApiException {
        return channelsReplies(req.configure(ChannelsRepliesRequest.builder()).build());
    }

    @Override
    public ChannelsInfoResponse channelsInfo(ChannelsInfoRequest req) throws IOException, SlackApiException {
        return doPostFormWithToken(toForm(req), Methods.CHANNELS_INFO, req.getToken(), ChannelsInfoResponse.class);
    }

    @Override
    public ChannelsInfoResponse channelsInfo(RequestConfigurator<ChannelsInfoRequest.ChannelsInfoRequestBuilder> req) throws IOException, SlackApiException {
        return channelsInfo(req.configure(ChannelsInfoRequest.builder()).build());
    }

    @Override
    public ChannelsListResponse channelsList(ChannelsListRequest req) throws IOException, SlackApiException {
        return doPostFormWithToken(toForm(req), Methods.CHANNELS_LIST, req.getToken(), ChannelsListResponse.class);
    }

    @Override
    public ChannelsListResponse channelsList(RequestConfigurator<ChannelsListRequest.ChannelsListRequestBuilder> req) throws IOException, SlackApiException {
        return channelsList(req.configure(ChannelsListRequest.builder()).build());
    }

    @Override
    public ChannelsInviteResponse channelsInvite(ChannelsInviteRequest req) throws IOException, SlackApiException {
        return doPostFormWithToken(toForm(req), Methods.CHANNELS_INVITE, req.getToken(), ChannelsInviteResponse.class);
    }

    @Override
    public ChannelsInviteResponse channelsInvite(RequestConfigurator<ChannelsInviteRequest.ChannelsInviteRequestBuilder> req) throws IOException, SlackApiException {
        return channelsInvite(req.configure(ChannelsInviteRequest.builder()).build());
    }

    @Override
    public ChannelsJoinResponse channelsJoin(ChannelsJoinRequest req) throws IOException, SlackApiException {
        return doPostFormWithToken(toForm(req), Methods.CHANNELS_JOIN, req.getToken(), ChannelsJoinResponse.class);
    }

    @Override
    public ChannelsJoinResponse channelsJoin(RequestConfigurator<ChannelsJoinRequest.ChannelsJoinRequestBuilder> req) throws IOException, SlackApiException {
        return channelsJoin(req.configure(ChannelsJoinRequest.builder()).build());
    }

    @Override
    public ChannelsKickResponse channelsKick(ChannelsKickRequest req) throws IOException, SlackApiException {
        return doPostFormWithToken(toForm(req), Methods.CHANNELS_KICK, req.getToken(), ChannelsKickResponse.class);
    }

    @Override
    public ChannelsKickResponse channelsKick(RequestConfigurator<ChannelsKickRequest.ChannelsKickRequestBuilder> req) throws IOException, SlackApiException {
        return channelsKick(req.configure(ChannelsKickRequest.builder()).build());
    }

    @Override
    public ChannelsLeaveResponse channelsLeave(ChannelsLeaveRequest req) throws IOException, SlackApiException {
        return doPostFormWithToken(toForm(req), Methods.CHANNELS_LEAVE, req.getToken(), ChannelsLeaveResponse.class);
    }

    @Override
    public ChannelsLeaveResponse channelsLeave(RequestConfigurator<ChannelsLeaveRequest.ChannelsLeaveRequestBuilder> req) throws IOException, SlackApiException {
        return channelsLeave(req.configure(ChannelsLeaveRequest.builder()).build());
    }

    @Override
    public ChannelsMarkResponse channelsMark(ChannelsMarkRequest req) throws IOException, SlackApiException {
        return doPostFormWithToken(toForm(req), Methods.CHANNELS_MARK, req.getToken(), ChannelsMarkResponse.class);
    }

    @Override
    public ChannelsMarkResponse channelsMark(RequestConfigurator<ChannelsMarkRequest.ChannelsMarkRequestBuilder> req) throws IOException, SlackApiException {
        return channelsMark(req.configure(ChannelsMarkRequest.builder()).build());
    }

    @Override
    public ChannelsRenameResponse channelsRename(ChannelsRenameRequest req) throws IOException, SlackApiException {
        return doPostFormWithToken(toForm(req), Methods.CHANNELS_RENAME, req.getToken(), ChannelsRenameResponse.class);
    }

    @Override
    public ChannelsRenameResponse channelsRename(RequestConfigurator<ChannelsRenameRequest.ChannelsRenameRequestBuilder> req) throws IOException, SlackApiException {
        return channelsRename(req.configure(ChannelsRenameRequest.builder()).build());
    }

    @Override
    public ChannelsSetPurposeResponse channelsSetPurpose(ChannelsSetPurposeRequest req) throws IOException, SlackApiException {
        return doPostFormWithToken(toForm(req), Methods.CHANNELS_SET_PURPOSE, req.getToken(), ChannelsSetPurposeResponse.class);
    }

    @Override
    public ChannelsSetPurposeResponse channelsSetPurpose(RequestConfigurator<ChannelsSetPurposeRequest.ChannelsSetPurposeRequestBuilder> req) throws IOException, SlackApiException {
        return channelsSetPurpose(req.configure(ChannelsSetPurposeRequest.builder()).build());
    }

    @Override
    public ChannelsSetTopicResponse channelsSetTopic(ChannelsSetTopicRequest req) throws IOException, SlackApiException {
        return doPostFormWithToken(toForm(req), Methods.CHANNELS_SET_TOPIC, req.getToken(), ChannelsSetTopicResponse.class);
    }

    @Override
    public ChannelsSetTopicResponse channelsSetTopic(RequestConfigurator<ChannelsSetTopicRequest.ChannelsSetTopicRequestBuilder> req) throws IOException, SlackApiException {
        return channelsSetTopic(req.configure(ChannelsSetTopicRequest.builder()).build());
    }

    @Override
    public ChannelsUnarchiveResponse channelsUnarchive(ChannelsUnarchiveRequest req) throws IOException, SlackApiException {
        return doPostFormWithToken(toForm(req), Methods.CHANNELS_UNARCHIVE, req.getToken(), ChannelsUnarchiveResponse.class);
    }

    @Override
    public ChannelsUnarchiveResponse channelsUnarchive(RequestConfigurator<ChannelsUnarchiveRequest.ChannelsUnarchiveRequestBuilder> req) throws IOException, SlackApiException {
        return channelsUnarchive(req.configure(ChannelsUnarchiveRequest.builder()).build());
    }

    @Override
    public ChatGetPermalinkResponse chatGetPermalink(ChatGetPermalinkRequest req) throws IOException, SlackApiException {
        return doPostFormWithToken(toForm(req), Methods.CHAT_GET_PERMALINK, req.getToken(), ChatGetPermalinkResponse.class);
    }

    @Override
    public ChatGetPermalinkResponse chatGetPermalink(RequestConfigurator<ChatGetPermalinkRequest.ChatGetPermalinkRequestBuilder> req) throws IOException, SlackApiException {
        return chatGetPermalink(req.configure(ChatGetPermalinkRequest.builder()).build());
    }

    @Override
    public ChatDeleteResponse chatDelete(ChatDeleteRequest req) throws IOException, SlackApiException {
        return doPostFormWithToken(toForm(req), Methods.CHAT_DELETE, req.getToken(), ChatDeleteResponse.class);
    }

    @Override
    public ChatDeleteResponse chatDelete(RequestConfigurator<ChatDeleteRequest.ChatDeleteRequestBuilder> req) throws IOException, SlackApiException {
        return chatDelete(req.configure(ChatDeleteRequest.builder()).build());
    }

    @Override
    public ChatDeleteScheduledMessageResponse chatDeleteScheduledMessage(ChatDeleteScheduledMessageRequest req) throws IOException, SlackApiException {
        return doPostFormWithToken(toForm(req), Methods.CHAT_DELETE_SCHEDULED_MESSAGE, req.getToken(), ChatDeleteScheduledMessageResponse.class);
    }

    @Override
    public ChatDeleteScheduledMessageResponse chatDeleteScheduledMessage(RequestConfigurator<ChatDeleteScheduledMessageRequest.ChatDeleteScheduledMessageRequestBuilder> req) throws IOException, SlackApiException {
        return chatDeleteScheduledMessage(req.configure(ChatDeleteScheduledMessageRequest.builder()).build());
    }

    @Override
    public ChatMeMessageResponse chatMeMessage(ChatMeMessageRequest req) throws IOException, SlackApiException {
        return doPostFormWithToken(toForm(req), Methods.CHAT_ME_MESSAGE, req.getToken(), ChatMeMessageResponse.class);
    }

    @Override
    public ChatMeMessageResponse chatMeMessage(RequestConfigurator<ChatMeMessageRequest.ChatMeMessageRequestBuilder> req) throws IOException, SlackApiException {
        return chatMeMessage(req.configure(ChatMeMessageRequest.builder()).build());
    }

    @Override
    public ChatPostEphemeralResponse chatPostEphemeral(ChatPostEphemeralRequest req) throws IOException, SlackApiException {
        return doPostFormWithToken(toForm(req), Methods.CHAT_POST_EPHEMERAL, req.getToken(), ChatPostEphemeralResponse.class);
    }

    @Override
    public ChatPostEphemeralResponse chatPostEphemeral(RequestConfigurator<ChatPostEphemeralRequest.ChatPostEphemeralRequestBuilder> req) throws IOException, SlackApiException {
        return chatPostEphemeral(req.configure(ChatPostEphemeralRequest.builder()).build());
    }

    @Override
    public ChatPostMessageResponse chatPostMessage(ChatPostMessageRequest req) throws IOException, SlackApiException {
        return doPostFormWithToken(toForm(req), Methods.CHAT_POST_MESSAGE, req.getToken(), ChatPostMessageResponse.class);
    }

    @Override
    public ChatPostMessageResponse chatPostMessage(RequestConfigurator<ChatPostMessageRequest.ChatPostMessageRequestBuilder> req) throws IOException, SlackApiException {
        return chatPostMessage(req.configure(ChatPostMessageRequest.builder()).build());
    }

    @Override
    public ChatScheduleMessageResponse chatScheduleMessage(ChatScheduleMessageRequest req) throws IOException, SlackApiException {
        return doPostFormWithToken(toForm(req), Methods.CHAT_SCHEDULE_MESSAGE, req.getToken(), ChatScheduleMessageResponse.class);
    }

    @Override
    public ChatScheduleMessageResponse chatScheduleMessage(RequestConfigurator<ChatScheduleMessageRequest.ChatScheduleMessageRequestBuilder> req) throws IOException, SlackApiException {
        return chatScheduleMessage(req.configure(ChatScheduleMessageRequest.builder()).build());
    }

    @Override
    public ChatUpdateResponse chatUpdate(ChatUpdateRequest req) throws IOException, SlackApiException {
        return doPostFormWithToken(toForm(req), Methods.CHAT_UPDATE, req.getToken(), ChatUpdateResponse.class);
    }

    @Override
    public ChatUpdateResponse chatUpdate(RequestConfigurator<ChatUpdateRequest.ChatUpdateRequestBuilder> req) throws IOException, SlackApiException {
        return chatUpdate(req.configure(ChatUpdateRequest.builder()).build());
    }

    @Override
    public ChatUnfurlResponse chatUnfurl(ChatUnfurlRequest req) throws IOException, SlackApiException {
        return doPostFormWithToken(toForm(req), Methods.CHAT_UNFURL, req.getToken(), ChatUnfurlResponse.class);
    }

    @Override
    public ChatUnfurlResponse chatUnfurl(RequestConfigurator<ChatUnfurlRequest.ChatUnfurlRequestBuilder> req) throws IOException, SlackApiException {
        return chatUnfurl(req.configure(ChatUnfurlRequest.builder()).build());
    }

    @Override
    public ChatScheduleMessagesListResponse chatScheduleMessagesListMessage(ChatScheduleMessagesListRequest req) throws IOException, SlackApiException {
        return doPostFormWithToken(toForm(req), Methods.CHAT_SCHEDULED_MESSAGES_LIST, req.getToken(), ChatScheduleMessagesListResponse.class);
    }

    @Override
    public ChatScheduleMessagesListResponse chatScheduleMessagesListMessage(RequestConfigurator<ChatScheduleMessagesListRequest.ChatScheduleMessagesListRequestBuilder> req) throws IOException, SlackApiException {
        return chatScheduleMessagesListMessage(req.configure(ChatScheduleMessagesListRequest.builder()).build());
    }

    @Override
    public ConversationsArchiveResponse conversationsArchive(ConversationsArchiveRequest req)
            throws IOException, SlackApiException {
        return doPostFormWithToken(toForm(req), Methods.CONVERSATIONS_ARCHIVE, req.getToken(), ConversationsArchiveResponse.class);
    }

    @Override
    public ConversationsArchiveResponse conversationsArchive(RequestConfigurator<ConversationsArchiveRequest.ConversationsArchiveRequestBuilder> req) throws IOException, SlackApiException {
        return conversationsArchive(req.configure(ConversationsArchiveRequest.builder()).build());
    }

    @Override
    public ConversationsCloseResponse conversationsClose(ConversationsCloseRequest req)
            throws IOException, SlackApiException {
        return doPostFormWithToken(toForm(req), Methods.CONVERSATIONS_CLOSE, req.getToken(), ConversationsCloseResponse.class);
    }

    @Override
    public ConversationsCloseResponse conversationsClose(RequestConfigurator<ConversationsCloseRequest.ConversationsCloseRequestBuilder> req) throws IOException, SlackApiException {
        return conversationsClose(req.configure(ConversationsCloseRequest.builder()).build());
    }

    @Override
    public ConversationsCreateResponse conversationsCreate(ConversationsCreateRequest req)
            throws IOException, SlackApiException {
        return doPostFormWithToken(toForm(req), Methods.CONVERSATIONS_CREATE, req.getToken(), ConversationsCreateResponse.class);
    }

    @Override
    public ConversationsCreateResponse conversationsCreate(RequestConfigurator<ConversationsCreateRequest.ConversationsCreateRequestBuilder> req) throws IOException, SlackApiException {
        return conversationsCreate(req.configure(ConversationsCreateRequest.builder()).build());
    }

    @Override
    public ConversationsHistoryResponse conversationsHistory(ConversationsHistoryRequest req)
            throws IOException, SlackApiException {
        return doPostFormWithToken(toForm(req), Methods.CONVERSATIONS_HISTORY, req.getToken(), ConversationsHistoryResponse.class);
    }

    @Override
    public ConversationsHistoryResponse conversationsHistory(RequestConfigurator<ConversationsHistoryRequest.ConversationsHistoryRequestBuilder> req) throws IOException, SlackApiException {
        return conversationsHistory(req.configure(ConversationsHistoryRequest.builder()).build());
    }

    @Override
    public ConversationsInfoResponse conversationsInfo(ConversationsInfoRequest req)
            throws IOException, SlackApiException {
        return doPostFormWithToken(toForm(req), Methods.CONVERSATIONS_INFO, req.getToken(), ConversationsInfoResponse.class);
    }

    @Override
    public ConversationsInfoResponse conversationsInfo(RequestConfigurator<ConversationsInfoRequest.ConversationsInfoRequestBuilder> req) throws IOException, SlackApiException {
        return conversationsInfo(req.configure(ConversationsInfoRequest.builder()).build());
    }

    @Override
    public ConversationsInviteResponse conversationsInvite(ConversationsInviteRequest req)
            throws IOException, SlackApiException {
        return doPostFormWithToken(toForm(req), Methods.CONVERSATIONS_INVITE, req.getToken(), ConversationsInviteResponse.class);
    }

    @Override
    public ConversationsInviteResponse conversationsInvite(RequestConfigurator<ConversationsInviteRequest.ConversationsInviteRequestBuilder> req) throws IOException, SlackApiException {
        return conversationsInvite(req.configure(ConversationsInviteRequest.builder()).build());
    }

    @Override
    public ConversationsJoinResponse conversationsJoin(ConversationsJoinRequest req)
            throws IOException, SlackApiException {
        return doPostFormWithToken(toForm(req), Methods.CONVERSATIONS_JOIN, req.getToken(), ConversationsJoinResponse.class);
    }

    @Override
    public ConversationsJoinResponse conversationsJoin(RequestConfigurator<ConversationsJoinRequest.ConversationsJoinRequestBuilder> req) throws IOException, SlackApiException {
        return conversationsJoin(req.configure(ConversationsJoinRequest.builder()).build());
    }

    @Override
    public ConversationsKickResponse conversationsKick(ConversationsKickRequest req)
            throws IOException, SlackApiException {
        return doPostFormWithToken(toForm(req), Methods.CONVERSATIONS_KICK, req.getToken(), ConversationsKickResponse.class);
    }

    @Override
    public ConversationsKickResponse conversationsKick(RequestConfigurator<ConversationsKickRequest.ConversationsKickRequestBuilder> req) throws IOException, SlackApiException {
        return conversationsKick(req.configure(ConversationsKickRequest.builder()).build());
    }

    @Override
    public ConversationsLeaveResponse conversationsLeave(ConversationsLeaveRequest req)
            throws IOException, SlackApiException {
        return doPostFormWithToken(toForm(req), Methods.CONVERSATIONS_LEAVE, req.getToken(), ConversationsLeaveResponse.class);
    }

    @Override
    public ConversationsLeaveResponse conversationsLeave(RequestConfigurator<ConversationsLeaveRequest.ConversationsLeaveRequestBuilder> req) throws IOException, SlackApiException {
        return conversationsLeave(req.configure(ConversationsLeaveRequest.builder()).build());
    }

    @Override
    public ConversationsListResponse conversationsList(ConversationsListRequest req)
            throws IOException, SlackApiException {
        return doPostFormWithToken(toForm(req), Methods.CONVERSATIONS_LIST, req.getToken(), ConversationsListResponse.class);
    }

    @Override
    public ConversationsListResponse conversationsList(RequestConfigurator<ConversationsListRequest.ConversationsListRequestBuilder> req) throws IOException, SlackApiException {
        return conversationsList(req.configure(ConversationsListRequest.builder()).build());
    }

    @Override
    public ConversationsMembersResponse conversationsMembers(ConversationsMembersRequest req)
            throws IOException, SlackApiException {
        return doPostFormWithToken(toForm(req), Methods.CONVERSATIONS_MEMBERS, req.getToken(), ConversationsMembersResponse.class);
    }

    @Override
    public ConversationsMembersResponse conversationsMembers(RequestConfigurator<ConversationsMembersRequest.ConversationsMembersRequestBuilder> req) throws IOException, SlackApiException {
        return conversationsMembers(req.configure(ConversationsMembersRequest.builder()).build());
    }

    @Override
    public ConversationsOpenResponse conversationsOpen(ConversationsOpenRequest req)
            throws IOException, SlackApiException {
        return doPostFormWithToken(toForm(req), Methods.CONVERSATIONS_OPEN, req.getToken(), ConversationsOpenResponse.class);
    }

    @Override
    public ConversationsOpenResponse conversationsOpen(RequestConfigurator<ConversationsOpenRequest.ConversationsOpenRequestBuilder> req) throws IOException, SlackApiException {
        return conversationsOpen(req.configure(ConversationsOpenRequest.builder()).build());
    }

    @Override
    public ConversationsRenameResponse conversationsRename(ConversationsRenameRequest req)
            throws IOException, SlackApiException {
        return doPostFormWithToken(toForm(req), Methods.CONVERSATIONS_RENAME, req.getToken(), ConversationsRenameResponse.class);
    }

    @Override
    public ConversationsRenameResponse conversationsRename(RequestConfigurator<ConversationsRenameRequest.ConversationsRenameRequestBuilder> req) throws IOException, SlackApiException {
        return conversationsRename(req.configure(ConversationsRenameRequest.builder()).build());
    }

    @Override
    public ConversationsRepliesResponse conversationsReplies(ConversationsRepliesRequest req)
            throws IOException, SlackApiException {
        return doPostFormWithToken(toForm(req), Methods.CONVERSATIONS_REPLIES, req.getToken(), ConversationsRepliesResponse.class);
    }

    @Override
    public ConversationsRepliesResponse conversationsReplies(RequestConfigurator<ConversationsRepliesRequest.ConversationsRepliesRequestBuilder> req) throws IOException, SlackApiException {
        return conversationsReplies(req.configure(ConversationsRepliesRequest.builder()).build());
    }

    @Override
    public ConversationsSetPurposeResponse conversationsSetPurpose(ConversationsSetPurposeRequest req)
            throws IOException, SlackApiException {
        return doPostFormWithToken(toForm(req), Methods.CONVERSATIONS_SET_PURPOSE, req.getToken(), ConversationsSetPurposeResponse.class);
    }

    @Override
    public ConversationsSetPurposeResponse conversationsSetPurpose(RequestConfigurator<ConversationsSetPurposeRequest.ConversationsSetPurposeRequestBuilder> req) throws IOException, SlackApiException {
        return conversationsSetPurpose(req.configure(ConversationsSetPurposeRequest.builder()).build());
    }

    @Override
    public ConversationsSetTopicResponse conversationsSetTopic(ConversationsSetTopicRequest req)
            throws IOException, SlackApiException {
        return doPostFormWithToken(toForm(req), Methods.CONVERSATIONS_SET_TOPIC, req.getToken(), ConversationsSetTopicResponse.class);
    }

    @Override
    public ConversationsSetTopicResponse conversationsSetTopic(RequestConfigurator<ConversationsSetTopicRequest.ConversationsSetTopicRequestBuilder> req) throws IOException, SlackApiException {
        return conversationsSetTopic(req.configure(ConversationsSetTopicRequest.builder()).build());
    }

    @Override
    public ConversationsUnarchiveResponse conversationsUnarchive(ConversationsUnarchiveRequest req)
            throws IOException, SlackApiException {
        return doPostFormWithToken(toForm(req), Methods.CONVERSATIONS_UNARCHIVE, req.getToken(), ConversationsUnarchiveResponse.class);
    }

    @Override
    public ConversationsUnarchiveResponse conversationsUnarchive(RequestConfigurator<ConversationsUnarchiveRequest.ConversationsUnarchiveRequestBuilder> req) throws IOException, SlackApiException {
        return conversationsUnarchive(req.configure(ConversationsUnarchiveRequest.builder()).build());
    }

    @Override
    public DialogOpenResponse dialogOpen(DialogOpenRequest req)
            throws IOException, SlackApiException {
        return doPostFormWithToken(toForm(req), Methods.DIALOG_OPEN, req.getToken(), DialogOpenResponse.class);
    }

    @Override
    public DialogOpenResponse dialogOpen(RequestConfigurator<DialogOpenRequest.DialogOpenRequestBuilder> req) throws IOException, SlackApiException {
        return dialogOpen(req.configure(DialogOpenRequest.builder()).build());
    }

    @Override
    public DndEndDndResponse dndEndDnd(DndEndDndRequest req) throws IOException, SlackApiException {
        return doPostFormWithToken(toForm(req), Methods.DND_END_DND, req.getToken(), DndEndDndResponse.class);
    }

    @Override
    public DndEndDndResponse dndEndDnd(RequestConfigurator<DndEndDndRequest.DndEndDndRequestBuilder> req) throws IOException, SlackApiException {
        return dndEndDnd(req.configure(DndEndDndRequest.builder()).build());
    }

    @Override
    public DndEndSnoozeResponse dndEndSnooze(DndEndSnoozeRequest req) throws IOException, SlackApiException {
        return doPostFormWithToken(toForm(req), Methods.DND_END_SNOOZE, req.getToken(), DndEndSnoozeResponse.class);
    }

    @Override
    public DndEndSnoozeResponse dndEndSnooze(RequestConfigurator<DndEndSnoozeRequest.DndEndSnoozeRequestBuilder> req) throws IOException, SlackApiException {
        return dndEndSnooze(req.configure(DndEndSnoozeRequest.builder()).build());
    }

    @Override
    public DndInfoResponse dndInfo(DndInfoRequest req) throws IOException, SlackApiException {
        return doPostFormWithToken(toForm(req), Methods.DND_INFO, req.getToken(), DndInfoResponse.class);
    }

    @Override
    public DndInfoResponse dndInfo(RequestConfigurator<DndInfoRequest.DndInfoRequestBuilder> req) throws IOException, SlackApiException {
        return dndInfo(req.configure(DndInfoRequest.builder()).build());
    }

    @Override
    public DndSetSnoozeResponse dndSetSnooze(DndSetSnoozeRequest req) throws IOException, SlackApiException {
        return doPostFormWithToken(toForm(req), Methods.DND_SET_SNOOZE, req.getToken(), DndSetSnoozeResponse.class);
    }

    @Override
    public DndSetSnoozeResponse dndSetSnooze(RequestConfigurator<DndSetSnoozeRequest.DndSetSnoozeRequestBuilder> req) throws IOException, SlackApiException {
        return dndSetSnooze(req.configure(DndSetSnoozeRequest.builder()).build());
    }

    @Override
    public DndTeamInfoResponse dndTeamInfo(DndTeamInfoRequest req) throws IOException, SlackApiException {
        return doPostFormWithToken(toForm(req), Methods.DND_TEAM_INFO, req.getToken(), DndTeamInfoResponse.class);
    }

    @Override
    public DndTeamInfoResponse dndTeamInfo(RequestConfigurator<DndTeamInfoRequest.DndTeamInfoRequestBuilder> req) throws IOException, SlackApiException {
        return dndTeamInfo(req.configure(DndTeamInfoRequest.builder()).build());
    }

    @Override
    public EmojiListResponse emojiList(EmojiListRequest req) throws IOException, SlackApiException {
        return doPostFormWithToken(toForm(req), Methods.EMOJI_LIST, req.getToken(), EmojiListResponse.class);
    }

    @Override
    public EmojiListResponse emojiList(RequestConfigurator<EmojiListRequest.EmojiListRequestBuilder> req) throws IOException, SlackApiException {
        return emojiList(req.configure(EmojiListRequest.builder()).build());
    }

    @Override
    public FilesDeleteResponse filesDelete(FilesDeleteRequest req) throws IOException, SlackApiException {
        return doPostFormWithToken(toForm(req), Methods.FILES_DELETE, req.getToken(), FilesDeleteResponse.class);
    }

    @Override
    public FilesDeleteResponse filesDelete(RequestConfigurator<FilesDeleteRequest.FilesDeleteRequestBuilder> req) throws IOException, SlackApiException {
        return filesDelete(req.configure(FilesDeleteRequest.builder()).build());
    }

    @Override
    public FilesInfoResponse filesInfo(FilesInfoRequest req) throws IOException, SlackApiException {
        return doPostFormWithToken(toForm(req), Methods.FILES_INFO, req.getToken(), FilesInfoResponse.class);
    }

    @Override
    public FilesInfoResponse filesInfo(RequestConfigurator<FilesInfoRequest.FilesInfoRequestBuilder> req) throws IOException, SlackApiException {
        return filesInfo(req.configure(FilesInfoRequest.builder()).build());
    }

    @Override
    public FilesListResponse filesList(FilesListRequest req) throws IOException, SlackApiException {
        return doPostFormWithToken(toForm(req), Methods.FILES_LIST, req.getToken(), FilesListResponse.class);
    }

    @Override
    public FilesListResponse filesList(RequestConfigurator<FilesListRequest.FilesListRequestBuilder> req) throws IOException, SlackApiException {
        return filesList(req.configure(FilesListRequest.builder()).build());
    }

    @Override
    public FilesRevokePublicURLResponse filesRevokePublicURL(FilesRevokePublicURLRequest req) throws IOException, SlackApiException {
        return doPostFormWithToken(toForm(req), Methods.FILES_REVOKE_PUBLIC_URL, req.getToken(), FilesRevokePublicURLResponse.class);
    }

    @Override
    public FilesRevokePublicURLResponse filesRevokePublicURL(RequestConfigurator<FilesRevokePublicURLRequest.FilesRevokePublicURLRequestBuilder> req) throws IOException, SlackApiException {
        return filesRevokePublicURL(req.configure(FilesRevokePublicURLRequest.builder()).build());
    }

    @Override
    public FilesSharedPublicURLResponse filesSharedPublicURL(FilesSharedPublicURLRequest req) throws IOException, SlackApiException {
        return doPostFormWithToken(toForm(req), Methods.FILES_SHARED_PUBLIC_URL, req.getToken(), FilesSharedPublicURLResponse.class);
    }

    @Override
    public FilesSharedPublicURLResponse filesSharedPublicURL(RequestConfigurator<FilesSharedPublicURLRequest.FilesSharedPublicURLRequestBuilder> req) throws IOException, SlackApiException {
        return filesSharedPublicURL(req.configure(FilesSharedPublicURLRequest.builder()).build());
    }

    @Override
    public FilesUploadResponse filesUpload(FilesUploadRequest req) throws IOException, SlackApiException {
        if (req.getFile() != null) {
            return doPostMultipart(toMultipartBody(req), Methods.FILES_UPLOAD, req.getToken(), FilesUploadResponse.class);
        } else {
            return doPostFormWithToken(toForm(req), Methods.FILES_UPLOAD, req.getToken(), FilesUploadResponse.class);
        }
    }

    @Override
    public FilesUploadResponse filesUpload(RequestConfigurator<FilesUploadRequest.FilesUploadRequestBuilder> req) throws IOException, SlackApiException {
        return filesUpload(req.configure(FilesUploadRequest.builder()).build());
    }

    @Override
    public FilesCommentsAddResponse filesCommentsAdd(FilesCommentsAddRequest req) throws IOException, SlackApiException {
        return doPostFormWithToken(toForm(req), Methods.FILES_COMMENTS_ADD, req.getToken(), FilesCommentsAddResponse.class);
    }

    @Override
    public FilesCommentsDeleteResponse filesCommentsDelete(FilesCommentsDeleteRequest req) throws IOException, SlackApiException {
        return doPostFormWithToken(toForm(req), Methods.FILES_COMMENTS_DELETE, req.getToken(), FilesCommentsDeleteResponse.class);
    }

    @Override
    public FilesCommentsEditResponse filesCommentEdit(FilesCommentsEditRequest req) throws IOException, SlackApiException {
        return doPostFormWithToken(toForm(req), Methods.FILES_COMMENTS_EDIT, req.getToken(), FilesCommentsEditResponse.class);
    }

    @Override
    public GroupsArchiveResponse groupsArchive(GroupsArchiveRequest req) throws IOException, SlackApiException {
        return doPostFormWithToken(toForm(req), Methods.GROUPS_ARCHIVE, req.getToken(), GroupsArchiveResponse.class);
    }

    @Override
    public GroupsArchiveResponse groupsArchive(RequestConfigurator<GroupsArchiveRequest.GroupsArchiveRequestBuilder> req) throws IOException, SlackApiException {
        return groupsArchive(req.configure(GroupsArchiveRequest.builder()).build());
    }

    @Override
    public GroupsCloseResponse groupsClose(GroupsCloseRequest req) throws IOException, SlackApiException {
        return doPostFormWithToken(toForm(req), Methods.GROUPS_CLOSE, req.getToken(), GroupsCloseResponse.class);
    }

    @Override
    public GroupsCreateChildResponse groupsCreateChild(GroupsCreateChildRequest req) throws IOException, SlackApiException {
        return doPostFormWithToken(toForm(req), Methods.GROUPS_CREATE_CHILD, req.getToken(), GroupsCreateChildResponse.class);
    }

    @Override
    public GroupsCreateChildResponse groupsCreateChild(RequestConfigurator<GroupsCreateChildRequest.GroupsCreateChildRequestBuilder> req) throws IOException, SlackApiException {
        return groupsCreateChild(req.configure(GroupsCreateChildRequest.builder()).build());
    }

    @Override
    public GroupsCreateResponse groupsCreate(GroupsCreateRequest req) throws IOException, SlackApiException {
        return doPostFormWithToken(toForm(req), Methods.GROUPS_CREATE, req.getToken(), GroupsCreateResponse.class);
    }

    @Override
    public GroupsCreateResponse groupsCreate(RequestConfigurator<GroupsCreateRequest.GroupsCreateRequestBuilder> req) throws IOException, SlackApiException {
        return groupsCreate(req.configure(GroupsCreateRequest.builder()).build());
    }

    @Override
    public GroupsHistoryResponse groupsHistory(GroupsHistoryRequest req) throws IOException, SlackApiException {
        return doPostFormWithToken(toForm(req), Methods.GROUPS_HISTORY, req.getToken(), GroupsHistoryResponse.class);
    }

    @Override
    public GroupsHistoryResponse groupsHistory(RequestConfigurator<GroupsHistoryRequest.GroupsHistoryRequestBuilder> req) throws IOException, SlackApiException {
        return groupsHistory(req.configure(GroupsHistoryRequest.builder()).build());
    }

    @Override
    public GroupsRepliesResponse groupsReplies(GroupsRepliesRequest req) throws IOException, SlackApiException {
        return doPostFormWithToken(toForm(req), Methods.GROUPS_REPLIES, req.getToken(), GroupsRepliesResponse.class);
    }

    @Override
    public GroupsRepliesResponse groupsReplies(RequestConfigurator<GroupsRepliesRequest.GroupsRepliesRequestBuilder> req) throws IOException, SlackApiException {
        return groupsReplies(req.configure(GroupsRepliesRequest.builder()).build());
    }

    @Override
    public GroupsInfoResponse groupsInfo(GroupsInfoRequest req) throws IOException, SlackApiException {
        return doPostFormWithToken(toForm(req), Methods.GROUPS_INFO, req.getToken(), GroupsInfoResponse.class);
    }

    @Override
    public GroupsInfoResponse groupsInfo(RequestConfigurator<GroupsInfoRequest.GroupsInfoRequestBuilder> req) throws IOException, SlackApiException {
        return groupsInfo(req.configure(GroupsInfoRequest.builder()).build());
    }

    @Override
    public GroupsInviteResponse groupsInvite(GroupsInviteRequest req) throws IOException, SlackApiException {
        return doPostFormWithToken(toForm(req), Methods.GROUPS_INVITE, req.getToken(), GroupsInviteResponse.class);
    }

    @Override
    public GroupsInviteResponse groupsInvite(RequestConfigurator<GroupsInviteRequest.GroupsInviteRequestBuilder> req) throws IOException, SlackApiException {
        return groupsInvite(req.configure(GroupsInviteRequest.builder()).build());
    }

    @Override
    public GroupsKickResponse groupsKick(GroupsKickRequest req) throws IOException, SlackApiException {
        return doPostFormWithToken(toForm(req), Methods.GROUPS_KICK, req.getToken(), GroupsKickResponse.class);
    }

    @Override
    public GroupsKickResponse groupsKick(RequestConfigurator<GroupsKickRequest.GroupsKickRequestBuilder> req) throws IOException, SlackApiException {
        return groupsKick(req.configure(GroupsKickRequest.builder()).build());
    }

    @Override
    public GroupsLeaveResponse groupsLeave(GroupsLeaveRequest req) throws IOException, SlackApiException {
        return doPostFormWithToken(toForm(req), Methods.GROUPS_LEAVE, req.getToken(), GroupsLeaveResponse.class);
    }

    @Override
    public GroupsLeaveResponse groupsLeave(RequestConfigurator<GroupsLeaveRequest.GroupsLeaveRequestBuilder> req) throws IOException, SlackApiException {
        return groupsLeave(req.configure(GroupsLeaveRequest.builder()).build());
    }

    @Override
    public GroupsListResponse groupsList(GroupsListRequest req) throws IOException, SlackApiException {
        return doPostFormWithToken(toForm(req), Methods.GROUPS_LIST, req.getToken(), GroupsListResponse.class);
    }

    @Override
    public GroupsListResponse groupsList(RequestConfigurator<GroupsListRequest.GroupsListRequestBuilder> req) throws IOException, SlackApiException {
        return groupsList(req.configure(GroupsListRequest.builder()).build());
    }

    @Override
    public GroupsMarkResponse groupsMark(GroupsMarkRequest req) throws IOException, SlackApiException {
        return doPostFormWithToken(toForm(req), Methods.GROUPS_MARK, req.getToken(), GroupsMarkResponse.class);
    }

    @Override
    public GroupsMarkResponse groupsMark(RequestConfigurator<GroupsMarkRequest.GroupsMarkRequestBuilder> req) throws IOException, SlackApiException {
        return groupsMark(req.configure(GroupsMarkRequest.builder()).build());
    }

    @Override
    public GroupsOpenResponse groupsOpen(GroupsOpenRequest req) throws IOException, SlackApiException {
        return doPostFormWithToken(toForm(req), Methods.GROUPS_OPEN, req.getToken(), GroupsOpenResponse.class);
    }

    @Override
    public GroupsOpenResponse groupsOpen(RequestConfigurator<GroupsOpenRequest.GroupsOpenRequestBuilder> req) throws IOException, SlackApiException {
        return groupsOpen(req.configure(GroupsOpenRequest.builder()).build());
    }

    @Override
    public GroupsRenameResponse groupsRename(GroupsRenameRequest req) throws IOException, SlackApiException {
        return doPostFormWithToken(toForm(req), Methods.GROUPS_RENAME, req.getToken(), GroupsRenameResponse.class);
    }

    @Override
    public GroupsRenameResponse groupsRename(RequestConfigurator<GroupsRenameRequest.GroupsRenameRequestBuilder> req) throws IOException, SlackApiException {
        return groupsRename(req.configure(GroupsRenameRequest.builder()).build());
    }

    @Override
    public GroupsSetPurposeResponse groupsSetPurpose(GroupsSetPurposeRequest req) throws IOException, SlackApiException {
        return doPostFormWithToken(toForm(req), Methods.GROUPS_SET_PURPOSE, req.getToken(), GroupsSetPurposeResponse.class);
    }

    @Override
    public GroupsSetPurposeResponse groupsSetPurpose(RequestConfigurator<GroupsSetPurposeRequest.GroupsSetPurposeRequestBuilder> req) throws IOException, SlackApiException {
        return groupsSetPurpose(req.configure(GroupsSetPurposeRequest.builder()).build());
    }

    @Override
    public GroupsSetTopicResponse groupsSetTopic(GroupsSetTopicRequest req) throws IOException, SlackApiException {
        return doPostFormWithToken(toForm(req), Methods.GROUPS_SET_TOPIC, req.getToken(), GroupsSetTopicResponse.class);
    }

    @Override
    public GroupsSetTopicResponse groupsSetTopic(RequestConfigurator<GroupsSetTopicRequest.GroupsSetTopicRequestBuilder> req) throws IOException, SlackApiException {
        return groupsSetTopic(req.configure(GroupsSetTopicRequest.builder()).build());
    }

    @Override
    public GroupsUnarchiveResponse groupsUnarchive(GroupsUnarchiveRequest req) throws IOException, SlackApiException {
        return doPostFormWithToken(toForm(req), Methods.GROUPS_UNARCHIVE, req.getToken(), GroupsUnarchiveResponse.class);
    }

    @Override
    public GroupsUnarchiveResponse groupsUnarchive(RequestConfigurator<GroupsUnarchiveRequest.GroupsUnarchiveRequestBuilder> req) throws IOException, SlackApiException {
        return groupsUnarchive(req.configure(GroupsUnarchiveRequest.builder()).build());
    }

    @Override
    public ImCloseResponse imClose(ImCloseRequest req) throws IOException, SlackApiException {
        return doPostFormWithToken(toForm(req), Methods.IM_CLOSE, req.getToken(), ImCloseResponse.class);
    }

    @Override
    public ImCloseResponse imClose(RequestConfigurator<ImCloseRequest.ImCloseRequestBuilder> req) throws IOException, SlackApiException {
        return imClose(req.configure(ImCloseRequest.builder()).build());
    }

    @Override
    public ImHistoryResponse imHistory(ImHistoryRequest req) throws IOException, SlackApiException {
        return doPostFormWithToken(toForm(req), Methods.IM_HISTORY, req.getToken(), ImHistoryResponse.class);
    }

    @Override
    public ImHistoryResponse imHistory(RequestConfigurator<ImHistoryRequest.ImHistoryRequestBuilder> req) throws IOException, SlackApiException {
        return imHistory(req.configure(ImHistoryRequest.builder()).build());
    }

    @Override
    public ImListResponse imList(ImListRequest req) throws IOException, SlackApiException {
        return doPostFormWithToken(toForm(req), Methods.IM_LIST, req.getToken(), ImListResponse.class);
    }

    @Override
    public ImListResponse imList(RequestConfigurator<ImListRequest.ImListRequestBuilder> req) throws IOException, SlackApiException {
        return imList(req.configure(ImListRequest.builder()).build());
    }

    @Override
    public ImMarkResponse imMark(ImMarkRequest req) throws IOException, SlackApiException {
        return doPostFormWithToken(toForm(req), Methods.IM_MARK, req.getToken(), ImMarkResponse.class);
    }

    @Override
    public ImMarkResponse imMark(RequestConfigurator<ImMarkRequest.ImMarkRequestBuilder> req) throws IOException, SlackApiException {
        return imMark(req.configure(ImMarkRequest.builder()).build());
    }

    @Override
    public ImOpenResponse imOpen(ImOpenRequest req) throws IOException, SlackApiException {
        return doPostFormWithToken(toForm(req), Methods.IM_OPEN, req.getToken(), ImOpenResponse.class);
    }

    @Override
    public ImOpenResponse imOpen(RequestConfigurator<ImOpenRequest.ImOpenRequestBuilder> req) throws IOException, SlackApiException {
        return imOpen(req.configure(ImOpenRequest.builder()).build());
    }

    @Override
    public ImRepliesResponse imReplies(ImRepliesRequest req) throws IOException, SlackApiException {
        return doPostFormWithToken(toForm(req), Methods.IM_REPLIES, req.getToken(), ImRepliesResponse.class);
    }

    @Override
    public ImRepliesResponse imReplies(RequestConfigurator<ImRepliesRequest.ImRepliesRequestBuilder> req) throws IOException, SlackApiException {
        return imReplies(req.configure(ImRepliesRequest.builder()).build());
    }

    @Override
    public MigrationExchangeResponse migrationExchange(MigrationExchangeRequest req) throws IOException, SlackApiException {
        return doPostFormWithToken(toForm(req), Methods.MIGRATION_EXCHANGE, req.getToken(), MigrationExchangeResponse.class);
    }

    @Override
    public MigrationExchangeResponse migrationExchange(RequestConfigurator<MigrationExchangeRequest.MigrationExchangeRequestBuilder> req) throws IOException, SlackApiException {
        return migrationExchange(req.configure(MigrationExchangeRequest.builder()).build());
    }

    @Override
    public MpimCloseResponse mpimClose(MpimCloseRequest req) throws IOException, SlackApiException {
        return doPostFormWithToken(toForm(req), Methods.MPIM_CLOSE, req.getToken(), MpimCloseResponse.class);
    }

    @Override
    public MpimCloseResponse mpimClose(RequestConfigurator<MpimCloseRequest.MpimCloseRequestBuilder> req) throws IOException, SlackApiException {
        return mpimClose(req.configure(MpimCloseRequest.builder()).build());
    }

    @Override
    public MpimHistoryResponse mpimHistory(MpimHistoryRequest req) throws IOException, SlackApiException {
        return doPostFormWithToken(toForm(req), Methods.MPIM_HISTORY, req.getToken(), MpimHistoryResponse.class);
    }

    @Override
    public MpimHistoryResponse mpimHistory(RequestConfigurator<MpimHistoryRequest.MpimHistoryRequestBuilder> req) throws IOException, SlackApiException {
        return mpimHistory(req.configure(MpimHistoryRequest.builder()).build());
    }

    @Override
    public MpimListResponse mpimList(MpimListRequest req) throws IOException, SlackApiException {
        return doPostFormWithToken(toForm(req), Methods.MPIM_LIST, req.getToken(), MpimListResponse.class);
    }

    @Override
    public MpimListResponse mpimList(RequestConfigurator<MpimListRequest.MpimListRequestBuilder> req) throws IOException, SlackApiException {
        return mpimList(req.configure(MpimListRequest.builder()).build());
    }

    @Override
    public MpimRepliesResponse mpimReplies(MpimRepliesRequest req) throws IOException, SlackApiException {
        return doPostFormWithToken(toForm(req), Methods.MPIM_REPLIES, req.getToken(), MpimRepliesResponse.class);
    }

    @Override
    public MpimRepliesResponse mpimReplies(RequestConfigurator<MpimRepliesRequest.MpimRepliesRequestBuilder> req) throws IOException, SlackApiException {
        return mpimReplies(req.configure(MpimRepliesRequest.builder()).build());
    }

    @Override
    public MpimMarkResponse mpimMark(MpimMarkRequest req) throws IOException, SlackApiException {
        return doPostFormWithToken(toForm(req), Methods.MPIM_MARK, req.getToken(), MpimMarkResponse.class);
    }

    @Override
    public MpimMarkResponse mpimMark(RequestConfigurator<MpimMarkRequest.MpimMarkRequestBuilder> req) throws IOException, SlackApiException {
        return mpimMark(req.configure(MpimMarkRequest.builder()).build());
    }

    @Override
    public MpimOpenResponse mpimOpen(MpimOpenRequest req) throws IOException, SlackApiException {
        return doPostFormWithToken(toForm(req), Methods.MPIM_OPEN, req.getToken(), MpimOpenResponse.class);
    }

    @Override
    public MpimOpenResponse mpimOpen(RequestConfigurator<MpimOpenRequest.MpimOpenRequestBuilder> req) throws IOException, SlackApiException {
        return mpimOpen(req.configure(MpimOpenRequest.builder()).build());
    }

    @Override
    public OAuthAccessResponse oauthAccess(OAuthAccessRequest req) throws IOException, SlackApiException {
        return doPostForm(toForm(req), Methods.OAUTH_ACCESS, OAuthAccessResponse.class);
    }

    @Override
    public OAuthAccessResponse oauthAccess(RequestConfigurator<OAuthAccessRequest.OAuthAccessRequestBuilder> req) throws IOException, SlackApiException {
        return oauthAccess(req.configure(OAuthAccessRequest.builder()).build());
    }

    @Override
    public OAuthTokenResponse oauthToken(OAuthTokenRequest req) throws IOException, SlackApiException {
        return doPostForm(toForm(req), Methods.OAUTH_TOKEN, OAuthTokenResponse.class);
    }

    @Override
    public OAuthTokenResponse oauthToken(RequestConfigurator<OAuthTokenRequest.OAuthTokenRequestBuilder> req) throws IOException, SlackApiException {
        return oauthToken(req.configure(OAuthTokenRequest.builder()).build());
    }

    @Override
    public PinsAddResponse pinsAdd(PinsAddRequest req) throws IOException, SlackApiException {
        return doPostFormWithToken(toForm(req), Methods.PINS_ADD, req.getToken(), PinsAddResponse.class);
    }

    @Override
    public PinsAddResponse pinsAdd(RequestConfigurator<PinsAddRequest.PinsAddRequestBuilder> req) throws IOException, SlackApiException {
        return pinsAdd(req.configure(PinsAddRequest.builder()).build());
    }

    @Override
    public PinsListResponse pinsList(PinsListRequest req) throws IOException, SlackApiException {
        return doPostFormWithToken(toForm(req), Methods.PINS_LIST, req.getToken(), PinsListResponse.class);
    }

    @Override
    public PinsListResponse pinsList(RequestConfigurator<PinsListRequest.PinsListRequestBuilder> req) throws IOException, SlackApiException {
        return pinsList(req.configure(PinsListRequest.builder()).build());
    }

    @Override
    public PinsRemoveResponse pinsRemove(PinsRemoveRequest req) throws IOException, SlackApiException {
        return doPostFormWithToken(toForm(req), Methods.PINS_REMOVE, req.getToken(), PinsRemoveResponse.class);
    }

    @Override
    public PinsRemoveResponse pinsRemove(RequestConfigurator<PinsRemoveRequest.PinsRemoveRequestBuilder> req) throws IOException, SlackApiException {
        return pinsRemove(req.configure(PinsRemoveRequest.builder()).build());
    }

    @Override
    public ReactionsAddResponse reactionsAdd(ReactionsAddRequest req) throws IOException, SlackApiException {
        return doPostFormWithToken(toForm(req), Methods.REACTIONS_ADD, req.getToken(), ReactionsAddResponse.class);
    }

    @Override
    public ReactionsAddResponse reactionsAdd(RequestConfigurator<ReactionsAddRequest.ReactionsAddRequestBuilder> req) throws IOException, SlackApiException {
        return reactionsAdd(req.configure(ReactionsAddRequest.builder()).build());
    }

    @Override
    public ReactionsGetResponse reactionsGet(ReactionsGetRequest req) throws IOException, SlackApiException {
        return doPostFormWithToken(toForm(req), Methods.REACTIONS_GET, req.getToken(), ReactionsGetResponse.class);
    }

    @Override
    public ReactionsGetResponse reactionsGet(RequestConfigurator<ReactionsGetRequest.ReactionsGetRequestBuilder> req) throws IOException, SlackApiException {
        return reactionsGet(req.configure(ReactionsGetRequest.builder()).build());
    }

    @Override
    public ReactionsListResponse reactionsList(ReactionsListRequest req) throws IOException, SlackApiException {
        return doPostFormWithToken(toForm(req), Methods.REACTIONS_LIST, req.getToken(), ReactionsListResponse.class);
    }

    @Override
    public ReactionsListResponse reactionsList(RequestConfigurator<ReactionsListRequest.ReactionsListRequestBuilder> req) throws IOException, SlackApiException {
        return reactionsList(req.configure(ReactionsListRequest.builder()).build());
    }

    @Override
    public ReactionsRemoveResponse reactionsRemove(ReactionsRemoveRequest req) throws IOException, SlackApiException {
        return doPostFormWithToken(toForm(req), Methods.REACTIONS_REMOVE, req.getToken(), ReactionsRemoveResponse.class);
    }

    @Override
    public ReactionsRemoveResponse reactionsRemove(RequestConfigurator<ReactionsRemoveRequest.ReactionsRemoveRequestBuilder> req) throws IOException, SlackApiException {
        return reactionsRemove(req.configure(ReactionsRemoveRequest.builder()).build());
    }

    @Override
    public RemindersAddResponse remindersAdd(RemindersAddRequest req) throws IOException, SlackApiException {
        return doPostFormWithToken(toForm(req), Methods.REMINDERS_ADD, req.getToken(), RemindersAddResponse.class);
    }

    @Override
    public RemindersAddResponse remindersAdd(RequestConfigurator<RemindersAddRequest.RemindersAddRequestBuilder> req) throws IOException, SlackApiException {
        return remindersAdd(req.configure(RemindersAddRequest.builder()).build());
    }

    @Override
    public RemindersCompleteResponse remindersComplete(RemindersCompleteRequest req) throws IOException, SlackApiException {
        return doPostFormWithToken(toForm(req), Methods.REMINDERS_COMPLETE, req.getToken(), RemindersCompleteResponse.class);
    }

    @Override
    public RemindersCompleteResponse remindersComplete(RequestConfigurator<RemindersCompleteRequest.RemindersCompleteRequestBuilder> req) throws IOException, SlackApiException {
        return remindersComplete(req.configure(RemindersCompleteRequest.builder()).build());
    }

    @Override
    public RemindersDeleteResponse remindersDelete(RemindersDeleteRequest req) throws IOException, SlackApiException {
        return doPostFormWithToken(toForm(req), Methods.REMINDERS_DELETE, req.getToken(), RemindersDeleteResponse.class);
    }

    @Override
    public RemindersDeleteResponse remindersDelete(RequestConfigurator<RemindersDeleteRequest.RemindersDeleteRequestBuilder> req) throws IOException, SlackApiException {
        return remindersDelete(req.configure(RemindersDeleteRequest.builder()).build());
    }

    @Override
    public RemindersInfoResponse remindersInfo(RemindersInfoRequest req) throws IOException, SlackApiException {
        return doPostFormWithToken(toForm(req), Methods.REMINDERS_INFO, req.getToken(), RemindersInfoResponse.class);
    }

    @Override
    public RemindersInfoResponse remindersInfo(RequestConfigurator<RemindersInfoRequest.RemindersInfoRequestBuilder> req) throws IOException, SlackApiException {
        return remindersInfo(req.configure(RemindersInfoRequest.builder()).build());
    }

    @Override
    public RemindersListResponse remindersList(RemindersListRequest req) throws IOException, SlackApiException {
        return doPostFormWithToken(toForm(req), Methods.REMINDERS_LIST, req.getToken(), RemindersListResponse.class);
    }

    @Override
    public RemindersListResponse remindersList(RequestConfigurator<RemindersListRequest.RemindersListRequestBuilder> req) throws IOException, SlackApiException {
        return remindersList(req.configure(RemindersListRequest.builder()).build());
    }

    @Override
    public RTMConnectResponse rtmConnect(RTMConnectRequest req) throws IOException, SlackApiException {
        return doPostFormWithToken(toForm(req), Methods.RTM_CONNECT, req.getToken(), RTMConnectResponse.class);
    }

    @Override
    public RTMConnectResponse rtmConnect(RequestConfigurator<RTMConnectRequest.RTMConnectRequestBuilder> req) throws IOException, SlackApiException {
        return rtmConnect(req.configure(RTMConnectRequest.builder()).build());
    }

    @Override
    public RTMStartResponse rtmStart(RTMStartRequest req) throws IOException, SlackApiException {
        return doPostFormWithToken(toForm(req), Methods.RTM_START, req.getToken(), RTMStartResponse.class);
    }

    @Override
    public RTMStartResponse rtmStart(RequestConfigurator<RTMStartRequest.RTMStartRequestBuilder> req) throws IOException, SlackApiException {
        return rtmStart(req.configure(RTMStartRequest.builder()).build());
    }

    @Override
    public SearchAllResponse searchAll(SearchAllRequest req) throws IOException, SlackApiException {
        return doPostFormWithToken(toForm(req), Methods.SEARCH_ALL, req.getToken(), SearchAllResponse.class);
    }

    @Override
    public SearchAllResponse searchAll(RequestConfigurator<SearchAllRequest.SearchAllRequestBuilder> req) throws IOException, SlackApiException {
        return searchAll(req.configure(SearchAllRequest.builder()).build());
    }

    @Override
    public SearchMessagesResponse searchMessages(SearchMessagesRequest req) throws IOException, SlackApiException {
        return doPostFormWithToken(toForm(req), Methods.SEARCH_MESSAGES, req.getToken(), SearchMessagesResponse.class);
    }

    @Override
    public SearchMessagesResponse searchMessages(RequestConfigurator<SearchMessagesRequest.SearchMessagesRequestBuilder> req) throws IOException, SlackApiException {
        return searchMessages(req.configure(SearchMessagesRequest.builder()).build());
    }

    @Override
    public SearchFilesResponse searchFiles(SearchFilesRequest req) throws IOException, SlackApiException {
        return doPostFormWithToken(toForm(req), Methods.SEARCH_FILES, req.getToken(), SearchFilesResponse.class);
    }

    @Override
    public SearchFilesResponse searchFiles(RequestConfigurator<SearchFilesRequest.SearchFilesRequestBuilder> req) throws IOException, SlackApiException {
        return searchFiles(req.configure(SearchFilesRequest.builder()).build());
    }

    @Override
    public StarsAddResponse starsAdd(StarsAddRequest req) throws IOException, SlackApiException {
        return doPostFormWithToken(toForm(req), Methods.STARS_ADD, req.getToken(), StarsAddResponse.class);
    }

    @Override
    public StarsAddResponse starsAdd(RequestConfigurator<StarsAddRequest.StarsAddRequestBuilder> req) throws IOException, SlackApiException {
        return starsAdd(req.configure(StarsAddRequest.builder()).build());
    }

    @Override
    public StarsListResponse starsList(StarsListRequest req) throws IOException, SlackApiException {
        return doPostFormWithToken(toForm(req), Methods.STARS_LIST, req.getToken(), StarsListResponse.class);
    }

    @Override
    public StarsListResponse starsList(RequestConfigurator<StarsListRequest.StarsListRequestBuilder> req) throws IOException, SlackApiException {
        return starsList(req.configure(StarsListRequest.builder()).build());
    }

    @Override
    public StarsRemoveResponse starsRemove(StarsRemoveRequest req) throws IOException, SlackApiException {
        return doPostFormWithToken(toForm(req), Methods.STARS_REMOVE, req.getToken(), StarsRemoveResponse.class);
    }

    @Override
    public StarsRemoveResponse starsRemove(RequestConfigurator<StarsRemoveRequest.StarsRemoveRequestBuilder> req) throws IOException, SlackApiException {
        return starsRemove(req.configure(StarsRemoveRequest.builder()).build());
    }

    @Override
    public TeamAccessLogsResponse teamAccessLogs(TeamAccessLogsRequest req) throws IOException, SlackApiException {
        return doPostFormWithToken(toForm(req), Methods.TEAM_ACCESS_LOGS, req.getToken(), TeamAccessLogsResponse.class);
    }

    @Override
    public TeamAccessLogsResponse teamAccessLogs(RequestConfigurator<TeamAccessLogsRequest.TeamAccessLogsRequestBuilder> req) throws IOException, SlackApiException {
        return teamAccessLogs(req.configure(TeamAccessLogsRequest.builder()).build());
    }

    @Override
    public TeamBillableInfoResponse teamBillableInfo(TeamBillableInfoRequest req) throws IOException, SlackApiException {
        return doPostFormWithToken(toForm(req), Methods.TEAM_BILLABLE_INFO, req.getToken(), TeamBillableInfoResponse.class);
    }

    @Override
    public TeamBillableInfoResponse teamBillableInfo(RequestConfigurator<TeamBillableInfoRequest.TeamBillableInfoRequestBuilder> req) throws IOException, SlackApiException {
        return teamBillableInfo(req.configure(TeamBillableInfoRequest.builder()).build());
    }

    @Override
    public TeamInfoResponse teamInfo(TeamInfoRequest req) throws IOException, SlackApiException {
        return doPostFormWithToken(toForm(req), Methods.TEAM_INFO, req.getToken(), TeamInfoResponse.class);
    }

    @Override
    public TeamInfoResponse teamInfo(RequestConfigurator<TeamInfoRequest.TeamInfoRequestBuilder> req) throws IOException, SlackApiException {
        return teamInfo(req.configure(TeamInfoRequest.builder()).build());
    }

    @Override
    public TeamIntegrationLogsResponse teamIntegrationLogs(TeamIntegrationLogsRequest req) throws IOException, SlackApiException {
        return doPostFormWithToken(toForm(req), Methods.TEAM_INTEGRATION_LOGS, req.getToken(), TeamIntegrationLogsResponse.class);
    }

    @Override
    public TeamIntegrationLogsResponse teamIntegrationLogs(RequestConfigurator<TeamIntegrationLogsRequest.TeamIntegrationLogsRequestBuilder> req) throws IOException, SlackApiException {
        return teamIntegrationLogs(req.configure(TeamIntegrationLogsRequest.builder()).build());
    }

    @Override
    public TeamProfileGetResponse teamProfileGet(TeamProfileGetRequest req) throws IOException, SlackApiException {
        return doPostFormWithToken(toForm(req), Methods.TEAM_PROFILE_GET, req.getToken(), TeamProfileGetResponse.class);
    }

    @Override
    public TeamProfileGetResponse teamProfileGet(RequestConfigurator<TeamProfileGetRequest.TeamProfileGetRequestBuilder> req) throws IOException, SlackApiException {
        return teamProfileGet(req.configure(TeamProfileGetRequest.builder()).build());
    }

    @Override
    public UsergroupsCreateResponse usergroupsCreate(UsergroupsCreateRequest req) throws IOException, SlackApiException {
        return doPostFormWithToken(toForm(req), Methods.USERGROUPS_CREATE, req.getToken(), UsergroupsCreateResponse.class);
    }

    @Override
    public UsergroupsCreateResponse usergroupsCreate(RequestConfigurator<UsergroupsCreateRequest.UsergroupsCreateRequestBuilder> req) throws IOException, SlackApiException {
        return usergroupsCreate(req.configure(UsergroupsCreateRequest.builder()).build());
    }

    @Override
    public UsergroupsDisableResponse usergroupsDisable(UsergroupsDisableRequest req) throws IOException, SlackApiException {
        return doPostFormWithToken(toForm(req), Methods.USERGROUPS_DISABLE, req.getToken(), UsergroupsDisableResponse.class);
    }

    @Override
    public UsergroupsDisableResponse usergroupsDisable(RequestConfigurator<UsergroupsDisableRequest.UsergroupsDisableRequestBuilder> req) throws IOException, SlackApiException {
        return usergroupsDisable(req.configure(UsergroupsDisableRequest.builder()).build());
    }

    @Override
    public UsergroupsEnableResponse usergroupsEnable(UsergroupsEnableRequest req) throws IOException, SlackApiException {
        return doPostFormWithToken(toForm(req), Methods.USERGROUPS_ENABLE, req.getToken(), UsergroupsEnableResponse.class);
    }

    @Override
    public UsergroupsEnableResponse usergroupsEnable(RequestConfigurator<UsergroupsEnableRequest.UsergroupsEnableRequestBuilder> req) throws IOException, SlackApiException {
        return usergroupsEnable(req.configure(UsergroupsEnableRequest.builder()).build());
    }

    @Override
    public UsergroupsListResponse usergroupsList(UsergroupsListRequest req) throws IOException, SlackApiException {
        return doPostFormWithToken(toForm(req), Methods.USERGROUPS_LIST, req.getToken(), UsergroupsListResponse.class);
    }

    @Override
    public UsergroupsListResponse usergroupsList(RequestConfigurator<UsergroupsListRequest.UsergroupsListRequestBuilder> req) throws IOException, SlackApiException {
        return usergroupsList(req.configure(UsergroupsListRequest.builder()).build());
    }

    @Override
    public UsergroupsUpdateResponse usergroupsUpdate(UsergroupsUpdateRequest req) throws IOException, SlackApiException {
        return doPostFormWithToken(toForm(req), Methods.USERGROUPS_UPDATE, req.getToken(), UsergroupsUpdateResponse.class);
    }

    @Override
    public UsergroupsUpdateResponse usergroupsUpdate(RequestConfigurator<UsergroupsUpdateRequest.UsergroupsUpdateRequestBuilder> req) throws IOException, SlackApiException {
        return usergroupsUpdate(req.configure(UsergroupsUpdateRequest.builder()).build());
    }

    @Override
    public UsergroupUsersListResponse usergroupUsersList(UsergroupUsersListRequest req) throws IOException, SlackApiException {
        return doPostFormWithToken(toForm(req), Methods.USERGROUPS_USERS_LIST, req.getToken(), UsergroupUsersListResponse.class);
    }

    @Override
    public UsergroupUsersListResponse usergroupUsersList(RequestConfigurator<UsergroupUsersListRequest.UsergroupUsersListRequestBuilder> req) throws IOException, SlackApiException {
        return usergroupUsersList(req.configure(UsergroupUsersListRequest.builder()).build());
    }

    @Override
    public UsergroupUsersUpdateResponse usergroupUsersUpdate(UsergroupUsersUpdateRequest req) throws IOException, SlackApiException {
        return doPostFormWithToken(toForm(req), Methods.USERGROUPS_USERS_UPDATE, req.getToken(), UsergroupUsersUpdateResponse.class);
    }

    @Override
    public UsergroupUsersUpdateResponse usergroupUsersUpdate(RequestConfigurator<UsergroupUsersUpdateRequest.UsergroupUsersUpdateRequestBuilder> req) throws IOException, SlackApiException {
        return usergroupUsersUpdate(req.configure(UsergroupUsersUpdateRequest.builder()).build());
    }

    @Override
    public UsersConversationsResponse usersConversations(UsersConversationsRequest req) throws IOException, SlackApiException {
        return doPostFormWithToken(toForm(req), Methods.USERS_CONVERSATIONS, req.getToken(), UsersConversationsResponse.class);
    }

    @Override
    public UsersConversationsResponse usersConversations(RequestConfigurator<UsersConversationsRequest.UsersConversationsRequestBuilder> req) throws IOException, SlackApiException {
        return usersConversations(req.configure(UsersConversationsRequest.builder()).build());
    }

    @Override
    public UsersDeletePhotoResponse usersDeletePhoto(UsersDeletePhotoRequest req) throws IOException, SlackApiException {
        return doPostFormWithToken(toForm(req), Methods.USERS_DELETE_PHOTO, req.getToken(), UsersDeletePhotoResponse.class);
    }

    @Override
    public UsersDeletePhotoResponse usersDeletePhoto(RequestConfigurator<UsersDeletePhotoRequest.UsersDeletePhotoRequestBuilder> req) throws IOException, SlackApiException {
        return usersDeletePhoto(req.configure(UsersDeletePhotoRequest.builder()).build());
    }

    @Override
    public UsersGetPresenceResponse usersGetPresence(UsersGetPresenceRequest req) throws IOException, SlackApiException {
        return doPostFormWithToken(toForm(req), Methods.USERS_GET_PRESENCE, req.getToken(), UsersGetPresenceResponse.class);
    }

    @Override
    public UsersGetPresenceResponse usersGetPresence(RequestConfigurator<UsersGetPresenceRequest.UsersGetPresenceRequestBuilder> req) throws IOException, SlackApiException {
        return usersGetPresence(req.configure(UsersGetPresenceRequest.builder()).build());
    }

    @Override
    public UsersIdentityResponse usersIdentity(UsersIdentityRequest req) throws IOException, SlackApiException {
        return doPostFormWithToken(toForm(req), Methods.USERS_IDENTITY, req.getToken(), UsersIdentityResponse.class);
    }

    @Override
    public UsersIdentityResponse usersIdentity(RequestConfigurator<UsersIdentityRequest.UsersIdentityRequestBuilder> req) throws IOException, SlackApiException {
        return usersIdentity(req.configure(UsersIdentityRequest.builder()).build());
    }

    @Override
    public UsersInfoResponse usersInfo(UsersInfoRequest req) throws IOException, SlackApiException {
        return doPostFormWithToken(toForm(req), Methods.USERS_INFO, req.getToken(), UsersInfoResponse.class);
    }

    @Override
    public UsersInfoResponse usersInfo(RequestConfigurator<UsersInfoRequest.UsersInfoRequestBuilder> req) throws IOException, SlackApiException {
        return usersInfo(req.configure(UsersInfoRequest.builder()).build());
    }

    @Override
    public UsersListResponse usersList(UsersListRequest req) throws IOException, SlackApiException {
        return doPostFormWithToken(toForm(req), Methods.USERS_LIST, req.getToken(), UsersListResponse.class);
    }

    @Override
    public UsersListResponse usersList(RequestConfigurator<UsersListRequest.UsersListRequestBuilder> req) throws IOException, SlackApiException {
        return usersList(req.configure(UsersListRequest.builder()).build());
    }

    @Override
    public UsersLookupByEmailResponse usersLookupByEmail(UsersLookupByEmailRequest req) throws IOException, SlackApiException {
        return doPostFormWithToken(toForm(req), Methods.USERS_LOOKUP_BY_EMAIL, req.getToken(), UsersLookupByEmailResponse.class);
    }

    @Override
    public UsersLookupByEmailResponse usersLookupByEmail(RequestConfigurator<UsersLookupByEmailRequest.UsersLookupByEmailRequestBuilder> req) throws IOException, SlackApiException {
        return usersLookupByEmail(req.configure(UsersLookupByEmailRequest.builder()).build());
    }

    @Override
    public UsersSetActiveResponse usersSetActive(UsersSetActiveRequest req) throws IOException, SlackApiException {
        return doPostFormWithToken(toForm(req), Methods.USERS_SET_ACTIVE, req.getToken(), UsersSetActiveResponse.class);
    }

    @Override
    public UsersSetActiveResponse usersSetActive(RequestConfigurator<UsersSetActiveRequest.UsersSetActiveRequestBuilder> req) throws IOException, SlackApiException {
        return usersSetActive(req.configure(UsersSetActiveRequest.builder()).build());
    }

    @Override
    public UsersSetPhotoResponse usersSetPhoto(UsersSetPhotoRequest req) throws IOException, SlackApiException {
        return doPostMultipart(toMultipartBody(req), Methods.USERS_SET_PHOTO, req.getToken(), UsersSetPhotoResponse.class);
    }

    @Override
    public UsersSetPhotoResponse usersSetPhoto(RequestConfigurator<UsersSetPhotoRequest.UsersSetPhotoRequestBuilder> req) throws IOException, SlackApiException {
        return usersSetPhoto(req.configure(UsersSetPhotoRequest.builder()).build());
    }

    @Override
    public UsersSetPresenceResponse usersSetPresence(UsersSetPresenceRequest req) throws IOException, SlackApiException {
        return doPostFormWithToken(toForm(req), Methods.USERS_SET_PRESENCE, req.getToken(), UsersSetPresenceResponse.class);
    }

    @Override
    public UsersSetPresenceResponse usersSetPresence(RequestConfigurator<UsersSetPresenceRequest.UsersSetPresenceRequestBuilder> req) throws IOException, SlackApiException {
        return usersSetPresence(req.configure(UsersSetPresenceRequest.builder()).build());
    }

    @Override
    public UsersProfileGetResponse usersProfileGet(UsersProfileGetRequest req) throws IOException, SlackApiException {
        return doPostFormWithToken(toForm(req), Methods.USERS_PROFILE_GET, req.getToken(), UsersProfileGetResponse.class);
    }

    @Override
    public UsersProfileGetResponse usersProfileGet(RequestConfigurator<UsersProfileGetRequest.UsersProfileGetRequestBuilder> req) throws IOException, SlackApiException {
        return usersProfileGet(req.configure(UsersProfileGetRequest.builder()).build());
    }

    @Override
    public UsersProfileSetResponse usersProfileSet(UsersProfileSetRequest req) throws IOException, SlackApiException {
        return doPostFormWithToken(toForm(req), Methods.USERS_PROFILE_SET, req.getToken(), UsersProfileSetResponse.class);
    }

    @Override
    public UsersProfileSetResponse usersProfileSet(RequestConfigurator<UsersProfileSetRequest.UsersProfileSetRequestBuilder> req) throws IOException, SlackApiException {
        return usersProfileSet(req.configure(UsersProfileSetRequest.builder()).build());
    }

    protected <T> T doPostForm(
            FormBody.Builder form,
            String endpoint,
            Class<T> clazz) throws IOException, SlackApiException {
        Response response = runPostForm(form, endpoint);
        return slackHttpClient.parseJsonResponse(response, clazz);
    }

    @Override
    public Response runPostForm(FormBody.Builder form, String endpoint) throws IOException {
        return slackHttpClient.postForm(endpointUrlPrefix + endpoint, form.build());
    }

    public <T> T doPostFormWithToken(
            FormBody.Builder form,
            String endpoint,
            String token,
            Class<T> clazz) throws IOException, SlackApiException {
        Response response = runPostFormWithToken(form, endpoint, token);
        return slackHttpClient.parseJsonResponse(response, clazz);
    }

    @Override
    public Response runPostFormWithToken(FormBody.Builder form, String endpoint, String token) throws IOException {
        return slackHttpClient.postFormWithBearerHeader(endpointUrlPrefix + endpoint, token, form.build());
    }

    public <T> T doPostMultipart(
            MultipartBody.Builder form,
            String endpoint,
            String token,
            Class<T> clazz) throws IOException, SlackApiException {
        form.setType(MultipartBody.FORM);
        Response response = runPostMultipart(form, endpoint, token);
        return slackHttpClient.parseJsonResponse(response, clazz);
    }

    @Override
    public Response runPostMultipart(MultipartBody.Builder form, String endpoint, String token) throws IOException {
        return slackHttpClient.postMultipart(endpointUrlPrefix + endpoint, token, form.build());
    }

}