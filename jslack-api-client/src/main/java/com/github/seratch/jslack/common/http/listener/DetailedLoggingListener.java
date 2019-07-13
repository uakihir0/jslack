package com.github.seratch.jslack.common.http.listener;

import net.socialhub.logger.Logger;

public class DetailedLoggingListener extends HttpResponseListener {

    private static final Logger log = Logger.getLogger(DetailedLoggingListener.class);

    @Override
    public void accept(State state) {
//        if (log.getLogLevel().isLogTarget(Logger.LogLevel.DEBUG)) {
//            HttpResponse response = state.getResponse();
//            String body = state.getParsedResponseBody();
//
//            Buffer requestBody = new Buffer();
//            try {
//                response.request().body().writeTo(requestBody);
//            } catch (IOException e) {
//                log.error("Failed to read the request body because" + e.getMessage(), e);
//            }
//
//            String textRequestBody = null;
//            try {
//                textRequestBody = requestBody.buffer().readUtf8();
//            } catch (Exception e) {
//                log.debug("Failed to read request body because " + e.getMessage(), e);
//            }
//
//            Long contentLength = null;
//            try {
//                contentLength = response.request().body().contentLength();
//            } catch (IOException e) {
//                log.error("Failed to read the content length because " + e.getMessage(), e);
//            }
//
//            log.debug("\n[Request URL]\n" +
//                    response.request().method() +
//                    " " +
//                    response.request().url() +
//                    "\n" +
//                    "[Specified Request Headers]\n" +
//                    response.request().headers() +
//                    "[Request Body]\n" +
//                    textRequestBody +
//                    "\n\n" +
//                    "Content-Type: " +
//                    response.request().body().contentType() +
//                    "\n" +
//                    "Content Length: " +
//                    contentLength +
//                    "\n" +
//                    "\n" +
//                    "[Response Status]\n" +
//                    response.code() +
//                    " " +
//                    response.message() +
//                    "\n" +
//                    "[Response Headers]\n" +
//                    response.headers() +
//                    "" +
//                    "[Response Body]\n" +
//                    body +
//                    "\n");
//        }
    }
}
