package com.green.demo.movies.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

@Data
public class GetDayMediaVo {
    private int imedia;
    private String pic;
    private int star;
    private String title;
    private String date;
}
