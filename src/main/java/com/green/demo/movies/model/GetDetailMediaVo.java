package com.green.demo.movies.model;

import lombok.Data;

import java.util.List;

@Data
public class GetDetailMediaVo {
    private int imedia;
    private String title;
    private String comment;
    private String date;
    private int isSaw;
    private List<String> pic;
    private int star;
    private int genrepk;
}
