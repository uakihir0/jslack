## jSlack

[![](https://jitpack.io/v/uakihir0/jslack.svg)](https://jitpack.io/#uakihir0/jslack)

jSlack is a Java library to easily integrate your operations with [Slack](https://slack.com/).
This library can complie with J2Objc.The library currently supports the following APIs.

- [API Methods](https://api.slack.com/methods)
  - api.test
  - auth.*
  - bots.*
  - channels.*
  - chat.*
  - conversations.*
  - dialog.open
  - dnd.*
  - emoji.*
  - files.*
  - files.comments.*
  - groups.*
  - im.*
  - mpim.*
  - oauth.*
  - pins.*
  - reactions.*
  - reminders.*
  - rtm.*
  - search.*
  - stars.*
  - team.*
  - team.profile.*
  - usergroups.*
  - usergroups.users.*
  - users.*
  - users.profile.*


### Examples

#### API Methods

There are lots of APIs to integrate external sources into Slack. They follow HTTP RPC-style methods.

- https://api.slack.com/methods
- https://api.slack.com/web#basics

When the API call has been completed successfully, its response contains `"ok": true` and other specific fields.

```json
{
    "ok": true
}
```

In some cases, it may contain `warning` field too.

```json
{
    "ok": true,
    "warning": "something_problematic"
}
```

When the API call failed or had some warnings, its response contains `"ok": false'` and also have the `error` field which holds a string error code.

```json
{
    "ok": false,
    "error": "something_bad"
}
```


jSlack simply wrap API interface. Find more examples in this library's test code.

```java
import com.github.seratch.jslack.*;
import com.github.seratch.jslack.api.methods.request.channels.*;
import com.github.seratch.jslack.api.methods.response.channels.*;

Slack slack = Slack.getInstance();

String token = System.getenv("SLACK_BOT_TEST_API_TOKEN");
ChannelsCreateRequest channelCreation = ChannelsCreateRequest.builder().token(token).name(channelName).build();
ChannelsCreateResponse response = slack.methods().channelsCreate(channelCreation);
```

#### API Methods Examples

You can find more examples here: https://github.com/seratch/jslack/tree/master/src/test/java/com/github/seratch/jslack

##### Post a message to a channel

```java
String token = "api-token";
Slack slack = Slack.getInstance();

// find all channels in the team
ChannelsListResponse channelsResponse = slack.methods().channelsList(
  ChannelsListRequest.builder().token(token).build());
assertThat(channelsResponse.isOk(), is(true));
// find #general
Channel general = channelsResponse.getChannels().stream()
        .filter(c -> c.getName().equals("general")).findFirst().get();

// https://slack.com/api/chat.postMessage
ChatPostMessageResponse postResponse = slack.methods().chatPostMessage(
  ChatPostMessageRequest.builder()
    .token(token)
    .channel(general.getId())
    .text("Hello World!")
    .build());
assertThat(postResponse.isOk(), is(true));

// timestamp of the posted message
String messageTimestamp = postResponse.getMessage().getTs();

Thread.sleep(1000L);

ChatDeleteResponse deleteResponse = slack.methods().chatDelete(
  ChatDeleteRequest.builder()
    .token(token)
    .channel(general.getId())
    .ts(messageTimestamp)
    .build());
assertThat(deleteResponse.isOk(), is(true));
```

##### Open a dialog modal

```java
String token = "api-token";
    
// Required.  See https://api.slack.com/dialogs#implementation
String triggerId = "trigger-id";

Slack slack = Slack.getInstance();

DialogTextElement quanityTextElement = DialogTextElement.builder()
    .subtype(SubType.NUMBER)
    .label("Quantity")
    .name("quantity")
    .hint("The number you need")
    .maxLength(3)
    .minLength(1)
    .placeholder("Required quantity")
    .value("1")
    .build();

DialogSelectElement colourSelectElement = DialogSelectElement.builder()
    .name("colour")
    .label("Colour")
    .placeholder("Choose your preferred colour")
    .options(Arrays.asList(
        Option.builder().label("Red").value("#FF0000").build(),
        Option.builder().label("Green").value("#00FF00").build(),
        Option.builder().label("Blue").value("#0000FF").build(),
        Option.builder().label("Black").value("#000000").build(),
        Option.builder().label("White").value("#FFFFFF").build()
     ))
    .build();
    

Dialog dialog = Dialog.builder()
    .title("Request pens")
    .callbackId("pens-1122")
    .elements(Arrays.asList(quanityTextElement, colourSelectElement))
    .submitLabel("")
    .build();

DialogOpenResponse openDialogResponse = slack.methods().dialogOpen(
    DialogOpenRequest.builder()
    .token(token)
    .triggerId(triggerId)
    .dialog(dialog)
    .build());
```


#### (jSlack's Original) Shortcut APIs

```java
Slack slack = Slack.getInstance();
ApiToken token = ApiToken.of(System.getenv("SLACK_OAUTH_ACCESS_TOKEN"));

Shortcut shortcut = slack.shortcut(token);

List<Message> messages = shortcut.findRecentMessagesByName(ChannelName.of("general"));
ReactionsAddResponse addReaction = shortcut.addReaction(messages.get(0), ReactionName.of("smile"));

ChatPostMessageResponse response = shortcut.post(ChannelName.of("general"), "hello, hello!");

Attachment attachment = Attachment.builder().text("text").footer("footer").build();
List<Attachment> attachments = Arrays.asList(attachment);
ChatPostMessageResponse response = shortcut.postAsBot(ChannelName.of("general"), "hello, hello!");
```

### Preparations for running this library's unit tests.

### Creating a Slack app

https://api.slack.com/apps

### Setting up "OAuth & Permissions" for it

You need to select all permission scopes except for `identity.*`. After that, you also need to run "Reinstall App".

#### Creating at least one Slack user who has its email

Manually create a Slack user which has an email address for a unit test.


### License

(The MIT License)

Copyright (c) Kazuhiro Sera

