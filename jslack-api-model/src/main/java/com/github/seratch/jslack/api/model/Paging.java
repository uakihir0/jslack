package com.github.seratch.jslack.api.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Paging {

    private String iid; // search
    private Integer count;
    private Integer total;
    private Integer page;
    private Integer pages;
    private Integer perPage;
    private Integer spill;
}
