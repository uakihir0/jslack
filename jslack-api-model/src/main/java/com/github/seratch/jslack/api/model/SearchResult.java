package com.github.seratch.jslack.api.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class SearchResult {
    private Integer total;
    private Pagination pagination;
    private Paging paging;
    private List<MatchedItem> matches;
    private List<String> refinements; // not sure the type yet

    @Getter
@Setter
    public static class Pagination {
        private Integer totalCount;
        private Integer page;
        private Integer perPage;
        private Integer pageCount;
        private Integer first;
        private Integer last;
    }
}
