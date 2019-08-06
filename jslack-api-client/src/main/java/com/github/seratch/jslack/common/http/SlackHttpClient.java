package com.github.seratch.jslack.common.http;

import com.github.seratch.jslack.SlackConfig;
import com.github.seratch.jslack.api.methods.FormBody;
import com.github.seratch.jslack.api.methods.SlackApiException;
import com.github.seratch.jslack.common.http.listener.DetailedLoggingListener;
import com.github.seratch.jslack.common.http.listener.HttpResponseListener;
import com.github.seratch.jslack.common.json.GsonFactory;
import com.google.gson.Gson;
import net.socialhub.http.HttpClientWrapper;
import net.socialhub.http.HttpException;
import net.socialhub.http.HttpResponse;
import net.socialhub.logger.Logger;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class SlackHttpClient {

    private static final Logger log = Logger.getLogger(SlackHttpClient.class);
    private final HttpClientWrapper httpClient;

    private SlackConfig config = SlackConfig.DEFAULT;

    public SlackHttpClient() {
        this.httpClient = new HttpClientWrapper();
    }

    public SlackHttpClient(HttpClientWrapper httpClient) {
        this.httpClient = httpClient;
    }

    public SlackConfig getConfig() {
        return config;
    }

    public void setConfig(SlackConfig config) {
        this.config = config;
    }

    public HttpResponse postMultipart(String url, String token, FormBody multipartBody) throws IOException {
        try {
            Map<String, String> header = new HashMap<>();
            header.put("Authorization", "Bearer " + token);
            return httpClient.post(url, multipartBody.getParams(), header);
        } catch (HttpException e) {
            throw new IOException(e);
        }
    }

    public HttpResponse postForm(String url, FormBody formBody) throws IOException {
        try {
            return httpClient.post(url, formBody.getParams());
        } catch (HttpException e) {
            throw new IOException(e);
        }
    }

    public HttpResponse postFormWithBearerHeader(String url, String token, FormBody formBody) throws IOException {
        try {
            Map<String, String> header = new HashMap<>();
            header.put("Authorization", "Bearer " + token);
            return httpClient.post(url, formBody.getParams(), header);
        } catch (HttpException e) {
            throw new IOException(e);
        }
    }

    //    public Response postFormWithBearerHeader(String url, String token, FormBody formBody) throws IOException {
    //        String bearerHeaderValue = "Bearer " + token;
    //        Request request = new Request.Builder().url(url).header("Authorization", bearerHeaderValue).post(formBody).build();
    //        return okHttpClient.newCall(request).execute();
    //    }

    //    public Response postJsonPostRequest(String url, Object obj) throws IOException {
    //        RequestBody body = RequestBody.create(MediaType.parse("application/json; charset=utf-8"), toJsonString(obj));
    //        Request request = new Request.Builder().url(url).post(body).build();
    //        return okHttpClient.newCall(request).execute();
    //    }
    //
    //    public Response delete(Request.Builder requestBuilder) throws IOException {
    //        return okHttpClient.newCall(requestBuilder.method("DELETE", null).build()).execute();
    //    }

    private String toJsonString(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        } else {
            Gson gson = GsonFactory.createSnakeCase();
            return gson.toJson(obj);
        }
    }

    public void runHttpResponseListeners(HttpResponse response, String body) {
        HttpResponseListener.State state = new HttpResponseListener.State(config, response, body);
        for (HttpResponseListener responseListener : config.getHttpClientResponseHandlers()) {
            responseListener.accept(state);
        }
    }

    public <T> T parseJsonResponse(HttpResponse response, Class<T> clazz) throws IOException, SlackApiException {
        try {
            if (response.getStatusCode() == 200) {
                String body = response.asString();
                runHttpResponseListeners(response, body);
                return GsonFactory.createSnakeCase(config).fromJson(body, clazz);
            } else {
                String body = response.asString();
                throw new SlackApiException(response, body);
            }
        } catch (HttpException e) {
            throw new IOException(e);
        }
    }

    private static final DetailedLoggingListener DETAILED_LOGGER = new DetailedLoggingListener();

    // use parseJsonResponse instead
    @Deprecated
    public static <T> T buildJsonResponse(HttpResponse response, Class<T> clazz) throws IOException, SlackApiException {
        try {
            if (response.getStatusCode() == 200) {
                String body = response.asString();
                DETAILED_LOGGER.accept(new HttpResponseListener.State(SlackConfig.DEFAULT, response, body));
                return GsonFactory.createSnakeCase().fromJson(body, clazz);
            } else {
                String body = response.asString();
                throw new SlackApiException(response, body);
            }
        } catch (HttpException e) {
            throw new IOException(e);
        }
    }
}
