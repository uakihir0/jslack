package com.github.seratch.jslack.common.http;

import com.github.seratch.jslack.api.methods.SlackApiException;
import com.github.seratch.jslack.common.json.GsonFactory;
import com.google.gson.Gson;
import net.socialhub.logger.Logger;
import okhttp3.*;
import okio.Buffer;

import java.io.IOException;

public class SlackHttpClient {

    private static final Logger log = Logger.getLogger(SlackHttpClient.class);
    private final OkHttpClient okHttpClient;

    public SlackHttpClient() {
        this.okHttpClient = new OkHttpClient.Builder().build();
    }

    public SlackHttpClient(OkHttpClient okHttpClient) {
        this.okHttpClient = okHttpClient;
    }

    public Response postMultipart(String url, String token, MultipartBody multipartBody) throws IOException {
        String bearerHeaderValue = "Bearer " + token;
        Request request = new Request.Builder().url(url).header("Authorization", bearerHeaderValue).post(multipartBody).build();
        return okHttpClient.newCall(request).execute();
    }

    public Response postForm(String url, FormBody formBody) throws IOException {
        Request request = new Request.Builder().url(url).post(formBody).build();
        return okHttpClient.newCall(request).execute();
    }

    public Response postFormWithBearerHeader(String url, String token, FormBody formBody) throws IOException {
        String bearerHeaderValue = "Bearer " + token;
        Request request = new Request.Builder().url(url).header("Authorization", bearerHeaderValue).post(formBody).build();
        return okHttpClient.newCall(request).execute();
    }

    public Response postJsonPostRequest(String url, Object obj) throws IOException {
        RequestBody body = RequestBody.create(MediaType.parse("application/json; charset=utf-8"), toJsonString(obj));
        Request request = new Request.Builder().url(url).post(body).build();
        return okHttpClient.newCall(request).execute();
    }

    public Response delete(Request.Builder requestBuilder) throws IOException {
        return okHttpClient.newCall(requestBuilder.method("DELETE", null).build()).execute();
    }

    private String toJsonString(Object obj) {
        Gson gson = GsonFactory.createSnakeCase();
        return gson.toJson(obj);
    }

    public static void debugLog(Response response, String body) throws IOException {
        Buffer requestBody = new Buffer();
        response.request().body().writeTo(requestBody);
        String textRequestBody = null;
        try {
            textRequestBody = requestBody.buffer().readUtf8();
        } catch (Exception e) {
            log.debug("Failed to read request body because " + e.getMessage() + ", error: " + e.getClass().getCanonicalName());
        }

        log.debug("\n[Request URL]\n"
                + response.request().method() + " "
                + response.request().url() + "\n" +
                "[Specified Request Headers]\n"
                + response.request().headers() +
                "[Request Body]\n" + textRequestBody + "\n" +
                "Content-Type: " + response.request().body().contentType() + "\n" +
                "Content Length: " + response.request().body().contentLength() + "\n" +
                "\n" +
                "[Response Status]\n" + response.code() + " " + response.message() + "\n" +
                "[Response Headers]\n" + response.headers() + "" +
                "[Response Body]\n" + body + "\n");

    }

    public static <T> T buildJsonResponse(Response response, Class<T> clazz) throws IOException, SlackApiException {
        if (response.code() == 200) {
            String body = response.body().string();
            debugLog(response, body);
            return GsonFactory.createSnakeCase().fromJson(body, clazz);
        } else {
            String body = response.body().string();
            throw new SlackApiException(response, body);
        }
    }
}
