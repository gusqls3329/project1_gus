package com.green.demo.movies.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import java.util.List;

@Data
public class UpDto {
    private int imedia;
    private int iuser;
    private String title;
    private String date;
    private int genrepk;
    private int isSaw;
    private String comment;
    private int star;
    List<String> pics;
}
