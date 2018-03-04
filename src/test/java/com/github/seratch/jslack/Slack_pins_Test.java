package com.github.seratch.jslack;

import com.github.seratch.jslack.api.methods.SlackApiException;
import com.github.seratch.jslack.api.methods.request.channels.ChannelsListRequest;
import com.github.seratch.jslack.api.methods.request.files.FilesUploadRequest;
import com.github.seratch.jslack.api.methods.request.pins.PinsAddRequest;
import com.github.seratch.jslack.api.methods.request.pins.PinsListRequest;
import com.github.seratch.jslack.api.methods.request.pins.PinsRemoveRequest;
import com.github.seratch.jslack.api.methods.response.files.FilesUploadResponse;
import com.github.seratch.jslack.api.methods.response.pins.PinsAddResponse;
import com.github.seratch.jslack.api.methods.response.pins.PinsListResponse;
import com.github.seratch.jslack.api.methods.response.pins.PinsRemoveResponse;
import org.junit.Test;
import org.slf4j.Logger;

import java.io.File;
import java.io.IOException;
import java.util.List;

import static java.util.stream.Collectors.toList;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;

public class Slack_pins_Test {

    private static final Logger log = org.slf4j.LoggerFactory.getLogger(Slack_pins_Test.class);
    Slack slack = new Slack();
    String token = System.getenv(Constants.SLACK_TEST_OAUTH_ACCESS_TOKEN);

    @Test
    public void list() throws IOException, SlackApiException {
        List<String> channels = slack.methods().channelsList(ChannelsListRequest.builder().token(token).build())
                .getChannels().stream()
                .filter(c -> c.getName().equals("general"))
                .map(c -> c.getId()).collect(toList());

        PinsListResponse response = slack.methods().pinsList(
                PinsListRequest.builder().token(token).channel(channels.get(0)).build());
        assertThat(response.isOk(), is(true));
        assertThat(response.getItems(), is(notNullValue()));
    }

    @Test
    public void add() throws IOException, SlackApiException {
        List<String> channels = slack.methods().channelsList(ChannelsListRequest.builder().token(token).build())
                .getChannels().stream()
                .filter(c -> c.getName().equals("general"))
                .map(c -> c.getId()).collect(toList());

        File file = new File("src/test/resources/sample.txt");
        com.github.seratch.jslack.api.model.File fileObj;
        {
            FilesUploadResponse response = slack.methods().filesUpload(FilesUploadRequest.builder()
                    .token(token)
                    .channels(channels)
                    .file(file)
                    .filename("sample.txt")
                    .initialComment("initial comment")
                    .title("file title")
                    .build());
            assertThat(response.isOk(), is(true));
            fileObj = response.getFile();
        }

        {
            PinsAddResponse response = slack.methods().pinsAdd(PinsAddRequest.builder()
                    .token(token)
                    .channel(channels.get(0))
                    .file(fileObj.getId())
                    .build());
            assertThat(response.isOk(), is(true));
        }
        {
            PinsRemoveResponse response = slack.methods().pinsRemove(PinsRemoveRequest.builder()
                    .token(token)
                    .channel(channels.get(0))
                    .file(fileObj.getId())
                    .build());
            assertThat(response.isOk(), is(true));
        }

        {
            PinsAddResponse response = slack.methods().pinsAdd(PinsAddRequest.builder()
                    .token(token)
                    .channel(channels.get(0))
                    .fileComment(fileObj.getInitialComment().getId())
                    .build());
            assertThat(response.isOk(), is(true));
        }

    }

}