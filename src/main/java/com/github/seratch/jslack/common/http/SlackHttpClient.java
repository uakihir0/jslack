package com.github.seratch.jslack.common.http;

import com.github.seratch.jslack.api.methods.SlackApiException;
import com.github.seratch.jslack.common.json.GsonFactory;
import com.google.gson.Gson;
import net.socialhub.http.HttpClientWrapper;
import net.socialhub.http.HttpException;
import net.socialhub.http.HttpResponse;
import net.socialhub.logger.Logger;

import java.io.IOException;

public class SlackHttpClient {

    private static final Logger log = Logger.getLogger(SlackHttpClient.class);
    private final HttpClientWrapper httpClient;

    public SlackHttpClient() {
        this.httpClient = new HttpClientWrapper();
    }


//    public Response postMultipart(String url, MultipartBody multipartBody) throws IOException {
//        Request request = new Request.Builder().url(url).post(multipartBody).build();
//        return okHttpClient.newCall(request).execute();
//    }

    public HttpResponse postForm(String url, FormBody formBody) throws IOException {
        try {
            return httpClient.post(url, formBody.getParams());
        } catch (HttpException e) {
            throw new IOException(e);
        }
    }

//    public HttpResponse postJsonPostRequest(String url, Object obj) throws IOException {
//        RequestBody body = RequestBody.create(MediaType.parse("application/json; charset=utf-8"), toJsonString(obj));
//        Request request = new Request.Builder().url(url).post(body).build();
//        return okHttpClient.newCall(request).execute();
//    }

//    public Response delete(Request.Builder requestBuilder) throws IOException {
//        return okHttpClient.newCall(requestBuilder.method("DELETE", null).build()).execute();
//    }

    private String toJsonString(Object obj) {
        Gson gson = GsonFactory.createSnakeCase();
        return gson.toJson(obj);
    }

//    public static void debugLog(HttpResponse response, String body) throws IOException {
//        Buffer requestBody = new Buffer();
//        response.request().body().writeTo(requestBody);
//        String textRequestBody = null;
//        try {
//            textRequestBody = requestBody.buffer().readUtf8();
//        } catch (Exception e) {
//            log.debug("Failed to read request body because " + e.getMessage() + ", error: " + e.getClass().getCanonicalName());
//        }
//
//        log.debug("\n[Request URL]\n"
//                + response.request().method() + " "
//                + response.request().url() + "\n" +
//                "[Specified Request Headers]\n"
//                + response.request().headers() +
//                "[Request Body]\n" + textRequestBody + "\n" +
//                "Content-Type: " + response.request().body().contentType() + "\n" +
//                "Content Length: " + response.request().body().contentLength() + "\n" +
//                "\n" +
//                "[Response Status]\n" + response.code() + " " + response.message() + "\n" +
//                "[Response Headers]\n" + response.headers() + "" +
//                "[Response Body]\n" + body + "\n");
//    }

    public static <T> T buildJsonResponse(HttpResponse response, Class<T> clazz) throws IOException, SlackApiException {
        try {
            if (response.getStatusCode() == 200) {
                String body = response.asString();
                return GsonFactory.createSnakeCase().fromJson(body, clazz);
            } else {
                String body = response.asString();
                throw new SlackApiException(body);
            }
        } catch (HttpException e) {
            throw new IOException(e);
        }
    }
}
