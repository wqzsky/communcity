package com.muo.commuciate.comm.model;

import lombok.Data;

@Data
public class Question {
    private Integer id;
    private String title;
    private String description;
    private String tag;
    private Long gmtCreate;
    private Long gmtModified;
    private Integer creator;
    private String viewCount;
    private String commentCount;
    private String likeCount;
}
