package com.github.seratch.jslack.api.methods.response.search;

import com.github.seratch.jslack.api.methods.SlackApiResponse;
import com.github.seratch.jslack.api.model.SearchResult;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class SearchAllResponse implements SlackApiResponse {

    private boolean ok;
    private String warning;
    private String error;
    private String needed;
    private String provided;

    private String query;
    private SearchResult messages;
    private SearchResult files;
    private Posts posts;

    @Getter
@Setter
    public static class Posts {
        private Integer total;
        private List<String> matches;
    }
}