package com.green.demo.movies.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

@Data
public class GetDayMediaVo2 {
    private int imedia;
    private String pic;
    private String title;
    private String date;
    @JsonIgnore
    private int isSaw;
}
